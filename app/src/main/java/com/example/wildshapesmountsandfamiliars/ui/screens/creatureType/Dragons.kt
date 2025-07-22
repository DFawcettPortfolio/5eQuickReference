package com.example.wildshapesmountsandfamiliars.ui.screens.creatureType


import androidx.compose.runtime.Composable
import com.example.wildshapesmountsandfamiliars.ui.screens.CreatureTypeScreen
import com.example.wildshapesmountsandfamiliars.ui.screens.DragonStatBlockSpellEffectOrSummon
import com.example.wildshapesmountsandfamiliars.ui.screens.DragonStatBlocks
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.registerDragonStatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.registerDragonStatBlockSpellEffectOrSummon


@Composable
fun Dragons(
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
        title = "Dragons",
        statBlocks = DragonStatBlocks,
        spellEffectOrSummons = DragonStatBlockSpellEffectOrSummon,
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


val adultBlackDragon = registerDragonStatBlock(
    StatBlock(
        name = "Adult Black Dragon",
        size = "Huge",
        type = "dragon (Chromatic)",
        alignment = "chaotic evil",
        armorClass = "19 (natural armor)",
        hitPoints = "195 (17d12 + 85)",
        speed = "40 ft., fly 80 ft., swim 40 ft.",
        str = 23, strMod = "+6",
        dex = 14, dexMod = "+2",
        con = 21, conMod = "+5",
        int = 14, intMod = "+2",
        wis = 13, wisMod = "+1",
        cha = 17, chaMod = "+3",
        savingThrows = "Dex +7, Con +10, Wis +6, Cha +8",
        skills = "Perception +11, Stealth +7",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "acid",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",
        senses = "blindsight 60 ft., darkvision 120 ft., passive Perception 21",
        languages = "Common, Draconic",
        challengeRating = "14",
        expValue = "11500 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The dragon can breathe air and water.",
            "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead."
        ),
        actions = listOf(
            "Multiattack. The dragon can use its Frightful Presence. It then makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +11 to hit, reach 10 ft., one target. Hit: 17 (2d10 + 6) piercing damage plus 4 (1d8) acid damage.",
            "Claw. Melee Weapon Attack: +11 to hit, reach 5 ft., one target. Hit: 13 (2d6 + 6) slashing damage.",
            "Tail. Melee Weapon Attack: +11 to hit, reach 15 ft., one target. Hit: 15 (2d8 + 6) bludgeoning damage.",
            "Frightful Presence. Each creature of the dragon's choice that is within 120 feet of the dragon and aware of it must succeed on a DC 16 Wisdom saving throw or become frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the dragon's Frightful Presence for the next 24 hours.",
            "Acid Breath (Recharge 5-6). The dragon exhales acid in a 60-foot line that is 5 feet wide. Each creature in that line must make a DC 18 Dexterity saving throw, taking 54 (12d8) acid damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "The dragon can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The dragon regains spent legendary actions at the start of its turn.",
            "Detect. The dragon makes a Wisdom (Perception) check.",
            "Tail Attack. The dragon makes a tail attack.",
            "Wing Attack (Costs 2 Actions). The dragon beats its wings. Each creature within 10 feet of the dragon must succeed on a DC 19 Dexterity saving throw or take 13 (2d6 + 6) bludgeoning damage and be knocked prone. The dragon can then fly up to half its flying speed."
        ),
        description = null,
        tags = "fly speed, swim speed, damage immunity, blindsight, darkvision, amphibious, water breathing, legendary resistance, multiattack, cc - frightened, legendary action, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val adultBlueDragon = registerDragonStatBlock(
    StatBlock(
        name = "Adult Blue Dragon",
        size = "Huge",
        type = "dragon (Chromatic)",
        alignment = "lawful evil",
        armorClass = "19 (natural armor)",
        hitPoints = "225 (18d12 + 108)",
        speed = "40 ft., burrow 30 ft., fly 80 ft.",
        str = 25, strMod = "+7",
        dex = 10, dexMod = "+0",
        con = 23, conMod = "+6",
        int = 16, intMod = "+3",
        wis = 15, wisMod = "+2",
        cha = 19, chaMod = "+4",
        savingThrows = "Dex +5, Con +11, Wis +7, Cha +9",
        skills = "Perception +12, Stealth +5",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "lightning",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",
        senses = "blindsight 60 ft., darkvision 120 ft., passive Perception 22",
        languages = "Common, Draconic",
        challengeRating = "16",
        expValue = "15000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead."
        ),
        actions = listOf(
            "Multiattack. The dragon can use its Frightful Presence. It then makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +12 to hit, reach 10 ft., one target. Hit: 18 (2d10 + 7) piercing damage plus 5 (1d10) lightning damage.",
            "Claw. Melee Weapon Attack: +12 to hit, reach 5 ft., one target. Hit: 14 (2d6 + 7) slashing damage.",
            "Tail. Melee Weapon Attack: +12 to hit, reach 15 ft., one target. Hit: 16 (2d8 + 7) bludgeoning damage.",
            "Frightful Presence. Each creature of the dragon's choice that is within 120 feet of the dragon and aware of it must succeed on a DC 17 Wisdom saving throw or become frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the dragon's Frightful Presence for the next 24 hours.",
            "Lightning Breath (Recharge 5-6). The dragon exhales lightning in a 90-foot line that is 5 feet wide. Each creature in that line must make a DC 19 Dexterity saving throw, taking 66 (12d10) lightning damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "The dragon can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The dragon regains spent legendary actions at the start of its turn.",
            "Detect. The dragon makes a Wisdom (Perception) check.",
            "Tail Attack. The dragon makes a tail attack.",
            "Wing Attack (Costs 2 Actions). The dragon beats its wings. Each creature within 10 feet of the dragon must succeed on a DC 20 Dexterity saving throw or take 14 (2d6 + 7) bludgeoning damage and be knocked prone. The dragon can then fly up to half its flying speed."
        ),
        description = "",
        tags = "fly speed, burrow speed, damage immunity, blindsight, darkvision, multiattack, cc - frightened, legendary action, legendary resistance, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val adultBrassDragon = registerDragonStatBlock(
    StatBlock(
        name = "Adult Brass Dragon",
        size = "Huge",
        type = "dragon (Metallic)",
        alignment = "chaotic good",
        armorClass = "18 (natural armor)",
        hitPoints = "172 (15d12 + 75)",
        speed = "40 ft., burrow 30 ft., fly 80 ft.",
        str = 23, strMod = "+6",
        dex = 10, dexMod = "+0",
        con = 21, conMod = "+5",
        int = 14, intMod = "+2",
        wis = 13, wisMod = "+1",
        cha = 17, chaMod = "+3",
        savingThrows = "Dex +5, Con +10, Wis +6, Cha +8",
        skills = "History +7, Perception +11, Persuasion +8, Stealth +5",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "fire",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",
        senses = "blindsight 60 ft., darkvision 120 ft., passive Perception 21",
        languages = "Common, Draconic",
        challengeRating = "13",
        expValue = "10000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead."
        ),
        actions = listOf(
            "Multiattack. The dragon can use its Frightful Presence. It then makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +11 to hit, reach 10 ft., one target. Hit: 17 (2d10 + 6) piercing damage.",
            "Claw. Melee Weapon Attack: +11 to hit, reach 5 ft., one target. Hit: 13 (2d6 + 6) slashing damage.",
            "Tail. Melee Weapon Attack: +11 to hit, reach 15 ft., one target. Hit: 15 (2d8 + 6) bludgeoning damage.",
            "Frightful Presence. Each creature of the dragon's choice that is within 120 feet of the dragon and aware of it must succeed on a DC 16 Wisdom saving throw or become frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the dragon's Frightful Presence for the next 24 hours.",
            "Breath Weapons (Recharge 5-6). The dragon uses one of the following breath weapons.",
            "Fire Breath. The dragon exhales fire in an 60-foot line that is 5 feet wide. Each creature in that line must make a DC 18 Dexterity saving throw, taking 45 (13d6) fire damage on a failed save, or half as much damage on a successful one.",
            "Sleep Breath. The dragon exhales sleep gas in a 60-foot cone. Each creature in that area must succeed on a DC 18 Constitution saving throw or fall unconscious for 10 minutes. This effect ends for a creature if the creature takes damage or someone uses an action to wake it."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "The dragon can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The dragon regains spent legendary actions at the start of its turn.",
            "Detect. The dragon makes a Wisdom (Perception) check.",
            "Tail Attack. The dragon makes a tail attack.",
            "Wing Attack (Costs 2 Actions). The dragon beats its wings. Each creature within 10 feet of the dragon must succeed on a DC 19 Dexterity saving throw or take 13 (2d6 + 6) bludgeoning damage and be knocked prone. The dragon can then fly up to half its flying Speed."
        ),
        description = null,
        tags = "fly speed, burrow speed, damage immunity, blindsight, darkvision, legendary resistance, multiattack, cc - frightened, cc - unconscious, legendary action, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val adultBronzeDragon = registerDragonStatBlock(
    StatBlock(
        name = "Adult Bronze Dragon",
        size = "Huge",
        type = "dragon (Metallic)",
        alignment = "lawful good",
        armorClass = "19 (natural armor)",
        hitPoints = "212 (17d12 + 102)",
        speed = "40 ft., fly 80 ft., swim 40 ft.",
        str = 25, strMod = "+7",
        dex = 10, dexMod = "+0",
        con = 23, conMod = "+6",
        int = 16, intMod = "+3",
        wis = 15, wisMod = "+2",
        cha = 19, chaMod = "+4",
        savingThrows = "Dex +5, Con +11, Wis +7, Cha +9",
        skills = "Insight +7, Perception +12, Stealth +5",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "lightning",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",
        senses = "blindsight 60 ft., darkvision 120 ft., passive Perception 22",
        languages = "Common, Draconic",
        challengeRating = "15",
        expValue = "13000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The dragon can breathe air and water.",
            "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead."
        ),
        actions = listOf(
            "Multiattack. The dragon can use its Frightful Presence. It then makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +12 to hit, reach 10 ft., one target. Hit: 18 (2d10 + 7) piercing damage.",
            "Claw. Melee Weapon Attack: +12 to hit, reach 5 ft., one target. Hit: 14 (2d6 + 7) slashing damage.",
            "Tail. Melee Weapon Attack: +12 to hit, reach 15 ft., one target. Hit: 16 (2d8 + 7) bludgeoning damage.",
            "Frightful Presence. Each creature of the dragon's choice that is within 120 feet of the dragon and aware of it must succeed on a DC 17 Wisdom saving throw or become frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the dragon's Frightful Presence for the next 24 hours.",
            "Breath Weapons (Recharge 5-6). The dragon uses one of the following breath weapons.",
            "Lightning Breath. The dragon exhales lightning in a 90-foot line that is 5 feet wide. Each creature in that line must make a DC 19 Dexterity saving throw, taking 66 (12d10) lightning damage on a failed save, or half as much damage on a successful one.",
            "Repulsion Breath. The dragon exhales repulsion energy in a 30-foot cone. Each creature in that area must succeed on a DC 19 Strength saving throw. On a failed save, the creature is pushed 60 feet away from the dragon.",
            "Change Shape. The dragon magically polymorphs into a humanoid or beast that has a challenge rating no higher than its own, or back into its true form. It reverts to its true form if it dies. Any equipment it is wearing or carrying is absorbed or borne by the new form (the dragon's choice). In a new form, the dragon retains its alignment, hit points, Hit Dice, ability to speak, proficiencies, Legendary Resistance, lair actions, and Intelligence, Wisdom, and Charisma scores, as well as this action. Its statistics and capabilities are otherwise replaced by those of the new form, except any class features or legendary actions of that form."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "The dragon can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The dragon regains spent legendary actions at the start of its turn.",
            "Detect. The dragon makes a Wisdom (Perception) check.",
            "Tail Attack. The dragon makes a tail attack.",
            "Wing Attack (Costs 2 Actions). The dragon beats its wings. Each creature within 10 feet of the dragon must succeed on a DC 20 Dexterity saving throw or take 14 (2d6 + 7) bludgeoning damage and be knocked prone. The dragon can then fly up to half its flying speed."
        ),
        description = null,
        tags = "fly speed, swim speed, damage immunity, blindsight, darkvision, amphibious, water breathing, legendary resistance, multiattack, cc - frightened, legendary action, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val adultCopperDragon = registerDragonStatBlock(
    StatBlock(
        name = "Adult Copper Dragon",
        size = "Huge",
        type = "dragon (Metallic)",
        alignment = "chaotic good",
        armorClass = "18 (natural armor)",
        hitPoints = "184 (16d12 + 80)",
        speed = "40 ft., climb 40 ft., fly 80 ft.",
        str = 23, strMod = "+6",
        dex = 12, dexMod = "+1",
        con = 21, conMod = "+5",
        int = 18, intMod = "+4",
        wis = 15, wisMod = "+2",
        cha = 17, chaMod = "+3",
        savingThrows = "Dex +6, Con +10, Wis +7, Cha +8",
        skills = "Deception +8, Perception +12, Stealth +6",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "acid",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",
        senses = "blindsight 60 ft., darkvision 120 ft., passive Perception 22",
        languages = "Common, Draconic",
        challengeRating = "14",
        expValue = "11500 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead."
        ),
        actions = listOf(
            "Multiattack. The dragon can use its Frightful Presence. It then makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +11 to hit, reach 10 ft., one target. Hit: 17 (2d10 + 6) piercing damage.",
            "Claw. Melee Weapon Attack: +11 to hit, reach 5 ft., one target. Hit: 13 (2d6 + 6) slashing damage.",
            "Tail. Melee Weapon Attack: +11 to hit, reach 15 ft., one target. Hit: 15 (2d8 + 6) bludgeoning damage.",
            "Frightful Presence. Each creature of the dragon's choice that is within 120 feet of the dragon and aware of it must succeed on a DC 16 Wisdom saving throw or become frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the dragon's Frightful Presence for the next 24 hours.",
            "Breath Weapons (Recharge 5-6). The dragon uses one of the following breath weapons.",
            "Acid Breath. The dragon exhales acid in an 60-foot line that is 5 feet wide. Each creature in that line must make a DC 18 Dexterity saving throw, taking 54 (12d8) acid damage on a failed save, or half as much damage on a successful one.",
            "Slowing Breath. The dragon exhales gas in a 60-foot cone. Each creature in that area must succeed on a DC 18 Constitution saving throw. On a failed save, the creature can't use reactions, its speed is halved, and it can't make more than one attack on its turn. In addition, the creature can use either an action or a bonus action on its turn, but not both. These effects last for 1 minute. The creature can repeat the saving throw at the end of each of its turns, ending the effect on itself with a successful save."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "The dragon can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The dragon regains spent legendary actions at the start of its turn.",
            "Detect. The dragon makes a Wisdom (Perception) check.",
            "Tail Attack. The dragon makes a tail attack.",
            "Wing Attack (Costs 2 Actions). The dragon beats its wings. Each creature within 10 feet of the dragon must succeed on a DC 19 Dexterity saving throw or take 13 (2d6 + 6) bludgeoning damage and be knocked prone. The dragon can then fly up to half its flying Speed."
        ),
        description = null,
        tags = "climb speed, fly speed, damage immunity, blindsight, darkvision, legendary resistance, multiattack, cc - frightened, legendary action, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val adultGoldDragon = registerDragonStatBlock(
    StatBlock(
        name = "Adult Gold Dragon",
        size = "Huge",
        type = "dragon (Metallic)",
        alignment = "lawful good",
        armorClass = "19 (natural armor)",
        hitPoints = "256 (19d12 + 133)",
        speed = "40 ft., fly 80 ft., swim 40 ft.",
        str = 27, strMod = "+8",
        dex = 14, dexMod = "+2",
        con = 25, conMod = "+7",
        int = 16, intMod = "+3",
        wis = 15, wisMod = "+2",
        cha = 24, chaMod = "+7",
        savingThrows = "Dex +8, Con +13, Wis +8, Cha +13",
        skills = "Insight +8, Perception +14, Persuasion +13, Stealth +8",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "fire",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",
        senses = "blindsight 60 ft., darkvision 120 ft., passive Perception 24",
        languages = "Common, Draconic",
        challengeRating = "17",
        expValue = "18000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The dragon can breathe air and water.",
            "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead."
        ),
        actions = listOf(
            "Multiattack. The dragon can use its Frightful Presence. It then makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +14 to hit, reach 10 ft., one target. Hit: 19 (2d10 + 8) piercing damage.",
            "Claw. Melee Weapon Attack: +14 to hit, reach 5 ft., one target. Hit: 15 (2d6 + 8) slashing damage.",
            "Tail. Melee Weapon Attack: +14 to hit, reach 15 ft., one target. Hit: 17 (2d8 + 8) bludgeoning damage.",
            "Frightful Presence. Each creature of the dragon's choice that is within 120 feet of the dragon and aware of it must succeed on a DC 21 Wisdom saving throw or become frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the dragon's Frightful Presence for the next 24 hours.",
            "Breath Weapons (Recharge 5-6). The dragon uses one of the following breath weapons.",
            "Fire Breath. The dragon exhales fire in a 60-foot cone. Each creature in that area must make a DC 21 Dexterity saving throw, taking 66 (12d10) fire damage on a failed save, or half as much damage on a successful one.",
            "Weakening Breath. The dragon exhales gas in a 60-foot cone. Each creature in that area must succeed on a DC 21 Strength saving throw or have disadvantage on Strength-based attack rolls, Strength checks, and Strength saving throws for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success.",
            "Change Shape. The dragon magically polymorphs into a humanoid or beast that has a challenge rating no higher than its own, or back into its true form. It reverts to its true form if it dies. Any equipment it is wearing or carrying is absorbed or borne by the new form (the dragon's choice). In a new form, the dragon retains its alignment, hit points, Hit Dice, ability to speak, proficiencies, Legendary Resistance, lair actions, and Intelligence, Wisdom, and Charisma scores, as well as this action. Its statistics and capabilities are otherwise replaced by those of the new form, except any class features or legendary actions of that form."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "The dragon can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The dragon regains spent legendary actions at the start of its turn.",
            "Detect. The dragon makes a Wisdom (Perception) check.",
            "Tail Attack. The dragon makes a tail attack.",
            "Wing Attack (Costs 2 Actions). The dragon beats its wings. Each creature within 10 feet of the dragon must succeed on a DC 22 Dexterity saving throw or take 15 (2d6 + 8) bludgeoning damage and be knocked prone. The dragon can then fly up to half its flying Speed."
        ),
        description = null,
        tags = "fly speed, swim speed, damage immunity, blindsight, darkvision, amphibious, water breathing, legendary resistance, multiattack, cc - frightened, legendary action, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val adultGreenDragon = registerDragonStatBlock(
    StatBlock(
        name = "Adult Green Dragon",
        size = "Huge",
        type = "dragon (Chromatic)",
        alignment = "lawful evil",
        armorClass = "19 (natural armor)",
        hitPoints = "207 (18d12 + 90)",
        speed = "40 ft., fly 80 ft., swim 40 ft.",
        str = 23, strMod = "+6",
        dex = 12, dexMod = "+1",
        con = 21, conMod = "+5",
        int = 18, intMod = "+4",
        wis = 15, wisMod = "+2",
        cha = 17, chaMod = "+3",
        savingThrows = "Dex +6, Con +10, Wis +7, Cha +8",
        skills = "Deception +8, Insight +7, Perception +12, Persuasion +8, Stealth +6",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",
        senses = "blindsight 60 ft., darkvision 120 ft., passive Perception 22",
        languages = "Common, Draconic",
        challengeRating = "15",
        expValue = "13000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The dragon can breathe air and water.",
            "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead."
        ),
        actions = listOf(
            "Multiattack. The dragon can use its Frightful Presence. It then makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +11 to hit, reach 10 ft., one target. Hit: 17 (2d10 + 6) piercing damage plus 7 (2d6) poison damage.",
            "Claw. Melee Weapon Attack: +11 to hit, reach 5 ft., one target. Hit: 13 (2d6 + 6) slashing damage.",
            "Tail. Melee Weapon Attack: +11 to hit, reach 15 ft., one target. Hit: 15 (2d8 + 6) bludgeoning damage.",
            "Frightful Presence. Each creature of the dragon's choice that is within 120 feet of the dragon and aware of it must succeed on a DC 16 Wisdom saving throw or become frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the dragon's Frightful Presence for the next 24 hours.",
            "Poison Breath (Recharge 5-6). The dragon exhales poisonous gas in a 60-foot cone. Each creature in that area must make a DC 18 Constitution saving throw, taking 56 (16d6) poison damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "The dragon can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The dragon regains spent legendary actions at the start of its turn.",
            "Detect. The dragon makes a Wisdom (Perception) check.",
            "Tail Attack. The dragon makes a tail attack.",
            "Wing Attack (Costs 2 Actions). The dragon beats its wings. Each creature within 10 feet of the dragon must succeed on a DC 19 Dexterity saving throw or take 13 (2d6 + 6) bludgeoning damage and be knocked prone. The dragon can then fly up to half its flying speed."
        ),
        description = null,
        tags = "fly speed, swim speed, damage immunity, condition immunity, blindsight, darkvision, amphibious, water breathing, legendary resistance, multiattack, cc - frightened, legendary action, cc - prone, cc - poisoned",
        source = "Monster Manual (SRD)"
    )
)

val adultRedDragon = registerDragonStatBlock(
    StatBlock(
        name = "Adult Red Dragon",
        size = "Huge",
        type = "dragon (Chromatic)",
        alignment = "chaotic evil",
        armorClass = "19 (natural armor)",
        hitPoints = "256 (19d12 + 133)",
        speed = "40 ft., climb 40 ft., fly 80 ft.",
        str = 27, strMod = "+8",
        dex = 10, dexMod = "+0",
        con = 25, conMod = "+7",
        int = 16, intMod = "+3",
        wis = 13, wisMod = "+1",
        cha = 21, chaMod = "+5",
        savingThrows = "Dex +6, Con +13, Wis +7, Cha +11",
        skills = "Perception +13, Stealth +6",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "fire",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",
        senses = "blindsight 60 ft., darkvision 120 ft., passive Perception 23",
        languages = "Common, Draconic",
        challengeRating = "17",
        expValue = "18000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead."
        ),
        actions = listOf(
            "Multiattack. The dragon can use its Frightful Presence. It then makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +14 to hit, reach 10 ft., one target. Hit: 19 (2d10 + 8) piercing damage plus 7 (2d6) fire damage.",
            "Claw. Melee Weapon Attack: +14 to hit, reach 5 ft., one target. Hit: 15 (2d6 + 8) slashing damage.",
            "Tail. Melee Weapon Attack: +14 to hit, reach 15 ft., one target. Hit: 17 (2d8 + 8) bludgeoning damage.",
            "Frightful Presence. Each creature of the dragon's choice that is within 120 feet of the dragon and aware of it must succeed on a DC 19 Wisdom saving throw or become frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the dragon's Frightful Presence for the next 24 hours.",
            "Fire Breath (Recharge 5-6). The dragon exhales fire in a 60-foot cone. Each creature in that area must make a DC 21 Dexterity saving throw, taking 63 (18d6) fire damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "The dragon can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The dragon regains spent legendary actions at the start of its turn.",
            "Detect. The dragon makes a Wisdom (Perception) check.",
            "Tail Attack. The dragon makes a tail attack.",
            "Wing Attack (Costs 2 Actions). The dragon beats its wings. Each creature within 10 feet of the dragon must succeed on a DC 22 Dexterity saving throw or take 15 (2d6 + 8) bludgeoning damage and be knocked prone. The dragon can then fly up to half its flying speed."
        ),
        description = "The odor of sulfur and pumice surrounds a red dragon, whose swept-back horns and spinal frill define its silhouette. Its beaked snout vents smoke at all times, and its eyes dance with flame when it is angry.",
        tags = "climb speed, fly speed, damage immunity, blindsight, darkvision, legendary resistance, multiattack, cc - frightened, legendary action, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val adultSilverDragon = registerDragonStatBlock(
    StatBlock(
        name = "Adult Silver Dragon",
        size = "Huge",
        type = "dragon (Metallic)",
        alignment = "lawful good",
        armorClass = "19 (natural armor)",
        hitPoints = "243 (18d12 + 126)",
        speed = "40 ft., fly 80 ft.",
        str = 27, strMod = "+8",
        dex = 10, dexMod = "+0",
        con = 25, conMod = "+7",
        int = 16, intMod = "+3",
        wis = 13, wisMod = "+1",
        cha = 21, chaMod = "+5",
        savingThrows = "Dex +5, Con +12, Wis +6, Cha +10",
        skills = "Arcana +8, History +8, Perception +11, Stealth +5",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "cold",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",
        senses = "blindsight 60 ft., darkvision 120 ft., passive Perception 21",
        languages = "Common, Draconic",
        challengeRating = "16",
        expValue = "15000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The dragon can breathe air and water.",
            "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead."
        ),
        actions = listOf(
            "Multiattack. The dragon can use its Frightful Presence. It then makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +13 to hit, reach 10 ft., one target. Hit: 19 (2d10 + 8) piercing damage.",
            "Claw. Melee Weapon Attack: +13 to hit, reach 5 ft., one target. Hit: 15 (2d6 + 8) slashing damage.",
            "Tail. Melee Weapon Attack: +13 to hit, reach 15 ft., one target. Hit: 17 (2d8 + 8) bludgeoning damage.",
            "Frightful Presence. Each creature of the dragon's choice that is within 120 feet of the dragon and aware of it must succeed on a DC 18 Wisdom saving throw or become frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the dragon's Frightful Presence for the next 24 hours.",
            "Cold Breath (Recharge 5-6). The dragon exhales an icy blast in a 60-foot cone. Each creature in that area must make a DC 20 Constitution saving throw, taking 58 (13d8) cold damage on a failed save, or half as much damage on a successful one.",
            "Paralyzing Breath (Recharge 5-6). The dragon exhales paralyzing gas in a 60-foot cone. Each creature in that area must succeed on a DC 20 Constitution saving throw or be paralyzed for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success.",
            "Change Shape. The dragon magically polymorphs into a humanoid or beast that has a challenge rating no higher than its own, or back into its true form. It reverts to its true form if it dies. Any equipment it is wearing or carrying is absorbed or borne by the new form (the dragon's choice). In a new form, the dragon retains its alignment, hit points, Hit Dice, ability to speak, proficiencies, Legendary Resistance, lair actions, and Intelligence, Wisdom, and Charisma scores, as well as this action. Its statistics and capabilities are otherwise replaced by those of the new form, except any class features or legendary actions of that form."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "The dragon can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The dragon regains spent legendary actions at the start of its turn.",
            "Detect. The dragon makes a Wisdom (Perception) check.",
            "Tail Attack. The dragon makes a tail attack.",
            "Wing Attack (Costs 2 Actions). The dragon beats its wings. Each creature within 10 feet of the dragon must succeed on a DC 21 Dexterity saving throw or take 15 (2d6 + 8) bludgeoning damage and be knocked prone. The dragon can then fly up to half its flying speed."
        ),
        description = null,
        tags = "fly speed, damage immunity, blindsight, darkvision, amphibious, water breathing, legendary resistance, multiattack, cc - frightened, legendary action, cc - prone, cc - paralyzed",
        source = "Monster Manual (SRD)"
    )
)

val adultWhiteDragon = registerDragonStatBlock(
    StatBlock(
        name = "Adult White Dragon",
        size = "Huge",
        type = "dragon (Chromatic)",
        alignment = "chaotic evil",
        armorClass = "18 (natural armor)",
        hitPoints = "200 (16d12 + 96)",
        speed = "40 ft., burrow 30 ft., fly 80 ft., swim 40 ft.",
        str = 22, strMod = "+6",
        dex = 10, dexMod = "+0",
        con = 22, conMod = "+6",
        int = 8, intMod = "-1",
        wis = 12, wisMod = "+1",
        cha = 12, chaMod = "+1",
        savingThrows = "Dex +5, Con +11, Wis +6, Cha +6",
        skills = "Perception +11, Stealth +5",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "cold",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",
        senses = "blindsight 60 ft., darkvision 120 ft., passive Perception 21",
        languages = "Common, Draconic",
        challengeRating = "13",
        expValue = "10000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Ice Walk. The dragon can move across and climb icy surfaces without needing to make an ability check. Additionally, difficult terrain composed of ice or snow doesn't cost it extra movement.",
            "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead."
        ),
        actions = listOf(
            "Multiattack. The dragon can use its Frightful Presence. It then makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +11 to hit, reach 10 ft., one target. Hit: 17 (2d10 + 6) piercing damage plus 4 (1d8) cold damage.",
            "Claw. Melee Weapon Attack: +11 to hit, reach 5 ft., one target. Hit: 13 (2d6 + 6) slashing damage.",
            "Tail. Melee Weapon Attack: +11 to hit, reach 15 ft., one target. Hit: 15 (2d8 + 6) bludgeoning damage.",
            "Frightful Presence. Each creature of the dragon's choice that is within 120 feet of the dragon and aware of it must succeed on a DC 14 Wisdom saving throw or become frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the dragon's Frightful Presence for the next 24 hours.",
            "Cold Breath (Recharge 5-6). The dragon exhales an icy blast in a 60-foot cone. Each creature in that area must make a DC 19 Constitution saving throw, taking 54 (12d8) cold damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "The dragon can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The dragon regains spent legendary actions at the start of its turn.",
            "Detect. The dragon makes a Wisdom (Perception) check.",
            "Tail Attack. The dragon makes a tail attack.",
            "Wing Attack (Costs 2 Actions). The dragon beats its wings. Each creature within 10 feet of the dragon must succeed on a DC 19 Dexterity saving throw or take 13 (2d6 + 6) bludgeoning damage and be knocked prone. The dragon can then fly up to half its flying speed."
        ),
        description = null,
        tags = "burrow speed, fly speed, swim speed, damage immunity, blindsight, darkvision, legendary resistance, multiattack, cc - frightened, legendary action, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val ancientBlackDragon = registerDragonStatBlock(
    StatBlock(
        name = "Ancient Black Dragon",
        size = "Gargantuan",
        type = "dragon (Chromatic)",
        alignment = "chaotic evil",
        armorClass = "22 (natural armor)",
        hitPoints = "367 (21d20 + 147)",
        speed = "40 ft., fly 80 ft., swim 40 ft.",
        str = 27, strMod = "+8",
        dex = 14, dexMod = "+2",
        con = 25, conMod = "+7",
        int = 16, intMod = "+3",
        wis = 15, wisMod = "+2",
        cha = 19, chaMod = "+4",
        savingThrows = "Dex +9, Con +14, Wis +9, Cha +11",
        skills = "Perception +16, Stealth +9",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "acid",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",
        senses = "blindsight 60 ft., darkvision 120 ft., passive Perception 26",
        languages = "Common, Draconic",
        challengeRating = "21",
        expValue = "33000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The dragon can breathe air and water.",
            "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead."
        ),
        actions = listOf(
            "Multiattack. The dragon can use its Frightful Presence. It then makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +15 to hit, reach 15 ft., one target. Hit: 19 (2d10 + 8) piercing damage plus 9 (2d8) acid damage.",
            "Claw. Melee Weapon Attack: +15 to hit, reach 10 ft., one target. Hit: 15 (2d6 + 8) slashing damage.",
            "Tail. Melee Weapon Attack: +15 to hit, reach 20 ft., one target. Hit: 17 (2d8 + 8) bludgeoning damage.",
            "Frightful Presence. Each creature of the dragon's choice that is within 120 feet of the dragon and aware of it must succeed on a DC 19 Wisdom saving throw or become frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the dragon's Frightful Presence for the next 24 hours.",
            "Acid Breath (Recharge 5-6). The dragon exhales acid in a 90-foot line that is 10 feet wide. Each creature in that line must make a DC 22 Dexterity saving throw, taking 67 (15d8) acid damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "The dragon can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The dragon regains spent legendary actions at the start of its turn.",
            "Detect. The dragon makes a Wisdom (Perception) check.",
            "Tail Attack. The dragon makes a tail attack.",
            "Wing Attack (Costs 2 Actions). The dragon beats its wings. Each creature within 15 feet of the dragon must succeed on a DC 23 Dexterity saving throw or take 15 (2d6 + 8) bludgeoning damage and be knocked prone. The dragon can then fly up to half its flying Speed."
        ),
        description = null,
        tags = "fly speed, swim speed, damage immunity, blindsight, darkvision, amphibious, water breathing, legendary resistance, multiattack, cc - frightened, legendary action, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val ancientBlueDragon = registerDragonStatBlock(
    StatBlock(
        name = "Ancient Blue Dragon",
        size = "Gargantuan",
        type = "dragon (Chromatic)",
        alignment = "lawful evil",
        armorClass = "22 (natural armor)",
        hitPoints = "481 (26d20 + 208)",
        speed = "40 ft., burrow 40 ft., fly 80 ft.",
        str = 29, strMod = "+9",
        dex = 10, dexMod = "+0",
        con = 27, conMod = "+8",
        int = 18, intMod = "+4",
        wis = 17, wisMod = "+3",
        cha = 21, chaMod = "+5",
        savingThrows = "Dex +7, Con +15, Wis +10, Cha +12",
        skills = "Perception +17, Stealth +7",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "lightning",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",
        senses = "blindsight 60 ft., darkvision 120 ft., passive Perception 27",
        languages = "Common, Draconic",
        challengeRating = "23",
        expValue = "50000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead."
        ),
        actions = listOf(
            "Multiattack. The dragon can use its Frightful Presence. It then makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +16 to hit, reach 15 ft., one target. Hit: 20 (2d10 + 9) piercing damage plus 11 (2d10) lightning damage.",
            "Claw. Melee Weapon Attack: +16 to hit, reach 10 ft., one target. Hit: 16 (2d6 + 9) slashing damage.",
            "Tail. Melee Weapon Attack: +16 to hit, reach 20 ft., one target. Hit: 18 (2d8 + 9) bludgeoning damage.",
            "Frightful Presence. Each creature of the dragon's choice that is within 120 feet of the dragon and aware of it must succeed on a DC 20 Wisdom saving throw or become frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the dragon's Frightful Presence for the next 24 hours.",
            "Lightning Breath (Recharge 5-6). The dragon exhales lightning in a 120-foot line that is 10 feet wide. Each creature in that line must make a DC 23 Dexterity saving throw, taking 88 (16d10) lightning damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "The dragon can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The dragon regains spent legendary actions at the start of its turn.",
            "Detect. The dragon makes a Wisdom (Perception) check.",
            "Tail Attack. The dragon makes a tail attack.",
            "Wing Attack (Costs 2 Actions). The dragon beats its wings. Each creature within 15 feet of the dragon must succeed on a DC 24 Dexterity saving throw or take 16 (2d6 + 9) bludgeoning damage and be knocked prone. The dragon can then fly up to half its flying Speed."
        ),
        description = null,
        tags = "burrow speed, fly speed, damage immunity, blindsight, darkvision, legendary resistance, multiattack, cc - frightened, legendary action, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val ancientBrassDragon = registerDragonStatBlock(
    StatBlock(
        name = "Ancient Brass Dragon",
        size = "Gargantuan",
        type = "dragon (Metallic)",
        alignment = "chaotic good",
        armorClass = "20 (natural armor)",
        hitPoints = "297 (17d20 + 119)",
        speed = "40 ft., burrow 40 ft., fly 80 ft.",
        str = 27, strMod = "+8",
        dex = 10, dexMod = "+0",
        con = 25, conMod = "+7",
        int = 16, intMod = "+3",
        wis = 15, wisMod = "+2",
        cha = 19, chaMod = "+4",
        savingThrows = "Dex +6, Con +13, Wis +8, Cha +10",
        skills = "History +9, Perception +14, Persuasion +10, Stealth +6",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "fire",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",
        senses = "blindsight 60 ft., darkvision 120 ft., passive Perception 24",
        languages = "Common, Draconic",
        challengeRating = "20",
        expValue = "25000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The dragon can breathe air and water.",
            "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead."
        ),
        actions = listOf(
            "Multiattack. The dragon can use its Frightful Presence. It then makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +14 to hit, reach 15 ft., one target. Hit: 19 (2d10 + 8) piercing damage.",
            "Claw. Melee Weapon Attack: +14 to hit, reach 10 ft., one target. Hit: 15 (2d6 + 8) slashing damage.",
            "Tail. Melee Weapon Attack: +14 to hit, reach 20 ft., one target. Hit: 17 (2d8 + 8) bludgeoning damage.",
            "Frightful Presence. Each creature of the dragon's choice that is within 120 feet of the dragon and aware of it must succeed on a DC 18 Wisdom saving throw or become frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the dragon's Frightful Presence for the next 24 hours.",
            "Fire Breath (Recharge 5-6). The dragon exhales fire in an 90-foot line that is 10 feet wide. Each creature in that line must make a DC 21 Dexterity saving throw, taking 56 (16d6) fire damage on a failed save, or half as much damage on a successful one.",
            "Sleep Breath (Recharge 5-6). The dragon exhales sleep gas in a 90-foot cone. Each creature in that area must succeed on a DC 21 Constitution saving throw or fall unconscious for 10 minutes. This effect ends for a creature if the creature takes damage or someone uses an action to wake it."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "The dragon can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The dragon regains spent legendary actions at the start of its turn.",
            "Detect. The dragon makes a Wisdom (Perception) check.",
            "Tail Attack. The dragon makes a tail attack.",
            "Wing Attack (Costs 2 Actions). The dragon beats its wings. Each creature within 15 feet of the dragon must succeed on a DC 22 Dexterity saving throw or take 15 (2d6 + 8) bludgeoning damage and be knocked prone. The dragon can then fly up to half its flying Speed."
        ),
        description = null,
        tags = "burrow speed, fly speed, damage immunity, blindsight, darkvision, legendary resistance, multiattack, cc - frightened, cc - unconscious, legendary action, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val ancientBronzeDragon = registerDragonStatBlock(
    StatBlock(
        name = "Ancient Bronze Dragon",
        size = "Gargantuan",
        type = "dragon (Metallic)",
        alignment = "lawful good",
        armorClass = "22 (natural armor)",
        hitPoints = "444 (24d20 + 192)",
        speed = "40 ft., fly 80 ft., swim 40 ft.",
        str = 29, strMod = "+9",
        dex = 10, dexMod = "+0",
        con = 27, conMod = "+8",
        int = 18, intMod = "+4",
        wis = 17, wisMod = "+3",
        cha = 21, chaMod = "+5",
        savingThrows = "Dex +7, Con +15, Wis +10, Cha +12",
        skills = "Insight +10, Perception +17, Stealth +7",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "lightning",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",
        senses = "blindsight 60 ft., darkvision 120 ft., passive Perception 27",
        languages = "Common, Draconic",
        challengeRating = "22",
        expValue = "41000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The dragon can breathe air and water.",
            "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",
        ),
        actions = listOf(
            "Multiattack. The dragon can use its Frightful Presence. It then makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +16 to hit, reach 15 ft., one target. Hit: 20 (2d10 + 9) piercing damage.",
            "Claw. Melee Weapon Attack: +16 to hit, reach 10 ft., one target. Hit: 16 (2d6 + 9) slashing damage.",
            "Tail. Melee Weapon Attack: +16 to hit, reach 20 ft., one target. Hit: 18 (2d8 + 9) bludgeoning damage.",
            "Frightful Presence. Each creature of the dragon's choice that is within 120 feet of the dragon and aware of it must succeed on a DC 20 Wisdom saving throw or become frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the dragon's Frightful Presence for the next 24 hours.",
            "Breath Weapons (Recharge 5-6). The dragon uses one of the following breath weapons.",
            "Lightning Breath. The dragon exhales lightning in a 120-foot line that is 10 feet wide. Each creature in that line must make a DC 23 Dexterity saving throw, taking 88 (16d10) lightning damage on a failed save, or half as much damage on a successful one.",
            "Repulsion Breath. The dragon exhales repulsion energy in a 30-foot cone. Each creature in that area must succeed on a DC 23 Strength saving throw. On a failed save, the creature is pushed 60 feet away from the dragon.",
            "Change Shape. The dragon magically polymorphs into a humanoid or beast that has a challenge rating no higher than its own, or back into its true form. It reverts to its true form if it dies. Any equipment it is wearing or carrying is absorbed or borne by the new form (the dragon's choice). In a new form, the dragon retains its alignment, hit points, Hit Dice, ability to speak, proficiencies, Legendary Resistance, lair actions, and Intelligence, Wisdom, and Charisma scores, as well as this action. Its statistics and capabilities are otherwise replaced by those of the new form, except any class features or legendary actions of that form."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "The dragon can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The dragon regains spent legendary actions at the start of its turn.",
            "Detect. The dragon makes a Wisdom (Perception) check.",
            "Tail Attack. The dragon makes a tail attack.",
            "Wing Attack (Costs 2 Actions). The dragon beats its wings. Each creature within 15 feet of the dragon must succeed on a DC 24 Dexterity saving throw or take 16 (2d6 + 9) bludgeoning damage and be knocked prone. The dragon can then fly up to half its flying Speed."
        ),
        description = null,
        tags = "fly speed, swim speed, damage immunity, blindsight, darkvision, amphibious, water breathing, legendary resistance, multiattack, cc - frightened, legendary action, cc - prone",
        source = "Monster Manual (SRD)"
    )
)
val ancientCopperDragon = registerDragonStatBlock(
    StatBlock(
        name = "Ancient Copper Dragon",
        size = "Gargantuan",
        type = "dragon (Metallic)",
        alignment = "chaotic good",
        armorClass = "21 (natural armor)",
        hitPoints = "350 (20d20 + 140)",
        speed = "40 ft., climb 40 ft., fly 80 ft.",
        str = 27, strMod = "+8",
        dex = 12, dexMod = "+1",
        con = 25, conMod = "+7",
        int = 20, intMod = "+5",
        wis = 17, wisMod = "+3",
        cha = 19, chaMod = "+4",
        savingThrows = "Dex +8, Con +14, Wis +10, Cha +11",
        skills = "Deception +11, Perception +17, Stealth +8",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "acid",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",
        senses = "blindsight 60 ft., darkvision 120 ft., passive Perception 27",
        languages = "Common, Draconic",
        challengeRating = "21",
        expValue = "33000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",

        ),
        actions = listOf(
            "Multiattack. The dragon can use its Frightful Presence. It then makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +15 to hit, reach 15 ft., one target. Hit: 19 (2d10 + 8) piercing damage.",
            "Claw. Melee Weapon Attack: +15 to hit, reach 10 ft., one target. Hit: 15 (2d6 + 8) slashing damage.",
            "Tail. Melee Weapon Attack: +15 to hit, reach 20 ft., one target. Hit: 17 (2d8 + 8) bludgeoning damage.",
            "Frightful Presence. Each creature of the dragon's choice that is within 120 feet of the dragon and aware of it must succeed on a DC 19 Wisdom saving throw or become frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the dragon's Frightful Presence for the next 24 hours.",
            "Acid Breath (Recharge 5-6). The dragon exhales acid in a 90-foot line that is 10 feet wide. Each creature in that line must make a DC 22 Dexterity saving throw, taking 63 (14d8) acid damage on a failed save, or half as much damage on a successful one.",
            "Slowing Breath (Recharge 5-6). The dragon exhales gas in a 90-foot cone. Each creature in that area must succeed on a DC 22 Constitution saving throw. On a failed save, the creature can't use reactions, its speed is halved, and it can't make more than one attack on its turn. In addition, the creature can use either an action or a bonus action on its turn, but not both. These effects last for 1 minute. The creature can repeat the saving throw at the end of each of its turns, ending the effect on itself with a successful save.",
            "Change Shape. The dragon magically polymorphs into a humanoid or beast that has a challenge rating no higher than its own, or back into its true form. It reverts to its true form if it dies. Any equipment it is wearing or carrying is absorbed or borne by the new form (the dragon's choice). In a new form, the dragon retains its alignment, hit points, Hit Dice, ability to speak, proficiencies, Legendary Resistance, lair actions, and Intelligence, Wisdom, and Charisma scores, as well as this action. Its statistics and capabilities are otherwise replaced by those of the new form, except any class features or legendary actions of that form."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "The dragon can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The dragon regains spent legendary actions at the start of its turn.",
            "Detect. The dragon makes a Wisdom (Perception) check.",
            "Tail Attack. The dragon makes a tail attack.",
            "Wing Attack (Costs 2 Actions). The dragon beats its wings. Each creature within 15 feet of the dragon must succeed on a DC 23 Dexterity saving throw or take 15 (2d6 + 8) bludgeoning damage and be knocked prone. The dragon can then fly up to half its flying Speed."
        ),
        description = null,
        tags = "climb speed, fly speed, damage immunity, blindsight, darkvision, legendary resistance, multiattack, cc - frightened, legendary action, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val ancientGoldDragon = registerDragonStatBlock(
    StatBlock(
        name = "Ancient Gold Dragon",
        size = "Gargantuan",
        type = "dragon (Metallic)",
        alignment = "lawful good",
        armorClass = "22 (natural armor)",
        hitPoints = "546 (28d20 + 252)",
        speed = "40 ft., fly 80 ft., swim 40 ft.",
        str = 30, strMod = "+10",
        dex = 14, dexMod = "+2",
        con = 29, conMod = "+9",
        int = 18, intMod = "+4",
        wis = 17, wisMod = "+3",
        cha = 28, chaMod = "+9",
        savingThrows = "Dex +9, Con +16, Wis +10, Cha +16",
        skills = "Insight +10, Perception +17, Persuasion +16, Stealth +9",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "fire",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",
        senses = "blindsight 60 ft., darkvision 120 ft., passive Perception 27",
        languages = "Common, Draconic",
        challengeRating = "24",
        expValue = "62000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The dragon can breathe air and water.",
            "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead."
        ),
        actions = listOf(
            "Multiattack. The dragon can use its Frightful Presence. It then makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +17 to hit, reach 15 ft., one target. Hit: 21 (2d10 + 10) piercing damage.",
            "Claw. Melee Weapon Attack: +17 to hit, reach 10 ft., one target. Hit: 17 (2d6 + 10) slashing damage.",
            "Tail. Melee Weapon Attack: +17 to hit, reach 20 ft., one target. Hit: 19 (2d8 + 10) bludgeoning damage.",
            "Frightful Presence. Each creature of the dragon's choice that is within 120 feet of the dragon and aware of it must succeed on a DC 24 Wisdom saving throw or become frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the dragon's Frightful Presence for the next 24 hours.",
            "Fire Breath (Recharge 5-6). The dragon exhales fire in a 90-foot cone. Each creature in that area must make a DC 24 Dexterity saving throw, taking 71 (13d10) fire damage on a failed save, or half as much damage on a successful one.",
            "Weakening Breath (Recharge 5-6). The dragon exhales gas in a 90-foot cone. Each creature in that area must succeed on a DC 24 Strength saving throw or have disadvantage on Strength-based attack rolls, Strength checks, and Strength saving throws for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success.",
            "Change Shape. The dragon magically polymorphs into a humanoid or beast that has a challenge rating no higher than its own, or back into its true form. It reverts to its true form if it dies. Any equipment it is wearing or carrying is absorbed or borne by the new form (the dragon's choice). In a new form, the dragon retains its alignment, hit points, Hit Dice, ability to speak, proficiencies, Legendary Resistance, lair actions, and Intelligence, Wisdom, and Charisma scores, as well as this action. Its statistics and capabilities are otherwise replaced by those of the new form, except any class features or legendary actions of that form."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "The dragon can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The dragon regains spent legendary actions at the start of its turn.",
            "Detect. The dragon makes a Wisdom (Perception) check.",
            "Tail Attack. The dragon makes a tail attack.",
            "Wing Attack (Costs 2 Actions). The dragon beats its wings. Each creature within 15 feet of the dragon must succeed on a DC 25 Dexterity saving throw or take 17 (2d6 + 10) bludgeoning damage and be knocked prone. The dragon can then fly up to half its flying Speed."
        ),
        description = null,
        tags = "fly speed, swim speed, damage immunity, blindsight, darkvision, amphibious, water breathing, legendary resistance, multiattack, cc - frightened, legendary action, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val ancientGreenDragon = registerDragonStatBlock(
    StatBlock(
        name = "Ancient Green Dragon",
        size = "Gargantuan",
        type = "dragon (Chromatic)",
        alignment = "lawful evil",
        armorClass = "21 (natural armor)",
        hitPoints = "385 (22d20 + 154)",
        speed = "40 ft., fly 80 ft., swim 40 ft.",
        str = 27, strMod = "+8",
        dex = 12, dexMod = "+1",
        con = 25, conMod = "+7",
        int = 20, intMod = "+5",
        wis = 17, wisMod = "+3",
        cha = 19, chaMod = "+4",
        savingThrows = "Dex +8, Con +14, Wis +10, Cha +11",
        skills = "Deception +11, Insight +10, Perception +17, Persuasion +11, Stealth +8",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",
        senses = "blindsight 60 ft., darkvision 120 ft., passive Perception 27",
        languages = "Common, Draconic",
        challengeRating = "22",
        expValue = "41000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The dragon can breathe air and water.",
            "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead."
        ),
        actions = listOf(
            "Multiattack. The dragon can use its Frightful Presence. It then makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +15 to hit, reach 15 ft., one target. Hit: 19 (2d10 + 8) piercing damage plus 10 (3d6) poison damage.",
            "Claw. Melee Weapon Attack: +15 to hit, reach 10 ft., one target. Hit: 22 (4d6 + 8) slashing damage.",
            "Tail. Melee Weapon Attack: +15 to hit, reach 20 ft., one target. Hit: 17 (2d8 + 8) bludgeoning damage.",
            "Frightful Presence. Each creature of the dragon's choice that is within 120 feet of the dragon and aware of it must succeed on a DC 19 Wisdom saving throw or become frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the dragon's Frightful Presence for the next 24 hours.",
            "Poison Breath (Recharge 5-6). The dragon exhales poisonous gas in a 90-foot cone. Each creature in that area must make a DC 22 Constitution saving throw, taking 77 (22d6) poison damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "The dragon can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The dragon regains spent legendary actions at the start of its turn.",
            "Detect. The dragon makes a Wisdom (Perception) check.",
            "Tail Attack. The dragon makes a tail attack.",
            "Wing Attack (Costs 2 Actions). The dragon beats its wings. Each creature within 15 feet of the dragon must succeed on a DC 23 Dexterity saving throw or take 15 (2d6 + 8) bludgeoning damage and be knocked prone. The dragon can then fly up to half its flying Speed."
        ),
        description = null,
        tags = "fly speed, swim speed, damage immunity, condition immunity, blindsight, darkvision, amphibious, water breathing, legendary resistance, multiattack, cc - frightened, legendary action, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val ancientRedDragon = registerDragonStatBlock(
    StatBlock(
        name = "Ancient Red Dragon",
        size = "Gargantuan",
        type = "dragon (Chromatic)",
        alignment = "chaotic evil",
        armorClass = "22 (natural armor)",
        hitPoints = "546 (28d20 + 252)",
        speed = "40 ft., climb 40 ft., fly 80 ft.",
        str = 30, strMod = "+10",
        dex = 10, dexMod = "+0",
        con = 29, conMod = "+9",
        int = 18, intMod = "+4",
        wis = 15, wisMod = "+2",
        cha = 23, chaMod = "+6",
        savingThrows = "Dex +7, Con +16, Wis +9, Cha +13",
        skills = "Perception +16, Stealth +7",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "fire",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",
        senses = "blindsight 60 ft., darkvision 120 ft., passive Perception 26",
        languages = "Common, Draconic",
        challengeRating = "24",
        expValue = "62000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead."
        ),
        actions = listOf(
            "Multiattack. The dragon can use its Frightful Presence. It then makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +17 to hit, reach 15 ft., one target. Hit: 21 (2d10 + 10) piercing damage plus 14 (4d6) fire damage.",
            "Claw. Melee Weapon Attack: +17 to hit, reach 10 ft., one target. Hit: 17 (2d6 + 10) slashing damage.",
            "Tail. Melee Weapon Attack: +17 to hit, reach 20 ft., one target. Hit: 19 (2d8 + 10) bludgeoning damage.",
            "Frightful Presence. Each creature of the dragon's choice that is within 120 feet of the dragon and aware of it must succeed on a DC 21 Wisdom saving throw or become frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the dragon's Frightful Presence for the next 24 hours.",
            "Fire Breath (Recharge 5-6). The dragon exhales fire in a 90-foot cone. Each creature in that area must make a DC 24 Dexterity saving throw, taking 91 (26d6) fire damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "The dragon can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The dragon regains spent legendary actions at the start of its turn.",
            "Detect. The dragon makes a Wisdom (Perception) check.",
            "Tail Attack. The dragon makes a tail attack.",
            "Wing Attack (Costs 2 Actions). The dragon beats its wings. Each creature within 15 feet of the dragon must succeed on a DC 25 Dexterity saving throw or take 17 (2d6 + 10) bludgeoning damage and be knocked prone. The dragon can then fly up to half its flying speed."
        ),
        description = null,
        tags = "climb speed, fly speed, damage immunity, blindsight, darkvision, legendary resistance, multiattack, cc - frightened, legendary action, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val ancientSilverDragon = registerDragonStatBlock(
    StatBlock(
        name = "Ancient Silver Dragon",
        size = "Gargantuan",
        type = "dragon (Metallic)",
        alignment = "lawful good",
        armorClass = "22 (natural armor)",
        hitPoints = "487 (25d20 + 225)",
        speed = "40 ft., fly 80 ft.",
        str = 30, strMod = "+10",
        dex = 10, dexMod = "+0",
        con = 29, conMod = "+9",
        int = 18, intMod = "+4",
        wis = 15, wisMod = "+2",
        cha = 23, chaMod = "+6",
        savingThrows = "Dex +7, Con +16, Wis +9, Cha +13",
        skills = "Arcana +11, History +11, Perception +16, Stealth +7",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "cold",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",
        senses = "blindsight 60 ft., darkvision 120 ft., passive Perception 26",
        languages = "Common, Draconic",
        challengeRating = "23",
        expValue = "50000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead."
        ),
        actions = listOf(
            "Multiattack. The dragon can use its Frightful Presence. It then makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +17 to hit, reach 15 ft., one target. Hit: 21 (2d10 + 10) piercing damage.",
            "Claw. Melee Weapon Attack: +17 to hit, reach 10 ft., one target. Hit: 17 (2d6 + 10) slashing damage.",
            "Tail. Melee Weapon Attack: +17 to hit, reach 20 ft., one target. Hit: 19 (2d8 + 10) bludgeoning damage.",
            "Frightful Presence. Each creature of the dragon's choice that is within 120 feet of the dragon and aware of it must succeed on a DC 21 Wisdom saving throw or become frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the dragon's Frightful Presence for the next 24 hours.",
            "Cold Breath (Recharge 5-6). The dragon exhales an icy blast in a 90-foot cone. Each creature in that area must make a DC 24 Constitution saving throw, taking 67 (15d8) cold damage on a failed save, or half as much damage on a successful one.",
            "Paralyzing Breath (Recharge 5-6). The dragon exhales paralyzing gas in a 90-foot cone. Each creature in that area must succeed on a DC 24 Constitution saving throw or be paralyzed for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "The dragon can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The dragon regains spent legendary actions at the start of its turn.",
            "Detect. The dragon makes a Wisdom (Perception) check.",
            "Tail Attack. The dragon makes a tail attack.",
            "Wing Attack (Costs 2 Actions). The dragon beats its wings. Each creature within 15 feet of the dragon must succeed on a DC 25 Dexterity saving throw or take 17 (2d6 + 10) bludgeoning damage and be knocked prone. The dragon can then fly up to half its flying Speed."
        ),
        description = null,
        tags = "fly speed, damage immunity, blindsight, darkvision, legendary resistance, multiattack, cc - frightened, legendary action, cc - paralyzed, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val ancientWhiteDragon = registerDragonStatBlock(
    StatBlock(
        name = "Ancient White Dragon",
        size = "Gargantuan",
        type = "dragon (Chromatic)",
        alignment = "chaotic evil",
        armorClass = "20 (natural armor)",
        hitPoints = "333 (18d20 + 144)",
        speed = "40 ft., burrow 40 ft., fly 80 ft., swim 40 ft.",
        str = 26, strMod = "+8",
        dex = 10, dexMod = "+0",
        con = 26, conMod = "+8",
        int = 10, intMod = "+0",
        wis = 13, wisMod = "+1",
        cha = 14, chaMod = "+2",
        savingThrows = "Dex +6, Con +14, Wis +7, Cha +8",
        skills = "Perception +13, Stealth +6",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "cold",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead.",
        senses = "blindsight 60 ft., darkvision 120 ft., passive Perception 23",
        languages = "Common, Draconic",
        challengeRating = "20",
        expValue = "25000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Ice Walk. The dragon can move across and climb icy surfaces without needing to make an ability check. Additionally, difficult terrain composed of ice or snow doesn't cost it extra movement.",
            "Legendary Resistance (3/Day). If the dragon fails a saving throw, it can choose to succeed instead."
        ),
        actions = listOf(
            "Multiattack. The dragon can use its Frightful Presence. It then makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +14 to hit, reach 15 ft., one target. Hit: 19 (2d10 + 8) piercing damage plus 9 (2d8) cold damage.",
            "Claw. Melee Weapon Attack: +14 to hit, reach 10 ft., one target. Hit: 15 (2d6 + 8) slashing damage.",
            "Tail. Melee Weapon Attack: +14 to hit, reach 20 ft., one target. Hit: 17 (2d8 + 8) bludgeoning damage.",
            "Frightful Presence. Each creature of the dragon's choice that is within 120 feet of the dragon and aware of it must succeed on a DC 16 Wisdom saving throw or become frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the dragon's Frightful Presence for the next 24 hours.",
            "Cold Breath (Recharge 5-6). The dragon exhales an icy blast in a 90-foot cone. Each creature in that area must make a DC 22 Constitution saving throw, taking 72 (16d8) cold damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "The dragon can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The dragon regains spent legendary actions at the start of its turn.",
            "Detect. The dragon makes a Wisdom (Perception) check.",
            "Tail Attack. The dragon makes a tail attack.",
            "Wing Attack (Costs 2 Actions). The dragon beats its wings. Each creature within 15 feet of the dragon must succeed on a DC 22 Dexterity saving throw or take 15 (2d6 + 8) bludgeoning damage and be knocked prone. The dragon can then fly up to half its flying Speed."
        ),
        description = null,
        tags = "burrow speed, fly speed, swim speed, damage immunity, blindsight, darkvision, legendary resistance, multiattack, cc - frightened, legendary action, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val blackDragonWyrmling = registerDragonStatBlock(
    StatBlock(
        name = "Black Dragon Wyrmling",
        size = "Medium",
        type = "dragon (Chromatic)",
        alignment = "chaotic evil",
        armorClass = "17 (natural armor)",
        hitPoints = "33 (6d8 + 6)",
        speed = "30 ft., fly 60 ft., swim 30 ft.",
        str = 15, strMod = "+2",
        dex = 14, dexMod = "+2",
        con = 13, conMod = "+1",
        int = 10, intMod = "+0",
        wis = 11, wisMod = "+0",
        cha = 13, chaMod = "+1",
        savingThrows = "Dex +4, Con +3, Wis +2, Cha +3",
        skills = "Perception +4, Stealth +4",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "acid",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 10 ft., darkvision 60 ft., passive Perception 14",
        languages = "Draconic",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The dragon can breathe air and water."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 7 (1d10 + 2) piercing damage plus 2 (1d4) acid damage.",
            "Acid Breath (Recharge 5–6). The dragon exhales acid in a 15-foot line that is 5 feet wide. Each creature in that line must make a DC 11 Dexterity saving throw, taking 22 (5d8) acid damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, swim speed, damage immunity, blindsight, darkvision, amphibious, water breathing",
        source = "Monster Manual (SRD)"
    )
)

val blueDragonWyrmling = registerDragonStatBlock(
    StatBlock(
        name = "Blue Dragon Wyrmling",
        size = "Medium",
        type = "dragon (Chromatic)",
        alignment = "lawful evil",
        armorClass = "17 (natural armor)",
        hitPoints = "52 (8d8 + 16)",
        speed = "30 ft., burrow 15 ft., fly 60 ft.",
        str = 17, strMod = "+3",
        dex = 10, dexMod = "+0",
        con = 15, conMod = "+2",
        int = 12, intMod = "+1",
        wis = 11, wisMod = "+0",
        cha = 15, chaMod = "+2",
        savingThrows = "Dex +2, Con +4, Wis +2, Cha +4",
        skills = "Perception +4, Stealth +2",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "lightning",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 10 ft., darkvision 60 ft., passive Perception 14",
        languages = "Draconic",
        challengeRating = "3",
        expValue = "700 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Bite. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 8 (1d10 + 3) piercing damage plus 3 (1d6) lightning damage.",
            "Lightning Breath (Recharge 5-6). The dragon exhales lightning in a 30-foot line that is 5 feet wide. Each creature in that line must make a DC 12 Dexterity saving throw, taking 22 (4d10) lightning damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "burrow speed, fly speed, damage immunity, blindsight, darkvision",
        source = "Monster Manual (SRD)"
    )
)

val brassDragonWyrmling = registerDragonStatBlock(
    StatBlock(
        name = "Brass Dragon Wyrmling",
        size = "Medium",
        type = "dragon (Metallic)",
        alignment = "chaotic good",
        armorClass = "16 (natural armor)",
        hitPoints = "16 (3d8 + 3)",
        speed = "30 ft., burrow 15 ft., fly 60 ft.",
        str = 15, strMod = "+2",
        dex = 10, dexMod = "+0",
        con = 13, conMod = "+1",
        int = 10, intMod = "+0",
        wis = 11, wisMod = "+0",
        cha = 13, chaMod = "+1",
        savingThrows = "Dex +2, Con +3, Wis +2, Cha +3",
        skills = "Perception +4, Stealth +2",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "fire",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 10 ft., darkvision 60 ft., passive Perception 14",
        languages = "Draconic",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 7 (1d10 + 2) piercing damage.",
            "Breath Weapons (Recharge 5-6). The dragon uses one of the following breath weapons.",
            "Fire Breath. The dragon exhales fire in an 20-foot line that is 5 feet wide. Each creature in that line must make a DC 11 Dexterity saving throw, taking 14 (4d6) fire damage on a failed save, or half as much damage on a successful one.",
            "Sleep Breath. The dragon exhales sleep gas in a 15-foot cone. Each creature in that area must succeed on a DC 11 Constitution saving throw or fall unconscious for 1 minute. This effect ends for a creature if the creature takes damage or someone uses an action to wake it."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "burrow speed, fly speed, damage immunity, blindsight, darkvision, cc - unconscious",
        source = "Monster Manual (SRD)"
    )
)

val bronzeDragonWyrmling = registerDragonStatBlock(
    StatBlock(
        name = "Bronze Dragon Wyrmling",
        size = "Medium",
        type = "dragon (Metallic)",
        alignment = "lawful good",
        armorClass = "17 (natural armor)",
        hitPoints = "32 (5d8 + 10)",
        speed = "30 ft., fly 60 ft., swim 30 ft.",
        str = 17, strMod = "+3",
        dex = 10, dexMod = "+0",
        con = 15, conMod = "+2",
        int = 12, intMod = "+1",
        wis = 11, wisMod = "+0",
        cha = 15, chaMod = "+2",
        savingThrows = "Dex +2, Con +4, Wis +2, Cha +4",
        skills = "Perception +4, Stealth +2",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "lightning",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 10 ft., darkvision 60 ft., passive Perception 14",
        languages = "Draconic",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The dragon can breathe air and water."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 8 (1d10 + 3) piercing damage.",
            "Breath Weapons (Recharge 5-6). The dragon uses one of the following breath weapons.",
            "Lightning Breath. The dragon exhales lightning in a 40-foot line that is 5 feet wide. Each creature in that line must make a DC 12 Dexterity saving throw, taking 16 (3d10) lightning damage on a failed save, or half as much damage on a successful one.",
            "Repulsion Breath. The dragon exhales repulsion energy in a 30-foot cone. Each creature in that area must succeed on a DC 12 Strength saving throw. On a failed save, the creature is pushed 30 feet away from the dragon."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, swim speed, damage immunity, blindsight, darkvision, amphibious, water breathing",
        source = "Monster Manual (SRD)"
    )
)

val copperDragonWyrmling = registerDragonStatBlock(
    StatBlock(
        name = "Copper Dragon Wyrmling",
        size = "Medium",
        type = "dragon (Metallic)",
        alignment = "chaotic good",
        armorClass = "16 (natural armor)",
        hitPoints = "22 (4d8 + 4)",
        speed = "30 ft., climb 30 ft., fly 60 ft.",
        str = 15, strMod = "+2",
        dex = 12, dexMod = "+1",
        con = 13, conMod = "+1",
        int = 14, intMod = "+2",
        wis = 11, wisMod = "+0",
        cha = 13, chaMod = "+1",
        savingThrows = "Dex +3, Con +3, Wis +2, Cha +3",
        skills = "Perception +4, Stealth +3",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "acid",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 10 ft., darkvision 60 ft., passive Perception 14",
        languages = "Draconic",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 7 (1d10 + 2) piercing damage.",
            "Breath Weapons (Recharge 5-6). The dragon uses one of the following breath weapons.",
            "Acid Breath. The dragon exhales acid in a 20-foot line that is 5 feet wide. Each creature in that line must make a DC 11 Dexterity saving throw, taking 18 (4d8) acid damage on a failed save, or half as much damage on a successful one.",
            "Slowing Breath. The dragon exhales gas in a 15-foot cone. Each creature in that area must succeed on a DC 11 Constitution saving throw. On a failed save, the creature can't use reactions, its speed is halved, and it can't make more than one attack on its turn. In addition, the creature can use either an action or a bonus action on its turn, but not both. These effects last for 1 minute. The creature can repeat the saving throw at the end of each of its turns, ending the effect on itself with a successful save."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "climb speed, fly speed, damage immunity, blindsight, darkvision",
        source = "Monster Manual (SRD)"
    )
)

val dragonTurtle = registerDragonStatBlock(
    StatBlock(
        name = "Dragon Turtle",
        size = "Gargantuan",
        type = "dragon",
        alignment = "neutral",
        armorClass = "20 (natural armor)",
        hitPoints = "341 (22d20 + 110)",
        speed = "20 ft., swim 40 ft.",
        str = 25, strMod = "+7",
        dex = 10, dexMod = "+0",
        con = 20, conMod = "+5",
        int = 10, intMod = "+0",
        wis = 12, wisMod = "+1",
        cha = 12, chaMod = "+1",
        savingThrows = "Dex +6, Con +11, Wis +7",
        skills = null,
        vulnerabilities = null,
        damageResistances = "fire",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 11",
        languages = "Aquan, Draconic",
        challengeRating = "17",
        expValue = "18000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The dragon turtle can breathe air and water."
        ),
        actions = listOf(
            "Multiattack. The dragon turtle makes three attacks: one with its bite and two with its claws. It can make one tail attack in place of its two claw attacks.",
            "Bite. Melee Weapon Attack: +13 to hit, reach 15 ft., one target. Hit: 26 (3d12 + 7) piercing damage.",
            "Claw. Melee Weapon Attack: +13 to hit, reach 10 ft., one target. Hit: 16 (2d8 + 7) slashing damage.",
            "Tail. Melee Weapon Attack: +13 to hit, reach 15 ft., one target. Hit: 26 (3d12 + 7) bludgeoning damage. If the target is a creature, it must succeed on a DC 20 Strength saving throw or be pushed up to 10 feet away from the dragon turtle and knocked prone.",
            "Steam Breath (Recharge 5-6). The dragon turtle exhales scalding steam in a 60-foot cone. Each creature in that area must make a DC 18 Constitution saving throw, taking 52 (15d6) fire damage on a failed save, or half as much damage on a successful one. Being underwater doesn't grant resistance against this damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "swim speed, damage resistance, darkvision, amphibious, water breathing, multiattack, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val goldDragonWyrmling = registerDragonStatBlock(
    StatBlock(
        name = "Gold Dragon Wyrmling",
        size = "Medium",
        type = "dragon (Metallic)",
        alignment = "lawful good",
        armorClass = "17 (natural armor)",
        hitPoints = "60 (8d8 + 24)",
        speed = "30 ft., fly 60 ft., swim 30 ft.",
        str = 19, strMod = "+4",
        dex = 14, dexMod = "+2",
        con = 17, conMod = "+3",
        int = 14, intMod = "+2",
        wis = 11, wisMod = "+0",
        cha = 16, chaMod = "+3",
        savingThrows = "Dex +4, Con +5, Wis +2, Cha +5",
        skills = "Perception +4, Stealth +4",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "fire",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 10 ft., darkvision 60 ft., passive Perception 14",
        languages = "Draconic",
        challengeRating = "3",
        expValue = "700 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The dragon can breathe air and water."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 9 (1d10 + 4) piercing damage.",
            "Breath Weapons (Recharge 5-6). The dragon uses one of the following breath weapons.",
            "Fire Breath. The dragon exhales fire in a 15-foot cone. Each creature in that area must make a DC 13 Dexterity saving throw, taking 22 (4d10) fire damage on a failed save, or half as much damage on a successful one.",
            "Weakening Breath. The dragon exhales gas in a 15-foot cone. Each creature in that area must succeed on a DC 13 Strength saving throw or have disadvantage on Strength-based attack rolls, Strength checks, and Strength saving throws for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, swim speed, damage immunity, blindsight, darkvision, amphibious, water breathing",
        source = "Monster Manual (SRD)"
    )
)

val greenDragonWyrmling = registerDragonStatBlock(
    StatBlock(
        name = "Green Dragon Wyrmling",
        size = "Medium",
        type = "dragon (Chromatic)",
        alignment = "lawful evil",
        armorClass = "17 (natural armor)",
        hitPoints = "38 (7d8 + 7)",
        speed = "30 ft., fly 60 ft., swim 30 ft.",
        str = 15, strMod = "+2",
        dex = 12, dexMod = "+1",
        con = 13, conMod = "+1",
        int = 14, intMod = "+2",
        wis = 11, wisMod = "+0",
        cha = 13, chaMod = "+1",
        savingThrows = "Dex +3, Con +3, Wis +2, Cha +3",
        skills = "Perception +4, Stealth +3",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "blindsight 10 ft., darkvision 60 ft., passive Perception 14",
        languages = "Draconic",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The dragon can breathe air and water."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 7 (1d10 + 2) piercing damage plus 3 (1d6) poison damage.",
            "Poison Breath (Recharge 5-6). The dragon exhales poisonous gas in a 15-foot cone. Each creature in that area must make a DC 11 Constitution saving throw, taking 21 (6d6) poison damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, swim speed, damage immunity, condition immunity, blindsight, darkvision, amphibious, water breathing",
        source = "Monster Manual (SRD)"
    )
)

val pseudodragon = registerDragonStatBlock(
    StatBlock(
        name = "Pseudodragon",
        size = "Tiny",
        type = "dragon",
        alignment = "neutral good",
        armorClass = "13 (natural armor)",
        hitPoints = "7 (2d4 + 2)",
        speed = "15 ft., fly 60 ft.",
        str = 6, strMod = "-2",
        dex = 15, dexMod = "+2",
        con = 13, conMod = "+1",
        int = 10, intMod = "+0",
        wis = 12, wisMod = "+1",
        cha = 10, chaMod = "+0",
        savingThrows = null,
        skills = "Perception +3, Stealth +4",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 10 ft., darkvision 60 ft., passive Perception 13",
        languages = "understands Common and Draconic but can't speak",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Senses. The pseudodragon has advantage on Wisdom (Perception) checks that rely on sight, hearing, or smell.",
            "Magic Resistance. The pseudodragon has advantage on saving throws against spells and other magical effects.",
            "Limited Telepathy. The pseudodragon can magically communicate simple ideas, emotions, and images telepathically with any creature within 100 feet of it that can understand a language."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 4 (1d4 + 2) piercing damage.",
            "Sting. Melee Weapon Attack: +4 to hit, reach 5 ft., one creature. Hit: 4 (1d4 + 2) piercing damage, and the target must succeed on a DC 11 Constitution saving throw or become poisoned for 1 hour. If the saving throw fails by 5 or more, the target falls unconscious for the same duration, or until it takes damage or another creature uses an action to shake it awake."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, blindsight, darkvision, keen sight, keen hearing, keen smell, magic resistance, telepathic, cc - poisoned, cc- unconscious",
        source = "Monster Manual (SRD)"
    )
)

val redDragonWyrmling = registerDragonStatBlock(
    StatBlock(
        name = "Red Dragon Wyrmling",
        size = "Medium",
        type = "dragon (Chromatic)",
        alignment = "chaotic evil",
        armorClass = "17 (natural armor)",
        hitPoints = "75 (10d8 + 30)",
        speed = "30 ft., climb 30 ft., fly 60 ft.",
        str = 19, strMod = "+4",
        dex = 10, dexMod = "+0",
        con = 17, conMod = "+3",
        int = 12, intMod = "+1",
        wis = 11, wisMod = "+0",
        cha = 15, chaMod = "+2",
        savingThrows = "Dex +2, Con +5, Wis +2, Cha +4",
        skills = "Perception +4, Stealth +2",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "fire",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 10 ft., darkvision 60 ft., passive Perception 14",
        languages = "Draconic",
        challengeRating = "4",
        expValue = "1,100 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Bite. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 9 (1d10 + 4) piercing damage plus 3 (1d6) fire damage.",
            "Fire Breath (Recharge 5-6). The dragon exhales fire in a 15-foot cone. Each creature in that area must make a DC 13 Dexterity saving throw, taking 24 (7d6) fire damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "climb speed, fly speed, damage immunity, blindsight, darkvision",
        source = "Monster Manual (SRD)"
    )
)

val silverDragonWyrmling = registerDragonStatBlock(
    StatBlock(
        name = "Silver Dragon Wyrmling",
        size = "Medium",
        type = "dragon (Metallic)",
        alignment = "lawful good",
        armorClass = "17 (natural armor)",
        hitPoints = "45 (6d8 + 18)",
        speed = "30 ft., fly 60 ft.",
        str = 19, strMod = "+4",
        dex = 10, dexMod = "+0",
        con = 17, conMod = "+3",
        int = 12, intMod = "+1",
        wis = 11, wisMod = "+0",
        cha = 15, chaMod = "+2",
        savingThrows = "Dex +2, Con +5, Wis +2, Cha +4",
        skills = "Perception +4, Stealth +2",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "cold",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 10 ft., darkvision 60 ft., passive Perception 14",
        languages = "Draconic",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Bite. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 9 (1d10 + 4) piercing damage.",
            "Breath Weapons (Recharge 5-6). The dragon uses one of the following breath weapons.",
            "Cold Breath. The dragon exhales an icy blast in a 15-foot cone. Each creature in that area must make a DC 13 Constitution saving throw, taking 18 (4d8) cold damage on a failed save, or half as much damage on a successful one.",
            "Paralyzing Breath. The dragon exhales paralyzing gas in a 15-foot cone. Each creature in that area must succeed on a DC 13 Constitution saving throw or be paralyzed for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, blindsight, darkvision, cc - paralyzed",
        source = "Monster Manual (SRD)"
    )
)

val whiteDragonWyrmling = registerDragonStatBlock(
    StatBlock(
        name = "White Dragon Wyrmling",
        size = "Medium",
        type = "dragon (Chromatic)",
        alignment = "chaotic evil",
        armorClass = "16 (natural armor)",
        hitPoints = "32 (5d8 + 10)",
        speed = "30 ft., burrow 15 ft., fly 60 ft., swim 30 ft.",
        str = 14, strMod = "+2",
        dex = 10, dexMod = "+0",
        con = 14, conMod = "+2",
        int = 5, intMod = "-3",
        wis = 10, wisMod = "+0",
        cha = 11, chaMod = "+0",
        savingThrows = "Dex +2, Con +4, Wis +2, Cha +2",
        skills = "Perception +4, Stealth +2",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "cold",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 10 ft., darkvision 60 ft., passive Perception 14",
        languages = "Draconic",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 7 (1d10 + 2) piercing damage plus 2 (1d4) cold damage.",
            "Cold Breath (Recharge 5-6). The dragon exhales an icy blast of hail in a 15-foot cone. Each creature in that area must make a DC 12 Constitution saving throw, taking 22 (5d8) cold damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "burrow speed, fly speed, swim speed, damage immunity, blindsight, darkvision",
        source = "Monster Manual (SRD)"
    )
)

val wyvern = registerDragonStatBlock(
    StatBlock(
        name = "Wyvern",
        size = "Large",
        type = "dragon",
        alignment = "unaligned",
        armorClass = "13 (natural armor)",
        hitPoints = "110 (13d10 + 39)",
        speed = "20 ft., fly 80 ft.",
        str = 19, strMod = "+4",
        dex = 10, dexMod = "+0",
        con = 16, conMod = "+3",
        int = 5, intMod = "-3",
        wis = 12, wisMod = "+1",
        cha = 6, chaMod = "-2",
        savingThrows = null,
        skills = "Perception +4",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 14",
        languages = "—",
        challengeRating = "6",
        expValue = "2300 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Cousins to the great dragons, wyverns have two scaly legs, leathery wings, and a sinewy tail topped with a poison stinger that can kill a creature in seconds."
        ),
        actions = listOf(
            "Multiattack. The wyvern makes two attacks: one with its bite and one with its stinger. While flying, it can use its claws in place of one other attack.",
            "Bite. Melee Weapon Attack: +7 to hit, reach 10 ft., one creature. Hit: 11 (2d6 + 4) piercing damage.",
            "Claws. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 13 (2d8 + 4) slashing damage.",
            "Stinger. Melee Weapon Attack: +7 to hit, reach 10 ft., one creature. Hit: 11 (2d6 + 4) piercing damage. The target must make a DC 15 Constitution saving throw, taking 24 (7d6) poison damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Cousins to the great dragons, wyverns have two scaly legs, leathery wings, and a sinewy tail topped with a poison stinger that can kill a creature in seconds.",
        tags = "fly speed, darkvision, cc - poisoned",
        source = "Monster Manual (SRD)"
    )
)

val youngBlackDragon = registerDragonStatBlock(
    StatBlock(
        name = "Young Black Dragon",
        size = "Large",
        type = "dragon (Chromatic)",
        alignment = "chaotic evil",
        armorClass = "18 (natural armor)",
        hitPoints = "127 (15d10 + 45)",
        speed = "40 ft., fly 80 ft., swim 40 ft.",
        str = 19, strMod = "+4",
        dex = 14, dexMod = "+2",
        con = 17, conMod = "+3",
        int = 12, intMod = "+1",
        wis = 11, wisMod = "+0",
        cha = 15, chaMod = "+2",
        savingThrows = "Dex +5, Con +6, Wis +3, Cha +5",
        skills = "Perception +6, Stealth +5",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "acid",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 30 ft., darkvision 120 ft., passive Perception 16",
        languages = "Common, Draconic",
        challengeRating = "7",
        expValue = "2900 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The dragon can breathe air and water."
        ),
        actions = listOf(
            "Multiattack. The dragon makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +7 to hit, reach 10 ft., one target. Hit: 15 (2d10 + 4) piercing damage plus 4 (1d8) acid damage.",
            "Claw. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 11 (2d6 + 4) slashing damage.",
            "Acid Breath (Recharge 5-6). The dragon exhales acid in a 30-foot line that is 5 feet wide. Each creature in that line must make a DC 14 Dexterity saving throw, taking 49 (11d8) acid damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, swim speed, damage immunity, blindsight, darkvision, amphibious, water breathing, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val youngBlueDragon = registerDragonStatBlock(
    StatBlock(
        name = "Young Blue Dragon",
        size = "Large",
        type = "dragon (Chromatic)",
        alignment = "lawful evil",
        armorClass = "18 (natural armor)",
        hitPoints = "152 (16d10 + 64)",
        speed = "40 ft., burrow 20 ft., fly 80 ft.",
        str = 21, strMod = "+5",
        dex = 10, dexMod = "+0",
        con = 19, conMod = "+4",
        int = 14, intMod = "+2",
        wis = 13, wisMod = "+1",
        cha = 17, chaMod = "+3",
        savingThrows = "Dex +4, Con +8, Wis +5, Cha +7",
        skills = "Perception +9, Stealth +4",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "lightning",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 30 ft., darkvision 120 ft., passive Perception 19",
        languages = "Common, Draconic",
        challengeRating = "9",
        expValue = "5000 XP",
        proficiencyBonus = null,
        traits = emptyList(),
        actions = listOf(
            "Multiattack. The dragon makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +9 to hit, reach 10 ft., one target. Hit: 16 (2d10 + 5) piercing damage plus 5 (1d10) lightning damage.",
            "Claw. Melee Weapon Attack: +9 to hit, reach 5 ft., one target. Hit: 12 (2d6 + 5) slashing damage.",
            "Lightning Breath (Recharge 5-6). The dragon exhales lightning in an 60-foot line that is 5 feet wide. Each creature in that line must make a DC 16 Dexterity saving throw, taking 55 (10d10) lightning damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "burrow speed, fly speed, damage immunity, blindsight, darkvision, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val youngBrassDragon = registerDragonStatBlock(
    StatBlock(
        name = "Young Brass Dragon",
        size = "Large",
        type = "dragon (Metallic)",
        alignment = "chaotic good",
        armorClass = "17 (natural armor)",
        hitPoints = "110 (13d10 + 39)",
        speed = "40 ft., burrow 20 ft., fly 80 ft.",
        str = 19, strMod = "+4",
        dex = 10, dexMod = "+0",
        con = 17, conMod = "+3",
        int = 12, intMod = "+1",
        wis = 11, wisMod = "+0",
        cha = 15, chaMod = "+2",
        savingThrows = "Dex +3, Con +6, Wis +3, Cha +5",
        skills = "Perception +6, Persuasion +5, Stealth +3",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "fire",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 30 ft., darkvision 120 ft., passive Perception 16",
        languages = "Common, Draconic",
        challengeRating = "6",
        expValue = "2300 XP",
        proficiencyBonus = null,
        traits = emptyList(),
        actions = listOf(
            "Multiattack. The dragon makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +7 to hit, reach 10 ft., one target. Hit: 15 (2d10 + 4) piercing damage.",
            "Claw. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 11 (2d6 + 4) slashing damage.",
            "Breath Weapons (Recharge 5-6). The dragon uses one of the following breath weapons.",
            "Fire Breath. The dragon exhales fire in a 40-foot line that is 5 feet wide. Each creature in that line must make a DC 14 Dexterity saving throw, taking 42 (12d6) fire damage on a failed save, or half as much damage on a successful one.",
            "Sleep Breath. The dragon exhales sleep gas in a 30-foot cone. Each creature in that area must succeed on a DC 14 Constitution saving throw or fall unconscious for 5 minutes. This effect ends for a creature if the creature takes damage or someone uses an action to wake it."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "burrow speed, fly speed, damage immunity, blindsight, darkvision, multiattack, cc - unconscious",
        source = "Monster Manual (SRD)"
    )
)

val youngBronzeDragon = registerDragonStatBlock(
    StatBlock(
        name = "Young Bronze Dragon",
        size = "Large",
        type = "dragon (Metallic)",
        alignment = "lawful good",
        armorClass = "18 (natural armor)",
        hitPoints = "142 (15d10 + 60)",
        speed = "40 ft., fly 80 ft., swim 40 ft.",
        str = 21, strMod = "+5",
        dex = 10, dexMod = "+0",
        con = 19, conMod = "+4",
        int = 14, intMod = "+2",
        wis = 13, wisMod = "+1",
        cha = 17, chaMod = "+3",
        savingThrows = "Dex +3, Con +7, Wis +4, Cha +6",
        skills = "Insight +4, Perception +7, Stealth +3",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "lightning",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 30 ft., darkvision 120 ft., passive Perception 17",
        languages = "Common, Draconic",
        challengeRating = "8",
        expValue = "3900 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The dragon can breathe air and water."
        ),
        actions = listOf(
            "Multiattack. The dragon makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +8 to hit, reach 10 ft., one target. Hit: 16 (2d10 + 5) piercing damage.",
            "Claw. Melee Weapon Attack: +8 to hit, reach 5 ft., one target. Hit: 12 (2d6 + 5) slashing damage.",
            "Breath Weapons (Recharge 5-6). The dragon uses one of the following breath weapons.",
            "Lightning Breath. The dragon exhales lightning in a 60-foot line that is 5 feet wide. Each creature in that line must make a DC 15 Dexterity saving throw, taking 55 (10d10) lightning damage on a failed save, or half as much damage on a successful one.",
            "Repulsion Breath. The dragon exhales repulsion energy in a 30-foot cone. Each creature in that area must succeed on a DC 15 Strength saving throw. On a failed save, the creature is pushed 40 feet away from the dragon."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, swim speed, damage immunity, blindsight, darkvision, amphibious, water breathing, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val youngCopperDragon = registerDragonStatBlock(
    StatBlock(
        name = "Young Copper Dragon",
        size = "Large",
        type = "dragon (Metallic)",
        alignment = "chaotic good",
        armorClass = "17 (natural armor)",
        hitPoints = "119 (14d10 + 42)",
        speed = "40 ft., climb 40 ft., fly 80 ft.",
        str = 19, strMod = "+4",
        dex = 12, dexMod = "+1",
        con = 17, conMod = "+3",
        int = 16, intMod = "+3",
        wis = 13, wisMod = "+1",
        cha = 15, chaMod = "+2",
        savingThrows = "Dex +4, Con +6, Wis +4, Cha +5",
        skills = "Deception +5, Perception +7, Stealth +4",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "acid",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 30 ft., darkvision 120 ft., passive Perception 17",
        languages = "Common, Draconic",
        challengeRating = "7",
        expValue = "2900 XP",
        proficiencyBonus = null,
        traits = emptyList(),
        actions = listOf(
            "Multiattack. The dragon makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +7 to hit, reach 10 ft., one target. Hit: 15 (2d10 + 4) piercing damage.",
            "Claw. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 11 (2d6 + 4) slashing damage.",
            "Breath Weapons (Recharge 5-6). The dragon uses one of the following breath weapons.",
            "Acid Breath. The dragon exhales acid in a 40-foot line that is 5 feet wide. Each creature in that line must make a DC 14 Dexterity saving throw, taking 40 (9d8) acid damage on a failed save, or half as much damage on a successful one.",
            "Slowing Breath. The dragon exhales gas in a 30-foot cone. Each creature in that area must succeed on a DC 14 Constitution saving throw. On a failed save, the creature can't use reactions, its speed is halved, and it can't make more than one attack on its turn. In addition, the creature can use either an action or a bonus action on its turn, but not both. These effects last for 1 minute. The creature can repeat the saving throw at the end of each of its turns, ending the effect on itself with a successful save."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "climb speed, fly speed, damage immunity, blindsight, darkvision, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val youngGoldDragon = registerDragonStatBlock(
    StatBlock(
        name = "Young Gold Dragon",
        size = "Large",
        type = "dragon (Metallic)",
        alignment = "lawful good",
        armorClass = "18 (natural armor)",
        hitPoints = "178 (17d10 + 85)",
        speed = "40 ft., fly 80 ft., swim 40 ft.",
        str = 23, strMod = "+6",
        dex = 14, dexMod = "+2",
        con = 21, conMod = "+5",
        int = 16, intMod = "+3",
        wis = 13, wisMod = "+1",
        cha = 20, chaMod = "+5",
        savingThrows = "Dex +6, Con +9, Wis +5, Cha +9",
        skills = "Insight +5, Perception +9, Persuasion +9, Stealth +6",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "fire",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 30 ft., darkvision 120 ft., passive Perception 19",
        languages = "Common, Draconic",
        challengeRating = "10",
        expValue = "5,900 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The dragon can breathe air and water."
        ),
        actions = listOf(
            "Multiattack. The dragon makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +10 to hit, reach 10 ft., one target. Hit: 17 (2d10 + 6) piercing damage.",
            "Claw. Melee Weapon Attack: +10 to hit, reach 5 ft., one target. Hit: 13 (2d6 + 6) slashing damage.",
            "Breath Weapons (Recharge 5-6). The dragon uses one of the following breath weapons.",
            "Fire Breath. The dragon exhales fire in a 30-foot cone. Each creature in that area must make a DC 17 Dexterity saving throw, taking 55 (10d10) fire damage on a failed save, or half as much damage on a successful one.",
            "Weakening Breath. The dragon exhales gas in a 30-foot cone. Each creature in that area must succeed on a DC 17 Strength saving throw or have disadvantage on Strength-based attack rolls, Strength checks, and Strength saving throws for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, swim speed, damage immunity, blindsight, darkvision, amphibious, water breathing, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val youngGreenDragon = registerDragonStatBlock(
    StatBlock(
        name = "Young Green Dragon",
        size = "Large",
        type = "dragon (Chromatic)",
        alignment = "lawful evil",
        armorClass = "18 (natural armor)",
        hitPoints = "136 (16d10 + 48)",
        speed = "40 ft., fly 80 ft., swim 40 ft.",
        str = 19, strMod = "+4",
        dex = 12, dexMod = "+1",
        con = 17, conMod = "+3",
        int = 16, intMod = "+3",
        wis = 13, wisMod = "+1",
        cha = 15, chaMod = "+2",
        savingThrows = "Dex +4, Con +6, Wis +4, Cha +5",
        skills = "Deception +5, Perception +7, Stealth +4",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "blindsight 30 ft., darkvision 120 ft., passive Perception 17",
        languages = "Common, Draconic",
        challengeRating = "8",
        expValue = "3,900 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The dragon can breathe air and water."
        ),
        actions = listOf(
            "Multiattack. The dragon makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +7 to hit, reach 10 ft., one target. Hit: 15 (2d10 + 4) piercing damage plus 7 (2d6) poison damage.",
            "Claw. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 11 (2d6 + 4) slashing damage.",
            "Poison Breath (Recharge 5-6). The dragon exhales poisonous gas in a 30-foot cone. Each creature in that area must make a DC 14 Constitution saving throw, taking 42 (12d6) poison damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "The most cunning and treacherous of true dragons, green dragons use misdirection and trickery to get the upper hand against their enemies. A green dragon is recognized by the crest that begins near its eyes and continues down its spine, reaching full height just behind the skull.",
        tags = "fly speed, swim speed, damage immunity, condition immunity, blindsight, darkvision, amphibious, water breathing, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val youngRedDragon = registerDragonStatBlock(
    StatBlock(
        name = "Young Red Dragon",
        size = "Large",
        type = "dragon (Chromatic)",
        alignment = "chaotic evil",
        armorClass = "18 (natural armor)",
        hitPoints = "178 (17d10 + 85)",
        speed = "40 ft., climb 40 ft., fly 80 ft.",
        str = 23, strMod = "+6",
        dex = 10, dexMod = "+0",
        con = 21, conMod = "+5",
        int = 14, intMod = "+2",
        wis = 11, wisMod = "+0",
        cha = 19, chaMod = "+4",
        savingThrows = "Dex +4, Con +9, Wis +4, Cha +8",
        skills = "Perception +8, Stealth +4",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "fire",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 30 ft., darkvision 120 ft., passive Perception 18",
        languages = "Common, Draconic",
        challengeRating = "10",
        expValue = "5,900 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Multiattack. The dragon makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +10 to hit, reach 10 ft., one target. Hit: 17 (2d10 + 6) piercing damage plus 3 (1d6) fire damage.",
            "Claw. Melee Weapon Attack: +10 to hit, reach 5 ft., one target. Hit: 13 (2d6 + 6) slashing damage.",
            "Fire Breath (Recharge 5-6). The dragon exhales fire in a 30-foot cone. Each creature in that area must make a DC 17 Dexterity saving throw, taking 56 (16d6) fire damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "climb speed, fly speed, damage immunity, blindisght, darkvision, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val youngSilverDragon = registerDragonStatBlock(
    StatBlock(
        name = "Young Silver Dragon",
        size = "Large",
        type = "dragon",
        alignment = "lawful good",
        armorClass = "18 (natural armor)",
        hitPoints = "168 (16d10 + 80)",
        speed = "40 ft., fly 80 ft.",
        str = 23, strMod = "+6",
        dex = 10, dexMod = "+0",
        con = 21, conMod = "+5",
        int = 14, intMod = "+2",
        wis = 11, wisMod = "+0",
        cha = 19, chaMod = "+4",
        savingThrows = "Dex +4, Con +9, Wis +4, Cha +8",
        skills = "Arcana +6, History +6, Perception +8, Stealth +4",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "cold",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 30 ft., darkvision 120 ft., passive Perception 18",
        languages = "Common, Draconic",
        challengeRating = "9",
        expValue = "5,000 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Multiattack. The dragon makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +10 to hit, reach 10 ft., one target. Hit: 17 (2d10 + 6) piercing damage.",
            "Claw. Melee Weapon Attack: +10 to hit, reach 5 ft., one target. Hit: 13 (2d6 + 6) slashing damage.",
            "Breath Weapons (Recharge 5-6). The dragon uses one of the following breath weapons.",
            "Cold Breath. The dragon exhales an icy blast in a 30-foot cone. Each creature in that area must make a DC 17 Constitution saving throw, taking 54 (12d8) cold damage on a failed save, or half as much damage on a successful one.",
            "Paralyzing Breath. The dragon exhales paralyzing gas in a 30-foot cone. Each creature in that area must succeed on a DC 17 Constitution saving throw or be paralyzed for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, damage immunity, blindsight, darkvision, multiattack, cc - paralyzed",
        source = "Monster Manual (SRD)"
    )
)

val youngWhiteDragon = registerDragonStatBlock(
    StatBlock(
        name = "Young White Dragon",
        size = "Large",
        type = "dragon",
        alignment = "chaotic evil",
        armorClass = "17 (natural armor)",
        hitPoints = "133 (14d10 + 56)",
        speed = "40 ft., burrow 20 ft., fly 80 ft., swim 40 ft.",
        str = 18, strMod = "+4",
        dex = 10, dexMod = "+0",
        con = 18, conMod = "+4",
        int = 6, intMod = "-2",
        wis = 11, wisMod = "+0",
        cha = 12, chaMod = "+1",
        savingThrows = "Dex +3, Con +7, Wis +3, Cha +4",
        skills = "Perception +6, Stealth +3",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "cold",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 30 ft., darkvision 120 ft., passive Perception 16",
        languages = "Common, Draconic",
        challengeRating = "6",
        expValue = "2,300 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Ice Walk. The dragon can move across and climb icy surfaces without needing to make an ability check. Additionally, difficult terrain composed of ice or snow doesn't cost it extra moment."
        ),
        actions = listOf(
            "Multiattack. The dragon makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +7 to hit, reach 10 ft., one target. Hit: 15 (2d10 + 4) piercing damage plus 4 (1d8) cold damage.",
            "Claw. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 11 (2d6 + 4) slashing damage.",
            "Cold Breath (Recharge 5-6). The dragon exhales an icy blast in a 30-foot cone. Each creature in that area must make a DC 15 Constitution saving throw, taking 45 (10d8) cold damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "burrow speed, fly speed, swim speed, damage immunity, blindsight, darkvision, multiattack",
        source = "Monster Manual (SRD)"
    )
)


//Spell effects and summons
