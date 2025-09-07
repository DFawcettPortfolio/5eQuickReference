package com.example.wildshapesmountsandfamiliars.ui.screens

import android.annotation.SuppressLint
import android.content.Context
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.datastore.preferences.core.edit
import com.example.wildshapesmountsandfamiliars.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

object FavoritesTabState {
    var showCreatures: Boolean = true
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Favorites(
    onNavigateHome: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit,
    onNavigateToSpellMenu: (Spell) -> Unit,
    onNavigateToSearchResults: () -> Unit,
    onNavigateToNotekeeping: () -> Unit,
) {
    val context = LocalContext.current
    val snackbarHostState = remember { SnackbarHostState() }
    val coroutineScope = rememberCoroutineScope()
    var showConnectedBlocks by remember { mutableStateOf(false) }
    var selectedStatBlock by remember { mutableStateOf<StatBlock?>(null) }
    var selectedSpell by remember { mutableStateOf<Spell?>(null) }
    var showCreatures by rememberSaveable { mutableStateOf(FavoritesTabState.showCreatures) } // Toggle between creatures and spells

    var allCreatures by remember { mutableStateOf<List<StatBlock>>(emptyList()) }
    val creatureTypes: Map<String, List<StatBlock>> = remember(allCreatures) {
        mapOf(
            "aberrations" to allCreatures.filter {
                it.sortingTag?.contains(
                    "aberration",
                    true
                ) == true
            },
            "beasts" to allCreatures.filter { it.sortingTag?.contains("beast", true) == true },
            "celestials" to allCreatures.filter {
                it.sortingTag?.contains(
                    "celestial",
                    true
                ) == true
            },
            "constructs" to allCreatures.filter {
                it.sortingTag?.contains(
                    "construct",
                    true
                ) == true
            },
            "dragons" to allCreatures.filter { it.sortingTag?.contains("dragon", true) == true },
            "elementals" to allCreatures.filter {
                it.sortingTag?.contains(
                    "elemental",
                    true
                ) == true
            },
            "fey" to allCreatures.filter { it.sortingTag?.contains("fey", true) == true },
            "fiends" to allCreatures.filter { it.sortingTag?.contains("fiend", true) == true },
            "giants" to allCreatures.filter { it.sortingTag?.contains("giant", true) == true },
            "humanoids" to allCreatures.filter {
                it.sortingTag?.contains(
                    "humanoid",
                    true
                ) == true
            },
            "monstrosities" to allCreatures.filter {
                it.sortingTag?.contains(
                    "monstrosity",
                    true
                ) == true
            },
            "oozes" to allCreatures.filter { it.sortingTag?.contains("ooze", true) == true },
            "plants" to allCreatures.filter { it.sortingTag?.contains("plant", true) == true },
            "undead" to allCreatures.filter { it.sortingTag?.contains("undead", true) == true },
            "familiars" to allCreatures.filter {
                it.sortingTag?.contains(
                    "familiar",
                    true
                ) == true
            },
            "special familiars" to allCreatures.filter {
                it.sortingTag?.contains(
                    "special familiar",
                    true
                ) == true
            },
            "summoned beasts" to allCreatures.filter {
                it.sortingTag?.contains(
                    "spell effect or summon",
                    true
                ) == true && it.type?.contains("beast", true) == true
            }
        )
    }

    LaunchedEffect(Unit) {
        allCreatures = loadCreatures(context)
        FavoriteManager.load(context)
        SpellFavoriteManager.load(context)
    }

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        bottomBar = {
            if (selectedStatBlock != null) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    FavoriteToggleButton(
                        selectedStatBlock = selectedStatBlock!!,
                        coroutineScope = coroutineScope,
                        snackbarHostState = snackbarHostState
                    )
                    MenagerieAddButton(
                        statBlock = selectedStatBlock!!,
                        snackbarHostState = snackbarHostState
                    )
                }
            }
        }
    ) { paddingVals ->
        BackHandler(enabled = true) {
            // Custom behavior here
            when {
                selectedStatBlock != null -> selectedStatBlock = null
                selectedSpell != null -> selectedSpell = null
                else -> onNavigateHome()
            }
        }
        Column(
            Modifier
                .fillMaxSize()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp) // fixed padding for top & sides
                .padding(bottom = paddingVals.calculateBottomPadding()) // dynamic bottom padding
        ){
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly // evenly space the buttons
            ) {
//                Icon(
//                    painter = painterResource(id = R.drawable.arrow_back_icon_menu),
//                    contentDescription = "Back One Step",
//                    modifier = Modifier
//                        .size(32.dp)
//                        .clickable {
//                            when {
//                                selectedStatBlock != null -> selectedStatBlock = null
//                                selectedSpell != null -> selectedSpell = null
//                                else -> onNavigateHome()
//                            }
//                        },
//                    tint = Color.White
//                )
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
            Text("Your Favorites", style = MaterialTheme.typography.headlineSmall)
            Spacer(Modifier.height(16.dp))

            // Toggle buttons for creatures vs spells
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                val selectedColor = Color(0xFF7F6A00).copy(alpha = 0.5f)
                val greyedOutColor = Color.Gray

                Button(
                    onClick = {
                        showCreatures = true
                        FavoritesTabState.showCreatures = true
                    },
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (showCreatures) selectedColor else greyedOutColor,
                        contentColor = if (showCreatures) Color.White else Color.LightGray,
                        disabledContainerColor = greyedOutColor,
                        disabledContentColor = Color.LightGray
                    ),
                    enabled = true
                ) {
                    OutlinedText(
                        text = "Creatures",
                        color = Color.White,
                        outlineColor = Color.Black,
                        outlineWidth = 0.8.dp,
                        style = MaterialTheme.typography.labelLarge
                    )
                }
                Spacer(modifier = Modifier.width(2.5.dp))
                Button(
                    onClick = {
                        showCreatures = false
                        FavoritesTabState.showCreatures = false
                    },
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (!showCreatures) selectedColor else greyedOutColor,
                        contentColor = if (!showCreatures) Color.White else Color.LightGray,
                        disabledContainerColor = greyedOutColor,
                        disabledContentColor = Color.LightGray
                    ),
                    enabled = true
                ) {
                    OutlinedText(
                        text = "Spells",
                        color = Color.White,
                        outlineColor = Color.Black,
                        outlineWidth = 0.8.dp,
                        style = MaterialTheme.typography.labelLarge
                    )
                }

            }

            Spacer(Modifier.height(16.dp))

            if (showCreatures) {
                // Creature favorites view
                if (selectedStatBlock == null) {
                    if (FavoriteManager.favorites.isEmpty()) {
                        Text("Nothing added yet.", textAlign = TextAlign.Center)
                    } else {
                        LazyColumn(modifier = Modifier.weight(1f)) {
                            items(FavoriteManager.favorites) { block ->
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 4.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = block.name ?: "Unnamed",
                                        modifier = Modifier
                                            .weight(1f)
                                            .clickable { selectedStatBlock = block }
                                            .padding(8.dp)
                                    )
                                    MenagerieAddButton(
                                        statBlock = block,
                                        snackbarHostState = snackbarHostState
                                    )
                                }
                            }
                        }
                    }
                } else {
                    Column(
                        Modifier
                            .weight(1f)
                            .verticalScroll(rememberScrollState())
                    ) {
                        StatBlockView(selectedStatBlock!!)


                    }
                }
            } else {
                // Spell favorites view
                if (selectedSpell == null) {
                    LazyColumn(modifier = Modifier.weight(1f)) {
                        items(SpellFavoriteManager.favorites) { spell ->
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 4.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = spell.spellName,
                                    modifier = Modifier
                                        .weight(1f)
                                        .clickable { onNavigateToSpellMenu(spell) }
                                        .padding(8.dp)
                                )
                            }
                        }
                    }

                }
            }
        }
    }

}


object FavoriteManager {
    var favorites by mutableStateOf<List<StatBlock>>(emptyList())

    suspend fun load(context: Context) {
        loadFavorites(context).collect {
            favorites = it
        }
    }

    suspend fun toggle(context: Context, block: StatBlock) {
        val updated = if (favorites.contains(block)) {
            favorites - block
        } else {
            favorites + block
        }
        favorites = updated
        saveFavorites(context, updated)
    }

    fun contains(block: StatBlock): Boolean {
        return favorites.any { it.name == block.name } // You can use a unique ID instead
    }
}


fun loadFavorites(context: Context): Flow<List<StatBlock>> {
    return context.dataStore.data.map { preferences ->
        val json = preferences[FAVORITES_KEY] ?: return@map emptyList()
        try {
            Json.decodeFromString(json)
        } catch (e: Exception) {
            emptyList()
        }
    }
}

suspend fun saveFavorites(context: Context, blocks: List<StatBlock>) {
    val json = Json.encodeToString(blocks)
    context.dataStore.edit { preferences ->
        preferences[FAVORITES_KEY] = json
    }
}

@Composable
fun FavoriteToggleButton(
    selectedStatBlock: StatBlock,
    coroutineScope: CoroutineScope,
    snackbarHostState: SnackbarHostState
) {
    val context = LocalContext.current
    val isFavorite = FavoriteManager.contains(selectedStatBlock)
    IconButton(
        onClick = {
            coroutineScope.launch {
                FavoriteManager.toggle(context, selectedStatBlock)

                val message = if (!isFavorite) "Added to Favorites" else "Removed from Favorites"
                snackbarHostState.showSnackbar(message, duration = SnackbarDuration.Indefinite)
            }
            coroutineScope.launch {
                delay(750)
                snackbarHostState.currentSnackbarData?.dismiss()
            }
        },
        modifier = Modifier.padding(start = 4.dp)
    ) {
        val iconRes = if (isFavorite) {
            R.drawable.favorites_icon_filled
        } else {
            R.drawable.favorites_icon_empty
        }

        Icon(
            painter = painterResource(id = iconRes),
            contentDescription = if (isFavorite) "Remove from Favorites" else "Add to Favorites",
            modifier = Modifier.size(32.dp),
            tint = Color.Unspecified
        )
    }
}

//spell favorites

object SpellFavoriteManager {
    var favorites by mutableStateOf<List<Spell>>(emptyList())

    suspend fun load(context: Context) {
        loadSpellFavorites(context).collect {
            favorites = it
        }
    }

    suspend fun toggle(context: Context, spell: Spell) {
        val updated = if (favorites.any { it.spellName == spell.spellName }) {
            favorites.filter { it.spellName != spell.spellName }
        } else {
            favorites + spell
        }
        favorites = updated
        saveSpellFavorites(context, updated)
    }

    fun contains(spell: Spell): Boolean {
        return favorites.any { it.spellName == spell.spellName }
    }
}

fun loadSpellFavorites(context: Context): Flow<List<Spell>> {
    return context.dataStore.data.map { preferences ->
        val json = preferences[SPELL_FAVORITES_KEY] ?: return@map emptyList()
        try {
            Json.decodeFromString<List<Spell>>(json)
        } catch (e: Exception) {
            emptyList()
        }
    }
}

suspend fun saveSpellFavorites(context: Context, spells: List<Spell>) {
    val json = Json.encodeToString(spells)
    context.dataStore.edit { preferences ->
        preferences[SPELL_FAVORITES_KEY] = json
    }
}