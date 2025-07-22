package com.example.wildshapesmountsandfamiliars.ui.screens.creatureType

import androidx.compose.runtime.Composable
import com.example.wildshapesmountsandfamiliars.ui.screens.CreatureTypeScreen
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.UndeadStatBlockSpellEffectOrSummon
import com.example.wildshapesmountsandfamiliars.ui.screens.UndeadStatBlocks
import com.example.wildshapesmountsandfamiliars.ui.screens.registerUndeadStatBlock


@Composable
fun Undead(onNavigateHome: () -> Unit,
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
           onNavigateToUndead:() -> Unit,) {
    CreatureTypeScreen(
        title = "Undead",
        statBlocks = UndeadStatBlocks,
        spellEffectOrSummons = UndeadStatBlockSpellEffectOrSummon,
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



val ghast = registerUndeadStatBlock(
    StatBlock(
        name = "Ghast",
        size = "Medium",
        type = "undead",
        alignment = "chaotic evil",
        armorClass = "13",
        hitPoints = "36 (8d8)",
        speed = "30 ft.",
        str = 16, strMod = "+3",
        dex = 17, dexMod = "+3",
        con = 10, conMod = "+0",
        int = 11, intMod = "+0",
        wis = 10, wisMod = "+0",
        cha = 8, chaMod = "-1",
        savingThrows = null,
        skills = null,
        vulnerabilities = null,
        damageResistances = "necrotic",
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "charmed, exhaustion, poisoned",
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "Common",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        legendaryResistance = null,
        traits = listOf(
            "Stench. Any creature that starts its turn within 5 feet of the ghast must succeed on a DC 10 Constitution saving throw or be poisoned until the start of its next turn. On a successful saving throw, the creature is immune to the ghast's Stench for 24 hours.",
            "Turning Defiance. The ghast and any ghouls within 30 feet of it have advantage on saving throws against effects that turn undead."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +3 to hit, reach 5 ft., one creature. Hit: 12 (2d8 + 3) piercing damage.",
            "Claws. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 10 (2d6 + 3) slashing damage. If the target is a creature other than an undead, it must succeed on a DC 10 Constitution saving throw or be paralyzed for 1 minute. The target can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage resistance, damage immunity, condition immunity, darkvision, cc - poisoned, cc - paralyzed",
        source = "Monster Manual (SRD)"
    )
)

val ghost = registerUndeadStatBlock(
    StatBlock(
        name = "Ghost",
        size = "Medium",
        type = "undead",
        alignment = "any alignment",
        armorClass = "11",
        hitPoints = "45 (10d8)",
        speed = "0 ft., fly 40 ft. (hover)",
        str = 7, strMod = "-2",
        dex = 13, dexMod = "+1",
        con = 10, conMod = "+0",
        int = 10, intMod = "+0",
        wis = 12, wisMod = "+1",
        cha = 17, chaMod = "+3",
        savingThrows = null,
        skills = null,
        vulnerabilities = null,
        damageResistances = "acid, fire, lightning, thunder; bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "cold, necrotic, poison",
        conditionResistances = null,
        conditionImmunities = "charmed, exhaustion, frightened, grappled, paralyzed, petrified, poisoned, prone, restrained",
        senses = "darkvision 60 ft., passive Perception 11",
        languages = "the languages it knew in life",
        challengeRating = "4",
        expValue = "1100 XP",
        proficiencyBonus = null,
        legendaryResistance = null,
        traits = listOf(
            "Ethereal Sight. The ghost can see 60 feet into the Ethereal Plane when it is on the Material Plane, and vice versa.",
            "Incorporeal Movement. The ghost can move through other creatures and objects as if they were difficult terrain. It takes 5 (1d10) force damage if it ends its turn inside an object."
        ),
        actions = listOf(
            "Withering Touch. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 17 (4d6 + 3) necrotic damage.",
            "Etherealness. The ghost enters the Ethereal Plane from the Material Plane, or vice versa. It is visible on the Material Plane while it is in the Border Ethereal, and vice versa, yet it can't affect or be affected by anything on the other plane.",
            "Horrifying Visage. Each non-undead creature within 60 feet of the ghost that can see it must succeed on a DC 13 Wisdom saving throw or be frightened for 1 minute. If the save fails by 5 or more, the target also ages 1d4 x 10 years. A frightened target can repeat the saving throw at the end of each of its turns, ending the frightened condition on itself on a success. If a target's saving throw is successful or the effect ends for it, the target is immune to this ghost's Horrifying Visage for the next 24 hours. The aging effect can be reversed with a greater restoration spell, but only within 24 hours of it occurring.",
            "Possession (Recharge 6). One humanoid that the ghost can see within 5 feet of it must succeed on a DC 13 Charisma saving throw or be possessed by the ghost; the ghost then disappears, and the target is incapacitated and loses control of its body. The ghost now controls the body but doesn't deprive the target of awareness. The ghost can't be targeted by any attack, spell, or other effect, except ones that turn undead, and it retains its alignment, Intelligence, Wisdom, Charisma, and immunity to being charmed and frightened. It otherwise uses the possessed target's statistics, but doesn't gain access to the target's knowledge, class features, or proficiencies. The possession lasts until the body drops to 0 hit points, the ghost ends it as a bonus action, or the ghost is turned or forced out by an effect like the dispel evil and good spell. When the possession ends, the ghost reappears in an unoccupied space within 5 feet of the body. The target is immune to this ghost's Possession for 24 hours after succeeding on the saving throw or after the possession ends."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "A ghost is the soul of a once-living creature, bound to haunt a location, creature, or object from its life.",
        tags = "fly speed, hover, damage resistance, damage immunity, condition immunity, darkvision, cc - frightened, cc - possessed",
        source = "Monster Manual (SRD)"
    )
)

val ghoul = registerUndeadStatBlock(
    StatBlock(
        name = "Ghoul",
        size = "Medium",
        type = "undead",
        alignment = "chaotic evil",
        armorClass = "12",
        hitPoints = "22 (5d8)",
        speed = "30 ft.",
        str = 13, strMod = "+1",
        dex = 15, dexMod = "+2",
        con = 10, conMod = "+0",
        int = 7, intMod = "-2",
        wis = 10, wisMod = "+0",
        cha = 6, chaMod = "-2",
        savingThrows = null,
        skills = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "charmed, exhaustion, poisoned",
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "Common",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        legendaryResistance = null,
        traits = null,
        actions = listOf(
            "Bite. Melee Weapon Attack: +2 to hit, reach 5 ft., one creature. Hit: 9 (2d6 + 2) piercing damage.",
            "Claws. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 7 (2d4 + 2) slashing damage. If the target is a creature other than an elf or undead, it must succeed on a DC 10 Constitution saving throw or be paralyzed for 1 minute. The target can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "With their razor-sharp teeth and jagged claws, ghouls roam the night in packs, driven by an insatiable hunger for humanoid flesh.",
        tags = "damage immunity, condition immunity, darkvision, cc - paralyzed",
        source = "Monster Manual (SRD)"
    )
)

val lich = registerUndeadStatBlock(
    StatBlock(
        name = "Lich",
        size = "Medium",
        type = "undead",
        alignment = "any evil",
        armorClass = "17 (natural armor)",
        hitPoints = "135 (18d8 + 54)",
        speed = "30 ft.",
        str = 11, strMod = "+0",
        dex = 16, dexMod = "+3",
        con = 16, conMod = "+3",
        int = 20, intMod = "+5",
        wis = 14, wisMod = "+2",
        cha = 16, chaMod = "+3",
        savingThrows = "Con +10, Int +12, Wis +9",
        skills = "Arcana +19, History +12, Insight +9, Perception +9",
        vulnerabilities = null,
        damageResistances = "cold, lightning, necrotic",
        damageImmunities = "poison; bludgeoning, piercing, and slashing from nonmagical attacks",
        conditionResistances = null,
        conditionImmunities = "charmed, exhaustion, frightened, paralyzed, poisoned",
        senses = "truesight 120 ft., passive Perception 19",
        languages = "Common plus up to five other languages",
        challengeRating = "21",
        expValue = "33000 XP",
        proficiencyBonus = null,
        legendaryResistance = "Legendary Resistance (3/Day). If the lich fails a saving throw, it can choose to succeed instead.",
        traits = listOf(
            "Rejuvenation. If it has a phylactery, a destroyed lich gains a new body in 1d10 days, regaining all its hit points and becoming active again. The new body appears within 5 feet of the phylactery.",
            "Spellcasting. The lich is an 18th-level spellcaster. Its spellcasting ability is Intelligence (spell save DC 20, +12 to hit with spell attacks). The lich has the following wizard spells prepared:\n" +
                    "Cantrips (at will): mage hand, prestidigitation, ray of frost\n" +
                    "1st level (4 slots): detect magic, magic missile, shield, thunderwave\n" +
                    "2nd level (3 slots): detect thoughts, invisibility, Melf's acid arrow, mirror image\n" +
                    "3rd level (3 slots): animate dead, counterspell, dispel magic, fireball\n" +
                    "4th level (3 slots): blight, dimension door\n" +
                    "5th level (3 slots): cloudkill, scrying\n" +
                    "6th level (1 slot): disintegrate, globe of invulnerability\n" +
                    "7th level (1 slot): finger of death, plane shift\n" +
                    "8th level (1 slot): dominate monster, power word stun\n" +
                    "9th level (1 slot): power word kill",
            "Turn Resistance. The lich has advantage on saving throws against any effect that turns undead."
        ),
        actions = listOf(
            "Paralyzing Touch. Melee Spell Attack: +12 to hit, reach 5 ft., one creature. Hit: 10 (3d6) cold damage. The target must succeed on a DC 18 Constitution saving throw or be paralyzed for 1 minute. The target can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "The lich can take 3 legendary actions, choosing from the options below. Only one legendary action option can be used at a time and only at the end of another creature's turn. The lich regains spent legendary actions at the start of its turn.",
            "Cantrip. The lich casts a cantrip.",
            "Paralyzing Touch (Costs 2 Actions). The lich uses its Paralyzing Touch.",
            "Frightening Gaze (Costs 2 Actions). The lich fixes its gaze on one creature it can see within 10 feet of it. The target must succeed on a DC 18 Wisdom saving throw against this magic or become frightened for 1 minute. The frightened target can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a target's saving throw is successful or the effect ends for it, the target is immune to the lich's gaze for the next 24 hours.",
            "Disrupt Life (Costs 3 Actions). Each non‐undead creature within 20 feet of the lich must make a DC 18 Constitution saving throw against this magic, taking 21 (6d6) necrotic damage on a failed save, or half as much damage on a successful one."
        ),
        description = "A lich is spawned when a great wizard embraces the evil state of undeath as a means of extending life beyond its mortal limits. Scheming and insane, they hunger for long-forgotten knowledge and the most terrible secrets.",
        tags = "damage resistance, damage immunity, condition immunity, truesight, legendary resistance, cc - paralyzed, cc - frightened",
        source = "Monster Manual (SRD)"
    )
)

val minotaurSkeleton = registerUndeadStatBlock(
    StatBlock(
        name = "Minotaur Skeleton",
        size = "Large",
        type = "undead",
        alignment = "lawful evil",
        armorClass = "12 (natural armor)",
        hitPoints = "67 (9d10 + 18)",
        speed = "40 ft.",
        str = 18, strMod = "+4",
        dex = 11, dexMod = "+0",
        con = 15, conMod = "+2",
        int = 6, intMod = "-2",
        wis = 8, wisMod = "-1",
        cha = 5, chaMod = "-3",
        savingThrows = null,
        skills = null,
        vulnerabilities = "bludgeoning",
        damageResistances = null,
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "exhaustion, poisoned",
        senses = "darkvision 60 ft., passive Perception 9",
        languages = "understands Abyssal but can't speak",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        legendaryResistance = null,
        traits = listOf(
            "Charge. If the skeleton moves at least 10 feet straight toward a target and then hits it with a gore attack on the same turn, the target takes an extra 9 (2d8) piercing damage. If the target is a creature, it must succeed on a DC 14 Strength saving throw or be pushed up to 10 feet away and knocked prone."
        ),
        actions = listOf(
            "Greataxe. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 17 (2d12 + 4) slashing damage.",
            "Gore. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 13 (2d8 + 4) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage immunity, condition immunity, darkvision, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val mummy = registerUndeadStatBlock(
    StatBlock(
        name = "Mummy",
        size = "Medium",
        type = "undead",
        alignment = "lawful evil",
        armorClass = "11 (natural armor)",
        hitPoints = "58 (9d8 + 18)",
        speed = "20 ft.",
        str = 16, strMod = "+3",
        dex = 8, dexMod = "-1",
        con = 15, conMod = "+2",
        int = 6, intMod = "-2",
        wis = 10, wisMod = "+0",
        cha = 12, chaMod = "+1",
        savingThrows = "Wis +2",
        skills = null,
        vulnerabilities = "fire",
        damageResistances = "bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "necrotic, poison",
        conditionResistances = null,
        conditionImmunities = "charmed, exhaustion, frightened, paralyzed, poisoned",
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "the languages it knew in life",
        challengeRating = "3",
        expValue = "700 XP",
        proficiencyBonus = null,
        legendaryResistance = null,
        traits = listOf(),
        actions = listOf(
            "Multiattack. The mummy can use its Dreadful Glare and makes one attack with its rotting fist.",
            "Rotting Fist. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 10 (2d6 + 3) bludgeoning damage plus 10 (3d6) necrotic damage. If the target is a creature, it must succeed on a DC 12 Constitution saving throw or be cursed with mummy rot. The cursed target can't regain hit points, and its hit point maximum decreases by 10 (3d6) for every 24 hours that elapse. If the curse reduces the target's hit point maximum to 0, the target dies, and its body turns to dust. The curse lasts until removed by the remove curse spell or other magic.",
            "Dreadful Glare. The mummy targets one creature it can see within 60 feet of it. If the target can see the mummy, it must succeed on a DC 11 Wisdom saving throw against this magic or become frightened until the end of the mummy's next turn. If the target fails the saving throw by 5 or more, it is also paralyzed for the same duration. A target that succeeds on the saving throw is immune to the Dreadful Glare of all mummies (but not mummy lords) for the next 24 hours."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Raised by dark funerary rituals and still wrapped in the shrouds of death, mummies shamble out from lost temples and tombs to slay any who disturb their rest.",
        tags = "damage resistance, damage immunity, condition immunity, darkvision, multiattack, cc - frightened, cc - paralyzed",
        source = "Monster Manual (SRD)"
    )
)

val mummyLord = registerUndeadStatBlock(
    StatBlock(
        name = "Mummy Lord",
        size = "Medium",
        type = "undead",
        alignment = "lawful evil",
        armorClass = "17 (natural armor)",
        hitPoints = "97 (13d8 + 39)",
        speed = "20 ft.",
        str = 18, strMod = "+4",
        dex = 10, dexMod = "+0",
        con = 17, conMod = "+3",
        int = 11, intMod = "+0",
        wis = 18, wisMod = "+4",
        cha = 16, chaMod = "+3",
        savingThrows = "Con +8, Int +5, Wis +9, Cha +8",
        skills = "History +5, Religion +5",
        vulnerabilities = "fire",
        damageResistances = "bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "necrotic, poison",
        conditionResistances = null,
        conditionImmunities = "charmed, exhaustion, frightened, paralyzed, poisoned",
        senses = "darkvision 60 ft., passive Perception 14",
        languages = "the languages it knew in life",
        challengeRating = "15",
        expValue = "13000 XP",
        proficiencyBonus = null,
        legendaryResistance = null,
        traits = listOf(
            "Magic Resistance. The mummy lord has advantage on saving throws against spells and other magical effects.",
            "Rejuvenation. A destroyed mummy lord gains a new body in 24 hours if its heart is intact, regaining all its hit points and becoming active again. The new body appears within 5 feet of the mummy lord's heart.",
            "Spellcasting. The mummy lord is a 10th-level spellcaster. Its spellcasting ability is Wisdom (spell save DC 17, +9 to hit with spell attacks). The mummy lord has the following cleric spells prepared:\n" +
                    "Cantrips (at will): sacred flame, thaumaturgy\n" +
                    "1st level (4 slots): command, guiding bolt, shield of faith\n" +
                    "2nd level (3 slots): hold person, silence, spiritual weapon\n" +
                    "3rd level (3 slots): animate dead, dispel magic\n" +
                    "4th level (3 slots): divination, guardian of faith\n" +
                    "5th level (2 slots): contagion, insect plague\n" +
                    "6th level (1 slot): harm"
        ),
        actions = listOf(
            "Multiattack. The mummy can use its Dreadful Glare and makes one attack with its rotting fist.",
            "Rotting Fist. Melee Weapon Attack: +9 to hit, reach 5 ft., one target. Hit: 14 (3d6 + 4) bludgeoning damage plus 21 (6d6) necrotic damage. If the target is a creature, it must succeed on a DC 16 Constitution saving throw or be cursed with mummy rot. The cursed target can't regain hit points, and its hit point maximum decreases by 10 (3d6) for every 24 hours that elapse. If the curse reduces the target's hit point maximum to 0, the target dies, and its body turns to dust. The curse lasts until removed by the remove curse spell or other magic.",
            "Dreadful Glare. The mummy lord targets one creature it can see within 60 feet of it. If the target can see the mummy lord, it must succeed on a DC 16 Wisdom saving throw against this magic or become frightened until the end of the mummy's next turn. If the target fails the saving throw by 5 or more, it is also paralyzed for the same duration. A target that succeeds on the saving throw is immune to the Dreadful Glare of all mummies and mummy lords for the next 24 hours."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "Attack. The mummy lord makes one attack with its rotting fist or uses its Dreadful Glare.",
            "Blinding Dust. Blinding dust and sand swirls magically around the mummy lord. Each creature within 5 feet of the mummy lord must succeed on a DC 16 Constitution saving throw or be blinded until the end of the creature's next turn.",
            "Blasphemous Word (Costs 2 Actions). The mummy lord utters a blasphemous word. Each non-undead creature within 10 feet of the mummy lord that can hear the magical utterance must succeed on a DC 16 Constitution saving throw or be stunned until the end of the mummy lord's next turn.",
            "Channel Negative Energy (Costs 2 Actions). The mummy lord magically unleashes negative energy. Creatures within 60 feet of the mummy lord, including ones behind barriers and around corners, can't regain hit points until the end of the mummy lord's next turn.",
            "Whirlwind of Sand (Costs 2 Actions). The mummy lord magically transforms into a whirlwind of sand, moves up to 60 feet, and reverts to its normal form. While in whirlwind form, the mummy lord is immune to all damage, and it can't be grappled, petrified, knocked prone, restrained, or stunned. Equipment worn or carried by the mummy lord remain in its possession."
        ),
        description = null,
        tags = "damage immunity, condition immunity, darkvision, magic resistance, multiattack, cc - frightened, cc - paralyzed, legendary action, cc - blinded, cc - stunned ",
        source = "Monster Manual (SRD)"
    )
)

val ogreZombie = registerUndeadStatBlock(
    StatBlock(
        name = "Ogre Zombie",
        size = "Large",
        type = "undead",
        alignment = "neutral evil",
        armorClass = "8",
        hitPoints = "85 (9d10 + 36)",
        speed = "30 ft.",
        str = 19, strMod = "+4",
        dex = 6, dexMod = "-2",
        con = 18, conMod = "+4",
        int = 3, intMod = "-4",
        wis = 6, wisMod = "-2",
        cha = 5, chaMod = "-3",
        savingThrows = "Wis +0",
        skills = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        senses = "darkvision 60 ft., passive Perception 8",
        languages = "understands Common and Giant but can't speak",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        legendaryResistance = null,
        traits = listOf(
            "Undead Fortitude. If damage reduces the zombie to 0 hit points, it must make a Constitution saving throw with a DC of 5 + the damage taken, unless the damage is radiant or from a critical hit. On a success, the zombie drops to 1 hit point instead."
        ),
        actions = listOf(
            "Morningstar. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 13 (2d8 + 4) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage immunity, condition immunity, darkvision",
        source = "Monster Manual (SRD)"
    )
)

val shadow = registerUndeadStatBlock(
    StatBlock(
        name = "Shadow",
        size = "Medium",
        type = "undead",
        alignment = "chaotic evil",
        armorClass = "12",
        hitPoints = "16 (3d8 + 3)",
        speed = "40 ft.",
        str = 6, strMod = "-2",
        dex = 14, dexMod = "+2",
        con = 13, conMod = "+1",
        int = 6, intMod = "-2",
        wis = 10, wisMod = "+0",
        cha = 8, chaMod = "-1",
        savingThrows = null,
        skills = "Stealth +4 (+6 in dim light or darkness)",
        vulnerabilities = "radiant",
        damageResistances = "acid, cold, fire, lightning, thunder; bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "necrotic, poison",
        conditionResistances = null,
        conditionImmunities = "exhaustion, frightened, grappled, paralyzed, petrified, poisoned, prone, restrained",
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "—",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        legendaryResistance = null,
        traits = listOf(
            "Amorphous. The shadow can move through a space as narrow as 1 inch wide without squeezing.",
            "Shadow Stealth. While in dim light or darkness, the shadow can take the Hide action as a bonus action.",
            "Sunlight Weakness. While in sunlight, the shadow has disadvantage on attack rolls, ability checks, and saving throws."
        ),
        actions = listOf(
            "Strength Drain. Melee Weapon Attack: +4 to hit, reach 5 ft., one creature. Hit: 9 (2d6 + 2) necrotic damage, and the target's Strength score is reduced by 1d4. The target dies if this reduces its Strength to 0. Otherwise, the reduction lasts until the target finishes a short or long rest. If a non-evil humanoid dies from this attack, a new shadow rises from the corpse 1d4 hours later."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage resistance, damage immunity, condition immunity, darkvision",
        source = "Monster Manual (SRD)"
    )
)

val skeleton = registerUndeadStatBlock(
    StatBlock(
        name = "Skeleton",
        size = "Medium",
        type = "undead",
        alignment = "lawful evil",
        armorClass = "13 (armor scraps)",
        hitPoints = "13 (2d8 + 4)",
        speed = "30 ft.",
        str = 10, strMod = "+0",
        dex = 14, dexMod = "+2",
        con = 15, conMod = "+2",
        int = 6, intMod = "-2",
        wis = 8, wisMod = "-1",
        cha = 5, chaMod = "-3",
        savingThrows = null,
        skills = null,
        vulnerabilities = "bludgeoning",
        damageResistances = null,
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "exhaustion, poisoned",
        senses = "darkvision 60 ft., passive Perception 9",
        languages = "understands the languages it knew in life but can't speak",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        legendaryResistance = null,
        traits = listOf(),
        actions = listOf(
            "Shortsword. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 5 (1d6 + 2) piercing damage.",
            "Shortbow. Ranged Weapon Attack: +4 to hit, range 80/320 ft., one target. Hit: 5 (1d6 + 2) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage immunity, condition immunity, darkvision",
        source = "Monster Manual (SRD)"
    )
)

val specter = registerUndeadStatBlock(
    StatBlock(
        name = "Specter",
        size = "Medium",
        type = "undead",
        alignment = "chaotic evil",
        armorClass = "12",
        hitPoints = "22 (5d8)",
        speed = "0 ft., fly 50 ft. (hover)",
        str = 1, strMod = "-5",
        dex = 14, dexMod = "+2",
        con = 11, conMod = "+0",
        int = 10, intMod = "+0",
        wis = 10, wisMod = "+0",
        cha = 11, chaMod = "+0",
        savingThrows = null,
        skills = null,
        vulnerabilities = null,
        damageResistances = "acid, cold, fire, lightning, thunder; bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "necrotic, poison",
        conditionResistances = null,
        conditionImmunities = "charmed, exhaustion, grappled, paralyzed, petrified, poisoned, prone, restrained, unconscious",
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "understands the languages it knew in life but can't speak",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        legendaryResistance = null,
        traits = listOf(
            "Incorporeal Movement. The specter can move through other creatures and objects as if they were difficult terrain. It takes 5 (1d10) force damage if it ends its turn inside an object.",
            "Sunlight Sensitivity. While in sunlight, the specter has disadvantage on attack rolls, as well as on Wisdom (Perception) checks that rely on sight."
        ),
        actions = listOf(
            "Life Drain. Melee Spell Attack: +4 to hit, reach 5 ft., one creature. Hit: 10 (3d6) necrotic damage. The target must succeed on a DC 10 Constitution saving throw or its hit point maximum is reduced by an amount equal to the damage taken. This reduction lasts until the creature finishes a long rest. The target dies if this effect reduces its hit point maximum to 0."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, hover, damage resistance, damage immunity, condition immunity, darkvision",
        source = "Monster Manual (SRD)"
    )
)

val vampire = registerUndeadStatBlock(
    StatBlock(
        name = "Vampire",
        size = "Medium",
        type = "undead (Shapechanger)",
        alignment = "lawful evil",
        armorClass = "16 (natural armor)",
        hitPoints = "144 (17d8 + 68)",
        speed = "30 ft.",
        str = 18, strMod = "+4",
        dex = 18, dexMod = "+4",
        con = 18, conMod = "+4",
        int = 17, intMod = "+3",
        wis = 15, wisMod = "+2",
        cha = 18, chaMod = "+4",
        savingThrows = "Dex +9, Wis +7, Cha +9",
        skills = "Perception +7, Stealth +9",
        vulnerabilities = null,
        damageResistances = "necrotic; bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        senses = "darkvision 120 ft., passive Perception 17",
        languages = "the languages it knew in life",
        challengeRating = "13",
        expValue = "10000 XP",
        proficiencyBonus = null,
        legendaryResistance = "Legendary Resistance (3/Day). If the vampire fails a saving throw, it can choose to succeed instead.",
        traits = listOf(
            "Shapechanger. If the vampire isn't in sunlight or running water, it can use its action to polymorph into a Tiny bat or a Medium cloud of mist, or back into its true form. While in bat form, the vampire can't speak, its walking speed is 5 feet, and it has a flying speed of 30 feet. Its statistics, other than its size and speed, are unchanged. Anything it is wearing transforms with it, but nothing it is carrying does. It reverts to its true form if it dies. While in mist form, the vampire can't take any actions, speak, or manipulate objects. It is weightless, has a flying speed of 20 feet, can hover, and can enter a hostile creature's space and stop there. In addition, if air can pass through a space, the mist can do so without squeezing, and it can't pass through water. It has advantage on Strength, Dexterity, and Constitution saving throws, and it is immune to all nonmagical damage, except the damage it takes from sunlight.",
            "Misty Escape. When it drops to 0 hit points outside its resting place, the vampire transforms into a cloud of mist (as in the Shapechanger trait) instead of falling unconscious, provided that it isn't in sunlight or running water. If it can't transform, it is destroyed. While it has 0 hit points in mist form, it can't revert to its vampire form, and it must reach its resting place within 2 hours or be destroyed. Once in its resting place, it reverts to its vampire form. It is then paralyzed until it regains at least 1 hit point. After spending 1 hour in its resting place with 0 hit points, it regains 1 hit point.",
            "Regeneration. The vampire regains 20 hit points at the start of its turn if it has at least 1 hit point and isn't in sunlight or running water. If the vampire takes radiant damage or damage from holy water, this trait doesn't function at the start of the vampire's next turn.",
            "Spider Climb. The vampire can climb difficult surfaces, including upside down on ceilings, without needing to make an ability check.",
            "Vampire Weaknesses. The vampire has the following flaws:\n- Forbiddance. The vampire can't enter a residence without an invitation from one of the occupants.\n- Harmed by Running Water. The vampire takes 20 acid damage if it ends its turn in running water.\n- Stake to the Heart. If a piercing weapon made of wood is driven into the vampire's heart while the vampire is incapacitated in its resting place, the vampire is paralyzed until the stake is removed.\n- Sunlight Hypersensitivity. The vampire takes 20 radiant damage when it starts its turn in sunlight. While in sunlight, it has disadvantage on attack rolls and ability checks."
        ),
        actions = listOf(
            "Multiattack (Vampire Form Only). The vampire makes two attacks, only one of which can be a bite attack.",
            "Unarmed Strike (Vampire Form Only). Melee Weapon Attack: +9 to hit, reach 5 ft., one creature. Hit: 8 (1d8 + 4) bludgeoning damage. Instead of dealing damage, the vampire can grapple the target (escape DC 18).",
            "Bite (Bat or Vampire Form Only). Melee Weapon Attack: +9 to hit, reach 5 ft., one willing creature, or a creature that is grappled by the vampire, incapacitated, or restrained. Hit: 7 (1d6 + 4) piercing damage plus 10 (3d6) necrotic damage. The target's hit point maximum is reduced by an amount equal to the necrotic damage taken, and the vampire regains hit points equal to that amount. The reduction lasts until the target finishes a long rest. The target dies if this effect reduces its hit point maximum to 0. A humanoid slain in this way and then buried in the ground rises the following night as a vampire spawn under the vampire's control.",
            "Charm. The vampire targets one humanoid it can see within 30 feet of it. If the target can see the vampire, the target must succeed on a DC 17 Wisdom saving throw against this magic or be charmed by the vampire. The charmed target regards the vampire as a trusted friend to be heeded and protected. Although the target isn't under the vampire's control, it takes the vampire's requests or actions in the most favorable way it can, and it is a willing target for the vampire's bite attack. Each time the vampire or the vampire's companions do anything harmful to the target, it can repeat the saving throw, ending the effect on itself on a success. Otherwise, the effect lasts 24 hours or until the vampire is destroyed, is on a different plane of existence than the target, or takes a bonus action to end the effect.",
            "Children of the Night (1/Day). The vampire magically calls 2d4 swarms of bats or rats, provided that the sun isn't up. While outdoors, the vampire can call 3d6 wolves instead. The called creatures arrive in 1d4 rounds, acting as allies of the vampire and obeying its spoken commands. The beasts remain for 1 hour, until the vampire dies, or until the vampire dismisses them as a bonus action."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "Move. The vampire moves up to its speed without provoking opportunity attacks.",
            "Unarmed Strike. The vampire makes one unarmed strike.",
            "Bite (Costs 2 Actions). The vampire makes one bite attack."
        ),
        description = null,
        tags = "damage resistance, darkvision, legendary resistance, regeneration, multiattack, cc - grappled, cc - charmed, legendary action",
        source = "Monster Manual (SRD)"
    )
)

val vampireSpawn = registerUndeadStatBlock(
    StatBlock(
        name = "Vampire Spawn",
        size = "Medium",
        type = "undead",
        alignment = "neutral evil",
        armorClass = "15 (natural armor)",
        hitPoints = "82 (11d8 + 33)",
        speed = "30 ft.",
        str = 16, strMod = "+3",
        dex = 16, dexMod = "+3",
        con = 16, conMod = "+3",
        int = 11, intMod = "+0",
        wis = 10, wisMod = "+0",
        cha = 12, chaMod = "+1",
        savingThrows = "Dex +6, Wis +3",
        skills = "Perception +3, Stealth +6",
        vulnerabilities = null,
        damageResistances = "necrotic; bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        senses = "darkvision 60 ft., passive Perception 13",
        languages = "the languages it knew in life",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        legendaryResistance = null,
        traits = listOf(
            "Regeneration. The vampire regains 10 hit points at the start of its turn if it has at least 1 hit point and isn't in sunlight or running water. If the vampire takes radiant damage or damage from holy water, this trait doesn't function at the start of the vampire's next turn.",
            "Spider Climb. The vampire can climb difficult surfaces, including upside down on ceilings, without needing to make an ability check.",
            "Vampire Weaknesses. The vampire has the following flaws:\n- Forbiddance. The vampire can't enter a residence without an invitation from one of the occupants.\n- Harmed by Running Water. The vampire takes 20 acid damage when it ends its turn in running water.\n- Stake to the Heart. The vampire is destroyed if a piercing weapon made of wood is driven into its heart while it is incapacitated in its resting place.\n- Sunlight Hypersensitivity. The vampire takes 20 radiant damage when it starts its turn in sunlight. While in sunlight, it has disadvantage on attack rolls and ability checks."
        ),
        actions = listOf(
            "Multiattack. The vampire makes two attacks, only one of which can be a bite attack.",
            "Claws. Melee Weapon Attack: +6 to hit, reach 5 ft., one creature. Hit: 8 (2d4 + 3) slashing damage. Instead of dealing damage, the vampire can grapple the target (escape DC 13).",
            "Bite. Melee Weapon Attack: +6 to hit, reach 5 ft., one willing creature, or a creature that is grappled by the vampire, incapacitated, or restrained. Hit: 6 (1d6 + 3) piercing damage plus 7 (2d6) necrotic damage. The target's hit point maximum is reduced by an amount equal to the necrotic damage taken, and the vampire regains hit points equal to that amount. The reduction lasts until the target finishes a long rest. The target dies if this effect reduces its hit point maximum to 0."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage resistance, darkvision, regeneration, multiattack, cc - grappled",
        source = "Monster Manual (SRD)"
    )
)

val warhorseSkeleton = registerUndeadStatBlock(
    StatBlock(
        name = "Warhorse Skeleton",
        size = "Large",
        type = "undead",
        alignment = "lawful evil",
        armorClass = "13 (barding scraps)",
        hitPoints = "22 (3d10 + 6)",
        speed = "60 ft.",
        str = 18, strMod = "+4",
        dex = 12, dexMod = "+1",
        con = 15, conMod = "+2",
        int = 2, intMod = "-4",
        wis = 8, wisMod = "-1",
        cha = 5, chaMod = "-3",
        savingThrows = null,
        skills = null,
        vulnerabilities = "bludgeoning",
        damageResistances = null,
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "exhaustion, poisoned",
        senses = "darkvision 60 ft., passive Perception 9",
        languages = "—",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        legendaryResistance = null,
        traits = null,
        actions = listOf(
            "Hooves. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 11 (2d6 + 4) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage immunity, condition immunity, darkvision",
        source = "Monster Manual (SRD)"
    )
)

val wight = registerUndeadStatBlock(
    StatBlock(
        name = "Wight",
        size = "Medium",
        type = "undead",
        alignment = "neutral evil",
        armorClass = "14 (studded leather)",
        hitPoints = "45 (6d8 + 18)",
        speed = "30 ft.",
        str = 15, strMod = "+2",
        dex = 14, dexMod = "+2",
        con = 16, conMod = "+3",
        int = 10, intMod = "+0",
        wis = 13, wisMod = "+1",
        cha = 15, chaMod = "+2",
        savingThrows = null,
        skills = "Perception +3, Stealth +4",
        vulnerabilities = null,
        damageResistances = "necrotic; bludgeoning, piercing, and slashing from nonmagical attacks that aren't silvered",
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "exhaustion, poisoned",
        senses = "darkvision 60 ft., passive Perception 13",
        languages = "the languages it knew in life",
        challengeRating = "3",
        expValue = "700 XP",
        proficiencyBonus = null,
        legendaryResistance = null,
        traits = listOf(
            "Sunlight Sensitivity. While in sunlight, the wight has disadvantage on attack rolls, as well as on Wisdom (Perception) checks that rely on sight."
        ),
        actions = listOf(
            "Multiattack. The wight makes two longsword attacks or two longbow attacks. It can use its Life Drain in place of one longsword attack.",
            "Life Drain. Melee Weapon Attack: +4 to hit, reach 5 ft., one creature. Hit: 5 (1d6 + 2) necrotic damage. The target must succeed on a DC 13 Constitution saving throw or its hit point maximum is reduced by an amount equal to the damage taken. This reduction lasts until the target finishes a long rest. The target dies if this effect reduces its hit point maximum to 0. A humanoid slain by this attack rises 24 hours later as a zombie under the wight's control, unless the humanoid is restored to life or its body is destroyed. The wight can have no more than twelve zombies under its control at one time.",
            "Longsword. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 6 (1d8 + 2) slashing damage, or 7 (1d10 + 2) slashing damage if used with two hands.",
            "Longbow. Ranged Weapon Attack: +4 to hit, range 150/600 ft., one target. Hit: 6 (1d8 + 2) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Wights are intelligent undead humanoids that resemble armed and armored corpses. They never tire in pursuit of their goal of making eternal war against the living.",
        tags = "damage resistance, damage immunity, condition immunity, darkvision, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val willOWisp = registerUndeadStatBlock(
    StatBlock(
        name = "Will-o'-Wisp",
        size = "Tiny",
        type = "undead",
        alignment = "chaotic evil",
        armorClass = "19",
        hitPoints = "22 (9d4)",
        speed = "0 ft., fly 50 ft. (hover)",
        str = 1, strMod = "-5",
        dex = 28, dexMod = "+9",
        con = 10, conMod = "+0",
        int = 13, intMod = "+1",
        wis = 14, wisMod = "+2",
        cha = 11, chaMod = "+0",
        savingThrows = null,
        skills = null,
        vulnerabilities = null,
        damageResistances = "acid, cold, fire, necrotic, thunder; bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "lightning, poison",
        conditionResistances = null,
        conditionImmunities = "exhaustion, grappled, paralyzed, poisoned, prone, restrained, unconscious",
        senses = "darkvision 120 ft., passive Perception 12",
        languages = "the languages it knew in life",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        legendaryResistance = null,
        traits = listOf(
            "Consume Life. As a bonus action, the will-o'-wisp can target one creature it can see within 5 feet of it that has 0 hit points and is still alive. The target must succeed on a DC 10 Constitution saving throw against this magic or die. If the target dies, the will-o'-wisp regains 10 (3d6) hit points.",
            "Ephemeral. The will-o'-wisp can't wear or carry anything.",
            "Incorporeal Movement. The will-o'-wisp can move through other creatures and objects as if they were difficult terrain. It takes 5 (1d10) force damage if it ends its turn inside an object.",
            "Variable Illumination. The will-o'-wisp sheds bright light in a 5-to 20-foot radius and dim light for an additional number of feet equal to the chosen radius. The will-o'-wisp can alter the radius as a bonus action."
        ),
        actions = listOf(
            "Shock. Melee Spell Attack: +4 to hit, reach 5 ft., one creature. Hit: 9 (2d8) lightning damage.",
            "Invisibility. The will-o'-wisp and its light magically become invisible until it attacks or uses its Consume Life, or until its concentration ends (as if concentrating on a spell)."
        ),
        bonusActions = listOf(
            "Consume Life. As a bonus action, the will-o'-wisp can target one creature it can see within 5 feet of it that has 0 hit points and is still alive. The target must succeed on a DC 10 Constitution saving throw against this magic or die. If the target dies, the will-o'-wisp regains 10 (3d6) hit points.",
            "Variable Illumination. The will-o'-wisp can alter the radius of its bright and dim light as a bonus action."
        ),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, hover, damage immunity, damage resistance, condition immunity, darkvision",
        source = "Monster Manual (SRD)"
    )
)

val wraith = registerUndeadStatBlock(
    StatBlock(
        name = "Wraith",
        size = "Medium",
        type = "undead",
        alignment = "neutral evil",
        armorClass = "13",
        hitPoints = "67 (9d8 + 27)",
        speed = "0 ft., fly 60 ft. (hover)",
        str = 6, strMod = "-2",
        dex = 16, dexMod = "+3",
        con = 16, conMod = "+3",
        int = 12, intMod = "+1",
        wis = 14, wisMod = "+2",
        cha = 15, chaMod = "+2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "acid, cold, fire, lightning, thunder; bludgeoning, piercing, and slashing from nonmagical attacks that aren't silvered",
        damageImmunities = "necrotic, poison",
        conditionResistances = null,
        conditionImmunities = "charmed, exhaustion, grappled, paralyzed, petrified, poisoned, prone, restrained",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 12",
        languages = "the languages it knew in life",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Incorporeal Movement. The wraith can move through other creatures and objects as if they were difficult terrain. It takes 5 (1d10) force damage if it ends its turn inside an object.",
            "Sunlight Sensitivity. While in sunlight, the wraith has disadvantage on attack rolls, as well as on Wisdom (Perception) checks that rely on sight."
        ),
        actions = listOf(
            "Life Drain. Melee Weapon Attack: +6 to hit, reach 5 ft., one creature. Hit: 21 (4d8 + 3) necrotic damage. The target must succeed on a DC 14 Constitution saving throw or its hit point maximum is reduced by an amount equal to the damage taken. This reduction lasts until the target finishes a long rest. The target dies if this effect reduces its hit point maximum to 0.",
            "Create Specter. The wraith targets a humanoid within 10 feet of it that has been dead for no longer than 1 minute and died violently. The target's spirit rises as a specter in the space of its corpse or in the nearest unoccupied space. The specter is under the wraith's control. The wraith can have no more than seven specters under its control at one time."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = null,
        tags = "fly speed, hover, damage resistance, damage immunity, condition immunity, darkvision",
        source = "Monster Manual (SRD)"
    )
)

val zombie = registerUndeadStatBlock(
    StatBlock(
        name = "Zombie",
        size = "Medium",
        type = "undead",
        alignment = "neutral evil",
        armorClass = "8",
        hitPoints = "22 (3d8 + 9)",
        speed = "20 ft.",
        str = 13, strMod = "+1",
        dex = 6, dexMod = "-2",
        con = 16, conMod = "+3",
        int = 3, intMod = "-4",
        wis = 6, wisMod = "-2",
        cha = 5, chaMod = "-3",
        skills = null,
        savingThrows = "Wis +0",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 8",
        languages = "understands the languages it knew in life but can't speak",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Undead Fortitude. If damage reduces the zombie to 0 hit points, it must make a Constitution saving throw with a DC of 5 + the damage taken, unless the damage is radiant or from a critical hit. On a success, the zombie drops to 1 hit point instead."
        ),
        actions = listOf(
            "Slam. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 4 (1d6 + 1) bludgeoning damage."
        ),
        bonusActions = emptyList(),
        reactions = emptyList(),
        legendaryActions = emptyList(),
        description = "Undead zombies move with a jerky, uneven gait. They are clad in the moldering apparel they wore when put to rest, and carry the stench of decay.",
        tags = "damage immunity, condition immunity, darkvision",
        source = "Monster Manual (SRD)"
    )
)


//Summons and Spell Effects

