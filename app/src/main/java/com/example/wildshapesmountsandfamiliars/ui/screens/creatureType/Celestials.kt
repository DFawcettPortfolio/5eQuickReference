package com.example.wildshapesmountsandfamiliars.ui.screens.creatureType

import androidx.compose.runtime.Composable
import com.example.wildshapesmountsandfamiliars.ui.screens.CelestialStatBlockSpellEffectOrSummon
import com.example.wildshapesmountsandfamiliars.ui.screens.CelestialStatBlocks
import com.example.wildshapesmountsandfamiliars.ui.screens.CreatureTypeScreen
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.registerCelestialStatBlock

@Composable
fun Celestials(
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
        title = "Celestials",
        statBlocks = CelestialStatBlocks,
        spellEffectOrSummons = CelestialStatBlockSpellEffectOrSummon,
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


val couatl = registerCelestialStatBlock(
    StatBlock(
        name = "Couatl",
        size = "Medium",
        type = "celestial",
        alignment = "lawful good",
        armorClass = "19 (natural armor)",
        hitPoints = "97 (13d8 + 39)",
        speed = "30 ft., fly 90 ft.",
        str = 16, strMod = "+3",
        dex = 20, dexMod = "+5",
        con = 17, conMod = "+3",
        int = 18, intMod = "+4",
        wis = 20, wisMod = "+5",
        cha = 18, chaMod = "+4",
        skills = null,
        savingThrows = "Con +5, Wis +7, Cha +6",
        vulnerabilities = null,
        damageResistances = "radiant",
        damageImmunities = "psychic; bludgeoning, piercing, and slashing from nonmagical attacks",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "truesight 120 ft., passive Perception 15",
        languages = "all, telepathy 120 ft.",
        challengeRating = "4",
        expValue = "1100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Innate Spellcasting. The couatl's spellcasting ability is Charisma (spell save DC 14). It can innately cast the following spells, requiring only verbal components:\n\nAt will: detect evil and good, detect magic, detect thoughts\n3/day each: bless, create food and water, cure wounds, lesser restoration, protection from poison, sanctuary, shield\n1/day each: dream, greater restoration, scrying",
            "Magic Weapons. The couatl's weapon attacks are magical.",
            "Shielded Mind. The couatl is immune to scrying and to any effect that would sense its emotions, read its thoughts, or detect its location."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +8 to hit, reach 5 ft., one creature. Hit: 8 (1d6 + 5) piercing damage, and the target must succeed on a DC 13 Constitution saving throw or be poisoned for 24 hours. Until this poison ends, the target is unconscious. Another creature can use an action to shake the target awake.",
            "Constrict. Melee Weapon Attack: +6 to hit, reach 10 ft., one Medium or smaller creature. Hit: 10 (2d6 + 3) bludgeoning damage, and the target is grappled (escape DC 15). Until this grapple ends, the target is restrained, and the couatl can't constrict another target.",
            "Change Shape. The couatl magically polymorphs into a humanoid or beast that has a challenge rating equal to or less than its own, or back into its true form. It reverts to its true form if it dies. Any equipment it is wearing or carrying is absorbed or borne by the new form (the couatl's choice). In a new form, the couatl retains its game statistics and ability to speak, but its AC, movement modes, Strength, Dexterity, and other actions are replaced by those of the new form, and it gains any statistics and capabilities (except class features, legendary actions, and lair actions) that the new form has but that it lacks. If the new form has a bite attack, the couatl can use its bite in that form."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = emptyList(),
        description = null,
        tags = "cc - grappled, cc - poisoned, cc - restrained, cc - unconscious, damage immunity, damage resistance, fly speed, telepathic, truesight",
        source = "Monster Manual (SRD)"
    )
)

val deva = registerCelestialStatBlock(
    StatBlock(
        name = "Deva",
        size = "Medium",
        type = "celestial",
        alignment = "lawful good",
        armorClass = "17 (natural armor)",
        hitPoints = "136 (16d8 + 64)",
        speed = "30 ft., fly 90 ft.",
        str = 18, strMod = "+4",
        dex = 18, dexMod = "+4",
        con = 18, conMod = "+4",
        int = 17, intMod = "+3",
        wis = 20, wisMod = "+5",
        cha = 20, chaMod = "+5",
        skills = "Insight +9, Perception +9",
        savingThrows = "Wis +9, Cha +9",
        vulnerabilities = null,
        damageResistances = "radiant; bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "charmed, exhaustion, frightened",
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 19",
        languages = "all, telepathy 120 ft.",
        challengeRating = "10",
        expValue = "5900 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Angelic Weapons. The deva's weapon attacks are magical. When the deva hits with any weapon, the weapon deals an extra 4d8 radiant damage (included in the attack).",
            "Innate Spellcasting. The deva's spellcasting ability is Charisma (spell save DC 17). The deva can innately cast the following spells, requiring only verbal components:\n\nAt will: detect evil and good\n1/day each: commune, raise dead",
            "Magic Resistance. The deva has advantage on saving throws against spells and other magical effects."
        ),
        actions = listOf(
            "Multiattack. The deva makes two melee attacks.",
            "Mace. Melee Weapon Attack: +8 to hit, reach 5 ft., one target. Hit: 7 (1d6 + 4) bludgeoning damage plus 18 (4d8) radiant damage.",
            "Healing Touch (3/Day). The deva touches another creature. The target magically regains 20 (4d8 + 2) hit points and is freed from any curse, disease, poison, blindness, or deafness.",
            "Change Shape. The deva magically polymorphs into a humanoid or beast that has a challenge rating equal to or less than its own, or back into its true form. It reverts to its true form if it dies. Any equipment it is wearing or carrying is absorbed or borne by the new form (the deva's choice). In a new form, the deva retains its game statistics and ability to speak, but its AC, movement modes, Strength, Dexterity, and special senses are replaced by those of the new form, and it gains any statistics and capabilities (except class features, legendary actions, and lair actions) that the new form has but that it lacks."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = emptyList(),
        description = null,
        tags = "condition immunity, damage resistance, darkvision, fly speed, magic resistance, multiattack, telepathic",
        source = "Monster Manual (SRD)"
    )
)

val pegasus = registerCelestialStatBlock(
    StatBlock(
        name = "Pegasus",
        size = "Large",
        type = "celestial",
        alignment = "chaotic good",
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
        languages = "understands Celestial, Common, Elvish, and Sylvan but can't speak",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = null,
        actions = listOf(
            "Hooves. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 11 (2d6 + 4) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = emptyList(),
        description = "The white winged horses known as pegasi soar through the skies, a vision of grace and majesty.",
        tags = "fly speed",
        source = "Monster Manual (SRD)"
    )
)

val planetar = registerCelestialStatBlock(
    StatBlock(
        name = "Planetar",
        size = "Large",
        type = "celestial",
        alignment = "lawful good",
        armorClass = "19 (natural armor)",
        hitPoints = "200 (16d10 + 112)",
        speed = "40 ft., fly 120 ft.",
        str = 24, strMod = "+7",
        dex = 20, dexMod = "+5",
        con = 24, conMod = "+7",
        int = 19, intMod = "+4",
        wis = 22, wisMod = "+6",
        cha = 25, chaMod = "+7",
        skills = "Perception +11",
        savingThrows = "Con +12, Wis +11, Cha +12",
        vulnerabilities = null,
        damageResistances = "radiant; bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "charmed, exhaustion, frightened",
        legendaryResistance = null,
        senses = "truesight 120 ft., passive Perception 21",
        languages = "all, telepathy 120 ft.",
        challengeRating = "16",
        expValue = "15000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Angelic Weapons. The planetar's weapon attacks are magical. When the planetar hits with any weapon, the weapon deals an extra 5d8 radiant damage (included in the attack).",
            "Divine Awareness. The planetar knows if it hears a lie.",
            "Innate Spellcasting. The planetar's spellcasting ability is Charisma (spell save DC 20). The planetar can innately cast the following spells, requiring no material components:\n\nAt will: detect evil and good, invisibility (self only)\n3/day each: blade barrier, dispel evil and good, flame strike, raise dead\n1/day each: commune, control weather, insect plague",
            "Magic Resistance. The planetar has advantage on saving throws against spells and other magical effects."
        ),
        actions = listOf(
            "Multiattack. The planetar makes two melee attacks.",
            "Greatsword. Melee Weapon Attack: +12 to hit, reach 5 ft., one target. Hit: 21 (4d6 + 7) slashing damage plus 22 (5d8) radiant damage.",
            "Healing Touch (4/Day). The planetar touches another creature. The target magically regains 30 (6d8 + 3) hit points and is freed from any curse, disease, poison, blindness, or deafness."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = emptyList(),
        description = null,
        tags = "condition immunity, damage resistance, fly speed, magic resistance, multiattack, telepathic, truesight",
        source = "Monster Manual (SRD)"
    )
)

val solar = registerCelestialStatBlock(
    StatBlock(
        name = "Solar",
        size = "Large",
        type = "celestial",
        alignment = "lawful good",
        armorClass = "21 (natural armor)",
        hitPoints = "243 (18d10 + 144)",
        speed = "50 ft., fly 150 ft.",
        str = 26, strMod = "+8",
        dex = 22, dexMod = "+6",
        con = 26, conMod = "+8",
        int = 25, intMod = "+7",
        wis = 25, wisMod = "+7",
        cha = 30, chaMod = "+10",
        skills = "Perception +14",
        savingThrows = "Int +14, Wis +14, Cha +17",
        vulnerabilities = null,
        damageResistances = "radiant; bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "necrotic, poison",
        conditionResistances = null,
        conditionImmunities = "charmed, exhaustion, frightened, poisoned",
        legendaryResistance = null,
        senses = "truesight 120 ft., passive Perception 24",
        languages = "all, telepathy 120 ft.",
        challengeRating = "21",
        expValue = "33000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Angelic Weapons. The solar's weapon attacks are magical. When the solar hits with any weapon, the weapon deals an extra 6d8 radiant damage (included in the attack).",
            "Divine Awareness. The solar knows if it hears a lie.",
            "Innate Spellcasting. The solar's spellcasting ability is Charisma (spell save DC 25). It can innately cast the following spells, requiring no material components:\n\nAt will: detect evil and good, invisibility (self only)\n3/day each: blade barrier, dispel evil and good, resurrection\n1/day each: commune, control weather",
            "Magic Resistance. The solar has advantage on saving throws against spells and other magical effects."
        ),
        actions = listOf(
            "Multiattack. The solar makes two greatsword attacks.",
            "Greatsword. Melee Weapon Attack: +15 to hit, reach 5 ft., one target. Hit: 22 (4d6 + 8) slashing damage plus 27 (6d8) radiant damage.",
            "Slaying Longbow. Ranged Weapon Attack: +13 to hit, range 150/600 ft., one target. Hit: 15 (2d8 + 6) piercing damage plus 27 (6d8) radiant damage. If the target is a creature that has 100 hit points or fewer, it must succeed on a DC 15 Constitution saving throw or die.",
            "Flying Sword. The solar releases its greatsword to hover magically in an unoccupied space within 5 feet of it. If the solar can see the sword, the solar can mentally command it as a bonus action to fly up to 50 feet and either make one attack against a target or return to the solar's hands. If the hovering sword is targeted by any effect, the solar is considered to be holding it. The hovering sword falls if the solar dies.",
            "Healing Touch (4/Day). The solar touches another creature. The target magically regains 40 (8d8 + 4) hit points and is freed from any curse, disease, poison, blindness, or deafness."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "Teleport. The solar magically teleports, along with any equipment it is wearing or carrying, up to 120 feet to an unoccupied space it can see.",
            "Searing Burst (Costs 2 Actions). The solar emits magical, divine energy. Each creature of its choice in a 10-foot radius must make a DC 23 Dexterity saving throw, taking 14 (4d6) fire damage plus 14 (4d6) radiant damage on a failed save, or half as much damage on a successful one.",
            "Blinding Gaze (Costs 3 Actions). The solar targets one creature it can see within 30 feet of it. If the target can see it, the target must succeed on a DC 15 Constitution saving throw or be blinded until magic such as the lesser restoration spell removes the blindness."
        ),
        description = null,
        tags = "cc - blinded, damage immunity, damage resistance, fly speed, legendary action, magic resistance, multiattack, telepathic, truesight",
        source = "Monster Manual (SRD)"
    )
)

val unicorn = registerCelestialStatBlock(
    StatBlock(
        name = "Unicorn",
        size = "Large",
        type = "celestial",
        alignment = "lawful good",
        armorClass = "12",
        hitPoints = "67 (9d10 + 18)",
        speed = "50 ft.",
        str = 18, strMod = "+4",
        dex = 14, dexMod = "+2",
        con = 15, conMod = "+2",
        int = 11, intMod = "+0",
        wis = 17, wisMod = "+3",
        cha = 16, chaMod = "+3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "charmed, paralyzed, poisoned",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 13",
        languages = "Celestial, Elvish, Sylvan, telepathy 60 ft.",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Charge. If the unicorn moves at least 20 feet straight toward a target and then hits it with a horn attack on the same turn, the target takes an extra 9 (2d8) piercing damage. If the target is a creature, it must succeed on a DC 15 Strength saving throw or be knocked prone.",
            "Innate Spellcasting. The unicorn's innate spellcasting ability is Charisma (spell save DC 14). The unicorn can innately cast the following spells, requiring no components:\n\nAt will: detect evil and good, druidcraft, pass without trace\n1/day each: calm emotions, dispel evil and good, entangle",
            "Magic Resistance. The unicorn has advantage on saving throws against spells and other magical effects.",
            "Magic Weapons. The unicorn's weapon attacks are magical."
        ),
        actions = listOf(
            "Multiattack. The unicorn makes two attacks: one with its hooves and one with its horn.",
            "Hooves. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 11 (2d6 + 4) bludgeoning damage.",
            "Horn. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 8 (1d8 + 4) piercing damage.",
            "Healing Touch (3/Day). The unicorn touches another creature with its horn. The target magically regains 11 (2d8 + 2) hit points. In addition, the touch removes all diseases and neutralizes all poisons afflicting the target.",
            "Teleport (1/Day). The unicorn magically teleports itself and up to three willing creatures it can see within 5 feet of it, along with any equipment they are wearing or carrying, to a location the unicorn is familiar with, up to 1 mile away."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "Hooves. The unicorn makes one attack with its hooves.",
            "Shimmering Shield (Costs 2 Actions). The unicorn creates a shimmering, magical field around itself or another creature it can see within 60 feet of it. The target gains a +2 bonus to AC until the end of the unicorn's next turn.",
            "Heal Self (Costs 3 Actions). The unicorn magically regains 11 (2d8 + 2) hit points."
        ),
        description = null,
        tags = "cc - prone, condition immunity, damage immunity, darkvision, legendary action, magic resistance, multiattack, telepathic",
        source = "Monster Manual (SRD)"
    )
)
