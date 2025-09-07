package com.example.wildshapesmountsandfamiliars.ui.screens

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wildshapesmountsandfamiliars.R
import kotlinx.coroutines.launch
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SpellMenu(
    onNavigateHome: () -> Unit,
    onNavigateToFavorites: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToSpellMenu: () -> Unit,
    onNavigateToSearchResults: () -> Unit,
    onNavigateToNotekeeping: () -> Unit,
    spellToOpen: String? = null
) {
    val context = LocalContext.current
    var aberrations by remember { mutableStateOf<List<StatBlock>>(emptyList()) }
    var beasts by remember { mutableStateOf<List<StatBlock>>(emptyList()) }
    var celestials by remember { mutableStateOf<List<StatBlock>>(emptyList()) }
    var constructs by remember { mutableStateOf<List<StatBlock>>(emptyList()) }
    var dragons by remember { mutableStateOf<List<StatBlock>>(emptyList()) }
    var elementals by remember { mutableStateOf<List<StatBlock>>(emptyList()) }
    var fey by remember { mutableStateOf<List<StatBlock>>(emptyList()) }
    var fiends by remember { mutableStateOf<List<StatBlock>>(emptyList()) }
    var giants by remember { mutableStateOf<List<StatBlock>>(emptyList()) }
    var humanoids by remember { mutableStateOf<List<StatBlock>>(emptyList()) }
    var monstrosities by remember { mutableStateOf<List<StatBlock>>(emptyList()) }
    var oozes by remember { mutableStateOf<List<StatBlock>>(emptyList()) }
    var plants by remember { mutableStateOf<List<StatBlock>>(emptyList()) }
    var undead by remember { mutableStateOf<List<StatBlock>>(emptyList()) }
    var familiars by remember { mutableStateOf<List<StatBlock>>(emptyList()) }
    var specialFamiliars by remember { mutableStateOf<List<StatBlock>>(emptyList()) }
    var beastSpellEffectOrSummon by remember { mutableStateOf<List<StatBlock>>(emptyList()) }
    val creatureTypes: Map<String, List<StatBlock>> = mapOf(
        "aberrations" to aberrations,
        "beasts" to beasts,
        "celestials" to celestials,
        "constructs" to constructs,
        "dragons" to dragons,
        "elementals" to elementals,
        "fey" to fey,
        "fiends" to fiends,
        "giants" to giants,
        "humanoids" to humanoids,
        "monstrosities" to monstrosities,
        "oozes" to oozes,
        "plants" to plants,
        "undead" to undead,
        "familiars" to familiars,
        "special familiars" to specialFamiliars,
        "summoned beasts" to beastSpellEffectOrSummon
    )
    val spells = rememberSpellsFromAssets(context, "jsonFiles/SRD_spells.json")
    val snackbarHostState = remember { SnackbarHostState() }
    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()
    var selectedSpell by remember { mutableStateOf<Spell?>(null) }
    val latestSpellToOpen = rememberUpdatedState(spellToOpen)

    LaunchedEffect(spells, latestSpellToOpen.value) {
        if (latestSpellToOpen.value != null && selectedSpell == null) {
            selectedSpell = spells.firstOrNull {
                it.spellName.equals(latestSpellToOpen.value, ignoreCase = true)
            }
        }
    }



    var selectedStatBlock by remember { mutableStateOf<StatBlock?>(null) }

    val sortedSpells = remember(spells) {
        spells.sortedBy { it.spellName }
    }


    var allCreatures by remember { mutableStateOf<List<StatBlock>>(emptyList()) }

    LaunchedEffect(Unit) {
        allCreatures = loadCreatures(context)
        aberrations = allCreatures.filter {
            it.sortingTag?.lowercase()?.contains("aberration") == true
        }
        beasts = allCreatures.filter {
            it.sortingTag?.lowercase()?.contains("beast") == true
        }
        celestials = allCreatures.filter {
            it.sortingTag?.lowercase()?.contains("celestial") == true
        }
        constructs = allCreatures.filter {
            it.sortingTag?.lowercase()?.contains("construct") == true
        }
        dragons = allCreatures.filter {
            it.sortingTag?.lowercase()?.contains("dragon") == true
        }
        elementals = allCreatures.filter {
            it.sortingTag?.lowercase()?.contains("elemental") == true
        }
        fey = allCreatures.filter {
            it.sortingTag?.lowercase()?.contains("fey") == true
        }
        fiends = allCreatures.filter {
            it.sortingTag?.lowercase()?.contains("fiend") == true
        }
        giants = allCreatures.filter {
            it.sortingTag?.lowercase()?.contains("giant") == true
        }
        humanoids = allCreatures.filter {
            it.sortingTag?.lowercase()?.contains("humanoid") == true
        }
        monstrosities = allCreatures.filter {
            it.sortingTag?.lowercase()?.contains("monstrosity") == true
        }
        oozes = allCreatures.filter {
            it.sortingTag?.lowercase()?.contains("ooze") == true
        }
        plants = allCreatures.filter {
            it.sortingTag?.lowercase()?.contains("plant") == true
        }
        undead = allCreatures.filter {
            it.sortingTag?.lowercase()?.contains("undead") == true
        }
        familiars = allCreatures.filter {
            it.sortingTag?.lowercase()?.split(",")?.map { tag -> tag.trim() }?.contains("familiar") == true
        }
        specialFamiliars = allCreatures.filter {
            it.sortingTag?.lowercase()?.split(",")?.map { tag -> tag.trim() }?.contains("special familiar") == true
        }
        beastSpellEffectOrSummon = allCreatures.filter {
            it.sortingTag?.lowercase()?.split(",")?.map { tag -> tag.trim() }?.contains("spell effect or summon") == true &&
                    it.type?.lowercase()?.contains("beast") == true
        }
    }

    // Declare creatureTypes here inside SpellMenu


    BackHandler(enabled = true) {
        // Custom behavior here
        when {
            selectedStatBlock != null -> {
// If currently viewing a stat block, go back to the spell details
                selectedStatBlock = null
            }

            selectedSpell != null -> {
// If currently viewing a spell, go back to the spell menu
                selectedSpell = null
                onNavigateToSpellMenu
            }

            else -> {
// Otherwise, go back home
                onNavigateHome()
            }
        }
    }
    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        content = { innerPadding ->

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly // evenly space the buttons
                ) {
//                    Icon(
//                        painter = painterResource(id = R.drawable.arrow_back_icon_menu),
//                        contentDescription = "Back One Step",
//                        modifier = Modifier
//                            .size(32.dp)
//                            .clickable {
//                                when {
//                                    selectedStatBlock != null -> {
//// If currently viewing a stat block, go back to the spell details
//                                        selectedStatBlock = null
//                                    }
//                                    selectedSpell != null -> {
//// If currently viewing a spell, go back to the spell menu
//                                        selectedSpell = null
//                                        onNavigateToSpellMenu
//                                    }
//                                    else -> {
//// Otherwise, go back home
//                                        onNavigateHome()
//                                    }
//                                }
//                            },
//                        tint = Color.White
//                    )
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
                Text("Spells", style = MaterialTheme.typography.headlineSmall)
                Spacer(Modifier.height(16.dp))


                // In the StatBlock viewing section, replace the existing Box with this:
                if (selectedStatBlock != null) {


                    Column(modifier = Modifier.fillMaxSize()) {
                        // Scrollable stat block content with bottom padding
                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .verticalScroll(rememberScrollState())
                                .padding(bottom = 80.dp) // Add padding to prevent overlap
                        ) {
                            StatBlockView(selectedStatBlock!!)

                        }

                        // Fixed bottom bar
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


// Display spell view
                else if (selectedSpell != null) {
                    val spell = selectedSpell!!
                    val isSpellFavorite = remember(spell) {
                        mutableStateOf(SpellFavoriteManager.contains(spell))
                    }
                    val coroutineScope = rememberCoroutineScope()
                    val snackbarHostState = remember { SnackbarHostState() }
                    val context = LocalContext.current

                    Column(
                        Modifier
                            .weight(1f)
                            .verticalScroll(rememberScrollState())
                    ) {
                        Text(text = spell.spellName, style = MaterialTheme.typography.titleLarge)
                        Spacer(Modifier.height(8.dp))
                        Text("Level ${spell.level} ${spell.school}")
                        Text("Casting Time: ${spell.castingTime}")
                        Text("Ritual: ${spell.ritual}")
                        Text("Range: ${spell.range}")
                        Text("Components: ${spell.components}")
                        Text(text = formatDurationWithSuperscript(spell.duration))
                        Text("Concentration: ${spell.concentration}")
                        Text("Source: ${spell.source}")
                        Spacer(Modifier.height(8.dp))

                        var showDescription by remember { mutableStateOf(false) }

                        Button(
                            onClick = { showDescription = !showDescription },
                            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f))
                        ) {
                            OutlinedText(
                                text = if (showDescription) "Hide Description" else "Show Description",
                                color = Color.White,
                                outlineColor = Color.Black,
                                outlineWidth = 0.8.dp,
                                style = MaterialTheme.typography.labelLarge
                            )
                        }

                        if (showDescription) {
                            Spacer(Modifier.height(8.dp))
                            Text(spell.description)
                        }
                        Spacer(Modifier.height(16.dp))

// Add Favorite toggle button for the spell
                        Button(
                            onClick = {
                                coroutineScope.launch {
                                    SpellFavoriteManager.toggle(context, spell)
                                    isSpellFavorite.value = SpellFavoriteManager.contains(spell)

                                    val message =
                                        if (isSpellFavorite.value) "Added to Favorites" else "Removed from Favorites"
                                    snackbarHostState.showSnackbar(message)
                                }
                            },
                            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f)),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            OutlinedText(
                                text = if (isSpellFavorite.value) "Remove Spell from Favorites"
                                else "Add Spell to Favorites",
                                color = Color.White,
                                outlineColor = Color.Black,
                                outlineWidth = 0.8.dp,
                                style = MaterialTheme.typography.labelLarge
                            )
                        }


                        Spacer(Modifier.height(16.dp))

                        val spellRefsByLevel = listOf(
                            1 to spell.statBlockRef1,
                            2 to spell.statBlockRef2,
                            3 to spell.statBlockRef3,
                            4 to spell.statBlockRef4,
                            5 to spell.statBlockRef5,
                            6 to spell.statBlockRef6,
                            7 to spell.statBlockRef7,
                            8 to spell.statBlockRef8,
                            9 to spell.statBlockRef9
                        )

                        spellRefsByLevel.forEach { (level, refs) ->
                            if (!refs.isNullOrEmpty()) {
                                val summonCount = calculateSummonCount(selectedSpell?.spellName ?: "", level)


                                var expanded by remember { mutableStateOf(false) }
                                Spacer(Modifier.height(8.dp))
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable { expanded = !expanded }
                                        .padding(vertical = 4.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        text = "Level $level Cast",
                                        style = MaterialTheme.typography.titleMedium,
                                        color = MaterialTheme.colorScheme.secondary
                                    )
                                }
                                if (expanded) {
                                    val summonCountText = summonCount.joinToString("\n")
                                    if (selectedSpell?.spellName == "Flock of Familiars") {
                                        Text(summonCountText)

                                        // Group familiars by CR
                                        val groupedFamiliars = familiars.groupBy {
                                            parseChallengeRating(it.challengeRating)
                                        }.toSortedMap(compareByDescending { it })

                                        groupedFamiliars.forEach { (cr, creatures) ->
                                            if (cr != null) { // only suppress header if CR is null
                                                Text(
                                                    text = "------ CR ${formatCrForDisplay(cr)} ------",
                                                    style = MaterialTheme.typography.titleMedium,
                                                    modifier = Modifier.padding(vertical = 8.dp)
                                                )
                                            }
                                            creatures.sortedBy { it.name ?: "" }.forEach { creature ->
                                                Text(
                                                    text = creature.name ?: "Unknown",
                                                    modifier = Modifier
                                                        .fillMaxWidth()
                                                        .clickable { selectedStatBlock = creature }
                                                        .padding(12.dp)
                                                )
                                            }
                                        }

                                        Spacer(Modifier.height(16.dp))
                                        Text(
                                            text = "Pact of the Chain Warlock additional options:",
                                            style = MaterialTheme.typography.titleMedium,
                                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp)
                                        )

                                        // Group special familiars by CR
                                        val groupedSpecialFamiliars = specialFamiliars.groupBy {
                                            parseChallengeRating(it.challengeRating)
                                        }.toSortedMap(compareByDescending { it })

                                        groupedSpecialFamiliars.forEach { (cr, creatures) ->
                                            if (cr != null) { // only suppress header if CR is null
                                                Text(
                                                    text = "------ CR ${formatCrForDisplay(cr)} ------",
                                                    style = MaterialTheme.typography.titleMedium,
                                                    modifier = Modifier.padding(vertical = 8.dp)
                                                )
                                            }
                                            creatures.sortedBy { it.name ?: "" }.forEach { creature ->
                                                Text(
                                                    text = creature.name ?: "Unknown",
                                                    modifier = Modifier
                                                        .fillMaxWidth()
                                                        .clickable { selectedStatBlock = creature }
                                                        .padding(12.dp)
                                                )
                                            }
                                        }
                                    } else {
                                        Text(summonCountText)

                                        // Collect all statblocks first
                                        val allStatBlocks = mutableListOf<Pair<String, StatBlock>>()

                                        refs.forEach { ref ->
                                            // Check if this ref has a special builder
                                            if (specialStatBlockBuilders.containsKey(ref)) {
                                                // Get all variants for this special ref
                                                val variants = multiEnvironmentRefs[ref] ?: listOf(null)
                                                variants.forEach { variant ->
                                                    val statBlock = getStatBlockForSpellRef(ref, level, context, variant)
                                                    if (statBlock != null) {
                                                        allStatBlocks.add(Pair("${variant ?: "Default"} $ref", statBlock))
                                                    }
                                                }
                                            } else {
                                                // Original behavior for normal refs: look by name or creatureTypes map
                                                val byName = allCreatures.filter { it.name == ref }
                                                if (byName.isNotEmpty()) {
                                                    byName.forEach { creature ->
                                                        allStatBlocks.add(Pair(creature.name ?: "Unknown", creature))
                                                    }
                                                } else {
                                                    // fallback to creatureTypes map (lowercase key)
                                                    val key = ref.lowercase().trim()
                                                    val creatures = creatureTypes[key] ?: emptyList()
                                                    creatures.forEach { creature ->
                                                        allStatBlocks.add(Pair(creature.name ?: "Unknown", creature))
                                                    }
                                                }
                                            }
                                        }

                                        // Group by CR
                                        val groupedStatBlocks = allStatBlocks.groupBy {
                                            parseChallengeRating(it.second.challengeRating)
                                        }.toSortedMap(compareByDescending { it })

                                        // Display with CR headers
                                        groupedStatBlocks.forEach { (cr, statBlockPairs) ->
                                            if (cr != null) { // only suppress header if CR is null
                                                Text(
                                                    text = "------ CR ${formatCrForDisplay(cr)} ------",
                                                    style = MaterialTheme.typography.titleMedium,
                                                    modifier = Modifier.padding(vertical = 8.dp)
                                                )
                                            }

                                            // Sort alphabetically within each CR group
                                            statBlockPairs.sortedBy { it.first }.forEach { (displayName, creature) ->
                                                Text(
                                                    text = displayName,
                                                    modifier = Modifier
                                                        .fillMaxWidth()
                                                        .clickable { selectedStatBlock = creature }
                                                        .padding(12.dp)
                                                )
                                            }
                                        }
                                    }
                                }


                            }
                        }


                    }


                    Spacer(Modifier.height(16.dp))
                }

// Display spell list
                else {
                    LazyColumn( state = listState, modifier = Modifier.weight(1f)) {
                        items(sortedSpells) { spell ->
                            Text(
                                text = spell.spellName,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable { selectedSpell = spell }
                                    .padding(16.dp)
                            )
                        }
                    }
                }


            }
        }
    )
}

@Serializable
data class Spell(
    val spellName: String,
    val level: Int,
    val school: String,
    val castingTime: String,
    val ritual: String,
    val concentration: String,
    val range: String,
    val components: String,
    val duration: String,
    val description: String,
    val source: String,
    val statBlockRef1: List<String>?,
    val statBlockRef2: List<String>?,
    val statBlockRef3: List<String>?,
    val statBlockRef4: List<String>?,
    val statBlockRef5: List<String>?,
    val statBlockRef6: List<String>?,
    val statBlockRef7: List<String>?,
    val statBlockRef8: List<String>?,
    val statBlockRef9: List<String>?
)

@Composable
fun rememberSpellsFromAssets(context: Context, fileName: String): List<Spell> {
    var spells by remember { mutableStateOf<List<Spell>>(emptyList()) }

    LaunchedEffect(key1 = fileName) {
        try {
            val jsonString = loadJSONFromAssets(context, fileName)
            spells = Json.decodeFromString(ListSerializer(Spell.serializer()), jsonString)
        } catch (_: Exception) {
            // Optionally log error or handle parsing failures
            spells = emptyList()
        }
    }

    return spells
}


typealias StatBlockBuilder = (environmentOrVariant: String?, spellLevel: Int) -> StatBlock
val specialStatBlockBuilders: Map<String, StatBlockBuilder> = mapOf(
    "Bestial Spirit" to { env, spellLevel -> buildBestialSpirit(env ?: "Land", spellLevel) },
    "Celestial Spirit" to { role, spellLevel -> buildCelestialSpirit(role ?: "Avenger", spellLevel) },
    "Fey Spirit" to { mood, spellLevel -> buildFeySpirit(mood ?: "Tricksy", spellLevel) },
    "Shadow Spirit" to { emotion, spellLevel -> buildShadowSpirit(emotion ?: "Despair", spellLevel) },
    "Undead Spirit" to { form, spellLevel -> buildUndeadSpirit(form ?: "Ghostly", spellLevel) },
    "Spirit of Death" to { form, spellLevel -> buildUndeadSpirit(form ?: "Ghostly", spellLevel) }, // alias
    "Aberrant Spirit" to { form, spellLevel -> buildAberrantSpirit(form ?: "Beholderkin", spellLevel) },
    "Construct Spirit" to { form, spellLevel -> buildConstructSpirit(form ?: "Clay", spellLevel) },
    "Elemental Spirit" to { element, spellLevel -> buildElementalSpirit(element ?: "Air", spellLevel) },
    "Draconic Spirit" to { type, spellLevel -> buildDraconicSpirit(type ?: "Chromatic", spellLevel) },
    "Fiendish Spirit" to { type, spellLevel -> buildFiendishSpirit(type ?: "Demon", spellLevel) },
    "Reaper Spirit" to { _, spellLevel -> buildReaperSpirit(spellLevel) },
    "Bigby's Hand" to { _, spellLevel -> buildBigbysHand(spellLevel) }
)

val multiEnvironmentRefs: Map<String, List<String>> = mapOf(
    "Bestial Spirit" to listOf("Air", "Land", "Water"),
    "Celestial Spirit" to listOf("Avenger", "Defender"),
    "Fey Spirit" to listOf("Tricksy", "Fuming", "Mirthful"),
    "Shadow Spirit" to listOf("Despair", "Fear", "Fury"),
    "Undead Spirit" to listOf("Ghostly", "Putrid", "Skeletal"),
    "Spirit of Death" to listOf("Ghostly", "Putrid", "Skeletal"), // alias
    "Aberrant Spirit" to listOf("Beholderkin", "Slaad", "Star Spawn"),
    "Construct Spirit" to listOf("Clay", "Metal", "Stone"),
    "Elemental Spirit" to listOf("Air", "Earth", "Fire", "Water"),
    "Draconic Spirit" to listOf("Chromatic", "Gem", "Metallic"),
    "Fiendish Spirit" to listOf("Demon", "Devil", "Yugoloth"),
    "Reaper Spirit" to listOf(""),
    "Bigby's Hand" to listOf("") // single form, not environment-dependent
)


fun formatDurationWithSuperscript(raw: String?): AnnotatedString {
    val safeRaw = raw ?: ""
    val parts = safeRaw.split("^") // split on your marker
    return buildAnnotatedString {
        append("Duration: ") // normal prefix

        append(parts[0]) // main duration text
        if (parts.size > 1) {
            withStyle(
                style = SpanStyle(
                    fontSize = 12.sp,                  // smaller size for superscript
                    baselineShift = BaselineShift.Superscript
                )
            ) {
                append(parts[1]) // the superscript part
            }
        }
    }
}

fun parseChallengeRating(cr: String?): Float? {
    if (cr == null || cr == "—" || cr.isEmpty()) return null

    return try {
        when {
            cr.contains("/") -> {
                val parts = cr.split("/")
                if (parts.size == 2) {
                    parts[0].toFloat() / parts[1].toFloat()
                } else {
                    null
                }
            }
            else -> cr.toFloat()
        }
    } catch (e: Exception) {
        null
    }
}

fun formatCrForDisplay(crValue: Float?): String {
    if (crValue == null) return "—"

    return if (crValue % 1 == 0f) {
        crValue.toInt().toString() // Display whole numbers without decimal
    } else {
        when (crValue) {
            0.5f -> "1/2"
            0.25f -> "1/4"
            0.125f -> "1/8"
            else -> crValue.toString()
        }
    }
}


@Composable
fun getStatBlockForSpellRef(
    statBlockRef: String,
    spellLevel: Int,
    context: Context,
    environmentOrVariant: String? = null
): StatBlock? {
    Log.d("SpellRef", "Looking for: $statBlockRef, level: $spellLevel, variant: $environmentOrVariant")
    val statBlockMap = remember(context) {
        loadCreatureMap(context)
    }

    val builder = specialStatBlockBuilders[statBlockRef]
    if (builder != null) {
        Log.d("SpellRef", "Found builder for $statBlockRef")
        return builder(environmentOrVariant, spellLevel)
    }
    val block = statBlockMap[statBlockRef]
    Log.d("SpellRef", "Found in map: ${block != null}")
    return block
}





fun levelToOrdinal(level: Int): String {
    return when (level) {
        1 -> "1st level"
        2 -> "2nd level"
        3 -> "3rd level"
        4 -> "4th level"
        5 -> "5th level"
        6 -> "6th level"
        7 -> "7th level"
        8 -> "8th level"
        9 -> "9th level"
        else -> "$level level" // fallback
    }
}


//Build Stat blocks for spells
fun buildBestialSpirit(environment: String, spellLevel: Int): StatBlock {
    val ac = 11 + spellLevel
    val hpmod = (spellLevel - 2 ) * 5
    val hp = when (environment) {
        "Air" -> 20 + hpmod
        else -> 30 + hpmod
    }

    val speed = when (environment) {
        "Air" -> "fly 60 ft."
        "Land" -> "30 ft., climb 30 ft."
        "Water" -> "30ft., swim 30 ft."
        else -> "30 ft."
    }
    val waterTraits = listOf(
        "Pack Tactics. The beast has advantage on an attack roll against a creature if at least one of the beast’s allies is within 5 feet of the creature and the ally isn’t incapacitated.",
        "Water Breathing. The beast can breathe only underwater."
    )
    val traits: List<String> = when (environment) {
        "Air" -> listOf("Flyby. The beast doesn’t provoke opportunity attacks when it flies out of an enemy’s reach.")
        "Land" -> listOf("Pack Tactics. The beast has advantage on an attack roll against a creature if at least one of the beast’s allies is within 5 feet of the creature and the ally isn’t incapacitated.")
        "Water" -> waterTraits
        else -> emptyList()
    }
    val tags = when (environment){
        "Air" -> "darkvision, fly speed, flyby, multiattack"
        "Land" -> "darkvision, pack tactics, multiattack"
        "Water" ->"darkvision, pack tactics, multiattack, water breathing"
            else -> null
    }

    val attackCount = spellLevel / 2
    val damageMod = 4 + spellLevel

    return StatBlock(
        name = "Bestial Spirit, $environment (${levelToOrdinal(spellLevel)})",
        size = "Small",
        type = "beast",
        alignment = "neutral",
        armorClass = "$ac (natural armor)",
        hitPoints = "$hp",
        speed = speed,
        str = 18, strMod = "+4",
        dex = 11, dexMod = "+0",
        con = 16, conMod = "+3",
        int = 4, intMod = "-3",
        wis = 14, wisMod = "+2",
        cha = 5, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 12",
        languages = "understands the languages you speak",
        challengeRating = null,
        expValue = null,
        proficiencyBonus = "equals your bonus",
        traits = traits,
        actions = listOf(
            "Multiattack. The beast makes $attackCount attacks.",
            "Maul. Melee Weapon Attack: your spell attack modifier to hit, reach 5 ft., one target. Hit: 1d8 + $damageMod piecing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "$tags",
        source = "Summon Beast spell; Tasha's Cauldron of Everything",
        namedEntity = false,
        sortingTag = "Spell effect or summon"
    )
}

fun buildCelestialSpirit(role: String, spellLevel: Int): StatBlock {
    val ac = if (role == "Avenger") 11 + spellLevel else 13 + spellLevel
    val baseHp = 40 + 10 * (spellLevel - 5)
    val attackCount = spellLevel / 2
    val radiantBowDamage = 2 + spellLevel
    val radiantMaceDamage =  3 + spellLevel


    val actions = when (role) {
        "Avenger" -> listOf(
            "Multiattack. The celestial makes $attackCount attacks.",
            "Radiant Bow. Ranged Weapon Attack: your spell attack modifier to hit, range 150/600 ft., one target. Hit: 2d6 + $radiantBowDamage radiant damage.",
            "Healing Touch (1/Day). The celestial touches another creature. The target magically regains hit points equal to 2d8 + $spellLevel.\n"
        )
        "Defender" -> listOf(
            "Multiattack. The celestial makes $attackCount attacks.",
            "Radiant Mace. Melee Weapon Attack: your spell attack modifier to hit, reach 5 ft., one target. Hit: 1d10 + $radiantMaceDamage radiant damage, and the celestial can choose itself or another creature it can see within 10 feet of the target. The chosen creature gains 1d10 temporary hit points.",
            "Healing Touch (1/Day). The celestial touches another creature. The target magically regains hit points equal to 2d8 + $spellLevel.\n"
        )
        else -> emptyList()
    }

    return StatBlock(
        name = "Celestial Spirit, $role (${levelToOrdinal(spellLevel)})",
        size = "Large",
        type = "celestial",
        alignment = "no alignment",
        armorClass = "$ac (natural armor)",
        hitPoints = "$baseHp",
        speed = "30 ft., fly 40 ft.",
        str = 16, strMod = "+3",
        dex = 14, dexMod = "+2",
        con = 16, conMod = "+3",
        int = 10, intMod = "+0",
        wis = 14, wisMod = "+2",
        cha = 16, chaMod = "+3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "radiant",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "charmed, frightened",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 12",
        languages = "Celestial, understands the languages you speak",
        challengeRating = null,
        expValue = null,
        proficiencyBonus = "equals your bonus",
        traits = null,
        actions = actions,
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = emptyList(),
        description = null,
        tags = "darkvision, fly speed, multiattack, damage resistance, condition immunity",
        source = "Summon Celestial spell; Tasha's Cauldron of Everything",
        namedEntity = false,
        sortingTag = "Spell effect or summon"
    )
}

fun buildFeySpirit(mood: String, spellLevel: Int): StatBlock {

    val hitPoints = 10 * spellLevel
    val armorClass = 12 + spellLevel


    // Multiattack: number of attacks = half spell level (rounded down)
    val numAttacks = spellLevel / 2

    val actions = listOf(
        "Multiattack. The fey makes $numAttacks attack${if (numAttacks > 1) "s" else ""}.",
        "Shortsword. Melee Weapon Attack: your spell attack modifier to hit, reach 5 ft., one target. Hit: 1d6 + ${3 + spellLevel} piercing damage + 1d6 force damage."
    )

    val bonusActions = mutableListOf(
        "Fey Step. The fey magically teleports up to 30 feet to an unoccupied space it can see. Then the following effect occurs, based on the fey’s chosen mood."
    )

    when (mood) {
        "Fuming" -> bonusActions.add("Fuming. The fey has advantage on the next attack roll it makes before the end of this turn.")
        "Mirthful" -> bonusActions.add("Mirthful. The fey can force one creature it can see within 10 feet of it to make a Wisdom saving throw against your spell save DC. Unless the save succeeds, the target is charmed by you and the fey for 1 minute or until the target takes any damage.")
        "Tricksy" -> bonusActions.add("Tricksy. The fey can fill a 5-foot cube within 5 feet of it with magical darkness, which lasts until the end of its next turn.")
    }
    val tags = when (mood){
        "Fuming" -> "condition immunity, multiattack, teleportation"
        "Mirthful" -> "condition immunity, multiattack, teleportation, cc - charmed"
        "Tricksy" -> "condition immunity, multiattack, teleportation"
        else -> null
    }
    return StatBlock(
        name = "Fey Spirit, $mood (${levelToOrdinal(spellLevel)})",
        size = "Small",
        type = "fey",
        alignment = "no alignment",
        armorClass = "$armorClass (natural armor)",
        hitPoints = hitPoints.toString(),
        speed = "40 ft.",
        str = 13, strMod = "+1",
        dex = 16, dexMod = "+3",
        con = 14, conMod = "+2",
        int = 14, intMod = "+2",
        wis = 11, wisMod = "+0",
        cha = 16, chaMod = "+3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "charmed",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "Sylvan, understands the languages you speak",
        challengeRating = null,
        expValue = null,
        proficiencyBonus = "equals your bonus",
        traits = null,
        actions = actions,
        bonusActions = bonusActions,
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = tags,
        source = "Summon Fey spell; Tasha's Cauldron of Everything",
        namedEntity = false,
        sortingTag = "Spell effect or summon"
    )
}

fun buildShadowSpirit(emotion: String, spellLevel: Int): StatBlock {
    val baseHP = 35
    val hpPerLevel = 15
    val totalHP = baseHP + (spellLevel - 3) * hpPerLevel

    val armorClassValue = 11 + spellLevel
    val armorClass = "$armorClassValue (natural armor)"


    val traits = mutableListOf<String>()

    when (emotion) {
        "Fury" -> traits.add("Terror Frenzy. The spirit has advantage on attack rolls against frightened creatures.")
        "Despair" -> traits.add("Weight of Sorrow. Any creature, other than you, that starts its turn within 5 feet of the spirit has its speed reduced by 20 feet until the start of that creature’s next turn.")
    }

    val multiattackCount = spellLevel / 2
    val actions = listOf(
        "Multiattack. The spirit makes $multiattackCount attack${if (multiattackCount > 1) "s" else ""}.",
        "Chilling Hand. Melee Weapon Attack: your spell attack modifier to hit, reach 5 ft., one target. Hit: 1d12 + ${3 + spellLevel} cold damage.",
        "Dreadful Scream (1/Day). The spirit screams. Each creature within 30 feet of it must succeed on a Wisdom saving throw against your spell save DC or be frightened of the spirit for 1 minute. The frightened creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success."
    )

    val bonusActions = if (emotion == "Fear") {
        listOf("Shadow Stealth. While in dim light or darkness, the spirit takes the Hide action.")
    } else emptyList()

    return StatBlock(
        name = "Shadow Spirit, $emotion (${levelToOrdinal(spellLevel)})",
        size = "Medium",
        type = "monstrosity",
        alignment = "no alignment",
        armorClass = armorClass,
        hitPoints = "$totalHP",
        speed = "40 ft.",
        str = 13, strMod = "+1",
        dex = 16, dexMod = "+3",
        con = 15, conMod = "+2",
        int = 4, intMod = "-3",
        wis = 10, wisMod = "+0",
        cha = 16, chaMod = "+3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "necrotic",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "frightened",
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 10",
        languages = "understands the languages you speak",
        challengeRating = null,
        expValue = null,
        proficiencyBonus = "equals your bonus",
        traits = traits,
        actions = actions,
        bonusActions = bonusActions,
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage resistance, condition immunity, darkvision, multiattack, cc - frightened",
        source = "Summon Shadowspawn spell; Tasha's Cauldron of Everything",
        namedEntity = false,
        sortingTag = "Spell effect or summon"
    )
}

fun buildUndeadSpirit(form: String, spellLevel: Int): StatBlock {
    val baseHP = when (form) {
        "Skeletal" -> 20
        else -> 30
    }
    val hpPerLevel = 10
    val totalHP = baseHP + (spellLevel - 3) * hpPerLevel

    val acValue = 11 + spellLevel
    val armorClass = "$acValue (natural armor)"

    val speed = when (form) {
        "Ghostly" -> "30 ft., fly 40 ft. (hover)"
        else      -> "30 ft."
    }

    val traits = mutableListOf<String>().apply {
        when (form) {
            "Putrid" -> add("Festering Aura. Any creature, other than you, that starts its turn within 5 feet of the spirit must succeed on a Constitution saving throw against your spell save DC or be poisoned until the start of its next turn.")
            "Ghostly"  -> add("Incorporeal Passage. The spirit can move through other creatures and objects as if they were difficult terrain. If it ends its turn inside an objects, it is shunted to the nearest unoccupied space and takes 1d10 force damage for every 5 feet traveled.")
        }
    }

    val attacksThisTurn = spellLevel / 2
    val dmgMod = 3 + spellLevel

    val actions = mutableListOf(
        "Multiattack. The spirit makes $attacksThisTurn attack${if (attacksThisTurn == 1) "" else "s"} (half this spell’s level, rounded down)."
    ).apply {
        when (form) {
            "Ghostly" -> add("Deathly Touch. Melee Weapon Attack: your spell attack modifier to hit, reach 5 ft., one creature. Hit: 1d8 + $dmgMod necrotic damage, and the creature must succeed on a Wisdom saving throw against your spell save DC or be frightened of the undead until the end of the target’s next turn.")
            "Putrid"  -> add("Rotting Claw. Melee Weapon Attack: your spell attack modifier to hit, reach 5 ft., one target. Hit: 1d6 + $dmgMod slashing damage. If the target is poisoned, it must succeed on a Constitution saving throw against your spell save DC or be paralyzed until the end of its next turn.")
            "Skeletal"-> add("Grave Bolt. Ranged Spell Attack: your spell attack modifier to hit, range 150 ft., one target. Hit: 2d4 + $dmgMod necrotic damage.")
        }
    }

    val tags = mutableListOf<String>().apply {
        when (form) {
            "Ghostly" -> add("damage immunity, condition immunity, darkvision, multiattack, fly speed, hover, cc - frightened, incorporeal movement")
            "Putrid"  -> add("damage immunity, condition immunity, darkvision, multiattack, cc - poisoned, cc - paralyzed")
            "Skeletal"-> add("damage immunity, condition immunity, darkvision, multiattack")
        }
    }

    return StatBlock(
        name = "Undead Spirit ($form) (${levelToOrdinal(spellLevel)})",
        size = "Medium",
        type = "undead",
        alignment = "no alignment",
        armorClass = armorClass,
        hitPoints = "$totalHP",
        speed = speed,
        str = 12, strMod = "+1",
        dex = 16, dexMod = "+3",
        con = 15, conMod = "+2",
        int = 4, intMod = "-3",
        wis = 10, wisMod = "+0",
        cha = 9, chaMod = "-1",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "necrotic, poison",
        conditionResistances = null,
        conditionImmunities = "exhaustion, frightened, paralyzed, poisoned",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "understands the languages you speak",
        challengeRating = null,
        expValue = null,
        proficiencyBonus = "equals your bonus",
        traits = traits,
        actions = actions,
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "$tags",
        source = "Summon Undead spell; Tasha's Cauldron of Everything",
        namedEntity = false,
        sortingTag = "Spell effect or summon"
    )
}

fun buildReaperSpirit(spellLevel: Int): StatBlock {
    // Calculated HP and AC
    val baseHP = 40
    val hpPerLevel = 10
    val calculatedHP = baseHP + maxOf(0, (spellLevel - 4)) * hpPerLevel
    val hitPoints = "$calculatedHP"

    val calculatedAC = 11 + spellLevel
    val armorClass = "$calculatedAC (natural armor)"

    // Calculated Multiattack count (half spell level, rounded down)
    val numAttacks = spellLevel / 2
    val dmgMod = 3 + spellLevel

    val actions = listOf(
        "Multiattack. The spirit makes $numAttacks attack${if (numAttacks > 1) "s" else ""}.",
        "Reaping Scythe.  Melee Weapon Attack: your spell attack modifier to hit (with advantage), reach 5 ft., one target. Hit: 1d8 + $dmgMod necrotic damage."
    )

    val bonusActions = listOf(
        "Haunt Creature The spirit targets a creature it can see within 10 feet of itself and begins haunting it. While the target is haunted, you and the spirit sense the direction and distance to the target if it is on the same plane of existence as you. Additionally, if the target starts its turn within 10 feet of the spirit, the target must succeed on a Wisdom saving throw against your spell save DC or have the frightened condition until the start of the target’s next turn. The target remains haunted until it dies, the spirit disappears, or the spirit uses this action again."
    )

    val traits = listOf(
        "Incorporeal Movement. The reaper can move through other creatures and objects as if they were difficult terrain. If it ends its turn inside an object, it is shunted to the nearest unoccupied space and takes 1d10 force damage for every 5 feet traveled."
    )

    return StatBlock(
        name = "Reaper Spirit (${levelToOrdinal(spellLevel)})",
        size = "Medium",
        type = "undead",
        alignment = "neutral",
        armorClass = armorClass,
        hitPoints = hitPoints,
        speed = "30 ft., fly 30 ft. (hover)",
        str = 16, strMod = "+3",
        dex = 16, dexMod = "+3",
        con = 16, conMod = "+3",
        int = 16, intMod = "+3",
        wis = 16, wisMod = "+3",
        cha = 16, chaMod = "+3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "necrotic, poison",
        conditionResistances = null,
        conditionImmunities = "charmed, exhaustion, frightened, paralyzed, poisoned",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 13",
        languages = "understands the languages you speak",
        challengeRating = null,
        expValue = null,
        proficiencyBonus = "equals your bonus",
        traits = traits,
        actions = actions,
        bonusActions = bonusActions,
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, hover, damage immunity, condition immunity, incorporeal movement, multiattack, cc - frightened",
        source = "Spirit of Death spell; The Book of Many Things",
        namedEntity = false,
        sortingTag = "Spell effect or summon"
    )
}

fun buildAberrantSpirit(type: String, spellLevel: Int): StatBlock {
    // HP calculation
    val calculatedHP = 40 + maxOf(0, (spellLevel - 4)) * 10
    val hitPoints = "$calculatedHP"

    // AC calculation
    val calculatedAC = 11 + spellLevel
    val armorClass = "$calculatedAC (natural armor)"

    // Multiattack calculation (half spell level, rounded down)
    val numAttacks = spellLevel / 2
    val dmgMod = 3 + spellLevel


    // Speed depends on spirit type
    val speed = when (type) {
        "Beholderkin" -> "30 ft., fly 30 ft. (hover)"
        else -> "30 ft."
    }

    // Traits
    val traits = mutableListOf<String>().apply {
        when (type) {
            "Slaad" -> add("Regeneration. The aberration regains 5 hit points at the start of its turn if it has at least 1 hit point.")
            "Star Spawn" -> add("Whispering Aura.  At the start of each of the aberration’s turns, each creature within 5 feet of the aberration must succeed on a Wisdom saving throw against your spell save DC or take 2d6 psychic damage, provided that the aberration isn’t incapacitated.")
        }
    }

    // Actions
    val actions = mutableListOf<String>().apply {
        add("Multiattack. The spirit makes $numAttacks attack${if (numAttacks > 1) "s" else ""}.")

        when (type) {
            "Beholderkin" -> add("Eye Ray.  Ranged Spell Attack: your spell attack modifier to hit, range 150 ft., one creature. Hit: 1d8 + $dmgMod psychic damage.")
            "Slaad" -> add("Claws. Melee Weapon Attack: your spell attack modifier to hit, reach 5 ft., one target. Hit: 1d10 + $dmgMod slashing damage. If the target is a creature, it can’t regain hit points until the start of the aberration’s next turn.")
            "Star Spawn" -> add("Psychic Slam. Melee Spell Attack: your spell attack modifier to hit, reach 5 ft., one creature. Hit: 1d8 + $dmgMod psychic damage")
        }
    }

    return StatBlock(
        name = "Aberrant Spirit, $type (${levelToOrdinal(spellLevel)})",
        size = "Medium",
        type = "aberration",
        alignment = "no alignment",
        armorClass = armorClass,
        hitPoints = hitPoints,
        speed = speed,
        str = 16, strMod = "+3",
        dex = 10, dexMod = "+0",
        con = 15, conMod = "+2",
        int = 16, intMod = "+3",
        wis = 10, wisMod = "+0",
        cha = 6, chaMod = "-2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "psychic",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "charmed, frightened",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "Deep Speech, understands the languages you speak",
        challengeRating = null,
        expValue = null,
        proficiencyBonus = "equals your bonus",
        traits = traits,
        actions = actions,
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "",
        source = "Summon Aberration spell; Tasha's Cauldron of Everything",
        namedEntity = false,
        sortingTag = "Spell effect or summon"
    )
}

fun buildConstructSpirit(material: String, spellLevel: Int): StatBlock {

    val totalHP = 40 + maxOf(0, (spellLevel - 4)) * 15
    val hitPoints ="$totalHP"

    val armorClassValue = 13 + spellLevel
    val armorClass = "$armorClassValue (natural armor)"


    val traits = mutableListOf<String>()
    when (material) {
        "Metal" -> traits.add("Heated Body. A creature that touches the construct or hits it with a melee attack while within 5 feet of it takes 1d10 fire damage.")
        "Stone" -> traits.add("Stony Lethargy. When a creature the construct can see starts its turn within 10 feet of the construct, the construct can force it to make a Wisdom saving throw against your spell save DC. On a failed save, the target can’t use reactions and its speed is halved until the start of its next turn.")
    }

    // Multiattack calculation (half spell level, rounded down)
    val numAttacks = spellLevel / 2
    val dmgMod = 4 + spellLevel

    val actions = mutableListOf<String>()
    actions.add("Multiattack. The construct makes $numAttacks attack${if (numAttacks > 1) "s" else ""}.")
    actions.add("Slam. Melee Weapon Attack: your spell attack modifier to hit, reach 5 ft., one target. Hit: 1d8 + $dmgMod bludgeoning damage.")

    val reactions = mutableListOf<String>()
    reactions.add("Berserk Lashing. When the construct takes damage, it makes a slam attack against a random creature within 5 feet of it. If no creature is within reach, the construct moves up to half its speed toward an enemy it can see, without provoking opportunity attacks.")


    return StatBlock(
        name = "Construct Spirit, $material (${levelToOrdinal(spellLevel)})",
        size = "Medium",
        type = "construct",
        alignment = "no alignment",
        armorClass = armorClass,
        hitPoints = hitPoints,
        speed = "30 ft.",
        str = 18, strMod = "+4",
        dex = 10, dexMod = "+0",
        con = 18, conMod = "+4",
        int = 14, intMod = "+2",
        wis = 11, wisMod = "+0",
        cha = 5, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "poison",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "charmed, exhaustion, frightened, incapacitated, paralyzed, petrified, poisoned",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "understands the languages you speak",
        challengeRating = null,
        expValue = null,
        proficiencyBonus = "equals your bonus",
        traits = traits,
        actions = actions,
        bonusActions = listOf(),
        reactions = reactions,
        legendaryActions = listOf(),
        description = null,
        tags = "",
        source = "Summon Construct spell; Tasha's Cauldron of Everything",
        namedEntity = false,
        sortingTag = "Spell effect or summon"
    )
}

fun buildElementalSpirit(element: String, spellLevel: Int): StatBlock {

    val totalHP = 50 + maxOf(0, (spellLevel - 4)) * 10
    val hitPoints = "$totalHP"

    val armorClassValue = 11 + spellLevel
    val armorClass = "$armorClassValue (natural armor)"

    val speed = when (element) {
        "Air" -> "40 ft., fly 40 ft. (hover)"
        "Earth" -> "40 ft., burrow 40 ft."
        "Water" -> "40 ft., swim 40 ft."
        else -> "40 ft."

    }

    val damageResistances = when (element) {
        "Air" -> "lightning, thunder"
        "Earth" -> "piercing, slashing"
        "Water" -> "acid"
        else -> null
    }

    val damageImmunities = when (element) {
        "Fire" ->  "poison, fire"
        else -> "poison"
    }

    val traits = mutableListOf<String>()
    when (element) {

        "Earth" -> null
        else -> traits.add("Amorphous Form. The elemental can move through a space as narrow as 1 inch wide without squeezing.")

    }

    // Multiattack calculation (half spell level, rounded down)
    val numAttacks = spellLevel / 2
    val dmgMod = 4 + spellLevel

    val actions = mutableListOf<String>()
    actions.add("Multiattack. The elemental makes $numAttacks attack${if (numAttacks > 1) "s" else ""}.")
    when (element){
        "Fire" -> actions.add("Slam. Melee Weapon Attack: your spell attack modifier to hit, reach 5 ft., one target. Hit: 1d10 + $dmgMod fire damage.")
        else -> actions.add("Slam. Melee Weapon Attack: your spell attack modifier to hit, reach 5 ft., one target. Hit: 1d10 + $dmgMod bludgeoning damage.")
    }

    return StatBlock(
        name = "Elemental Spirit, $element (${levelToOrdinal(spellLevel)})",
        size = "Medium",
        type = "elemental",
        alignment = "no alignment",
        armorClass = armorClass,
        hitPoints = hitPoints,
        speed = speed,
        str = 18, strMod = "+4",
        dex = 15, dexMod = "+2",
        con = 17, conMod = "+3",
        int = 4, intMod = "-3",
        wis = 10, wisMod = "+0",
        cha = 16, chaMod = "+3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = damageResistances,
        damageImmunities = damageImmunities,
        conditionResistances = null,
        conditionImmunities = "exhaustion, frightened, paralyzed, petrified, poisoned, unconscious",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "Primordial, understands the languages you speak",
        challengeRating = null,
        expValue = null,
        proficiencyBonus = "equals your bonus",
        traits = traits,
        actions = actions,
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "",
        source = "Summon Elemental spell; Tasha's Cauldron of Everything",
        namedEntity = false,
        sortingTag = "Spell effect or summon"
    )
}

fun buildDraconicSpirit(family: String, spellLevel: Int): StatBlock {

    // Hit Points
    val hitPointsValue = 50 + maxOf(0,(spellLevel - 5)) * 10
    val hitPoints = "$hitPointsValue"

    // Armor Class
    val armorClassValue = 14 + spellLevel
    val armorClass = "$armorClassValue (natural armor)"

    // Damage type and resistances based on family
    val damageResistances = when (family) {
        "Chromatic" -> "acid, cold, fire, lightning, poison"
        "Gem" -> "force, necrotic, psychic, radiant, thunder"
        "Metallic" -> "acid, cold, fire, lightning, poison"
        else -> null
    }

    // Multiattack calculation (half spell level, rounded down)
    val numAttacks = spellLevel / 2
    val dmgMod = 4 + spellLevel

    val actions = mutableListOf<String>()
    actions.add("Multiattack. The dragon makes $numAttacks rend attack${if (numAttacks > 1) "s" else ""}, and it uses its breath weapon.")
    actions.add("Rend. Melee Weapon Attack: your spell attack modifier to hit, reach 10 ft., one target. Hit: 1d6 + $dmgMod piercing damage.")
    actions.add("Breath Weapon. The dragon exhales destructive energy in a 30-foot cone. Each creature in that area must make a Dexterity saving throw against your spell save DC. A creature takes 2d6 damage of a type this dragon has resistance to (your choice) on a failed save, or half as much damage on a successful one.")



    return StatBlock(
        name = "Draconic Spirit, $family (${levelToOrdinal(spellLevel)})",
        size = "Large",
        type = "dragon",
        alignment = "neutral",
        armorClass = armorClass,
        hitPoints = hitPoints,
        speed = "Speed 30 ft., fly 60 ft., swim 30 ft.",
        str = 19, strMod = "+4",
        dex = 14, dexMod = "+2",
        con = 17, conMod = "+3",
        int = 10, intMod = "+0",
        wis = 14, wisMod = "+2",
        cha = 14, chaMod = "+2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = damageResistances,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "charmed, frightened, poisoned",
        legendaryResistance = null,
        senses = "blindsight 30 ft., darkvision 60 ft., passive Perception 12",
        languages = "Draconic, understands the languages you speak",
        challengeRating = null,
        expValue = null,
        proficiencyBonus = "equals your bonus",
        traits = listOf(
            "Shared Resistances. When you summon the dragon, choose one of its damage resistances. You have resistance to the chosen damage type until the spell ends"
        ),
        actions = actions,
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "",
        source = "Summon Draconic Spirit spell; Fizban's Treasury of Dragons",
        namedEntity = false,
        sortingTag = "Spell effect or summon"
    )
}

fun buildFiendishSpirit(type: String, spellLevel: Int): StatBlock {
    val baseHP = when (type){
        "Devil" -> 40
        "Demon" -> 50
        "Yugoloth" -> 60
        else -> 0
    }
    val totalHP = baseHP + maxOf(0,(spellLevel - 6)) * 15
    val hitPoints = "$totalHP"

    val armorClassValue = 12 + spellLevel
    val armorClass = "$armorClassValue (natural armor)"

    val speed = when (type) {
        "Demon" -> "40 ft., climb 40 ft."
        "Devil" -> "40 ft., fly 60 ft."
        else -> "40 ft."
    }



    val traits = mutableListOf(
        "Magic Resistance. The fiend has advantage on saving throws against spells and other magical effects."
    )
    when (type) {
        "Devil" -> traits.add("Devil's Sight. Magical darkness doesn’t impede the fiend’s darkvision.")
        "Demon" -> traits.add("Death Throes.  When the fiend drops to 0 hit points or the spell ends, the fiend explodes, and each creature within 10 feet of it must make a Dexterity saving throw against your spell save DC. A creature takes 2d10 + $spellLevel fire damage on a failed save, or half as much damage on a successful one.")
    }

    // Multiattack calculation (half spell level, rounded down)
    val numAttacks = spellLevel / 2
    val dmgMod = 3 + spellLevel

    val actions = mutableListOf<String>()
    actions.add("Multiattack. The fiend makes $numAttacks attack${if (numAttacks > 1) "s" else ""}.")
    when (type){
        "Demon" -> actions.add("Bite. Melee Weapon Attack: your spell attack modifier to hit, reach 5 ft., one target. Hit: 1d12 + $dmgMod necrotic damage.")
        "Devil" -> actions.add("Hurl Flame. Ranged Spell Attack: your spell attack modifier to hit, range 150 ft., one target. Hit: 2d6 + $dmgMod fire damage. If the target is a flammable object that isn’t being worn or carried, it also catches fire.\n")
        "Yugoloth" -> actions.add("Claws. Melee Weapon Attack: your spell attack modifier to hit, reach 5 ft., one target. Hit: 1d8 + $dmgMod slashing damage. Immediately after the attack hits or misses, the fiend can magically teleport up to 30 feet to an unoccupied space it can see.")
    }

    return StatBlock(
        name = "Fiendish Spirit, $type (${levelToOrdinal(spellLevel)})",
        size = "Large",
        type = "fiend",
        alignment = "no alignment",
        armorClass = armorClass,
        hitPoints = hitPoints,
        speed = speed,
        str = 13, strMod = "+1",
        dex = 16, dexMod = "+3",
        con = 15, conMod = "+2",
        int = 10, intMod = "+0",
        wis = 10, wisMod = "+0",
        cha = 16, chaMod = "+3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "fire",
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "Abyssal, Infernal, telepathy 60 ft.",
        challengeRating = null,
        expValue = null,
        proficiencyBonus = "equals your bonus",
        traits = traits,
        actions = actions,
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "",
        source = "Summon Fiend spell; Tasha's Cauldron of Everything",
        namedEntity = false,
        sortingTag = "Spell effect or summon"
    )
}

fun buildBigbysHand(spellLevel: Int): StatBlock {
    // Damage calculations based on spell level
    val clenchedFistDice = 4 + maxOf(0, (spellLevel - 5)) * 2
    val clenchedFistDamage = "${clenchedFistDice}d8 force damage"

    val graspingHandDice = 2 + (spellLevel - 5) * 2
    val graspingHandDamage = "${graspingHandDice}d6 + your spellcasting modifier bludgeoning damage"

    return StatBlock(
        name = "Bigby's Hand (${levelToOrdinal(spellLevel)})",
        size = "Large",
        type = "force",
        alignment = "no alignment",
        armorClass = "20",
        hitPoints = "equal to your hit point maximum",
        speed = "fly 60 ft.",
        str = 26, strMod = "+8",
        dex = 10, dexMod = "+0",
        con = null, conMod = null,
        int = null, intMod = null,
        wis = null, wisMod = null,
        cha = null, chaMod = null,
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = null,
        languages = null,
        challengeRating = null,
        expValue = null,
        proficiencyBonus = null,
        traits = listOf(
            "Object. The hand is an object.",
            "Command. When you cast the spell and as a bonus action on your subsequent turns, you can move the hand up to 60 feet and have it take one bonus action option."
        ),
        actions = listOf(),
        bonusActions = listOf(
            "Clenched Fist. The hand strikes one creature or object within 5 feet of it. Make a melee spell attack for the hand using your game statistics. On a hit, the target takes $clenchedFistDamage.",
            "Forceful Hand. The hand attempts to push a creature within 5 feet of it in a direction you choose. Make a check with the hand’s Strength contested by the Strength (Athletics) check of the target. If the target is Medium or smaller, you have advantage on the check. If you succeed, the hand pushes the target up to 5 feet plus a number of feet equal to five times your spellcasting ability modifier. The hand moves with the target to remain within 5 feet of it.",
            "Grasping Hand. The hand attempts to grapple a Huge or smaller creature within 5 feet of it. You use the hand’s Strength score to resolve the grapple. If the target is Medium or smaller, you have advantage on the check. While the hand is grappling the target, you can use a bonus action to have the hand crush it. When you do so, the target takes $graspingHandDamage.",
            "Interposing Hand. The hand interposes itself between you and a creature you choose until you give the hand a different command. The hand moves to stay between you and the target, providing you with half cover against the target. The target can’t move through the hand’s space if its Strength score is less than or equal to the hand’s Strength score. If its Strength score is higher than the hand’s Strength score, the target can move toward you through the hand’s space, but that space is difficult terrain for the target."
        ),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "",
        source = "Bigby's Hand spell; Player's Handbook",
        namedEntity = false,
        sortingTag = "Spell effect or summon"
    )
}



///////// counter logic for spells
fun pluralize(count: Int, singular: String, plural: String = singular + "s") =
    "$count ${if (count == 1) singular else plural}"

fun calculateSummonCount(spellName: String, slotLevel: Int): List<String> {
    return when (spellName.lowercase()) {

        "animate dead" -> {
            if (slotLevel in 3..9) {
                val count = 1 + maxOf(0, (slotLevel - 3)) * 2
                listOf(
                    "Undead to control: \n" +
                            "Each of the creatures must come from a different corpse (zombie) or pile of bones (skeleton)",
                    "$count undead"
                )
            } else {
                listOf(
                    "Undead to control:",
                    "No undead can be created at this spell slot"
                )
            }
        }

        "animate objects" -> {
            val extraPoints = maxOf(0, slotLevel - 5) * 2
            val totalPoints = 10 + extraPoints

            listOf(
                "Objects to animate:",
                "Total animate points: $totalPoints",
                "Small or smaller object: 1 point each",
                "Medium object: 2 points each",
                "Large object: 4 points each",
                "Huge object: 8 points each"
            )
        }

        "awaken" -> {
            listOf(
                "Creatures to awaken: 1"
            )
        }

        "conjure animals" -> {
            val beast1 = 1
            val beast2 = 2
            val beast4 = 4
            val beast8 = 8
            val multiplier = when (slotLevel) {
                5, 6 -> 2
                7, 8 -> 3
                9 -> 4
                else -> 1
            }
            val totalBeast1 = beast1 * multiplier
            listOf(
                "Fey spirits to summon:",
                pluralize(totalBeast1, "beast") + " of challenge rating 2 or lower OR",
                pluralize(beast2 * multiplier, "beast") + " of challenge rating 1 or lower OR",
                pluralize(beast4 * multiplier, "beast") + " of challenge rating 1/2 or lower OR",
                pluralize(beast8 * multiplier, "beast") + " of challenge rating 1/4 or lower"
            )
        }


        "conjure celestial" -> {
            listOf(
                "Celestials to summon: 1"
            )
        }

        "conjure elemental" -> {
            listOf(
                "Elementals to summon: 1"
            )
        }

        "conjure fey" -> {
            listOf(
                "Fey to summon: 1"
            )
        }

        "conjure minor elementals" -> {
            val elem1 = 1
            val elem2 = 2
            val elem4 = 4
            val elem8 = 8
            val multiplier = when (slotLevel) {
                6, 7 -> 2
                8, 9 -> 3
                else -> 1
            }
            val totalElem1 = elem1 * multiplier
            listOf(
                "Elementals to summon:",
                pluralize(totalElem1, "elemental") + " of challenge rating 2 or lower OR",
                pluralize(elem2 * multiplier, "elemental") + " of challenge rating 1 or lower OR",
                pluralize(elem4 * multiplier, "elemental") + " of challenge rating 1/2 or lower OR",
                pluralize(elem8 * multiplier, "elemental") + " of challenge rating 1/4 or lower"
            )
        }

        "conjure woodland beings" -> {
            val elem1 = 1
            val elem2 = 2
            val elem4 = 4
            val elem8 = 8
            val multiplier = when (slotLevel) {
                6, 7 -> 2
                8, 9 -> 3
                else -> 1
            }
            val totalElem1 = elem1 * multiplier
            listOf(
                "Fey creatures to summon:",
                pluralize(totalElem1, "fey creature") + " of challenge rating 2 or lower OR",
                pluralize(elem2 * multiplier, "fey creature") + " of challenge rating 1 or lower OR",
                pluralize(elem4 * multiplier, "fey creature") + " of challenge rating 1/2 or lower OR",
                pluralize(elem8 * multiplier, "fey creature") + " of challenge rating 1/4 or lower"
            )
        }

        "create undead" -> {
            when (slotLevel) {
                6 -> listOf(
                    "Undead to control:",
                    "3 ghouls"
                )
                7 -> listOf(
                    "Undead to control:",
                    "4 ghouls"
                )
                8 -> listOf(
                    "Undead to control:",
                    "5 ghouls OR 2 ghasts OR 2 wights"
                )
                9 -> listOf(
                    "Undead to control:",
                    "6 ghouls OR 3 ghasts OR 3 wights OR 2 mummies"
                )
                else -> listOf(
                    "Undead to control:",
                    "No undead can be created at this spell slot"
                )
            }
        }

        "dominate beast" -> {
            listOf(
                "Beasts to dominate: 1"
            )
        }

        "dominate monster" -> {
            listOf(
                "Beasts to dominate: 1"
            )
        }

        "flock of familiars" -> {
            val base = 3
            val extra = maxOf(0, slotLevel - 2)
            val total = base + extra
            listOf(
                "Familiars to summon:",
                "$total familiars"
            )
        }

        "giant insect" -> {
            val totalCentipede = 10
            val totalSpider = 3
            val totalWasp = 5
            val totalScorpion = 1

            listOf(
                "Insects to transform:",
                "${pluralize(totalCentipede, "centipede")} OR " +
                "${pluralize(totalSpider, "spider")} OR " +
                "${pluralize(totalWasp, "wasp")} OR " +
                pluralize(totalScorpion, "scorpion")
            )
        }

        "planar binding" -> {
            listOf(
                "Creatures to bind: 1"
            )
        }

        "polymorph" -> {
            listOf(
                "Creatures to transform: 1"
            )
        }

        "summon lesser demons" -> {
            val demon2 = 2
            val demon4 = 4
            val demon8 = 8
            val multiplier = when (slotLevel) {
                6, 7 -> 2
                8, 9 -> 3
                else -> 1
            }

            listOf(
                "Demons to summon:",
                pluralize(demon2 * multiplier, "demon") + " of challenge rating 1 or lower OR",
                pluralize(demon4 * multiplier, "demon") + " of challenge rating 1/2 or lower OR",
                pluralize(demon8 * multiplier, "demon") + " of challenge rating 1/4 or lower"
            )
        }

        "tiny servant" -> {
            val base = 1
            val extra = 2 * maxOf(0, slotLevel - 3)
            val total = base + extra
            listOf(
                "Items to animate:",
                "$total tiny servants"
            )
        }



        else -> listOf("Summons: 1")
    }
}

