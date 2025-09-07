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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.platform.LocalFocusManager
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

@Serializable
data class CurrencyPersist(
    val platinum: Int = 0,
    val gold: Int = 0,
    val silver: Int = 0,
    val copper: Int = 0
)

@Composable
fun Inventory(
    onNavigateHome: () -> Unit,
    onNavigateToFavorites: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit,
    onNavigateToSearchResults: () -> Unit,
    onNavigateToNotekeeping: () -> Unit,
) {
    val context = LocalContext.current
    val focusManager = LocalFocusManager.current
    val scope = rememberCoroutineScope()
    val inventoryItems = remember { mutableStateListOf<InventoryItem>() }

    var platinum by remember { mutableStateOf("") }
    var gold by remember { mutableStateOf("") }
    var silver by remember { mutableStateOf("") }
    var copper by remember { mutableStateOf("") }

    var showAddDialog by remember { mutableStateOf(false) }
    var newItemName by remember { mutableStateOf("") }
    var showEditQuantityDialog by remember { mutableStateOf(false) }
    var editingIndex by remember { mutableStateOf(-1) }
    var editQuantityInput by remember { mutableStateOf("") }
    var showDuplicateDialog by remember { mutableStateOf(false) }
    var pendingEditIndex by remember { mutableStateOf(-1) }
    var editNameInput by remember { mutableStateOf("") }


    // 🔍 Permanent search state
    var searchQuery by remember { mutableStateOf("") }

    // Load inventory and currency on start
    LaunchedEffect(Unit) {
        val savedInventory = loadInventory(context)
        inventoryItems.clear()
        inventoryItems.addAll(savedInventory.map { InventoryItem(it.name, mutableStateOf(it.quantity)) })

        val savedCurrency = loadCurrency(context)
        platinum = savedCurrency.platinum.toString()
        gold = savedCurrency.gold.toString()
        silver = savedCurrency.silver.toString()
        copper = savedCurrency.copper.toString()
    }

    // Save inventory when changed
    LaunchedEffect(inventoryItems.map { it.name to it.quantity.value }) {
        saveInventory(context, inventoryItems)
    }

    // Save currency whenever values change
    LaunchedEffect(platinum, gold, silver, copper) {
        val currencyPersist = CurrencyPersist(
            platinum = platinum.toIntOrNull() ?: 0,
            gold = gold.toIntOrNull() ?: 0,
            silver = silver.toIntOrNull() ?: 0,
            copper = copper.toIntOrNull() ?: 0
        )
        saveCurrency(context, currencyPersist)
    }

    Column(modifier = Modifier.padding(16.dp)) {
        // Top menu row
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
                contentDescription = "Search Inventory Icon",
                modifier = Modifier.size(32.dp),
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
                painter = painterResource(id = R.drawable.notes_icon_menu),
                contentDescription = "Notes",
                modifier = Modifier
                    .size(32.dp)
                    .clickable {
                        onNavigateToNotekeeping()
                    },
                tint = Color.White
            )
        }

        Spacer(Modifier.height(16.dp))
        Text("Your Inventory", style = MaterialTheme.typography.headlineSmall)

        // 🔍 Permanent search bar right under title
        Spacer(Modifier.height(8.dp))
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Search Inventory") },
            singleLine = true,
            trailingIcon = {
                if (searchQuery.isNotBlank()) {
                    IconButton(
                        onClick = {
                            searchQuery = ""
                            focusManager.clearFocus() // hide keyboard
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Close, // X icon
                            contentDescription = "Clear search",
                            tint = Color.Gray
                        )
                    }
                }
            }
        )

        Spacer(Modifier.height(16.dp))

        // Currency row
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            @Composable
            fun CurrencyInput(label: String, amount: String, onAmountChange: (String) -> Unit) {
                val displayAmount = if (amount.length > 1 && amount.startsWith("0")) {
                    amount.trimStart('0').ifEmpty { "0" }
                } else amount

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(label, style = MaterialTheme.typography.bodyMedium)
                    Spacer(Modifier.height(4.dp))
                    OutlinedTextField(
                        value = displayAmount,
                        onValueChange = { input ->
                            if (input.all { it.isDigit() }) {
                                val sanitized = input.trimStart('0').ifEmpty { "0" }
                                onAmountChange(sanitized)
                            }
                        },
                        singleLine = true,
                        modifier = Modifier.width(70.dp),
                        placeholder = { Text("0") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )
                }
            }

            CurrencyInput("Platinum", platinum) { platinum = it }
            CurrencyInput("Gold", gold) { gold = it }
            CurrencyInput("Silver", silver) { silver = it }
            CurrencyInput("Copper", copper) { copper = it }
        }

        Spacer(Modifier.height(24.dp))

        Button(
            onClick = {
                newItemName = ""
                showAddDialog = true
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f))
        ) {
            OutlinedText(
                text = "Add Item",
                color = Color.White,
                outlineColor = Color.Black,
                outlineWidth = 0.8.dp,
                style = MaterialTheme.typography.labelLarge
            )
        }

        Spacer(Modifier.size(12.dp))

        // Filtered list based on search
        val filteredItems = if (searchQuery.isBlank()) {
            inventoryItems
        } else {
            inventoryItems.filter { it.name.contains(searchQuery, ignoreCase = true) }
        }

        LazyColumn {
            itemsIndexed(filteredItems) { index, item ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Left section: name/quantity + edit button
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.weight(1f) // this pushes delete to the far right
                    ) {
                        Text("${item.name} (x${item.quantity.value})")

                        IconButton(
                            onClick = {
                                val realIndex = inventoryItems.indexOfFirst { it.name == item.name }
                                if (realIndex != -1) {
                                    editingIndex = realIndex
                                    editQuantityInput = inventoryItems[realIndex].quantity.value.toString()
                                    editNameInput = inventoryItems[realIndex].name
                                    showEditQuantityDialog = true
                                }
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Edit,
                                contentDescription = "Edit",
                                tint = Color.White
                            )
                        }
                    }

                    // Right-aligned delete button
                    IconButton(
                        onClick = {
                            val realIndex = inventoryItems.indexOfFirst { it.name == item.name }
                            if (realIndex != -1) inventoryItems.removeAt(realIndex)
                        }
                    ) {
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

    // Add Item Dialog
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
                TextButton(onClick = {
                    val trimmed = newItemName.trim()
                    val existingIndex = inventoryItems.indexOfFirst { it.name.equals(trimmed, ignoreCase = true) }

                    if (existingIndex != -1) {
                        pendingEditIndex = existingIndex
                        showDuplicateDialog = true
                    } else if (trimmed.isNotEmpty()) {
                        inventoryItems.add(InventoryItem(trimmed))
                    }

                    showAddDialog = false
                }) {
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

    // Duplicate Dialog
    if (showDuplicateDialog) {
        AlertDialog(
            onDismissRequest = { showDuplicateDialog = false },
            title = { Text("Duplicate Item") },
            text = { Text("You already have this item. Edit its quantity instead.") },
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

    // Edit Quantity Dialog
    // Edit Item Dialog (name + quantity)
    if (showEditQuantityDialog && editingIndex in inventoryItems.indices) {
        AlertDialog(
            onDismissRequest = { showEditQuantityDialog = false },
            title = { Text("Edit Item") },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    OutlinedTextField(
                        value = editNameInput,
                        onValueChange = { editNameInput = it },
                        label = { Text("Item Name") },
                        singleLine = true
                    )
                    OutlinedTextField(
                        value = editQuantityInput,
                        onValueChange = { if (it.all(Char::isDigit)) editQuantityInput = it },
                        label = { Text("Quantity") },
                        singleLine = true,
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )
                }
            },
            confirmButton = {
                TextButton(onClick = {
                    val newQty = editQuantityInput.toIntOrNull() ?: 1
                    val newName = editNameInput.trim()

                    if (newQty > 0 && newName.isNotEmpty()) {
                        inventoryItems[editingIndex] = InventoryItem(
                            name = newName,
                            quantity = mutableStateOf(newQty)
                        )
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
private val CURRENCY_KEY = stringPreferencesKey("currency_data")
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

private suspend fun saveCurrency(context: Context, currency: CurrencyPersist) {
    val jsonString = json.encodeToString(currency)
    context.dataStore.edit { it[CURRENCY_KEY] = jsonString }
}

private suspend fun loadCurrency(context: Context): CurrencyPersist {
    val prefs = context.dataStore.data.first()
    val jsonString = prefs[CURRENCY_KEY]
    return if (jsonString.isNullOrBlank()) CurrencyPersist()
    else try {
        json.decodeFromString(jsonString)
    } catch (_: Exception) {
        CurrencyPersist()
    }
}
