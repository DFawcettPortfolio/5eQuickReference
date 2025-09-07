package com.example.wildshapesmountsandfamiliars.ui.screens

import android.annotation.SuppressLint
import android.content.Context
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
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
import androidx.compose.ui.unit.dp
import com.example.wildshapesmountsandfamiliars.R
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.CustomStatBlockRepo.customBlocks

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SearchResults(
    context: Context,
    onNavigateHome: () -> Unit,
    onNavigateToFavorites: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit,
    onNavigateToStatblockMenu: () -> Unit,
    onNavigateToSpellMenu: (Spell) -> Unit,
    onNavigateToSearchResults: () -> Unit,
    onNavigateToNotekeeping: () -> Unit,
) {

    // Remember states for selected stat block and dialog visibility/editing
    var selectedStatBlock by remember { mutableStateOf<StatBlock?>(null) }

    // Filter states for CR and special tags
    var minCR by remember { mutableStateOf("") }
    var maxCR by remember { mutableStateOf("") }
    var minExpanded by remember { mutableStateOf(false) }
    var maxExpanded by remember { mutableStateOf(false) }

    val crOptions = listOf("") + (0..30).map { it.toString() }

    val specialOptions = listOf(
        "", "amphibious", "blindsight", "burrow speed", "cc - blinded", "cc - charmed",
        "cc - deafened", "cc - frightened", "cc - grappled", "cc - incapacitated",
        "cc - paralyzed", "cc - petrified", "cc - poisoned", "cc - possessed",
        "cc - prone", "cc - restrained", "cc - stunned", "cc - unconscious", "cc - exhausted",
        "climb speed", "condition resistance", "condition immunity", "damage resistance", "damage immunity",
        "darkvision", "flyby", "fly speed", "hold breath", "hover", "keen hearing", "keen sight",
        "keen smell",  "legendary action", "legendary resistance", "magic resistance", "multiattack",
        "pack tactics", "regeneration", "swarm", "swim speed", "telepathic", "tremorsense", "truesight",
        "water breathing"
    )
    var specialFilter by remember { mutableStateOf("") }
    var specialExpanded by remember { mutableStateOf(false) }

    // Snackbar host and coroutine scope
    val snackbarHostState = remember { SnackbarHostState() }
    val coroutineScope = rememberCoroutineScope()

    val context = LocalContext.current

    // Helper: convert CR string to decimal number for comparison
    val min = if (minCR.isBlank()) null else crToDecimal(minCR)
    val max = if (maxCR.isBlank()) null else crToDecimal(maxCR)

    fun StatBlock.matchesFilter(): Boolean {
        val cr = crToDecimal(this.challengeRating.toString())
        val matchesCR = (min == null || cr >= min) && (max == null || cr <= max)
        val matchesSpecial = if (specialFilter.isEmpty()) true
        else tags?.split(",")?.map { it.trim().lowercase() }?.contains(specialFilter.lowercase()) == true
        return matchesCR && matchesSpecial
    }

    val allCreatures = remember { loadCreatures(context) }
    val spells = rememberSpellsFromAssets(context, "jsonFiles/SRD_spells.json")
    val allCustomBlocks = remember { customBlocks }

    var searchQuery by remember { mutableStateOf("") }

    val combinedCreatures = remember(allCreatures, allCustomBlocks) {
        allCreatures + allCustomBlocks
    }

    val filteredCreatures = remember(searchQuery, minCR, maxCR, specialFilter, combinedCreatures) {
        combinedCreatures.filter { creature ->
            (searchQuery.isBlank() || creature.name?.contains(searchQuery, ignoreCase = true) == true)
                    && creature.matchesFilter()
        }
    }

    val filteredSpells = remember(searchQuery, spells) {
        if (searchQuery.isBlank()) spells else spells.filter {
            it.spellName.contains(searchQuery, ignoreCase = true)
        }
    }


    BackHandler(enabled = true) {
        // Custom behavior here
        if (selectedStatBlock != null) {
            selectedStatBlock = null
        } else {
            onNavigateToStatblockMenu()
        }
    }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        BackHandler(enabled = true) {
            // Custom behavior here
            if (selectedStatBlock != null) {
                selectedStatBlock = null
            } else {
                onNavigateToStatblockMenu()
            }
        }
        // Navbar Row - always visible
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
//            Icon(
//                painter = painterResource(id = R.drawable.arrow_back_icon_menu),
//                contentDescription = "Back One Step",
//                modifier = Modifier
//                    .size(32.dp)
//                    .clickable {
//                        if (selectedStatBlock != null) {
//                            selectedStatBlock = null
//                        } else {
//                            onNavigateToStatblockMenu()
//                        }
//                    },
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

        if (selectedStatBlock == null) {
            // Search field
            TextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                placeholder = { Text("Search ...") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(Modifier.height(12.dp))

            Column(modifier = Modifier.weight(1f)) {

                // Filters Row for creatures only
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Box(modifier = Modifier.weight(1f)) {
                        OutlinedButton(onClick = { minExpanded = true }, modifier = Modifier.fillMaxWidth()) {
                            Text(if (minCR.isEmpty()) "Min CR" else minCR)
                        }
                        DropdownMenu(expanded = minExpanded, onDismissRequest = { minExpanded = false }) {
                            crOptions.forEach {
                                DropdownMenuItem(
                                    text = { Text(if (it.isEmpty()) "None" else it) },
                                    onClick = {
                                        minCR = it
                                        minExpanded = false
                                    }
                                )
                            }
                        }
                    }

                    Box(modifier = Modifier.weight(1f)) {
                        OutlinedButton(onClick = { maxExpanded = true }, modifier = Modifier.fillMaxWidth()) {
                            Text(if (maxCR.isEmpty()) "Max CR" else maxCR)
                        }
                        DropdownMenu(expanded = maxExpanded, onDismissRequest = { maxExpanded = false }) {
                            crOptions.forEach {
                                DropdownMenuItem(
                                    text = { Text(if (it.isEmpty()) "None" else it) },
                                    onClick = {
                                        maxCR = it
                                        maxExpanded = false
                                    }
                                )
                            }
                        }
                    }
                }

                Spacer(Modifier.height(8.dp))

                Box(modifier = Modifier.fillMaxWidth()) {
                    OutlinedButton(onClick = { specialExpanded = true }, modifier = Modifier.fillMaxWidth()) {
                        Text(if (specialFilter.isEmpty()) "Filter by Tag" else specialFilter)
                    }
                    DropdownMenu(expanded = specialExpanded, onDismissRequest = { specialExpanded = false }) {
                        specialOptions.forEach {
                            DropdownMenuItem(
                                text = { Text(if (it.isEmpty()) "None" else it) },
                                onClick = {
                                    specialFilter = it
                                    specialExpanded = false
                                }
                            )
                        }
                    }
                }

                Spacer(Modifier.height(8.dp))

                if (filteredCreatures.isEmpty() && filteredSpells.isEmpty()) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                            .padding(16.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Nothing here yet", style = androidx.compose.material3.MaterialTheme.typography.bodyLarge)
                    }
                } else {
                    LazyColumn(modifier = Modifier.weight(1f)) {

                        if (filteredCreatures.isNotEmpty()) {
                            item {
                                Text(
                                    "Creatures",
                                    modifier = Modifier.padding(vertical = 8.dp),
                                    style = androidx.compose.material3.MaterialTheme.typography.titleMedium
                                )
                            }
                            items(filteredCreatures) { creature ->
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable { selectedStatBlock = creature }
                                        .padding(vertical = 4.dp)
                                ) {
                                    CreatureCard(creature)
                                }
                            }
                        }

                        if (filteredSpells.isNotEmpty()) {
                            item {
                                Text(
                                    "Spells",
                                    modifier = Modifier.padding(vertical = 8.dp),
                                    style = androidx.compose.material3.MaterialTheme.typography.titleMedium
                                )
                            }
                            items(filteredSpells) { spell ->
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable { onNavigateToSpellMenu(spell) }
                                        .padding(vertical = 4.dp)
                                ) {
                                    Text(spell.spellName, modifier = Modifier.padding(8.dp))
                                }
                            }
                        }

//                        if (filteredRules.isNotEmpty()) {
//                            item {
//                                Text(
//                                    "Rules",
//                                    modifier = Modifier.padding(vertical = 8.dp),
//                                    style = MaterialTheme.typography.titleMedium
//                                )
//                            }
//                            items(filteredRules) { rule ->
//                                Column(
//                                    modifier = Modifier
//                                        .fillMaxWidth()
//                                        .clickable { /* open rule detail */ }
//                                        .padding(12.dp)
//                                ) {
//                                    Text(rule.title, style = MaterialTheme.typography.bodyLarge)
//                                    Spacer(Modifier.height(4.dp))
//                                    Text(
//                                        rule.content.take(120) + "...",
//                                        style = MaterialTheme.typography.bodySmall,
//                                        color = Color.Gray
//                                    )
//                                }
//                            }
//                        }

                    }
                }
            }
        } else {
            Column(
                Modifier.fillMaxSize()
            ) {
                Column(
                    Modifier
                        .weight(1f)
                        .verticalScroll(rememberScrollState())
                        .padding(bottom = 8.dp)
                ) {
                    Spacer(Modifier.height(8.dp))
                    StatBlockView(selectedStatBlock!!)
                }

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
    }
}

//fun rememberAllRulesFromAssets(context: Context, fileName: String): List<Rule> {
//    val json = context.assets.open(fileName).bufferedReader().use { it.readText() }
//    val jsonObject = JSONObject(json)
//
//    val gson = Gson()
//    val allRules = mutableListOf<Rule>()
//
//    // Iterate all top-level keys (standardRules, planarLegacy, etc.)
//    jsonObject.keys().forEach { key ->
//        val arr = jsonObject.optJSONArray(key)
//        if (arr != null) {
//            val type = object : TypeToken<List<Rule>>() {}.type
//            val rules: List<Rule> = gson.fromJson(arr.toString(), type)
//            allRules.addAll(rules)
//        }
//    }
//
//    return allRules
//}
