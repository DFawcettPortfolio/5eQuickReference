package com.example.wildshapesmountsandfamiliars.ui.screens.creatureType



import androidx.compose.runtime.Composable
import com.example.wildshapesmountsandfamiliars.ui.screens.CreatureTypeScreen
import com.example.wildshapesmountsandfamiliars.ui.screens.PlantStatBlockSpellEffectOrSummon
import com.example.wildshapesmountsandfamiliars.ui.screens.PlantStatBlocks
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.registerPlantStatBlock

@Composable
fun Plants(
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
        title = "Plants",
        statBlocks = PlantStatBlocks,
        spellEffectOrSummons = PlantStatBlockSpellEffectOrSummon,
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

val awakenedShrub = registerPlantStatBlock(
    StatBlock(
        name = "Awakened Shrub",
        size = "Small",
        type = "plant",
        alignment = "unaligned",
        armorClass = "9",
        hitPoints = "10 (3d6)",
        speed = "20 ft.",
        str = 3, strMod = "−4",
        dex = 8, dexMod = "−1",
        con = 11, conMod = "+0",
        int = 10, intMod = "+0",
        wis = 10, wisMod = "+0",
        cha = 6, chaMod = "−2",
        skills = null,
        savingThrows = null,
        vulnerabilities = "fire",
        damageResistances = "piercing",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "one language known by its creator",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "False Appearance. While the shrub remains motionless, it is indistinguishable from a normal shrub."
        ),
        actions = listOf(
            "Rake. Melee Weapon Attack: +1 to hit, reach 5 ft., one target. Hit: 1 (1d4 − 1) slashing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "An awakened shrub is an ordinary shrub given sentience and mobility by magic.",
        tags = "damage resistance",
        source = "Monster Manual (SRD)"
    )
)

val awakenedTree = registerPlantStatBlock(
    StatBlock(
        name = "Awakened Tree",
        size = "Huge",
        type = "plant",
        alignment = "unaligned",
        armorClass = "13 (natural armor)",
        hitPoints = "59 (7d12 + 14)",
        speed = "20 ft.",
        str = 19, strMod = "+4",
        dex = 6, dexMod = "−2",
        con = 15, conMod = "+2",
        int = 10, intMod = "+0",
        wis = 10, wisMod = "+0",
        cha = 7, chaMod = "−2",
        skills = null,
        savingThrows = null,
        vulnerabilities = "fire",
        damageResistances = "bludgeoning, piercing",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "one language known by its creator",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "False Appearance. While the tree remains motionless, it is indistinguishable from a normal tree."
        ),
        actions = listOf(
            "Slam. Melee Weapon Attack: +6 to hit, reach 10 ft., one target. Hit: 14 (3d6 + 4) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "An awakened tree is an ordinary tree given sentience and mobility by magic.",
        tags = "damage resistance",
        source = "Monster Manual (SRD)"
    )
)

val shamblingMound = registerPlantStatBlock(
    StatBlock(
        name = "Shambling Mound",
        size = "Large",
        type = "plant",
        alignment = "unaligned",
        armorClass = "15 (natural armor)",
        hitPoints = "136 (16d10 + 48)",
        speed = "20 ft., swim 20 ft.",
        str = 18, strMod = "+4",
        dex = 8, dexMod = "-1",
        con = 16, conMod = "+3",
        int = 5, intMod = "-3",
        wis = 10, wisMod = "+0",
        cha = 5, chaMod = "-3",
        skills = "Stealth +2",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "cold, fire",
        damageImmunities = "lightning",
        conditionResistances = null,
        conditionImmunities = "blinded, deafened, exhaustion",
        legendaryResistance = null,
        senses = "blindsight 60 ft. (blind beyond this radius), passive Perception 10",
        languages = "—",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Lightning Absorption. Whenever the shambling mound is subjected to lightning damage, it takes no damage and regains a number of hit points equal to the lightning damage dealt."
        ),
        actions = listOf(
            "Multiattack. The shambling mound makes two slam attacks. If both attacks hit a Medium or smaller target, the target is grappled (escape DC 14), and the shambling mound uses its Engulf on it.",
            "Slam. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 13 (2d8 + 4) bludgeoning damage.",
            "Engulf. The shambling mound engulfs a Medium or smaller creature grappled by it. The engulfed target is blinded, restrained, and unable to breathe, and it must succeed on a DC 14 Constitution saving throw at the start of each of the mound's turns or take 13 (2d8 + 4) bludgeoning damage. If the mound moves, the engulfed target moves with it. The mound can have only one creature engulfed at a time."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage resistance, damage immunity, condition immunity, blindsight, multiattack, cc - grappled, cc - restrained, cc - blinded",
        source = "Monster Manual (SRD)"
    )
)

val shrieker = registerPlantStatBlock(
    StatBlock(
        name = "Shrieker",
        size = "Medium",
        type = "plant",
        alignment = "unaligned",
        armorClass = "5",
        hitPoints = "13 (3d8)",
        speed = "0 ft.",
        str = 1, strMod = "-5",
        dex = 1, dexMod = "-5",
        con = 10, conMod = "+0",
        int = 1, intMod = "-5",
        wis = 3, wisMod = "-4",
        cha = 1, chaMod = "-5",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "blinded, deafened, frightened",
        legendaryResistance = null,
        senses = "blindsight 30 ft. (blind beyond this radius), passive Perception 6",
        languages = "—",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "False Appearance. While the shrieker remains motionless, it is indistinguishable from an ordinary fungus."
        ),
        actions = listOf(),
        bonusActions = listOf(),
        reactions = listOf(
            "Shriek. When bright light or a creature is within 30 feet of the shrieker, it emits a shriek audible within 300 feet of it. The shrieker continues to shriek until the disturbance moves out of range and for 1d4 of the shrieker's turns afterward."
        ),
        legendaryActions = listOf(),
        description = null,
        tags = "condition immunity, blindsight",
        source = "Monster Manual (SRD)"
    )
)

val treant = registerPlantStatBlock(
    StatBlock(
        name = "Treant",
        size = "Huge",
        type = "plant",
        alignment = "chaotic good",
        armorClass = "16 (natural armor)",
        hitPoints = "138 (12d12 + 60)",
        speed = "30 ft.",
        str = 23, strMod = "+6",
        dex = 8, dexMod = "-1",
        con = 21, conMod = "+5",
        int = 12, intMod = "+1",
        wis = 16, wisMod = "+3",
        cha = 12, chaMod = "+1",
        skills = null,
        savingThrows = null,
        vulnerabilities = "fire",
        damageResistances = "bludgeoning, piercing",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "Common, Druidic, Elvish, Sylvan",
        challengeRating = "9",
        expValue = "5000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "False Appearance. While the treant remains motionless, it is indistinguishable from a normal tree.",
            "Siege Monster. The treant deals double damage to objects and structures."
        ),
        actions = listOf(
            "Multiattack. The treant makes two slam attacks.",
            "Slam. Melee Weapon Attack: +10 to hit, reach 5 ft., one target. Hit: 16 (3d6 + 6) bludgeoning damage.",
            "Rock. Ranged Weapon Attack: +10 to hit, range 60/180 ft., one target. Hit: 28 (4d10 + 6) bludgeoning damage.",
            "Animate Trees (1/Day). The treant magically animates one or two trees it can see within 60 feet of it. These trees have the same statistics as a treant, except they have Intelligence and Charisma scores of 1, they can't speak, and they have only the Slam action option. An animated tree acts as an ally of the treant. The tree remains animate for 1 day or until it dies; until the treant dies or is more than 120 feet from the tree; or until the treant takes a bonus action to turn it back into an inanimate tree. The tree then takes root if possible."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage resistance, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val violetFungus = registerPlantStatBlock(
    StatBlock(
        name = "Violet Fungus",
        size = "Medium",
        type = "plant",
        alignment = "unaligned",
        armorClass = "5",
        hitPoints = "18 (4d8)",
        speed = "5 ft.",
        str = 3, strMod = "-4",
        dex = 1, dexMod = "-5",
        con = 10, conMod = "+0",
        int = 1, intMod = "-5",
        wis = 3, wisMod = "-4",
        cha = 1, chaMod = "-5",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "blinded, deafened, frightened",
        legendaryResistance = null,
        senses = "blindsight 30 ft. (blind beyond this radius), passive Perception 6",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "False Appearance. While the violet fungus remains motionless, it is indistinguishable from an ordinary fungus."
        ),
        actions = listOf(
            "Multiattack. The fungus makes 1d4 Rotting Touch attacks.",
            "Rotting Touch. Melee Weapon Attack: +2 to hit, reach 10 ft., one creature. Hit: 4 (1d8) necrotic damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "condition immunity, blindsight, multiattack",
        source = "Monster Manual (SRD)"
    )
)


// Spell effects and Summons

// none