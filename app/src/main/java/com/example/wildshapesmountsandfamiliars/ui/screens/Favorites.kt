package com.example.wildshapesmountsandfamiliars.ui.screens

import android.annotation.SuppressLint
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
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

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Favorites(
    onNavigateHome: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit,
    onNavigateToFavorites: () -> Unit,
    onSelectStatBlock: (StatBlock) -> Unit
) {
    val context = LocalContext.current
    val snackbarHostState = remember { SnackbarHostState() }
    val coroutineScope = rememberCoroutineScope()
    var selectedStatBlock by remember { mutableStateOf<StatBlock?>(null) }

    // Ensure favorites are loaded
    LaunchedEffect(Unit) {
        FavoriteManager.load(context)
    }

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        content = {
            Column(Modifier.padding(16.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly // evenly space the buttons
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.arrow_back_icon_menu),
                        contentDescription = "Back One Step",
                        modifier = Modifier
                            .size(32.dp)
                            .clickable {
                                if (selectedStatBlock != null) {
                                    onNavigateToFavorites()
                                } else {
                                    onNavigateHome()
                                }
                            },
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
                Text("Your Favorites", style = MaterialTheme.typography.headlineSmall)
                Spacer(Modifier.height(16.dp))

                if (selectedStatBlock == null) {
                    if (FavoriteManager.favorites.isEmpty()) {
                        Text("Nothing added yet.", textAlign = TextAlign.Center)
                    } else {
                        LazyColumn(modifier = Modifier.weight(1f)) {
                            items(FavoriteManager.favorites) { block ->
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(horizontal = 8.dp, vertical = 4.dp),
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

                        Spacer(Modifier.height(16.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Button(
                                onClick = {
                                    coroutineScope.launch {
                                        FavoriteManager.toggle(context, selectedStatBlock!!)
                                        selectedStatBlock = null
                                    }
                                },
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(end = 4.dp)
                            ) {
                                Text("Remove from Favorites")
                            }

                            MenagerieAddButton(
                                statBlock = selectedStatBlock!!,
                                snackbarHostState = snackbarHostState
                            )
                        }
                    }
                }
            }
        }
    )
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