package com.example.wildshapesmountsandfamiliars.ui.screens

import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.example.wildshapesmountsandfamiliars.R
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.CreateCustomStatBlockDialog
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.CustomStatBlockRepo
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.CustomStatBlockRepo.customBlocks
import kotlinx.coroutines.launch
import kotlinx.serialization.Serializable

// Your data class
@Serializable
data class StatBlock(
    val name: String?,
    val namedEntity: Boolean = false,
    val size: String?,
    val type: String?,
    val alignment: String?,
    val armorClass: String?,
    val hitPoints: String?,
    val speed: String?,
    val str: Int?,
    val strMod: String?,
    val dex: Int?,
    val dexMod: String?,
    val con: Int?,
    val conMod: String?,
    val int: Int?,
    val intMod: String?,
    val wis: Int?,
    val wisMod: String?,
    val cha: Int?,
    val chaMod: String?,
    val skills: String?,
    val savingThrows: String?,
    val vulnerabilities: String?,
    val damageResistances: String?,
    val damageImmunities: String?,
    val conditionResistances: String?,
    val conditionImmunities: String?,
    val legendaryResistance: String?,
    val senses: String?,
    val languages: String?,
    val challengeRating: String?,
    val expValue: String?,
    val proficiencyBonus: String?,
    val traits: List<String>?,
    val actions: List<String>?,
    val bonusActions: List<String>?,
    val reactions: List<String>?,
    val legendaryActions: List<String>?,
    val description: String?,
    val tags: String?,
    val source: String?
)

sealed class StatBlockListItem {
    data class Block(val statBlock: StatBlock) : StatBlockListItem()
    data class Header(val title: String) : StatBlockListItem()
}


@Composable
fun StatBlockView(statBlock: StatBlock) {
    @Composable
    fun labeledLine(label: String, value: String?) {
        if (!value.isNullOrBlank()) {
            Text("$label: $value")
        }
    }

    Text("${statBlock.name}\n${statBlock.size} ${statBlock.type}, ${statBlock.alignment}")
    labeledLine("Armor Class", statBlock.armorClass)
    labeledLine("Hit Points", statBlock.hitPoints)
    labeledLine("Speed", statBlock.speed)

    Text("STR: ${statBlock.str ?: "-"} (${statBlock.strMod ?: ""})")
    Text("DEX: ${statBlock.dex ?: "-"} (${statBlock.dexMod ?: ""})")
    Text("CON: ${statBlock.con ?: "-"} (${statBlock.conMod ?: ""})")
    Text("INT: ${statBlock.int ?: "-"} (${statBlock.intMod ?: ""})")
    Text("WIS: ${statBlock.wis ?: "-"} (${statBlock.wisMod ?: ""})")
    Text("CHA: ${statBlock.cha ?: "-"} (${statBlock.chaMod ?: ""})")

    labeledLine("Skills", statBlock.skills)
    labeledLine("Damage Resistances", statBlock.damageResistances)
    labeledLine("Damage Immunities", statBlock.damageImmunities)
    labeledLine("Condition Resistances", statBlock.conditionResistances)
    labeledLine("Condition Immunities", statBlock.conditionImmunities)
    labeledLine("Senses", statBlock.senses)
    labeledLine("Languages", statBlock.languages)
    labeledLine("Challenge", statBlock.challengeRating)
    labeledLine("Proficiency Bonus", statBlock.proficiencyBonus)

    Spacer(modifier = Modifier.height(8.dp))

    statBlock.traits?.takeIf { it.isNotEmpty() }?.let {
        Spacer(modifier = Modifier.height(8.dp))
        Text("Traits:", style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp
        ))
        it.forEach { trait ->
            val parts = trait.split(".", limit = 2)
            val name = parts.getOrNull(0)?.trim() ?: ""
            val rest = parts.getOrNull(1)?.trim() ?: ""

            Text(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp)) {
                        append(name)
                        append(".") // add the period back in bold
                    }
                    if (rest.isNotEmpty()) {
                        append(" ")
                        append(rest)
                    }
                },
                modifier = Modifier.padding(vertical = 4.dp)
            )
        }
    }

    statBlock.actions?.takeIf { it.isNotEmpty() }?.let {
        Spacer(modifier = Modifier.height(8.dp))
        Text("Actions:", style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp
        ))
        it.forEach { action ->
            val parts = action.split(".", limit = 2)
            val name = parts.getOrNull(0)?.trim() ?: ""
            val rest = parts.getOrNull(1)?.trim() ?: ""

            Text(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp)) {
                        append(name)
                        append(".") // add the period back in bold
                    }
                    if (rest.isNotEmpty()) {
                        append(" ")
                        append(rest)
                    }
                },
                modifier = Modifier.padding(vertical = 4.dp)
            )
        }
    }

    statBlock.bonusActions?.takeIf { it.isNotEmpty() }?.let {
        Spacer(modifier = Modifier.height(8.dp))
        Text("Bonus Actions:", style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp
        ))
        it.forEach { bonusAction ->
            val parts = bonusAction.split(".", limit = 2)
            val name = parts.getOrNull(0)?.trim() ?: ""
            val rest = parts.getOrNull(1)?.trim() ?: ""

            Text(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp)) {
                        append(name)
                        append(".") // add the period back in bold
                    }
                    if (rest.isNotEmpty()) {
                        append(" ")
                        append(rest)
                    }
                },
                modifier = Modifier.padding(vertical = 4.dp)
            )
        }
    }

    statBlock.reactions?.takeIf { it.isNotEmpty() }?.let {
        Spacer(modifier = Modifier.height(8.dp))
        Text("Reactions:", style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp
        ))
        it.forEach { reaction ->
            val parts = reaction.split(".", limit = 2)
            val name = parts.getOrNull(0)?.trim() ?: ""
            val rest = parts.getOrNull(1)?.trim() ?: ""

            Text(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp)) {
                        append(name)
                        append(".") // add the period back in bold
                    }
                    if (rest.isNotEmpty()) {
                        append(" ")
                        append(rest)
                    }
                },
                modifier = Modifier.padding(vertical = 4.dp)
            )
        }
    }

    statBlock.legendaryActions?.takeIf { it.isNotEmpty() }?.let {
        Spacer(modifier = Modifier.height(8.dp))
        Text("Legendary Actions:", style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp
        ))
        it.forEach { legendaryAction ->
            val parts = legendaryAction.split(".", limit = 2)
            val name = parts.getOrNull(0)?.trim() ?: ""
            val rest = parts.getOrNull(1)?.trim() ?: ""

            Text(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp)) {
                        append(name)
                        append(".") // add the period back in bold
                    }
                    if (rest.isNotEmpty()) {
                        append(" ")
                        append(rest)
                    }
                },
                modifier = Modifier.padding(vertical = 4.dp)
            )
        }
    }
    statBlock.source?.takeIf { it.isNotBlank() }?.let {
        Spacer(modifier = Modifier.height(24.dp))
        Text("Source: $it")
    }
    statBlock.tags?.takeIf { it.isNotBlank() }?.let {
        Spacer(modifier = Modifier.height(24.dp))
        Text("(Tags: $it)")
    }
}

fun crToDecimal(cr: String): Float {
    return when {
        cr.contains("/") -> {
            val parts = cr.trim().split("/")
            if (parts.size == 2) parts[0].toFloat() / parts[1].toFloat() else 0f
        }
        else -> cr.trim().split(" ").firstOrNull()?.toFloatOrNull() ?: 0f
    }
}

val AberrationStatBlocks: MutableList<StatBlock> = mutableListOf()
val AberrationStatBlockSpellEffectOrSummon: MutableList<StatBlock> = mutableListOf()

val BeastStatBlocks: MutableList<StatBlock> = mutableListOf()
val BeastStatBlockSpellEffectOrSummon: MutableList<StatBlock> = mutableListOf()

val CelestialStatBlocks: MutableList<StatBlock> = mutableListOf()
val CelestialStatBlockSpellEffectOrSummon: MutableList<StatBlock> = mutableListOf()

val ConstructStatBlocks: MutableList<StatBlock> = mutableListOf()
val ConstructStatBlockSpellEffectOrSummon: MutableList<StatBlock> = mutableListOf()

val CustomStatBlocks: MutableList<StatBlock> = mutableListOf()
val CustomStatBlockSpellEffectOrSummon: MutableList<StatBlock> = mutableListOf()

val DragonStatBlocks: MutableList<StatBlock> = mutableListOf()
val DragonStatBlockSpellEffectOrSummon: MutableList<StatBlock> = mutableListOf()

val ElementalStatBlocks: MutableList<StatBlock> = mutableListOf()
val ElementalStatBlockSpellEffectOrSummon: MutableList<StatBlock> = mutableListOf()

val FeyStatBlocks: MutableList<StatBlock> = mutableListOf()
val FeyStatBlockSpellEffectOrSummon: MutableList<StatBlock> = mutableListOf()

val FiendStatBlocks: MutableList<StatBlock> = mutableListOf()
val FiendStatBlockSpellEffectOrSummon: MutableList<StatBlock> = mutableListOf()

val GiantStatBlocks: MutableList<StatBlock> = mutableListOf()
val GiantStatBlockSpellEffectOrSummon: MutableList<StatBlock> = mutableListOf()

val HalfDragonStatBlocks: MutableList<StatBlock> = mutableListOf()
val HalfDragonStatBlockSpellEffectOrSummon: MutableList<StatBlock> = mutableListOf()

val HumanoidStatBlocks: MutableList<StatBlock> = mutableListOf()
val HumanoidStatBlockSpellEffectOrSummon: MutableList<StatBlock> = mutableListOf()

val MonstrosityStatBlocks: MutableList<StatBlock> = mutableListOf()
val MonstrosityStatBlockSpellEffectOrSummon: MutableList<StatBlock> = mutableListOf()

val OozeStatBlocks: MutableList<StatBlock> = mutableListOf()
val OozeStatBlockSpellEffectOrSummon: MutableList<StatBlock> = mutableListOf()

val PlantStatBlocks: MutableList<StatBlock> = mutableListOf()
val PlantStatBlockSpellEffectOrSummon: MutableList<StatBlock> = mutableListOf()

val UndeadStatBlocks: MutableList<StatBlock> = mutableListOf()
val UndeadStatBlockSpellEffectOrSummon: MutableList<StatBlock> = mutableListOf()

val UncategorizedStatBlocks: MutableList<StatBlock> = mutableListOf()
val UncategorizedStatBlockSpellEffectOrSummon: MutableList<StatBlock> = mutableListOf()



// Registration functions (alphabetical order by type)
fun registerAberrationStatBlock(block: StatBlock): StatBlock {
    AberrationStatBlocks.add(block)
    return block
}

fun registerAberrationStatBlockSpellEffectOrSummon(block: StatBlock): StatBlock {
    AberrationStatBlockSpellEffectOrSummon.add(block)
    return block
}

fun registerBeastStatBlock(block: StatBlock): StatBlock {
    BeastStatBlocks.add(block)
    return block
}

fun registerBeastStatBlockSpellEffectOrSummon(block: StatBlock): StatBlock {
    BeastStatBlockSpellEffectOrSummon.add(block)
    return block
}

fun registerCelestialStatBlock(block: StatBlock): StatBlock {
    CelestialStatBlocks.add(block)
    return block
}

fun registerCelestialStatBlockSpellEffectOrSummon(block: StatBlock): StatBlock {
    CelestialStatBlockSpellEffectOrSummon.add(block)
    return block
}

fun registerConstructStatBlock(block: StatBlock): StatBlock {
    ConstructStatBlocks.add(block)
    return block
}

fun registerConstructStatBlockSpellEffectOrSummon(block: StatBlock): StatBlock {
    ConstructStatBlockSpellEffectOrSummon.add(block)
    return block
}
fun registerCustomStatBlock(block: StatBlock): StatBlock {
    CustomStatBlocks.add(block)
    return block
}

fun registerCustomStatBlockSpellEffectOrSummon(block: StatBlock): StatBlock {
    CustomStatBlockSpellEffectOrSummon.add(block)
    return block
}

fun registerDragonStatBlock(block: StatBlock): StatBlock {
    DragonStatBlocks.add(block)
    return block
}

fun registerDragonStatBlockSpellEffectOrSummon(block: StatBlock): StatBlock {
    DragonStatBlockSpellEffectOrSummon.add(block)
    return block
}

fun registerElementalStatBlock(block: StatBlock): StatBlock {
    ElementalStatBlocks.add(block)
    return block
}

fun registerElementalStatBlockSpellEffectOrSummon(block: StatBlock): StatBlock {
    ElementalStatBlockSpellEffectOrSummon.add(block)
    return block
}

fun registerFeyStatBlock(block: StatBlock): StatBlock {
    FeyStatBlocks.add(block)
    return block
}
fun registerFeyStatBlockSpellEffectOrSummon(block: StatBlock): StatBlock {
    FeyStatBlockSpellEffectOrSummon.add(block)
    return block
}

fun registerFiendStatBlock(block: StatBlock): StatBlock {
    FiendStatBlocks.add(block)
    return block
}

fun registerFiendStatBlockSpellEffectOrSummon(block: StatBlock): StatBlock {
    FiendStatBlockSpellEffectOrSummon.add(block)
    return block
}

fun registerGiantStatBlock(block: StatBlock): StatBlock {
    GiantStatBlocks.add(block)
    return block
}

fun registerGiantStatBlockSpellEffectOrSummon(block: StatBlock): StatBlock {
    GiantStatBlockSpellEffectOrSummon.add(block)
    return block
}

fun registerHalfDragonStatBlock(block: StatBlock): StatBlock {
    HalfDragonStatBlocks.add(block)
    return block
}

fun registerHalfDragonStatBlockSpellEffectOrSummon(block: StatBlock): StatBlock {
    HalfDragonStatBlockSpellEffectOrSummon.add(block)
    return block
}

fun registerHumanoidStatBlock(block: StatBlock): StatBlock {
    HumanoidStatBlocks.add(block)
    return block
}

fun registerHumanoidStatBlockSpellEffectOrSummon(block: StatBlock): StatBlock {
    HumanoidStatBlockSpellEffectOrSummon.add(block)
    return block
}

fun registerMonstrosityStatBlock(block: StatBlock): StatBlock {
    MonstrosityStatBlocks.add(block)
    return block
}
fun registerMonstrosityStatBlockSpellEffectOrSummon(block: StatBlock): StatBlock {
    MonstrosityStatBlockSpellEffectOrSummon.add(block)
    return block
}

fun registerOozeStatBlock(block: StatBlock): StatBlock {
    OozeStatBlocks.add(block)
    return block
}
fun registerOozeStatBlockSpellEffectOrSummon(block: StatBlock): StatBlock {
    OozeStatBlockSpellEffectOrSummon.add(block)
    return block
}

fun registerPlantStatBlock(block: StatBlock): StatBlock {
    PlantStatBlocks.add(block)
    return block
}

fun registerPlantStatBlockSpellEffectOrSummon(block: StatBlock): StatBlock {
    PlantStatBlockSpellEffectOrSummon.add(block)
    return block
}

fun registerUndeadStatBlock(block: StatBlock): StatBlock {
    UndeadStatBlocks.add(block)
    return block
}
fun registerUndeadStatBlockSpellEffectOrSummon(block: StatBlock): StatBlock {
    UndeadStatBlockSpellEffectOrSummon.add(block)
    return block
}

fun registerUncategorizedStatBlock(block: StatBlock): StatBlock {
    UncategorizedStatBlocks.add(block)
    return block
}

fun registerUncategorizedStatBlockSpellEffectOrSummon(block: StatBlock): StatBlock {
    UncategorizedStatBlockSpellEffectOrSummon.add(block)
    return block
}

fun getAllStatBlocks(): List<StatBlock> {
    return buildList {
        addAll(AberrationStatBlocks)
        addAll(BeastStatBlocks)
        addAll(CelestialStatBlocks)
        addAll(ConstructStatBlocks)
        addAll(DragonStatBlocks)
        addAll(ElementalStatBlocks)
        addAll(FeyStatBlocks)
        addAll(FiendStatBlocks)
        addAll(GiantStatBlocks)
        addAll(HumanoidStatBlocks)
        addAll(MonstrosityStatBlocks)
        addAll(OozeStatBlocks)
        addAll(PlantStatBlocks)
        addAll(UndeadStatBlocks)
        addAll(UncategorizedStatBlocks)
    }
}
val Context.dataStore by preferencesDataStore(name = "app_preferences")
val MENAGERIE_KEY = stringPreferencesKey("menagerie_editable_entries")
val FAVORITES_KEY = stringPreferencesKey("favorite_statblocks")


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CreatureTypeScreen(
    title: String,
    statBlocks: List<StatBlock>,
    spellEffectOrSummons: List<StatBlock>,
    onNavigateHome: () -> Unit,
    onNavigateBack: () -> Unit,
    onNavigateToCustom: () -> Unit,
    onNavigateToFavorites: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit,
    onNavigateToStatblocksByType: () -> Unit,
    onNavigateToHalfDragons: () -> Unit,
    onNavigateToUncategorizedStatblocks: () -> Unit,
    onNavigateToHumanoids: () -> Unit,
    onNavigateToCelestials: () -> Unit,
    onNavigateToConstructs: () -> Unit,
    onNavigateToElementals: () -> Unit,
    onNavigateToAberrations: () -> Unit,
    onNavigateToMonstrosities: () -> Unit,
    onNavigateToDragons: () -> Unit,
    onNavigateToFey: () -> Unit,
    onNavigateToOozes: () -> Unit,
    onNavigateToBeasts: () -> Unit,
    onNavigateToFiends: () -> Unit,
    onNavigateToGiants: () -> Unit,
    onNavigateToPlants: () -> Unit,
    onNavigateToUndead: () -> Unit
) {
    // Remember states for selected stat block and dialog visibility/editing
    var selectedStatBlock by remember { mutableStateOf<StatBlock?>(null) }
    var showCreateDialog by remember { mutableStateOf(false) }
    var editingBlock by remember { mutableStateOf<StatBlock?>(null) }

    // Filter states for CR and special tags
    var minCR by remember { mutableStateOf("") }
    var maxCR by remember { mutableStateOf("") }
    var minExpanded by remember { mutableStateOf(false) }
    var maxExpanded by remember { mutableStateOf(false) }

    val crOptions = listOf("", "0", "1/8", "1/4", "1/2", "1", "2", "3", "4", "5", "6", "7", "8")

    val specialOptions = listOf(
        "", "amphibious", "blindsight", "burrow speed", "cc - blinded", "cc - charmed",
        "cc - deafened", "cc - frightened", "cc - grappled", "cc - incapacitated",
        "cc - invisible", "cc - paralyzed", "cc - petrified", "cc - poisoned", "cc - possessed",
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

    val beastList = statBlocks.filter { it.matchesFilter() }.sortedBy { it.name }
    val summonList = spellEffectOrSummons.filter { it.matchesFilter() }.sortedBy { it.name }

    val filteredItems: List<StatBlockListItem> = buildList {
        addAll(beastList.map { StatBlockListItem.Block(it) })
        if (summonList.isNotEmpty()) {
            add(StatBlockListItem.Header("Spell effects and Summons"))
            addAll(summonList.map { StatBlockListItem.Block(it) })
        }
    }

    Box(Modifier.fillMaxSize()) {
        @Composable
        fun TopLevelAlert(
            message: String,
            onDismiss: () -> Unit
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.5f)) // translucent dim behind
                    .clickable(enabled = true) { onDismiss() }, // dismiss on background tap
                contentAlignment = Alignment.Center
            ) {
                Card(
                    modifier = Modifier
                        .padding(16.dp)
                        .wrapContentSize(),
                    shape = RoundedCornerShape(8.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = message, style = MaterialTheme.typography.titleMedium)
                        Spacer(modifier = Modifier.height(16.dp))
                        Button(onClick = onDismiss) {
                            Text("OK")
                        }
                    }
                }
            }
        }

        Scaffold(
            snackbarHost = {}, // No snackbar host here, handled outside for layering
            content = {
                Column {Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly // evenly space the buttons
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.arrow_back_icon_menu),
                        contentDescription = "Back One Step",
                        modifier = Modifier
                            .size(32.dp)
                            .clickable {
                                val block = selectedStatBlock
                                if (block == null) {
                                    onNavigateToStatblocksByType()
                                    return@clickable
                                }

                                when {
                                    BeastStatBlocks.contains(block) -> onNavigateToBeasts()
                                    AberrationStatBlocks.contains(block) -> onNavigateToAberrations()
                                    CelestialStatBlocks.contains(block) -> onNavigateToCelestials()
                                    ConstructStatBlocks.contains(block) -> onNavigateToConstructs()
                                    DragonStatBlocks.contains(block) -> onNavigateToDragons()
                                    ElementalStatBlocks.contains(block) -> onNavigateToElementals()
                                    FeyStatBlocks.contains(block) -> onNavigateToFey()
                                    FiendStatBlocks.contains(block) -> onNavigateToFiends()
                                    GiantStatBlocks.contains(block) -> onNavigateToGiants()
                                    HalfDragonStatBlocks.contains(block) -> onNavigateToHalfDragons()
                                    HumanoidStatBlocks.contains(block) -> onNavigateToHumanoids()
                                    MonstrosityStatBlocks.contains(block) -> onNavigateToMonstrosities()
                                    OozeStatBlocks.contains(block) -> onNavigateToOozes()
                                    PlantStatBlocks.contains(block) -> onNavigateToPlants()
                                    UndeadStatBlocks.contains(block) -> onNavigateToUndead()
                                    customBlocks.any { it.name == selectedStatBlock?.name } -> onNavigateToCustom()
                                    UncategorizedStatBlocks.contains(block) -> onNavigateToUncategorizedStatblocks()
                                    else -> onNavigateToStatblocksByType()
                                }


                            },
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
                        painter = painterResource(id = R.drawable.inventory_icon_menu),
                        contentDescription = "Inventory",
                        modifier = Modifier
                            .size(32.dp)
                            .clickable { onNavigateToInventory() },
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
                        painter = painterResource(id = R.drawable.home_icon_menu),
                        contentDescription = "Home",
                        modifier = Modifier
                            .size(32.dp)
                            .clickable { onNavigateHome() },
                        tint = Color.White
                    )

                }

                    Text(title, style = MaterialTheme.typography.headlineSmall)
                    Spacer(Modifier.height(8.dp))

                    if (selectedStatBlock == null) {
                        // Filters
                        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            // Min CR Dropdown
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

                            // Max CR Dropdown
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

                        // Special tag filter
                        Box(modifier = Modifier.fillMaxWidth()) {
                            OutlinedButton(onClick = { specialExpanded = true }, modifier = Modifier.fillMaxWidth()) {
                                Text(if (specialFilter.isEmpty()) "Search by Special" else specialFilter)
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

                        // List or Empty State
                        if (filteredItems.isEmpty()) {
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .fillMaxWidth()
                                    .padding(16.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text("Nothing here yet", style = MaterialTheme.typography.bodyLarge)
                            }
                        } else {
                            LazyColumn(modifier = Modifier.weight(1f)) {
                                items(filteredItems, key = {
                                    when (it) {
                                        is StatBlockListItem.Block -> it.statBlock.name ?: it.statBlock.hashCode().toString()
                                        is StatBlockListItem.Header -> it.title
                                    }
                                }) { item ->
                                    when (item) {
                                        is StatBlockListItem.Block -> {
                                            Text(
                                                text = item.statBlock.name ?: "Unnamed",
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .clickable { selectedStatBlock = item.statBlock }
                                                    .padding(16.dp)
                                            )
                                        }
                                        is StatBlockListItem.Header -> {
                                            Text(
                                                text = item.title,
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(vertical = 8.dp, horizontal = 16.dp),
                                                style = MaterialTheme.typography.titleLarge
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        // Selected stat block detail view
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

                    Spacer(Modifier.height(8.dp))

                    // Bottom row with navigation and custom statblock edit/add buttons for "Custom" title
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        Button(onClick = onNavigateBack) {
                            Text("Back to 'by type'")
                        }

                        if (title == "Custom") {
                            if (selectedStatBlock != null && customBlocks.contains(selectedStatBlock)) {
                                Button(onClick = {
                                    editingBlock = selectedStatBlock // Edit mode
                                    showCreateDialog = true
                                }) {
                                    Text("Edit This Statblock")
                                }
                            } else {
                                Button(onClick = {
                                    editingBlock = null // New block
                                    showCreateDialog = true
                                }) {
                                    Text("Add Custom Statblock")
                                }
                            }
                        }
                    }

                    if (selectedStatBlock != null) {
                        Spacer(Modifier.height(8.dp))
                        Row {
                            Button(modifier = Modifier.weight(1f), onClick = { selectedStatBlock = null }) {
                                Text("Back to $title")
                            }
                        }
                    }
                }
            }
        )

        // Your dialog overlays the Scaffold content
        if (showCreateDialog) {
            CreateCustomStatBlockDialog(
                existingBlock = editingBlock,
                onDismiss = {
                    showCreateDialog = false
                    editingBlock = null
                },
                onCreate = { newBlock ->
                    if (customBlocks.any { it.name == newBlock.name && it != editingBlock }) {
                        coroutineScope.launch {
                            snackbarHostState.showSnackbar("A statblock with this name already exists.")
                        }
                    } else {
                        if (editingBlock == null) {
                            CustomStatBlockRepo.add(newBlock, context)
                        } else {
                            CustomStatBlockRepo.update(editingBlock!!, newBlock, context)
                        }
                        showCreateDialog = false
                        editingBlock = null
                    }
                },
                onDelete = {
                    coroutineScope.launch {
                        editingBlock?.let { blockToDelete ->
                            // Remove from Custom Repo
                            CustomStatBlockRepo.remove(blockToDelete, context)

                            // Remove from Menagerie
                            val menagerieEntriesToRemove =
                                MenagerieStatBlocks.filter { it.statBlock == blockToDelete }
                            menagerieEntriesToRemove.forEach { entry ->
                                removeFromMenagerieAndSave(context, entry)
                            }

                            // Remove from Favorites
                            val updatedFavorites =
                                FavoriteManager.favorites.filter { it != blockToDelete }
                            saveFavorites(context, updatedFavorites)
                            FavoriteManager.favorites = updatedFavorites

                            // Reset UI if needed
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
                onNavigateToCustom = onNavigateToCustom // ✅ Pass it as a lambda
            )
        }

        // SnackbarHost drawn last to overlay dialogs and content
        SnackbarHost(
            hostState = snackbarHostState,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(16.dp)
        )
    }
}


