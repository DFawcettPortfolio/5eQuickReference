package com.example.wildshapesmountsandfamiliars.ui.screens.creatureType

import androidx.compose.runtime.Composable
import com.example.wildshapesmountsandfamiliars.ui.screens.CreatureTypeScreen
import com.example.wildshapesmountsandfamiliars.ui.screens.FeyStatBlockSpellEffectOrSummon
import com.example.wildshapesmountsandfamiliars.ui.screens.FeyStatBlocks
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.registerFeyStatBlock

@Composable
fun Fey(
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
        title = "Fey",
        statBlocks = FeyStatBlocks,
        spellEffectOrSummons = FeyStatBlockSpellEffectOrSummon,
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

val blinkDog = registerFeyStatBlock(
    StatBlock(
        name = "Blink Dog",
        size = "Medium",
        type = "fey",
        alignment = "lawful good",
        armorClass = "13",
        hitPoints = "22 (4d8 + 4)",
        speed = "40 ft.",
        str = 12, strMod = "+1",
        dex = 17, dexMod = "+3",
        con = 12, conMod = "+1",
        int = 10, intMod = "+0",
        wis = 13, wisMod = "+1",
        cha = 11, chaMod = "+0",
        skills = "Perception +3, Stealth +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "Blink Dog, understands Sylvan but can't speak it",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Hearing and Smell. The dog has advantage on Wisdom (Perception) checks that rely on hearing or smell."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 4 (1d6 + 1) piercing damage.",
            "Teleport (Recharge 4–6). The dog magically teleports, along with any equipment it is wearing or carrying, up to 40 feet to an unoccupied space it can see. Before or after teleporting, the dog can make one bite attack."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "A blink dog takes its name from its ability to blink in and out of existence, a talent it uses to aid its attacks and to avoid harm.",
        tags = "keen hearing, keen smell",
        source = "Monster Manual (SRD)"
    )
)

val dryad = registerFeyStatBlock(
    StatBlock(
        name = "Dryad",
        size = "Medium",
        type = "fey",
        alignment = "neutral",
        armorClass = "11 (16 with barkskin)",
        hitPoints = "22 (5d8)",
        speed = "30 ft.",
        str = 10, strMod = "+0",
        dex = 12, dexMod = "+1",
        con = 11, conMod = "+0",
        int = 14, intMod = "+2",
        wis = 15, wisMod = "+2",
        cha = 18, chaMod = "+4",
        skills = "Perception +4, Stealth +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 14",
        languages = "Elvish, Sylvan",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Innate Spellcasting. The dryad's innate spellcasting ability is Charisma (spell save DC 14). The dryad can innately cast the following spells, requiring no material components:\n\nAt will: *druidcraft*\n3/day each: *entangle, goodberry*\n1/day each: *barkskin, pass without trace, shillelagh*",
            "Magic Resistance. The dryad has advantage on saving throws against spells and other magical effects.",
            "Speak with Beasts and Plants. The dryad can communicate with beasts and plants as if they shared a language.",
            "Tree Stride. Once on her turn, the dryad can use 10 feet of her movement to step magically into one living tree within her reach and emerge from a second living tree within 60 feet of the first tree, appearing in an unoccupied space within 5 feet of the second tree. Both trees must be Large or bigger."
        ),
        actions = listOf(
            "Club. Melee Weapon Attack: +2 to hit (+6 to hit with shillelagh), reach 5 ft., one target. Hit: 2 (1d4) bludgeoning damage, or 8 (1d8 + 4) bludgeoning damage with *shillelagh*.",
            "Fey Charm. The dryad targets one humanoid or beast that she can see within 30 feet of her. If the target can see the dryad, it must succeed on a DC 14 Wisdom saving throw or be magically charmed. The charmed creature regards the dryad as a trusted friend to be heeded and protected. Although the target isn't under the dryad's control, it takes the dryad's requests or actions in the most favorable way it can. Each time the dryad or its allies do anything harmful to the target, it can repeat the saving throw, ending the effect on itself on a success. Otherwise, the effect lasts 24 hours or until the dryad dies, is on a different plane of existence from the target, or ends the effect as a bonus action. If a target's saving throw is successful, the target is immune to the dryad's Fey Charm for the next 24 hours. The dryad can have no more than one humanoid and up to three beasts charmed at a time."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "darkvision, cc - charmed",
        source = "Monster Manual (SRD)"
    )
)

val greenHag = registerFeyStatBlock(
    StatBlock(
        name = "Green Hag",
        size = "Medium",
        type = "fey",
        alignment = "neutral evil",
        armorClass = "17 (natural armor)",
        hitPoints = "82 (11d8 + 33)",
        speed = "30 ft.",
        str = 18, strMod = "+4",
        dex = 12, dexMod = "+1",
        con = 16, conMod = "+3",
        int = 13, intMod = "+1",
        wis = 14, wisMod = "+2",
        cha = 14, chaMod = "+2",
        skills = "Arcana +3, Deception +4, Perception +4, Stealth +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 14",
        languages = "Common, Draconic, Sylvan",
        challengeRating = "3",
        expValue = "700 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The hag can breathe air and water.",
            "Innate Spellcasting. The hag's innate spellcasting ability is Charisma (spell save DC 12). She can innately cast the following spells, requiring no material components:\n\nAt will: *dancing lights, minor illusion, vicious mockery*",
            "Mimicry. The hag can mimic animal sounds and humanoid voices. A creature that hears the sounds can tell they are imitations with a successful DC 14 Wisdom (Insight) check."
        ),
        actions = listOf(
            "Claws. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 13 (2d8 + 4) slashing damage.",
            "Illusory Appearance. The hag covers herself and anything she is wearing or carrying with a magical illusion that makes her look like another creature of her general size and humanoid shape. The illusion ends if the hag takes a bonus action to end it or if she dies. The changes wrought by this effect fail to hold up to physical inspection. For example, the hag could appear to have smooth skin, but someone touching her would feel her rough flesh. Otherwise, a creature must take an action to visually inspect the illusion and succeed on a DC 20 Intelligence (Investigation) check to discern that the hag is disguised.",
            "Invisible Passage. The hag magically turns invisible until she attacks or casts a spell, or until her concentration ends (as if concentrating on a spell). While invisible, she leaves no physical evidence of her passage, so she can be tracked only by magic. Any equipment she wears or carries is invisible with her."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "darkvision, amphibious, water breathing",
        source = "Monster Manual (SRD)"
    )
)

val satyr = registerFeyStatBlock(
    StatBlock(
        name = "Satyr",
        size = "Medium",
        type = "fey",
        alignment = "chaotic neutral",
        armorClass = "14 (leather armor)",
        hitPoints = "31 (7d8)",
        speed = "40 ft.",
        str = 12, strMod = "+1",
        dex = 16, dexMod = "+3",
        con = 11, conMod = "+0",
        int = 12, intMod = "+1",
        wis = 10, wisMod = "+0",
        cha = 14, chaMod = "+2",
        skills = "Perception +2, Performance +6, Stealth +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 12",
        languages = "Common, Elvish, Sylvan",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Magic Resistance. The satyr has advantage on saving throws against spells and other magical effects."
        ),
        actions = listOf(
            "Ram. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 6 (2d4 + 1) bludgeoning damage.",
            "Shortsword. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 6 (1d6 + 3) piercing damage.",
            "Shortbow. Ranged Weapon Attack: +5 to hit, range 80/320 ft., one target. Hit: 6 (1d6 + 3) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Satyrs are raucous fey that resemble stout male humans with the furry lower bodies and cloven hooves of goats. They frolic in wild forests, driven by curiosity and hedonism in equal measure.",
        tags = "magic resistance",
        source = "Monster Manual (SRD)"
    )
)

val seaHag = registerFeyStatBlock(
    StatBlock(
        name = "Sea Hag",
        size = "Medium",
        type = "fey",
        alignment = "chaotic evil",
        armorClass = "14 (natural armor)",
        hitPoints = "52 (7d8 + 21)",
        speed = "30 ft., swim 40 ft.",
        str = 16, strMod = "+3",
        dex = 13, dexMod = "+1",
        con = 16, conMod = "+3",
        int = 12, intMod = "+1",
        wis = 12, wisMod = "+1",
        cha = 13, chaMod = "+1",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 11",
        languages = "Aquan, Common, Giant",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The hag can breathe air and water.",
            "Horrific Appearance. Any humanoid that starts its turn within 30 feet of the hag and can see the hag's true form must make a DC 11 Wisdom saving throw. On a failed save, the creature is frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, with disadvantage if the hag is within line of sight, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the hag's Horrific Appearance for the next 24 hours. Unless the target is surprised or the revelation of the hag's true form is sudden, the target can avert its eyes and avoid making the initial saving throw. Until the start of its next turn, a creature that averts its eyes has disadvantage on attack rolls against the hag."
        ),
        actions = listOf(
            "Claws. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 10 (2d6 + 3) slashing damage.",
            "Death Glare. The hag targets one frightened creature she can see within 30 feet of her. If the target can see the hag, it must succeed on a DC 11 Wisdom saving throw against this magic or drop to 0 hit points.",
            "Illusory Appearance. The hag covers herself and anything she is wearing or carrying with a magical illusion that makes her look like an ugly creature of her general size and humanoid shape. The effect ends if the hag takes a bonus action to end it or if she dies. The changes wrought by this effect fail to hold up to physical inspection. For example, the hag could appear to have no claws, but someone touching her hand might feel the claws. Otherwise, a creature must take an action to visually inspect the illusion and succeed on a DC 16 Intelligence (Investigation) check to discern that the hag is disguised."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "swim speed, darkvision, amphibious, water breathing, cc - frightened",
        source = "Monster Manual (SRD)"
    )
)

val sprite = registerFeyStatBlock(
    StatBlock(
        name = "Sprite",
        size = "Tiny",
        type = "fey",
        alignment = "neutral good",
        armorClass = "15 (leather armor)",
        hitPoints = "2 (1d4)",
        speed = "10 ft., fly 40 ft.",
        str = 3, strMod = "-4",
        dex = 18, dexMod = "+4",
        con = 10, conMod = "+0",
        int = 14, intMod = "+2",
        wis = 13, wisMod = "+1",
        cha = 11, chaMod = "+0",
        skills = "Perception +3, Stealth +8",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "Common, Elvish, Sylvan",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Longsword. Melee Weapon Attack: +2 to hit, reach 5 ft., one target. Hit: 1 slashing damage.",
            "Shortbow. Ranged Weapon Attack: +6 to hit, range 40/160 ft., one target. Hit: 1 piercing damage, and the target must succeed on a DC 10 Constitution saving throw or become poisoned for 1 minute. If its saving throw result is 5 or lower, the poisoned target falls unconscious for the same duration, or until it takes damage or another creature takes an action to shake it awake.",
            "Heart Sight. The sprite touches a creature and magically knows the creature's current emotional state. If the target fails a DC 10 Charisma saving throw, the sprite also knows the creature's alignment. Celestials, fiends, and undead automatically fail the saving throw.",
            "Invisibility. The sprite magically turns invisible until it attacks or casts a spell, or until its concentration ends (as if concentrating on a spell). Any equipment the sprite wears or carries is invisible with it."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, cc - poisoned, cc - unconscious",
        source = "Monster Manual (SRD)"
    )
)


//Spell effects and summons
