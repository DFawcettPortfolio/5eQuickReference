package com.example.wildshapesmountsandfamiliars.ui.screens.creatureType


import androidx.compose.runtime.Composable
import com.example.wildshapesmountsandfamiliars.ui.screens.AberrationStatBlockSpellEffectOrSummon
import com.example.wildshapesmountsandfamiliars.ui.screens.AberrationStatBlocks
import com.example.wildshapesmountsandfamiliars.ui.screens.CreatureTypeScreen
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.registerAberrationStatBlock

@Composable
fun Aberrations(
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
        title = "Aberrations",
        statBlocks = AberrationStatBlocks,
        spellEffectOrSummons = AberrationStatBlockSpellEffectOrSummon,
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


val aboleth = registerAberrationStatBlock(
    StatBlock(
        name = "Aboleth",
        size = "Large",
        type = "aberration",
        alignment = "lawful evil",
        armorClass = "17 (natural armor)",
        hitPoints = "135 (18d10 + 36)",
        speed = "10 ft., swim 40 ft.",
        str = 21,
        strMod = "+5",
        dex = 9,
        dexMod = "-1",
        con = 15,
        conMod = "+2",
        int = 18,
        intMod = "+4",
        wis = 15,
        wisMod = "+2",
        cha = 18,
        chaMod = "+4",
        skills = "History +12, Perception +10",
        savingThrows = "Con +6, Int +8, Wis +6",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 20",
        languages = "Deep Speech, telepathy 120 ft.",
        challengeRating = "10",
        expValue = "5900",
        proficiencyBonus = "+4",
        traits = listOf(
            "Amphibious. The aboleth can breathe air and water.",
            "Mucous Cloud. While underwater, the aboleth is surrounded by transformative mucus. A creature that touches the aboleth or that hits it with a melee attack while within 5 feet of it must make a DC 14 Constitution saving throw. On a failure, the creature is diseased for 1d4 hours. The diseased creature can breathe only underwater.",
            "Probing Telepathy. If a creature communicates telepathically with the aboleth, the aboleth learns the creature's greatest desires if the aboleth can see the creature."
        ),
        actions = listOf(
            "Multiattack. The aboleth makes three tentacle attacks.",
            "Tentacle. Melee Weapon Attack: +9 to hit, reach 10 ft., one target. Hit: 12 (2d6 + 5) bludgeoning damage. If the target is a creature, it must succeed on a DC 14 Constitution saving throw or become diseased. After 1 minute, the creature’s skin becomes translucent and slimy, can't regain hit points unless underwater, and takes 6 (1d12) acid damage every 10 minutes outside water unless moistened.",
            "Tail. Melee Weapon Attack: +9 to hit, reach 10 ft., one target. Hit: 15 (3d6 + 5) bludgeoning damage.",
            "Enslave (3/Day). The aboleth targets one creature it can see within 30 feet of it. The target must succeed on a DC 14 Wisdom saving throw or be magically charmed by the aboleth until the aboleth dies or until it is on a different plane of existence from the target. The charmed target is under the aboleth's control and can't take reactions, and the aboleth and the target can communicate telepathically with each other over any distance. Whenever the charmed target takes damage, the target can repeat the saving throw. On a success, the effect ends. No more than once every 24 hours, the target can also repeat the saving throw when it is at least 1 mile away from the aboleth."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = listOf(
            "The aboleth can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The aboleth regains spent legendary actions at the start of its turn.",
            "Detect. The aboleth makes a Wisdom (Perception) check.",
            "Tail Swipe. The aboleth makes one tail attack.",
            "Psychic Drain (Costs 2 Actions). One creature charmed by the aboleth takes 10 (3d6) psychic damage, and the aboleth regains hit points equal to the damage dealt."
        ),
        description = null,
        tags = "amphibious, swim speed, darkvision, multiattack, cc - charmed, legendary action, telepathic",
        source = "Monster Manual (SRD)"
    )
)

val chuul = registerAberrationStatBlock(
    StatBlock(
        name = "Chuul",
        size = "Large",
        type = "Aberration",
        alignment = "Chaotic Evil",
        armorClass = "16 (natural armor)",
        hitPoints = "93 (11d10 + 33)",
        speed = "30 ft., swim 30 ft.",
        str = 19, strMod = "+4",
        dex = 10, dexMod = "+0",
        con = 16, conMod = "+3",
        int = 5, intMod = "-3",
        wis = 11, wisMod = "+0",
        cha = 5, chaMod = "-3",
        skills = "Perception +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 14",
        languages = "understands Deep Speech but can't speak",
        challengeRating = "4",
        expValue = "1100",
        proficiencyBonus = "+2",
        traits = listOf(
            "Amphibious. The chuul can breathe air and water.",
            "Sense Magic. The chuul senses magic within 120 feet of it at will. This trait otherwise works like the detect magic spell but isn't itself magical."
        ),
        actions = listOf(
            "Multiattack. The chuul makes two pincer attacks. If the chuul is grappling a creature, the chuul can also use its tentacles once.",
            "Pincer. Melee Weapon Attack: +6 to hit, reach 10 ft., one target. Hit: 11 (2d6 + 4) bludgeoning damage. The target is grappled (escape DC 14) if it is a Large or smaller creature and the chuul doesn't have two other creatures grappled.",
            "Tentacles. One creature grappled by the chuul must succeed on a DC 13 Constitution saving throw or be poisoned for 1 minute. Until this poison ends, the target is paralyzed. The target can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "amphibious, cc - grappled, climb speed, darkvision, damage immunity, condition immunity, multiattack, pack tactics, swim speed, water breathing",
        source = "Monster Manual (SRD)"
    )
)
val cloaker = registerAberrationStatBlock(
    StatBlock(
        name = "Cloaker",
        size = "Large",
        type = "Aberration",
        alignment = "Chaotic Neutral",
        armorClass = "14 (natural armor)",
        hitPoints = "78 (12d10 + 12)",
        speed = "10 ft., fly 40 ft.",
        str = 17, strMod = "+3",
        dex = 15, dexMod = "+2",
        con = 12, conMod = "+1",
        int = 13, intMod = "+1",
        wis = 12, wisMod = "+1",
        cha = 14, chaMod = "+2",
        skills = "Stealth +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 11",
        languages = "Deep Speech, Undercommon",
        challengeRating = "8",
        expValue = "3900",
        proficiencyBonus = "+3",
        traits = listOf(
            "Damage Transfer. While attached to a creature, the cloaker takes only half the damage dealt to it (rounded down), and that creature takes the other half.",
            "False Appearance. While the cloaker remains motionless without its underside exposed, it is indistinguishable from a dark leather cloak.",
            "Light Sensitivity. While in bright light, the cloaker has disadvantage on attack rolls and Wisdom (Perception) checks that rely on sight."
        ),
        actions = listOf(
            "Multiattack. The cloaker makes two attacks: one with its bite and one with its tail.",
            "Bite. Melee Weapon Attack: +6 to hit, reach 5 ft., one creature. Hit: 10 (2d6 + 3) piercing damage, and if the target is Large or smaller, the cloaker attaches to it. If the cloaker has advantage against the target, the cloaker attaches to the target's head, and the target is blinded and unable to breathe while the cloaker is attached. While attached, the cloaker can make this attack only against the target and has advantage on the attack roll. The cloaker can detach itself by spending 5 feet of its movement. A creature, including the target, can take its action to detach the cloaker by succeeding on a DC 16 Strength check.",
            "Tail. Melee Weapon Attack: +6 to hit, reach 10 ft., one creature. Hit: 7 (1d8 + 3) slashing damage.",
            "Moan. Each creature within 60 feet of the cloaker that can hear its moan and that isn't an aberration must succeed on a DC 13 Wisdom saving throw or become frightened until the end of the cloaker's next turn. If a creature's saving throw is successful, the creature is immune to the cloaker's moan for the next 24 hours",
            "Phantasms (Recharges after a Short or Long Rest). The cloaker magically creates three illusory duplicates of itself if it isn't in bright light. The duplicates move with it and mimic its actions, shifting position so as to make it impossible to track which cloaker is the real one. If the cloaker is ever in an area of bright light, the duplicates disappear. Whenever any creature targets the cloaker with an attack or a harmful spell while a duplicate remains, that creature rolls randomly to determine whether it targets the cloaker or one of the duplicates. A creature is unaffected by this magical effect if it can't see or if it relies on senses other than sight. A duplicate has the cloaker's AC and uses its saving throws. If an attack hits a duplicate, or if a duplicate fails a saving throw against an effect that deals damage, the duplicate disappears."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
                tags = "darkvision, fly speed, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val gibberingMouther = registerAberrationStatBlock(
    StatBlock(
        name = "Gibbering Mouther",
        size = "Medium",
        type = "aberration",
        alignment = "neutral",
        armorClass = "9",
        hitPoints = "67 (9d8 + 27)",
        speed = "10 ft., swim 10 ft.",
        str = 10,
        strMod = "+0",
        dex = 8,
        dexMod = "-1",
        con = 16,
        conMod = "+3",
        int = 3,
        intMod = "-4",
        wis = 10,
        wisMod = "+0",
        cha = 6,
        chaMod = "-2",
        savingThrows = null,
        skills = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "prone",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "—",
        challengeRating = "2",
        expValue = "450",
        proficiencyBonus = "+2",
        traits = listOf(
            "Aberrant Ground. The ground in a 10-foot radius around the mouther is doughlike difficult terrain. Each creature that starts its turn in that area must succeed on a DC 10 Strength saving throw or have its Speed reduced to 0 until the start of its next turn.",
            "Gibbering. The mouther babbles incoherently while it can see any creature and isn't incapacitated. Each creature that starts its turn within 20 feet of the mouther and can hear the gibbering must succeed on a DC 10 Wisdom saving throw. On a failure, the creature can't take reactions until the start of its next turn and rolls a d8 to determine what it does during its turn. On a 1 to 4, the creature does nothing. On a 5 or 6, the creature takes no action or bonus action and uses all its movement to move in a randomly determined direction. On a 7 or 8, the creature makes a melee attack against a randomly determined creature within its reach or does nothing if it can't make such an attack."
        ),
        actions = listOf(
            "Multiattack. The gibbering mouther makes one bite attack and, if it can, uses its Blinding Spittle.",
            "Bites. Melee Weapon Attack: +2 to hit, reach 5 ft., one creature. Hit: 17 (5d6) piercing damage. If the target is Medium or smaller, it must succeed on a DC 10 Strength saving throw or be knocked prone. If the target is killed by this damage, it is absorbed into the mouther.",
            "Blinding Spittle (Recharge 5-6). The mouther spits a chemical glob at a point it can see within 15 feet of it. The glob explodes in a blinding flash of light on impact. Each creature within 5 feet of the flash must succeed on a DC 13 Dexterity saving throw or be blinded until the end of the mouther's next turn."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "Monster Manual (SRD)",
        tags = "cc - blinded, cc - prone, darkvision, condition immunity, multiattack, swim speed",
        source = "Monster Manual (SRD)"
    )
)

val mindFlayer = registerAberrationStatBlock(
    StatBlock(
        name = "Mind Flayer",
        size = "Medium",
        type = "aberration",
        alignment = "lawful evil",
        armorClass = "15 (breastplate)",
        hitPoints = "71 (13d8 + 13)",
        speed = "30 ft.",
        str = 11, strMod = "+0",
        dex = 12, dexMod = "+1",
        con = 12, conMod = "+1",
        int = 19, intMod = "+4",
        wis = 17, wisMod = "+3",
        cha = 17, chaMod = "+3",
        skills = "Arcana +7, Deception +6, Insight +6, Perception +6, Persuasion +6, Stealth +4",
        savingThrows = "Int +7, Wis +6, Cha +6",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 16",
        languages = "Deep Speech, Undercommon, telepathy 120 ft.",
        challengeRating = "7",
        expValue = "2900",
        proficiencyBonus = "+3",
        traits = listOf(
            "Magic Resistance. The mind flayer has advantage on saving throws against spells and other magical effects.",
            """Innate Spellcasting (Psionics). The mind flayer's innate spellcasting ability is Intelligence (spell save DC 15). It can innately cast the following spells, requiring no components:

                    At will: detect thoughts, levitate
            1/day each: dominate monster, plane shift (self only)"""
        ),
        actions = listOf(
            "Tentacles. Melee Weapon Attack: +7 to hit, reach 5 ft., one creature. Hit: 15 (2d10 + 4) psychic damage. If the target is Medium or smaller, it is grappled (escape DC 15) and must succeed on a DC 15 Intelligence saving throw or be stunned until this grapple ends.",
            "Extract Brain. Melee Weapon Attack: +7 to hit, reach 5 ft., one incapacitated humanoid grappled by the mind flayer. Hit: The target takes 55 (10d10) piercing damage. If this damage reduces the target to 0 hit points, the mind flayer kills the target by extracting and devouring its brain.",
            "Mind Blast (Recharge 5–6). The mind flayer magically emits psychic energy in a 60-foot cone. Each creature in that area must succeed on a DC 15 Intelligence saving throw or take 22 (4d8 + 4) psychic damage and be stunned for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "Psionic tyrants, slavers, and interdimensional voyagers, mind flayers are insidious masterminds that harvest entire races for their own twisted ends.",
        tags = "cc - grappled, cc - stunned, darkvision, magic resistance, telepathic",
        source = "Monster Manual (SRD)"
    )
)

val otyugh = registerAberrationStatBlock(
    StatBlock(
        name = "Otyugh",
        size = "Large",
        type = "aberration",
        alignment = "neutral",
        armorClass = "14 (natural armor)",
        hitPoints = "114 (12d10 + 48)",
        speed = "30 ft.",
        str = 16, strMod = "+3",
        dex = 11, dexMod = "+0",
        con = 19, conMod = "+4",
        int = 6, intMod = "-2",
        wis = 13, wisMod = "+1",
        cha = 6, chaMod = "-2",
        skills = null,
        savingThrows = "Con +7",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 11",
        languages = "Otyugh",
        challengeRating = "5",
        expValue = "1800",
        proficiencyBonus = "+3",
        traits = listOf(
            "Limited Telepathy. The otyugh can magically transmit simple messages and images to any creature within 120 feet of it that can understand a language. This form of telepathy doesn't allow the receiving creature to telepathically respond."
        ),
        actions = listOf(
            "Multiattack. The otyugh makes three attacks: one with its bite and two with its tentacles.",
            "Bite. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 12 (2d8 + 3) piercing damage. If the target is a creature, it must succeed on a DC 15 Constitution saving throw against disease or become poisoned until the disease is cured. Every 24 hours that elapse, the target must repeat the saving throw, reducing its hit point maximum by 5 (1d10) on a failure. The disease is cured on a success. The target dies if the disease reduces its hit point maximum to 0. This reduction to the target's hit point maximum lasts until the disease is cured.",
            "Tentacle. Melee Weapon Attack: +6 to hit, reach 10 ft., one target. Hit: 7 (1d8 + 3) bludgeoning damage plus 4 (1d8) piercing damage. If the target is Medium or smaller, it is grappled (escape DC 13) and restrained until the grapple ends. The otyugh has two tentacles, each of which can grapple one target.",
            "Tentacle Slam. The otyugh slams creatures grappled by it into each other or a solid surface. Each creature must succeed on a DC 14 Constitution saving throw or take 10 (2d6 + 3) bludgeoning damage and be stunned until the end of the otyugh's next turn. On a successful save, the target takes half the bludgeoning damage and isn't stunned."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "cc - grappled, cc - poisoned, cc - restrained, cc - stunned, darkvision, multiattack, telepathic",
        source = "Monster Manual (SRD)"
    )
)