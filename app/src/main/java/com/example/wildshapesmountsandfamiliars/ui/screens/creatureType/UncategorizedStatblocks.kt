package com.example.wildshapesmountsandfamiliars.ui.screens.creatureType

import androidx.compose.runtime.Composable
import com.example.wildshapesmountsandfamiliars.ui.screens.CreatureTypeScreen
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.UncategorizedStatBlockSpellEffectOrSummon
import com.example.wildshapesmountsandfamiliars.ui.screens.UncategorizedStatBlocks
import com.example.wildshapesmountsandfamiliars.ui.screens.registerUncategorizedStatBlock

@Composable
fun UncategorizedStatblocks(
    onNavigateHome: () -> Unit,
    onNavigateToStatblocksByType: () -> Unit,
    onNavigateToCustom: () -> Unit,
    onNavigateToFavorites: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit,
    onNavigateToSearchResults:() -> Unit,
    onNavigateToNotekeeping: () -> Unit,
) {
    CreatureTypeScreen(
        title = "Uncategorized Statblocks",
        statBlocks = UncategorizedStatBlocks,
        spellEffectOrSummons = UncategorizedStatBlockSpellEffectOrSummon,
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

val findSteedCamel = registerUncategorizedStatBlock(
    StatBlock(
        name = "Find Steed: Camel",
        size = "Large",
        type = "Celestial, Fey, or Fiend (your choice)",
        alignment = "Unaligned",
        armorClass = "9",
        hitPoints = "15 (2d10 + 4)",
        speed = "50 ft.",
        str = 16, strMod = "+3",
        dex = 8, dexMod = "-1",
        con = 14, conMod = "+2",
        int = 6, intMod = "-2",  // Intelligence increased to 6
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
        languages = "Understands one language of your choice that you speak",
        challengeRating = "1/8",
        expValue = "25 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Telepathic. While the mount is within 1 mile of you, you can communicate with each other telepathically.",
            "Duplicate Spell. While mounted on it, you can make any spell you cast that targets only you also target the mount."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 2 (1d4) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "telepathic",
        source = "Find Steed; Player's Handbook",
        sortingTag = ""
    )
)

val findSteedElk = registerUncategorizedStatBlock(
    StatBlock(
        name = "Find Steed: Elk",
        size = "Large",
        type = "Celestial, Fey, or Fiend (your choice)",
        alignment = "unaligned",
        armorClass = "10",
        hitPoints = "13 (2d10 + 2)",
        speed = "50 ft.",
        str = 16, strMod = "+3",
        dex = 10, dexMod = "+0",
        con = 12, conMod = "+1",
        int = 6, intMod = "-2",  // Intelligence increased to 6
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
        languages = "Understands one language of your choice that you speak",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Telepathic. While the mount is within 1 mile of you, you can communicate with each other telepathically.",
            "Duplicate Spell. While mounted on it, you can make any spell you cast that targets only you also target the mount.",
            "Charge. If the elk moves at least 20 feet straight toward a target and then hits it with a ram attack on the same turn, the target takes an extra 7 (2d6) damage. If the target is a creature, it must succeed on a DC 13 Strength saving throw or be knocked prone."
        ),
        actions = listOf(
            "Ram. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 6 (1d6 + 3) bludgeoning damage.",
            "Hooves. Melee Weapon Attack: +5 to hit, reach 5 ft., one prone creature. Hit: 8 (2d4 + 3) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "cc - prone, telepathic",
        source = "Find Steed; Player's Handbook",
        sortingTag = ""
    )
)

val findSteedMastiff = registerUncategorizedStatBlock(
    StatBlock(
        name = "Find Steed: Mastiff",
        size = "Medium",
        type = "Celestial, Fey, or Fiend (your choice)",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "5 (1d8 + 1)",
        speed = "40 ft.",
        str = 13, strMod = "+1",
        dex = 14, dexMod = "+2",
        con = 12, conMod = "+1",
        int = 6, intMod = "-2",  // Intelligence increased to 6
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
        languages = "Understands one language of your choice that you speak",
        challengeRating = "1/8",
        expValue = "25 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Telepathic. While the mount is within 1 mile of you, you can communicate with each other telepathically.",
            "Duplicate Spell. While mounted on it, you can make any spell you cast that targets only you also target the mount.",
            "Keen Hearing and Smell. The mastiff has advantage on Wisdom (Perception) checks that rely on hearing or smell."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 4 (1d6 + 1) piercing damage. If the target is a creature, it must succeed on a DC 11 Strength saving throw or be knocked prone."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "cc - prone, keen hearing, keen smell, telepathic",
        source = "Find Steed; Player's Handbook",
        sortingTag = ""
    )
)

val findSteedPony = registerUncategorizedStatBlock(
    StatBlock(
        name = "Find Steed: Pony",
        size = "Medium",
        type = "Celestial, Fey, or Fiend (your choice)",
        alignment = "Unaligned",
        armorClass = "10",
        hitPoints = "11 (2d8 + 2)",
        speed = "40 ft.",
        str = 15, strMod = "+2",
        dex = 10, dexMod = "+0",
        con = 13, conMod = "+1",
        int = 6, intMod = "-2",  // Intelligence increased to 6
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
        languages = "Understands one language of your choice that you speak",
        challengeRating = "1/8",
        expValue = "25 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Telepathic. While the mount is within 1 mile of you, you can communicate with each other telepathically.",
            "Duplicate Spell. While mounted on it, you can make any spell you cast that targets only you also target the mount."
        ),
        actions = listOf(
            "Hooves. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 7 (2d4 + 2) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "telepathic",
        source = "Find Steed; Player's Handbook",
        sortingTag = ""
    )
)
val findSteedWarhorse = registerUncategorizedStatBlock(
    StatBlock(
        name = "Find Steed: Warhorse",
        size = "Large",
        type = "Celestial, Fey, or Fiend (your choice)",
        alignment = "unaligned",
        armorClass = "11",
        hitPoints = "19 (3d10 + 3)",
        speed = "60 ft.",
        str = 18, strMod = "+4",
        dex = 12, dexMod = "+1",
        con = 13, conMod = "+1",
        int = 6, intMod = "-2",  // Intelligence increased to 6
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
        languages = "Understands one language of your choice that you speak",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Telepathic. While the mount is within 1 mile of you, you can communicate with each other telepathically.",
            "Duplicate Spell. While mounted on it, you can make any spell you cast that targets only you also target the mount.",
            "Trampling Charge. If the horse moves at least 20 feet straight toward a creature and then hits it with a hooves attack on the same turn, that target must succeed on a DC 14 Strength saving throw or be knocked prone. If the target is prone, the horse can make another attack with its hooves against it as a bonus action."
        ),
        actions = listOf(
            "Hooves. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 11 (2d6 + 4) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "cc - prone, telepathic",
        source = "Find Steed; Player's Handbook",
        sortingTag = ""
    )
)


val findGreaterSteedGriffon = registerUncategorizedStatBlock(
    StatBlock(
        name = "Find Greater Steed: Griffon",
        size = "Large",
        type = "celestial, fey, or fiend (your choice)",
        alignment = null,
        armorClass = "12",
        hitPoints = "59 (7d10 + 21)",
        speed = "30 ft., fly 80 ft.",
        str = 18, strMod = "+4",
        dex = 15, dexMod = "+2",
        con = 16, conMod = "+3",
        int = 6, intMod = "-2",  // Intelligence increased from 2 to 6
        wis = 13, wisMod = "+1",
        cha = 8, chaMod = "-1",
        skills = "Perception +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 15",
        languages = "Understands one language of your choice that you speak",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Telepathic. While the mount is within 1 mile of you, you can communicate with each other telepathically.",
            "Duplicate Spell. While mounted on it, you can make any spell you cast that targets only you also target the mount.",
            "Keen Sight. The griffon has advantage on Wisdom (Perception) checks that rely on sight."
        ),
        actions = listOf(
            "Multiattack. The griffon makes two attacks: one with its beak and one with its claws.",
            "Beak. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 8 (1d8 + 4) piercing damage.",
            "Claws. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 11 (2d6 + 4) slashing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, darkvision, keen sight, multiattack, telepathic",
        source = "Find Greater Steed; Xanathar's Guide to Everything",
        sortingTag = ""
    )
)

val findGreaterSteedPegasus = registerUncategorizedStatBlock(
    StatBlock(
        name = "Find Greater Steed: Pegasus",
        size = "Large",
        type = "celestial, fey, or fiend (your choice)",
        alignment = "Neutral Good",
        armorClass = "12",
        hitPoints = "59 (7d10 + 21)",
        speed = "60 ft., fly 90 ft.",
        str = 18, strMod = "+4",
        dex = 15, dexMod = "+2",
        con = 16, conMod = "+3",
        int = 10, intMod = "+0",
        wis = 15, wisMod = "+2",
        cha = 13, chaMod = "+1",
        skills = "Perception +6",
        savingThrows = "Dex +4, Wis +4, Cha +3",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 16",
        languages = "understands Celestial, Common, Elvish, Sylvan, and one language of your choice that you speak, but can't speak",
        challengeRating = null,
        expValue = null,
        proficiencyBonus = null,
        traits = listOf(
            "Telepathic. While the mount is within 1 mile of you, you can communicate with each other telepathically.",
            "Duplicate Spell. While mounted on it, you can make any spell you cast that targets only you also target the mount."
        ),
        actions = listOf(
            "Hooves. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 11 (2d6 + 4) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, telepathic",
        source = "Find Greater Steed; Xanathar's Guide to Everything",
        sortingTag = ""
    )
)

val findGreaterSteedPeryton = registerUncategorizedStatBlock(
    StatBlock(
        name = "Find Greater Steed: Peryton",
        size = "Large",
        type = "celestial, fey, or fiend (your choice)",
        alignment = "Chaotic Evil",
        armorClass = "13 (natural armor)",
        hitPoints = "33 (6d8 + 6)",
        speed = "20 ft., fly 60 ft.",
        str = 16, strMod = "+3",
        dex = 12, dexMod = "+1",
        con = 13, conMod = "+1",
        int = 9, intMod = "-1",
        wis = 12, wisMod = "+1",
        cha = 10, chaMod = "+0",
        skills = "Perception +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 15",
        languages = "understands Common, Elvish, and one language of your choice that you speak, but can't speak",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Dive Attack. If the peryton is flying and dives at least 30 feet straight toward a target and then hits it with a melee weapon attack, the attack deals an extra 9 (2d8) damage to the target.",
            "Flyby. The peryton doesn't provoke an opportunity attack when it flies out of an enemy's reach.",
            "Keen Sight and Smell. The peryton has advantage on Wisdom (Perception) checks that rely on sight or smell."
        ),
        actions = listOf(
            "Multiattack. The peryton makes one gore attack and one talon attack.",
            "Gore. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 7 (1d8 + 3) piercing damage.",
            "Talons. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 8 (2d4 + 3) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, damage resistance, flyby, keen sight, keen smell, multiattack, telepathic",
        source = "Find Greater Steed; Xanathar's Guide to Everything",
        sortingTag = ""
    )
)

val findGreaterSteedDireWolf = registerUncategorizedStatBlock(
    StatBlock(
        name = "Find Greater Steed: Dire Wolf",
        size = "Large",
        type = "celestial, fey, or fiend (your choice)",
        alignment = "Neutral Evil",
        armorClass = "14 (natural armor)",
        hitPoints = "37 (5d10 + 10)",
        speed = "50 ft.",
        str = 17, strMod = "+3",
        dex = 15, dexMod = "+2",
        con = 15, conMod = "+2",
        int = 6, intMod = "-2",  // Intelligence increased to 6
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
        languages = "Understands one language of your choice that you speak",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Telepathic. While the mount is within 1 mile of you, you can communicate with each other telepathically.",
            "Duplicate Spell. While mounted on it, you can make any spell you cast that targets only you also target the mount.",
            "Keen Hearing and Smell. The wolf has advantage on Wisdom (Perception) checks that rely on hearing or smell.",
            "Pack Tactics. The wolf has advantage on an attack roll against a creature if at least one of the wolf's allies is within 5 feet of the creature and the ally isn't incapacitated."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 10 (2d6 + 3) piercing damage. If the target is a creature, it must succeed on a DC 13 Strength saving throw or be knocked prone."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "keen hearing, keen smell, pack tactics, cc - prone, telepathic",
        source = "Find Greater Steed; Xanathar's Guide to Everything",
        sortingTag = ""
    )
)

val findGreaterSteedRhinoceros = registerUncategorizedStatBlock(
    StatBlock(
        name = "Find Greater Steed: Rhinoceros",
        size = "Large",
        type = "celestial, fey, or fiend (your choice)",
        alignment = "Unaligned",
        armorClass = "11 (natural armor)",
        hitPoints = "45 (6d10 + 12)",
        speed = "40 ft.",
        str = 21, strMod = "+5",
        dex = 8, dexMod = "-1",
        con = 15, conMod = "+2",
        int = 6, intMod = "-2",  // Intelligence increased to 6
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
        languages = "Understands one language of your choice that you speak",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Telepathic. While the mount is within 1 mile of you, you can communicate with each other telepathically.",
            "Duplicate Spell. While mounted on it, you can make any spell you cast that targets only you also target the mount.",
            "Charge. If the rhinoceros moves at least 20 feet straight toward a target and then hits it with a gore attack on the same turn, the target takes an extra 9 (2d8) bludgeoning damage. If the target is a creature, it must succeed on a DC 15 Strength saving throw or be knocked prone."
        ),
        actions = listOf(
            "Gore. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 14 (2d8 + 5) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "cc - prone, telepathic",
        source = "Find Greater Steed; Xanathar's Guide to Everything",
        sortingTag = ""
    )
)

val findGreaterSteedSaberToothedTiger = registerUncategorizedStatBlock(
    StatBlock(
        name = "Find Greater Steed: Saber-Toothed Tiger",
        size = "Large",
        type = "celestial, fey, or fiend (your choice)",
        alignment = "Unaligned",
        armorClass = "12",
        hitPoints = "52 (7d10 + 14)",
        speed = "40 ft.",
        str = 18, strMod = "+4",
        dex = 14, dexMod = "+2",
        con = 15, conMod = "+2",
        int = 6, intMod = "-2",  // Intelligence increased to 6
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
        languages = "Understands one language of your choice that you speak",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Telepathic. While the mount is within 1 mile of you, you can communicate with each other telepathically.",
            "Duplicate Spell. While mounted on it, you can make any spell you cast that targets only you also target the mount.",
            "Keen Smell. The tiger has advantage on Wisdom (Perception) checks that rely on smell.",
            "Pounce. If the tiger moves at least 20 feet straight toward a creature and then hits it with a claw attack on the same turn, that target must succeed on a DC 14 Strength saving throw or be knocked prone."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 10 (1d10 + 5) piercing damage.",
            "Claw. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 12 (2d6 + 5) slashing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "cc - prone, keen smell, telepathic",
        source = "Find Greater Steed; Xanathar's Guide to Everything",
        sortingTag = ""
    )
)

val ettercapWeb = registerUncategorizedStatBlock(
    StatBlock(
        name = "Web (Ettercap)",
        size = "Large",
        type = "object",
        alignment = null,
        armorClass = "10",
        hitPoints = "5",
        speed = "0 ft.",
        str = null, strMod = null,
        dex = null, dexMod = null,
        con = null, conMod = null,
        int = null, intMod = null,
        wis = null, wisMod = null,
        cha = null, chaMod = null,
        skills = null,
        savingThrows = null,
        vulnerabilities = "fire",
        damageResistances = null,
        damageImmunities = "bludgeoning, poison, psychic",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = null,
        languages = null,
        challengeRating = null,
        expValue = null,
        proficiencyBonus = null,
        traits = listOf(
            "Web. As an action, a restrained creature can make a DC 11 Strength check, escaping from the webbing on a success. The effect ends if the webbing is destroyed."
        ),
        actions = listOf(),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = null,
        source = "Ettercap; Monster Manual (SRD)",
        sortingTag = ""
    )
)

val roperTentacle = registerUncategorizedStatBlock(
    StatBlock(
        name = "Tentacle (Roper)",
        size = "Large",
        type = "monstrosity",
        alignment = "neutral evil",
        armorClass = "20",
        hitPoints = "10",
        speed = "0 ft.",
        str = null, strMod = null,
        dex = null, dexMod = null,
        con = null, conMod = null,
        int = null, intMod = null,
        wis = null, wisMod = null,
        cha = null, chaMod = null,
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "poison, psychic",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = null,
        languages = null,
        challengeRating = null,
        expValue = null,
        proficiencyBonus = null,
        traits = listOf(
            "Grasping Tendrils. Destroying a tendril deals no damage to the roper, which can extrude a replacement tendril on its next turn. A tendril can be broken if a creature takes an action and succeeds on a DC 15 Strength check against it."
        ),
        actions = listOf(
            "Tendril. Melee Weapon Attack: +7 to hit, reach 50 ft., one creature. Hit: The target is grappled (escape DC 15). Until the grapple ends, the target is restrained and has disadvantage on Strength checks and Strength saving throws, and the roper can't use the same tendril on another target."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage immunity",
        source = "Roper; Monster Manual (SRD)",
        sortingTag = ""
    )
)

val animatedTree = registerUncategorizedStatBlock(
    StatBlock(
        name = "Animated Tree (Treant)",
        size = "Huge",
        type = "plant",
        alignment = "chaotic good",
        armorClass = "16 (natural armor)",
        hitPoints = "138 (12d12 + 60)",
        speed = "30 ft.",
        str = 23, strMod = "+6",
        dex = 8, dexMod = "-1",
        con = 21, conMod = "+5",
        int = 1, intMod = "-5",
        wis = 16, wisMod = "+3",
        cha = 1, chaMod = "-5",
        skills = null,
        savingThrows = null,
        vulnerabilities = "fire",
        damageResistances = "bludgeoning, piercing",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "--",
        challengeRating = "9",
        expValue = "5000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "False Appearance. While the treant remains motionless, it is indistinguishable from a normal tree.",
            "Siege Monster. The treant deals double damage to objects and structures."
        ),
        actions = listOf(
            "Multiattack. The treant makes two slam attacks.",
            "Slam. Melee Weapon Attack: +10 to hit, reach 5 ft., one target. Hit: 16 (3d6 + 6) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = null,
        source = "Treant; Monster Manual (SRD)",
        sortingTag = ""
    )
)
// TODO review for clarity - "only the slam attack option" - multiattack or not?
// traits the same as Treant as well?

val animatedChain = registerUncategorizedStatBlock(
    StatBlock(
        name = "Animated Chain (Chain Devil)",
        size = "varies based on chain",
        type = "object",
        alignment = null,
        armorClass = "20",
        hitPoints = "20",
        speed = "--",
        str = null, strMod = null,
        dex = null, dexMod = null,
        con = null, conMod = null,
        int = null, intMod = null,
        wis = null, wisMod = null,
        cha = null, chaMod = null,
        savingThrows = null,
        skills = null,
        vulnerabilities = null,
        damageResistances = "piercing",
        damageImmunities = "psychic, thunder",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = null,
        languages = null,
        challengeRating = null,
        expValue = null,
        proficiencyBonus = null,
        traits = listOf(
            "An animated chain reverts to its inanimate state if reduced to 0 hit points or if the chain devil that animated it is incapacitated or dies."
        ),
        actions = listOf(
            "Chain. Melee Weapon Attack: +8 to hit, reach 10 ft., one target. Hit: 11 (2d6 + 4) slashing damage. The target is grappled (escape DC 14). Until this grapple ends, the target is restrained and takes 7 (2d6) piercing damage at the start of each of its turns. While grappling a creature this way, the chain cannot attack."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = null,
        source = "Chain Devil; Monster Manual (SRD)",
        sortingTag = ""
    )
)

val cloneStatblock = registerUncategorizedStatBlock(
    StatBlock(
        name = "Clone (Clone)",
        size = null,
        type = null,
        alignment = null,
        armorClass = null,
        hitPoints = null,
        speed = null,
        str = null, strMod = null,
        dex = null, dexMod = null,
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
        traits = listOf(),
        actions = listOf(),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = null,
        source = "Clone; PHB",
        sortingTag = ""
    )
)

val unseenServantStatBlock = registerUncategorizedStatBlock(
    StatBlock(
        name = "Unseen Servant (Unseen Servant)",
        size = "Medium",
        type = "spell effect",
        alignment = "unaligned",
        armorClass = "10",
        hitPoints = "1",
        speed = "15 ft.",
        str = 2,strMod = "-4",
        dex = null, dexMod = null,
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
        senses = "passive Perception 10",
        languages = null,
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(),
        bonusActions = listOf(
            "Mental Command. you can mentally command the servant to move up to 15 feet and interact with an object. The servant can perform simple tasks that a human servant could do, such as fetching things, cleaning, mending, folding clothes, lighting fires, serving food, and pouring wine. Once you give the command, the servant performs the task to the best of its ability until it completes the task, then waits for your next command."
        ),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "none",
        source = "Unseen Servant; Player's Handbook",
        sortingTag = ""
    )
)

val phantomSteedStatBlock = registerUncategorizedStatBlock(
    StatBlock(
        name = "Phantom Steed (Phantom Steed)",
        size = "Large",
        type = "spell effect",
        alignment = "unaligned",
        armorClass = "10",
        hitPoints = "13 (2d10 + 2)",
        speed = "100 ft.",
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
        traits = listOf(
            "Travel. The steed can travel 10 miles in an hour, or 13 miles at a fast pace.",
            "Gentle Dismount. When the spell ends, the steed gradually fades, giving the rider 1 minute to dismount. The spell ends if you use an action to dismiss it or if the steed takes any damage."
        ),
        actions = listOf(
            "Hooves. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 8 (2d4 + 3) bludgeoning damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "none",
        source = "Phantom Steed; Player's Handbook",
        sortingTag = ""
    )
)

val guardianOfFaithStatBlock = registerUncategorizedStatBlock(
    StatBlock(
        name = "Guardian of Faith (Guardian of Faith)",
        size = "Large",
        type = "spell effect",
        alignment = "unaligned",
        armorClass = "20",
        hitPoints = "The guardian vanishes when it has dealt a total of 60 damage.",
        speed = "0 ft.",
        str = null, strMod = null,
        dex = null, dexMod = null,
        con = null, conMod = null,
        int = null, intMod = null,
        wis = null, wisMod = null,
        cha = null, chaMod = null,
        savingThrows = null,
        skills = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        senses = "truesight 10ft.",
        languages = null,
        challengeRating = null,
        expValue = null,
        proficiencyBonus = null,
        legendaryResistance = null,
        traits = listOf(
            "Faithful Form. The guardian occupies its space and is indistinct except for a gleaming sword and shield emblazoned with the symbol of your deity."
        ),
        actions = listOf(
            "Radiant Strike (Trigger). Any creature hostile to you that moves to a space within 10 feet of the guardian for the first time on a turn must succeed on a Dexterity saving throw. The creature takes 20 radiant damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "none",
        source = "Player's Handbook",
        sortingTag = ""
    )
)

val bigbysHandStatBlock = registerUncategorizedStatBlock(
    StatBlock(
        name = "Bigby's Hand (Bigby's Hand)",
        size = "Large",
        type = "force",
        alignment = null,
        armorClass = "20",
        hitPoints = "Your hit point maximum",
        speed = "0 ft., fly 60 ft. (hover)",
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
            "Object. The hand is considered an object and doesn't fill its space."
        ),
        actions = listOf(
            "Clenched Fist. The hand strikes one creature or object within 5 feet of it. Make a melee spell attack for the hand using your game statistics. On a hit, the target takes 4d8 force damage.",
            "Forceful Hand. The hand attempts to push a creature within 5 feet of it in a direction you choose. Make a check with the hand’s Strength contested by the Strength (Athletics) check of the target. If the target is Medium or smaller, you have advantage on the check. If you succeed, the hand pushes the target up to 5 feet plus a number of feet equal to five times your spellcasting ability modifier. The hand moves with the target to remain within 5 feet of it.",
            "Grasping Hand. The hand attempts to grapple a Huge or smaller creature within 5 feet of it. You use the hand’s Strength score to resolve the grapple. If the target is Medium or smaller, you have advantage on the check. While the hand is grappling the target, you can use a bonus action to have the hand crush it. When you do so, the target takes bludgeoning damage equal to 2d6 + your spellcasting ability modifier.",
            "Interposing Hand. The hand interposes itself between you and a creature you choose until you give the hand a different command. The hand moves to stay between you and the target, providing you with half cover against the target. The target can’t move through the hand’s space if its Strength score is less than or equal to the hand’s Strength score. If its Strength score is higher than the hand’s Strength score, the target can move toward you through the hand’s space, but that space is difficult terrain for the target."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "cc - grappled",
        source = "Bigby's Hand; Player's Handbook",
        sortingTag = ""
    )
)