package com.example.wildshapesmountsandfamiliars.ui.screens

import android.content.Context
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.jsonPrimitive

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
    @Serializable(with = DescriptionAsStringSerializer::class)
    val description: String?,
    val tags: String?,
    val source: String?,
    val sortingTag: String?
)

object DescriptionAsStringSerializer : KSerializer<String?> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("description", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): String? {
        val input = decoder as? JsonDecoder ?: error("Can be used only with JSON")
        val element = input.decodeJsonElement()
        return when (element) {
            is JsonArray -> element.joinToString("\n\n") { it.jsonPrimitive.content }
            is JsonPrimitive -> element.content
            else -> null
        }
    }

    override fun serialize(encoder: Encoder, value: String?) {
        if (value != null) encoder.encodeString(value) else encoder.encodeNull()
    }
}

sealed class StatBlockListItem {
    data class Block(val statBlock: StatBlock) : StatBlockListItem()
    data class Header(val title: String) : StatBlockListItem()
}

@Composable
fun StatBlockView(
    statBlock: StatBlock,
    onEditClick: (() -> Unit)? = null
) {
    @Composable
    fun labeledLine(label: String, value: String?) {
        if (!value.isNullOrBlank()) {
            Text("$label: $value")
        }
    }

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = statBlock.name.orEmpty(),
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.weight(1f)
        )
        if (onEditClick != null) {
            IconButton(onClick = onEditClick) {
                Icon(Icons.Default.Edit, contentDescription = "Edit Statblock")
            }
        }

    }

    Spacer(modifier = Modifier.height(8.dp))


    Spacer(modifier = Modifier.height(8.dp))
    Text("${statBlock.size} ${statBlock.type}, ${statBlock.alignment}")
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

val HalfDragonStatBlocks = mutableStateListOf<StatBlock>()
val HalfDragonStatBlockSpellEffectOrSummon = mutableStateListOf<StatBlock>()


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

val Context.dataStore by preferencesDataStore(name = "app_preferences")
val MENAGERIE_KEY = stringPreferencesKey("menagerie_editable_entries")
val FAVORITES_KEY = stringPreferencesKey("favorite_statblocks")
val SPELL_FAVORITES_KEY = stringPreferencesKey("spell_favorites")

