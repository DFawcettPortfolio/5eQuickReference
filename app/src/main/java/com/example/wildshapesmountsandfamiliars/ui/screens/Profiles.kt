package com.example.wildshapesmountsandfamiliars

import android.content.Context
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.example.wildshapesmountsandfamiliars.ui.screens.Note
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.text.SimpleDateFormat
import java.util.Date


data class Profile(
    val id: Int,
    val name: String,
    val createdAt: Long = System.currentTimeMillis()
)
data class Item(
    val id: Int,
    val name: String,
    val quantity: Int = 1
)



// ProfileManager.kt - Central profile management
class ProfileManager(private val context: Context) {
    private val sharedPrefs = context.getSharedPreferences("profiles", Context.MODE_PRIVATE)
    private val gson = Gson()

    // Current active profile
    var activeProfileId: Int?
        get() = if (sharedPrefs.contains("active_profile")) {
            sharedPrefs.getInt("active_profile", -1).takeIf { it != -1 }
        } else null
        set(value) {
            sharedPrefs.edit().putInt("active_profile", value ?: -1).apply()
        }

    // Profile CRUD operations
    fun getProfiles(): List<Profile> {
        return sharedPrefs.getStringSet("profile_list", emptySet())?.mapNotNull {
            gson.fromJson(it, Profile::class.java)
        } ?: emptyList()
    }

    fun saveProfile(profile: Profile) {
        val profiles = getProfiles().toMutableList()
        profiles.removeAll { it.id == profile.id }
        profiles.add(profile)

        sharedPrefs.edit().putStringSet("profile_list",
            profiles.map { gson.toJson(it) }.toSet()
        ).apply()
    }

    fun deleteProfile(profileId: Int) {
        val profiles = getProfiles().filter { it.id != profileId }
        sharedPrefs.edit().putStringSet("profile_list",
            profiles.map { gson.toJson(it) }.toSet()
        ).apply()

        // Clean up profile-specific files
        if (activeProfileId == profileId) {
            activeProfileId = profiles.firstOrNull()?.id
        }
        deleteProfileData(profileId)
    }

    private fun deleteProfileData(profileId: Int) {
        listOf("notes", "menagerie", "favorites", "custom", "inventory").forEach { type ->
            context.deleteFile("${profileId}_$type.json")
        }
    }
}

// Enhanced ProfileViewModel.kt
class ProfileViewModel(private val context: Context) : ViewModel() {
    private val profileManager = ProfileManager(context)

    private val _profiles = MutableStateFlow<List<Profile>>(emptyList())
    val profiles = _profiles.asStateFlow()

    private val _activeProfile = MutableStateFlow<Profile?>(null)
    val activeProfile = _activeProfile.asStateFlow()

    // Profile data flows
    private val _menagerie = MutableStateFlow<List<StatBlock>>(emptyList())
    private val _favorites = MutableStateFlow<List<StatBlock>>(emptyList())
    private val _customBlocks = MutableStateFlow<List<StatBlock>>(emptyList())
    private val _inventory = MutableStateFlow<List<Item>>(emptyList())
    private val _notes = MutableStateFlow<List<Note>>(emptyList())

    inline fun <reified T> loadJsonList(context: Context, filename: String): List<T> {
        return context.openFileInput(filename).bufferedReader().use {
            val text = it.readText()
            Gson().fromJson(text, object : TypeToken<List<T>>() {}.type)
        }
    }

    inline fun <reified T> saveJsonList(context: Context, filename: String, list: List<T>) {
        context.openFileOutput(filename, Context.MODE_PRIVATE).use {
            it.write(Gson().toJson(list).toByteArray())
        }
    }
    private fun getMenagerieForProfile(context: Context, profileId: Int): List<StatBlock> =
        loadJsonList(context, "${profileId}_menagerie.json")


    init {
        loadProfiles()
        profileManager.activeProfileId?.let { loadProfile(it) }
    }

    private fun loadProfiles() {
        _profiles.value = profileManager.getProfiles()
    }

    fun loadProfile(profileId: Int) {
        val profile = _profiles.value.find { it.id == profileId } ?: return
        _activeProfile.value = profile
        profileManager.activeProfileId = profileId

        // Load all profile data
        _menagerie.value = getMenagerieForProfile(context, profileId)
//        _favorites.value = getFavoritesForProfile(context, profileId)
//        _customBlocks.value = getCustomBlocksForProfile(context, profileId)
//        _inventory.value = getInventoryForProfile(context, profileId)
//        _notes.value = getNotesForProfile(context, profileId)
    }

    fun createProfile(name: String): Profile {
        val newId = (_profiles.value.maxOfOrNull { it.id } ?: 0) + 1
        val profile = Profile(newId, name)
        profileManager.saveProfile(profile)
        loadProfiles()
        return profile
    }

    fun deleteProfile(profileId: Int) {
        profileManager.deleteProfile(profileId)
        loadProfiles()
        if (_activeProfile.value?.id == profileId) {
            _activeProfile.value = _profiles.value.firstOrNull()
        }
    }

    // Data update functions remain similar but with improved error handling
//    fun updateMenagerie(blocks: List<StatBlock>) {
//        _activeProfile.value?.id?.let { profileId ->
//            _menagerie.value = blocks
//            saveMenagerieForProfile(context, profileId, blocks)
//        }
//    }

    // ... other update functions
}

// Enhanced UI with more features
@Composable
fun ProfileScreen(
    viewModel: ProfileViewModel,
    modifier: Modifier = Modifier
) {
    val profiles by viewModel.profiles.collectAsState()
    val activeProfile by viewModel.activeProfile.collectAsState()

    var showCreateDialog by remember { mutableStateOf(false) }
    var newProfileName by remember { mutableStateOf("") }

    Column(modifier.padding(16.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                "Profiles",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.weight(1f)
            )

            Button(onClick = { showCreateDialog = true }) {
                Text("New Profile")
            }
        }

        LazyColumn(modifier = Modifier.padding(vertical = 8.dp)) {
            items(items = profiles, key = { it.id }) { profile: Profile ->
                ProfileItem(
                    profile = profile,
                    isActive = activeProfile?.id == profile.id,
                    onSelect = { viewModel.loadProfile(profile.id) },
                    onDelete = { viewModel.deleteProfile(profile.id) }
                )
            }
        }
    }

    AlertDialog(
        onDismissRequest = { showCreateDialog = false },
        title = { Text("Create New Profile") },
        text = {  // <-- must be a composable lambda
            Column {
                OutlinedTextField(
                    value = newProfileName,
                    onValueChange = { newProfileName = it },
                    label = { Text("Profile Name") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        },
        confirmButton = {
            Button(
                onClick = {
                    viewModel.createProfile(newProfileName)
                    newProfileName = ""
                    showCreateDialog = false
                },
                enabled = newProfileName.isNotBlank()
            ) {
                Text("Create")
            }
        },
        dismissButton = {
            TextButton(onClick = { showCreateDialog = false }) {
                Text("Cancel")
            }
        }
    )

}

@Composable
private fun ProfileItem(
    profile: Profile,
    isActive: Boolean,
    onSelect: () -> Unit,
    onDelete: () -> Unit
) {
    var showDeleteConfirm by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .clickable(onClick = onSelect)
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    profile.name,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    "Created ${SimpleDateFormat("MMM dd, yyyy").format(Date(profile.createdAt))}",
                    style = MaterialTheme.typography.bodySmall
                )
            }

            if (isActive) {
                Icon(
                    Icons.Default.CheckCircle,
                    contentDescription = "Active",
                    tint = MaterialTheme.colorScheme.primary
                )
            }

            IconButton(onClick = { showDeleteConfirm = true }) {
                Icon(Icons.Default.Delete, contentDescription = "Delete")
            }
        }
    }

    if (showDeleteConfirm) {
        AlertDialog(
            onDismissRequest = { showDeleteConfirm = false },
            title = { Text("Delete Profile?") },
            text = { Text("All data for ${profile.name} will be permanently deleted.") },
            confirmButton = {
                TextButton(
                    onClick = {
                        onDelete()
                        showDeleteConfirm = false
                    }
                ) {
                    Text("Delete", color = MaterialTheme.colorScheme.error)
                }
            },
            dismissButton = {
                TextButton(onClick = { showDeleteConfirm = false }) {
                    Text("Cancel")
                }
            }
        )
    }
}