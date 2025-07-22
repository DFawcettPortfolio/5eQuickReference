package com.example.wildshapesmountsandfamiliars.ui.screens.creatureType

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.wildshapesmountsandfamiliars.ui.screens.CreatureTypeScreen
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
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
    onNavigateToHalfDragons:() -> Unit,
    onNavigateToUncategorizedStatblocks:() -> Unit,
    onNavigateToHumanoids:() -> Unit,
    onNavigateToCelestials:() -> Unit,
    onNavigateToConstructs:() -> Unit,
    onNavigateToElementals:() -> Unit,
    onNavigateToAberrations:() -> Unit,
    onNavigateToMonstrosities:() -> Unit,
    onNavigateToDragons:() -> Unit,
    onNavigateToFey:() -> Unit,
    onNavigateToOozes:() -> Unit,
    onNavigateToBeasts:() -> Unit,
    onNavigateToFiends:() -> Unit,
    onNavigateToGiants:() -> Unit,
    onNavigateToPlants:() -> Unit,
    onNavigateToUndead:() -> Unit,
)
{
    CreatureTypeScreen(
        title = "Custom",
        statBlocks = CustomStatBlockRepo.customBlocks,
        spellEffectOrSummons = emptyList(),
        onNavigateHome = onNavigateHome,
        onNavigateBack = onNavigateToStatblocksByType,
        onNavigateToCustom = onNavigateToCustom,
        onNavigateToFavorites = onNavigateToFavorites,
        onNavigateToMenagerie = onNavigateToMenagerie,
        onNavigateToInventory = onNavigateToInventory,
        onNavigateToRulesQuickGuide = onNavigateToRulesQuickGuide,
        onNavigateToStatblocksByType = onNavigateToStatblocksByType,
        onNavigateToHalfDragons = onNavigateToHalfDragons,
        onNavigateToUncategorizedStatblocks = onNavigateToUncategorizedStatblocks,
        onNavigateToHumanoids = onNavigateToHumanoids,
        onNavigateToCelestials = onNavigateToCelestials,
        onNavigateToConstructs = onNavigateToConstructs,
        onNavigateToElementals = onNavigateToElementals,
        onNavigateToAberrations = onNavigateToAberrations,
        onNavigateToMonstrosities = onNavigateToMonstrosities,
        onNavigateToDragons = onNavigateToDragons,
        onNavigateToFey = onNavigateToFey,
        onNavigateToOozes = onNavigateToOozes,
        onNavigateToBeasts = onNavigateToBeasts,
        onNavigateToFiends = onNavigateToFiends,
        onNavigateToGiants = onNavigateToGiants,
        onNavigateToPlants = onNavigateToPlants,
        onNavigateToUndead = onNavigateToUndead,
    )
}

@Composable
fun CreateCustomStatBlockDialog(
    onDismiss: () -> Unit,
    onCreate: (StatBlock) -> Unit,
    existingBlock: StatBlock? = null,
    onNavigateToCustom: () -> Unit,
    onDelete: (() -> Unit)? = null  // nullable lambda
)
{

    val context = LocalContext.current
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
    var conditionResistances by remember {
        mutableStateOf(
            existingBlock?.conditionResistances ?: ""
        )
    }
    var conditionImmunities by remember { mutableStateOf(existingBlock?.conditionImmunities ?: "") }
    var legendaryResistance by remember { mutableStateOf(existingBlock?.legendaryResistance ?: "") }
    var senses by remember { mutableStateOf(existingBlock?.senses ?: "") }
    var languages by remember { mutableStateOf(existingBlock?.languages ?: "") }
    var challengeRating by remember { mutableStateOf(existingBlock?.challengeRating ?: "") }
    var expValue by remember { mutableStateOf(existingBlock?.expValue ?: "") }
    var proficiencyBonus by remember { mutableStateOf(existingBlock?.proficiencyBonus ?: "") }
    var traits by remember { mutableStateOf(existingBlock?.traits?.joinToString(", ") ?: "") }
    var actions by remember { mutableStateOf(existingBlock?.actions?.joinToString(", ") ?: "") }
    var bonusActions by remember {
        mutableStateOf(
            existingBlock?.bonusActions?.joinToString(", ") ?: ""
        )
    }
    var reactions by remember { mutableStateOf(existingBlock?.reactions?.joinToString(", ") ?: "") }
    var legendaryActions by remember {
        mutableStateOf(
            existingBlock?.legendaryActions?.joinToString(
                ", "
            ) ?: ""
        )
    }
    var description by remember { mutableStateOf(existingBlock?.description ?: "") }
    var source by remember { mutableStateOf(existingBlock?.source ?: "") }

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
                    IconButton(
                        onClick = {
                            CustomStatBlockRepo.remove(existingBlock, context)
                            onDelete?.invoke()
                            onDismiss()
                            onNavigateToCustom()
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Delete,
                            contentDescription = "Delete StatBlock",
                            tint = Color.Red
                        )
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
                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text("Name") })
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = namedEntity,
                        onCheckedChange = { namedEntity = it },
                        colors = CheckboxDefaults.colors()
                    )
                    Text("Named Entity")
                }
                OutlinedTextField(
                    value = size,
                    onValueChange = { size = it },
                    label = { Text("Size") })
                OutlinedTextField(
                    value = type,
                    onValueChange = { type = it },
                    label = { Text("Type") })
                OutlinedTextField(
                    value = alignment,
                    onValueChange = { alignment = it },
                    label = { Text("Alignment") })
                OutlinedTextField(
                    value = armorClass,
                    onValueChange = { armorClass = it },
                    label = { Text("Armor Class") })
                OutlinedTextField(
                    value = hitPoints,
                    onValueChange = { hitPoints = it },
                    label = { Text("Hit Points") })
                OutlinedTextField(
                    value = speed,
                    onValueChange = { speed = it },
                    label = { Text("Speed") })

                OutlinedTextField(
                    value = str,
                    onValueChange = { str = it.filter(Char::isDigit) },
                    label = { Text("STR") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                OutlinedTextField(
                    value = dex,
                    onValueChange = { dex = it.filter(Char::isDigit) },
                    label = { Text("DEX") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                OutlinedTextField(
                    value = con,
                    onValueChange = { con = it.filter(Char::isDigit) },
                    label = { Text("CON") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                OutlinedTextField(
                    value = int,
                    onValueChange = { int = it.filter(Char::isDigit) },
                    label = { Text("INT") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                OutlinedTextField(
                    value = wis,
                    onValueChange = { wis = it.filter(Char::isDigit) },
                    label = { Text("WIS") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                OutlinedTextField(
                    value = cha,
                    onValueChange = { cha = it.filter(Char::isDigit) },
                    label = { Text("CHA") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )

                OutlinedTextField(
                    value = skills,
                    onValueChange = { skills = it },
                    label = { Text("Skills") })
                OutlinedTextField(
                    value = savingThrows,
                    onValueChange = { savingThrows = it },
                    label = { Text("Saving Throws") })
                OutlinedTextField(
                    value = vulnerabilities,
                    onValueChange = { vulnerabilities = it },
                    label = { Text("Vulnerabilities") })
                OutlinedTextField(
                    value = damageResistances,
                    onValueChange = { damageResistances = it },
                    label = { Text("Damage Resistances") })
                OutlinedTextField(
                    value = damageImmunities,
                    onValueChange = { damageImmunities = it },
                    label = { Text("Damage Immunities") })
                OutlinedTextField(
                    value = conditionResistances,
                    onValueChange = { conditionResistances = it },
                    label = { Text("Condition Resistances") })
                OutlinedTextField(
                    value = conditionImmunities,
                    onValueChange = { conditionImmunities = it },
                    label = { Text("Condition Immunities") })
                OutlinedTextField(
                    value = legendaryResistance,
                    onValueChange = { legendaryResistance = it },
                    label = { Text("Legendary Resistance") })
                OutlinedTextField(
                    value = senses,
                    onValueChange = { senses = it },
                    label = { Text("Senses") })
                OutlinedTextField(
                    value = languages,
                    onValueChange = { languages = it },
                    label = { Text("Languages") })
                OutlinedTextField(
                    value = challengeRating,
                    onValueChange = { challengeRating = it },
                    label = { Text("Challenge Rating") })
                OutlinedTextField(
                    value = expValue,
                    onValueChange = { expValue = it },
                    label = { Text("EXP Value") })
                OutlinedTextField(
                    value = proficiencyBonus,
                    onValueChange = { proficiencyBonus = it },
                    label = { Text("Proficiency Bonus") })
                OutlinedTextField(
                    value = traits,
                    onValueChange = { traits = it },
                    label = { Text("Traits (comma separated)") })
                OutlinedTextField(
                    value = actions,
                    onValueChange = { actions = it },
                    label = { Text("Actions (comma separated)") })
                OutlinedTextField(
                    value = bonusActions,
                    onValueChange = { bonusActions = it },
                    label = { Text("Bonus Actions (comma separated)") })
                OutlinedTextField(
                    value = reactions,
                    onValueChange = { reactions = it },
                    label = { Text("Reactions (comma separated)") })
                OutlinedTextField(
                    value = legendaryActions,
                    onValueChange = { legendaryActions = it },
                    label = { Text("Legendary Actions (comma separated)") })
                OutlinedTextField(
                    value = description,
                    onValueChange = { description = it },
                    label = { Text("Description") })
                OutlinedTextField(
                    value = source,
                    onValueChange = { source = it },
                    label = { Text("Source") })

                Spacer(Modifier.height(8.dp))
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

                    val updatedBlock = existingBlock?.copy(
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
                        bonusActions = bonusActions.split(",").map { it.trim() }
                            .filter { it.isNotEmpty() },
                        reactions = reactions.split(",").map { it.trim() }
                            .filter { it.isNotEmpty() },
                        legendaryActions = legendaryActions.split(",").map { it.trim() }
                            .filter { it.isNotEmpty() },
                        description = description.ifBlank { null },
                        tags = "",
                        source = source.ifBlank { null }
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
                        bonusActions = bonusActions.split(",").map { it.trim() }
                            .filter { it.isNotEmpty() },
                        reactions = reactions.split(",").map { it.trim() }
                            .filter { it.isNotEmpty() },
                        legendaryActions = legendaryActions.split(",").map { it.trim() }
                            .filter { it.isNotEmpty() },
                        description = description.ifBlank { null },
                        tags = "",
                        source = source.ifBlank { null }
                    )

                    onCreate(updatedBlock)
                }
            }) {
                Text(if (existingBlock == null) "Add" else "Save Changes")
            }
        },
        dismissButton = {
            Button(onClick = onDismiss) {
                Text("Cancel")
            }
        }
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


    fun update(oldBlock: StatBlock, newBlock: StatBlock, context: Context) {
        val index = _customBlocks.indexOf(oldBlock)
        if (index != -1) {
            _customBlocks[index] = newBlock
            save(context)
        }
    }

    fun remove(block: StatBlock, context: Context) {
        _customBlocks.remove(block)
        save(context)
    }
}
