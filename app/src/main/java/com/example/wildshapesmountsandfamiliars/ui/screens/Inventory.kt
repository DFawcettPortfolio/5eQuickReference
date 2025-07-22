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
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import com.example.wildshapesmountsandfamiliars.R
import kotlinx.coroutines.flow.first
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
data class InventoryItemPersist(val name: String, val quantity: Int)

@Composable
fun Inventory(
    onNavigateHome: () -> Unit, onNavigateToFavorites: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val inventoryItems = remember { mutableStateListOf<InventoryItem>() }

    var showAddDialog by remember { mutableStateOf(false) }
    var newItemName by remember { mutableStateOf("") }

    var showEditQuantityDialog by remember { mutableStateOf(false) }
    var editingIndex by remember { mutableStateOf(-1) }
    var editQuantityInput by remember { mutableStateOf("") }
    var showDuplicateDialog by remember { mutableStateOf(false) }
    var pendingEditIndex by remember { mutableStateOf(-1) }


    LaunchedEffect(Unit) {
        val saved = loadInventory(context)
        inventoryItems.clear()
        inventoryItems.addAll(saved.map { InventoryItem(it.name, mutableStateOf(it.quantity)) })
    }

    LaunchedEffect(inventoryItems.map { it.name to it.quantity.value }) {
        saveInventory(context, inventoryItems)
    }

    Column(modifier = Modifier.padding(16.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly // evenly space the buttons
        ) {
            Icon(
                painter = painterResource(id = R.drawable.arrow_back_icon_menu),
                contentDescription = "Back One Step",
                modifier = Modifier
                    .size(32.dp)
                    .clickable {onNavigateHome()},
                tint = Color.White
            )
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

        }
        Spacer(Modifier.height(16.dp))
        Text("Inventory", style = MaterialTheme.typography.headlineSmall)

        Spacer(modifier = Modifier.size(16.dp))

        Button(onClick = {
            newItemName = ""
            showAddDialog = true
        }, modifier = Modifier.fillMaxWidth()) {
            Text("Add Item")
        }

        Spacer(modifier = Modifier.size(12.dp))

        LazyColumn {
            itemsIndexed(inventoryItems) { index, item ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Text("${item.name} (x${item.quantity.value})", modifier = Modifier.weight(1f))

                    Button(onClick = {
                        editingIndex = index
                        editQuantityInput = item.quantity.value.toString()
                        showEditQuantityDialog = true
                    }) {
                        Text("Edit Quantity")
                    }

                    IconButton(onClick = {inventoryItems.removeAt(index) }) {
                        Icon(
                            imageVector = Icons.Filled.Delete,
                            contentDescription = "Delete",
                            tint = Color.White
                        )
                    }

                }
            }
        }
    }

    if (showAddDialog) {
        AlertDialog(
            onDismissRequest = { showAddDialog = false },
            title = { Text("Add Item") },
            text = {
                OutlinedTextField(
                    value = newItemName,
                    onValueChange = { newItemName = it },
                    label = { Text("Item Name") },
                    singleLine = true
                )
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        val trimmed = newItemName.trim()
                        val existingIndex = inventoryItems.indexOfFirst { it.name.equals(trimmed, ignoreCase = true) }

                        if (existingIndex != -1) {
                            pendingEditIndex = existingIndex
                            showDuplicateDialog = true
                        } else if (trimmed.isNotEmpty()) {
                            inventoryItems.add(InventoryItem(trimmed))
                        }

                        showAddDialog = false
                    }
                ) {
                    Text("Add")
                }
            },
            dismissButton = {
                TextButton(onClick = { showAddDialog = false }) {
                    Text("Cancel")
                }
            }
        )
    }

    if (showDuplicateDialog) {
        AlertDialog(
            onDismissRequest = { showDuplicateDialog = false },
            title = { Text("Duplicate Item") },
            text = { Text("You already have this item. Please edit its quantity instead.") },
            confirmButton = {
                TextButton(onClick = {
                    editingIndex = pendingEditIndex
                    editQuantityInput = inventoryItems[pendingEditIndex].quantity.value.toString()
                    showEditQuantityDialog = true
                    showDuplicateDialog = false
                    pendingEditIndex = -1
                }) {
                    Text("OK")
                }
            }
        )
    }


    if (showEditQuantityDialog && editingIndex in inventoryItems.indices) {
        AlertDialog(
            onDismissRequest = { showEditQuantityDialog = false },
            title = { Text("Edit Quantity: ${inventoryItems[editingIndex].name}") },
            text = {
                OutlinedTextField(
                    value = editQuantityInput,
                    onValueChange = { if (it.all(Char::isDigit)) editQuantityInput = it },
                    label = { Text("Quantity") },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
            },
            confirmButton = {
                TextButton(onClick = {
                    val newQty = editQuantityInput.toIntOrNull() ?: 1
                    if (newQty > 0) {
                        inventoryItems[editingIndex].quantity.value = newQty
                    }
                    showEditQuantityDialog = false
                }) {
                    Text("Save")
                }
            },
            dismissButton = {
                TextButton(onClick = { showEditQuantityDialog = false }) {
                    Text("Cancel")
                }
            }
        )
    }
}

data class InventoryItem(
    val name: String,
    val quantity: MutableState<Int> = mutableStateOf(1)
)

private val INVENTORY_KEY = stringPreferencesKey("inventory_items")
private val json = Json { encodeDefaults = true; ignoreUnknownKeys = true }

private suspend fun saveInventory(context: Context, items: List<InventoryItem>) {
    val persistList = items.map { InventoryItemPersist(it.name, it.quantity.value) }
    val jsonString = json.encodeToString(persistList)
    context.dataStore.edit { it[INVENTORY_KEY] = jsonString }
}

private suspend fun loadInventory(context: Context): List<InventoryItemPersist> {
    val prefs = context.dataStore.data.first()
    val jsonString = prefs[INVENTORY_KEY]
    return if (jsonString.isNullOrBlank()) emptyList()
    else try {
        json.decodeFromString(jsonString)
    } catch (_: Exception) {
        emptyList()
    }
}
