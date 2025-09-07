package com.example.wildshapesmountsandfamiliars.ui.screens

import android.content.Context
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.wildshapesmountsandfamiliars.R
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.File

data class Note(
    val id: Int,
    val title: String,
    val content: String
)

fun loadNotes(context: Context): List<Note> {
    val file = File(context.filesDir, "notes.json")
    if (!file.exists()) return emptyList()
    val json = file.readText()
    val type = object : TypeToken<List<Note>>() {}.type
    return Gson().fromJson(json, type)
}

fun saveNotes(context: Context, notes: List<Note>) {
    val file = File(context.filesDir, "notes.json")
    file.writeText(Gson().toJson(notes))
}

@Composable
fun Notekeeping(
    onNavigateHome: () -> Unit,
    onNavigateToConditions: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToFavorites: () -> Unit,
    onNavigateToSearchResults: () -> Unit,
) {
    val context = LocalContext.current
    var notes by remember { mutableStateOf(loadNotes(context)) }
    var showDialog by remember { mutableStateOf(false) }
    var editNote: Note? by remember { mutableStateOf(null) }
    var searchQuery by remember { mutableStateOf("") }
    val focusManager = LocalFocusManager.current

    // Filter notes by query
    val filteredNotes = notes.filter {
        it.title.contains(searchQuery, ignoreCase = true) ||
                it.content.contains(searchQuery, ignoreCase = true)
    }

    Column(
        Modifier.padding(16.dp),
        horizontalAlignment = Alignment.Start,
    ) {
        // --- Top Bar ---
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
//            Icon(
//                painter = painterResource(id = R.drawable.arrow_back_icon_menu),
//                contentDescription = "Back One Step",
//                modifier = Modifier
//                    .size(32.dp)
//                    .clickable { onNavigateHome() },
//                tint = Color.White
//            )
            Icon(
                painter = painterResource(id = R.drawable.home_icon_menu),
                contentDescription = "Home",
                modifier = Modifier
                    .size(32.dp)
                    .clickable { onNavigateHome() },
                tint = Color.White
            )
            Icon(
                painter = painterResource(id = R.drawable.rules_icon_menu),
                contentDescription = "Rules",
                modifier = Modifier
                    .size(32.dp)
                    .clickable { onNavigateToRulesQuickGuide() },
                tint = Color.White
            )
            Icon(
                painter = painterResource(id = R.drawable.search_icon),
                contentDescription = "Search",
                modifier = Modifier
                    .size(32.dp)
                    .clickable { onNavigateToSearchResults() },
                tint = Color.White
            )
            Icon(
                painter = painterResource(id = R.drawable.favorites_icon_menu),
                contentDescription = "Favorites",
                modifier = Modifier
                    .size(32.dp)
                    .clickable { onNavigateToFavorites() },
                tint = Color.White
            )
            Icon(
                painter = painterResource(id = R.drawable.menagerie_icon_menu),
                contentDescription = "Menagerie",
                modifier = Modifier
                    .size(32.dp)
                    .clickable { onNavigateToMenagerie() },
                tint = Color.White
            )
            Icon(
                painter = painterResource(id = R.drawable.inventory_icon_menu),
                contentDescription = "Inventory",
                modifier = Modifier
                    .size(32.dp)
                    .clickable { onNavigateToInventory() },
                tint = Color.White
            )
        }

        Spacer(Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Your Notes",
                style = MaterialTheme.typography.headlineSmall
            )
            Spacer(modifier = Modifier.weight(1f))
//            Spacer(Modifier.width(6.dp))
            Icon(
                painter = painterResource(id = R.drawable.add_note),
                contentDescription = "Add Note",
                modifier = Modifier
                    .size(32.dp)
                    .clickable { showDialog = true },
                tint = Color.White
            )
        }

        Spacer(Modifier.height(16.dp))

        // --- Search Notes (with Clear X) ---
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            label = { Text("Search Notes") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            trailingIcon = {
                if (searchQuery.isNotBlank()) {
                    IconButton(
                        onClick = {
                            searchQuery = ""
                            focusManager.clearFocus() // hide keyboard
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Clear search",
                            tint = Color.Gray
                        )
                    }
                }
            }
        )

        Spacer(Modifier.height(16.dp))

        // --- Notes List ---
        LazyColumn {
            items(filteredNotes) { note ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                        .clickable {
                            editNote = note
                            showDialog = true
                        },
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(note.title, style = MaterialTheme.typography.titleMedium)
                        Spacer(Modifier.height(4.dp))
                        Text(note.content, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        }
    }

    // --- Dialog for Add/Edit ---
    if (showDialog) {
        NoteDialog(
            initialNote = editNote,
            onDismiss = { showDialog = false; editNote = null },
            onSave = { note ->
                notes = if (editNote != null) {
                    notes.map { if (it.id == editNote!!.id) note else it }
                } else {
                    notes + note.copy(id = (notes.maxOfOrNull { it.id } ?: 0) + 1)
                }
                saveNotes(context, notes)
                showDialog = false
                editNote = null
            },
            onDelete = { noteToDelete ->
                notes = notes.filter { it.id != noteToDelete.id }
                saveNotes(context, notes)
            }
        )
    }
}


@Composable
fun NoteDialog(
    initialNote: Note?,
    onDismiss: () -> Unit,
    onSave: (Note) -> Unit,
    onDelete: ((Note) -> Unit)? = null
) {
    var title by remember { mutableStateOf(initialNote?.title ?: "") }
    var content by remember { mutableStateOf(initialNote?.content ?: "") }
    var showConfirmDialog by remember { mutableStateOf(false) }

    if (showConfirmDialog && initialNote != null) {
        AlertDialog(
            onDismissRequest = { showConfirmDialog = false },
            title = { Text("Delete Note?") },
            text = { Text("Are you sure you want to delete this note?") },
            confirmButton = {
                Button(onClick = {
                    onDelete?.invoke(initialNote)
                    showConfirmDialog = false
                    onDismiss()
                }) {
                    OutlinedText(
                        text = "Delete",
                        color = Color.White,
                        outlineColor = Color.Black,
                        outlineWidth = 0.8.dp,
                        style = MaterialTheme.typography.labelLarge
                    )
                }
            },
            dismissButton = {
                Button(onClick = { showConfirmDialog = false }) {
                    OutlinedText(
                        text = "Cancel",
                        color = Color.White,
                        outlineColor = Color.Black,
                        outlineWidth = 0.8.dp,
                        style = MaterialTheme.typography.labelLarge
                    )
                }
            }
        )
    }

    AlertDialog(
        onDismissRequest = onDismiss,
        confirmButton = {
            Button(onClick = { onSave(Note(initialNote?.id ?: 0, title, content)) }) {
                OutlinedText(
                    text = "Save",
                    color = Color.White,
                    outlineColor = Color.Black,
                    outlineWidth = 0.8.dp,
                    style = MaterialTheme.typography.labelLarge
                )
            }
        },
        dismissButton = {
            Button(onClick = onDismiss) {
                OutlinedText(
                    text = "Cancel",
                    color = Color.White,
                    outlineColor = Color.Black,
                    outlineWidth = 0.8.dp,
                    style = MaterialTheme.typography.labelLarge
                )
            }
        },
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(if (initialNote == null) "Add Note" else "Edit Note")

                if (initialNote != null && onDelete != null) {
                    Icon(
                        painter = painterResource(id = R.drawable.remove_note),
                        contentDescription = "Delete Note",
                        tint = Color.Red,
                        modifier = Modifier
                            .size(38.dp)
                            .clickable { showConfirmDialog = true }
                    )
                }
            }
        },
        text = {
            Column {
                OutlinedTextField(
                    value = title,
                    onValueChange = { title = it },
                    label = { Text("Title") }
                )
                Spacer(Modifier.height(8.dp))
                OutlinedTextField(
                    value = content,
                    onValueChange = { content = it },
                    label = { Text("Content") },
                    singleLine = false,
                    modifier = Modifier.height(150.dp)
                )
            }
        }
    )
}


