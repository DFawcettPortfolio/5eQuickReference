package com.example.wildshapesmountsandfamiliars.ui.screens.creatureType

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import androidx.activity.ComponentActivity
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
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.wildshapesmountsandfamiliars.R
import com.example.wildshapesmountsandfamiliars.ui.screens.FavoriteManager
import com.example.wildshapesmountsandfamiliars.ui.screens.FavoriteToggleButton
import com.example.wildshapesmountsandfamiliars.ui.screens.MenagerieAddButton
import com.example.wildshapesmountsandfamiliars.ui.screens.MenagerieStatBlocks
import com.example.wildshapesmountsandfamiliars.ui.screens.OutlinedText
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlockListItem
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlockView
import com.example.wildshapesmountsandfamiliars.ui.screens.crToDecimal
import com.example.wildshapesmountsandfamiliars.ui.screens.removeFromMenagerieAndSave
import com.example.wildshapesmountsandfamiliars.ui.screens.saveFavorites
import com.example.wildshapesmountsandfamiliars.ui.screens.saveMenagerie
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json


@Composable
fun Custom(
    onNavigateHome: () -> Unit,
    onNavigateToStatblocksByType: () -> Unit,
    onNavigateToCustom: () -> Unit,
    onNavigateToFavorites: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit,
    onNavigateToSearchResults: () -> Unit,
    onNavigateToNotekeeping: () -> Unit,
) {
    CustomCreatureTypeScreen(
        title = "Custom",
        statBlocks = CustomStatBlockRepo.customBlocks,
        onNavigateHome = onNavigateHome,
        onNavigateToCustom = onNavigateToCustom,
        onNavigateToFavorites = onNavigateToFavorites,
        onNavigateToMenagerie = onNavigateToMenagerie,
        onNavigateToInventory = onNavigateToInventory,
        onNavigateToRulesQuickGuide = onNavigateToRulesQuickGuide,
        onNavigateToStatblocksByType = onNavigateToStatblocksByType,
        onNavigateToSearchResults = onNavigateToSearchResults,
        onNavigateToNotekeeping = onNavigateToNotekeeping
    )
}


@Composable
fun CreateCustomStatBlockDialog(
    onDismiss: () -> Unit,
    onCreate: (StatBlock) -> Unit,
    existingBlock: StatBlock? = null,
    onNavigateToCustom: () -> Unit,
    onDelete: (() -> Unit)? = null,
    existingStatBlocks: List<StatBlock> // Pass the current list of statblocks for duplicate check
) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()

    var name by remember { mutableStateOf(existingBlock?.name ?: "") }
    var namedEntity by remember { mutableStateOf(existingBlock?.namedEntity ?: false) }
    var size by remember { mutableStateOf(existingBlock?.size ?: "") }
    var type by remember { mutableStateOf(existingBlock?.type ?: "") }
    var alignment by remember { mutableStateOf(existingBlock?.alignment ?: "") }
    var armorClass by remember { mutableStateOf(existingBlock?.armorClass ?: "") }
    var hitPoints by remember { mutableStateOf(existingBlock?.hitPoints ?: "") }
    var speed by remember { mutableStateOf(existingBlock?.speed ?: "") }
    var str by remember { mutableStateOf(existingBlock?.str?.toString() ?: "") }
    var dex by remember { mutableStateOf(existingBlock?.dex?.toString() ?: "") }
    var con by remember { mutableStateOf(existingBlock?.con?.toString() ?: "") }
    var int by remember { mutableStateOf(existingBlock?.int?.toString() ?: "") }
    var wis by remember { mutableStateOf(existingBlock?.wis?.toString() ?: "") }
    var cha by remember { mutableStateOf(existingBlock?.cha?.toString() ?: "") }
    var skills by remember { mutableStateOf(existingBlock?.skills ?: "") }
    var savingThrows by remember { mutableStateOf(existingBlock?.savingThrows ?: "") }
    var vulnerabilities by remember { mutableStateOf(existingBlock?.vulnerabilities ?: "") }
    var damageResistances by remember { mutableStateOf(existingBlock?.damageResistances ?: "") }
    var damageImmunities by remember { mutableStateOf(existingBlock?.damageImmunities ?: "") }
    var conditionResistances by remember { mutableStateOf(existingBlock?.conditionResistances ?: "") }
    var conditionImmunities by remember { mutableStateOf(existingBlock?.conditionImmunities ?: "") }
    var legendaryResistance by remember { mutableStateOf(existingBlock?.legendaryResistance ?: "") }
    var senses by remember { mutableStateOf(existingBlock?.senses ?: "") }
    var languages by remember { mutableStateOf(existingBlock?.languages ?: "") }
    var challengeRating by remember { mutableStateOf(existingBlock?.challengeRating ?: "") }
    var expValue by remember { mutableStateOf(existingBlock?.expValue ?: "") }
    var proficiencyBonus by remember { mutableStateOf(existingBlock?.proficiencyBonus ?: "") }
    var traits by remember { mutableStateOf(existingBlock?.traits?.joinToString(", ") ?: "") }
    var actions by remember { mutableStateOf(existingBlock?.actions?.joinToString(", ") ?: "") }
    var bonusActions by remember { mutableStateOf(existingBlock?.bonusActions?.joinToString(", ") ?: "") }
    var reactions by remember { mutableStateOf(existingBlock?.reactions?.joinToString(", ") ?: "") }
    var legendaryActions by remember { mutableStateOf(existingBlock?.legendaryActions?.joinToString(", ") ?: "") }
    var description by remember { mutableStateOf(existingBlock?.description ?: "") }
    var source by remember { mutableStateOf(existingBlock?.source ?: "") }
    var tags by remember { mutableStateOf(existingBlock?.tags ?: "") }

    var duplicateNameError by remember { mutableStateOf<String?>(null) }
    var showDuplicateErrorText by remember { mutableStateOf(false) }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(if (existingBlock == null) "Create Custom StatBlock" else "Edit StatBlock")
                if (existingBlock != null) {
                    var showConfirmDialog by remember { mutableStateOf(false) }

                    IconButton(
                        onClick = { showConfirmDialog = true }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Delete,
                            contentDescription = "Delete StatBlock",
                            tint = Color.Red
                        )
                    }

                    if (showConfirmDialog) {
                        AlertDialog(
                            onDismissRequest = { showConfirmDialog = false },
                            title = { Text("Confirm Delete") },
                            text = { Text("Are you sure you want to delete this statblock? This action cannot be undone.") },
                            confirmButton = {
                                TextButton(onClick = {
                                    CustomStatBlockRepo.remove(existingBlock, context)
                                    onDelete?.invoke()
                                    onDismiss()
                                    showConfirmDialog = false
                                    onNavigateToCustom()
                                }) {
                                    Text("Delete")
                                }
                            },
                            dismissButton = {
                                TextButton(onClick = { showConfirmDialog = false }) {
                                    Text("Cancel")
                                }
                            }
                        )
                    }
                }
            }
        },
        text = {
            Column(
                Modifier
                    .fillMaxWidth()
                    .heightIn(max = LocalConfiguration.current.screenHeightDp.dp * 0.75f)
            ) {
                Column(
                    Modifier
                        .weight(1f)
                        .verticalScroll(rememberScrollState())
                        .padding(8.dp)
                ) {
                    OutlinedTextField(value = name, onValueChange = { name = it }, label = { Text("Name") })
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = namedEntity,
                            onCheckedChange = { namedEntity = it },
                            colors = CheckboxDefaults.colors()
                        )
                        Text("Named Entity")
                    }
                    OutlinedTextField(value = size, onValueChange = { size = it }, label = { Text("Size") })
                    OutlinedTextField(value = type, onValueChange = { type = it }, label = { Text("Type") })
                    OutlinedTextField(value = alignment, onValueChange = { alignment = it }, label = { Text("Alignment") })
                    OutlinedTextField(value = armorClass, onValueChange = { armorClass = it }, label = { Text("Armor Class") })
                    OutlinedTextField(value = hitPoints, onValueChange = { hitPoints = it }, label = { Text("Hit Points") })
                    OutlinedTextField(value = speed, onValueChange = { speed = it }, label = { Text("Speed") })

                    OutlinedTextField(value = str, onValueChange = { str = it.filter(Char::isDigit) }, label = { Text("STR") }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
                    OutlinedTextField(value = dex, onValueChange = { dex = it.filter(Char::isDigit) }, label = { Text("DEX") }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
                    OutlinedTextField(value = con, onValueChange = { con = it.filter(Char::isDigit) }, label = { Text("CON") }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
                    OutlinedTextField(value = int, onValueChange = { int = it.filter(Char::isDigit) }, label = { Text("INT") }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
                    OutlinedTextField(value = wis, onValueChange = { wis = it.filter(Char::isDigit) }, label = { Text("WIS") }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
                    OutlinedTextField(value = cha, onValueChange = { cha = it.filter(Char::isDigit) }, label = { Text("CHA") }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))

                    OutlinedTextField(value = skills, onValueChange = { skills = it }, label = { Text("Skills") })
                    OutlinedTextField(value = savingThrows, onValueChange = { savingThrows = it }, label = { Text("Saving Throws") })
                    OutlinedTextField(value = vulnerabilities, onValueChange = { vulnerabilities = it }, label = { Text("Vulnerabilities") })
                    OutlinedTextField(value = damageResistances, onValueChange = { damageResistances = it }, label = { Text("Damage Resistances") })
                    OutlinedTextField(value = damageImmunities, onValueChange = { damageImmunities = it }, label = { Text("Damage Immunities") })
                    OutlinedTextField(value = conditionResistances, onValueChange = { conditionResistances = it }, label = { Text("Condition Resistances") })
                    OutlinedTextField(value = conditionImmunities, onValueChange = { conditionImmunities = it }, label = { Text("Condition Immunities") })
                    OutlinedTextField(value = legendaryResistance, onValueChange = { legendaryResistance = it }, label = { Text("Legendary Resistance") })
                    OutlinedTextField(value = senses, onValueChange = { senses = it }, label = { Text("Senses") })
                    OutlinedTextField(value = languages, onValueChange = { languages = it }, label = { Text("Languages") })
                    OutlinedTextField(value = challengeRating, onValueChange = { challengeRating = it }, label = { Text("Challenge Rating") })
                    OutlinedTextField(value = expValue, onValueChange = { expValue = it }, label = { Text("EXP Value") })
                    OutlinedTextField(value = proficiencyBonus, onValueChange = { proficiencyBonus = it }, label = { Text("Proficiency Bonus") })
                    OutlinedTextField(value = traits, onValueChange = { traits = it }, label = { Text("Traits (comma separated)") })
                    OutlinedTextField(value = actions, onValueChange = { actions = it }, label = { Text("Actions (comma separated)") })
                    OutlinedTextField(value = bonusActions, onValueChange = { bonusActions = it }, label = { Text("Bonus Actions (comma separated)") })
                    OutlinedTextField(value = reactions, onValueChange = { reactions = it }, label = { Text("Reactions (comma separated)") })
                    OutlinedTextField(value = legendaryActions, onValueChange = { legendaryActions = it }, label = { Text("Legendary Actions (comma separated)") })
                    OutlinedTextField(value = description, onValueChange = { description = it }, label = { Text("Description") })
                    OutlinedTextField(value = source, onValueChange = { source = it }, label = { Text("Source") })
                }

                // Fixed bottom area for error + buttons
                Column(
                    Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {


                    Row(
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        if (showDuplicateErrorText && !duplicateNameError.isNullOrEmpty()) {
                            Text(
                                text = duplicateNameError ?: "",
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.fillMaxWidth()
                            )
                        } else {
                            Button(
                                onClick = {
                                    val trimmedName = name.trim()
                                    val nameExists = existingStatBlocks.any { it.name == trimmedName && it != existingBlock }
                                    if (nameExists) {
                                        duplicateNameError = "A statblock with this name already exists."
                                        showDuplicateErrorText = true
                                        coroutineScope.launch {
                                            delay(1000)
                                            showDuplicateErrorText = false
                                        }
                                    } else {
                                        duplicateNameError = null

                                        fun formatModifier(score: Int): String {
                                            val mod = (score - 10) / 2
                                            return if (mod >= 0) "+$mod" else "$mod"
                                        }

                                        val strVal = str.toIntOrNull()
                                        val dexVal = dex.toIntOrNull()
                                        val conVal = con.toIntOrNull()
                                        val intVal = int.toIntOrNull()
                                        val wisVal = wis.toIntOrNull()
                                        val chaVal = cha.toIntOrNull()

                                        val updatedBlock = existingBlock?.copy(
                                            name = trimmedName,
                                            namedEntity = namedEntity,
                                            size = size.ifBlank { null },
                                            type = type.ifBlank { null },
                                            alignment = alignment.ifBlank { null },
                                            armorClass = armorClass.ifBlank { null },
                                            hitPoints = hitPoints.ifBlank { null },
                                            speed = speed.ifBlank { null },
                                            str = strVal,
                                            strMod = strVal?.let { formatModifier(it) },
                                            dex = dexVal,
                                            dexMod = dexVal?.let { formatModifier(it) },
                                            con = conVal,
                                            conMod = conVal?.let { formatModifier(it) },
                                            int = intVal,
                                            intMod = intVal?.let { formatModifier(it) },
                                            wis = wisVal,
                                            wisMod = wisVal?.let { formatModifier(it) },
                                            cha = chaVal,
                                            chaMod = chaVal?.let { formatModifier(it) },
                                            skills = skills.ifBlank { null },
                                            savingThrows = savingThrows.ifBlank { null },
                                            vulnerabilities = vulnerabilities.ifBlank { null },
                                            damageResistances = damageResistances.ifBlank { null },
                                            damageImmunities = damageImmunities.ifBlank { null },
                                            conditionResistances = conditionResistances.ifBlank { null },
                                            conditionImmunities = conditionImmunities.ifBlank { null },
                                            legendaryResistance = legendaryResistance.ifBlank { null },
                                            senses = senses.ifBlank { null },
                                            languages = languages.ifBlank { null },
                                            challengeRating = challengeRating.ifBlank { null },
                                            expValue = expValue.ifBlank { null },
                                            proficiencyBonus = proficiencyBonus.ifBlank { null },
                                            traits = traits.split(",").map { it.trim() }.filter { it.isNotEmpty() },
                                            actions = actions.split(",").map { it.trim() }.filter { it.isNotEmpty() },
                                            bonusActions = bonusActions.split(",").map { it.trim() }.filter { it.isNotEmpty() },
                                            reactions = reactions.split(",").map { it.trim() }.filter { it.isNotEmpty() },
                                            legendaryActions = legendaryActions.split(",").map { it.trim() }.filter { it.isNotEmpty() },
                                            description = description.ifBlank { null },
                                            tags = tags.ifBlank { null }.toString(),
                                            source = "custom",
                                            sortingTag = "custom",
                                        ) ?: StatBlock(
                                            name = trimmedName,
                                            namedEntity = namedEntity,
                                            size = size.ifBlank { null },
                                            type = type.ifBlank { null },
                                            alignment = alignment.ifBlank { null },
                                            armorClass = armorClass.ifBlank { null },
                                            hitPoints = hitPoints.ifBlank { null },
                                            speed = speed.ifBlank { null },
                                            str = strVal,
                                            strMod = strVal?.let { formatModifier(it) },
                                            dex = dexVal,
                                            dexMod = dexVal?.let { formatModifier(it) },
                                            con = conVal,
                                            conMod = conVal?.let { formatModifier(it) },
                                            int = intVal,
                                            intMod = intVal?.let { formatModifier(it) },
                                            wis = wisVal,
                                            wisMod = wisVal?.let { formatModifier(it) },
                                            cha = chaVal,
                                            chaMod = chaVal?.let { formatModifier(it) },
                                            skills = skills.ifBlank { null },
                                            savingThrows = savingThrows.ifBlank { null },
                                            vulnerabilities = vulnerabilities.ifBlank { null },
                                            damageResistances = damageResistances.ifBlank { null },
                                            damageImmunities = damageImmunities.ifBlank { null },
                                            conditionResistances = conditionResistances.ifBlank { null },
                                            conditionImmunities = conditionImmunities.ifBlank { null },
                                            legendaryResistance = legendaryResistance.ifBlank { null },
                                            senses = senses.ifBlank { null },
                                            languages = languages.ifBlank { null },
                                            challengeRating = challengeRating.ifBlank { null },
                                            expValue = expValue.ifBlank { null },
                                            proficiencyBonus = proficiencyBonus.ifBlank { null },
                                            traits = traits.split(",").map { it.trim() }.filter { it.isNotEmpty() },
                                            actions = actions.split(",").map { it.trim() }.filter { it.isNotEmpty() },
                                            bonusActions = bonusActions.split(",").map { it.trim() }.filter { it.isNotEmpty() },
                                            reactions = reactions.split(",").map { it.trim() }.filter { it.isNotEmpty() },
                                            legendaryActions = legendaryActions.split(",").map { it.trim() }.filter { it.isNotEmpty() },
                                            description = description.ifBlank { null },
                                            tags = tags.ifBlank { null }.toString(),
                                            source = "custom",
                                            sortingTag = "custom",
                                        )

                                        onCreate(updatedBlock)

                                    }
                                }
                            ) {
                                Text(if (existingBlock == null) "Add" else "Save Changes")
                            }

                            Spacer(Modifier.width(8.dp))

                            Button(onClick = onDismiss) {
                                Text("Cancel")
                            }
                        }
                    }

                }
            }
        },
        confirmButton = {},
        dismissButton = {}
    )
}






object CustomStatBlockRepo {
    private val json = Json { prettyPrint = true }
    private const val FILE_NAME = "custom_stat_blocks.json"

    private val _customBlocks = mutableStateListOf<StatBlock>()
    val customBlocks: SnapshotStateList<StatBlock> get() = _customBlocks

    internal var initialized = false

    suspend fun clearAll(context: Context) {
        customBlocks.clear()
        save(context)
    }

    fun load(context: Context) {
        if (initialized) return
        try {
            val data = context.openFileInput(FILE_NAME).bufferedReader().readText()
            val loadedBlocks: List<StatBlock> = json.decodeFromString(ListSerializer(StatBlock.serializer()), data)
            _customBlocks.clear()
            _customBlocks.addAll(loadedBlocks)
        } catch (_: Exception) {
        }
        initialized = true
    }

    private fun save(context: Context) {
        val data = json.encodeToString(ListSerializer(StatBlock.serializer()), _customBlocks)
        context.openFileOutput(FILE_NAME, Context.MODE_PRIVATE).use {
            it.write(data.toByteArray())
        }
    }

    fun add(block: StatBlock, context: Context) {
        // Prevent duplicates by comparing unique fields (e.g., name + type + size)
        if (_customBlocks.none { it.name.equals(block.name, ignoreCase = true) }) {
            _customBlocks.add(block)
            save(context)
        }
    }

    suspend fun update(oldBlock: StatBlock, newBlock: StatBlock, context: Context) {
        val index = _customBlocks.indexOf(oldBlock)
        if (index != -1) {
            _customBlocks[index] = newBlock
            save(context)

            // ✅ Update in Menagerie if present
            val menagerieEntry = MenagerieStatBlocks.find { it.statBlock == oldBlock }
            if (menagerieEntry != null) {
                // Preserve ID and displayName for continuity
                val preservedEntry = menagerieEntry.copy(statBlock = newBlock)
                MenagerieStatBlocks[MenagerieStatBlocks.indexOf(menagerieEntry)] = preservedEntry
                saveMenagerie(context) // Saves with updated entry
            }

            // ✅ Update in Favorites if present
            if (FavoriteManager.contains(oldBlock)) {
                val updatedFavorites = FavoriteManager.favorites.map { block ->
                    if (block == oldBlock) newBlock else block
                }
                FavoriteManager.favorites = updatedFavorites
                saveFavorites(context, updatedFavorites)
            }
        }
    }


    fun remove(block: StatBlock, context: Context) {
        _customBlocks.remove(block)
        save(context)
    }
}


// In the custom page file (where your Custom composable is)

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CustomCreatureTypeScreen(
    title: String,
    statBlocks: List<StatBlock>,
    onNavigateHome: () -> Unit,
    onNavigateToCustom: () -> Unit,
    onNavigateToFavorites: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit,
    onNavigateToStatblocksByType: () -> Unit,
    onNavigateToSearchResults: () -> Unit,
    onNavigateToNotekeeping: () -> Unit,

) {
    var selectedStatBlock by remember { mutableStateOf<StatBlock?>(null) }
    var showCreateDialog by remember { mutableStateOf(false) }
    var editingBlock by remember { mutableStateOf<StatBlock?>(null) }
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }

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
        "keen smell", "legendary action", "legendary resistance", "magic resistance", "multiattack",
        "pack tactics", "regeneration", "swarm", "swim speed", "telepathic", "tremorsense", "truesight",
        "water breathing"
    )
    var specialFilter by remember { mutableStateOf("") }
    var specialExpanded by remember { mutableStateOf(false) }

    val min = if (minCR.isBlank()) null else crToDecimal(minCR)
    val max = if (maxCR.isBlank()) null else crToDecimal(maxCR)

    fun StatBlock.matchesFilter(): Boolean {
        val cr = crToDecimal(this.challengeRating.toString())
        val matchesCR = (min == null || cr >= min) && (max == null || cr <= max)
        val matchesSpecial = if (specialFilter.isEmpty()) true
        else tags?.split(",")?.map { it.trim().lowercase() }?.contains(specialFilter.lowercase()) == true
        return matchesCR && matchesSpecial
    }

    val creatureList = statBlocks.filter { it.matchesFilter() }.sortedBy { it.name }

    val filteredItems: List<StatBlockListItem> = buildList {
        addAll(creatureList.map { StatBlockListItem.Block(it) })
    }

    Box(modifier = Modifier.fillMaxSize()) {
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


            Column(
                Modifier
                    .fillMaxSize()
                    .padding(top = 16.dp, start = 16.dp, end = 16.dp) // fixed padding for top & sides
                    .padding(bottom = paddingVals.calculateBottomPadding()) // dynamic bottom padding
            ) {
                // Top Navigation Row
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    val iconModifier = Modifier.size(32.dp)
//                    Icon(
//                        painter = painterResource(id = R.drawable.arrow_back_icon_menu),
//                        contentDescription = "Back One Step",
//                        modifier = Modifier
//                            .size(32.dp)
//                            .clickable {
//                                val block = selectedStatBlock
//                                if (block == null) {
//                                    onNavigateToStatblocksByType()
//                                } else {
//                                    selectedStatBlock = null
//                                }
//                            },
//                        tint = Color.White
//                    )
                    Icon(painterResource(id = R.drawable.home_icon_menu),
                        contentDescription = "Home",
                        modifier = iconModifier.clickable { onNavigateHome() },
                        tint = Color.White)
                    Icon(painterResource(id = R.drawable.rules_icon_menu),
                        contentDescription = "Rules",
                        modifier = iconModifier.clickable { onNavigateToRulesQuickGuide() },
                        tint = Color.White)
                    Icon(
                        painter = painterResource(id = R.drawable.search_icon),
                        contentDescription = "Search",
                        modifier = Modifier
                            .size(32.dp)
                            .clickable { onNavigateToSearchResults() },
                        tint = Color.White
                    )
                    Icon(painterResource(id = R.drawable.favorites_icon_menu),
                        contentDescription = "Favorites",
                        modifier = iconModifier.clickable { onNavigateToFavorites() },
                        tint = Color.White)
                    Icon(painterResource(id = R.drawable.menagerie_icon_menu),
                        contentDescription = "Menagerie",
                        modifier = iconModifier.clickable { onNavigateToMenagerie() },
                        tint = Color.White)
                    Icon(painterResource(id = R.drawable.inventory_icon_menu),
                        contentDescription = "Inventory",
                        modifier = iconModifier.clickable { onNavigateToInventory() },
                        tint = Color.White)
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
                Text(title, style = MaterialTheme.typography.headlineSmall)
                Spacer(Modifier.height(8.dp))

                if (selectedStatBlock == null) {
                    // Filter bar like CreatureTypeScreen
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

                    Spacer(Modifier.height(16.dp))

                    if (filteredItems.isEmpty()) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                                .padding(16.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("No custom statblocks yet", style = MaterialTheme.typography.bodyLarge)
                        }
                    } else {
                        LazyColumn(modifier = Modifier.weight(1f)) {
                            items(filteredItems) { item ->
                                when (item) {
                                    is StatBlockListItem.Block -> {
                                        Text(
                                            text = item.statBlock.name ?: "Unnamed",
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clickable { selectedStatBlock = item.statBlock }
                                                .padding(bottom = 32.dp)
                                        )
                                    }
                                    is StatBlockListItem.Header -> {
                                        Text(
                                            text = item.title,
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(vertical = 8.dp),
                                            style = MaterialTheme.typography.titleLarge
                                        )
                                    }
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
                        StatBlockView(
                            statBlock = selectedStatBlock!!,
                            onEditClick = {
                                editingBlock = selectedStatBlock
                                showCreateDialog = true
                            }
                        )
                    }
                }

                Spacer(Modifier.height(8.dp))

                Row(modifier = Modifier.fillMaxWidth() .padding(bottom = 20.dp), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    if (selectedStatBlock == null ) {
                        Button(onClick = {
                            editingBlock = null
                            showCreateDialog = true
                        }) {
                            OutlinedText(
                                text = "Add Custom Statblock",
                                color = Color.White,
                                outlineColor = Color.Black,
                                outlineWidth = 0.8.dp,
                                style = MaterialTheme.typography.labelLarge
                            )
                        }
                    }

                    if (selectedStatBlock != null && statBlocks.contains(selectedStatBlock)) {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Button(
                                onClick = {
                                    coroutineScope.launch {
                                        applyHalfDragonTemplateToSelected(
                                            selectedStatBlock!!,
                                            context,
                                            coroutineScope,
                                            snackbarHostState,
                                            onNavigateToCustom
                                        )
                                    }
                                },
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                OutlinedText(
                                    text = "Apply half-Dragon Template",
                                    color = Color.White,
                                    outlineColor = Color.Black,
                                    outlineWidth = 0.8.dp,
                                    style = MaterialTheme.typography.labelLarge
                                )
                            }

                            Spacer(modifier = Modifier.height(8.dp))


                            Button(
                                onClick = {
                                    coroutineScope.launch {
                                        deleteAllTemplatedStatblocks(
                                            context,
                                            coroutineScope,
                                            snackbarHostState,
                                            onNavigateToCustom,
                                            selectedStatBlock!!
                                        )
                                    }
                                },
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                val currentName = selectedStatBlock!!.name
                                val baseName = extractBaseName(currentName.toString())
                                OutlinedText(
                                    text = "Delete Templated Statblocks for $baseName",
                                    color = Color.White,
                                    outlineColor = Color.Black,
                                    outlineWidth = 0.8.dp,
                                    style = MaterialTheme.typography.labelLarge
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    var duplicateNameError by remember { mutableStateOf<String?>(null) }
    if (showCreateDialog) {
        CreateCustomStatBlockDialog(
            existingBlock = editingBlock,
            onDismiss = {
                showCreateDialog = false
                editingBlock = null
            },
            onCreate = { newBlock ->
                coroutineScope.launch {
                    if (statBlocks.any { it.name == newBlock.name && it != editingBlock }) {
                        duplicateNameError = "A statblock with this name already exists."
                    } else {
                        duplicateNameError = null
                        if (editingBlock == null) {
                            CustomStatBlockRepo.add(newBlock, context)
                        } else {
                            CustomStatBlockRepo.update(editingBlock!!, newBlock, context)
                        }
                        showCreateDialog = false
                        editingBlock = null
                        selectedStatBlock = newBlock
                    }
                }
            },
            onDelete = {
                coroutineScope.launch {
                    editingBlock?.let { blockToDelete ->
                        CustomStatBlockRepo.remove(blockToDelete, context)
                        val menagerieEntriesToRemove =
                            MenagerieStatBlocks.filter { it.statBlock == blockToDelete }
                        menagerieEntriesToRemove.forEach { entry ->
                            removeFromMenagerieAndSave(context, entry)
                        }
                        val updatedFavorites =
                            FavoriteManager.favorites.filter { it != blockToDelete }
                        saveFavorites(context, updatedFavorites)
                        FavoriteManager.favorites = updatedFavorites
                        if (selectedStatBlock == blockToDelete) {
                            selectedStatBlock = null
                        }
                        showCreateDialog = false
                        editingBlock = null
                        onNavigateToCustom()
                        snackbarHostState.showSnackbar("Statblock deleted")
                    }
                }
            },
            onNavigateToCustom = onNavigateToCustom,
            existingStatBlocks = statBlocks
        )
    }
}

private suspend fun applyHalfDragonTemplateToSelected(
    baseBlock: StatBlock,
    context: Context,
    coroutineScope: CoroutineScope,
    snackbarHostState: SnackbarHostState,
    onNavigateToCustom: () -> Unit
) {
    Log.d("TemplateDebug", "Applying Half-Dragon template to ${baseBlock.name}")

    val crValue = baseBlock.challengeRating?.toDoubleOrNull() ?: 0.0
    val size = baseBlock.size ?: ""

    val validSizeAndCR = when {
        size.equals("huge", ignoreCase = true) && crValue >= 7 -> true
        size.equals("gargantuan", ignoreCase = true) && crValue >= 8 -> true
        crValue >= 2 -> true
        else -> false
    }

    if (!validSizeAndCR) {
        coroutineScope.launch {
            snackbarHostState.showSnackbar(
                "Half-Dragon template requires challenge rating ≥ 2 for Medium or smaller creatures,\n" +
                        "≥ 7 for Huge, or ≥ 8 for Gargantuan size."
            )
        }
        return
    }

    try {
        val dragonColors = listOf(
            "Black", "Blue", "Brass", "Bronze", "Copper",
            "Gold", "Green", "Red", "Silver", "White"
        )
        val generatedBlocks = mutableListOf<StatBlock>()

        for (color in dragonColors) {
            val newBlocks = applyHalfDragonTemplate(listOf(baseBlock), color)
            if (newBlocks.isEmpty()) {
                Log.d("TemplateDebug", "Half-Dragon template application returned no variants for color $color")
                continue
            }
            val newBlock = newBlocks.first()
            val renamedBlock = newBlock.copy(name = "Half-$color Dragon ${baseBlock.name}")
            CustomStatBlockRepo.add(renamedBlock, context)
            generatedBlocks.add(renamedBlock)
        }

        if (generatedBlocks.isEmpty()) {
            coroutineScope.launch {
                snackbarHostState.showSnackbar("Failed to create any Half-Dragon variants for ${baseBlock.name}")
            }
            return
        }

        coroutineScope.launch {
            snackbarHostState.showSnackbar(
                "Created ${generatedBlocks.size} Half-Dragon variants for ${baseBlock.name}"
            )
            onNavigateToCustom()
        }
    } catch (e: Exception) {
        coroutineScope.launch {
            snackbarHostState.showSnackbar("Error creating Half-Dragon: ${e.message}")
        }
    }
}



// Helper function to get base name from current statblock's name
private fun extractBaseName(statName: String): String {
    return when {
        statName.startsWith("Half-") -> {
            // Pattern: "Half-<Color> Dragon <BaseName>"
            // Extract the base name after the last space
            statName.substringAfterLast(" ")
        }

        else -> statName.trim()
    }
}

private suspend fun deleteAllTemplatedStatblocks(
    context: Context,
    coroutineScope: CoroutineScope,
    snackbarHostState: SnackbarHostState,
    onNavigateToCustom: () -> Unit,
    currentStatBlock: StatBlock
) {
    val currentName = currentStatBlock.name ?: return
    val baseName = extractBaseName(currentName)

    Log.d("TemplateDebug", "Deleting all templated statblocks linked to base name: $baseName")

    val templatedBlocks = CustomStatBlockRepo.customBlocks.filter { block ->
        val blockName = block.name ?: ""
        val tags = block.tags ?: ""

        // Keep only templates linked to baseName:
        (blockName.contains(baseName) &&
                ((blockName.startsWith("Half-") && tags.contains("half-dragon"))))
    }

    if (templatedBlocks.isEmpty()) {
        coroutineScope.launch {
            snackbarHostState.showSnackbar("No templated statblocks found for $baseName")
        }
        return
    }

    templatedBlocks.forEach { block ->
        CustomStatBlockRepo.remove(block, context)
    }

    coroutineScope.launch {
        snackbarHostState.showSnackbar("Deleted ${templatedBlocks.size} templated statblocks linked to $baseName")
        onNavigateToCustom()
    }
}


@Composable
fun HandleBack(selectedStatBlock: StatBlock?, onClearBlock: () -> Unit) {
    val context = LocalContext.current
    val activity = context as? ComponentActivity // cast to ComponentActivity

    BackHandler(enabled = true) {
        if (selectedStatBlock != null) {
            onClearBlock()  // clear your selected stat block
        } else {
            activity?.onBackPressedDispatcher?.onBackPressed() // works now
        }
    }
}
