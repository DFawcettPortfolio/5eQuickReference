package com.example.wildshapesmountsandfamiliars.ui.screens

import android.content.Context
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.twotone.Delete
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.datastore.preferences.core.edit
import com.example.wildshapesmountsandfamiliars.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

/*
When loading data from storage, read a list of EditableMenagerieEntryPersist from JSON.

Convert that into a list of MenagerieEntry (immutable base records) for in-memory collection.

Then, for UI display and editing, wrap those in EditableMenagerieEntry objects that add mutable Compose state.

When saving, convert the EditableMenagerieEntry back into EditableMenagerieEntryPersist for serialization.
*/
@Serializable
data class SavedMenagerieEntryForStorage(
    val id: Int,
    val statBlock: StatBlock, // ← store the full stat block!
    val displayName: String,  // Persist displayName with number suffix
    val currentHP: String,
    val tempHP: String,
    val maxHP: String,
    val initiative: String = "",
)

// Menagerie supporting classes and functions
data class BaseMenagerieEntry(
    val id: Int,
    val statBlock: StatBlock,
    val displayName: String
)

// Editable wrapper to hold mutable state per MenagerieEntry for UI editing
data class EditableMenagerieEntry(
    val id: Int,
    val statBlock: StatBlock,
    val displayName: String,
    val currentHP: MutableState<String>,
    val tempHP: MutableState<String>,
    val maxHP: MutableState<String>,
    val initiative: MutableState<String>,
    val name: MutableState<String>,
    val namedEntity: MutableState<Boolean>,
    val size: MutableState<String>,
    val type: MutableState<String>,
    val alignment: MutableState<String>,
    val armorClass: MutableState<String>,
    val hitPoints: MutableState<String>,
    val speed: MutableState<String>,
    val str: MutableState<String>,
    val dex: MutableState<String>,
    val con: MutableState<String>,
    val int: MutableState<String>,
    val wis: MutableState<String>,
    val cha: MutableState<String>,
    val skills: MutableState<String>,
    val savingThrows: MutableState<String>,
    val vulnerabilities: MutableState<String>,
    val damageResistances: MutableState<String>,
    val damageImmunities: MutableState<String>,
    val conditionResistances: MutableState<String>,
    val conditionImmunities: MutableState<String>,
    val legendaryResistance: MutableState<String>,
    val senses: MutableState<String>,
    val languages: MutableState<String>,
    val challengeRating: MutableState<String>,
    val expValue: MutableState<String>,
    val proficiencyBonus: MutableState<String>,
    val traits: MutableState<String>,
    val actions: MutableState<String>,
    val bonusActions: MutableState<String>,
    val reactions: MutableState<String>,
    val description: MutableState<String>,
    val legendaryActions: MutableState<String>,
    val source: MutableState<String>,
    val tags: MutableState<String>,
    val sortingTag: MutableState<String>
)

object MenagerieManager {
    // Tracks all base names currently in the menagerie (reactive)
    var activeNames by mutableStateOf<Set<String>>(emptySet())
        private set

    /**
     * Load menagerie data from DataStore on app startup.
     */
    suspend fun load(context: Context) {
        loadPersistedEntriesFlow(context).collect { entries ->
            // 1. Clear current list and repopulate from persisted entries
            MenagerieStatBlocks.clear()
            MenagerieStatBlocks.addAll(
                entries.map { persistEntry ->
                    BaseMenagerieEntry(
                        id = persistEntry.id,
                        statBlock = persistEntry.statBlock,
                        displayName = persistEntry.displayName
                    )
                }
            )

            // 2. Update ID counter so new entries don't reuse IDs
            menagerieIdCounter = (entries.maxOfOrNull { it.id } ?: 0) + 1

            // 3. Update activeNames for UI purposes
            activeNames = entries.map { extractBaseName(it.displayName) }.toSet()
        }
    }

    /**
     * Flow to load persisted entries from DataStore.
     */
    fun loadPersistedEntriesFlow(context: Context): Flow<List<SavedMenagerieEntryForStorage>> {
        return context.dataStore.data.map { prefs ->
            val jsonString = prefs[MENAGERIE_KEY]
            if (jsonString.isNullOrBlank()) emptyList()
            else {
                try {
                    json.decodeFromString(jsonString)
                } catch (_: Exception) {
                    emptyList()
                }
            }
        }
    }

    /**
     * Updates the active names from the current in-memory menagerie list.
     * Called whenever add/remove happens.
     */
    fun updateFromCurrentMenagerie() {
        activeNames = MenagerieStatBlocks.map { extractBaseName(it.displayName) }.toSet()
    }

    /**
     * Check if a statBlock's base name exists in the menagerie.
     */
    fun contains(block: StatBlock): Boolean {
        val baseName = block.name ?: "Unnamed"
        return activeNames.contains(baseName)
    }

    /**
     * Remove the numeric suffix from display names ("Lizard 1" → "Lizard").
     */
    private fun extractBaseName(displayName: String): String {
        return displayName.replace(Regex("\\s+\\d+$"), "") // Goblin 2 → Goblin
            .replace(Regex("\\s*\\(\\d+\\)$"), "")         // Jim (2) → Jim
    }
}// END MENAGERIE MANAGER


// Helpers to extract the numeric HP value from hitPoints string (e.g. "59 (7d10 + 21)" -> "59")
private fun extractHpValue(hitPoints: String?): String {
    if (hitPoints == null) return ""
    val hpMatch = Regex("(\\d+)").find(hitPoints)
    return hpMatch?.value ?: ""
}

// Helpers to format HP string maintaining original dice info, or just numeric if unknown
private fun formatHp(newHpValue: String, originalHpString: String?): String {
    if (originalHpString == null) return newHpValue
    val dicePart = Regex("\\(.*\\)").find(originalHpString)?.value ?: ""
    return if (newHpValue.isBlank()) {
        originalHpString
    } else {
        "$newHpValue $dicePart".trim()
    }
}

// Save entries to DataStore
suspend fun saveEntries(context: Context, entries: List<EditableMenagerieEntry>) {
    val persistList = entries.map {
        SavedMenagerieEntryForStorage(
            id = it.id,
            statBlock = it.statBlock,
            displayName = it.displayName,  // Save displayName here
            currentHP = it.currentHP.value,
            tempHP = it.tempHP.value,
            maxHP = it.maxHP.value,
            initiative = it.initiative.value,
        )
    }

    val jsonString = json.encodeToString(persistList)
    context.dataStore.edit { prefs ->
        prefs[MENAGERIE_KEY] = jsonString
    }
}

// Load entries from DataStore
suspend fun loadPersistedEntries(context: Context): List<SavedMenagerieEntryForStorage> {
    val prefs = context.dataStore.data.first()
    val jsonString = prefs[MENAGERIE_KEY]
    return if (jsonString.isNullOrBlank()) emptyList()
    else {
        try {
            json.decodeFromString(jsonString)
        } catch (_: Exception) {
            emptyList()
        }
    }
}

/**
 * Returns the next available number for a given baseName in the menagerie,
 * updating the entityCounters map accordingly.
 *
 * This ensures numbering is strictly increasing and gaps from removals
 * are not reused.
 */
fun menagerieCountChecker(baseName: String, useParens: Boolean = false): Pair<String, Int> {
    // If entityCounters doesn't have an entry yet, compute from MenagerieStatBlocks
    if (!entityCounters.containsKey(baseName)) {
        val maxExisting = MenagerieStatBlocks
            .filter { it.displayName == baseName || it.displayName.startsWith(baseName) }
            .mapNotNull { extractNumberFromDisplayName(it.displayName, baseName) }
            .maxOrNull() ?: 0

        entityCounters[baseName] = maxExisting
    }

    // Increment from the last known number
    val lastNumber = entityCounters[baseName] ?: 0
    val nextNumber = lastNumber + 1
    entityCounters[baseName] = nextNumber

    // Format display name depending on style:
    // - useParens = true -> "BaseName (n)" with first copy "BaseName"
    // - useParens = false -> "BaseName n"
    val displayName = if (useParens) {
        when (nextNumber) {
            1 -> baseName
            else -> "$baseName ($nextNumber)"
        }
    } else {
        "$baseName $nextNumber"
    }

    return Pair(displayName, nextNumber)
}
fun extractNumberFromDisplayName(displayName: String, baseName: String): Int? {
    // Check for parens style: "Jim (2)"
    Regex("""\((\d+)\)$""").find(displayName)?.groups?.get(1)?.value?.toIntOrNull()?.let {
        return it
    }
    // Check for space-number style: "Goblin 3"
    Regex("""\s(\d+)$""").find(displayName)?.groups?.get(1)?.value?.toIntOrNull()?.let {
        return it
    }
    // If displayName exactly equals baseName, return 0 (first entry)
    return if (displayName == baseName) 0 else null
}


fun addToMenagerie(statBlock: StatBlock): BaseMenagerieEntry {
    val baseName = statBlock.name ?: "Unnamed"
    val (displayName, _) = menagerieCountChecker(baseName, useParens = false)

    val entry = BaseMenagerieEntry(
        id = menagerieIdCounter++,
        statBlock = statBlock,
        displayName = displayName
    )
    MenagerieStatBlocks.add(entry)
    return entry
}

fun addNamedEntityToMenagerie(statBlock: StatBlock): BaseMenagerieEntry {
    val baseName = statBlock.name ?: "Unnamed"
    val (displayName, _) = menagerieCountChecker(baseName, useParens = true)

    val entry = BaseMenagerieEntry(
        id = menagerieIdCounter++,
        statBlock = statBlock,
        displayName = displayName
    )
    MenagerieStatBlocks.add(entry)
    return entry
}

fun removeFromMenagerie(entry: BaseMenagerieEntry) {
    MenagerieStatBlocks.remove(entry)
    val baseName = entry.statBlock.name ?: "Unnamed"

    val stillExists = MenagerieStatBlocks.any {
        it.displayName == baseName || it.displayName.startsWith("$baseName ") || it.displayName.startsWith("$baseName (")
    }

    if (!stillExists) {
        entityCounters.remove(baseName) // Reset counter only on full removal
    }
    MenagerieManager.updateFromCurrentMenagerie()
}

// Suspend helpers to save Menagerie after modifications
suspend fun saveMenagerie(context: Context) {
    val persistedList = loadPersistedEntries(context) // ✅ Load saved values

    val editableEntries = MenagerieStatBlocks.map { menagerieEntry ->
        val persisted = persistedList.find { it.id == menagerieEntry.id }

        EditableMenagerieEntry(
            id = menagerieEntry.id,
            statBlock = menagerieEntry.statBlock,
            displayName = menagerieEntry.displayName,
            currentHP = mutableStateOf(persisted?.currentHP ?: extractHpValue(menagerieEntry.statBlock.hitPoints)),
            tempHP = mutableStateOf(persisted?.tempHP ?: "0"), // ✅ Use saved tempHP
            maxHP = mutableStateOf(persisted?.maxHP ?: extractHpValue(menagerieEntry.statBlock.hitPoints)),
            initiative = mutableStateOf(persisted?.initiative ?: ""),
                    name = mutableStateOf(persisted?.statBlock?.name ?: ""),
                    namedEntity = mutableStateOf(persisted?.statBlock?.namedEntity ?: false),
                    size = mutableStateOf(persisted?.statBlock?.size ?: ""),
                    type = mutableStateOf(persisted?.statBlock?.type ?: ""),
                    alignment = mutableStateOf(persisted?.statBlock?.alignment ?: ""),
                    armorClass = mutableStateOf(persisted?.statBlock?.armorClass ?: ""),
                    hitPoints = mutableStateOf(persisted?.statBlock?.hitPoints ?: ""),
                    speed = mutableStateOf(persisted?.statBlock?.speed ?: ""),
                    str = mutableStateOf(persisted?.statBlock?.str?.toString() ?: ""),
                    dex = mutableStateOf(persisted?.statBlock?.dex?.toString() ?: ""),
                    con = mutableStateOf(persisted?.statBlock?.con?.toString() ?: ""),
                    int = mutableStateOf(persisted?.statBlock?.int?.toString() ?: ""),
                    wis = mutableStateOf(persisted?.statBlock?.wis?.toString() ?: ""),
                    cha = mutableStateOf(persisted?.statBlock?.cha?.toString() ?: ""),
                    skills = mutableStateOf(persisted?.statBlock?.skills ?: ""),
                    savingThrows = mutableStateOf(persisted?.statBlock?.savingThrows ?: ""),
                    vulnerabilities = mutableStateOf(persisted?.statBlock?.vulnerabilities ?: ""),
                    damageResistances = mutableStateOf(persisted?.statBlock?.damageResistances ?: ""),
                    damageImmunities = mutableStateOf(persisted?.statBlock?.damageImmunities ?: ""),
                    conditionResistances = mutableStateOf(persisted?.statBlock?.conditionResistances ?: ""),
                    conditionImmunities = mutableStateOf(persisted?.statBlock?.conditionImmunities ?: ""),
                    legendaryResistance = mutableStateOf(persisted?.statBlock?.legendaryResistance ?: ""),
                    senses = mutableStateOf(persisted?.statBlock?.senses ?: ""),
                    languages = mutableStateOf(persisted?.statBlock?.languages ?: ""),
                    challengeRating = mutableStateOf(persisted?.statBlock?.challengeRating ?: ""),
                    expValue = mutableStateOf(persisted?.statBlock?.expValue ?: ""),
                    proficiencyBonus = mutableStateOf(persisted?.statBlock?.proficiencyBonus ?: ""),
                    traits = mutableStateOf(persisted?.statBlock?.traits?.joinToString(", ") ?: ""),
                    actions = mutableStateOf(persisted?.statBlock?.actions?.joinToString(", ") ?: ""),
                    bonusActions = mutableStateOf(persisted?.statBlock?.bonusActions?.joinToString(", ") ?: ""),
                    reactions = mutableStateOf(persisted?.statBlock?.reactions?.joinToString(", ") ?: ""),
                    legendaryActions = mutableStateOf(persisted?.statBlock?.legendaryActions?.joinToString(", ") ?: ""),
                    description = mutableStateOf(persisted?.statBlock?.description ?: ""),
                    source = mutableStateOf(persisted?.statBlock?.source ?: ""),
                    tags = mutableStateOf(persisted?.statBlock?.tags ?: ""),
                    sortingTag = mutableStateOf(persisted?.statBlock?.sortingTag ?: ""),

        )
    }

    saveEntries(context, editableEntries)
}


suspend fun addToMenagerieAndSave(context: Context, statBlock: StatBlock) {
    // 1. Add the new entry to the in-memory list
    val entry = if (statBlock.namedEntity == true) {
        addNamedEntityToMenagerie(statBlock)
    } else {
        addToMenagerie(statBlock)
    }

    // 2. Save the entire current menagerie list from MenagerieStatBlocks
    saveMenagerie(context)
}

suspend fun removeFromMenagerieAndSave(context: Context, entry: BaseMenagerieEntry) {
    removeFromMenagerie(entry)
    saveMenagerie(context)
}


@Composable
fun MenagerieEntryEditorDialog(
    existingEntry: EditableMenagerieEntry? = null,
    onDismiss: () -> Unit,
    onSave: (EditableMenagerieEntry) -> Unit,
    onDelete: (() -> Unit)? = null,
    onNavigateToMenagerie: () -> Unit
) {
    val context = LocalContext.current

    var name by remember { mutableStateOf(existingEntry?.statBlock?.name ?: "") }
    var namedEntity by remember { mutableStateOf(existingEntry?.statBlock?.namedEntity ?: false) }
    var size by remember { mutableStateOf(existingEntry?.statBlock?.size ?: "") }
    var type by remember { mutableStateOf(existingEntry?.statBlock?.type ?: "") }
    var alignment by remember { mutableStateOf(existingEntry?.statBlock?.alignment ?: "") }
    var armorClass by remember { mutableStateOf(existingEntry?.statBlock?.armorClass ?: "") }
    var hitPoints by remember { mutableStateOf(existingEntry?.statBlock?.hitPoints ?: "") }
    var speed by remember { mutableStateOf(existingEntry?.statBlock?.speed ?: "") }

    var str by remember { mutableStateOf(existingEntry?.statBlock?.str?.toString() ?: "") }
    var dex by remember { mutableStateOf(existingEntry?.statBlock?.dex?.toString() ?: "") }
    var con by remember { mutableStateOf(existingEntry?.statBlock?.con?.toString() ?: "") }
    var int by remember { mutableStateOf(existingEntry?.statBlock?.int?.toString() ?: "") }
    var wis by remember { mutableStateOf(existingEntry?.statBlock?.wis?.toString() ?: "") }
    var cha by remember { mutableStateOf(existingEntry?.statBlock?.cha?.toString() ?: "") }

    var skills by remember { mutableStateOf(existingEntry?.statBlock?.skills ?: "") }
    var savingThrows by remember { mutableStateOf(existingEntry?.statBlock?.savingThrows ?: "") }
    var vulnerabilities by remember { mutableStateOf(existingEntry?.statBlock?.vulnerabilities ?: "") }
    var damageResistances by remember { mutableStateOf(existingEntry?.statBlock?.damageResistances ?: "") }
    var damageImmunities by remember { mutableStateOf(existingEntry?.statBlock?.damageImmunities ?: "") }
    var conditionResistances by remember { mutableStateOf(existingEntry?.statBlock?.conditionResistances ?: "") }
    var conditionImmunities by remember { mutableStateOf(existingEntry?.statBlock?.conditionImmunities ?: "") }
    var legendaryResistance by remember { mutableStateOf(existingEntry?.statBlock?.legendaryResistance ?: "") }
    var senses by remember { mutableStateOf(existingEntry?.statBlock?.senses ?: "") }
    var languages by remember { mutableStateOf(existingEntry?.statBlock?.languages ?: "") }
    var challengeRating by remember { mutableStateOf(existingEntry?.statBlock?.challengeRating ?: "") }
    var expValue by remember { mutableStateOf(existingEntry?.statBlock?.expValue ?: "") }
    var proficiencyBonus by remember { mutableStateOf(existingEntry?.statBlock?.proficiencyBonus ?: "") }
    var traits by remember { mutableStateOf(existingEntry?.statBlock?.traits?.joinToString(", ") ?: "") }
    var actions by remember { mutableStateOf(existingEntry?.statBlock?.actions?.joinToString(", ") ?: "") }
    var bonusActions by remember { mutableStateOf(existingEntry?.statBlock?.bonusActions?.joinToString(", ") ?: "") }
    var reactions by remember { mutableStateOf(existingEntry?.statBlock?.reactions?.joinToString(", ") ?: "") }
    var legendaryActions by remember { mutableStateOf(existingEntry?.statBlock?.legendaryActions?.joinToString(", ") ?: "") }
    var description by remember { mutableStateOf(existingEntry?.statBlock?.description ?: "") }
    var source by remember { mutableStateOf(existingEntry?.statBlock?.source ?: "") }
    var tags by remember { mutableStateOf(existingEntry?.statBlock?.tags ?: "") }
    var sortingTag by remember { mutableStateOf(existingEntry?.statBlock?.sortingTag ?: "") }

    // Menagerie-specific
    var currentHP by remember { mutableStateOf(existingEntry?.currentHP?.value?.toString() ?: extractHpValue(hitPoints).toString()) }
    var tempHP by remember { mutableStateOf(existingEntry?.tempHP?.value ?: "0") }
    var maxHP by remember { mutableStateOf(existingEntry?.maxHP?.value?.toString() ?: extractHpValue(hitPoints).toString()) }
    var initiative by remember { mutableStateOf(existingEntry?.initiative?.value ?: "") }

    var showConfirmDeleteDialog by remember { mutableStateOf(false) }


    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(if (existingEntry == null) "Create Menagerie Entry" else "Edit Menagerie Entry")

                if (existingEntry != null) {
                    IconButton(onClick = { showConfirmDeleteDialog = true }) {
                        Icon(Icons.Filled.Delete, contentDescription = "Delete Entry", tint = Color.Red)
                    }
                }
            }
        },
        text = {
            Column(
                Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(8.dp)
            ) {
                fun digitsFilter(it: String) = it.filter(Char::isDigit)
                // The same OutlinedTextFields and Checkboxes for all above variables,
                // filtering digits for ability scores as in your example.
                OutlinedTextField(value = name, onValueChange = { name = it }, label = { Text("Name") })
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(checked = namedEntity, onCheckedChange = { namedEntity = it })
                    Text("Named Entity")
                }
                // Menagerie-specific fields
                OutlinedTextField(value = currentHP, onValueChange = { currentHP = digitsFilter(it) }, label = { Text("Current HP") }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
                OutlinedTextField(value = tempHP, onValueChange = { tempHP = digitsFilter(it) }, label = { Text("Temporary HP") }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
                OutlinedTextField(value = maxHP, onValueChange = { maxHP = digitsFilter(it) }, label = { Text("Max HP") }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
                OutlinedTextField(value = initiative, onValueChange = { initiative = it }, label = { Text("Initiative") }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))

                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(value = size, onValueChange = { size = it }, label = { Text("Size") })
                OutlinedTextField(value = type, onValueChange = { type = it }, label = { Text("Type") })
                OutlinedTextField(value = alignment, onValueChange = { alignment = it }, label = { Text("Alignment") })
                OutlinedTextField(value = armorClass, onValueChange = { armorClass = it }, label = { Text("Armor Class") })
                OutlinedTextField(value = hitPoints, onValueChange = { hitPoints = it }, label = { Text("Hit Points") })
                OutlinedTextField(value = speed, onValueChange = { speed = it }, label = { Text("Speed") })



                OutlinedTextField(value = str, onValueChange = { str = digitsFilter(it) }, label = { Text("STR") }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
                OutlinedTextField(value = dex, onValueChange = { dex = digitsFilter(it) }, label = { Text("DEX") }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
                OutlinedTextField(value = con, onValueChange = { con = digitsFilter(it) }, label = { Text("CON") }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
                OutlinedTextField(value = int, onValueChange = { int = digitsFilter(it) }, label = { Text("INT") }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
                OutlinedTextField(value = wis, onValueChange = { wis = digitsFilter(it) }, label = { Text("WIS") }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
                OutlinedTextField(value = cha, onValueChange = { cha = digitsFilter(it) }, label = { Text("CHA") }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))

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
                OutlinedTextField(value = sortingTag, onValueChange = { sortingTag = it }, label = { Text("Sorting Tag") })


            }
        },
        confirmButton = {
            Button(onClick = {
                if (name.isNotBlank()) {
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

                    val updatedStatBlock = existingEntry?.statBlock?.copy(
                        name = name.trim(),
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
                        source = source.ifBlank { null },
                        tags = tags.ifBlank { null },
                        sortingTag = sortingTag.ifBlank { null }
                    ) ?: StatBlock(
                        name = name.trim(),
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
                        source = source.ifBlank { null },
                        tags = tags.ifBlank { null },
                        sortingTag = sortingTag.ifBlank { null }
                    )

                    val updatedEntry = if (existingEntry != null) {
                        existingEntry.copy(
                            statBlock = updatedStatBlock,
                            currentHP = mutableStateOf(currentHP),
                            tempHP = mutableStateOf(tempHP),
                            maxHP = mutableStateOf(maxHP),
                            initiative = mutableStateOf(initiative),
                        )
                    } else {
                        EditableMenagerieEntry(
                            id = 0,
                            statBlock = updatedStatBlock,
                            displayName = updatedStatBlock.name ?: "Unnamed",
                            currentHP = mutableStateOf(currentHP),
                            tempHP = mutableStateOf(tempHP),
                            maxHP = mutableStateOf(maxHP),
                            initiative = mutableStateOf(initiative),
                            name = mutableStateOf(name ?: ""),
                            namedEntity = mutableStateOf(namedEntity ?: false),
                            size = mutableStateOf(size ?: ""),
                            type = mutableStateOf(type ?: ""),
                            alignment = mutableStateOf(alignment ?: ""),
                            armorClass = mutableStateOf(armorClass ?: ""),
                            hitPoints = mutableStateOf(hitPoints ?: ""),
                            speed = mutableStateOf(speed ?: ""),
                            str = mutableStateOf(str?.toString() ?: ""),
                            dex = mutableStateOf(dex?.toString() ?: ""),
                            con = mutableStateOf(con?.toString() ?: ""),
                            int = mutableStateOf(int?.toString() ?: ""),
                            wis = mutableStateOf(wis?.toString() ?: ""),
                            cha = mutableStateOf(cha?.toString() ?: ""),
                            skills = mutableStateOf(skills ?: ""),
                            savingThrows = mutableStateOf(savingThrows ?: ""),
                            vulnerabilities = mutableStateOf(vulnerabilities ?: ""),
                            damageResistances = mutableStateOf(damageResistances ?: ""),
                            damageImmunities = mutableStateOf(damageImmunities ?: ""),
                            conditionResistances = mutableStateOf(conditionResistances ?: ""),
                            conditionImmunities = mutableStateOf(conditionImmunities ?: ""),
                            legendaryResistance = mutableStateOf(legendaryResistance ?: ""),
                            senses = mutableStateOf(senses ?: ""),
                            languages = mutableStateOf(languages ?: ""),
                            challengeRating = mutableStateOf(challengeRating ?: ""),
                            expValue = mutableStateOf(expValue ?: ""),
                            proficiencyBonus = mutableStateOf(proficiencyBonus ?: ""),
                            traits = mutableStateOf(traits?: ""),
                            actions = mutableStateOf(actions?: ""),
                            bonusActions = mutableStateOf(bonusActions?: ""),
                            reactions = mutableStateOf(reactions?: ""),
                            description = mutableStateOf(description ?: ""),
                            legendaryActions = mutableStateOf(legendaryActions?: ""),
                            source = mutableStateOf(source ?: ""),
                            tags = mutableStateOf(tags ?: ""),
                            sortingTag = mutableStateOf(sortingTag ?: "")
                        )
                    }

                    onSave(updatedEntry)
                    onDismiss()
                }
            }) {
                Text(if (existingEntry == null) "Add" else "Save Changes")
            }
        },
        dismissButton = {
            Button(onClick = onDismiss) {
                Text("Cancel")
            }
        }
    )

    if (showConfirmDeleteDialog && existingEntry != null) {
        AlertDialog(
            onDismissRequest = { showConfirmDeleteDialog = false },
            title = { Text("Confirm Delete") },
            text = { OutlinedText(
                text ="Are you sure you want to delete this menagerie entry? This action cannot be undone.",
                color = Color.White,
                outlineColor = Color.Black,
                outlineWidth = 0.8.dp,
                style = MaterialTheme.typography.labelLarge
            )},
            confirmButton = {
                TextButton(onClick = {
                    // Your delete logic here:
                    // e.g. menagerieRepo.remove(existingEntry) or your callback
                    onDelete?.invoke()
                    onDismiss()
                    onNavigateToMenagerie()
                    showConfirmDeleteDialog = false
                }) {
                    Text("Delete")
                }
            },
            dismissButton = {
                TextButton(onClick = { showConfirmDeleteDialog = false }) {
                    Text("Cancel")
                }
            }
        )
    }
}



// Serialize/deserialize JSON instance
private val json = Json { encodeDefaults = true; ignoreUnknownKeys = true }

// ??
private var menagerieIdCounter = 1
val MenagerieStatBlocks = mutableStateListOf<BaseMenagerieEntry>()

// Tracks counters for base names
private val entityCounters = mutableMapOf<String, Int>()

@Composable
fun Menagerie(
    onNavigateHome: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToFavorites: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToSearchResults:() -> Unit,
    onNavigateToNotekeeping:() -> Unit,
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    var selectedEntry by remember { mutableStateOf<EditableMenagerieEntry?>(null) }
    val editableEntries = remember { mutableStateListOf<EditableMenagerieEntry>() }
    var showEditDialog by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        val persistedList = loadPersistedEntries(context)
        // Repopulate menagerie from persisted data
        MenagerieStatBlocks.clear()
        MenagerieStatBlocks.addAll(
            persistedList.map { persistEntry ->
                BaseMenagerieEntry(
                    id = persistEntry.id,
                    statBlock = persistEntry.statBlock,
                    displayName = persistEntry.displayName
                )
            }
        )
        menagerieIdCounter = (persistedList.maxOfOrNull { it.id } ?: 0) + 1

        editableEntries.clear()
        editableEntries.addAll(
            MenagerieStatBlocks.map { menagerieEntry ->
                val persisted = persistedList.find { it.id == menagerieEntry.id }
                EditableMenagerieEntry(
                    id = menagerieEntry.id,
                    statBlock = menagerieEntry.statBlock,
                    displayName = menagerieEntry.displayName,
                    currentHP = mutableStateOf(
                        persisted?.currentHP ?: extractHpValue(menagerieEntry.statBlock.hitPoints)
                    ),
                    tempHP = mutableStateOf(persisted?.tempHP ?: "0"),
                    maxHP = mutableStateOf(
                        persisted?.maxHP ?: extractHpValue(menagerieEntry.statBlock.hitPoints)
                    ),
                    initiative = mutableStateOf(persisted?.initiative ?: ""),
                    name = mutableStateOf(persisted?.statBlock?.name ?: ""),
                    namedEntity = mutableStateOf(persisted?.statBlock?.namedEntity ?: false),
                    size = mutableStateOf(persisted?.statBlock?.size ?: ""),
                    type = mutableStateOf(persisted?.statBlock?.type ?: ""),
                    alignment = mutableStateOf(persisted?.statBlock?.alignment ?: ""),
                    armorClass = mutableStateOf(persisted?.statBlock?.armorClass ?: ""),
                    hitPoints = mutableStateOf(persisted?.statBlock?.hitPoints ?: ""),
                    speed = mutableStateOf(persisted?.statBlock?.speed ?: ""),
                    str = mutableStateOf(persisted?.statBlock?.str?.toString() ?: ""),
                    dex = mutableStateOf(persisted?.statBlock?.dex?.toString() ?: ""),
                    con = mutableStateOf(persisted?.statBlock?.con?.toString() ?: ""),
                    int = mutableStateOf(persisted?.statBlock?.int?.toString() ?: ""),
                    wis = mutableStateOf(persisted?.statBlock?.wis?.toString() ?: ""),
                    cha = mutableStateOf(persisted?.statBlock?.cha?.toString() ?: ""),
                    skills = mutableStateOf(persisted?.statBlock?.skills ?: ""),
                    savingThrows = mutableStateOf(persisted?.statBlock?.savingThrows ?: ""),
                    vulnerabilities = mutableStateOf(persisted?.statBlock?.vulnerabilities ?: ""),
                    damageResistances = mutableStateOf(persisted?.statBlock?.damageResistances ?: ""),
                    damageImmunities = mutableStateOf(persisted?.statBlock?.damageImmunities ?: ""),
                    conditionResistances = mutableStateOf(persisted?.statBlock?.conditionResistances ?: ""),
                    conditionImmunities = mutableStateOf(persisted?.statBlock?.conditionImmunities ?: ""),
                    legendaryResistance = mutableStateOf(persisted?.statBlock?.legendaryResistance ?: ""),
                    senses = mutableStateOf(persisted?.statBlock?.senses ?: ""),
                    languages = mutableStateOf(persisted?.statBlock?.languages ?: ""),
                    challengeRating = mutableStateOf(persisted?.statBlock?.challengeRating ?: ""),
                    expValue = mutableStateOf(persisted?.statBlock?.expValue ?: ""),
                    proficiencyBonus = mutableStateOf(persisted?.statBlock?.proficiencyBonus ?: ""),
                    traits = mutableStateOf(persisted?.statBlock?.traits?.joinToString(", ") ?: ""),
                    actions = mutableStateOf(persisted?.statBlock?.actions?.joinToString(", ") ?: ""),
                    bonusActions = mutableStateOf(persisted?.statBlock?.bonusActions?.joinToString(", ") ?: ""),
                    reactions = mutableStateOf(persisted?.statBlock?.reactions?.joinToString(", ") ?: ""),
                    description = mutableStateOf(persisted?.statBlock?.description ?: ""),
                    legendaryActions = mutableStateOf(persisted?.statBlock?.legendaryActions?.joinToString(", ") ?: ""),
                    source = mutableStateOf(persisted?.statBlock?.source ?: ""),
                    tags = mutableStateOf(persisted?.statBlock?.tags ?: ""),
                    sortingTag = mutableStateOf(persisted?.statBlock?.sortingTag ?: "")
                )
            }
        )
    }


    // Save changes when any entry changes
    LaunchedEffect(editableEntries.map {
        listOf(it.currentHP.value, it.tempHP.value, it.initiative.value)
    }) {
        saveEntries(context, editableEntries)
    }
    BackHandler(enabled = true) {
        // Custom behavior here
        if (selectedEntry != null){onNavigateToMenagerie()}
        else{onNavigateHome()}
    }


    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) { Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly // evenly space the buttons
    ) {
//        Icon(
//            painter = painterResource(id = R.drawable.arrow_back_icon_menu),
//            contentDescription = "Back One Step",
//            modifier = Modifier
//                .size(32.dp)
//                .clickable {
//                    if (selectedEntry != null){onNavigateToMenagerie()}
//                    else{onNavigateHome()}
//                           },
//            tint = Color.White
//        )
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
            contentDescription = "Find Statblock",
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
        Text("Your Menagerie", style = MaterialTheme.typography.headlineSmall)
        Spacer(Modifier.height(16.dp))

        if (selectedEntry == null) {
            if (editableEntries.isEmpty()) {
                Text("Nothing added yet.", textAlign = TextAlign.Center)
            } else {
                val sortedEntries = editableEntries
                    .shuffled() // randomize equal-dexmod + initiative ties
                    .sortedWith(
                        compareByDescending<EditableMenagerieEntry> {
                            it.initiative.value.toIntOrNull() ?: Int.MIN_VALUE
                        }.thenByDescending {
                            it.statBlock.dexMod?.toIntOrNull() ?: Int.MIN_VALUE
                        }
                    )

                LazyColumn(modifier = Modifier.weight(1f)) {
                    items(sortedEntries, key = { it.id }) { entry ->
                        var showAddHpDialog by remember { mutableStateOf(false) }
                        var showRemoveHpDialog by remember { mutableStateOf(false) }
                        var showAddTempDialog by remember { mutableStateOf(false) }
                        var dialogInput by remember { mutableStateOf("") }
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(end = 8.dp, bottom = 16.dp)
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(12.dp),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(48.dp)
                                        .clip(CircleShape)
                                        .background(Color.Gray),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = entry.statBlock.name?.firstOrNull()?.uppercase() ?: "?",
                                        style = MaterialTheme.typography.headlineMedium,
                                        color = Color.White
                                    )

                                }

                                Text(
                                    text = entry.displayName,
                                    style = MaterialTheme.typography.titleMedium,
                                    modifier = Modifier.weight(1f)
                                )


                                Spacer(Modifier.width(20.dp))
                                val focusRequester = remember { FocusRequester() }
                                val focusManager = LocalFocusManager.current

                                OutlinedTextField(
                                    value = entry.initiative.value,
                                    onValueChange = { newValue ->
                                        if (newValue.matches(Regex("-?\\d{0,3}")) || newValue.isEmpty()) {
                                            entry.initiative.value = newValue
                                        }
                                    },
                                    label = { Text("Initiative") },
                                    singleLine = true,
                                    modifier = Modifier
                                        .weight(1f)
                                        .focusRequester(focusRequester),
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                                    keyboardActions = KeyboardActions(
                                        onDone = { focusManager.clearFocus() } // clears focus when user hits Done
                                    )
                                )

                            }

                            Spacer(Modifier.height(4.dp))
                            val focusManager = LocalFocusManager.current
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Text(
                                    text = "AC: ${entry.statBlock.armorClass ?: "?"}",
                                    modifier = Modifier.weight(1f)
                                )

                                val displayedHp = buildString {
                                    append(entry.currentHP.value)
                                    append(" (+ ")
                                    append(entry.tempHP.value.ifBlank { "0" })
                                    append(" temp) / ")
                                    append(entry.maxHP.value)
                                }

                                OutlinedTextField(
                                    value = displayedHp,
                                    onValueChange = { newValue ->
                                        val digits = newValue.takeWhile { it.isDigit() }
                                        if (digits.length <= 4) {
                                            entry.currentHP.value = digits
                                        }
                                    },
                                    label = { Text("HP") },
                                    singleLine = true,
                                    modifier = Modifier
                                        .weight(2f)
                                        .focusable(), // ensures it can gain focus
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                                    keyboardActions = KeyboardActions(
                                        onDone = { focusManager.clearFocus() } // removes cursor on Done
                                    )
                                )
                            }

                            Spacer(Modifier.height(4.dp))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Button(
                                    onClick = {
                                        dialogInput = ""
                                        showAddHpDialog = true
                                    },
                                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50).copy(alpha = 0.3f))  // green
                                ) {
                                    OutlinedText(
                                        text = "Add HP",
                                        color = Color.White,
                                        outlineColor = Color.Black,
                                        outlineWidth = 0.8.dp,
                                        style = MaterialTheme.typography.labelLarge
                                    )

                                }

                                Button(
                                    onClick = {
                                        dialogInput = ""
                                        showRemoveHpDialog = true
                                    },
                                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF44336).copy(alpha = 0.3f)) // red
                                ) {
                                    OutlinedText(
                                        text = "Remove HP",
                                        color = Color.White,
                                        outlineColor = Color.Black,
                                        outlineWidth = 0.8.dp,
                                        style = MaterialTheme.typography.labelLarge
                                    )
                                }

                                Button(
                                    onClick = {
                                        dialogInput = ""
                                        showAddTempDialog = true
                                    },
                                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF64B5F6).copy(alpha = 0.3f)) // light blue
                                ) {
                                    OutlinedText(
                                        text = "Add Temp",
                                        color = Color.White,
                                        outlineColor = Color.Black,
                                        outlineWidth = 0.8.dp,
                                        style = MaterialTheme.typography.labelLarge
                                    )
                                }

                            }

// Dialog for Add HP
                            if (showAddHpDialog) {
                                AlertDialog(
                                    onDismissRequest = { showAddHpDialog = false },
                                    title = { Text("Add HP") },
                                    text = {
                                        TextField(
                                            value = dialogInput,
                                            onValueChange = { value -> if (value.all { it.isDigit() }) dialogInput = value },
                                            label = { Text("Amount") },
                                            singleLine = true,
                                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                                        )
                                    },
                                    confirmButton = {
                                        TextButton(onClick = {
                                            val amount = dialogInput.toIntOrNull() ?: 0
                                            if (amount > 0) {
                                                val currentHp = entry.currentHP.value.toIntOrNull() ?: 0
                                                val maxHP = entry.maxHP.value.toIntOrNull() ?: 0
                                                entry.currentHP.value = (currentHp + amount).coerceAtMost(maxHP).toString()
                                            }
                                            showAddHpDialog = false
                                        }) {
                                            Text("OK")
                                        }
                                    },
                                    dismissButton = {
                                        TextButton(onClick = { showAddHpDialog = false }) {
                                            Text("Cancel")
                                        }
                                    }
                                )
                            }

// Dialog for Remove HP
                            if (showRemoveHpDialog) {
                                AlertDialog(
                                    onDismissRequest = { showRemoveHpDialog = false },
                                    title = { Text("Remove HP") },
                                    text = {
                                        TextField(
                                            value = dialogInput,
                                            onValueChange = { value -> if (value.all { it.isDigit() }) dialogInput = value },
                                            label = { Text("Amount") },
                                            singleLine = true,
                                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                                        )
                                    },
                                    confirmButton = {
                                        TextButton(onClick = {
                                            val amount = dialogInput.toIntOrNull() ?: 0
                                            if (amount > 0) {
                                                var temp = entry.tempHP.value.toIntOrNull() ?: 0
                                                var hp = entry.currentHP.value.toIntOrNull() ?: 0
                                                var damageLeft = amount
                                                if (temp >= damageLeft) {
                                                    temp -= damageLeft
                                                    damageLeft = 0
                                                } else {
                                                    damageLeft -= temp
                                                    temp = 0
                                                    hp = (hp - damageLeft).coerceAtLeast(0)
                                                }
                                                entry.tempHP.value = temp.toString()
                                                entry.currentHP.value = hp.toString()
                                            }
                                            showRemoveHpDialog = false
                                        }) {
                                            Text("OK")
                                        }
                                    },
                                    dismissButton = {
                                        TextButton(onClick = { showRemoveHpDialog = false }) {
                                            Text("Cancel")
                                        }
                                    }
                                )
                            }

// Dialog for Add Temp
                            if (showAddTempDialog) {
                                AlertDialog(
                                    onDismissRequest = { showAddTempDialog = false },
                                    title = { Text("Add Temp HP") },
                                    text = {
                                        TextField(
                                            value = dialogInput,
                                            onValueChange = { value -> if (value.all { it.isDigit() }) dialogInput = value },
                                            label = { Text("Amount") },
                                            singleLine = true,
                                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                                        )
                                    },
                                    confirmButton = {
                                        TextButton(onClick = {
                                            val amount = dialogInput.toIntOrNull() ?: 0
                                            if (amount > 0) {
                                                val temp = entry.tempHP.value.toIntOrNull() ?: 0
                                                entry.tempHP.value = (temp + amount).toString()
                                            }
                                            showAddTempDialog = false
                                        }) {
                                            Text("OK")
                                        }
                                    },
                                    dismissButton = {
                                        TextButton(onClick = { showAddTempDialog = false }) {
                                            Text("Cancel")
                                        }
                                    }
                                )
                            }





                            Spacer(Modifier.height(4.dp))
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(12.dp),

                                modifier = Modifier.fillMaxWidth()
                                    .padding(end = 20.dp),
                            ) {
                                Button(
                                    onClick = {
                                        val updatedStatBlock = entry.statBlock.copy(
                                            hitPoints = formatHp(entry.currentHP.value, entry.statBlock.hitPoints)
                                        )
                                        val detailEntry = entry.copy(statBlock = updatedStatBlock)
                                        selectedEntry = detailEntry

                                        // Optionally save the update to persistence here:
                                        // coroutineScope.launch { saveMenagerie(context) }
                                    },
                                    colors = ButtonDefaults.buttonColors( containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f))
                                ) {
                                    OutlinedText(
                                        text = "Full Details",
                                        color = Color.White,
                                        outlineColor = Color.Black,
                                        outlineWidth = 0.8.dp,
                                        style = MaterialTheme.typography.labelLarge
                                    )
                                }

                                var showConfirmDialog by remember { mutableStateOf(false) }

                                Spacer(modifier = Modifier.weight(1f))



                                Icon(
                                    imageVector = Icons.TwoTone.Delete,
                                    contentDescription = "Remove from Menagerie",
                                    tint = Color.Red,
                                    modifier = Modifier
                                        .size(38.dp)
                                        .clickable { showConfirmDialog = true }
                                )




                                if (showConfirmDialog) {
                                    AlertDialog(
                                        onDismissRequest = { showConfirmDialog = false },
                                        title = { Text("Confirm Removal") },
                                        text = { Text("Are you sure you want to remove this entry from the Menagerie?") },
                                        confirmButton = {
                                            TextButton(onClick = {
                                                val menagerieEntry = MenagerieStatBlocks.find { it.id == entry.id }
                                                if (menagerieEntry != null) {
                                                    scope.launch {
                                                        removeFromMenagerieAndSave(context, menagerieEntry)
                                                    }
                                                    editableEntries.removeAll { it.id == entry.id }
                                                    if (selectedEntry?.id == entry.id) {
                                                        selectedEntry = null
                                                    }
                                                }
                                                showConfirmDialog = false
                                            }) {
                                                Text("Remove")
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
                    statBlock = selectedEntry!!.statBlock,
                    onEditClick = {
                        showEditDialog = true // This will trigger the edit dialog
                    }
                )

                Spacer(Modifier.height(16.dp))

                // Inside your composable scope, declare state:
                var showConfirmDialog by remember { mutableStateOf(false) }



                val context = LocalContext.current
                val scope = rememberCoroutineScope()

// Your list UI here, for example, inside LazyColumn
                if (showEditDialog && selectedEntry != null) {
                    MenagerieEntryEditorDialog(
                        existingEntry = selectedEntry!!,
                        onDismiss = { showEditDialog = false },
                        onSave = { updatedEntry ->
                            val index = editableEntries.indexOfFirst { it.id == updatedEntry.id }
                            if (index >= 0) {
                                editableEntries[index] = updatedEntry
                                selectedEntry = updatedEntry
                            }
                            showEditDialog = false
                            scope.launch {
                                saveEntries(context, editableEntries)
                            }
                        },
                        onDelete = {
                            editableEntries.removeAll { it.id == selectedEntry?.id }
                            selectedEntry = null
                            showEditDialog = false
                            scope.launch {
                                saveEntries(context, editableEntries)
                            }
                            onNavigateToMenagerie()
                        },
                        onNavigateToMenagerie = onNavigateToMenagerie
                    )
                }


// Confirmation dialog
                if (showConfirmDialog) {
                    AlertDialog(
                        onDismissRequest = { showConfirmDialog = false },
                        title = { Text("Confirm Removal") },
                        text = { Text("Are you sure you want to remove this entry from the Menagerie?") },
                        confirmButton = {
                            TextButton(onClick = {
                                val entryToRemove = MenagerieStatBlocks.find { it.id == selectedEntry!!.id }
                                if (entryToRemove != null) {
                                    scope.launch {
                                        removeFromMenagerieAndSave(context, entryToRemove)
                                    }
                                    editableEntries.removeAll { it.id == selectedEntry!!.id }
                                }
                                selectedEntry = null
                                showConfirmDialog = false
                            }) {
                                Text("Remove")
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
    }
}


@Composable
fun MenagerieAddButton(
    statBlock: StatBlock,
    snackbarHostState: SnackbarHostState
) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()


    IconButton(
        onClick = {
            coroutineScope.launch {
                if (MenagerieManager.activeNames.isEmpty()) {
                    val entries = loadPersistedEntries(context) // this is already defined
                    MenagerieStatBlocks.clear()
                    MenagerieStatBlocks.addAll(entries.map {
                        BaseMenagerieEntry(it.id, it.statBlock, it.displayName)
                    })
                    MenagerieManager.updateFromCurrentMenagerie()
                }


                addToMenagerieAndSave(context, statBlock)

                snackbarHostState.showSnackbar(
                    message = "Added to Menagerie",
                    duration = SnackbarDuration.Indefinite
                )
            }
            coroutineScope.launch {
                delay(750)
                snackbarHostState.currentSnackbarData?.dismiss()
            }
        },
        modifier = Modifier.padding(start = 4.dp)
    ) {
        // ✅ Reactively checks MenagerieManager.activeNames
        val iconRes = if (MenagerieManager.contains(statBlock)) {
            R.drawable.menagerie_icon_filled
        } else {
            R.drawable.menagerie_icon_empty
        }

        Icon(
            painter = painterResource(id = iconRes),
            contentDescription = if (MenagerieManager.contains(statBlock))
                "Remove from Menagerie"
            else
                "Add to Menagerie",
            modifier = Modifier.size(32.dp),
            tint = Color.Unspecified
        )
    }
}

