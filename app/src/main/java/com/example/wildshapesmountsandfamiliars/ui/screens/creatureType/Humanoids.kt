package com.example.wildshapesmountsandfamiliars.ui.screens.creatureType


import androidx.compose.runtime.Composable
import com.example.wildshapesmountsandfamiliars.ui.screens.CreatureTypeScreen
import com.example.wildshapesmountsandfamiliars.ui.screens.HumanoidStatBlockSpellEffectOrSummon
import com.example.wildshapesmountsandfamiliars.ui.screens.HumanoidStatBlocks
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.registerHumanoidStatBlock


@Composable
fun Humanoids(
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
        title = "Humanoids",
        statBlocks = HumanoidStatBlocks,
        spellEffectOrSummons = HumanoidStatBlockSpellEffectOrSummon,
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


val acolyte = registerHumanoidStatBlock(
    StatBlock(
        name = "Acolyte",
        size = "Medium",
        type = "humanoid (any race)",
        alignment = "any",
        armorClass = "10",
        hitPoints = "9 (2d8)",
        speed = "30 ft.",
        str = 10, strMod = "+0",
        dex = 10, dexMod = "+0",
        con = 10, conMod = "+0",
        int = 10, intMod = "+0",
        wis = 14, wisMod = "+2",
        cha = 11, chaMod = "+0",
        skills = "Medicine +4, Religion +2",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 12",
        languages = "any one language (usually Common)",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Spellcasting. The acolyte is a 1st-level spellcaster. Its spellcasting ability is Wisdom (spell save DC 12, +4 to hit with spell attacks). The acolyte has the following cleric spells prepared:\n" +
                    "Cantrips (at will): light, sacred flame, thaumaturgy\n" +
                    "1st level (3 slots): bless, cure wounds, sanctuary"
        ),
        actions = listOf(
            "Club. Melee Weapon Attack: +2 to hit, reach 5 ft., one target. Hit: 2 (1d4) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Acolytes are junior members of a clergy, usually answerable to a priest. They perform a variety of functions in a temple and are granted minor spellcasting power by their deities.",
        tags = "none",
        source = "Monster Manual (SRD)"
    )
)

val archmage = registerHumanoidStatBlock(
    StatBlock(
        name = "Archmage",
        size = "Medium",
        type = "humanoid (any race)",
        alignment = "any",
        armorClass = "12 (15 with mage armor)",
        hitPoints = "99 (18d8 + 18)",
        speed = "30 ft.",
        str = 10, strMod = "+0",
        dex = 14, dexMod = "+2",
        con = 12, conMod = "+1",
        int = 20, intMod = "+5",
        wis = 15, wisMod = "+2",
        cha = 16, chaMod = "+3",
        skills = "Arcana +13, History +13",
        savingThrows = "Int +9, Wis +6",
        vulnerabilities = null,
        damageResistances = "damage from spells; nonmagical bludgeoning, piercing, and slashing (from stoneskin)",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 12",
        languages = "any six languages",
        challengeRating = "12",
        expValue = "8400 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Magic Resistance. The archmage has advantage on saving throws against spells and other magical effects.",
            "Spellcasting. The archmage is an 18th-level spellcaster. Its spellcasting ability is Intelligence (spell save DC 17, +9 to hit with spell attacks). The archmage can cast disguise self and invisibility at will and has the following wizard spells prepared:\n" +
                    "Cantrips (at will): fire bolt, light, mage hand, prestidigitation, shocking grasp\n" +
                    "1st level (4 slots): detect magic, identify, mage armor*, magic missile\n" +
                    "2nd level (3 slots): detect thoughts, mirror image, misty step\n" +
                    "3rd level (3 slots): counterspell, fly, lightning bolt\n" +
                    "4th level (3 slots): banishment, fire shield, stoneskin*\n" +
                    "5th level (3 slots): cone of cold, scrying, wall of force\n" +
                    "6th level (1 slot): globe of invulnerability\n" +
                    "7th level (1 slot): teleport\n" +
                    "8th level (1 slot): mind blank*\n" +
                    "9th level (1 slot): time stop\n" +
                    "* The archmage casts these spells on itself before combat."
        ),
        actions = listOf(
            "Dagger. Melee or Ranged Weapon Attack: +6 to hit, reach 5 ft. or range 20/60 ft., one target. Hit: 4 (1d4 + 2) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Archmages are powerful (and usually quite old) spellcasters dedicated to the study of the arcane arts. Benevolent ones counsel kings and queens, while evil ones rule as tyrants and pursue lichdom. Those who are neither good nor evil sequester themselves in remote towers to practice their magic without interruption.\n" +
                "An archmage typically has one or more apprentice mages, and an archmage's abode has numerous magical wards and guardians to discourage interlopers.",
        tags = "damage resistance, magic resistanec",
        source = "Monster Manual (SRD)"
    )
)

val assassin = registerHumanoidStatBlock(
    StatBlock(
        name = "Assassin",
        size = "Medium",
        type = "humanoid (any race)",
        alignment = "any non-good",
        armorClass = "15 (studded leather)",
        hitPoints = "78 (12d8 + 24)",
        speed = "30 ft.",
        str = 11, strMod = "+0",
        dex = 16, dexMod = "+3",
        con = 14, conMod = "+2",
        int = 13, intMod = "+1",
        wis = 11, wisMod = "+0",
        cha = 10, chaMod = "+0",
        skills = "Acrobatics +6, Deception +3, Perception +3, Stealth +9",
        savingThrows = "Dex +6, Int +4",
        vulnerabilities = null,
        damageResistances = "poison",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "Thieves' cant plus any two languages",
        challengeRating = "8",
        expValue = "3900 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Assassinate. During its first turn, the assassin has advantage on attack rolls against any creature that hasn't taken a turn. Any hit the assassin scores against a surprised creature is a critical hit.",
            "Evasion. If the assassin is subjected to an effect that allows it to make a Dexterity saving throw to take only half damage, the assassin instead takes no damage if it succeeds on the saving throw, and only half damage if it fails.",
            "Sneak Attack. Once per turn, the assassin deals an extra 14 (4d6) damage when it hits a target with a weapon attack and has advantage on the attack roll, or when the target is within 5 feet of an ally of the assassin that isn't incapacitated and the assassin doesn't have disadvantage on the attack roll."
        ),
        actions = listOf(
            "Multiattack. The assassin makes two shortsword attacks.",
            "Shortsword. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 6 (1d6 + 3) piercing damage, and the target must make a DC 15 Constitution saving throw, taking 24 (7d6) poison damage on a failed save, or half as much damage on a successful one.",
            "Light Crossbow. Ranged Weapon Attack: +6 to hit, range 80/320 ft., one target. Hit: 7 (1d8 + 3) piercing damage, and the target must make a DC 15 Constitution saving throw, taking 24 (7d6) poison damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Trained in the use of poison, assassins are remorseless killers who work for nobles, guildmasters, sovereigns, and anyone else who can afford them.",
        tags = "damage resistance, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val bandit = registerHumanoidStatBlock(
    StatBlock(
        name = "Bandit",
        size = "Medium",
        type = "humanoid (any race)",
        alignment = "any non-lawful",
        armorClass = "12 (leather armor)",
        hitPoints = "11 (2d8 + 2)",
        speed = "30 ft.",
        str = 11, strMod = "+0",
        dex = 12, dexMod = "+1",
        con = 12, conMod = "+1",
        int = 10, intMod = "+0",
        wis = 10, wisMod = "+0",
        cha = 10, chaMod = "+0",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "any one language (usually Common)",
        challengeRating = "1/8",
        expValue = "25 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Scimitar. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 4 (1d6 + 1) slashing damage.",
            "Light Crossbow. Ranged Weapon Attack: +3 to hit, range 80 ft./320 ft., one target. Hit: 5 (1d8 + 1) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Bandits rove in gangs and are sometimes led by thugs, veterans, or spellcasters. Not all bandits are evil. Oppression, drought, disease, or famine can often drive otherwise honest folk to a life of banditry.\nPirates are bandits of the high seas. They might be freebooters interested only in treasure and murder, or they might be privateers sanctioned by the crown to attack and plunder an enemy nation's vessels.",
        tags = "none",
        source = "Monster Manual (SRD)"
    )
)

val banditCaptain = registerHumanoidStatBlock(
    StatBlock(
        name = "Bandit Captain",
        size = "Medium",
        type = "humanoid (any race)",
        alignment = "any non-lawful",
        armorClass = "15 (studded leather)",
        hitPoints = "65 (10d8 + 20)",
        speed = "30 ft.",
        str = 15, strMod = "+2",
        dex = 16, dexMod = "+3",
        con = 14, conMod = "+2",
        int = 14, intMod = "+2",
        wis = 11, wisMod = "+0",
        cha = 14, chaMod = "+2",
        skills = "Athletics +4, Deception +4",
        savingThrows = "Str +4, Dex +5, Wis +2",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "any two languages",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Parry. The captain adds 2 to its AC against one melee attack that would hit it. To do so, the captain must see the attacker and be wielding a melee weapon."
        ),
        actions = listOf(
            "Multiattack. The captain makes three melee attacks: two with its scimitar and one with its dagger. Or the captain makes two ranged attacks with its daggers.",
            "Scimitar. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 6 (1d6 + 3) slashing damage.",
            "Dagger. Melee or Ranged Weapon Attack: +5 to hit, reach 5 ft. or range 20/60 ft., one target. Hit: 5 (1d4 + 3) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "It takes a strong personality, ruthless cunning, and a silver tongue to keep a gang of bandits in line. The bandit captain has these qualities in spades.\nIn addition to managing a crew of selfish malcontents, the pirate captain is a variation of the bandit captain, with a ship to protect and command. To keep the crew in line, the captain must mete out rewards and punishment on a regular basis.\nMore than treasure, a bandit captain or pirate captain craves infamy. A prisoner who appeals to the captain's vanity or ego is more likely to be treated fairly than a prisoner who does not or claims not to know anything of the captain's colorful reputation.",
        tags = "multiattack",
        source = "Monster Manual (SRD)"
    )
)

val berserker = registerHumanoidStatBlock(
    StatBlock(
        name = "Berserker",
        size = "Medium",
        type = "humanoid (any race)",
        alignment = "any chaotic",
        armorClass = "13 (hide armor)",
        hitPoints = "67 (9d8 + 27)",
        speed = "30 ft.",
        str = 16, strMod = "+3",
        dex = 12, dexMod = "+1",
        con = 17, conMod = "+3",
        int = 9, intMod = "-1",
        wis = 11, wisMod = "+0",
        cha = 9, chaMod = "-1",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "any one language (usually Common)",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Reckless. At the start of its turn, the berserker can gain advantage on all melee weapon attack rolls during that turn, but attack rolls against it have advantage until the start of its next turn."
        ),
        actions = listOf(
            "Greataxe. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 9 (1d12 + 3) slashing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Hailing from uncivilized lands, unpredictable berserkers come together in war parties and seek conflict wherever they can find it.",
        tags = "none",
        source = "Monster Manual (SRD)"
    )
)

val bugbear = registerHumanoidStatBlock(
    StatBlock(
        name = "Bugbear",
        size = "Medium",
        type = "humanoid (Goblinoid)",
        alignment = "chaotic evil",
        armorClass = "16 (hide armor, shield)",
        hitPoints = "27 (5d8 + 5)",
        speed = "30 ft.",
        str = 15, strMod = "+2",
        dex = 14, dexMod = "+2",
        con = 13, conMod = "+1",
        int = 8, intMod = "-1",
        wis = 11, wisMod = "+0",
        cha = 9, chaMod = "-1",
        skills = "Stealth +6, Survival +2",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "Common, Goblin",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Brute. A melee weapon deals one extra die of its damage when the bugbear hits with it (included in the attack).",
            "Surprise Attack. If the bugbear surprises a creature and hits it with an attack during the first round of combat, the target takes an extra 7 (2d6) damage from the attack."
        ),
        actions = listOf(
            "Morningstar. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 11 (2d8 + 2) piercing damage.",
            "Javelin. Melee or Ranged Weapon Attack: +4 to hit, reach 5 ft. or range 30/120 ft., one target. Hit: 9 (2d6 + 2) piercing damage in melee or 5 (1d6 + 2) piercing damage at range."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Bugbears are hairy goblinoids born for battle and mayhem. They survive by raiding and hunting, but are fond of setting ambushes and fleeing when outmatched.",
        tags = "darkvision",
        source = "Monster Manual (SRD)"
    )
)

val commoner = registerHumanoidStatBlock(
    StatBlock(
        name = "Commoner",
        size = "Medium",
        type = "humanoid (any race)",
        alignment = "any alignment",
        armorClass = "10",
        hitPoints = "4 (1d8)",
        speed = "30 ft.",
        str = 10, strMod = "+0",
        dex = 10, dexMod = "+0",
        con = 10, conMod = "+0",
        int = 10, intMod = "+0",
        wis = 10, wisMod = "+0",
        cha = 10, chaMod = "+0",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "any one language (usually Common)",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Club. Melee Weapon Attack: +2 to hit, reach 5 ft., one target. Hit: 2 (1d4) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Commoners include peasants, serfs, slaves, servants, pilgrims, merchants, artisans, and hermits.",
        tags = "none",
        source = "Monster Manual (SRD)"
    )
)

val cultFanatic = registerHumanoidStatBlock(
    StatBlock(
        name = "Cult Fanatic",
        size = "Medium",
        type = "humanoid (any race)",
        alignment = "any non-good alignment",
        armorClass = "13 (leather armor)",
        hitPoints = "33 (6d8 + 6)",
        speed = "30 ft.",
        str = 11, strMod = "+0",
        dex = 14, dexMod = "+2",
        con = 12, conMod = "+1",
        int = 10, intMod = "+0",
        wis = 13, wisMod = "+1",
        cha = 14, chaMod = "+2",
        skills = "Deception +4, Persuasion +4, Religion +2",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 11",
        languages = "any one language (usually Common)",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Dark Devotion. The fanatic has advantage on saving throws against being charmed or frightened.",
            "Spellcasting. The fanatic is a 4th-level spellcaster. Its spellcasting ability is Wisdom (spell save DC 11, +3 to hit with spell attacks). The fanatic has the following cleric spells prepared:\n" +
                    "Cantrips (at will): light, sacred flame, thaumaturgy\n" +
                    "1st level (4 slots): command, inflict wounds, shield of faith\n" +
                    "2nd level (3 slots): hold person, spiritual weapon"
        ),
        actions = listOf(
            "Multiattack. The fanatic makes two melee attacks.",
            "Dagger. Melee or Ranged Weapon Attack: +4 to hit, reach 5 ft. or range 20/60 ft., one creature. Hit: 4 (1d4 + 2) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Fanatics are often part of a cult's leadership, using their charisma and dogma to influence and prey on those of weak will. Most are interested in personal power above all else.",
        tags = "condition resistance, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val cultist = registerHumanoidStatBlock(
    StatBlock(
        name = "Cultist",
        size = "Medium",
        type = "humanoid (any race)",
        alignment = "any non-good alignment",
        armorClass = "12 (leather armor)",
        hitPoints = "9 (2d8)",
        speed = "30 ft.",
        str = 11, strMod = "+0",
        dex = 12, dexMod = "+1",
        con = 10, conMod = "+0",
        int = 10, intMod = "+0",
        wis = 11, wisMod = "+0",
        cha = 10, chaMod = "+0",
        skills = "Deception +2, Religion +2",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "any one language (usually Common)",
        challengeRating = "1/8",
        expValue = "25 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Dark Devotion. The cultist has advantage on saving throws against being charmed or frightened."
        ),
        actions = listOf(
            "Scimitar. Melee Weapon Attack: +3 to hit, reach 5 ft., one creature. Hit: 4 (1d6 + 1) slashing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Cultists swear allegiance to dark powers such as elemental princes, demon lords, or archdevils. Most conceal their loyalties to avoid being ostracized, imprisoned, or executed for their beliefs. Unlike evil acolytes, cultists often show signs of insanity in their beliefs and practices.",
        tags = "condition resistance",
        source = "Monster Manual (SRD)"
    )
)

val deepGnome = registerHumanoidStatBlock(
    StatBlock(
        name = "Deep Gnome (Svirfneblin)",
        size = "Small",
        type = "humanoid (Gnome)",
        alignment = "neutral good",
        armorClass = "15 (chain shirt)",
        hitPoints = "16 (3d6 + 6)",
        speed = "20 ft.",
        str = 15, strMod = "+2",
        dex = 14, dexMod = "+2",
        con = 14, conMod = "+2",
        int = 12, intMod = "+1",
        wis = 10, wisMod = "+0",
        cha = 9, chaMod = "-1",
        skills = "Investigation +3, Perception +2, Stealth +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 12",
        languages = "Gnomish, Terran, Undercommon",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Stone Camouflage. The gnome has advantage on Dexterity (Stealth) checks made to hide in rocky terrain.",
            "Gnome Cunning. The gnome has advantage on Intelligence, Wisdom, and Charisma saving throws against magic.",
            "Innate Spellcasting. The gnome's innate spellcasting ability is Intelligence (spell save DC 11). It can innately cast the following spells, requiring no material components:\n" +
                    "At will: nondetection (self only)\n" +
                    "1/day each: blindness/deafness, blur, disguise self"
        ),
        actions = listOf(
            "War Pick. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 6 (1d8 + 2) piercing damage.",
            "Poisoned Dart. Ranged Weapon Attack: +4 to hit, range 30/120 ft., one creature. Hit: 4 (1d4 + 2) piercing damage, and the target must succeed on a DC 12 Constitution saving throw or be poisoned for 1 minute. The target can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "darkvision, cc - poisoned",
        source = "Monster Manual (SRD)"
    )
)

val drow = registerHumanoidStatBlock(
    StatBlock(
        name = "Drow",
        size = "Medium",
        type = "humanoid (Elf)",
        alignment = "neutral evil",
        armorClass = "15 (chain shirt)",
        hitPoints = "13 (3d8)",
        speed = "30 ft.",
        str = 10, strMod = "+0",
        dex = 14, dexMod = "+2",
        con = 10, conMod = "+0",
        int = 11, intMod = "+0",
        wis = 11, wisMod = "+0",
        cha = 12, chaMod = "+1",
        skills = "Perception +2, Stealth +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 12",
        languages = "Elvish, Undercommon",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Fey Ancestry. The drow has advantage on saving throws against being charmed, and magic can't put the drow to sleep.",
            "Innate Spellcasting. The drow's spellcasting ability is Charisma (spell save DC 11). It can innately cast the following spells, requiring no material components:\n" +
                    "At will: dancing lights\n" +
                    "1/day each: darkness, faerie fire",
            "Sunlight Sensitivity. While in sunlight, the drow has disadvantage on attack rolls, as well as on Wisdom (Perception) checks that rely on sight."
        ),
        actions = listOf(
            "Shortsword. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 5 (1d6 + 2) piercing damage.",
            "Hand Crossbow. Ranged Weapon Attack: +4 to hit, range 30/120 ft., one target. Hit: 5 (1d6 + 2) piercing damage, and the target must succeed on a DC 13 Constitution saving throw or be poisoned for 1 hour. If the saving throw fails by 5 or more, the target is also unconscious while poisoned in this way. The target wakes up if it takes damage or if another creature takes an action to shake it awake."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "darkvision, condition resistance, condition immunity, cc - poisoned",
        source = "Monster Manual (SRD)"
    )
)

val druid = registerHumanoidStatBlock(
    StatBlock(
        name = "Druid",
        size = "Medium",
        type = "humanoid (any race)",
        alignment = "any alignment",
        armorClass = "11 (16 with barkskin)",
        hitPoints = "27 (5d8 + 5)",
        speed = "30 ft.",
        str = 10, strMod = "+0",
        dex = 12, dexMod = "+1",
        con = 13, conMod = "+1",
        int = 12, intMod = "+1",
        wis = 15, wisMod = "+2",
        cha = 11, chaMod = "+0",
        skills = "Medicine +4, Nature +3, Perception +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 14",
        languages = "Druidic plus any two languages",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Spellcasting. The druid is a 4th-level spellcaster. Its spellcasting ability is Wisdom (spell save DC 12, +4 to hit with spell attacks). It has the following druid spells prepared:\n" +
                    "Cantrips (at will): druidcraft, produce flame, shillelagh\n" +
                    "1st level (4 slots): entangle, longstrider, speak with animals, thunderwave\n" +
                    "2nd level (3 slots): animal messenger, barkskin"
        ),
        actions = listOf(
            "Quarterstaff. Melee Weapon Attack: +2 to hit (+4 to hit with shillelagh), reach 5 ft., one target. Hit: 3 (1d6) bludgeoning damage, 4 (1d8) bludgeoning damage if wielded with two hands, or 6 (1d8 + 2) bludgeoning damage with shillelagh."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Druids dwell in forests and other secluded wilderness locations, where they protect the natural world from monsters and the encroachment of civilization. Some are tribal shamans who heal the sick, pray to animal spirits, and provide spiritual guidance.",
        tags = "none",
        source = "Monster Manual (SRD)"
    )
)

val duergar = registerHumanoidStatBlock(
    StatBlock(
        name = "Duergar",
        size = "Medium",
        type = "humanoid (Dwarf)",
        alignment = "lawful evil",
        armorClass = "16 (scale mail, shield)",
        hitPoints = "26 (4d8 + 8)",
        speed = "25 ft.",
        str = 14, strMod = "+2",
        dex = 11, dexMod = "+0",
        con = 14, conMod = "+2",
        int = 11, intMod = "+0",
        wis = 10, wisMod = "+0",
        cha = 9, chaMod = "-1",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "poison",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 10",
        languages = "Dwarvish, Undercommon",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Duergar Resilience. The duergar has advantage on saving throws against poison, spells, and illusions, as well as to resist being charmed or paralyzed.",
            "Sunlight Sensitivity. While in sunlight, the duergar has disadvantage on attack rolls, as well as on Wisdom (Perception) checks that rely on sight."
        ),
        actions = listOf(
            "Enlarge (Recharges after a Short or Long Rest). For 1 minute, the duergar magically increases in size, along with anything it is wearing or carrying. While enlarged, the duergar is Large, doubles its damage dice on Strength-based weapon attacks (included in the attacks), and makes Strength checks and Strength saving throws with advantage. If the duergar lacks the room to become Large, it attains the maximum size possible in the space available.",
            "War Pick. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 6 (1d8 + 2) piercing damage, or 11 (2d8 + 2) piercing damage while enlarged.",
            "Javelin. Melee or Ranged Weapon Attack: +4 to hit, reach 5 ft. or range 30/120 ft., one target. Hit: 5 (1d6 + 2) piercing damage, or 9 (2d6 + 2) piercing damage while enlarged.",
            "Invisibility (Recharges after a Short or Long Rest). The duergar magically turns invisible until it attacks, casts a spell, or uses its Enlarge, or until its concentration is broken, up to 1 hour (as if concentrating on a spell). Any equipment the duergar wears or carries is invisible with it."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "The tyrannical duergar, also known as gray dwarves, dwell in fantastic cities deep in the Underdark. Using ancient dwarven knowledge and myriad slaves, they work tirelessly to expand their subterranean kingdoms.",
        tags = "damage resistance, darkvision, magic resistance, condition resistance",
        source = "Monster Manual (SRD)"
    )
)

val gladiator = registerHumanoidStatBlock(
    StatBlock(
        name = "Gladiator",
        size = "Medium",
        type = "humanoid (any race)",
        alignment = "any alignment",
        armorClass = "16 (studded leather, shield)",
        hitPoints = "112 (15d8 + 45)",
        speed = "30 ft.",
        str = 18, strMod = "+4",
        dex = 15, dexMod = "+2",
        con = 16, conMod = "+3",
        int = 10, intMod = "+0",
        wis = 12, wisMod = "+1",
        cha = 15, chaMod = "+2",
        skills = "Athletics +10, Intimidation +5",
        savingThrows = "Str +7, Dex +5, Con +6",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 11",
        languages = "any one language (usually Common)",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Brave. The gladiator has advantage on saving throws against being frightened.",
            "Brute. A melee weapon deals one extra die of its damage when the gladiator hits with it (included in the attack)."
        ),
        actions = listOf(
            "Multiattack. The gladiator makes three melee attacks or two ranged attacks.",
            "Spear. Melee or Ranged Weapon Attack: +7 to hit, reach 5 ft. and range 20/60 ft., one target. Hit: 11 (2d6 + 4) piercing damage, or 13 (2d8 + 4) piercing damage if used with two hands to make a melee attack.",
            "Shield Bash. Melee Weapon Attack: +7 to hit, reach 5 ft., one creature. Hit: 9 (2d4 + 4) bludgeoning damage. If the target is a Medium or smaller creature, it must succeed on a DC 15 Strength saving throw or be knocked prone."
        ),
        bonusActions = listOf(),
        reactions = listOf(
            "Parry. The gladiator adds 3 to its AC against one melee attack that would hit it. To do so, the gladiator must see the attacker and be wielding a melee weapon."
        ),
        legendaryActions = listOf(),
        description = "Gladiators battle for the entertainment of raucous crowds. Some gladiators are brutal pit fighters who treat each match as a life-or-death struggle, while others are professional duelists who command huge fees but rarely fight to the death.",
        tags = "condition resistance, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val gnoll = registerHumanoidStatBlock(
    StatBlock(
        name = "Gnoll",
        size = "Medium",
        type = "humanoid (Gnoll)",
        alignment = "chaotic evil",
        armorClass = "15 (hide armor, shield)",
        hitPoints = "22 (5d8)",
        speed = "30 ft.",
        str = 14, strMod = "+2",
        dex = 12, dexMod = "+1",
        con = 11, conMod = "+0",
        int = 6, intMod = "-2",
        wis = 10, wisMod = "+0",
        cha = 7, chaMod = "-2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "Gnoll",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Rampage. When the gnoll reduces a creature to 0 hit points with a melee attack on its turn, the gnoll can take a bonus action to move up to half its speed and make a bite attack."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one creature. Hit: 4 (1d4 + 2) piercing damage.",
            "Spear. Melee or Ranged Weapon Attack: +4 to hit, reach 5 ft. or range 20/60 ft., one target. Hit: 5 (1d6 + 2) piercing damage, or 6 (1d8 + 2) piercing damage if used with two hands to make a melee attack.",
            "Longbow. Ranged Weapon Attack: +3 to hit, range 150/600 ft., one target. Hit: 5 (1d8 + 1) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Gnolls are feral, hyena-headed humanoids that attack without warning, slaughtering their victims and devouring their flesh.",
        tags = "darkvision",
        source = "Monster Manual (SRD)"
    )
)

val goblin = registerHumanoidStatBlock(
    StatBlock(
        name = "Goblin",
        size = "Small",
        type = "humanoid (Goblinoid)",
        alignment = "neutral evil",
        armorClass = "15 (leather armor, shield)",
        hitPoints = "7 (2d6)",
        speed = "30 ft.",
        str = 8, strMod = "-1",
        dex = 14, dexMod = "+2",
        con = 10, conMod = "+0",
        int = 10, intMod = "+0",
        wis = 8, wisMod = "-1",
        cha = 8, chaMod = "-1",
        skills = "Stealth +6",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 9",
        languages = "Common, Goblin",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Nimble Escape. The goblin can take the Disengage or Hide action as a bonus action on each of its turns."
        ),
        actions = listOf(
            "Scimitar. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 5 (1d6 + 2) slashing damage.",
            "Shortbow. Ranged Weapon Attack: +4 to hit, range 80/320 ft., one target. Hit: 5 (1d6 + 2) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Goblins are small, black-hearted humanoids that lair in despoiled dungeons and other dismal settings. Individually weak, they gather in large numbers to torment other creatures.",
        tags = "darkvision",
        source = "Monster Manual (SRD)"
    )
)

val grimlock = registerHumanoidStatBlock(
    StatBlock(
        name = "Grimlock",
        size = "Medium",
        type = "humanoid (Grimlock)",
        alignment = "neutral evil",
        armorClass = "11",
        hitPoints = "11 (2d8 + 2)",
        speed = "30 ft.",
        str = 16, strMod = "+3",
        dex = 12, dexMod = "+1",
        con = 12, conMod = "+1",
        int = 9, intMod = "-1",
        wis = 8, wisMod = "-1",
        cha = 6, chaMod = "-2",
        skills = "Athletics +5, Perception +3, Stealth +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = "blinded",
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 30 ft. or 10 ft. while deafened (blind beyond this radius), passive Perception 13",
        languages = "Undercommon",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Blind Senses. The grimlock can't use its blindsight while deafened and unable to smell.",
            "Keen Hearing and Smell. The grimlock has advantage on Wisdom (Perception) checks that rely on hearing or smell.",
            "Stone Camouflage. The grimlock has advantage on Dexterity (Stealth) checks made to hide in rocky terrain."
        ),
        actions = listOf(
            "Spiked Bone Club. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 5 (1d4 + 3) bludgeoning damage plus 2 (1d4) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "condition immunity, blindsight, keen hearing, keen smell",
        source = "Monster Manual (SRD)"
    )
)

val guard = registerHumanoidStatBlock(
    StatBlock(
        name = "Guard",
        size = "Medium",
        type = "humanoid (any race)",
        alignment = "any alignment",
        armorClass = "16 (chain shirt, shield)",
        hitPoints = "11 (2d8 + 2)",
        speed = "30 ft.",
        str = 13, strMod = "+1",
        dex = 12, dexMod = "+1",
        con = 12, conMod = "+1",
        int = 10, intMod = "+0",
        wis = 11, wisMod = "+0",
        cha = 10, chaMod = "+0",
        skills = "Perception +2",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 12",
        languages = "any one language (usually Common)",
        challengeRating = "1/8",
        expValue = "25 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Spear. Melee or Ranged Weapon Attack: +3 to hit, reach 5 ft. or range 20/60 ft., one target. Hit: 4 (1d6 + 1) piercing damage, or 5 (1d8 + 1) piercing damage if used with two hands to make a melee attack."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Guards include members of a city watch, sentries in a citadel or fortified town, and the bodyguards of merchants and nobles.",
        tags = "none",
        source = "Monster Manual (SRD)"
    )
)
val halfRedDragonVeteran = registerHumanoidStatBlock(
    StatBlock(
        name = "Half-Red Dragon Veteran",
        size = "Medium",
        type = "humanoid (Human)",
        alignment = "any alignment",
        armorClass = "18 (plate)",
        hitPoints = "65 (10d8 + 20)",
        speed = "30 ft.",
        str = 16, strMod = "+3",
        dex = 13, dexMod = "+1",
        con = 14, conMod = "+2",
        int = 10, intMod = "+0",
        wis = 11, wisMod = "+0",
        cha = 10, chaMod = "+0",
        skills = "Athletics +5, Perception +2",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "fire",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 10 ft., darkvision 60 ft., passive Perception 12",
        languages = "Common, Draconic",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Multiattack. The veteran makes two longsword attacks. If it has a shortsword drawn, it can also make a shortsword attack.",
            "Longsword. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 7 (1d8 + 3) slashing damage, or 8 (1d10 + 3) slashing damage if used with two hands.",
            "Shortsword. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 6 (1d6 + 3) piercing damage.",
            "Heavy Crossbow. Ranged Weapon Attack: +3 to hit, range 100/400 ft., one target. Hit: 6 (1d10 + 1) piercing damage.",
            "Fire Breath (Recharge 5-6). The veteran exhales fire in a 15-foot cone. Each creature in that area must make a DC 15 Dexterity saving throw, taking 24 (7d6) fire damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage resistance, blindsight, darkvision, multiattack",
        source = "Monster Manual (SRD)"
    )
)

// TODO: Half-Dragon Template
//A	beast,	humanoid,	giant,	or	monstrosity	can	become
//a	half-dragon.	It	keeps	its	statistics,	except	as	follows.
//Challenge. To	avoid	recalculating	the	creature’s
//challenge	rating,	apply	the	template	only	to	a
//creature	that	meets	the	optional	prerequisite	in	the
//Breath	Weapon	table	below.	Otherwise,	recalculate
//the	rating	after	you	apply	the	template.
//Senses. The	half-dragon	gains	blindsight	with	a
//radius	of	10	feet	and	darkvision	with	a	radius	of	60
//feet.
//Resistances. The	half-dragon	gains	resistance	to	a
//type	of	damage	based	on	its	color.
//Color Damage	Resistance
//Black	or	copper Acid
//Blue	or	bronze Lightning
//System	Reference	Document	5.1 321
//Brass,	gold,	or	red Fire
//Green Poison
//Silver	or	white Cold
//Languages. The	half-dragon	speaks	Draconic	in
//addition	to	any	other	languages	it	knows.
//New	Action:	Breath	Weapon. The	half-dragon	has
//the	breath	weapon	of	its	dragon	half.	The	half￾dragon’s	size	determines	how	this	action	functions.
//Size Breath	Weapon
//Optional
//Prerequisite
//Large	or
//smaller
//As	a	wyrmling Challenge	2	or	higher
//Huge As	a	young	dragon Challenge	7	or	higher
//Gargantuan As	an	adult	dragon Challenge	8	or	higher

val hobgoblin = registerHumanoidStatBlock(
    StatBlock(
        name = "Hobgoblin",
        size = "Medium",
        type = "humanoid (Goblinoid)",
        alignment = "lawful evil",
        armorClass = "18 (chain mail, shield)",
        hitPoints = "11 (2d8 + 2)",
        speed = "30 ft.",
        str = 13, strMod = "+1",
        dex = 12, dexMod = "+1",
        con = 12, conMod = "+1",
        int = 10, intMod = "+0",
        wis = 10, wisMod = "+0",
        cha = 9, chaMod = "-1",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "Common, Goblin",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Martial Advantage. Once per turn, the hobgoblin can deal an extra 7 (2d6) damage to a creature it hits with a weapon attack if that creature is within 5 feet of an ally of the hobgoblin that isn't incapacitated."
        ),
        actions = listOf(
            "Longsword. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 5 (1d8 + 1) slashing damage, or 6 (1d10 + 1) slashing damage if used with two hands.",
            "Longbow. Ranged Weapon Attack: +3 to hit, range 150/600 ft., one target. Hit: 5 (1d8 + 1) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Hobgoblins are large goblinoids with dark-orange or red-orange skin. A hobgoblin measures virtue by physical strength and martial prowess, caring about nothing except skill and cunning in battle.",
        tags = "darkvision",
        source = "Monster Manual (SRD)"
    )
)

val knight = registerHumanoidStatBlock(
    StatBlock(
        name = "Knight",
        size = "Medium",
        type = "humanoid (any race)",
        alignment = "any alignment",
        armorClass = "18 (plate)",
        hitPoints = "52 (8d8 + 16)",
        speed = "30 ft.",
        str = 16, strMod = "+3",
        dex = 11, dexMod = "+0",
        con = 14, conMod = "+2",
        int = 11, intMod = "+0",
        wis = 11, wisMod = "+0",
        cha = 15, chaMod = "+2",
        skills = null,
        savingThrows = "Con +4, Wis +2",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "any one language (usually Common)",
        challengeRating = "3",
        expValue = "700 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Brave. The knight has advantage on saving throws against being frightened."
        ),
        actions = listOf(
            "Multiattack. The knight makes two melee attacks.",
            "Greatsword. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 10 (2d6 + 3) slashing damage.",
            "Heavy Crossbow. Ranged Weapon Attack: +2 to hit, range 100/400 ft., one target. Hit: 5 (1d10) piercing damage.",
            "Leadership (Recharges after a Short or Long Rest). For 1 minute, the knight can utter a special command or warning whenever a nonhostile creature that it can see within 30 feet of it makes an attack roll or a saving throw. The creature can add a d4 to its roll provided it can hear and understand the knight. A creature can benefit from only one Leadership die at a time. This effect ends if the knight is incapacitated."
        ),
        bonusActions = listOf(),
        reactions = listOf(
            "Parry. The knight adds 2 to its AC against one melee attack that would hit it. To do so, the knight must see the attacker and be wielding a melee weapon."
        ),
        legendaryActions = listOf(),
        description = "Knights are warriors who pledge service to rulers, religious orders, and noble causes. A knight's alignment determines the extent to which a pledge is honored. Whether undertaking a quest or patrolling a realm, a knight often travels with an entourage that includes squires and hirelings who are commoners.",
        tags = "condition resistance, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val kobold = registerHumanoidStatBlock(
    StatBlock(
        name = "Kobold",
        size = "Small",
        type = "humanoid (Kobold)",
        alignment = "lawful evil",
        armorClass = "12",
        hitPoints = "5 (2d6 - 2)",
        speed = "30 ft.",
        str = 7, strMod = "-2",
        dex = 15, dexMod = "+2",
        con = 9, conMod = "-1",
        int = 8, intMod = "-1",
        wis = 7, wisMod = "-2",
        cha = 8, chaMod = "-1",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 8",
        languages = "Common, Draconic",
        challengeRating = "1/8",
        expValue = "25 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Sunlight Sensitivity. While in sunlight, the kobold has disadvantage on attack rolls, as well as on Wisdom (Perception) checks that rely on sight.",
            "Pack Tactics. The kobold has advantage on an attack roll against a creature if at least one of the kobold's allies is within 5 feet of the creature and the ally isn't incapacitated."
        ),
        actions = listOf(
            "Dagger. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 4 (1d4 + 2) piercing damage.",
            "Sling. Ranged Weapon Attack: +4 to hit, range 30/120 ft., one target. Hit: 4 (1d4 + 2) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Kobolds are craven reptilian humanoids that commonly infest dungeons. They make up for their physical ineptitude with a cleverness for trap making.",
        tags = "darkvision, pack tactics",
        source = "Monster Manual (SRD)"
    )
)

val lizardfolk = registerHumanoidStatBlock(
    StatBlock(
        name = "Lizardfolk",
        size = "Medium",
        type = "humanoid (Lizardfolk)",
        alignment = "neutral",
        armorClass = "15 (natural armor, shield)",
        hitPoints = "22 (4d8 + 4)",
        speed = "30 ft., swim 30 ft.",
        str = 15, strMod = "+2",
        dex = 10, dexMod = "+0",
        con = 13, conMod = "+1",
        int = 7, intMod = "-2",
        wis = 12, wisMod = "+1",
        cha = 7, chaMod = "-2",
        skills = "Perception +3, Stealth +4, Survival +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "Draconic",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Hold Breath. The lizardfolk can hold its breath for 15 minutes."
        ),
        actions = listOf(
            "Multiattack. The lizardfolk makes two melee attacks, each one with a different weapon.",
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 5 (1d6 + 2) piercing damage.",
            "Heavy Club. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 5 (1d6 + 2) bludgeoning damage.",
            "Javelin. Melee or Ranged Weapon Attack: +4 to hit, reach 5 ft. or range 30/120 ft., one target. Hit: 5 (1d6 + 2) piercing damage.",
            "Spiked Shield. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 5 (1d6 + 2) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Lizardfolk are primitive reptilian humanoids that lurk in swamps and jungles. Fiercely territorial, they kill when it is expedient and do whatever it takes to survive.",
        tags = "swim speed, hold breath, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val mage = registerHumanoidStatBlock(
    StatBlock(
        name = "Mage",
        size = "Medium",
        type = "humanoid (any race)",
        alignment = "any alignment",
        armorClass = "12 (15 with mage armor)",
        hitPoints = "40 (9d8)",
        speed = "30 ft.",
        str = 9, strMod = "-1",
        dex = 14, dexMod = "+2",
        con = 11, conMod = "+0",
        int = 17, intMod = "+3",
        wis = 12, wisMod = "+1",
        cha = 11, chaMod = "+0",
        skills = "Arcana +6, History +6",
        savingThrows = "Int +6, Wis +4",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 11",
        languages = "any four languages",
        challengeRating = "6",
        expValue = "2300 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Spellcasting. The mage is a 9th-level spellcaster. Its spellcasting ability is Intelligence (spell save DC 14, +6 to hit with spell attacks). The mage has the following wizard spells prepared:\n\nCantrips (at will): fire bolt, light, mage hand, prestidigitation\n1st level (4 slots): detect magic, mage armor, magic missile, shield\n2nd level (3 slots): misty step, suggestion\n3rd level (3 slots): counterspell, fireball, fly\n4th level (3 slots): greater invisibility, ice storm\n5th level (1 slot): cone of cold"
        ),
        actions = listOf(
            "Dagger. Melee or Ranged Weapon Attack: +5 to hit, reach 5 ft. or range 20/60 ft., one target. Hit: 4 (1d4 + 2) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Mages spend their lives in the study and practice of magic. Good-aligned mages offer counsel to nobles and others in power, while evil mages dwell in isolated sites to perform unspeakable experiments without interference.",
        tags = "none",
        source = "Monster Manual (SRD)"
    )
)

val merfolk = registerHumanoidStatBlock(
    StatBlock(
        name = "Merfolk",
        size = "Medium",
        type = "humanoid (Merfolk)",
        alignment = "neutral",
        armorClass = "11",
        hitPoints = "11 (2d8 + 2)",
        speed = "10 ft., swim 40 ft.",
        str = 10, strMod = "+0",
        dex = 13, dexMod = "+1",
        con = 12, conMod = "+1",
        int = 11, intMod = "+0",
        wis = 11, wisMod = "+0",
        cha = 12, chaMod = "+1",
        skills = "Perception +2",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 12",
        languages = "Aquan, Common",
        challengeRating = "1/8",
        expValue = "25 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The merfolk can breathe air and water."
        ),
        actions = listOf(
            "Spear. Melee or Ranged Weapon Attack: +2 to hit, reach 5 ft. or range 20/60 ft., one target. Hit: 3 (1d6) piercing damage, or 4 (1d8) piercing damage if used with two hands to make a melee attack."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Merfolk are aquatic humanoids with the lower body of a fish. They live in small tribes beneath the waves.",
        tags = "swim speed, amphibious, water breathing",
        source = "Monster Manual (SRD)"
    )
)

val noble = registerHumanoidStatBlock(
    StatBlock(
        name = "Noble",
        size = "Medium",
        type = "humanoid (any race)",
        alignment = "any alignment",
        armorClass = "15 (breastplate)",
        hitPoints = "9 (2d8)",
        speed = "30 ft.",
        str = 11, strMod = "+0",
        dex = 12, dexMod = "+1",
        con = 11, conMod = "+0",
        int = 12, intMod = "+1",
        wis = 14, wisMod = "+2",
        cha = 16, chaMod = "+3",
        skills = "Deception +5, Insight +4, Persuasion +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 12",
        languages = "any two languages",
        challengeRating = "1/8",
        expValue = "25 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Rapier. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 5 (1d8 + 1) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(
            "Parry. The noble adds 2 to its AC against one melee attack that would hit it. To do so, the noble must see the attacker and be wielding a melee weapon."
        ),
        legendaryActions = listOf(),
        description = "Nobles wield great authority and influence as members of the upper class, possessing wealth and connections that can make them as powerful as monarchs and generals. A noble often travels in the company of guards, as well as servants who are commoners.\nThe noble's statistics can also be used to represent courtiers who aren't of noble birth.",
        tags = "none",
        source = "Monster Manual (SRD)"
    )
)

val orc = registerHumanoidStatBlock(
    StatBlock(
        name = "Orc",
        size = "Medium",
        type = "humanoid (Orc)",
        alignment = "chaotic evil",
        armorClass = "13 (hide armor)",
        hitPoints = "15 (2d8 + 6)",
        speed = "30 ft.",
        str = 16, strMod = "+3",
        dex = 12, dexMod = "+1",
        con = 16, conMod = "+3",
        int = 7, intMod = "-2",
        wis = 11, wisMod = "+0",
        cha = 10, chaMod = "+0",
        skills = "Intimidation +2",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "Common, Orc",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Aggressive. As a bonus action, the orc can move up to its speed toward a hostile creature that it can see."
        ),
        actions = listOf(
            "Greataxe. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 9 (1d12 + 3) slashing damage.",
            "Javelin. Melee or Ranged Weapon Attack: +5 to hit, reach 5 ft. or range 30/120 ft., one target. Hit: 6 (1d6 + 3) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Orcs are savage humanoids with stooped postures, piggish faces, and prominent teeth that resemble tusks. They gather in tribes that satisfy their bloodlust by slaying any humanoids that stand against them.",
        tags = "darkvision",
        source = "Monster Manual (SRD)"
    )
)

val priest = registerHumanoidStatBlock(
    StatBlock(
        name = "Priest",
        size = "Medium",
        type = "humanoid (any race)",
        alignment = "any alignment",
        armorClass = "13 (chain shirt)",
        hitPoints = "27 (5d8 + 5)",
        speed = "30 ft.",
        str = 10, strMod = "+0",
        dex = 10, dexMod = "+0",
        con = 12, conMod = "+1",
        int = 13, intMod = "+1",
        wis = 16, wisMod = "+3",
        cha = 13, chaMod = "+1",
        skills = "Medicine +7, Persuasion +3, Religion +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "any two languages",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Divine Eminence. As a bonus action, the priest can expend a spell slot to cause its melee weapon attacks to magically deal an extra 10 (3d6) radiant damage to a target on a hit. This benefit lasts until the end of the turn. If the priest expends a spell slot of 2nd level or higher, the extra damage increases by 1d6 for each level above 1st.",
            "Spellcasting. The priest is a 5th-level spellcaster. Its spellcasting ability is Wisdom (spell save DC 13, +5 to hit with spell attacks). The priest has the following cleric spells prepared:\n" +
                    "Cantrips (at will): light, sacred flame, thaumaturgy\n" +
                    "1st level (4 slots): cure wounds, guiding bolt, sanctuary\n" +
                    "2nd level (3 slots): lesser restoration, spiritual weapon\n" +
                    "3rd level (2 slots): dispel magic, spirit guardians"
        ),
        actions = listOf(
            "Mace. Melee Weapon Attack: +2 to hit, reach 5 ft., one target. Hit: 3 (1d6) bludgeoning damage."
        ),
        bonusActions = listOf(
            "Divine Eminence (see trait)."
        ),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Priests bring the teachings of their gods to the common folk. They are the spiritual leaders of temples and shrines and often hold positions of influence in their communities. Evil priests might work openly under a tyrant, or they might be the leaders of religious sects hidden in the shadows of good society, overseeing depraved rites.\n" +
                "A priest typically has one or more acolytes to help with religious ceremonies and other sacred duties.",
        tags = "none",
        source = "Monster Manual (SRD)"
    )
)

val sahuagin = registerHumanoidStatBlock(
    StatBlock(
        name = "Sahuagin",
        size = "Medium",
        type = "humanoid (Sahuagin)",
        alignment = "lawful evil",
        armorClass = "12 (natural armor)",
        hitPoints = "22 (4d8 + 4)",
        speed = "30 ft., swim 40 ft.",
        str = 13, strMod = "+1",
        dex = 11, dexMod = "+0",
        con = 12, conMod = "+1",
        int = 12, intMod = "+1",
        wis = 13, wisMod = "+1",
        cha = 9, chaMod = "-1",
        skills = "Perception +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 15",
        languages = "Sahuagin",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Blood Frenzy. The sahuagin has advantage on melee attack rolls against any creature that doesn't have all its hit points.",
            "Limited Amphibiousness. The sahuagin can breathe air and water, but it needs to be submerged at least once every 4 hours to avoid suffocating.",
            "Shark Telepathy. The sahuagin can magically command any shark within 120 feet of it, using a limited telepathy."
        ),
        actions = listOf(
            "Multiattack. The sahuagin makes two melee attacks: one with its bite and one with its claws or spear.",
            "Bite. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 3 (1d4 + 1) piercing damage.",
            "Claws. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 3 (1d4 + 1) slashing damage.",
            "Spear. Melee or Ranged Weapon Attack: +3 to hit, reach 5 ft. or range 20/60 ft., one target. Hit: 4 (1d6 + 1) piercing damage, or 5 (1d8 + 1) piercing damage if used with two hands to make a melee attack."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "swim speed, darkvision, amphibious, water breathing, multiattack", //shark telepathy feels too limited to qualify for telepathic tag
        source = "Monster Manual (SRD)"
    )
)

val scout = registerHumanoidStatBlock(
    StatBlock(
        name = "Scout",
        size = "Medium",
        type = "humanoid (any race)",
        alignment = "any alignment",
        armorClass = "13 (leather armor)",
        hitPoints = "16 (3d8 + 3)",
        speed = "30 ft.",
        str = 11, strMod = "+0",
        dex = 14, dexMod = "+2",
        con = 12, conMod = "+1",
        int = 11, intMod = "+0",
        wis = 13, wisMod = "+1",
        cha = 11, chaMod = "+0",
        skills = "Nature +4, Perception +5, Stealth +6, Survival +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 15",
        languages = "any one language (usually Common)",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Hearing and Sight. The scout has advantage on Wisdom (Perception) checks that rely on hearing or sight."
        ),
        actions = listOf(
            "Multiattack. The scout makes two melee attacks or two ranged attacks.",
            "Shortsword. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 5 (1d6 + 2) piercing damage.",
            "Longbow. Ranged Weapon Attack: +4 to hit, range 150/600 ft., one target. Hit: 6 (1d8 + 2) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Scouts are skilled hunters and trackers who offer their services for a fee. Most hunt wild game, but a few work as bounty hunters, serve as guides, or provide military reconnaissance.",
        tags = "keen hearing, keen sight, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val spy = registerHumanoidStatBlock(
    StatBlock(
        name = "Spy",
        size = "Medium",
        type = "humanoid (any race)",
        alignment = "any alignment",
        armorClass = "12",
        hitPoints = "27 (6d8)",
        speed = "30 ft.",
        str = 10, strMod = "+0",
        dex = 15, dexMod = "+2",
        con = 10, conMod = "+0",
        int = 12, intMod = "+1",
        wis = 14, wisMod = "+2",
        cha = 16, chaMod = "+3",
        skills = "Deception +5, Insight +4, Investigation +5, Perception +6, Persuasion +5, Sleight of Hand +4, Stealth +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 16",
        languages = "any two languages",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Cunning Action. On each of its turns, the spy can use a bonus action to take the Dash, Disengage, or Hide action.",
            "Sneak Attack (1/Turn). The spy deals an extra 7 (2d6) damage when it hits a target with a weapon attack and has advantage on the attack roll, or when the target is within 5 feet of an ally of the spy that isn't incapacitated and the spy doesn't have disadvantage on the attack roll."
        ),
        actions = listOf(
            "Multiattack. The spy makes two melee attacks.",
            "Shortsword. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 5 (1d6 + 2) piercing damage.",
            "Hand Crossbow. Ranged Weapon Attack: +4 to hit, range 30/120 ft., one target. Hit: 5 (1d6 + 2) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Rulers, nobles, merchants, guildmasters, and other wealthy individuals use spies to gain the upper hand in a world of cutthroat politics. A spy is trained to secretly gather information. Loyal spies would rather die than divulge information that could compromise them or their employers.",
        tags = "multiattack",
        source = "Monster Manual (SRD)"
    )
)

val thug = registerHumanoidStatBlock(
    StatBlock(
        name = "Thug",
        size = "Medium",
        type = "humanoid (any race)",
        alignment = "any non-good",
        armorClass = "11 (leather armor)",
        hitPoints = "32 (5d8 + 10)",
        speed = "30 ft.",
        str = 15, strMod = "+2",
        dex = 11, dexMod = "+0",
        con = 14, conMod = "+2",
        int = 10, intMod = "+0",
        wis = 10, wisMod = "+0",
        cha = 11, chaMod = "+0",
        skills = "Intimidation +2",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "any one language (usually Common)",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Pack Tactics. The thug has advantage on an attack roll against a creature if at least one of the thug's allies is within 5 feet of the creature and the ally isn't incapacitated."
        ),
        actions = listOf(
            "Multiattack. The thug makes two melee attacks.",
            "Mace. Melee Weapon Attack: +4 to hit, reach 5 ft., one creature. Hit: 5 (1d6 + 2) bludgeoning damage.",
            "Heavy Crossbow. Ranged Weapon Attack: +2 to hit, range 100/400 ft., one target. Hit: 5 (1d10) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "pack tactics, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val tribalWarrior = registerHumanoidStatBlock(
    StatBlock(
        name = "Tribal Warrior",
        size = "Medium",
        type = "humanoid (any race)",
        alignment = "any",
        armorClass = "12 (hide armor)",
        hitPoints = "11 (2d8 + 2)",
        speed = "30 ft.",
        str = 13, strMod = "+1",
        dex = 11, dexMod = "+0",
        con = 12, conMod = "+1",
        int = 8, intMod = "-1",
        wis = 11, wisMod = "+0",
        cha = 8, chaMod = "-1",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "any one language",
        challengeRating = "1/8",
        expValue = "25 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Pack Tactics. The warrior has advantage on an attack roll against a creature if at least one of the warrior's allies is within 5 feet of the creature and the ally isn't incapacitated."
        ),
        actions = listOf(
            "Spear. Melee or Ranged Weapon Attack: +3 to hit, reach 5 ft. or range 20/60 ft., one target. Hit: 4 (1d6 + 1) piercing damage, or 5 (1d8 + 1) piercing damage if used with two hands to make a melee attack."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "pack tactics",
        source = "Monster Manual (SRD)"
    )
)

val veteran = registerHumanoidStatBlock(
    StatBlock(
        name = "Veteran",
        size = "Medium",
        type = "humanoid (any race)",
        alignment = "any alignment",
        armorClass = "17 (splint)",
        hitPoints = "58 (9d8 + 18)",
        speed = "30 ft.",
        str = 16, strMod = "+3",
        dex = 13, dexMod = "+1",
        con = 14, conMod = "+2",
        int = 10, intMod = "+0",
        wis = 11, wisMod = "+0",
        cha = 10, chaMod = "+0",
        skills = "Athletics +5, Perception +2",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 12",
        languages = "any one language (usually Common)",
        challengeRating = "3",
        expValue = "700 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Multiattack. The veteran makes two longsword attacks. If it has a shortsword drawn, it can also make a shortsword attack.",
            "Longsword. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 7 (1d8 + 3) slashing damage, or 8 (1d10 + 3) slashing damage if used with two hands.",
            "Shortsword. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 6 (1d6 + 3) piercing damage.",
            "Heavy Crossbow. Ranged Weapon Attack: +3 to hit, range 100/400 ft., one target. Hit: 6 (1d10 + 1) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Veterans are professional fighters that take up arms for pay or to protect something they believe in or value. Their ranks include soldiers retired from long service and warriors who never served anyone but themselves.",
        tags = "multiattack",
        source = "Monster Manual (SRD)"
    )
)

val werebear = registerHumanoidStatBlock(
    StatBlock(
        name = "Werebear",
        size = "Medium",
        type = "humanoid (Human, Shapechanger)",
        alignment = "neutral good",
        armorClass = "10 in humanoid form, 11 (natural armor) in bear and hybrid form",
        hitPoints = "135 (18d8 + 54)",
        speed = "30 ft. (40 ft., climb 30 ft. in bear or hybrid form)",
        str = 19, strMod = "+4",
        dex = 10, dexMod = "+0",
        con = 17, conMod = "+3",
        int = 11, intMod = "+0",
        wis = 12, wisMod = "+1",
        cha = 12, chaMod = "+1",
        skills = "Perception +7",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "bludgeoning, piercing, and slashing from nonmagical attacks not made with silvered weapons",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 17",
        languages = "Common (can't speak in bear form)",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Shapechanger. The werebear can use its action to polymorph into a Large bear-humanoid hybrid or into a Large bear, or back into its true form, which is humanoid. Its statistics, other than its size and AC, are the same in each form. Any equipment it is wearing or carrying isn't transformed. It reverts to its true form if it dies.",
            "Keen Smell. The werebear has advantage on Wisdom (Perception) checks that rely on smell."
        ),
        actions = listOf(
            "Multiattack. In bear form, the werebear makes two claw attacks. In humanoid form, it makes two greataxe attacks. In hybrid form, it can attack like a bear or a humanoid.",
            "Bite (Bear or Hybrid Form Only). Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 15 (2d10 + 4) piercing damage. If the target is a humanoid, it must succeed on a DC 14 Constitution saving throw or be cursed with werebear lycanthropy.",
            "Claw (Bear or Hybrid Form Only). Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 13 (2d8 + 4) slashing damage.",
            "Greataxe (Humanoid or Hybrid Form Only). Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 10 (1d12 + 4) slashing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "A remove curse spell can rid an afflicted lycanthrope of the curse, but a natural born lycanthrope can be freed of the curse only with a wish.",
        tags = "climb speed, damage immunity, keen smell, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val wereboar = registerHumanoidStatBlock(
    StatBlock(
        name = "Wereboar",
        size = "Medium",
        type = "humanoid (Human, Shapechanger)",
        alignment = "neutral evil",
        armorClass = "10 in humanoid form, 11 (natural armor) in boar or hybrid form",
        hitPoints = "78 (12d8 + 24)",
        speed = "30 ft. (40 ft. in boar form)",
        str = 17, strMod = "+3",
        dex = 10, dexMod = "+0",
        con = 15, conMod = "+2",
        int = 10, intMod = "+0",
        wis = 11, wisMod = "+0",
        cha = 8, chaMod = "-1",
        skills = "Perception +2",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "bludgeoning, piercing, and slashing damage from nonmagical attacks that aren't silvered",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 12",
        languages = "Common (can't speak in boar form)",
        challengeRating = "4",
        expValue = "1100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Shapechanger. The wereboar can use its action to polymorph into a boar-humanoid hybrid or into a boar, or back into its true form, which is humanoid. Its statistics, other than its AC, are the same in each form. Any equipment it is wearing or carrying isn't transformed. It reverts to its true form if it dies.",
            "Charge (Boar or Hybrid Form Only). If the wereboar moves at least 15 feet straight toward a target and then hits it with its tusks on the same turn, the target takes an extra 7 (2d6) slashing damage. If the target is a creature, it must succeed on a DC 13 Strength saving throw or be knocked prone.",
            "Relentless (Recharges after a Short or Long Rest). If the wereboar takes 14 damage or less that would reduce it to 0 hit points, it is reduced to 1 hit point instead."
        ),
        actions = listOf(
            "Multiattack (Humanoid or Hybrid Form Only). The wereboar makes two attacks, only one of which can be with its tusks.",
            "Maul (Humanoid or Hybrid Form Only). Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 10 (2d6 + 3) bludgeoning damage.",
            "Tusks (Boar or Hybrid Form Only). Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 10 (2d6 + 3) slashing damage. If the target is a humanoid, it must succeed on a DC 12 Constitution saving throw or be cursed with wereboar lycanthropy."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "A remove curse spell can rid an afflicted lycanthrope of the curse, but a natural born lycanthrope can be freed of the curse only with a wish.",
        tags = "damage immunity, cc - prone, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val wererat = registerHumanoidStatBlock(
    StatBlock(
        name = "Wererat",
        size = "Medium",
        type = "humanoid (Human, Shapechanger)",
        alignment = "lawful evil",
        armorClass = "12",
        hitPoints = "33 (6d8 + 6)",
        speed = "30 ft.",
        str = 10, strMod = "+0",
        dex = 15, dexMod = "+2",
        con = 12, conMod = "+1",
        int = 11, intMod = "+0",
        wis = 10, wisMod = "+0",
        cha = 8, chaMod = "-1",
        skills = "Perception +2, Stealth +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "bludgeoning, piercing, and slashing from nonmagical attacks not made with silvered weapons",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft. (rat form only), passive Perception 12",
        languages = "Common (can't speak in rat form)",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Shapechanger. The wererat can use its action to polymorph into a rat-humanoid hybrid or into a giant rat, or back into its true form, which is humanoid. Its statistics, other than its size, are the same in each form. Any equipment it is wearing or carrying isn't transformed. It reverts to its true form if it dies.",
            "Keen Smell. The wererat has advantage on Wisdom (Perception) checks that rely on smell."
        ),
        actions = listOf(
            "Multiattack (Humanoid or Hybrid Form Only). The wererat makes two attacks, only one of which can be a bite.",
            "Bite (Rat or Hybrid Form Only). Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 4 (1d4 + 2) piercing damage. If the target is a humanoid, it must succeed on a DC 11 Constitution saving throw or be cursed with wererat lycanthropy.",
            "Shortsword (Humanoid or Hybrid Form Only). Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 5 (1d6 + 2) piercing damage.",
            "Hand Crossbow (Humanoid or Hybrid Form Only). Ranged Weapon Attack: +4 to hit, range 30/120 ft., one target. Hit: 5 (1d6 + 2) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "A remove curse spell can rid an afflicted lycanthrope of the curse, but a natural born lycanthrope can be freed of the curse only with a wish.",
        tags = "damage immunity, darkvision, keen smell, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val weretiger = registerHumanoidStatBlock(
    StatBlock(
        name = "Weretiger",
        size = "Medium",
        type = "humanoid (Human, Shapechanger)",
        alignment = "neutral",
        armorClass = "12",
        hitPoints = "120 (16d8 + 48)",
        speed = "30 ft. (40 ft. in tiger form)",
        str = 17, strMod = "+3",
        dex = 15, dexMod = "+2",
        con = 16, conMod = "+3",
        int = 10, intMod = "+0",
        wis = 13, wisMod = "+1",
        cha = 11, chaMod = "+0",
        skills = "Perception +5, Stealth +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "bludgeoning, piercing, and slashing from nonmagical attacks not made with silvered weapons",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 15",
        languages = "Common (can't speak in tiger form)",
        challengeRating = "4",
        expValue = "1100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Shapechanger. The weretiger can use its action to polymorph into a tiger-humanoid hybrid or into a tiger, or back into its true form, which is humanoid. Its statistics, other than its size, are the same in each form. Any equipment it is wearing or carrying isn't transformed. It reverts to its true form if it dies.",
            "Keen Hearing and Smell. The weretiger has advantage on Wisdom (Perception) checks that rely on hearing or smell.",
            "Pounce (Tiger or Hybrid Form Only). If the weretiger moves at least 15 feet straight toward a creature and then hits it with a claw attack on the same turn, that target must succeed on a DC 14 Strength saving throw or be knocked prone. If the target is prone, the weretiger can make one bite attack against it as a bonus action."
        ),
        actions = listOf(
            "Multiattack (Humanoid or Hybrid Form Only). In humanoid form, the weretiger makes two scimitar attacks or two longbow attacks. In hybrid form, it can attack like a humanoid or make two claw attacks.",
            "Bite (Tiger or Hybrid Form Only). Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 8 (1d10 + 3) piercing damage. If the target is a humanoid, it must succeed on a DC 13 Constitution saving throw or be cursed with weretiger lycanthropy.",
            "Claw (Tiger or Hybrid Form Only). Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 7 (1d8 + 3) slashing damage.",
            "Scimitar (Humanoid or Hybrid Form Only). Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 6 (1d6 + 3) slashing damage.",
            "Longbow (Humanoid or Hybrid Form Only). Ranged Weapon Attack: +4 to hit, range 150/600 ft., one target. Hit: 6 (1d8 + 2) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "A remove curse spell can rid an afflicted lycanthrope of the curse, but a natural born lycanthrope can be freed of the curse only with a wish.",
        tags = "damage immunity, darkvision, keen hearing, keen smell, multiattack, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val werewolf = registerHumanoidStatBlock(
    StatBlock(
        name = "Werewolf",
        size = "Medium",
        type = "humanoid (Human, Shapechanger)",
        alignment = "chaotic evil",
        armorClass = "11 in humanoid form, 12 (natural armor) in wolf or hybrid form",
        hitPoints = "58 (9d8 + 18)",
        speed = "30 ft. (40 ft. in wolf form)",
        str = 15, strMod = "+2",
        dex = 13, dexMod = "+1",
        con = 14, conMod = "+2",
        int = 10, intMod = "+0",
        wis = 11, wisMod = "+0",
        cha = 10, chaMod = "+0",
        skills = "Perception +4, Stealth +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "bludgeoning, piercing, and slashing damage from nonmagical attacks that aren't silvered",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 14",
        languages = "Common (can't speak in wolf form)",
        challengeRating = "3",
        expValue = "700 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Shapechanger. The werewolf can use its action to polymorph into a wolf-humanoid hybrid or into a wolf, or back into its true form, which is humanoid. Its statistics, other than its AC, are the same in each form. Any equipment it is wearing or carrying isn't transformed. It reverts to its true form if it dies.",
            "Keen Hearing and Smell. The werewolf has advantage on Wisdom (Perception) checks that rely on hearing or smell."
        ),
        actions = listOf(
            "Multiattack (Humanoid or Hybrid Form Only). The werewolf makes two attacks: two with its spear (humanoid form) or one with its bite and one with its claws (hybrid form).",
            "Bite (Wolf or Hybrid Form Only). Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 6 (1d8 + 2) piercing damage. If the target is a humanoid, it must succeed on a DC 12 Constitution saving throw or be cursed with werewolf lycanthropy.",
            "Claws (Hybrid Form Only). Melee Weapon Attack: +4 to hit, reach 5 ft., one creature. Hit: 7 (2d4 + 2) slashing damage.",
            "Spear (Humanoid Form Only). Melee or Ranged Weapon Attack: +4 to hit, reach 5 ft. or range 20/60 ft., one creature. Hit: 5 (1d6 + 2) piercing damage, or 6 (1d8 + 2) piercing damage if used with two hands to make a melee attack."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "A werewolf is a savage predator that can appear as a humanoid, as a wolf, or in a terrifying hybrid form-a furred and well-muscled humanoid body topped by a ravening wolf's head.\nA remove curse spell can rid an afflicted lycanthrope of the curse, but a natural born lycanthrope can be freed of the curse only with a wish.",
        tags = "damage immunity, keen hearing, keen smell, multiattack",
        source = "Monster Manual (SRD)"
    )
)
