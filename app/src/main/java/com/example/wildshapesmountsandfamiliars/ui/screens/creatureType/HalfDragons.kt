package com.example.wildshapesmountsandfamiliars.ui.screens.creatureType


import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.example.wildshapesmountsandfamiliars.ui.screens.CreatureTypeScreen
import com.example.wildshapesmountsandfamiliars.ui.screens.HalfDragonStatBlockSpellEffectOrSummon
import com.example.wildshapesmountsandfamiliars.ui.screens.HalfDragonStatBlocks
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.crToDecimal
import com.example.wildshapesmountsandfamiliars.ui.screens.loadCreatures
import com.example.wildshapesmountsandfamiliars.ui.screens.registerHalfDragonStatBlock

@Composable
fun HalfDragons(
    onNavigateHome: () -> Unit,
    onNavigateToStatblocksByType: () -> Unit,
    onNavigateToCustom: () -> Unit,
    onNavigateToFavorites: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit,
    onNavigateToSearchResults:() -> Unit,
    onNavigateToNotekeeping: () -> Unit,
    context: Context
) {
    // ✅ Ensure variants are registered before displaying the screen
    LaunchedEffect(Unit) {
        if (HalfDragonStatBlocks.isEmpty()) {
            registerAllHalfDragonVariants(context)
        }
    }


    CreatureTypeScreen(
        title = "Half-Dragons",
        statBlocks = HalfDragonStatBlocks,
        spellEffectOrSummons = HalfDragonStatBlockSpellEffectOrSummon,
        onNavigateHome = onNavigateHome,
        onNavigateToCustom = onNavigateToCustom,
        onNavigateToFavorites = onNavigateToFavorites,
        onNavigateToMenagerie = onNavigateToMenagerie,
        onNavigateToInventory = onNavigateToInventory,
        onNavigateToRulesQuickGuide = onNavigateToRulesQuickGuide,
        onNavigateToStatblocksByType = onNavigateToStatblocksByType,
        onNavigateToSearchResults =  onNavigateToSearchResults,
        onNavigateToNotekeeping = onNavigateToNotekeeping,
    )
}


fun applyHalfDragonTemplate(
    creatures: List<StatBlock>,
    dragonColor: String
): List<StatBlock> {
    val damageResistance = when (dragonColor.lowercase()) {
        "black", "copper" -> "acid"
        "blue", "bronze" -> "lightning"
        "brass", "gold", "red" -> "fire"
        "green" -> "poison"
        "silver", "white" -> "cold"
        else -> null
    }

    val validSortingTags = listOf(
        "beast", "giant", "humanoid", "monstrosity", "custom"
    )

    return creatures.filter {
        val tag = it.sortingTag?.lowercase() ?: it.type?.lowercase()
        tag in validSortingTags
    }.mapNotNull { original ->

        val crValue = original.challengeRating?.toDoubleOrNull() ?: 0.0
        val size = original.size ?: ""

        val breathWeapon = when {
            size.equals("huge", ignoreCase = true) && crValue >= 7 -> "Breath Weapon (Young Dragon): Recharge 5–6, 30 ft. cone or line, 10d8 damage."
            size.equals("gargantuan", ignoreCase = true) && crValue >= 8 -> "Breath Weapon (Adult Dragon): Recharge 5–6, 60 ft. cone or line, 16d8 damage."
            crValue >= 2 -> "Breath Weapon (Wyrmling): Recharge 5–6, 15 ft. cone or line, 7d6 damage."
            else -> null
        }

        if (breathWeapon == null) return@mapNotNull null

        original.copy(
            name = "Half-$dragonColor Dragon ${original.name}",
            damageResistances = listOfNotNull(original.damageResistances, damageResistance)
                .joinToString(", "),
            senses = listOfNotNull(original.senses, "blindsight 10 ft.", "darkvision 60 ft.")
                .joinToString(", "),
            languages = listOfNotNull(original.languages, "Draconic")
                .joinToString(", "),
            actions = (original.actions ?: emptyList()) + listOf(breathWeapon),
            tags = (original.tags ?: "") + ", half-dragon, breath weapon",
            source = (original.source ?: "") + " + Half-Dragon Template"
        )
    }
}

fun registerAllHalfDragonVariants(context: Context) {
    HalfDragonStatBlocks.clear()

    val allCreatures = loadCreatures(context)
    val sourceCreatures = allCreatures.filter {
        it.type in listOf("beast", "giant", "humanoid", "monstrosity")
    }

    val dragonColors = listOf(
        "Black", "Blue", "Brass", "Bronze", "Copper",
        "Gold", "Green", "Red", "Silver", "White"
    )

    for (color in dragonColors) {
        val halfDragonBlocks = applyHalfDragonTemplate(sourceCreatures, color)
        halfDragonBlocks.forEach { registerHalfDragonStatBlock(it) }
    }

    HalfDragonStatBlocks.sortWith(compareBy({ crToDecimal(it.challengeRating ?: "0") }, { it.name ?: "" }))
}













/*
A beast, humanoid, giant, or monstrosity can become a half-dragon. It keeps its statistics, except as follow.

Challenge. To avoid recalculating the creature's challenge rating, apply the template only to a creature that meets the options prerequisite in the Breath Weapon table below. Otherwise, recalculate the rating after you apply the template.

Senses. The half-dragon gains blindsight with a radius of 10 feet and darkvision with a radius of 60 feet.

Resistances. The half-dragon gains resistance to a type of damage based on its color.
Color	                Damage Resistance
Black or copper	        Acid
Blue or bronze	        Lightning
Brass, gold, or red	    Fire
Green	                Poison
Silver or white	        Cold
Languages. The half-dragon speaks Draconic in addition to any other languages it knows.

New Action: Breath Weapon. The half-dragon has the breath weapon of its dragon half. The half-dragon's size determines how this action functions.
Size	            Breath Weapon	    Optional Prerequisite
Large or Smaller	As a wyrmling	    Challenge 2 or higher
Huge	            As a young dragon	Challenge 7 or higher
Gargantuan	        As an adult dragon	Challenge 8 or higher



Half-Red	Dragon	Veteran
Medium	humanoid	(human),	any	alignment
Armor	Class 18	(plate)
Hit	Points 65	(10d8	+	20)
Speed 30	ft.
STR DEX CON INT WIS CHA
16	(+3) 13	(+1) 14	(+2) 10	(+0) 11	(+0) 10	(+0)
Skills Athletics	+5,	Perception	+2
Damage	Resistances fire
Senses blindsight	10	ft.,	darkvision	60	ft.,	passive
Perception	12
Languages Common,	Draconic
Challenge 5	(1,800	XP)
Actions
Multiattack.	The	veteran	makes	two	longsword	attacks.
If	it	has	a	shortsword	drawn,	it	can	also	make	a
shortsword	attack.
Longsword.	Melee	Weapon	Attack: +5	to	hit,	reach	5	ft.,
one	target.	Hit: 7	(1d8	+	3)	slashing	damage,	or	8	(1d10
+	3)	slashing	damage	if	used	with	two	hands.
Shortsword.	Melee	Weapon	Attack: +5	to	hit, reach	5
ft.,	one	target.	Hit: 6	(1d6	+	3)	piercing	damage.
Heavy	Crossbow. Ranged	Weapon	Attack: +3	to	hit,
range	100/400	ft.,	one	target.	Hit: 6	(1d10	+	1)	piercing
damage.
Fire	Breath	(Recharge	5–6).	The	veteran	exhales	fire	in
a	15-foot	cone.	Each	creature	in	that	area	must	make	a
DC	15	Dexterity	saving	throw,	taking	24	(7d6)	fire
damage	on	a	failed	save,	or	half	as	much	damage	on	a
successful	one.

Source (Player's Handbook SRD)
*/

