package com.example.wildshapesmountsandfamiliars.ui.screens.creatureType

import androidx.compose.runtime.Composable
import com.example.wildshapesmountsandfamiliars.ui.screens.BeastStatBlockSpellEffectOrSummon
import com.example.wildshapesmountsandfamiliars.ui.screens.BeastStatBlocks
import com.example.wildshapesmountsandfamiliars.ui.screens.CreatureTypeScreen
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.registerBeastStatBlock

@Composable
fun Beasts(
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
    val sortedBaseBeasts = BeastStatBlocks.sortedBy { it.name }
    val sortedSpellBeasts = BeastStatBlockSpellEffectOrSummon.sortedBy { it.name }

    val combinedBeasts = sortedBaseBeasts + sortedSpellBeasts

    CreatureTypeScreen(
        title = "Beasts",
        statBlocks = BeastStatBlocks,
        spellEffectOrSummons = BeastStatBlockSpellEffectOrSummon,
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

val ape = registerBeastStatBlock(
    StatBlock(
        name = "Ape",
        size = "Medium",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "19 (3d8 + 6)",
        speed = "30 ft., climb 30 ft.",
        str = 16, strMod = "+3",
        dex = 14, dexMod = "+2",
        con = 14, conMod = "+2",
        int = 6, intMod = "-2",
        wis = 12, wisMod = "+1",
        cha = 7, chaMod = "-2",
        skills = "Athletics +5, Perception +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "—",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = null,
        actions = listOf(
            "Multiattack. The ape makes two fist attacks.",
            "Fist. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 6 (1d6 + 3) bludgeoning damage.",
            "Rock. Ranged Weapon Attack: +5 to hit, range 25/50 ft., one target. Hit: 6 (1d6 + 3) bludgeoning damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "climb speed, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val axeBeak = registerBeastStatBlock(
    StatBlock(
        name = "Axe Beak",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "11",
        hitPoints = "19 (3d10 + 3)",
        speed = "50 ft.",
        str = 14, strMod = "+2",
        dex = 12, dexMod = "+1",
        con = 12, conMod = "+1",
        int = 2, intMod = "-4",
        wis = 10, wisMod = "+0",
        cha = 5, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = null,
        actions = listOf(
            "Beak. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 6 (1d8 + 2) slashing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "An axe beak is a tall flightless bird with strong legs, a wedge-shaped beak, and a nasty disposition.",
        tags = "none",
        source = "Monster Manual (SRD)"
    )
)

val baboon = registerBeastStatBlock(
    StatBlock(
        name = "Baboon",
        size = "Small",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "3 (1d6)",
        speed = "30 ft., climb 30 ft.",
        str = 8, strMod = "-1",
        dex = 14, dexMod = "+2",
        con = 11, conMod = "+0",
        int = 4, intMod = "-3",
        wis = 12, wisMod = "+1",
        cha = 6, chaMod = "-2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 11",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Pack Tactics. The baboon has advantage on an attack roll against a creature if at least one of the baboon's allies is within 5 feet of the creature and the ally isn't incapacitated."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +1 to hit, reach 5 ft., one target. Hit: 1 (1d4 - 1) piercing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "climb speed, pack tactics",
        source = "Monster Manual (SRD)"
    )
)

val badger = registerBeastStatBlock(
    StatBlock(
        name = "Badger",
        size = "Tiny",
        type = "beast",
        alignment = "unaligned",
        armorClass = "10",
        hitPoints = "3 (1d4 + 1)",
        speed = "20 ft., burrow 5 ft.",
        str = 4, strMod = "-3",
        dex = 11, dexMod = "+0",
        con = 12, conMod = "+1",
        int = 2, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 5, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 30 ft., passive Perception 11",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Smell. The badger has advantage on Wisdom (Perception) checks that rely on smell."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +2 to hit, reach 5 ft., one target. Hit: 1 piercing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "burrow speed, darkvision, keen smell",
        source = "Monster Manual (SRD)"
    )
)

val bat = registerBeastStatBlock(
    StatBlock(
        name = "Bat",
        size = "Tiny",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "1 (1d4 - 1)",
        speed = "5 ft., fly 30 ft.",
        str = 2, strMod = "-4",
        dex = 15, dexMod = "+2",
        con = 8, conMod = "-1",
        int = 2, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 4, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 60 ft., passive Perception 11",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Echolocation. The bat can't use its blindsight while deafened.",
            "Keen Hearing. The bat has advantage on Wisdom (Perception) checks that rely on hearing."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +0 to hit, reach 5 ft., one creature. Hit: 1 piercing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "blindsight, fly speed, keen hearing",
        source = "Monster Manual (SRD)"
    )
)

val blackBear = registerBeastStatBlock(
    StatBlock(
        name = "Black Bear",
        size = "Medium",
        type = "beast",
        alignment = "unaligned",
        armorClass = "11 (natural armor)",
        hitPoints = "19 (3d8 + 6)",
        speed = "40 ft., climb 30 ft.",
        str = 15, strMod = "+2",
        dex = 10, dexMod = "+0",
        con = 14, conMod = "+2",
        int = 2, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 7, chaMod = "-2",
        skills = "Perception +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "—",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Smell. The bear has advantage on Wisdom (Perception) checks that rely on smell.",
            "Multiattack. The bear makes two attacks: one with its bite and one with its claws."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 5 (1d6 + 2) piercing damage.",
            "Claws. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 7 (2d4 + 2) slashing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "multiattack, climb speed, keen smell",
        source = "Monster Manual (SRD)"
    )
)

val bloodHawk = registerBeastStatBlock(
    StatBlock(
        name = "Blood Hawk",
        size = "Small",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "7 (2d6)",
        speed = "10 ft., fly 60 ft.",
        str = 6, strMod = "-2",
        dex = 14, dexMod = "+2",
        con = 10, conMod = "+0",
        int = 3, intMod = "-4",
        wis = 14, wisMod = "+2",
        cha = 5, chaMod = "-3",
        skills = "Perception +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 14",
        languages = "—",
        challengeRating = "1/8",
        expValue = "25 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Sight. The hawk has advantage on Wisdom (Perception) checks that rely on sight.",
            "Pack Tactics. The hawk has advantage on an attack roll against a creature if at least one of the hawk's allies is within 5 feet of the creature and the ally isn't incapacitated."
        ),
        actions = listOf(
            "Beak. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 4 (1d4 + 2) piercing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "Taking its name from its crimson feathers and aggressive nature, the blood hawk fearlessly attacks with its daggerlike beak.",
        tags = "fly speed, keen sight, pack tactics",
        source = "Monster Manual (SRD)"
    )
)

val boar = registerBeastStatBlock(
    StatBlock(
        name = "Boar",
        size = "Medium",
        type = "beast",
        alignment = "unaligned",
        armorClass = "11 (natural armor)",
        hitPoints = "11 (2d8 + 2)",
        speed = "40 ft.",
        str = 13, strMod = "+1",
        dex = 11, dexMod = "+0",
        con = 12, conMod = "+1",
        int = 2, intMod = "-4",
        wis = 9, wisMod = "-1",
        cha = 5, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 9",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Charge. If the boar moves at least 20 feet straight toward a target and then hits it with a tusk attack on the same turn, the target takes an extra 3 (1d6) slashing damage. If the target is a creature, it must succeed on a DC 11 Strength saving throw or be knocked prone.",
            "Relentless (Recharges after a Short or Long Rest). If the boar takes 7 damage or less that would reduce it to 0 hit points, it is reduced to 1 hit point instead."
        ),
        actions = listOf(
            "Tusk. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 4 (1d6 + 1) slashing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val brownBear = registerBeastStatBlock(
    StatBlock(
        name = "Brown Bear",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "11 (natural armor)",
        hitPoints = "34 (4d10 + 12)",
        speed = "40 ft., climb 30 ft.",
        str = 19, strMod = "+4",
        dex = 10, dexMod = "+0",
        con = 16, conMod = "+3",
        int = 2, intMod = "-4",
        wis = 13, wisMod = "+1",
        cha = 7, chaMod = "-2",
        skills = "Perception +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "—",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Smell. The bear has advantage on Wisdom (Perception) checks that rely on smell.",
            "Multiattack. The bear makes two attacks: one with its bite and one with its claws."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 8 (1d8 + 4) piercing damage.",
            "Claws. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 11 (2d6 + 4) slashing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "multiattack, climb speed, keen smell",
        source = "Monster Manual (SRD)"
    )
)

val camel = registerBeastStatBlock(
    StatBlock(
        name = "Camel",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "9",
        hitPoints = "15 (2d10 + 4)",
        speed = "50 ft.",
        str = 16, strMod = "+3",
        dex = 8, dexMod = "-1",
        con = 14, conMod = "+2",
        int = 2, intMod = "-4",
        wis = 8, wisMod = "-1",
        cha = 5, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 9",
        languages = "—",
        challengeRating = "1/8",
        expValue = "25 XP",
        proficiencyBonus = null,
        traits = null,
        actions = listOf(
            "Bite. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 2 (1d4) bludgeoning damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "none",
        source = "Monster Manual (SRD)"
    )
)

val cat = registerBeastStatBlock(
    StatBlock(
        name = "Cat",
        size = "Tiny",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "2 (1d4)",
        speed = "40 ft., climb 30 ft.",
        str = 3, strMod = "-4",
        dex = 15, dexMod = "+2",
        con = 10, conMod = "+0",
        int = 3, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 7, chaMod = "-2",
        skills = "Perception +3, Stealth +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Smell. The cat has advantage on Wisdom (Perception) checks that rely on smell."
        ),
        actions = listOf(
            "Claws. Melee Weapon Attack: +0 to hit, reach 5 ft., one target. Hit: 1 slashing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "climb speed, keen smell",
        source = "Monster Manual (SRD)"
    )
)

val constrictorSnake = registerBeastStatBlock(
    StatBlock(
        name = "Constrictor Snake",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "13 (2d10 + 2)",
        speed = "30 ft., swim 30 ft.",
        str = 15, strMod = "+2",
        dex = 14, dexMod = "+2",
        con = 12, conMod = "+1",
        int = 1, intMod = "-5",
        wis = 10, wisMod = "+0",
        cha = 3, chaMod = "-4",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 10 ft., passive Perception 10",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = null,
        actions = listOf(
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one creature. Hit: 5 (1d6 + 2) piercing damage.",
            "Constrict. Melee Weapon Attack: +4 to hit, reach 5 ft., one creature. Hit: 6 (1d8 + 2) bludgeoning damage, and the target is grappled (escape DC 14). Until this grapple ends, the creature is restrained, and the snake can't constrict another target."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "blindsight, cc - grappled, cc - restrained, swim speed",
        source = "Monster Manual (SRD)"
    )
)

val crab = registerBeastStatBlock(
    StatBlock(
        name = "Crab",
        size = "Tiny",
        type = "beast",
        alignment = "unaligned",
        armorClass = "11 (natural armor)",
        hitPoints = "2 (1d4)",
        speed = "20 ft., swim 20 ft.",
        str = 2, strMod = "-4",
        dex = 11, dexMod = "+0",
        con = 10, conMod = "+0",
        int = 1, intMod = "-5",
        wis = 8, wisMod = "-1",
        cha = 2, chaMod = "-4",
        skills = "Stealth +2",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 30 ft., passive Perception 9",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The crab can breathe air and water."
        ),
        actions = listOf(
            "Claw. Melee Weapon Attack: +0 to hit, reach 5 ft., one target. Hit: 1 bludgeoning damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "amphibious, blindsight, swim speed, water breathing",
        source = "Monster Manual (SRD)"
    )
)

val crocodile = registerBeastStatBlock(
    StatBlock(
        name = "Crocodile",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12 (natural armor)",
        hitPoints = "19 (3d10 + 3)",
        speed = "20 ft., swim 30 ft.",
        str = 15, strMod = "+2",
        dex = 10, dexMod = "+0",
        con = 13, conMod = "+1",
        int = 2, intMod = "-4",
        wis = 10, wisMod = "+0",
        cha = 5, chaMod = "-3",
        skills = "Stealth +2",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "—",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Hold Breath. The crocodile can hold its breath for 15 minutes."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one creature. Hit: 7 (1d10 + 2) piercing damage, and the target is grappled (escape DC 12). Until this grapple ends, the target is restrained, and the crocodile can't bite another target."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "hold breath, swim speed, cc - grappled, cc - restrained",
        source = "Monster Manual (SRD)"
    )
)

val deer = registerBeastStatBlock(
    StatBlock(
        name = "Deer",
        size = "Medium",
        type = "beast",
        alignment = "unaligned",
        armorClass = "13",
        hitPoints = "4 (1d8)",
        speed = "50 ft.",
        str = 11, strMod = "+0",
        dex = 16, dexMod = "+3",
        con = 11, conMod = "+0",
        int = 2, intMod = "-4",
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
        senses = "passive Perception 12",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = null,
        actions = listOf(
            "Bite. Melee Weapon Attack: +2 to hit, reach 5 ft., one target. Hit: 2 (1d4) piercing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "none",
        source = "Monster Manual (SRD)"
    )
)

val direWolf = registerBeastStatBlock(
    StatBlock(
        name = "Dire Wolf",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "14 (natural armor)",
        hitPoints = "37 (5d10 + 10)",
        speed = "50 ft.",
        str = 17, strMod = "+3",
        dex = 15, dexMod = "+2",
        con = 15, conMod = "+2",
        int = 3, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 7, chaMod = "-2",
        skills = "Perception +3, Stealth +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "—",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Hearing and Smell. The wolf has advantage on Wisdom (Perception) checks that rely on hearing or smell.",
            "Pack Tactics. The wolf has advantage on an attack roll against a creature if at least one of the wolf's allies is within 5 feet of the creature and the ally isn't incapacitated."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 10 (2d6 + 3) piercing damage. If the target is a creature, it must succeed on a DC 13 Strength saving throw or be knocked prone."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "keen hearing, keen smell, pack tactics, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val draftHorse = registerBeastStatBlock(
    StatBlock(
        name = "Draft Horse",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "10",
        hitPoints = "19 (3d10 + 3)",
        speed = "40 ft.",
        str = 18, strMod = "+4",
        dex = 10, dexMod = "+0",
        con = 12, conMod = "+1",
        int = 2, intMod = "-4",
        wis = 11, wisMod = "+0",
        cha = 7, chaMod = "-2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = null,
        actions = listOf(
            "Hooves. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 9 (2d4 + 4) bludgeoning damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "none",
        source = "Monster Manual (SRD)"
    )
)

val eagle = registerBeastStatBlock(
    StatBlock(
        name = "Eagle",
        size = "Small",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "3 (1d6)",
        speed = "10 ft., fly 60 ft.",
        str = 6, strMod = "-2",
        dex = 15, dexMod = "+2",
        con = 10, conMod = "+0",
        int = 2, intMod = "-4",
        wis = 14, wisMod = "+2",
        cha = 7, chaMod = "-2",
        skills = "Perception +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 14",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Sight. The eagle has advantage on Wisdom (Perception) checks that rely on sight."
        ),
        actions = listOf(
            "Talons. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 4 (1d4 + 2) slashing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "fly speed, keen sight",
        source = "Monster Manual (SRD)"
    )
)

val elephant = registerBeastStatBlock(
    StatBlock(
        name = "Elephant",
        size = "Huge",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12 (natural armor)",
        hitPoints = "76 (8d12 + 24)",
        speed = "40 ft.",
        str = 22, strMod = "+6",
        dex = 9, dexMod = "-1",
        con = 17, conMod = "+3",
        int = 3, intMod = "-4",
        wis = 11, wisMod = "+0",
        cha = 6, chaMod = "-2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "—",
        challengeRating = "4",
        expValue = "1100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Trampling Charge. If the elephant moves at least 20 feet straight toward a creature and then hits it with a gore attack on the same turn, that target must succeed on a DC 12 Strength saving throw or be knocked prone. If the target is prone, the elephant can make one stomp attack against it as a bonus action."
        ),
        actions = listOf(
            "Gore. Melee Weapon Attack: +8 to hit, reach 5 ft., one target. Hit: 19 (3d8 + 6) piercing damage.",
            "Stomp. Melee Weapon Attack: +8 to hit, reach 5 ft., one prone creature. Hit: 22 (3d10 + 6) bludgeoning damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val elk = registerBeastStatBlock(
    StatBlock(
        name = "Elk",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "10",
        hitPoints = "13 (2d10 + 2)",
        speed = "50 ft.",
        str = 16, strMod = "+3",
        dex = 10, dexMod = "+0",
        con = 12, conMod = "+1",
        int = 2, intMod = "-4",
        wis = 10, wisMod = "+0",
        cha = 6, chaMod = "-2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Charge. If the elk moves at least 20 feet straight toward a target and then hits it with a ram attack on the same turn, the target takes an extra 7 (2d6) damage. If the target is a creature, it must succeed on a DC 13 Strength saving throw or be knocked prone."
        ),
        actions = listOf(
            "Ram. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 6 (1d6 + 3) bludgeoning damage.",
            "Hooves. Melee Weapon Attack: +5 to hit, reach 5 ft., one prone creature. Hit: 8 (2d4 + 3) bludgeoning damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val flyingSnake = registerBeastStatBlock(
    StatBlock(
        name = "Flying Snake",
        size = "Tiny",
        type = "beast",
        alignment = "unaligned",
        armorClass = "14",
        hitPoints = "5 (2d4)",
        speed = "30 ft., fly 60 ft., swim 30 ft.",
        str = 4, strMod = "-3",
        dex = 18, dexMod = "+4",
        con = 11, conMod = "+0",
        int = 2, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 5, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 10 ft., passive Perception 11",
        languages = "—",
        challengeRating = "1/8",
        expValue = "25 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Flyby. The snake doesn't provoke opportunity attacks when it flies out of an enemy's reach."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 1 piercing damage plus 7 (3d4) poison damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "A flying snake is a brightly colored, winged serpent found in remote jungles.",
        tags = "blindsight, flyby, fly speed, swim speed",
        source = "Monster Manual (SRD)"
    )
)

val frog = registerBeastStatBlock(
    StatBlock(
        name = "Frog",
        size = "Tiny",
        type = "beast",
        alignment = "unaligned",
        armorClass = "11",
        hitPoints = "1 (1d4 - 1)",
        speed = "20 ft., swim 20 ft.",
        str = 1, strMod = "-5",
        dex = 13, dexMod = "+1",
        con = 8, conMod = "-1",
        int = 1, intMod = "-5",
        wis = 8, wisMod = "-1",
        cha = 3, chaMod = "-4",
        skills = "Perception +1, Stealth +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 30 ft., passive Perception 11",
        languages = "—",
        challengeRating = "0",
        expValue = "0 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The frog can breathe air and water.",
            "Standing Leap. The frog's long jump is up to 10 feet and its high jump is up to 5 feet, with or without a running start."
        ),
        actions = emptyList(),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "A frog has no effective attacks. It feeds on small insects and typically dwells near water, in trees, or underground.",
        tags = "amphibious, water breathing, swim speed, darkvision",
        source = "Monster Manual (SRD)"
    )
)

val giantApe = registerBeastStatBlock(
    StatBlock(
        name = "Giant Ape",
        size = "Huge",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "157 (15d12 + 60)",
        speed = "40 ft., climb 40 ft.",
        str = 23, strMod = "+6",
        dex = 14, dexMod = "+2",
        con = 18, conMod = "+4",
        int = 7, intMod = "-2",
        wis = 12, wisMod = "+1",
        cha = 7, chaMod = "-2",
        skills = "Athletics +9, Perception +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 14",
        languages = "—",
        challengeRating = "7",
        expValue = "2900 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Multiattack. The ape makes two fist attacks."
        ),
        actions = listOf(
            "Fist. Melee Weapon Attack: +9 to hit, reach 10 ft., one target. Hit: 22 (3d10 + 6) bludgeoning damage.",
            "Rock. Ranged Weapon Attack: +9 to hit, range 50/100 ft., one target. Hit: 30 (7d6 + 6) bludgeoning damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "climb speed, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val giantBadger = registerBeastStatBlock(
    StatBlock(
        name = "Giant Badger",
        size = "Medium",
        type = "beast",
        alignment = "unaligned",
        armorClass = "10",
        hitPoints = "13 (2d8 + 4)",
        speed = "30 ft., burrow 10 ft.",
        str = 13, strMod = "+1",
        dex = 10, dexMod = "+0",
        con = 15, conMod = "+2",
        int = 2, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 5, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 30 ft., passive Perception 11",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Smell. The badger has advantage on Wisdom (Perception) checks that rely on smell.",
            "Multiattack. The badger makes two attacks: one with its bite and one with its claws."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 4 (1d6 + 1) piercing damage.",
            "Claws. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 6 (2d4 + 1) slashing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "darkvision, burrow speed, multiattack, keen smell",
        source = "Monster Manual (SRD)"
    )
)

val giantBat = registerBeastStatBlock(
    StatBlock(
        name = "Giant Bat",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "13",
        hitPoints = "22 (4d10)",
        speed = "10 ft., fly 60 ft.",
        str = 15, strMod = "+2",
        dex = 16, dexMod = "+3",
        con = 11, conMod = "+0",
        int = 2, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 6, chaMod = "-2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 60 ft., passive Perception 11",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Echolocation. The bat can't use its blindsight while deafened.",
            "Keen Hearing. The bat has advantage on Wisdom (Perception) checks that rely on hearing."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one creature. Hit: 5 (1d6 + 2) piercing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "blindsight, fly speed, keen hearing",
        source = "Monster Manual (SRD)"
    )
)

val giantBoar = registerBeastStatBlock(
    StatBlock(
        name = "Giant Boar",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12 (natural armor)",
        hitPoints = "42 (5d10 + 15)",
        speed = "40 ft.",
        str = 17, strMod = "+3",
        dex = 10, dexMod = "+0",
        con = 16, conMod = "+3",
        int = 2, intMod = "-4",
        wis = 7, wisMod = "-2",
        cha = 5, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 8",
        languages = "—",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Charge. If the boar moves at least 20 feet straight toward a target and then hits it with a tusk attack on the same turn, the target takes an extra 7 (2d6) slashing damage. If the target is a creature, it must succeed on a DC 13 Strength saving throw or be knocked prone.",
            "Relentless (Recharges after a Short or Long Rest). If the boar takes 10 damage or less that would reduce it to 0 hit points, it is reduced to 1 hit point instead."
        ),
        actions = listOf(
            "Tusk. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 10 (2d6 + 3) slashing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val giantCentipede = registerBeastStatBlock(
    StatBlock(
        name = "Giant Centipede",
        size = "Small",
        type = "beast",
        alignment = "unaligned",
        armorClass = "13 (natural armor)",
        hitPoints = "4 (1d6 + 1)",
        speed = "30 ft., climb 30 ft.",
        str = 5, strMod = "-3",
        dex = 14, dexMod = "+2",
        con = 12, conMod = "+1",
        int = 1, intMod = "-5",
        wis = 7, wisMod = "-2",
        cha = 3, chaMod = "-4",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 30 ft., passive Perception 8",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = null,
        actions = listOf(
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one creature. Hit: 4 (1d4 + 2) piercing damage, and the target must succeed on a DC 11 Constitution saving throw or take 10 (3d6) poison damage. If the poison damage reduces the target to 0 hit points, the target is stable but poisoned for 1 hour, even after regaining hit points, and is paralyzed while poisoned in this way."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "blindsight, climb speed, cc - paralyzed, cc - poisoned",
        source = "Monster Manual (SRD)"
    )
)

val giantConstrictorSnake = registerBeastStatBlock(
    StatBlock(
        name = "Giant Constrictor Snake",
        size = "Huge",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "60 (8d12 + 8)",
        speed = "30 ft., swim 30 ft.",
        str = 19, strMod = "+4",
        dex = 14, dexMod = "+2",
        con = 12, conMod = "+1",
        int = 1, intMod = "-5",
        wis = 10, wisMod = "+0",
        cha = 3, chaMod = "-4",
        skills = "Perception +2",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 10 ft., passive Perception 12",
        languages = "—",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = null,
        actions = listOf(
            "Bite. Melee Weapon Attack: +6 to hit, reach 10 ft., one creature. Hit: 11 (2d6 + 4) piercing damage.",
            "Constrict. Melee Weapon Attack: +6 to hit, reach 5 ft., one creature. Hit: 13 (2d8 + 4) bludgeoning damage, and the target is grappled (escape DC 16). Until this grapple ends, the creature is restrained, and the snake can't constrict another target."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "blindsight, swim speed, cc - grappled, cc - restrained",
        source = "Monster Manual (SRD)"
    )
)

val giantCrab = registerBeastStatBlock(
    StatBlock(
        name = "Giant Crab",
        size = "Medium",
        type = "beast",
        alignment = "unaligned",
        armorClass = "15 (natural armor)",
        hitPoints = "13 (3d8)",
        speed = "30 ft., swim 30 ft.",
        str = 13, strMod = "+1",
        dex = 15, dexMod = "+2",
        con = 11, conMod = "+0",
        int = 1, intMod = "-5",
        wis = 9, wisMod = "-1",
        cha = 3, chaMod = "-4",
        skills = "Stealth +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 30 ft., passive Perception 9",
        languages = "—",
        challengeRating = "1/8",
        expValue = "25 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The crab can breathe air and water."
        ),
        actions = listOf(
            "Claw. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 4 (1d6 + 1) bludgeoning damage, and the target is grappled (escape DC 11). The crab has two claws, each of which can grapple only one target."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "amphibious, water breathing, blindsight, swim speed, cc - grappled",
        source = "Monster Manual (SRD)"
    )
)

val giantCrocodile = registerBeastStatBlock(
    StatBlock(
        name = "Giant Crocodile",
        size = "Huge",
        type = "beast",
        alignment = "unaligned",
        armorClass = "14 (natural armor)",
        hitPoints = "85 (9d12 + 27)",
        speed = "30 ft., swim 50 ft.",
        str = 21, strMod = "+5",
        dex = 9, dexMod = "-1",
        con = 17, conMod = "+3",
        int = 2, intMod = "-4",
        wis = 10, wisMod = "+0",
        cha = 7, chaMod = "-2",
        skills = "Stealth +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "—",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Hold Breath. The crocodile can hold its breath for 30 minutes."
        ),
        actions = listOf(
            "Multiattack. The crocodile makes two attacks: one with its bite and one with its tail.",
            "Bite. Melee Weapon Attack: +8 to hit, reach 5 ft., one target. Hit: 21 (3d10 + 5) piercing damage, and the target is grappled (escape DC 16). Until this grapple ends, the target is restrained, and the crocodile can't bite another target.",
            "Tail. Melee Weapon Attack: +8 to hit, reach 10 ft., one target not grappled by the crocodile. Hit: 14 (2d8 + 5) bludgeoning damage. If the target is a creature, it must succeed on a DC 16 Strength saving throw or be knocked prone."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "hold breath, multiattack, swim speed, cc - grappled, cc - restrained, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val giantEagle = registerBeastStatBlock(
    StatBlock(
        name = "Giant Eagle",
        size = "Large",
        type = "beast",
        alignment = "neutral good",
        armorClass = "13",
        hitPoints = "26 (4d10 + 4)",
        speed = "10 ft., fly 80 ft.",
        str = 16, strMod = "+3",
        dex = 17, dexMod = "+3",
        con = 13, conMod = "+1",
        int = 8, intMod = "-1",
        wis = 14, wisMod = "+2",
        cha = 10, chaMod = "+0",
        skills = "Perception +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 14",
        languages = "Giant Eagle understands Common and Auran but can't speak them",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Sight. The eagle has advantage on Wisdom (Perception) checks that rely on sight."
        ),
        actions = listOf(
            "Multiattack. The eagle makes two attacks: one with its beak and one with its talons.",
            "Beak. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 6 (1d6 + 3) piercing damage.",
            "Talons. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 10 (2d6 + 3) slashing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "A giant eagle is a noble creature that speaks its own language and understands some speech.",
        tags = "keen sight, multiattack, fly speed",
        source = "Monster Manual (SRD)"
    )
)

val giantElk = registerBeastStatBlock(
    StatBlock(
        name = "Giant Elk",
        size = "Huge",
        type = "beast",
        alignment = "unaligned",
        armorClass = "14 (natural armor)",
        hitPoints = "42 (5d12 + 10)",
        speed = "60 ft.",
        str = 19, strMod = "+4",
        dex = 16, dexMod = "+3",
        con = 14, conMod = "+2",
        int = 7, intMod = "-2",
        wis = 14, wisMod = "+2",
        cha = 10, chaMod = "+0",
        skills = "Perception +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 14",
        languages = "Giant Elk understands Common, Elvish, and Sylvan but can't speak them",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Charge. If the elk moves at least 20 feet straight toward a target and then hits it with a ram attack on the same turn, the target takes an extra 7 (2d6) damage. If the target is a creature, it must succeed on a DC 14 Strength saving throw or be knocked prone."
        ),
        actions = listOf(
            "Ram. Melee Weapon Attack: +6 to hit, reach 10 ft., one target. Hit: 11 (2d6 + 4) bludgeoning damage.",
            "Hooves. Melee Weapon Attack: +6 to hit, reach 5 ft., one prone creature. Hit: 22 (4d8 + 4) bludgeoning damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "The majestic giant elk is rare to the point that its appearance is often taken as a foreshadowing of an important event, such as the birth of a king. Legends tell of gods that take the form of giant elk when visiting the Material Plane. Many cultures therefore believe that to hunt these creatures is to invite divine wrath.",
        tags = "cc- prone",
        source = "Monster Manual (SRD)"
    )
)

val giantFireBeetle = registerBeastStatBlock(
    StatBlock(
        name = "Giant Fire Beetle",
        size = "Small",
        type = "beast",
        alignment = "unaligned",
        armorClass = "13 (natural armor)",
        hitPoints = "4 (1d6 + 1)",
        speed = "30 ft.",
        str = 8, strMod = "-1",
        dex = 10, dexMod = "+0",
        con = 12, conMod = "+1",
        int = 1, intMod = "-5",
        wis = 7, wisMod = "-2",
        cha = 3, chaMod = "-4",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 30 ft., passive Perception 8",
        languages = "—",
        challengeRating = "0 (10 XP)",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Illumination. The beetle sheds bright light in a 10-foot radius and dim light for an additional 10 feet."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +1 to hit, reach 5 ft., one target. Hit: 2 (1d6 - 1) slashing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "A giant fire beetle is a nocturnal creature that features a pair of glowing glands that give off light for 1d6 days after the beetle dies.",
        tags = "blindsight",
        source = "Monster Manual (SRD)"
    )
)

val giantFrog = registerBeastStatBlock(
    StatBlock(
        name = "Giant Frog",
        size = "Medium",
        type = "beast",
        alignment = "unaligned",
        armorClass = "11",
        hitPoints = "18 (4d8)",
        speed = "30 ft., swim 30 ft.",
        str = 12, strMod = "+1",
        dex = 13, dexMod = "+1",
        con = 11, conMod = "+0",
        int = 2, intMod = "-4",
        wis = 10, wisMod = "+0",
        cha = 3, chaMod = "-4",
        skills = "Perception +2, Stealth +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 30 ft., passive Perception 12",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The frog can breathe air and water.",
            "Standing Leap. The frog's long jump is up to 20 feet and its high jump is up to 10 feet, with or without a running start."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 4 (1d6 + 1) piercing damage, and the target is grappled (escape DC 11). Until this grapple ends, the target is restrained, and the frog can't bite another target.",
            "Swallow. The frog makes one bite attack against a Small or smaller target it is grappling. If the attack hits, the target is swallowed, and the grapple ends. The swallowed target is blinded and restrained, it has total cover against attacks and other effects outside the frog, and it takes 5 (2d4) acid damage at the start of each of the frog's turns. The frog can have only one target swallowed at a time. If the frog dies, a swallowed creature is no longer restrained by it and can escape from the corpse using 5 feet of movement, exiting prone."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "amphibious, darkvision, water breathing, cc - grappled, cc - restrained, cc - blinded",
        source = "Monster Manual (SRD)"
    )
)

val giantGoat = registerBeastStatBlock(
    StatBlock(
        name = "Giant Goat",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "11 (natural armor)",
        hitPoints = "19 (3d10 + 3)",
        speed = "40 ft.",
        str = 17, strMod = "+3",
        dex = 11, dexMod = "+0",
        con = 12, conMod = "+1",
        int = 3, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 6, chaMod = "-2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 11",
        languages = "—",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Charge. If the goat moves at least 20 feet straight toward a target and then hits it with a ram attack on the same turn, the target takes an extra 5 (2d4) bludgeoning damage. If the target is a creature, it must succeed on a DC 13 Strength saving throw or be knocked prone.",
            "Sure-Footed. The goat has advantage on Strength and Dexterity saving throws made against effects that would knock it prone."
        ),
        actions = listOf(
            "Ram. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 8 (2d4 + 3) bludgeoning damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val giantHyena = registerBeastStatBlock(
    StatBlock(
        name = "Giant Hyena",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "45 (6d10 + 12)",
        speed = "50 ft.",
        str = 16, strMod = "+3",
        dex = 14, dexMod = "+2",
        con = 14, conMod = "+2",
        int = 2, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 7, chaMod = "-2",
        skills = "Perception +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "—",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Rampage. When the hyena reduces a creature to 0 hit points with a melee attack on its turn, the hyena can take a bonus action to move up to half its speed and make a bite attack."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 10 (2d6 + 3) piercing damage."
        ),
        bonusActions = listOf(
            "Rampage. When the hyena reduces a creature to 0 hit points with a melee attack on its turn, the hyena can take a bonus action to move up to half its speed and make a bite attack."
        ),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "none",
        source = "Monster Manual (SRD)"
    )
)

val giantLizard = registerBeastStatBlock(
    StatBlock(
        name = "Giant Lizard",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12 (natural armor)",
        hitPoints = "19 (3d10 + 3)",
        speed = "30 ft., climb 30 ft.",
        str = 15, strMod = "+2",
        dex = 12, dexMod = "+1",
        con = 13, conMod = "+1",
        int = 2, intMod = "-4",
        wis = 10, wisMod = "+0",
        cha = 5, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 30 ft., passive Perception 10",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = null,
        actions = listOf(
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 6 (1d8 + 2) piercing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "Giant lizards are fearsome predators often used as mounts or draft animals by reptilian humanoids and residents of the Underdark.",
        tags = "climb speed, darkvision",
        source = "Monster Manual (SRD)"
    )
)

val giantOctopus = registerBeastStatBlock(
    StatBlock(
        name = "Giant Octopus",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "11",
        hitPoints = "52 (8d10 + 8)",
        speed = "10 ft., swim 60 ft.",
        str = 17, strMod = "+3",
        dex = 13, dexMod = "+1",
        con = 13, conMod = "+1",
        int = 4, intMod = "-3",
        wis = 10, wisMod = "+0",
        cha = 4, chaMod = "-3",
        skills = "Perception +4, Stealth +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 14",
        languages = "—",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Hold Breath. While out of water, the octopus can hold its breath for 1 hour.",
            "Underwater Camouflage. The octopus has advantage on Dexterity (Stealth) checks made while underwater.",
            "Water Breathing. The octopus can breathe only underwater."
        ),
        actions = listOf(
            "Tentacles. Melee Weapon Attack: +5 to hit, reach 15 ft., one target. Hit: 10 (2d6 + 3) bludgeoning damage. If the target is a creature, it is grappled (escape DC 16). Until this grapple ends, the target is restrained, and the octopus can't use its tentacles on another target.",
            "Ink Cloud (Recharges after a Short or Long Rest). A 20-foot-radius cloud of ink extends all around the octopus if it is underwater. The area is heavily obscured for 1 minute, although a significant current can disperse the ink. After releasing the ink, the octopus can use the Dash action as a bonus action."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "darkvision, hold breath, water breathing, swim speed, cc - grappled, cc - restrained",
        source = "Monster Manual (SRD)"
    )
)

val giantOwl = registerBeastStatBlock(
    StatBlock(
        name = "Giant Owl",
        size = "Large",
        type = "beast",
        alignment = "neutral",
        armorClass = "12",
        hitPoints = "19 (3d10 + 3)",
        speed = "5 ft., fly 60 ft.",
        str = 13, strMod = "+1",
        dex = 15, dexMod = "+2",
        con = 12, conMod = "+1",
        int = 8, intMod = "-1",
        wis = 13, wisMod = "+1",
        cha = 10, chaMod = "+0",
        skills = "Perception +5, Stealth +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 15",
        languages = "Giant Owl understands Common, Elvish, and Sylvan but can't speak them",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Flyby. The owl doesn't provoke opportunity attacks when it flies out of an enemy's reach.",
            "Keen Hearing and Sight. The owl has advantage on Wisdom (Perception) checks that rely on hearing or sight."
        ),
        actions = listOf(
            "Talons. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 8 (2d6 + 1) slashing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "Giant owls are intelligent creatures that are the guardians of their woodland realms.",
        tags = "darkvision, flyby, fly speed, keen hearing, keen sight",
        source = "Monster Manual (SRD)"
    )
)

val giantPoisonousSnake = registerBeastStatBlock(
    StatBlock(
        name = "Giant Poisonous Snake",
        size = "Medium",
        type = "beast",
        alignment = "unaligned",
        armorClass = "14",
        hitPoints = "11 (2d8 + 2)",
        speed = "30 ft., swim 30 ft.",
        str = 10, strMod = "+0",
        dex = 18, dexMod = "+4",
        con = 13, conMod = "+1",
        int = 2, intMod = "-4",
        wis = 10, wisMod = "+0",
        cha = 3, chaMod = "-4",
        skills = "Perception +2",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 10 ft., passive Perception 12",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = emptyList(),
        actions = listOf(
            "Bite. Melee Weapon Attack: +6 to hit, reach 10 ft., one target. Hit: 6 (1d4 + 4) piercing damage, and the target must make a DC 11 Constitution saving throw, taking 10 (3d6) poison damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "blindsight, swim speed",
        source = "Monster Manual (SRD)"
    )
)

val giantRat = registerBeastStatBlock(
    StatBlock(
        name = "Giant Rat",
        size = "Small",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "7 (2d6)",
        speed = "30 ft.",
        str = 7, strMod = "-2",
        dex = 15, dexMod = "+2",
        con = 11, conMod = "+0",
        int = 2, intMod = "-4",
        wis = 10, wisMod = "+0",
        cha = 4, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "—",
        challengeRating = "1/8",
        expValue = "25 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Smell. The rat has advantage on Wisdom (Perception) checks that rely on smell.",
            "Pack Tactics. The rat has advantage on an attack roll against a creature if at least one of the rat's allies is within 5 feet of the creature and the ally isn't incapacitated."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 4 (1d4 + 2) piercing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "darkvision, keen smell, pack tactics",
        source = "Monster Manual (SRD)"
    )
)

val giantScorpion = registerBeastStatBlock(
    StatBlock(
        name = "Giant Scorpion",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "15 (natural armor)",
        hitPoints = "52 (7d10 + 14)",
        speed = "40 ft.",
        str = 15, strMod = "+2",
        dex = 13, dexMod = "+1",
        con = 15, conMod = "+2",
        int = 1, intMod = "-5",
        wis = 9, wisMod = "-1",
        cha = 3, chaMod = "-4",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 60 ft., passive Perception 9",
        languages = "—",
        challengeRating = "3",
        expValue = "700 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Multiattack. The scorpion makes three attacks: two with its claws and one with its sting."
        ),
        actions = listOf(
            "Claw. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 6 (1d8 + 2) bludgeoning damage, and the target is grappled (escape DC 12). The scorpion has two claws, each of which can grapple only one target.",
            "Sting. Melee Weapon Attack: +4 to hit, reach 5 ft., one creature. Hit: 7 (1d10 + 2) piercing damage, and the target must make a DC 12 Constitution saving throw, taking 22 (4d10) poison damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "blindsight, multiattack, cc - grappled",
        source = "Monster Manual (SRD)"
    )
)

val giantSeaHorse = registerBeastStatBlock(
    StatBlock(
        name = "Giant Sea Horse",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "13 (natural armor)",
        hitPoints = "16 (3d10)",
        speed = "0 ft., swim 40 ft.",
        str = 12, strMod = "+1",
        dex = 15, dexMod = "+2",
        con = 11, conMod = "+0",
        int = 2, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 5, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 11",
        languages = "—",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Charge. If the sea horse moves at least 20 feet straight toward a target and then hits it with a ram attack on the same turn, the target takes an extra 7 (2d6) bludgeoning damage. If the target is a creature, it must succeed on a DC 11 Strength saving throw or be knocked prone.",
            "Water Breathing. The sea horse can breathe only underwater."
        ),
        actions = listOf(
            "Ram. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 4 (1d6 + 1) bludgeoning damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "Giant sea horses are often used as mounts by aquatic humanoids.",
        tags = "swim speed, water breathing, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val giantShark = registerBeastStatBlock(
    StatBlock(
        name = "Giant Shark",
        size = "Huge",
        type = "beast",
        alignment = "unaligned",
        armorClass = "13 (natural armor)",
        hitPoints = "126 (11d12 + 55)",
        speed = "0 ft., swim 50 ft.",
        str = 23, strMod = "+6",
        dex = 11, dexMod = "+0",
        con = 21, conMod = "+5",
        int = 1, intMod = "-5",
        wis = 10, wisMod = "+0",
        cha = 5, chaMod = "-3",
        skills = "Perception +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 60 ft., passive Perception 13",
        languages = "—",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Blood Frenzy. The shark has advantage on melee attack rolls against any creature that doesn't have all its hit points.",
            "Water Breathing. The shark can breathe only underwater."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +9 to hit, reach 5 ft., one target. Hit: 22 (3d10 + 6) piercing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "A giant shark is 30 feet long and normally found in deep oceans.",
        tags = "blindsight, swim speed, water breathing",
        source = "Monster Manual (SRD)"
    )
)

val giantSpider = registerBeastStatBlock(
    StatBlock(
        name = "Giant Spider",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "14 (natural armor)",
        hitPoints = "26 (4d10 + 4)",
        speed = "30 ft., climb 30 ft.",
        str = 14, strMod = "+2",
        dex = 16, dexMod = "+3",
        con = 12, conMod = "+1",
        int = 2, intMod = "-4",
        wis = 11, wisMod = "+0",
        cha = 4, chaMod = "-3",
        skills = "Stealth +7",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 10 ft., darkvision 60 ft., passive Perception 10",
        languages = "—",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Spider Climb. The spider can climb difficult surfaces, including upside down on ceilings, without needing to make an ability check.",
            "Web Sense. While in contact with a web, the spider knows the exact location of any other creature in contact with the same web.",
            "Web Walker. The spider ignores movement restrictions caused by webbing."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +5 to hit, reach 5 ft., one creature. Hit: 7 (1d8 + 3) piercing damage, and the target must make a DC 11 Constitution saving throw, taking 9 (2d8) poison damage on a failed save, or half as much damage on a successful one. If the poison damage reduces the target to 0 hit points, the target is stable but poisoned for 1 hour, even after regaining hit points, and is paralyzed while poisoned in this way.",
            "Web (Recharge 5–6). Ranged Weapon Attack: +5 to hit, range 30/60 ft., one creature. Hit: The target is restrained by webbing. As an action, the restrained target can make a DC 12 Strength check, bursting the webbing on a success. The webbing can also be attacked and destroyed (AC 10; hp 5; vulnerability to fire damage; immunity to bludgeoning, poison, and psychic damage)."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "To snare its prey, a giant spider spins elaborate webs or shoots sticky strands of webbing from its abdomen. Giant spiders are most commonly found underground, making their lairs on ceilings or in dark, web-filled crevices. Such lairs are often festooned with web cocoons holding past victims.",
        tags = "blindsight, climb speed, darkvision, cc - paralyzed, cc - poisoned, cc - restrained",
        source = "Monster Manual (SRD)"
    )
)

val giantToad = registerBeastStatBlock(
    StatBlock(
        name = "Giant Toad",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "11",
        hitPoints = "39 (6d10 + 6)",
        speed = "20 ft., swim 40 ft.",
        str = 15, strMod = "+2",
        dex = 13, dexMod = "+1",
        con = 13, conMod = "+1",
        int = 2, intMod = "-4",
        wis = 10, wisMod = "+0",
        cha = 3, chaMod = "-4",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 30 ft., passive Perception 10",
        languages = "—",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The toad can breathe air and water.",
            "Standing Leap. The toad's long jump is up to 20 feet and its high jump is up to 10 feet, with or without a running start."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 7 (1d10 + 2) piercing damage plus 5 (1d10) poison damage, and the target is grappled (escape DC 13). Until this grapple ends, the target is restrained, and the toad can't bite another target.",
            "Swallow. The toad makes one bite attack against a Medium or smaller target it is grappling. If the attack hits, the target is swallowed, and the grapple ends. The swallowed target is blinded and restrained, it has total cover against attacks and other effects outside the toad, and it takes 10 (3d6) acid damage at the start of each of the toad's turns. The toad can have only one target swallowed at a time. If the toad dies, a swallowed creature is no longer restrained by it and can escape from the corpse using 5 feet of movement, exiting prone."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "amphibious, water breathing, darkvision, swim speed, cc - grappled, cc - restrained, cc - blinded",
        source = "Monster Manual (SRD)"
    )
)

val giantVulture = registerBeastStatBlock(
    StatBlock(
        name = "Giant Vulture",
        size = "Large",
        type = "beast",
        alignment = "neutral evil",
        armorClass = "10",
        hitPoints = "22 (3d10 + 6)",
        speed = "10 ft., fly 60 ft.",
        str = 15, strMod = "+2",
        dex = 10, dexMod = "+0",
        con = 15, conMod = "+2",
        int = 6, intMod = "-2",
        wis = 12, wisMod = "+1",
        cha = 7, chaMod = "-2",
        skills = "Perception +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "understands Common but can't speak",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Sight and Smell. The vulture has advantage on Wisdom (Perception) checks that rely on sight or smell.",
            "Pack Tactics. The vulture has advantage on an attack roll against a creature if at least one of the vulture's allies is within 5 feet of the creature and the ally isn't incapacitated."
        ),
        actions = listOf(
            "Multiattack. The vulture makes two attacks: one with its beak and one with its talons.",
            "Beak. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 7 (2d4 + 2) piercing damage.",
            "Talons. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 9 (2d6 + 2) slashing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "A giant vulture has advanced intelligence and a malevolent bent.",
        tags = "fly speed, keen sight, keen smell, multiattack, pack tactics",
        source = "Monster Manual (SRD)"
    )
)

val giantWasp = registerBeastStatBlock(
    StatBlock(
        name = "Giant Wasp",
        size = "Medium",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "13 (3d8)",
        speed = "10 ft., fly 50 ft.",
        str = 10, strMod = "+0",
        dex = 14, dexMod = "+2",
        con = 10, conMod = "+0",
        int = 1, intMod = "-5",
        wis = 10, wisMod = "+0",
        cha = 3, chaMod = "-4",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "—",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = null,
        actions = listOf(
            "Sting. Melee Weapon Attack: +4 to hit, reach 5 ft., one creature. Hit: 5 (1d6 + 2) piercing damage, and the target must make a DC 11 Constitution saving throw, taking 10 (3d6) poison damage on a failed save, or half as much damage on a successful one. If the poison damage reduces the target to 0 hit points, the target is stable but poisoned for 1 hour, even after regaining hit points, and is paralyzed while poisoned in this way."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "fly speed, cc - paralyzed, cc - poisoned",
        source = "Monster Manual (SRD)"
    )
)

val giantWeasel = registerBeastStatBlock(
    StatBlock(
        name = "Giant Weasel",
        size = "Medium",
        type = "beast",
        alignment = "unaligned",
        armorClass = "13",
        hitPoints = "9 (2d8)",
        speed = "40 ft.",
        str = 11, strMod = "+0",
        dex = 16, dexMod = "+3",
        con = 10, conMod = "+0",
        int = 4, intMod = "-3",
        wis = 12, wisMod = "+1",
        cha = 5, chaMod = "-3",
        skills = "Perception +3, Stealth +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 13",
        languages = "—",
        challengeRating = "1/8",
        expValue = "25 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Hearing and Smell. The weasel has advantage on Wisdom (Perception) checks that rely on hearing or smell."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 5 (1d4 + 3) piercing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "darkvision, keen hearing, keen smell",
        source = "Monster Manual (SRD)"
    )
)

val giantWolfSpider = registerBeastStatBlock(
    StatBlock(
        name = "Giant Wolf Spider",
        size = "Medium",
        type = "beast",
        alignment = "unaligned",
        armorClass = "13",
        hitPoints = "11 (2d8 + 2)",
        speed = "40 ft., climb 40 ft.",
        str = 12, strMod = "+1",
        dex = 16, dexMod = "+3",
        con = 13, conMod = "+1",
        int = 3, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 4, chaMod = "-3",
        skills = "Perception +3, Stealth +7",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 10 ft., darkvision 60 ft., passive Perception 13",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Spider Climb. The spider can climb difficult surfaces, including upside down on ceilings, without needing to make an ability check.",
            "Web Sense. While in contact with a web, the spider knows the exact location of any other creature in contact with the same web.",
            "Web Walker. The spider ignores movement restrictions caused by webbing."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +3 to hit, reach 5 ft., one creature. Hit: 4 (1d6 + 1) piercing damage, and the target must make a DC 11 Constitution saving throw, taking 7 (2d6) poison damage on a failed save, or half as much damage on a successful one. If the poison damage reduces the target to 0 hit points, the target is stable but poisoned for 1 hour, even after regaining hit points, and is paralyzed while poisoned in this way."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "Giant wolf spiders hunt prey across open ground or hide in burrows or crevices to attack from ambush.",
        tags = "blindsight, climb speed, darkvision, cc - paralyzed, cc - poisoned",
        source = "Monster Manual (SRD)"
    )
)

val goat = registerBeastStatBlock(
    StatBlock(
        name = "Goat",
        size = "Medium",
        type = "beast",
        alignment = "unaligned",
        armorClass = "10",
        hitPoints = "4 (1d8)",
        speed = "40 ft.",
        str = 12, strMod = "+1",
        dex = 10, dexMod = "+0",
        con = 11, conMod = "+0",
        int = 2, intMod = "-4",
        wis = 10, wisMod = "+0",
        cha = 5, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Charge. If the goat moves at least 20 feet straight toward a target and then hits it with a ram attack on the same turn, the target takes an extra 2 (1d4) bludgeoning damage. If the target is a creature, it must succeed on a DC 10 Strength saving throw or be knocked prone.",
            "Sure-Footed. The goat has advantage on Strength and Dexterity saving throws made against effects that would knock it prone."
        ),
        actions = listOf(
            "Ram. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 3 (1d4 + 1) bludgeoning damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val hawk = registerBeastStatBlock(
    StatBlock(
        name = "Hawk",
        size = "Tiny",
        type = "beast",
        alignment = "unaligned",
        armorClass = "13",
        hitPoints = "1 (1d4 - 1)",
        speed = "10 ft., fly 60 ft.",
        str = 5, strMod = "-3",
        dex = 16, dexMod = "+3",
        con = 8, conMod = "-1",
        int = 2, intMod = "-4",
        wis = 14, wisMod = "+2",
        cha = 6, chaMod = "-2",
        skills = "Perception +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 14",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Sight. The hawk has advantage on Wisdom (Perception) checks that rely on sight."
        ),
        actions = listOf(
            "Talons. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 1 slashing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "fly speed, keen sight",
        source = "Monster Manual (SRD)"
    )
)

val hunterShark = registerBeastStatBlock(
    StatBlock(
        name = "Hunter Shark",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12 (natural armor)",
        hitPoints = "45 (6d10 + 12)",
        speed = "0 ft., swim 40 ft.",
        str = 18, strMod = "+4",
        dex = 13, dexMod = "+1",
        con = 15, conMod = "+2",
        int = 1, intMod = "-5",
        wis = 10, wisMod = "+0",
        cha = 4, chaMod = "-3",
        skills = "Perception +2",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 30 ft., passive Perception 12",
        languages = "—",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Blood Frenzy. The shark has advantage on melee attack rolls against any creature that doesn't have all its hit points.",
            "Water Breathing. The shark can breathe only underwater."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 13 (2d8 + 4) piercing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "A hunter shark is 15 to 20 feet long, and usually hunts alone in deep waters.",
        tags = "blindsight, swim speed, water breathing",
        source = "Monster Manual (SRD)"
    )
)

val hyena = registerBeastStatBlock(
    StatBlock(
        name = "Hyena",
        size = "Medium",
        type = "beast",
        alignment = "unaligned",
        armorClass = "11",
        hitPoints = "5 (1d8 + 1)",
        speed = "50 ft.",
        str = 11, strMod = "+0",
        dex = 13, dexMod = "+1",
        con = 12, conMod = "+1",
        int = 2, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 5, chaMod = "-3",
        skills = "Perception +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Pack Tactics. The hyena has advantage on an attack roll against a creature if at least one of the hyena's allies is within 5 feet of the creature and the ally isn't incapacitated."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +2 to hit, reach 5 ft., one target. Hit: 3 (1d6) piercing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "pack tactics",
        source = "Monster Manual (SRD)"
    )
)

val jackal = registerBeastStatBlock(
    StatBlock(
        name = "Jackal",
        size = "Small",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "3 (1d6)",
        speed = "40 ft.",
        str = 8, strMod = "-1",
        dex = 15, dexMod = "+2",
        con = 11, conMod = "+0",
        int = 3, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 6, chaMod = "-2",
        skills = "Perception +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Hearing and Smell. The jackal has advantage on Wisdom (Perception) checks that rely on hearing or smell.",
            "Pack Tactics. The jackal has advantage on an attack roll against a creature if at least one of the jackal's allies is within 5 feet of the creature and the ally isn't incapacitated."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +1 to hit, reach 5 ft., one target. Hit: 1 (1d4 - 1) piercing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "keen hearing, keen smell, pack tactics",
        source = "Monster Manual (SRD)"
    )
)

val killerWhale = registerBeastStatBlock(
    StatBlock(
        name = "Killer Whale",
        size = "Huge",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12 (natural armor)",
        hitPoints = "90 (12d12 + 12)",
        speed = "0 ft., swim 60 ft.",
        str = 19, strMod = "+4",
        dex = 10, dexMod = "+0",
        con = 13, conMod = "+1",
        int = 3, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 7, chaMod = "-2",
        skills = "Perception +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 120 ft., passive Perception 13",
        languages = "—",
        challengeRating = "3",
        expValue = "700 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Echolocation. The whale can't use its blindsight while deafened.",
            "Hold Breath. The whale can hold its breath for 30 minutes.",
            "Keen Hearing. The whale has advantage on Wisdom (Perception) checks that rely on hearing."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 21 (5d6 + 4) piercing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "blindsight, keen hearing, hold breath, swim speed",
        source = "Monster Manual (SRD)"
    )
)

val lion = registerBeastStatBlock(
    StatBlock(
        name = "Lion",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "26 (4d10 + 4)",
        speed = "50 ft.",
        str = 17, strMod = "+3",
        dex = 15, dexMod = "+2",
        con = 13, conMod = "+1",
        int = 3, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 8, chaMod = "-1",
        skills = "Perception +3, Stealth +6",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "—",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Smell. The lion has advantage on Wisdom (Perception) checks that rely on smell.",
            "Pack Tactics. The lion has advantage on an attack roll against a creature if at least one of the lion's allies is within 5 feet of the creature and the ally isn't incapacitated.",
            "Pounce. If the lion moves at least 20 feet straight toward a creature and then hits it with a claw attack on the same turn, that target must succeed on a DC 13 Strength saving throw or be knocked prone. If the target is prone, the lion can make one bite attack against it as a bonus action.",
            "Running Leap. With a 10-foot running start, the lion can long jump up to 25 feet."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 7 (1d8 + 3) piercing damage.",
            "Claw. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 6 (1d6 + 3) slashing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "cc - prone, pack tactics, keen smell",
        source = "Monster Manual (SRD)"
    )
)

val lizard = registerBeastStatBlock(
    StatBlock(
        name = "Lizard",
        size = "Tiny",
        type = "beast",
        alignment = "unaligned",
        armorClass = "10",
        hitPoints = "2 (1d4)",
        speed = "20 ft., climb 20 ft.",
        str = 2, strMod = "-4",
        dex = 11, dexMod = "+0",
        con = 10, conMod = "+0",
        int = 1, intMod = "-5",
        wis = 8, wisMod = "-1",
        cha = 3, chaMod = "-4",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 30 ft., passive Perception 9",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = null,
        actions = listOf(
            "Bite. Melee Weapon Attack: +0 to hit, reach 5 ft., one target. Hit: 1 piercing damage."
        ),
        bonusActions = null,
        reactions = null,
        legendaryActions = emptyList(),
        description = null,
        tags = "climb speed, darkvision",
        source = "Monster Manual (SRD)"
    )
)

val mammoth = registerBeastStatBlock(
    StatBlock(
        name = "Mammoth",
        size = "Huge",
        type = "beast",
        alignment = "unaligned",
        armorClass = "13 (natural armor)",
        hitPoints = "126 (11d12 + 55)",
        speed = "40 ft.",
        str = 24, strMod = "+7",
        dex = 9, dexMod = "-1",
        con = 21, conMod = "+5",
        int = 3, intMod = "-4",
        wis = 11, wisMod = "+0",
        cha = 6, chaMod = "-2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "—",
        challengeRating = "6",
        expValue = "2300 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Trampling Charge. If the mammoth moves at least 20 feet straight toward a creature and then hits it with a gore attack on the same turn, that target must succeed on a DC 18 Strength saving throw or be knocked prone. If the target is prone, the mammoth can make one stomp attack against it as a bonus action."
        ),
        actions = listOf(
            "Gore. Melee Weapon Attack: +10 to hit, reach 10 ft., one target. Hit: 25 (4d8 + 7) piercing damage.",
            "Stomp. Melee Weapon Attack: +10 to hit, reach 5 ft., one prone creature. Hit: 29 (4d10 + 7) bludgeoning damage."
        ),
        bonusActions = listOf(
            "Stomp (as bonus action if target is prone after Trampling Charge)."
        ),
        reactions = null,
        legendaryActions = emptyList(),
        description = "A mammoth is an elephantine creature with thick fur and long tusks.",
        tags = "cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val mastiff = registerBeastStatBlock(
    StatBlock(
        name = "Mastiff",
        size = "Medium",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "5 (1d8 + 1)",
        speed = "40 ft.",
        str = 13, strMod = "+1",
        dex = 14, dexMod = "+2",
        con = 12, conMod = "+1",
        int = 3, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 7, chaMod = "-2",
        skills = "Perception +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "—",
        challengeRating = "1/8",
        expValue = "25 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Hearing and Smell. The mastiff has advantage on Wisdom (Perception) checks that rely on hearing or smell."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 4 (1d6 + 1) piercing damage. If the target is a creature, it must succeed on a DC 11 Strength saving throw or be knocked prone."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "Mastiffs are impressive hounds prized by humanoids for their loyalty and keen senses.",
        tags = "cc - prone, keen hearing, keen smell",
        source = "Monster Manual (SRD)"
    )
)

val mule = registerBeastStatBlock(
    StatBlock(
        name = "Mule",
        size = "Medium",
        type = "beast",
        alignment = "unaligned",
        armorClass = "10",
        hitPoints = "11 (2d8 + 2)",
        speed = "40 ft.",
        str = 14, strMod = "+2",
        dex = 10, dexMod = "+0",
        con = 13, conMod = "+1",
        int = 2, intMod = "-4",
        wis = 10, wisMod = "+0",
        cha = 5, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "—",
        challengeRating = "1/8",
        expValue = "25 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Beast of Burden. The mule is considered to be a Large animal for the purpose of determining its carrying capacity.",
            "Sure-Footed. The mule has advantage on Strength and Dexterity saving throws made against effects that would knock it prone."
        ),
        actions = listOf(
            "Hooves. Melee Weapon Attack: +2 to hit, reach 5 ft., one target. Hit: 4 (1d4 + 2) bludgeoning damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "none",
        source = "Monster Manual (SRD)"
    )
)

val octopus = registerBeastStatBlock(
    StatBlock(
        name = "Octopus",
        size = "Small",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "3 (1d6)",
        speed = "5 ft., swim 30 ft.",
        str = 4, strMod = "-3",
        dex = 15, dexMod = "+2",
        con = 11, conMod = "+0",
        int = 3, intMod = "-4",
        wis = 10, wisMod = "+0",
        cha = 4, chaMod = "-3",
        skills = "Perception +2, Stealth +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 30 ft., passive Perception 12",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Hold Breath. While out of water, the octopus can hold its breath for 30 minutes.",
            "Underwater Camouflage. The octopus has advantage on Dexterity (Stealth) checks made while underwater.",
            "Water Breathing. The octopus can breathe only underwater."
        ),
        actions = listOf(
            "Tentacles. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 1 bludgeoning damage, and the target is grappled (escape DC 10). Until this grapple ends, the octopus can't use its tentacles on another target.",
            "Ink Cloud (Recharges after a Short or Long Rest). A 5-foot-radius cloud of ink extends all around the octopus if it is underwater. The area is heavily obscured for 1 minute, although a significant current can disperse the ink. After releasing the ink, the octopus can use the Dash action as a bonus action."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "hold breath, water breathing, darkvision, swim speed, cc - grappled",
        source = "Monster Manual (SRD)"
    )
)

val owl = registerBeastStatBlock(
    StatBlock(
        name = "Owl",
        size = "Tiny",
        type = "beast",
        alignment = "unaligned",
        armorClass = "11",
        hitPoints = "1 (1d4 - 1)",
        speed = "5 ft., fly 60 ft.",
        str = 3, strMod = "-4",
        dex = 13, dexMod = "+1",
        con = 8, conMod = "-1",
        int = 2, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 7, chaMod = "-2",
        skills = "Perception +3, Stealth +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 13",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Flyby. The owl doesn't provoke opportunity attacks when it flies out of an enemy's reach.",
            "Keen Hearing and Sight. The owl has advantage on Wisdom (Perception) checks that rely on hearing or sight."
        ),
        actions = listOf(
            "Talons. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 1 slashing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "flyby, fly speed, darkvision, keen hearing, keen sight",
        source = "Monster Manual (SRD)"
    )
)

val panther = registerBeastStatBlock(
    StatBlock(
        name = "Panther",
        size = "Medium",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "13 (3d8)",
        speed = "50 ft., climb 40 ft.",
        str = 14, strMod = "+2",
        dex = 15, dexMod = "+2",
        con = 10, conMod = "+0",
        int = 3, intMod = "-4",
        wis = 14, wisMod = "+2",
        cha = 7, chaMod = "-2",
        skills = "Perception +4, Stealth +6",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 14",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Smell. The panther has advantage on Wisdom (Perception) checks that rely on smell.",
            "Pounce. If the panther moves at least 20 feet straight toward a creature and then hits it with a claw attack on the same turn, that target must succeed on a DC 12 Strength saving throw or be knocked prone. If the target is prone, the panther can make one bite attack against it as a bonus action."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 5 (1d6 + 2) piercing damage.",
            "Claw. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 4 (1d4 + 2) slashing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "climb speed, keen smell, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val plesiosaurus = registerBeastStatBlock(
    StatBlock(
        name = "Plesiosaurus",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "13 (natural armor)",
        hitPoints = "68 (8d10 + 24)",
        speed = "20 ft., swim 40 ft.",
        str = 18, strMod = "+4",
        dex = 15, dexMod = "+2",
        con = 16, conMod = "+3",
        int = 2, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 5, chaMod = "-3",
        skills = "Perception +3, Stealth +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "—",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Hold Breath. The plesiosaurus can hold its breath for 1 hour."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +6 to hit, reach 10 ft., one target. Hit: 14 (3d6 + 4) piercing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "This predatory marine reptile and cousin to the dinosaurs attacks any creature it encounters. Its long, flexible neck lets it twist in any direction to deliver a powerful bite.",
        tags = "hold breath, swim speed",
        source = "Monster Manual (SRD)"
    )
)

val poisonousSnake = registerBeastStatBlock(
    StatBlock(
        name = "Poisonous Snake",
        size = "Tiny",
        type = "beast",
        alignment = "unaligned",
        armorClass = "13",
        hitPoints = "2 (1d4)",
        speed = "30 ft., swim 30 ft.",
        str = 2, strMod = "-4",
        dex = 16, dexMod = "+3",
        con = 11, conMod = "+0",
        int = 1, intMod = "-5",
        wis = 10, wisMod = "+0",
        cha = 3, chaMod = "-4",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 10 ft., passive Perception 10",
        languages = "—",
        challengeRating = "1/8",
        expValue = "25 XP",
        proficiencyBonus = null,
        traits = emptyList(),
        actions = listOf(
            "Bite. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 1 piercing damage, and the target must make a DC 10 Constitution saving throw, taking 5 (2d4) poison damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "swim speed, blindsight",
        source = "Monster Manual (SRD)"
    )
)

val polarBear = registerBeastStatBlock(
    StatBlock(
        name = "Polar Bear",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12 (natural armor)",
        hitPoints = "42 (5d10 + 15)",
        speed = "40 ft., swim 30 ft.",
        str = 20, strMod = "+5",
        dex = 10, dexMod = "+0",
        con = 16, conMod = "+3",
        int = 2, intMod = "-4",
        wis = 13, wisMod = "+1",
        cha = 7, chaMod = "-2",
        skills = "Perception +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "—",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Smell. The bear has advantage on Wisdom (Perception) checks that rely on smell."
        ),
        actions = listOf(
            "Multiattack. The bear makes two attacks: one with its bite and one with its claws.",
            "Bite. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 9 (1d8 + 5) piercing damage.",
            "Claws. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 12 (2d6 + 5) slashing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "multiattack, swim speed, keen smell",
        source = "Monster Manual (SRD)"
    )
)

val pony = registerBeastStatBlock(
    StatBlock(
        name = "Pony",
        size = "Medium",
        type = "beast",
        alignment = "unaligned",
        armorClass = "10",
        hitPoints = "11 (2d8 + 2)",
        speed = "40 ft.",
        str = 15, strMod = "+2",
        dex = 10, dexMod = "+0",
        con = 13, conMod = "+1",
        int = 2, intMod = "-4",
        wis = 11, wisMod = "+0",
        cha = 7, chaMod = "-2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "—",
        challengeRating = "1/8",
        expValue = "25 XP",
        proficiencyBonus = null,
        traits = emptyList(),
        actions = listOf(
            "Hooves. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 7 (2d4 + 2) bludgeoning damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "none",
        source = "Monster Manual (SRD)"
    )
)

val quipper = registerBeastStatBlock(
    StatBlock(
        name = "Quipper",
        size = "Tiny",
        type = "beast",
        alignment = "unaligned",
        armorClass = "13",
        hitPoints = "1 (1d4 - 1)",
        speed = "0 ft., swim 40 ft.",
        str = 2, strMod = "-4",
        dex = 16, dexMod = "+3",
        con = 9, conMod = "-1",
        int = 1, intMod = "-5",
        wis = 7, wisMod = "-2",
        cha = 2, chaMod = "-4",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 8",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Blood Frenzy. The quipper has advantage on melee attack rolls against any creature that doesn't have all its hit points.",
            "Water Breathing. The quipper can breathe only underwater."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 1 piercing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "A quipper is a carnivorous fish with sharp teeth.",
        tags = "swim speed, water breathing",
        source = "Monster Manual (SRD)"
    )
)

val rat = registerBeastStatBlock(
    StatBlock(
        name = "Rat",
        size = "Tiny",
        type = "beast",
        alignment = "unaligned",
        armorClass = "10",
        hitPoints = "1 (1d4 - 1)",
        speed = "20 ft.",
        str = 2, strMod = "-4",
        dex = 11, dexMod = "+0",
        con = 9, conMod = "-1",
        int = 2, intMod = "-4",
        wis = 10, wisMod = "+0",
        cha = 4, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 30 ft., passive Perception 10",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Smell. The rat has advantage on Wisdom (Perception) checks that rely on smell."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +0 to hit, reach 5 ft., one target. Hit: 1 piercing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "keen smell",
        source = "Monster Manual (SRD)"
    )
)

val raven = registerBeastStatBlock(
    StatBlock(
        name = "Raven",
        size = "Tiny",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "1 (1d4 - 1)",
        speed = "10 ft., fly 50 ft.",
        str = 2, strMod = "-4",
        dex = 14, dexMod = "+2",
        con = 8, conMod = "-1",
        int = 2, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 6, chaMod = "-2",
        skills = "Perception +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Mimicry. The raven can mimic simple sounds it has heard, such as a person whispering, a baby crying, or an animal chittering. A creature that hears the sounds can tell they are imitations with a successful DC 10 Wisdom (Insight) check."
        ),
        actions = listOf(
            "Beak. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 1 piercing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "fly speed",
        source = "Monster Manual (SRD)"
    )
)

val reefShark = registerBeastStatBlock(
    StatBlock(
        name = "Reef Shark",
        size = "Medium",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12 (natural armor)",
        hitPoints = "22 (4d8 + 4)",
        speed = "0 ft., swim 40 ft.",
        str = 14, strMod = "+2",
        dex = 13, dexMod = "+1",
        con = 13, conMod = "+1",
        int = 1, intMod = "-5",
        wis = 10, wisMod = "+0",
        cha = 4, chaMod = "-3",
        skills = "Perception +2",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 30 ft., passive Perception 12",
        languages = "—",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Pack Tactics. The shark has advantage on an attack roll against a creature if at least one of the shark's allies is within 5 feet of the creature and the ally isn't incapacitated.",
            "Water Breathing. The shark can breathe only underwater."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 6 (1d8 + 2) piercing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "Reef sharks measure 6 to 10 feet long, and inhabit shallow waters and coral reefs.",
        tags = "pack tactics, swim speed, water breathing",
        source = "Monster Manual (SRD)"
    )
)

val rhinoceros = registerBeastStatBlock(
    StatBlock(
        name = "Rhinoceros",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "11 (natural armor)",
        hitPoints = "45 (6d10 + 12)",
        speed = "40 ft.",
        str = 21, strMod = "+5",
        dex = 8, dexMod = "-1",
        con = 15, conMod = "+2",
        int = 2, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 6, chaMod = "-2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 11",
        languages = "—",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Charge. If the rhinoceros moves at least 20 feet straight toward a target and then hits it with a gore attack on the same turn, the target takes an extra 9 (2d8) bludgeoning damage. If the target is a creature, it must succeed on a DC 15 Strength saving throw or be knocked prone."
        ),
        actions = listOf(
            "Gore. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 14 (2d8 + 5) bludgeoning damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val ridingHorse = registerBeastStatBlock(
    StatBlock(
        name = "Riding Horse",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "10",
        hitPoints = "13 (2d10 + 2)",
        speed = "60 ft.",
        str = 16, strMod = "+3",
        dex = 10, dexMod = "+0",
        con = 12, conMod = "+1",
        int = 2, intMod = "-4",
        wis = 11, wisMod = "+0",
        cha = 7, chaMod = "-2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = emptyList(),
        actions = listOf(
            "Hooves. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 8 (2d4 + 3) bludgeoning damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "none",
        source = "Monster Manual (SRD)"
    )
)

val saberToothedTiger = registerBeastStatBlock(
    StatBlock(
        name = "Saber-Toothed Tiger",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "52 (7d10 + 14)",
        speed = "40 ft.",
        str = 18, strMod = "+4",
        dex = 14, dexMod = "+2",
        con = 15, conMod = "+2",
        int = 3, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 8, chaMod = "-1",
        skills = "Perception +3, Stealth +6",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "—",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Smell. The tiger has advantage on Wisdom (Perception) checks that rely on smell.",
            "Pounce. If the tiger moves at least 20 feet straight toward a creature and then hits it with a claw attack on the same turn, that target must succeed on a DC 14 Strength saving throw or be knocked prone."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 10 (1d10 + 5) piercing damage.",
            "Claw. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 12 (2d6 + 5) slashing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "cc - prone, keen smell",
        source = "Monster Manual (SRD)"
    )
)

val scorpion = registerBeastStatBlock(
    StatBlock(
        name = "Scorpion",
        size = "Tiny",
        type = "beast",
        alignment = "unaligned",
        armorClass = "11 (natural armor)",
        hitPoints = "1 (1d4 - 1)",
        speed = "10 ft.",
        str = 2, strMod = "-4",
        dex = 11, dexMod = "+0",
        con = 8, conMod = "-1",
        int = 1, intMod = "-5",
        wis = 8, wisMod = "-1",
        cha = 2, chaMod = "-4",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 10 ft., passive Perception 9",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = emptyList(),
        actions = listOf(
            "Sting. Melee Weapon Attack: +2 to hit, reach 5 ft., one creature. Hit: 1 piercing damage, and the target must make a DC 9 Constitution saving throw, taking 4 (1d8) poison damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "blindsight",
        source = "Monster Manual (SRD)"
    )
)

val seaHorse = registerBeastStatBlock(
    StatBlock(
        name = "Sea Horse",
        size = "Tiny",
        type = "beast",
        alignment = "unaligned",
        armorClass = "11",
        hitPoints = "1 (1d4 - 1)",
        speed = "0 ft., swim 20 ft.",
        str = 1, strMod = "-5",
        dex = 12, dexMod = "+1",
        con = 8, conMod = "-1",
        int = 1, intMod = "-5",
        wis = 10, wisMod = "+0",
        cha = 2, chaMod = "-4",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "—",
        challengeRating = "0",
        expValue = "0 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Water Breathing. The sea horse can breathe only underwater."
        ),
        actions = emptyList(),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "swim speed, water breathing",
        source = "Monster Manual (SRD)"
    )
)

val spider = registerBeastStatBlock(
    StatBlock(
        name = "Spider",
        size = "Tiny",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "1 (1d4 - 1)",
        speed = "20 ft., climb 20 ft.",
        str = 2, strMod = "-4",
        dex = 14, dexMod = "+2",
        con = 8, conMod = "-1",
        int = 1, intMod = "-5",
        wis = 10, wisMod = "+0",
        cha = 2, chaMod = "-4",
        skills = "Stealth +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 30 ft., passive Perception 10",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Spider Climb. The spider can climb difficult surfaces, including upside down on ceilings, without needing to make an ability check.",
            "Web Sense. While in contact with a web, the spider knows the exact location of any other creature in contact with the same web.",
            "Web Walker. The spider ignores movement restrictions caused by webbing."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one creature. Hit: 1 piercing damage, and the target must succeed on a DC 9 Constitution saving throw or take 2 (1d4) poison damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "climb speed, darkvision",
        source = "Monster Manual (SRD)"
    )
)

val stirge = registerBeastStatBlock(
    StatBlock(
        name = "Stirge",
        size = "Tiny",
        type = "beast",
        alignment = "unaligned",
        armorClass = "14 (natural armor)",
        hitPoints = "2 (1d4)",
        speed = "10 ft., fly 40 ft.",
        str = 4, strMod = "-3",
        dex = 16, dexMod = "+3",
        con = 11, conMod = "+0",
        int = 2, intMod = "-4",
        wis = 8, wisMod = "-1",
        cha = 6, chaMod = "-2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 9",
        languages = "—",
        challengeRating = "1/8",
        expValue = "25 XP",
        proficiencyBonus = null,
        traits = emptyList(),
        actions = listOf(
            "Blood Drain. Melee Weapon Attack: +5 to hit, reach 5 ft., one creature. Hit: 5 (1d4 + 3) piercing damage, and the stirge attaches to the target. While attached, the stirge doesn't attack. Instead, at the start of each of the stirge's turns, the target loses 5 (1d4 + 3) hit points due to blood loss. The stirge can detach itself by spending 5 feet of its movement. It does so after it drains 10 hit points of blood from the target or the target dies. A creature, including the target, can use its action to detach the stirge."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "This horrid monster looks like a cross between a large bat and an oversized mosquito. Its legs end in sharp pincers, and its long, needle-like proboscis slashes the air as it seeks to feed on the blood of living creatures.",
        tags = "none",
        source = "Monster Manual (SRD)"
    )
)

val swarmOfBats = registerBeastStatBlock(
    StatBlock(
        name = "Swarm of Bats",
        size = "Medium",
        type = "swarm of Tiny beasts",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "22 (5d8)",
        speed = "0 ft., fly 30 ft.",
        str = 5, strMod = "-3",
        dex = 15, dexMod = "+2",
        con = 10, conMod = "+0",
        int = 2, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 4, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "bludgeoning, piercing, slashing",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "charmed, frightened, grappled, paralyzed, petrified, prone, restrained, stunned",
        legendaryResistance = null,
        senses = "blindsight 60 ft., passive Perception 11",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Echolocation. The swarm can't use its blindsight while deafened.",
            "Keen Hearing. The swarm has advantage on Wisdom (Perception) checks that rely on hearing.",
            "Swarm. The swarm can occupy another creature's space and vice versa, and the swarm can move through any opening large enough for a Tiny bat. The swarm can't regain hit points or gain temporary hit points."
        ),
        actions = listOf(
            "Bites. Melee Weapon Attack: +4 to hit, reach 0 ft., one creature in the swarm's space. Hit: 5 (2d4) piercing damage, or 2 (1d4) piercing damage if the swarm has half of its hit points or fewer."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "blindsight, fly speed, damage resistance, condition immunity, swarm",
        source = "Monster Manual (SRD)"
    )
)

val swarmOfInsects = registerBeastStatBlock(
    StatBlock(
        name = "Swarm of Insects",
        size = "Medium",
        type = "swarm of Tiny beasts",
        alignment = "unaligned",
        armorClass = "12 (natural armor)",
        hitPoints = "22 (5d8)",
        speed = "20 ft., climb 20 ft.",
        str = 3, strMod = "-4",
        dex = 13, dexMod = "+1",
        con = 10, conMod = "+0",
        int = 1, intMod = "-5",
        wis = 7, wisMod = "-2",
        cha = 1, chaMod = "-5",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "bludgeoning, piercing, slashing",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "charmed, frightened, grappled, paralyzed, petrified, prone, restrained, stunned",
        legendaryResistance = null,
        senses = "blindsight 10 ft., passive Perception 8",
        languages = "—",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Swarm. The swarm can occupy another creature's space and vice versa, and the swarm can move through any opening large enough for a Tiny insect. The swarm can't regain hit points or gain temporary hit points."
        ),
        actions = listOf(
            "Bites. Melee Weapon Attack: +3 to hit, reach 0 ft., one target in the swarm's space. Hit: 10 (4d4) piercing damage, or 5 (2d4) piercing damage if the swarm has half of its hit points or fewer."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "blindsight, climb speed, damage resistance, condition immunity, swarm",
        source = "Monster Manual (SRD)"
    )
)

val swarmOfPoisonousSnakes = registerBeastStatBlock(
    StatBlock(
        name = "Swarm of Poisonous Snakes",
        size = "Medium",
        type = "swarm of Tiny beasts",
        alignment = "unaligned",
        armorClass = "14",
        hitPoints = "36 (8d8)",
        speed = "30 ft., swim 30 ft.",
        str = 8, strMod = "-1",
        dex = 18, dexMod = "+4",
        con = 11, conMod = "+0",
        int = 1, intMod = "-5",
        wis = 10, wisMod = "+0",
        cha = 3, chaMod = "-4",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "bludgeoning, piercing, slashing",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "charmed, frightened, grappled, paralyzed, petrified, prone, restrained, stunned",
        legendaryResistance = null,
        senses = "blindsight 10 ft., passive Perception 10",
        languages = "—",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Swarm. The swarm can occupy another creature's space and vice versa, and the swarm can move through any opening large enough for a Tiny snake. The swarm can't regain hit points or gain temporary hit points."
        ),
        actions = listOf(
            "Bites. Melee Weapon Attack: +6 to hit, reach 0 ft., one creature in the swarm's space. Hit: 7 (2d6) piercing damage, or 3 (1d6) piercing damage if the swarm has half of its hit points or fewer. The target must make a DC 10 Constitution saving throw, taking 14 (4d6) poison damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "blindsight, damage resistance, condition immunity, swarm, swim speed",
        source = "Monster Manual (SRD)"
    )
)

val swarmOfQuippers = registerBeastStatBlock(
    StatBlock(
        name = "Swarm of Quippers",
        size = "Medium",
        type = "swarm of Tiny beasts",
        alignment = "unaligned",
        armorClass = "13",
        hitPoints = "28 (8d8 - 8)",
        speed = "0 ft., swim 40 ft.",
        str = 13, strMod = "+1",
        dex = 16, dexMod = "+3",
        con = 9, conMod = "-1",
        int = 1, intMod = "-5",
        wis = 7, wisMod = "-2",
        cha = 2, chaMod = "-4",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "bludgeoning, piercing, slashing",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "charmed, frightened, grappled, paralyzed, petrified, prone, restrained, stunned",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 8",
        languages = "—",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Blood Frenzy. The swarm has advantage on melee attack rolls against any creature that doesn't have all its hit points.",
            "Swarm. The swarm can occupy another creature's space and vice versa, and the swarm can move through any opening large enough for a Tiny quipper. The swarm can't regain hit points or gain temporary hit points.",
            "Water Breathing. The swarm can breathe only underwater."
        ),
        actions = listOf(
            "Bites. Melee Weapon Attack: +5 to hit, reach 0 ft., one creature in the swarm's space. Hit: 14 (4d6) piercing damage, or 7 (2d6) piercing damage if the swarm has half of its hit points or fewer."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "darkvision, damage resistance, condition immunity, swarm, swim speed, water breathing",
        source = "Monster Manual (SRD)"
    )
)

val swarmOfRats = registerBeastStatBlock(
    StatBlock(
        name = "Swarm of Rats",
        size = "Medium swarm of Tiny",
        type = "beast",
        alignment = "unaligned",
        armorClass = "10",
        hitPoints = "24 (7d8 - 7)",
        speed = "30 ft.",
        str = 9, strMod = "-1",
        dex = 11, dexMod = "+0",
        con = 9, conMod = "-1",
        int = 2, intMod = "-4",
        wis = 10, wisMod = "+0",
        cha = 3, chaMod = "-4",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "bludgeoning, piercing, slashing",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "charmed, frightened, grappled, paralyzed, petrified, prone, restrained, stunned",
        legendaryResistance = null,
        senses = "darkvision 30 ft., passive Perception 10",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Smell. The swarm has advantage on Wisdom (Perception) checks that rely on smell.",
            "Swarm. The swarm can occupy another creature's space and vice versa, and the swarm can move through any opening large enough for a Tiny rat. The swarm can't regain hit points or gain temporary hit points."
        ),
        actions = listOf(
            "Bites. Melee Weapon Attack: +2 to hit, reach 0 ft., one target in the swarm's space. Hit: 7 (2d6) piercing damage, or 3 (1d6) piercing damage if the swarm has half of its hit points or fewer."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "condition immunity, damage resistance, darkvision, keen smell, swarm",
        source = "Monster Manual (SRD)"
    )
)

val swarmOfRavens = registerBeastStatBlock(
    StatBlock(
        name = "Swarm of Ravens",
        size = "Medium swarm of Tiny",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "24 (7d8 - 7)",
        speed = "10 ft., fly 50 ft.",
        str = 6, strMod = "-2",
        dex = 14, dexMod = "+2",
        con = 8, conMod = "-1",
        int = 3, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 6, chaMod = "-2",
        skills = "Perception +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "bludgeoning, piercing, slashing",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "charmed, frightened, grappled, paralyzed, petrified, prone, restrained, stunned",
        legendaryResistance = null,
        senses = "passive Perception 15",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Swarm. The swarm can occupy another creature's space and vice versa, and the swarm can move through any opening large enough for a Tiny raven. The swarm can't regain hit points or gain temporary hit points."
        ),
        actions = listOf(
            "Beaks. Melee Weapon Attack: +4 to hit, reach 5 ft., one target in the swarm's space. Hit: 7 (2d6) piercing damage, or 3 (1d6) piercing damage if the swarm has half of its hit points or fewer."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "damage resistance, condition immunity, fly speed, swarm",
        source = "Monster Manual (SRD)"
    )
)

val tiger = registerBeastStatBlock(
    StatBlock(
        name = "Tiger",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "37 (5d10 + 10)",
        speed = "40 ft.",
        str = 17, strMod = "+3",
        dex = 15, dexMod = "+2",
        con = 14, conMod = "+2",
        int = 3, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 8, chaMod = "-1",
        skills = "Perception +3, Stealth +6",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 13",
        languages = "—",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Smell. The tiger has advantage on Wisdom (Perception) checks that rely on smell.",
            "Pounce. If the tiger moves at least 20 feet straight toward a creature and then hits it with a claw attack on the same turn, that target must succeed on a DC 13 Strength saving throw or be knocked prone. If the target is prone, the tiger can make one bite attack against it as a bonus action."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 8 (1d10 + 3) piercing damage.",
            "Claw. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 7 (1d8 + 3) slashing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "darkvision, cc - prone, keen smell",
        source = "Monster Manual (SRD)"
    )
)

val triceratops = registerBeastStatBlock(
    StatBlock(
        name = "Triceratops",
        size = "Huge",
        type = "beast",
        alignment = "unaligned",
        armorClass = "13 (natural armor)",
        hitPoints = "95 (10d12 + 30)",
        speed = "50 ft.",
        str = 22, strMod = "+6",
        dex = 9, dexMod = "-1",
        con = 17, conMod = "+3",
        int = 2, intMod = "-4",
        wis = 11, wisMod = "+0",
        cha = 5, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "—",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Trampling Charge. If the triceratops moves at least 20 feet straight toward a creature and then hits it with a gore attack on the same turn, that target must succeed on a DC 13 Strength saving throw or be knocked prone. If the target is prone, the triceratops can make one stomp attack against it as a bonus action."
        ),
        actions = listOf(
            "Gore. Melee Weapon Attack: +9 to hit, reach 5 ft., one target. Hit: 24 (4d8 + 6) piercing damage.",
            "Stomp. Melee Weapon Attack: +9 to hit, reach 5 ft., one prone creature. Hit: 22 (3d10 + 6) bludgeoning damage"
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "One of the most aggressive of the herbivorous dinosaurs, a triceratops possesses great horns and formidable speed, which it uses to gore and trample would-be predators to death.\nMonster Manual (SRD)",
        tags = "cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val tyrannosaurusRex = registerBeastStatBlock(
    StatBlock(
        name = "Tyrannosaurus Rex",
        size = "Huge",
        type = "beast",
        alignment = "unaligned",
        armorClass = "13 (natural armor)",
        hitPoints = "136 (13d12 + 52)",
        speed = "50 ft.",
        str = 25, strMod = "+7",
        dex = 10, dexMod = "+0",
        con = 19, conMod = "+4",
        int = 2, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 9, chaMod = "-1",
        skills = "Perception +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 14",
        languages = "—",
        challengeRating = "8",
        expValue = "3900 XP",
        proficiencyBonus = null,
        traits = emptyList(),
        actions = listOf(
            "Multiattack. The tyrannosaurus makes two attacks: one with its bite and one with its tail. It can't make both attacks against the same target.",
            "Bite. Melee Weapon Attack: +10 to hit, reach 10 ft., one target. Hit: 33 (4d12 + 7) piercing damage. If the target is a Medium or smaller creature, it is grappled (escape DC 17). Until this grapple ends, the target is restrained, and the tyrannosaurus can't bite another target.",
            "Tail. Melee Weapon Attack: +10 to hit, reach 10 ft., one target. Hit: 20 (3d8 + 7) bludgeoning damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "This enormous predatory dinosaur terrorizes all other creatures in its territory. It chases anything it thinks it can eat, and there are few creatures it won't try to devour whole.\nMonster Manual (SRD)",
        tags = "cc - grappled, cc - restrained, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val vulture = registerBeastStatBlock(
    StatBlock(
        name = "Vulture",
        size = "Medium",
        type = "beast",
        alignment = "unaligned",
        armorClass = "10",
        hitPoints = "5 (1d8 + 1)",
        speed = "10 ft., fly 50 ft.",
        str = 7, strMod = "-2",
        dex = 10, dexMod = "+0",
        con = 13, conMod = "+1",
        int = 2, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 4, chaMod = "-3",
        skills = "Perception +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Sight and Smell. The vulture has advantage on Wisdom (Perception) checks that rely on sight or smell.",
            "Pack Tactics. The vulture has advantage on an attack roll against a creature if at least one of the vulture's allies is within 5 feet of the creature and the ally isn't incapacitated."
        ),
        actions = listOf(
            "Beak. Melee Weapon Attack: +2 to hit, reach 5 ft., one target. Hit: 2 (1d4) piercing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "fly speed, keen smell, keen sight, pack tactics",
        source = "Monster Manual (SRD)"
    )
)

val warhorse = registerBeastStatBlock(
    StatBlock(
        name = "Warhorse",
        size = "Large",
        type = "beast",
        alignment = "unaligned",
        armorClass = "11",
        hitPoints = "19 (3d10 + 3)",
        speed = "60 ft.",
        str = 18, strMod = "+4",
        dex = 12, dexMod = "+1",
        con = 13, conMod = "+1",
        int = 2, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 7, chaMod = "-2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 11",
        languages = "—",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Trampling Charge. If the horse moves at least 20 feet straight toward a creature and then hits it with a hooves attack on the same turn, that target must succeed on a DC 14 Strength saving throw or be knocked prone. If the target is prone, the horse can make another attack with its hooves against it as a bonus action."
        ),
        actions = listOf(
            "Hooves. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 11 (2d6 + 4) bludgeoning damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "cc - prone",
        source = "Monster Manual (SRD)"
    )
)
val weasel = registerBeastStatBlock(
    StatBlock(
        name = "Weasel",
        size = "Tiny",
        type = "beast",
        alignment = "unaligned",
        armorClass = "13",
        hitPoints = "1 (1d4 - 1)",
        speed = "30 ft.",
        str = 3, strMod = "-4",
        dex = 16, dexMod = "+3",
        con = 8, conMod = "-1",
        int = 2, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 3, chaMod = "-4",
        skills = "Perception +3, Stealth +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Hearing and Smell. The weasel has advantage on Wisdom (Perception) checks that rely on hearing or smell."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 1 piercing damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "keen hearing, keen smell",
        source = "Monster Manual (SRD)"
    )
)

val wolf = registerBeastStatBlock(
    StatBlock(
        name = "Wolf",
        size = "Medium",
        type = "beast",
        alignment = "unaligned",
        armorClass = "13 (natural armor)",
        hitPoints = "11 (2d8 + 2)",
        speed = "40 ft.",
        str = 12, strMod = "+1",
        dex = 15, dexMod = "+2",
        con = 12, conMod = "+1",
        int = 3, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 6, chaMod = "-2",
        skills = "Perception +3, Stealth +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Hearing and Smell. The wolf has advantage on Wisdom (Perception) checks that rely on hearing or smell.",
            "Pack Tactics. The wolf has advantage on attack rolls against a creature if at least one of the wolf's allies is within 5 feet of the creature and the ally isn't incapacitated."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 7 (2d4 + 2) piercing damage. If the target is a creature, it must succeed on a DC 11 Strength saving throw or be knocked prone."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "keen hearing, keen smell, pack tactics, cc - prone",
        source = "Monster Manual (SRD)"
    )
)


