package com.example.wildshapesmountsandfamiliars.ui.screens.creatureType

import androidx.compose.runtime.Composable
import com.example.wildshapesmountsandfamiliars.ui.screens.CreatureTypeScreen
import com.example.wildshapesmountsandfamiliars.ui.screens.ElementalStatBlockSpellEffectOrSummon
import com.example.wildshapesmountsandfamiliars.ui.screens.ElementalStatBlocks
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.registerElementalStatBlock



@Composable
fun Elementals(
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
        title = "Elementals",
        statBlocks = ElementalStatBlocks,
        spellEffectOrSummons = ElementalStatBlockSpellEffectOrSummon,
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

val airElemental = registerElementalStatBlock(
    StatBlock(
        name = "Air Elemental",
        size = "Large",
        type = "elemental",
        alignment = "neutral",
        armorClass = "15",
        hitPoints = "90 (12d10 + 24)",
        speed = "0 ft., fly 90 ft. (hover)",
        str = 14, strMod = "+2",
        dex = 20, dexMod = "+5",
        con = 14, conMod = "+2",
        int = 6, intMod = "-2",
        wis = 10, wisMod = "+0",
        cha = 6, chaMod = "-2",
        savingThrows = null,
        skills = null,
        vulnerabilities = null,
        damageResistances = "lightning, thunder; bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "exhaustion, grappled, paralyzed, petrified, poisoned, prone, restrained, unconscious",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "Auran",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Air Form. The elemental can enter a hostile creature's space and stop there. It can move through a space as narrow as 1 inch wide without squeezing."
        ),
        actions = listOf(
            "Multiattack. The elemental makes two slam attacks.",
            "Slam. Melee Weapon Attack: +8 to hit, reach 5 ft., one target. Hit: 14 (2d8 + 5) bludgeoning damage.",
            "Whirlwind (Recharge 4–6). Each creature in the elemental's space must make a DC 13 Strength saving throw. On a failure, a target takes 15 (3d8 + 2) bludgeoning damage and is flung up 20 feet away from the elemental in a random direction and knocked prone. If a thrown target strikes an object, such as a wall or floor, the target takes 3 (1d6) bludgeoning damage for every 10 feet it was thrown. If the target is thrown at another creature, that creature must succeed on a DC 13 Dexterity saving throw or take the same damage and be knocked prone. If the saving throw is successful, the target takes half the bludgeoning damage and isn't flung away or knocked prone."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "An air elemental is a funneling cloud of whirling air with a vague semblance of a face. It can turn itself into a screaming cyclone, creating a whirlwind that batters creatures even as it flings them away.",
        tags = "fly speed, hover, damage resistance, damage immunity, condition immunity, darkvision, multiattack, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val azer = registerElementalStatBlock(
    StatBlock(
        name = "Azer",
        size = "Medium",
        type = "elemental",
        alignment = "lawful neutral",
        armorClass = "17 (natural armor, shield)",
        hitPoints = "39 (6d8 + 12)",
        speed = "30 ft.",
        str = 17, strMod = "+3",
        dex = 12, dexMod = "+1",
        con = 15, conMod = "+2",
        int = 12, intMod = "+1",
        wis = 13, wisMod = "+1",
        cha = 10, chaMod = "+0",
        savingThrows = "Con +4",
        skills = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "fire, poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "passive Perception 11",
        languages = "Ignan",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Heated Body. A creature that touches the azer or hits it with a melee attack while within 5 feet of it takes 5 (1d10) fire damage.",
            "Heated Weapons. When the azer hits with a metal melee weapon, it deals an extra 3 (1d6) fire damage (included in the attack).",
            "Illumination. The azer sheds bright light in a 10-foot radius and dim light for an additional 10 feet."
        ),
        actions = listOf(
            "Warhammer. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 7 (1d8 + 3) bludgeoning damage, or 8 (1d10 + 3) bludgeoning damage if used with two hands to make a melee attack, plus 3 (1d6) fire damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage immunity, condition immunity",
        source = "Monster Manual (SRD)"
    )
)

val djinni = registerElementalStatBlock(
    StatBlock(
        name = "Djinni",
        size = "Large",
        type = "elemental",
        alignment = "chaotic good",
        armorClass = "17 (natural armor)",
        hitPoints = "161 (14d10 + 84)",
        speed = "30 ft., fly 90 ft.",
        str = 21, strMod = "+5",
        dex = 15, dexMod = "+2",
        con = 22, conMod = "+6",
        int = 15, intMod = "+2",
        wis = 16, wisMod = "+3",
        cha = 20, chaMod = "+5",
        savingThrows = "Dex +6, Wis +7, Cha +9",
        skills = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "lightning, thunder",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 13",
        languages = "Auran",
        challengeRating = "11",
        expValue = "7200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Elemental Demise. If the djinni dies, its body disintegrates into a warm breeze, leaving behind only equipment the djinni was wearing or carrying.",
            "Innate Spellcasting. The djinni's innate spellcasting ability is Charisma (spell save DC 17, +9 to hit with spell attacks). It can innately cast the following spells, requiring no material components:\n\nAt will: *detect evil and good, detect magic, thunderwave*\n3/day each: *create food and water* (can create wine instead of water), *tongues, wind walk*\n1/day each: *conjure elemental* (air elemental only), *creation, gaseous form, invisibility, major image, plane shift*"
        ),
        actions = listOf(
            "Multiattack. The djinni makes three scimitar attacks.",
            "Scimitar. Melee Weapon Attack: +9 to hit, reach 5 ft., one target. Hit: 12 (2d6 + 5) slashing damage plus 3 (1d6) lightning or thunder damage (djinni's choice).",
            "Create Whirlwind. A 5-foot-radius, 30-foot-tall cylinder of swirling air magically forms on a point the djinni can see within 120 feet of it. The whirlwind lasts as long as the djinni maintains concentration (as if concentrating on a spell). Any creature but the djinni that enters the whirlwind must succeed on a DC 18 Strength saving throw or be restrained by it. The djinni can move the whirlwind up to 60 feet as an action, and creatures restrained by the whirlwind move with it. The whirlwind ends if the djinni loses sight of it. A creature can use its action to free a creature restrained by the whirlwind, including itself, by succeeding on a DC 18 Strength check. If the check succeeds, the creature is no longer restrained and moves to the nearest space outside the whirlwind."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, damage immunity, darkvision, multiattack, cc - restrained",
        source = "Monster Manual (SRD)"
    )
)

val dustMephit = registerElementalStatBlock(
    StatBlock(
        name = "Dust Mephit",
        size = "Small",
        type = "elemental",
        alignment = "neutral evil",
        armorClass = "12",
        hitPoints = "17 (5d6)",
        speed = "30 ft., fly 30 ft.",
        str = 5, strMod = "-3",
        dex = 14, dexMod = "+2",
        con = 10, conMod = "+0",
        int = 9, intMod = "-1",
        wis = 11, wisMod = "+0",
        cha = 10, chaMod = "+0",
        savingThrows = null,
        skills = "Perception +2, Stealth +4",
        vulnerabilities = "fire",
        damageResistances = null,
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 12",
        languages = "Auran, Terran",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Death Burst. When the mephit dies, it explodes in a burst of dust. Each creature within 5 feet of it must then succeed on a DC 10 Constitution saving throw or be blinded for 1 minute. A blinded creature can repeat the saving throw on each of its turns, ending the effect on itself on a success.",
            "Innate Spellcasting (1/Day). The mephit can innately cast *sleep*, requiring no material components. Its innate spellcasting ability is Charisma."
        ),
        actions = listOf(
            "Claws. Melee Weapon Attack: +4 to hit, reach 5 ft., one creature. Hit: 4 (1d4 + 2) slashing damage.",
            "Blinding Breath (Recharge 6). The mephit exhales a 15-foot cone of blinding dust. Each creature in that area must succeed on a DC 10 Dexterity saving throw or be blinded for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, damage immunity, condition immunity, cc - blinded",
        source = "Monster Manual (SRD)"
    )
)

val earthElemental = registerElementalStatBlock(
    StatBlock(
        name = "Earth Elemental",
        size = "Large",
        type = "elemental",
        alignment = "neutral",
        armorClass = "17 (natural armor)",
        hitPoints = "126 (12d10 + 60)",
        speed = "30 ft., burrow 30 ft.",
        str = 20, strMod = "+5",
        dex = 8, dexMod = "-1",
        con = 20, conMod = "+5",
        int = 5, intMod = "-3",
        wis = 10, wisMod = "+0",
        cha = 5, chaMod = "-3",
        savingThrows = null,
        skills = null,
        vulnerabilities = "thunder",
        damageResistances = "bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "exhaustion, paralyzed, petrified, poisoned, unconscious",
        legendaryResistance = null,
        senses = "darkvision 60 ft., tremorsense 60 ft., passive Perception 10",
        languages = "Terran",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Earth Glide. The elemental can burrow through nonmagical, unworked earth and stone. While doing so, the elemental doesn't disturb the material it moves through.",
            "Siege Monster. The elemental deals double damage to objects and structures."
        ),
        actions = listOf(
            "Multiattack. The elemental makes two slam attacks.",
            "Slam. Melee Weapon Attack: +8 to hit, reach 10 ft., one target. Hit: 14 (2d8 + 5) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "burrow speed, damage resistance, damage immunity, condition immunity, darkvision, tremorsense, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val efreeti = registerElementalStatBlock(
    StatBlock(
        name = "Efreeti",
        size = "Large",
        type = "elemental",
        alignment = "lawful evil",
        armorClass = "17 (natural armor)",
        hitPoints = "200 (16d10 + 112)",
        speed = "40 ft., fly 60 ft.",
        str = 22, strMod = "+6",
        dex = 12, dexMod = "+1",
        con = 24, conMod = "+7",
        int = 16, intMod = "+3",
        wis = 15, wisMod = "+2",
        cha = 16, chaMod = "+3",
        savingThrows = "Int +7, Wis +6, Cha +7",
        skills = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "fire",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 12",
        languages = "Ignan",
        challengeRating = "11",
        expValue = "7200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Elemental Demise. If the efreeti dies, its body disintegrates in a flash of fire and puff of smoke, leaving behind only equipment the efreeti was wearing or carrying.",
            "Innate Spellcasting. The efreeti's innate spellcasting ability is Charisma (spell save DC 15, +7 to hit with spell attacks). " +
                    "It can innately cast the following spells, requiring no material components:\n\n" +
                    "At will: detect magic\n" +
                    "3/day each: enlarge/reduce, tongues\n" +
                    "1/day each: conjure elemental (fire elemental only), gaseous form, invisibility, major image, plane shift, wall of fire"
        ),
        actions = listOf(
            "Multiattack. The efreeti makes two scimitar attacks or uses its Hurl Flame twice.",
            "Scimitar. Melee Weapon Attack: +10 to hit, reach 5 ft., one target. Hit: 13 (2d6 + 6) slashing damage plus 7 (2d6) fire damage.",
            "Hurl Flame. Ranged Spell Attack: +7 to hit, range 120 ft., one target. Hit: 17 (5d6) fire damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, damage immunity, darkvision, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val fireElemental = registerElementalStatBlock(
    StatBlock(
        name = "Fire Elemental",
        size = "Large",
        type = "elemental",
        alignment = "neutral",
        armorClass = "13",
        hitPoints = "102 (12d10 + 36)",
        speed = "50 ft.",
        str = 10, strMod = "+0",
        dex = 17, dexMod = "+3",
        con = 16, conMod = "+3",
        int = 6, intMod = "-2",
        wis = 10, wisMod = "+0",
        cha = 7, chaMod = "-2",
        savingThrows = null,
        skills = null,
        vulnerabilities = null,
        damageResistances = "bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "fire, poison",
        conditionResistances = null,
        conditionImmunities = "exhaustion, grappled, paralyzed, petrified, poisoned, prone, restrained, unconscious",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "Ignan",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Fire Form. The elemental can move through a space as narrow as 1 inch wide without squeezing. A creature that touches the elemental or hits it with a melee attack while within 5 feet of it takes 5 (1d10) fire damage. In addition, the elemental can enter a hostile creature's space and stop there. The first time it enters a creature's space on a turn, that creature takes 5 (1d10) fire damage and catches fire; until someone takes an action to douse the fire, the creature takes 5 (1d10) fire damage at the start of each of its turns.",
            "Illumination. The elemental sheds bright light in a 30-foot radius and dim light in an additional 30 feet.",
            "Water Susceptibility. For every 5 feet the elemental moves in water, or for every gallon of water splashed on it, it takes 1 cold damage."
        ),
        actions = listOf(
            "Multiattack. The elemental makes two touch attacks.",
            "Touch. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 10 (2d6 + 3) fire damage. If the target is a creature or a flammable object, it ignites. Until a creature takes an action to douse the fire, the target takes 5 (1d10) fire damage at the start of each of its turns."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "A faint humanoid shape shows in a fire elemental's capricious devastation. Wherever it moves, it sets its surroundings ablaze, turning the world to ash, smoke, and cinders.",
        tags = "damage resistance, damage immunity, condition immunity, darkvision, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val gargoyle = registerElementalStatBlock(
    StatBlock(
        name = "Gargoyle",
        size = "Medium",
        type = "elemental",
        alignment = "chaotic evil",
        armorClass = "15 (natural armor)",
        hitPoints = "52 (7d8 + 21)",
        speed = "30 ft., fly 60 ft.",
        str = 15, strMod = "+2",
        dex = 11, dexMod = "+0",
        con = 16, conMod = "+3",
        int = 6, intMod = "-2",
        wis = 11, wisMod = "+0",
        cha = 7, chaMod = "-2",
        savingThrows = null,
        skills = null,
        vulnerabilities = null,
        damageResistances = "bludgeoning, piercing, and slashing from nonmagical attacks that aren't adamantine",
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "exhaustion, petrified, poisoned",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "Terran",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "False Appearance. While the gargoyle remains motionless, it is indistinguishable from an inanimate statue."
        ),
        actions = listOf(
            "Multiattack. The gargoyle makes two attacks: one with its bite and one with its claws.",
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 5 (1d6 + 2) piercing damage.",
            "Claws. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 5 (1d6 + 2) slashing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "These malevolent creatures of elemental earth resemble grotesque, fiendish statues. A gargoyle lurks among masonry and ruins, delighting in the terror it creates when it breaks from its suspended pose.",
        tags = "fly speed, damage resistance, damage immunity, condition immunity, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val iceMephit = registerElementalStatBlock(
    StatBlock(
        name = "Ice Mephit",
        size = "Small",
        type = "elemental",
        alignment = "neutral evil",
        armorClass = "11",
        hitPoints = "21 (6d6)",
        speed = "30 ft., fly 30 ft.",
        str = 7, strMod = "-2",
        dex = 13, dexMod = "+1",
        con = 10, conMod = "+0",
        int = 9, intMod = "-1",
        wis = 11, wisMod = "+0",
        cha = 12, chaMod = "+1",
        savingThrows = null,
        skills = "Perception +2, Stealth +3",
        vulnerabilities = "bludgeoning, fire",
        damageResistances = null,
        damageImmunities = "cold, poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 12",
        languages = "Aquan, Auran",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Death Burst. When the mephit dies, it explodes in a burst of jagged ice. Each creature within 5 feet of it must make a DC 10 Dexterity saving throw, taking 4 (1d8) slashing damage on a failed save, or half as much damage on a successful one.",
            "False Appearance. While the mephit remains motionless, it is indistinguishable from an ordinary shard of ice.",
            "Innate Spellcasting (1/Day). The mephit can innately cast fog cloud, requiring no material components. Its innate spellcasting ability is Charisma."
        ),
        actions = listOf(
            "Claws. Melee Weapon Attack: +3 to hit, reach 5 ft., one creature. Hit: 3 (1d4 + 1) slashing damage plus 2 (1d4) cold damage.",
            "Frost Breath (Recharge 6). The mephit exhales a 15-foot cone of cold air. Each creature in that area must succeed on a DC 10 Dexterity saving throw, taking 5 (2d4) cold damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, damage immunity, condition immunity, darkvision",
        source = "Monster Manual (SRD)"
    )
)

val invisibleStalker = registerElementalStatBlock(
    StatBlock(
        name = "Invisible Stalker",
        size = "Medium",
        type = "elemental",
        alignment = "neutral",
        armorClass = "14",
        hitPoints = "104 (16d8 + 32)",
        speed = "50 ft., fly 50 ft. (hover)",
        str = 16, strMod = "+3",
        dex = 19, dexMod = "+4",
        con = 14, conMod = "+2",
        int = 10, intMod = "+0",
        wis = 15, wisMod = "+2",
        cha = 11, chaMod = "+0",
        savingThrows = null,
        skills = "Perception +8, Stealth +10",
        vulnerabilities = null,
        damageResistances = "bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "exhaustion, grappled, paralyzed, petrified, poisoned, prone, restrained, unconscious",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 18",
        languages = "Auran, understands Common but doesn't speak it",
        challengeRating = "6",
        expValue = "2300 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Invisibility. The stalker is invisible.",
            "Faultless Tracker. The stalker is given a quarry by its summoner. The stalker knows the direction and distance to its quarry as long as the two of them are on the same plane of existence. The stalker also knows the location of its summoner."
        ),
        actions = listOf(
            "Multiattack. The stalker makes two slam attacks.",
            "Slam. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 10 (2d6 + 3) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, hover, damage resistance, damage immunity, condition immunity, darkvision, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val magmaMephit = registerElementalStatBlock(
    StatBlock(
        name = "Magma Mephit",
        size = "Small",
        type = "elemental",
        alignment = "neutral evil",
        armorClass = "11",
        hitPoints = "22 (5d6 + 5)",
        speed = "30 ft., fly 30 ft.",
        str = 8, strMod = "-1",
        dex = 12, dexMod = "+1",
        con = 12, conMod = "+1",
        int = 7, intMod = "-2",
        wis = 10, wisMod = "+0",
        cha = 10, chaMod = "+0",
        savingThrows = null,
        skills = "Stealth +3",
        vulnerabilities = "cold",
        damageResistances = null,
        damageImmunities = "fire, poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "Ignan, Terran",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Death Burst. When the mephit dies, it explodes in a burst of lava. Each creature within 5 feet of it must make a DC 11 Dexterity saving throw, taking 7 (2d6) fire damage on a failed save, or half as much damage on a successful one.",
            "False Appearance. While the mephit remains motionless, it is indistinguishable from an ordinary mound of magma.",
            "Innate Spellcasting (1/Day). The mephit can innately cast heat metal (spell save DC 10), requiring no material components. Its innate spellcasting ability is Charisma."
        ),
        actions = listOf(
            "Claws. Melee Weapon Attack: +3 to hit, reach 5 ft., one creature. Hit: 3 (1d4 + 1) slashing damage plus 2 (1d4) fire damage.",
            "Fire Breath (Recharge 6). The mephit exhales a 15-foot cone of fire. Each creature in that area must make a DC 11 Dexterity saving throw, taking 7 (2d6) fire damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, damage immunity, condition immunity, darkvision",
        source = "Monster Manual (SRD)"
    )
)

val magmin = registerElementalStatBlock(
    StatBlock(
        name = "Magmin",
        size = "Small",
        type = "elemental",
        alignment = "chaotic neutral",
        armorClass = "14 (natural armor)",
        hitPoints = "9 (2d6 + 2)",
        speed = "30 ft.",
        str = 7, strMod = "-2",
        dex = 15, dexMod = "+2",
        con = 12, conMod = "+1",
        int = 8, intMod = "-1",
        wis = 11, wisMod = "+0",
        cha = 10, chaMod = "+0",
        savingThrows = null,
        skills = null,
        vulnerabilities = null,
        damageResistances = "bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "fire",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "Ignan",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Death Burst. When the magmin dies, it explodes in a burst of fire and magma. Each creature within 10 feet of it must make a DC 11 Dexterity saving throw, taking 7 (2d6) fire damage on a failed save, or half as much damage on a successful one. Flammable objects that aren't being worn or carried in that area are ignited.",
            "Ignited Illumination. As a bonus action, the magmin can set itself ablaze or extinguish its flames. While ablaze, the magmin sheds bright light in a 10-foot radius and dim light for an additional 10 feet."
        ),
        actions = listOf(
            "Touch. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 7 (2d6) fire damage. If the target is a creature or a flammable object, it ignites. Until a creature takes an action to douse the fire, the target takes 3 (1d6) fire damage at the end of each of its turns."
        ),
        bonusActions = listOf(
            "Ignited Illumination (Bonus Action). The magmin can set itself ablaze or extinguish its flames."
        ),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage resistance, damage immunity, darkvision",
        source = "Monster Manual (SRD)"
    )
)

val marid = registerElementalStatBlock(
    StatBlock(
        name = "Marid",
        size = "Large",
        type = "elemental",
        alignment = "chaotic neutral",
        armorClass = "17 (natural armor)",
        hitPoints = "229 (17d10 + 136)",
        speed = "30 ft., fly 60 ft., swim 90 ft.",
        str = 22, strMod = "+6",
        dex = 12, dexMod = "+1",
        con = 26, conMod = "+8",
        int = 18, intMod = "+4",
        wis = 17, wisMod = "+3",
        cha = 18, chaMod = "+4",
        savingThrows = "Dex +5, Wis +7, Cha +8",
        skills = null,
        vulnerabilities = null,
        damageResistances = "acid, cold, lightning",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 30 ft., darkvision 120 ft., passive Perception 13",
        languages = "Aquan",
        challengeRating = "11",
        expValue = "7,200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The marid can breathe air and water.",
            "Elemental Demise. If the marid dies, its body disintegrates into a burst of water and foam, leaving behind only equipment the marid was wearing or carrying.",
            "Innate Spellcasting. The marid's innate spellcasting ability is Charisma (spell save DC 16, +8 to hit with spell attacks). It can innately cast the following spells, requiring no material components:",
            "At will: create or destroy water, detect evil and good, detect magic, fog cloud, purify food and drink",
            "3/day each: tongues, water breathing, water walk",
            "1/day each: conjure elemental (water elemental only), control water, gaseous form, invisibility, plane shift"
        ),
        actions = listOf(
            "Multiattack. The marid makes two trident attacks.",
            "Trident. Melee or Ranged Weapon Attack: +10 to hit, reach 5 ft. or range 20/60 ft., one target. Hit: 13 (2d6 + 6) piercing damage, or 15 (2d8 + 6) piercing damage if used with two hands to make a melee attack.",
            "Water Jet. The marid magically shoots water in a 60-foot line that is 5 feet wide. Each creature in that line must make a DC 16 Dexterity saving throw. On a failure, a target takes 21 (6d6) bludgeoning damage and, if it is Huge or smaller, is pushed up to 20 feet away from the marid and knocked prone. On a success, a target takes half the bludgeoning damage, but is neither pushed nor knocked prone."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, swim speed, damage resistance, blindsight, darkvision, amphibious, water breathing, multiattack, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val salamander = registerElementalStatBlock(
    StatBlock(
        name = "Salamander",
        size = "Large",
        type = "elemental",
        alignment = "neutral evil",
        armorClass = "15 (natural armor)",
        hitPoints = "90 (12d10 + 24)",
        speed = "30 ft.",
        str = 18, strMod = "+4",
        dex = 14, dexMod = "+2",
        con = 15, conMod = "+2",
        int = 11, intMod = "+0",
        wis = 10, wisMod = "+0",
        cha = 12, chaMod = "+1",
        savingThrows = null,
        skills = null,
        vulnerabilities = "cold",
        damageResistances = "bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "fire",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "Ignan",
        challengeRating = "5",
        expValue = "1,800 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Heated Body. A creature that touches the salamander or hits it with a melee attack while within 5 feet of it takes 7 (2d6) fire damage.",
            "Heated Weapons. Any metal melee weapon the salamander wields deals an extra 3 (1d6) fire damage on a hit (included in the attack)."
        ),
        actions = listOf(
            "Multiattack. The salamander makes two attacks: one with its spear and one with its tail.",
            "Spear. Melee or Ranged Weapon Attack: +7 to hit, reach 5 ft. or range 20 ft./60 ft., one target. Hit: 11 (2d6 + 4) piercing damage, or 13 (2d8 + 4) piercing damage if used with two hands to make a melee attack, plus 3 (1d6) fire damage.",
            "Tail. Melee Weapon Attack: +7 to hit, reach 10 ft., one target. Hit: 11 (2d6 + 4) bludgeoning damage plus 7 (2d6) fire damage, and the target is grappled (escape DC 14). Until this grapple ends, the target is restrained, the salamander can automatically hit the target with its tail, and the salamander can't make tail attacks against other targets."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage resistance, damage immunity, darkvision, multiattack, cc - grappled, cc - restrained",
        source = "Monster Manual (SRD)"
    )
)

val steamMephit = registerElementalStatBlock(
    StatBlock(
        name = "Steam Mephit",
        size = "Small",
        type = "elemental",
        alignment = "neutral evil",
        armorClass = "10",
        hitPoints = "21 (6d6)",
        speed = "30 ft., fly 30 ft.",
        str = 5, strMod = "-3",
        dex = 11, dexMod = "+0",
        con = 10, conMod = "+0",
        int = 11, intMod = "+0",
        wis = 10, wisMod = "+0",
        cha = 12, chaMod = "+1",
        savingThrows = null,
        skills = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "fire, poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "Aquan, Ignan",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Death Burst. When the mephit dies, it explodes in a cloud of steam. Each creature within 5 feet of the mephit must succeed on a DC 10 Dexterity saving throw or take 4 (1d8) fire damage.",
            "Innate Spellcasting (1/Day). The mephit can innately cast blur, requiring no material components. Its innate spellcasting ability is Charisma."
        ),
        actions = listOf(
            "Claws. Melee Weapon Attack: +2 to hit, reach 5 ft., one creature. Hit: 2 (1d4) slashing damage plus 2 (1d4) fire damage.",
            "Steam Breath (Recharge 6). The mephit exhales a 15-foot cone of scalding steam. Each creature in that area must succeed on a DC 10 Dexterity saving throw, taking 4 (1d8) fire damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, damage immunity, condition immunity, darkvision",
        source = "Monster Manual (SRD)"
    )
)

val waterElemental = registerElementalStatBlock(
    StatBlock(
        name = "Water Elemental",
        size = "Large",
        type = "elemental",
        alignment = "neutral",
        armorClass = "14 (natural armor)",
        hitPoints = "114 (12d10 + 48)",
        speed = "30 ft., swim 90 ft.",
        str = 18, strMod = "+4",
        dex = 14, dexMod = "+2",
        con = 18, conMod = "+4",
        int = 5, intMod = "-3",
        wis = 10, wisMod = "+0",
        cha = 8, chaMod = "-1",
        savingThrows = null,
        skills = null,
        vulnerabilities = null,
        damageResistances = "acid; bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "exhaustion, grappled, paralyzed, petrified, poisoned, prone, restrained, unconscious",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "Aquan",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Water Form. The elemental can enter a hostile creature's space and stop there. It can move through a space as narrow as 1 inch wide without squeezing.",
            "Freeze. If the elemental takes cold damage, it partially freezes; its speed is reduced by 20 feet until the end of its next turn."
        ),
        actions = listOf(
            "Multiattack. The elemental makes two slam attacks.",
            "Slam. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 13 (2d8 + 4) bludgeoning damage.",
            "Whelm (Recharge 4-6). Each creature in the elemental's space must make a DC 15 Strength saving throw. On a failure, a target takes 13 (2d8 + 4) bludgeoning damage. If it is Large or smaller, it is also grappled (escape DC 14). Until this grapple ends, the target is restrained and unable to breathe unless it can breathe water. If the saving throw is successful, the target is pushed out of the elemental's space. The elemental can grapple one Large creature or up to two Medium or smaller creatures at one time. At the start of each of the elemental's turns, each target grappled by it takes 13 (2d8 + 4) bludgeoning damage. A creature within 5 feet of the elemental can pull a creature or object out of it by taking an action to make a DC 14 Strength check and succeeding."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Beings native to the Elemental Plane of Water and summoned to the world, water elementals resemble cresting waves that roll across the ground. A water elemental engulfs any creatures that stand against it.",
        tags = "swim speed, damage resistance, damage immunity, condition resistance, darkvision, multiattack, cc - grappled, cc - restrained, ",
        source = "Monster Manual (SRD)"
    )
)

val xorn = registerElementalStatBlock(
    StatBlock(
        name = "Xorn",
        size = "Medium",
        type = "elemental",
        alignment = "neutral",
        armorClass = "19 (natural armor)",
        hitPoints = "73 (7d8 + 42)",
        speed = "20 ft., burrow 20 ft.",
        str = 17, strMod = "+3",
        dex = 10, dexMod = "+0",
        con = 22, conMod = "+6",
        int = 11, intMod = "+0",
        wis = 10, wisMod = "+0",
        cha = 11, chaMod = "+0",
        skills = "Perception +6, Stealth +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "piercing and slashing from nonmagical attacks that aren't adamantine",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., tremorsense 60 ft., passive Perception 16",
        languages = "Terran",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Earth Glide. The xorn can burrow through nonmagical, unworked earth and stone. While doing so, the xorn doesn't disturb the material it moves through.",
            "Stone Camouflage. The xorn has advantage on Dexterity (Stealth) checks made to hide in rocky terrain.",
            "Treasure Sense. The xorn can pinpoint, by scent, the location of precious metals and stones, such as coins and gems, within 60 feet of it."
        ),
        actions = listOf(
            "Multiattack. The xorn makes three claw attacks and one bite attack.",
            "Claw. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 6 (1d6 + 3) slashing damage.",
            "Bite. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 13 (3d6 + 3) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "burrow speed, damage resistance, darkvision, tremorsense, multiattack",
        source = "Monster Manual (SRD)"
    )
)

//Summons and Spell effects
