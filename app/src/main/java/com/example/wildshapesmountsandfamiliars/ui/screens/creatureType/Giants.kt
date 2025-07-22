package com.example.wildshapesmountsandfamiliars.ui.screens.creatureType



import androidx.compose.runtime.Composable
import com.example.wildshapesmountsandfamiliars.ui.screens.CreatureTypeScreen
import com.example.wildshapesmountsandfamiliars.ui.screens.GiantStatBlockSpellEffectOrSummon
import com.example.wildshapesmountsandfamiliars.ui.screens.GiantStatBlocks
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.registerGiantStatBlock


@Composable
fun Giants(
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
        title = "Giants",
        statBlocks = GiantStatBlocks,
        spellEffectOrSummons = GiantStatBlockSpellEffectOrSummon,
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


val cloudGiant = registerGiantStatBlock(
    StatBlock(
    name = "Cloud Giant",
    size = "Huge",
    type = "giant",
    alignment = "neutral good (50 %) or neutral evil (50 %)",
    armorClass = "14 (natural armor)",
    hitPoints = "200 (16d12 + 96)",
    speed = "40 ft.",
    str = 27, strMod = "+8",
    dex = 10, dexMod = "+0",
    con = 22, conMod = "+6",
    int = 12, intMod = "+1",
    wis = 16, wisMod = "+3",
    cha = 16, chaMod = "+3",
    skills = "Insight +7, Perception +7",
    savingThrows = "Con +10, Wis +7, Cha +7",
    vulnerabilities = null,
    damageResistances = null,
    damageImmunities = null,
    conditionResistances = null,
    conditionImmunities = null,
    legendaryResistance = null,
    senses = "passive Perception 17",
    languages = "Common, Giant",
    challengeRating = "9",
    expValue = "5000 XP",
    proficiencyBonus = null,
    traits = listOf(
        "Keen Smell. The giant has advantage on Wisdom (Perception) checks that rely on smell.",
        "Innate Spellcasting. The giant's innate spellcasting ability is Charisma. It can innately cast the following spells, requiring no material components:\n\n" +
                "At will: detect magic, fog cloud, light\n" +
                "3/day each: feather fall, fly, misty step, telekinesis\n" +
                "1/day each: control weather, gaseous form"
    ),
    actions = listOf(
        "Multiattack. The giant makes two morningstar attacks.",
        "Morningstar. Melee Weapon Attack: +12 to hit, reach 10 ft., one target. Hit: 21 (3d8 + 8) piercing damage.",
        "Rock. Ranged Weapon Attack: +12 to hit, range 60/240 ft., one target. Hit: 30 (4d10 + 8) bludgeoning damage."
    ),
    bonusActions = listOf(),
    reactions = listOf(),
    legendaryActions = listOf(),
    description = "A cloud giant earns its place in the ordning by the treasure it accumulates, the wealth it wears, and the gifts it bestows on other cloud giants.",
    tags = "keen smell, multiattack",
    source = "Monster Manual (SRD)"
    )
)

val ettin = registerGiantStatBlock(
    StatBlock(
    name = "Ettin",
    size = "Large",
    type = "giant",
    alignment = "chaotic evil",
    armorClass = "12 (natural armor)",
    hitPoints = "85 (10d10 + 30)",
    speed = "40 ft.",
    str = 21, strMod = "+5",
    dex = 8, dexMod = "-1",
    con = 17, conMod = "+3",
    int = 6, intMod = "-2",
    wis = 10, wisMod = "+0",
    cha = 8, chaMod = "-1",
    skills = "Perception +4",
    savingThrows = null,
    vulnerabilities = null,
    damageResistances = null,
    damageImmunities = null,
    conditionResistances = null,
    conditionImmunities = null,
    legendaryResistance = null,
    senses = "darkvision 60 ft., passive Perception 14",
    languages = "Giant, Orc",
    challengeRating = "4",
    expValue = "1100 XP",
    proficiencyBonus = null,
    traits = listOf(
        "Two Heads. The ettin has advantage on Wisdom (Perception) checks and on saving throws against being blinded, charmed, deafened, frightened, stunned and knocked unconscious.",
        "Wakeful. When one of the ettin's heads is asleep, its other head is awake."
    ),
    actions = listOf(
        "Multiattack. The ettin makes two attacks: one with its battleaxe and one with its morningstar.",
        "Battleaxe. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 14 (2d8 + 5) slashing damage.",
        "Morningstar. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 14 (2d8 + 5) piercing damage."
    ),
    bonusActions = listOf(),
    reactions = listOf(),
    legendaryActions = listOf(),
    description = null,
    tags = "darkvision, condition resistance, multiattack",
    source = "Monster Manual (SRD)"
    )
)

val fireGiant = registerGiantStatBlock(
    StatBlock(
    name = "Fire Giant",
    size = "Huge",
    type = "giant",
    alignment = "lawful evil",
    armorClass = "18 (plate)",
    hitPoints = "162 (13d12 + 78)",
    speed = "30 ft.",
    str = 25, strMod = "+7",
    dex = 9, dexMod = "-1",
    con = 23, conMod = "+6",
    int = 10, intMod = "+0",
    wis = 14, wisMod = "+2",
    cha = 13, chaMod = "+1",
    skills = "Athletics +11, Perception +6",
    savingThrows = "Dex +3, Con +10, Cha +5",
    vulnerabilities = null,
    damageResistances = null,
    damageImmunities = "fire",
    conditionResistances = null,
    conditionImmunities = null,
    legendaryResistance = null,
    senses = "passive Perception 16",
    languages = "Giant",
    challengeRating = "9",
    expValue = "5000 XP",
    proficiencyBonus = null,
    traits = listOf(),
    actions = listOf(
        "Multiattack. The giant makes two greatsword attacks.",
        "Greatsword. Melee Weapon Attack: +11 to hit, reach 10 ft., one target. Hit: 28 (6d6 + 7) slashing damage.",
        "Rock. Ranged Weapon Attack: +11 to hit, range 60/240 ft., one target. Hit: 29 (4d10 + 7) bludgeoning damage."
    ),
    bonusActions = listOf(),
    reactions = listOf(),
    legendaryActions = listOf(),
    description = "With dark skin and flaming red hair, fire giants have a fearsome reputation as soldiers and conquerors. They dwell among volcanoes, lava flows, and rocky mountains, and are known for their ability to burn, plunder, and destroy.",
    tags = "damage immunity, multiattack",
    source = "Monster Manual (SRD)"
    )
)

val frostGiant = registerGiantStatBlock(
    StatBlock(
    name = "Frost Giant",
    size = "Huge",
    type = "giant",
    alignment = "neutral evil",
    armorClass = "15 (patchwork armor)",
    hitPoints = "138 (12d12 + 60)",
    speed = "40 ft.",
    str = 23, strMod = "+6",
    dex = 9, dexMod = "-1",
    con = 21, conMod = "+5",
    int = 9, intMod = "-1",
    wis = 10, wisMod = "+0",
    cha = 12, chaMod = "+1",
    skills = "Athletics +9, Perception +3",
    savingThrows = "Con +8, Wis +3, Cha +4",
    vulnerabilities = null,
    damageResistances = null,
    damageImmunities = "cold",
    conditionResistances = null,
    conditionImmunities = null,
    legendaryResistance = null,
    senses = "passive Perception 13",
    languages = "Giant",
    challengeRating = "8",
    expValue = "3900 XP",
    proficiencyBonus = null,
    traits = listOf(),
    actions = listOf(
        "Multiattack. The giant makes two greataxe attacks.",
        "Greataxe. Melee Weapon Attack: +9 to hit, reach 10 ft., one target. Hit: 25 (3d12 + 6) slashing damage.",
        "Rock. Ranged Weapon Attack: +9 to hit, range 60/240 ft., one target. Hit: 28 (4d10 + 6) bludgeoning damage."
    ),
    bonusActions = listOf(),
    reactions = listOf(),
    legendaryActions = listOf(),
    description = "Frost giants are creatures of ice and snow, with hair and beards of pale white or light blue, and flesh as blue as glacial ice. They respect only brute strength and skill in battle.",
    tags = "damage immunity, multiattack",
    source = "Monster Manual (SRD)"
    )
)

val hillGiant = registerGiantStatBlock(
    StatBlock(
        name = "Hill Giant",
        size = "Huge",
        type = "giant",
        alignment = "chaotic evil",
        armorClass = "13 (natural armor)",
        hitPoints = "105 (10d12 + 40)",
        speed = "40 ft.",
        str = 21, strMod = "+5",
        dex = 8, dexMod = "-1",
        con = 19, conMod = "+4",
        int = 5, intMod = "-3",
        wis = 9, wisMod = "-1",
        cha = 6, chaMod = "-2",
        skills = "Perception +2",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 12",
        languages = "Giant",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Multiattack. The giant makes two greatclub attacks.",
            "Greatclub. Melee Weapon Attack: +8 to hit, reach 10 ft., one target. Hit: 18 (3d8 + 5) bludgeoning damage.",
            "Rock. Ranged Weapon Attack: +8 to hit, range 60/240 ft., one target. Hit: 21 (3d10 + 5) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Hill giants are selfish, dimwitted brutes that hunt and raid in constant search of food. Their skins are tan from lives spent beneath the sun, and their weapons are uprooted trees and rocks pulled from the earth.",
        tags = "multiattack",
        source = "Monster Manual (SRD)"
    )
)

val ogre = registerGiantStatBlock(
    StatBlock(
        name = "Ogre",
        size = "Large",
        type = "giant",
        alignment = "chaotic evil",
        armorClass = "11 (hide armor)",
        hitPoints = "59 (7d10 + 21)",
        speed = "40 ft.",
        str = 19, strMod = "+4",
        dex = 8, dexMod = "-1",
        con = 16, conMod = "+3",
        int = 5, intMod = "-3",
        wis = 7, wisMod = "-2",
        cha = 7, chaMod = "-2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 8",
        languages = "Common, Giant",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Greatclub. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 13 (2d8 + 4) bludgeoning damage.",
            "Javelin. Melee or Ranged Weapon Attack: +6 to hit, reach 5 ft. or range 30/120 ft., one target. Hit: 11 (2d6 + 4) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Ogres are hulking giants notorious for their quick tempers. When its rage is incited, an ogre lashes out in a frustrated tantrum until it runs out of objects or creatures to smash.",
        tags = "darkvision",
        source = "Monster Manual (SRD)"
    )
)

val oni = registerGiantStatBlock(
    StatBlock(
        name = "Oni",
        size = "Large",
        type = "giant",
        alignment = "lawful evil",
        armorClass = "16 (chain mail)",
        hitPoints = "110 (13d10 + 39)",
        speed = "30 ft., fly 30 ft.",
        str = 19, strMod = "+4",
        dex = 11, dexMod = "+0",
        con = 16, conMod = "+3",
        int = 14, intMod = "+2",
        wis = 12, wisMod = "+1",
        cha = 15, chaMod = "+2",
        skills = "Arcana +5, Deception +8, Perception +4",
        savingThrows = "Dex +3, Con +6, Wis +4, Cha +5",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 14",
        languages = "Common, Giant",
        challengeRating = "7",
        expValue = "2900 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Innate Spellcasting. The oni's innate spellcasting ability is Charisma (spell save DC 13). The oni can innately cast the following spells, requiring no material components:\n" +
                    "At will: darkness, invisibility\n" +
                    "1/day each: charm person, cone of cold, gaseous form, sleep",
            "Magic Weapons. The oni's weapon attacks are magical.",
            "Regeneration. The oni regains 10 hit points at the start of its turn if it has at least 1 hit point."
        ),
        actions = listOf(
            "Multiattack. The oni makes two attacks, either with its claws or its glaive.",
            "Claw (Oni Form Only). Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 8 (1d8 + 4) slashing damage.",
            "Glaive. Melee Weapon Attack: +7 to hit, reach 10 ft., one target. Hit: 15 (2d10 + 4) slashing damage, or 9 (1d10 + 4) slashing damage in Small or Medium form.",
            "Change Shape. The oni magically polymorphs into a Small or Medium humanoid, into a Large giant, or back into its true form. Other than its size, its statistics are the same in each form. The only equipment that is transformed is its glaive, which shrinks so that it can be wielded in humanoid form. If the oni dies, it reverts to its true form, and its glaive reverts to its normal size."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, darkvision, regeneration, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val stoneGiant = registerGiantStatBlock(
    StatBlock(
        name = "Stone Giant",
        size = "Huge",
        type = "giant",
        alignment = "neutral",
        armorClass = "17 (natural armor)",
        hitPoints = "126 (11d12 + 55)",
        speed = "40 ft.",
        str = 23, strMod = "+6",
        dex = 15, dexMod = "+2",
        con = 20, conMod = "+5",
        int = 10, intMod = "+0",
        wis = 12, wisMod = "+1",
        cha = 9, chaMod = "-1",
        skills = "Athletics +12, Perception +4",
        savingThrows = "Dex +5, Con +8, Wis +4",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 14",
        languages = "Giant",
        challengeRating = "7",
        expValue = "2900 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Stone Camouflage. The giant has advantage on Dexterity (Stealth) checks made to hide in rocky terrain."
        ),
        actions = listOf(
            "Multiattack. The giant makes two greatclub attacks.",
            "Greatclub. Melee Weapon Attack: +9 to hit, reach 15 ft., one target. Hit: 19 (3d8 + 6) bludgeoning damage.",
            "Rock. Ranged Weapon Attack: +9 to hit, range 60/240 ft., one target. Hit: 28 (4d10 + 6) bludgeoning damage. If the target is a creature, it must succeed on a DC 17 Strength saving throw or be knocked prone."
        ),
        bonusActions = listOf(),
        reactions = listOf(
            "Rock Catching. If a rock or similar object is hurled at the giant, the giant can, with a successful DC 10 Dexterity saving throw, catch the missile and take no bludgeoning damage from it."
        ),
        legendaryActions = listOf(),
        description = "Stone giants are reclusive, quiet, and peaceful as long as they are left alone.",
        tags = "darkvision, multiattack, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val stormGiant = registerGiantStatBlock(
    StatBlock(
        name = "Storm Giant",
        size = "Huge",
        type = "giant",
        alignment = "chaotic good",
        armorClass = "16 (scale mail)",
        hitPoints = "230 (20d12 + 100)",
        speed = "50 ft., swim 50 ft.",
        str = 29, strMod = "+9",
        dex = 14, dexMod = "+2",
        con = 20, conMod = "+5",
        int = 16, intMod = "+3",
        wis = 18, wisMod = "+4",
        cha = 18, chaMod = "+4",
        skills = "Arcana +8, Athletics +14, History +8, Perception +9",
        savingThrows = "Str +14, Con +10, Wis +9, Cha +9",
        vulnerabilities = null,
        damageResistances = "cold",
        damageImmunities = "lightning, thunder",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 19",
        languages = "Common, Giant",
        challengeRating = "13",
        expValue = "10000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The giant can breathe air and water.",
            "Innate Spellcasting. The giant's innate spellcasting ability is Charisma (spell save DC 17). It can innately cast the following spells, requiring no material components:\n" +
                    "At will: detect magic, feather fall, levitate, light\n" +
                    "3/day each: control weather, water breathing"
        ),
        actions = listOf(
            "Multiattack. The giant makes two greatsword attacks.",
            "Greatsword. Melee Weapon Attack: +14 to hit, reach 10 ft., one target. Hit: 30 (6d6 + 9) slashing damage.",
            "Rock. Ranged Weapon Attack: +14 to hit, range 60/240 ft., one target. Hit: 35 (4d12 + 9) bludgeoning damage.",
            "Lightning Strike (Recharge 5-6). The giant hurls a magical lightning bolt at a point it can see within 500 feet of it. Each creature within 10 feet of that point must make a DC 17 Dexterity saving throw, taking 54 (12d8) lightning damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Storm giants are contemplative seers that live in places far removed from mortal civilization.",
        tags = "swim speed, damage resistance, damage immunity, amphibious, water breathing, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val troll = registerGiantStatBlock(
    StatBlock(
        name = "Troll",
        size = "Large",
        type = "giant",
        alignment = "chaotic evil",
        armorClass = "15 (natural armor)",
        hitPoints = "84 (8d10 + 40)",
        speed = "30 ft.",
        str = 18, strMod = "+4",
        dex = 13, dexMod = "+1",
        con = 20, conMod = "+5",
        int = 7, intMod = "-2",
        wis = 9, wisMod = "-1",
        cha = 7, chaMod = "-2",
        skills = "Perception +2",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 12",
        languages = "Giant",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Smell. The troll has advantage on Wisdom (Perception) checks that rely on smell.",
            "Regeneration. The troll regains 10 hit points at the start of its turn. If the troll takes acid or fire damage, this trait doesn't function at the start of the troll's next turn. The troll dies only if it starts its turn with 0 hit points and doesn't regenerate."
        ),
        actions = listOf(
            "Multiattack. The troll makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 7 (1d6 + 4) piercing damage.",
            "Claw. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 11 (2d6 + 4) slashing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Fearsome green-skinned giants, trolls eat anything they can catch and devour. Only acid and fire can arrest the regenerative properties of a troll's flesh.",
        tags = "darkvision, keen smell, regeneration, multiattack",
        source = "Monster Manual (SRD)"
    )
)

//Spell effects and Summons

//none