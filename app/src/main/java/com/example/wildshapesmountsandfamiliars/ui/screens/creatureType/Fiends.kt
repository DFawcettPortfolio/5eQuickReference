package com.example.wildshapesmountsandfamiliars.ui.screens.creatureType

import androidx.compose.runtime.Composable
import com.example.wildshapesmountsandfamiliars.ui.screens.CreatureTypeScreen
import com.example.wildshapesmountsandfamiliars.ui.screens.FiendStatBlockSpellEffectOrSummon
import com.example.wildshapesmountsandfamiliars.ui.screens.FiendStatBlocks
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.registerFiendStatBlock

@Composable
fun Fiends(
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
        title = "Fiends",
        statBlocks = FiendStatBlocks,
        spellEffectOrSummons = FiendStatBlockSpellEffectOrSummon,
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


val balor = registerFiendStatBlock(
    StatBlock(
        name = "Balor",
        size = "Huge",
        type = "fiend (Demon)",
        alignment = "chaotic evil",
        armorClass = "19 (natural armor)",
        hitPoints = "262 (21d12 + 126)",
        speed = "40 ft., fly 80 ft.",
        str = 26, strMod = "+8",
        dex = 15, dexMod = "+2",
        con = 22, conMod = "+6",
        int = 20, intMod = "+5",
        wis = 16, wisMod = "+3",
        cha = 22, chaMod = "+6",
        savingThrows = "Str +14, Con +12, Wis +9, Cha +12",
        skills = null,
        vulnerabilities = null,
        damageResistances = "cold, lightning; bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "fire, poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        senses = "truesight 120 ft., passive Perception 13",
        languages = "Abyssal, telepathy 120 ft.",
        challengeRating = "19",
        expValue = "22000 XP",
        proficiencyBonus = null,
        legendaryResistance = null,
        traits = listOf(
            "Death Throes. When the balor dies, it explodes, and each creature within 30 feet of it must make a DC 20 Dexterity saving throw, taking 70 (20d6) fire damage on a failed save, or half as much damage on a successful one. The explosion ignites flammable objects in that area that aren't being worn or carried, and it destroys the balor's weapons.",
            "Fire Aura. At the start of each of the balor's turns, each creature within 5 feet of it takes 10 (3d6) fire damage, and flammable objects in the aura that aren't being worn or carried ignite. A creature that touches the balor or hits it with a melee attack while within 5 feet of it takes 10 (3d6) fire damage.",
            "Magic Resistance. The balor has advantage on saving throws against spells and other magical effects.",
            "Magic Weapons. The balor's weapon attacks are magical."
        ),
        actions = listOf(
            "Multiattack. The balor makes two attacks: one with its longsword and one with its whip.",
            "Longsword. Melee Weapon Attack: +14 to hit, reach 10 ft., one target. Hit: 21 (3d8 + 8) slashing damage plus 13 (3d8) lightning damage. If the balor scores a critical hit, it rolls damage dice three times, instead of twice.",
            "Whip. Melee Weapon Attack: +14 to hit, reach 30 ft., one target. Hit: 15 (2d6 + 8) slashing damage plus 10 (3d6) fire damage, and the target must succeed on a DC 20 Strength saving throw or be pulled up to 25 feet toward the balor.",
            "Teleport. The balor magically teleports, along with any equipment it is wearing or carrying, up to 120 feet to an unoccupied space it can see."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, damage resistance, damage immunity, condition immunity, truesight, telepathic, magic resistance, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val barbedDevil = registerFiendStatBlock(
    StatBlock(
        name = "Barbed Devil",
        size = "Medium",
        type = "fiend (Devil)",
        alignment = "lawful evil",
        armorClass = "15 (natural armor)",
        hitPoints = "110 (13d8 + 52)",
        speed = "30 ft.",
        str = 16, strMod = "+3",
        dex = 17, dexMod = "+3",
        con = 18, conMod = "+4",
        int = 12, intMod = "+1",
        wis = 14, wisMod = "+2",
        cha = 14, chaMod = "+2",
        savingThrows = "Str +6, Con +7, Wis +5, Cha +5",
        skills = "Deception +5, Insight +5, Perception +8",
        vulnerabilities = null,
        damageResistances = "cold; bludgeoning, piercing, and slashing from nonmagical attacks that aren't silvered",
        damageImmunities = "fire, poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 18",
        languages = "Infernal, telepathy 120 ft.",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Barbed Hide. At the start of each of its turns, the barbed devil deals 5 (1d10) piercing damage to any creature grappling it.",
            "Devil's Sight. Magical darkness doesn't impede the devil's darkvision.",
            "Magic Resistance. The devil has advantage on saving throws against spells and other magical effects."
        ),
        actions = listOf(
            "Multiattack. The devil makes three melee attacks: one with its tail and two with its claws. Alternatively, it can use Hurl Flame twice.",
            "Claw. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 6 (1d6 + 3) piercing damage.",
            "Tail. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 10 (2d6 + 3) piercing damage.",
            "Hurl Flame. Ranged Spell Attack: +5 to hit, range 150 ft., one target. Hit: 10 (3d6) fire damage. If the target is a flammable object that isn't being worn or carried, it also catches fire."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage resistance, damage immunity, condition immunity, darkvision, telepathic, magic resistance, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val beardedDevil = registerFiendStatBlock(
    StatBlock(
        name = "Bearded Devil",
        size = "Medium",
        type = "fiend (Devil)",
        alignment = "lawful evil",
        armorClass = "13 (natural armor)",
        hitPoints = "52 (8d8 + 16)",
        speed = "30 ft.",
        str = 16, strMod = "+3",
        dex = 15, dexMod = "+2",
        con = 15, conMod = "+2",
        int = 9, intMod = "-1",
        wis = 11, wisMod = "+0",
        cha = 11, chaMod = "+0",
        savingThrows = "Str +5, Con +4, Wis +2",
        skills = null,
        vulnerabilities = null,
        damageResistances = "cold; bludgeoning, piercing, and slashing from nonmagical attacks that aren't silvered",
        damageImmunities = "fire, poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 10",
        languages = "Infernal, telepathy 120 ft.",
        challengeRating = "3",
        expValue = "700 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Devil's Sight. Magical darkness doesn't impede the devil's darkvision.",
            "Magic Resistance. The devil has advantage on saving throws against spells and other magical effects.",
            "Steadfast. The devil can't be frightened while it can see an allied creature within 30 feet of it."
        ),
        actions = listOf(
            "Multiattack. The devil makes two attacks: one with its beard and one with its glaive.",
            "Beard. Melee Weapon Attack: +5 to hit, reach 5 ft., one creature. Hit: 6 (1d8 + 2) piercing damage, and the target must succeed on a DC 12 Constitution saving throw or be poisoned for 1 minute. While poisoned in this way, the target can't regain hit points. The target can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success.",
            "Glaive. Melee Weapon Attack: +5 to hit, reach 10 ft., one target. Hit: 8 (1d10 + 3) slashing damage. If the target is a creature other than an undead or a construct, it must succeed on a DC 12 Constitution saving throw or lose 5 (1d10) hit points at the start of each of its turns due to an infernal wound. Each time the devil hits the wounded target with this attack, the damage dealt by the wound increases by 5 (1d10). Any creature can take an action to stanch the wound with a successful DC 12 Wisdom (Medicine) check. The wound also closes if the target receives magical healing."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage resistance, damage immunity, condition immunity, darkvision, telepathic, magic resistance, multiattack, cc - poisoned",
        source = "Monster Manual (SRD)"
    )
)

val boneDevil = registerFiendStatBlock(
    StatBlock(
        name = "Bone Devil",
        size = "Large",
        type = "fiend (Devil)",
        alignment = "lawful evil",
        armorClass = "19 (natural armor)",
        hitPoints = "142 (15d10 + 60)",
        speed = "40 ft., fly 40 ft.",
        str = 18, strMod = "+4",
        dex = 16, dexMod = "+3",
        con = 18, conMod = "+4",
        int = 13, intMod = "+1",
        wis = 14, wisMod = "+2",
        cha = 16, chaMod = "+3",
        savingThrows = "Int +5, Wis +6, Cha +7",
        skills = "Deception +7, Insight +6",
        vulnerabilities = null,
        damageResistances = "cold; bludgeoning, piercing, and slashing from nonmagical attacks that aren't silvered",
        damageImmunities = "fire, poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 12",
        languages = "Infernal, telepathy 120 ft.",
        challengeRating = "9",
        expValue = "5000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Devil's Sight. Magical darkness doesn't impede the devil's darkvision.",
            "Magic Resistance. The devil has advantage on saving throws against spells and other magical effects."
        ),
        actions = listOf(
            "Multiattack. The devil makes three attacks: two with its claws and one with its sting.",
            "Claw. Melee Weapon Attack: +8 to hit, reach 10 ft., one target. Hit: 8 (1d8 + 4) slashing damage.",
            "Sting. Melee Weapon Attack: +8 to hit, reach 10 ft., one target. Hit: 13 (2d8 + 4) piercing damage plus 17 (5d6) poison damage, and the target must succeed on a DC 14 Constitution saving throw or become poisoned for 1 minute. The target can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, damage resistance, damage immunity, condition immunity, darkvision, telepathic, magic resistance, multiattack, cc - poisoned",
        source = "Monster Manual (SRD)"
    )
)

val chainDevil = registerFiendStatBlock(
    StatBlock(
        name = "Chain Devil",
        size = "Medium",
        type = "fiend (Devil)",
        alignment = "lawful evil",
        armorClass = "16 (natural armor)",
        hitPoints = "85 (10d8 + 40)",
        speed = "30 ft.",
        str = 18, strMod = "+4",
        dex = 15, dexMod = "+2",
        con = 18, conMod = "+4",
        int = 11, intMod = "+0",
        wis = 12, wisMod = "+1",
        cha = 14, chaMod = "+2",
        savingThrows = "Con +7, Wis +4, Cha +5",
        skills = null,
        vulnerabilities = null,
        damageResistances = "cold; bludgeoning, piercing, and slashing from nonmagical attacks that aren't silvered",
        damageImmunities = "fire, poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 11",
        languages = "Infernal, telepathy 120 ft.",
        challengeRating = "8",
        expValue = "3900 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Devil's Sight. Magical darkness doesn't impede the devil's darkvision.",
            "Magic Resistance. The devil has advantage on saving throws against spells and other magical effects."
        ),
        actions = listOf(
            "Multiattack. The devil makes two attacks with its chains.",
            "Chain. Melee Weapon Attack: +8 to hit, reach 10 ft., one target. Hit: 11 (2d6 + 4) slashing damage. The target is grappled (escape DC 14) if the devil isn't already grappling a creature. Until this grapple ends, the target is restrained and takes 7 (2d6) piercing damage at the start of each of its turns.",
            "Animate Chains (Recharges after a Short or Long Rest). Up to four chains the devil can see within 60 feet of it magically sprout razor-edged barbs and animate under the devil's control, provided that the chains aren't being worn or carried. Each animated chain is an object with AC 20, 20 hit points, resistance to piercing damage, and immunity to psychic and thunder damage. When the devil uses Multiattack on its turn, it can use each animated chain to make one additional chain attack. An animated chain can grapple one creature of its own but can't make attacks while grappling. An animated chain reverts to its inanimate state if reduced to 0 hit points or if the devil is incapacitated or dies."
        ),
        bonusActions = listOf(),
        reactions = listOf(
            "Unnerving Mask. When a creature the devil can see starts its turn within 30 feet of the devil, the devil can create the illusion that it looks like one of the creature's departed loved ones or bitter enemies. If the creature can see the devil, it must succeed on a DC 14 Wisdom saving throw or be frightened until the end of its turn."
        ),
        legendaryActions = listOf(),
        description = null,
        tags = "damage resistance, damage immunity, condition immunity, darkvision, telepathic, magic resistance, multiattack,  cc - grappled, cc - frightened",
        source = "Monster Manual (SRD)"
    )
)

val dretch = registerFiendStatBlock(
    StatBlock(
        name = "Dretch",
        size = "Small",
        type = "fiend (Demon)",
        alignment = "chaotic evil",
        armorClass = "11 (natural armor)",
        hitPoints = "18 (4d6 + 4)",
        speed = "20 ft.",
        str = 11, strMod = "+0",
        dex = 11, dexMod = "+0",
        con = 12, conMod = "+1",
        int = 5, intMod = "-3",
        wis = 8, wisMod = "-1",
        cha = 3, chaMod = "-4",
        savingThrows = null,
        skills = null,
        vulnerabilities = null,
        damageResistances = "cold, fire, lightning",
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 9",
        languages = "Abyssal, telepathy 60 ft. (works only with creatures that understand Abyssal)",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = null,
        actions = listOf(
            "Multiattack. The dretch makes two attacks: one with its bite and one with its claws.",
            "Bite. Melee Weapon Attack: +2 to hit, reach 5 ft., one target. Hit: 3 (1d6) piercing damage.",
            "Claws. Melee Weapon Attack: +2 to hit, reach 5 ft., one target. Hit: 5 (2d4) slashing damage.",
            "Fetid Cloud (1/Day). A 10-foot radius of disgusting green gas extends out from the dretch. The gas spreads around corners, and its area is lightly obscured. It lasts for 1 minute or until a strong wind disperses it. Any creature that starts its turn in that area must succeed on a DC 11 Constitution saving throw or be poisoned until the start of its next turn. While poisoned in this way, the target can take either an action or a bonus action on its turn, not both, and can't take reactions."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage resistance, damage immunity, condition immunity, darkvision, telepathic, multiattack, cc - poisoned",
        source = "Monster Manual (SRD)"
    )
)

val erinyes = registerFiendStatBlock(
    StatBlock(
        name = "Erinyes",
        size = "Medium",
        type = "fiend (Devil)",
        alignment = "lawful evil",
        armorClass = "18 (plate)",
        hitPoints = "153 (18d8 + 72)",
        speed = "30 ft., fly 60 ft.",
        str = 18, strMod = "+4",
        dex = 16, dexMod = "+3",
        con = 18, conMod = "+4",
        int = 14, intMod = "+2",
        wis = 14, wisMod = "+2",
        cha = 18, chaMod = "+4",
        savingThrows = "Dex +7, Con +8, Wis +6, Cha +8",
        skills = null,
        vulnerabilities = null,
        damageResistances = "cold; bludgeoning, piercing, and slashing from nonmagical attacks that aren't silvered",
        damageImmunities = "fire, poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "truesight 120 ft., passive Perception 12",
        languages = "Infernal, telepathy 120 ft.",
        challengeRating = "12",
        expValue = "8400 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Hellish Weapons. The erinyes's weapon attacks are magical and deal an extra 13 (3d8) poison damage on a hit (included in the attacks).",
            "Magic Resistance. The erinyes has advantage on saving throws against spells and other magical effects."
        ),
        actions = listOf(
            "Multiattack. The erinyes makes three attacks.",
            "Longsword. Melee Weapon Attack: +8 to hit, reach 5 ft., one target. Hit: 8 (1d8 + 4) slashing damage, or 9 (1d10 + 4) slashing damage if used with two hands, plus 13 (3d8) poison damage.",
            "Longbow. Ranged Weapon Attack: +7 to hit, range 150/600 ft., one target. Hit: 7 (1d8 + 3) piercing damage plus 13 (3d8) poison damage, and the target must succeed on a DC 14 Constitution saving throw or be poisoned. The poison lasts until it is removed by the lesser restoration spell or similar magic."
        ),
        bonusActions = listOf(),
        reactions = listOf(
            "Parry. The erinyes adds 4 to its AC against one melee attack that would hit it. To do so, the erinyes must see the attacker and be wielding a melee weapon."
        ),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, damage resistance, damage immunity, condition immunity, truesight, telepathic, magic resistance, multiattack,  cc - poisoned",
        source = "Monster Manual (SRD)"
    )
)

val glabrezu = registerFiendStatBlock(
    StatBlock(
        name = "Glabrezu",
        size = "Large",
        type = "fiend (Demon)",
        alignment = "chaotic evil",
        armorClass = "17 (natural armor)",
        hitPoints = "157 (15d10 + 75)",
        speed = "40 ft.",
        str = 20, strMod = "+5",
        dex = 15, dexMod = "+2",
        con = 21, conMod = "+5",
        int = 19, intMod = "+4",
        wis = 17, wisMod = "+3",
        cha = 16, chaMod = "+3",
        savingThrows = "Str +9, Con +9, Wis +7, Cha +7",
        skills = null,
        vulnerabilities = null,
        damageResistances = "cold, fire, lightning; bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "truesight 120 ft., passive Perception 13",
        languages = "Abyssal, telepathy 120 ft.",
        challengeRating = "9",
        expValue = "5000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Innate Spellcasting. The glabrezu's spellcasting ability is Intelligence (spell save DC 16). The glabrezu can innately cast the following spells, requiring no material components:",
            "At will: darkness, detect magic, dispel magic",
            "1/day each: confusion, fly, power word stun",
            "Magic Resistance. The glabrezu has advantage on saving throws against spells and other magical effects."
        ),
        actions = listOf(
            "Multiattack. The glabrezu makes four attacks: two with its pincers and two with its fists. Alternatively, it makes two attacks with its pincers and casts one spell.",
            "Pincer. Melee Weapon Attack: +9 to hit, reach 10 ft., one target. Hit: 16 (2d10 + 5) bludgeoning damage. If the target is a Medium or smaller creature, it is grappled (escape DC 15). The glabrezu has two pincers, each of which can grapple only one target.",
            "Fist. Melee Weapon Attack: +9 to hit, reach 5 ft., one target. Hit: 7 (2d4 + 2) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage resistance, damage immunity, condition immunity, truesight, telepathic, magic resistance, multiattack, cc - grappled",
        source = "Monster Manual (SRD)"
    )
)

val hellHound = registerFiendStatBlock(
    StatBlock(
        name = "Hell Hound",
        size = "Medium",
        type = "fiend",
        alignment = "lawful evil",
        armorClass = "15 (natural armor)",
        hitPoints = "45 (7d8 + 14)",
        speed = "50 ft.",
        str = 17, strMod = "+3",
        dex = 12, dexMod = "+1",
        con = 14, conMod = "+2",
        int = 6, intMod = "-2",
        wis = 13, wisMod = "+1",
        cha = 6, chaMod = "-2",
        savingThrows = null,
        skills = "Perception +5",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "fire",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 15",
        languages = "understands Infernal but can't speak",
        challengeRating = "3",
        expValue = "700 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Hearing and Smell. The hound has advantage on Wisdom (Perception) checks that rely on hearing or smell.",
            "Pack Tactics. The hound has advantage on an attack roll against a creature if at least one of the hound's allies is within 5 feet of the creature and the ally isn't incapacitated."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 7 (1d8 + 3) piercing damage plus 7 (2d6) fire damage.",
            "Fire Breath (Recharge 5-6). The hound exhales fire in a 15-foot cone. Each creature in that area must make a DC 12 Dexterity saving throw, taking 21 (6d6) fire damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Fire-breathing fiends that take the form of powerful dogs, hell hounds commonly serve evil creatures that use them as guard animals and companions.",
        tags = "damage immunity, keen hearing, keen smell, darkvision, pack tactics",
        source = "Monster Manual (SRD)"
    )
)

val hezrou = registerFiendStatBlock(
    StatBlock(
        name = "Hezrou",
        size = "Large",
        type = "fiend (Demon)",
        alignment = "chaotic evil",
        armorClass = "16 (natural armor)",
        hitPoints = "136 (13d10 + 65)",
        speed = "30 ft.",
        str = 19, strMod = "+4",
        dex = 17, dexMod = "+3",
        con = 20, conMod = "+5",
        int = 5, intMod = "-3",
        wis = 12, wisMod = "+1",
        cha = 13, chaMod = "+1",
        savingThrows = "Str +7, Con +8, Wis +4",
        skills = null,
        vulnerabilities = null,
        damageResistances = "cold, fire, lightning; bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 11",
        languages = "Abyssal, telepathy 120 ft.",
        challengeRating = "8",
        expValue = "3900 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Magic Resistance. The hezrou has advantage on saving throws against spells and other magical effects.",
            "Stench. Any creature that starts its turn within 10 feet of the hezrou must succeed on a DC 14 Constitution saving throw or be poisoned until the start of its next turn. On a successful saving throw, the creature is immune to the hezrou's stench for 24 hours."
        ),
        actions = listOf(
            "Multiattack. The hezrou makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 15 (2d10 + 4) piercing damage.",
            "Claw. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 11 (2d6 + 4) slashing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage resistance, damage immunity, condition immunity, darkvision, telepathic, magic resistance, cc - poisoned, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val hornedDevil = registerFiendStatBlock(
    StatBlock(
        name = "Horned Devil",
        size = "Large",
        type = "fiend (Devil)",
        alignment = "lawful evil",
        armorClass = "18 (natural armor)",
        hitPoints = "178 (17d10 + 85)",
        speed = "20 ft., fly 60 ft.",
        str = 22, strMod = "+6",
        dex = 17, dexMod = "+3",
        con = 21, conMod = "+5",
        int = 12, intMod = "+1",
        wis = 16, wisMod = "+3",
        cha = 17, chaMod = "+3",
        savingThrows = "Str +10, Dex +7, Wis +7, Cha +7",
        skills = null,
        vulnerabilities = null,
        damageResistances = "cold; bludgeoning, piercing, and slashing from nonmagical attacks not made with silvered weapons",
        damageImmunities = "fire, poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 13",
        languages = "Infernal, telepathy 120 ft.",
        challengeRating = "11",
        expValue = "7200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Devil's Sight. Magical darkness doesn't impede the devil's darkvision.",
            "Magic Resistance. The devil has advantage on saving throws against spells and other magical effects."
        ),
        actions = listOf(
            "Multiattack. The devil makes three melee attacks: two with its fork and one with its tail. It can use Hurl Flame in place of any melee attack.",
            "Fork. Melee Weapon Attack: +10 to hit, reach 10 ft., one target. Hit: 15 (2d8 + 6) piercing damage.",
            "Tail. Melee Weapon Attack: +10 to hit, reach 10 ft., one target. Hit: 10 (1d8 + 6) piercing damage. If the target is a creature other than an undead or a construct, it must succeed on a DC 17 Constitution saving throw or lose 10 (3d6) hit points at the start of each of its turns due to an infernal wound. Each time the devil hits the wounded target with this attack, the damage dealt by the wound increases by 10 (3d6). Any creature can take an action to stanch the wound with a successful DC 12 Wisdom (Medicine) check. The wound also closes if the target receives magical healing.",
            "Hurl Flame. Ranged Spell Attack: +7 to hit, range 150 ft., one target. Hit: 14 (4d6) fire damage. If the target is a flammable object that isn't being worn or carried, it also catches fire."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, damage resistance, damage immunity, condition immunity, darkvision, telepathic, magic resistance, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val iceDevil = registerFiendStatBlock(
    StatBlock(
        name = "Ice Devil",
        size = "Large",
        type = "fiend (Devil)",
        alignment = "lawful evil",
        armorClass = "18 (natural armor)",
        hitPoints = "180 (19d10 + 76)",
        speed = "40 ft.",
        str = 21, strMod = "+5",
        dex = 14, dexMod = "+2",
        con = 18, conMod = "+4",
        int = 18, intMod = "+4",
        wis = 15, wisMod = "+2",
        cha = 18, chaMod = "+4",
        skills = null,
        savingThrows = "Dex +7, Con +9, Wis +7, Cha +9",
        vulnerabilities = null,
        damageResistances = "bludgeoning, piercing, and slashing from nonmagical attacks that aren't silvered",
        damageImmunities = "cold, fire, poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "blindsight 60 ft., darkvision 120 ft., passive Perception 12",
        languages = "Infernal, telepathy 120 ft.",
        challengeRating = "14",
        expValue = "11500 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Devil's Sight. Magical darkness doesn't impede the devil's darkvision.",
            "Magic Resistance. The devil has advantage on saving throws against spells and other magical effects."
        ),
        actions = listOf(
            "Multiattack. The devil makes three attacks: one with its bite, one with its claws, and one with its tail.",
            "Bite. Melee Weapon Attack: +10 to hit, reach 5 ft., one target. Hit: 12 (2d6 + 5) piercing damage plus 10 (3d6) cold damage.",
            "Claws. Melee Weapon Attack: +10 to hit, reach 5 ft., one target. Hit: 10 (2d4 + 5) slashing damage plus 10 (3d6) cold damage.",
            "Tail. Melee Weapon Attack: +10 to hit, reach 10 ft., one target. Hit: 12 (2d6 + 5) bludgeoning damage plus 10 (3d6) cold damage.",
            "Wall of Ice (Recharge 6). The devil magically forms an opaque wall of ice on a solid surface it can see within 60 feet of it. The wall is 1 foot thick and up to 30 feet long and 10 feet high, or it's a hemispherical dome up to 20 feet in diameter. When the wall appears, each creature in its space is pushed out of it by the shortest route. The creature chooses which side of the wall to end up on, unless the creature is incapacitated. The creature then makes a DC 17 Dexterity saving throw, taking 35 (10d6) cold damage on a failed save, or half as much damage on a successful one. The wall lasts for 1 minute or until the devil is incapacitated or dies. The wall can be damaged and breached; each 10-foot section has AC 5, 30 hit points, vulnerability to fire damage, and immunity to acid, cold, necrotic, poison, and psychic damage. If a section is destroyed, it leaves behind a sheet of frigid air in the space the wall occupied. Whenever a creature finishes moving through the frigid air on a turn, willingly or otherwise, the creature must make a DC 17 Constitution saving throw, taking 17 (5d6) cold damage on a failed save, or half as much damage on a successful one. The frigid air dissipates when the rest of the wall vanishes."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage resistance, damage immunity, condition immunity, blindsight, darkvision, telepathic, magic resistance, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val imp = registerFiendStatBlock(
    StatBlock(
        name = "Imp",
        size = "Tiny",
        type = "fiend (Devil, Shapechanger)",
        alignment = "lawful evil",
        armorClass = "13",
        hitPoints = "10 (3d4 + 3)",
        speed = "20 ft., fly 40 ft.",
        str = 6, strMod = "-2",
        dex = 17, dexMod = "+3",
        con = 13, conMod = "+1",
        int = 11, intMod = "+0",
        wis = 12, wisMod = "+1",
        cha = 14, chaMod = "+2",
        skills = "Deception +4, Insight +3, Persuasion +4, Stealth +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "cold; bludgeoning, piercing, and slashing from nonmagical attacks not made with silvered weapons",
        damageImmunities = "fire, poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 11",
        languages = "Infernal, Common",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Shapechanger. The imp can use its action to polymorph into a beast form that resembles a rat (speed 20 ft.), a raven (20 ft., fly 60 ft.), or a spider (20 ft., climb 20 ft.), or back into its true form. Its statistics are the same in each form, except for the speed changes noted. Any equipment it is wearing or carrying isn't transformed. It reverts to its true form if it dies.",
            "Devil's Sight. Magical darkness doesn't impede the imp's darkvision.",
            "Magic Resistance. The imp has advantage on saving throws against spells and other magical effects."
        ),
        actions = listOf(
            "Sting (Bite in Beast Form). Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 5 (1d4 + 3) piercing damage, and the target must make on a DC 11 Constitution saving throw, taking 10 (3d6) poison damage on a failed save, or half as much damage on a successful one.",
            "Invisibility. The imp magically turns invisible until it attacks or until its concentration ends (as if concentrating on a spell). Any equipment the imp wears or carries is invisible with it."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, damage resistance, damage immunity, condition immunity, darkvision, magic resistance",
        source = "Monster Manual (SRD)"
    )
)

val lemure = registerFiendStatBlock(
    StatBlock(
        name = "Lemure",
        size = "Medium",
        type = "fiend (Devil)",
        alignment = "lawful evil",
        armorClass = "7",
        hitPoints = "13 (3d8)",
        speed = "15 ft.",
        str = 10, strMod = "+0",
        dex = 5, dexMod = "-3",
        con = 11, conMod = "+0",
        int = 1, intMod = "-5",
        wis = 11, wisMod = "+0",
        cha = 3, chaMod = "-4",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "cold",
        damageImmunities = "fire, poison",
        conditionResistances = null,
        conditionImmunities = "charmed, frightened, poisoned",
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 10",
        languages = "understands Infernal but can't speak",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Devil's Sight. Magical darkness doesn't impede the lemure's darkvision.",
            "Hellish Rejuvenation. A lemure that dies in the Nine Hells comes back to life with all its hit points in 1d10 days unless it is killed by a good-aligned creature with a bless spell cast on that creature or its remains are sprinkled with holy water."
        ),
        actions = listOf(
            "Fist. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 2 (1d4) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage resistance, damage immunity, condition immunity",
        source = "Monster Manual (SRD)"
    )
)

val marilith = registerFiendStatBlock(
    StatBlock(
        name = "Marilith",
        size = "Large",
        type = "fiend (Demon)",
        alignment = "chaotic evil",
        armorClass = "18 (natural armor)",
        hitPoints = "189 (18d10 + 90)",
        speed = "40 ft.",
        str = 18, strMod = "+4",
        dex = 20, dexMod = "+5",
        con = 20, conMod = "+5",
        int = 18, intMod = "+4",
        wis = 16, wisMod = "+3",
        cha = 20, chaMod = "+5",
        skills = null,
        savingThrows = "Str +9, Con +10, Wis +8, Cha +10",
        vulnerabilities = null,
        damageResistances = "cold, fire, lightning; bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "truesight 120 ft., passive Perception 13",
        languages = "Abyssal, telepathy 120 ft.",
        challengeRating = "16",
        expValue = "15000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Magic Resistance. The marilith has advantage on saving throws against spells and other magical effects.",
            "Magic Weapons. The marilith's weapon attacks are magical.",
            "Reactive. The marilith can take one reaction on every turn in a combat."
        ),
        actions = listOf(
            "Multiattack. The marilith makes seven attacks: six with its longswords and one with its tail.",
            "Longsword. Melee Weapon Attack: +9 to hit, reach 5 ft., one target. Hit: 13 (2d8 + 4) slashing damage.",
            "Tail. Melee Weapon Attack: +9 to hit, reach 10 ft., one creature. Hit: 15 (2d10 + 4) bludgeoning damage. If the target is Medium or smaller, it is grappled (escape DC 19). Until this grapple ends, the target is restrained, the marilith can automatically hit the target with its tail, and the marilith can't make tail attacks against other targets.",
            "Teleport. The marilith magically teleports, along with any equipment it is wearing or carrying, up to 120 feet to an unoccupied space it can see."
        ),
        bonusActions = listOf(),
        reactions = listOf(
            "Parry. The marilith adds 5 to its AC against one melee attack that would hit it. To do so, the marilith must see the attacker and be wielding a melee weapon."
        ),
        legendaryActions = listOf(),
        description = null,
        tags = "damage resistance, damage immunity, condition immunity, truesight, telepathic, magic resistance, multiattack, cc - grappled, cc - restrained",
        source = "Monster Manual (SRD)"
    )
)

val nalfeshnee = registerFiendStatBlock(
    StatBlock(
        name = "Nalfeshnee",
        size = "Large",
        type = "fiend (Demon)",
        alignment = "chaotic evil",
        armorClass = "18 (natural armor)",
        hitPoints = "184 (16d10 + 96)",
        speed = "20 ft., fly 30 ft.",
        str = 21, strMod = "+5",
        dex = 10, dexMod = "+0",
        con = 22, conMod = "+6",
        int = 19, intMod = "+4",
        wis = 12, wisMod = "+1",
        cha = 15, chaMod = "+2",
        skills = null,
        savingThrows = "Con +11, Int +9, Wis +6, Cha +7",
        vulnerabilities = null,
        damageResistances = "cold, fire, lightning; bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "truesight 120 ft., passive Perception 11",
        languages = "Abyssal, telepathy 120 ft.",
        challengeRating = "13",
        expValue = "10000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Magic Resistance. The nalfeshnee has advantage on saving throws against spells and other magical effects."
        ),
        actions = listOf(
            "Multiattack. The nalfeshnee uses Horror Nimbus if it can. It then makes three attacks: one with its bite and two with its claws.",
            "Bite. Melee Weapon Attack: +10 to hit, reach 5 ft., one target. Hit: 32 (5d10 + 5) piercing damage.",
            "Claw. Melee Weapon Attack: +10 to hit, reach 10 ft., one target. Hit: 15 (3d6 + 5) slashing damage.",
            "Horror Nimbus (Recharge 5-6). The nalfeshnee magically emits scintillating, multicolored light. Each creature within 15 feet of the nalfeshnee that can see the light must succeed on a DC 15 Wisdom saving throw or be frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the nalfeshnee's Horror Nimbus for the next 24 hours.",
            "Teleport. The nalfeshnee magically teleports, along with any equipment it is wearing or carrying, up to 120 feet to an unoccupied space it can see."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, damage resistance, damage immunity, condition immunity, truesight, telepathic, magic resistance, multiattack, cc - frightened",
        source = "Monster Manual (SRD)"
    )
)

val nightHag = registerFiendStatBlock(
    StatBlock(
        name = "Night Hag",
        size = "Medium",
        type = "fiend",
        alignment = "neutral evil",
        armorClass = "17 (natural armor)",
        hitPoints = "112 (15d8 + 45)",
        speed = "30 ft.",
        str = 18, strMod = "+4",
        dex = 15, dexMod = "+2",
        con = 16, conMod = "+3",
        int = 16, intMod = "+3",
        wis = 14, wisMod = "+2",
        cha = 16, chaMod = "+3",
        skills = "Deception +7, Insight +6, Perception +6, Stealth +6",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "cold, fire; bludgeoning, piercing, and slashing from nonmagical attacks not made with silvered weapons",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "charmed",
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 16",
        languages = "Abyssal, Common, Infernal, Primordial",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Innate Spellcasting. The hag's innate spellcasting ability is Charisma (spell save DC 14, +6 to hit with spell attacks). She can innately cast the following spells, requiring no material components:\n\nAt will: detect magic, magic missile\n2/day each: plane shift (self only), ray of enfeeblement, sleep",
            "Magic Resistance. The hag has advantage on saving throws against spells and other magical effects."
        ),
        actions = listOf(
            "Claws (Hag Form Only). Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 13 (2d8 + 4) slashing damage.",
            "Change Shape. The hag magically polymorphs into a Small or Medium female humanoid, or back into her true form. Her statistics are the same in each form. Any equipment she is wearing or carrying isn't transformed. She reverts to her true form if she dies.",
            "Etherealness. The hag magically enters the Ethereal Plane from the Material Plane, or vice versa. To do so, the hag must have a heartstone in her possession.",
            "Nightmare Haunting (1/Day). While on the Ethereal Plane, the hag magically touches a sleeping humanoid on the Material Plane. A protection from evil and good spell cast on the target prevents this contact, as does a magic circle. As long as the contact persists, the target has dreadful visions. If these visions last for at least 1 hour, the target gains no benefit from its rest, and its hit point maximum is reduced by 5 (1d10). If this effect reduces the target's hit point maximum to 0, the target dies, and if the target was evil, its soul is trapped in the hag's soul bag. The reduction to the target's hit point maximum lasts until removed by the greater restoration spell or similar magic."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage resistance, damage immunity, condition immunity, darkvision, magic resistance",
        source = "Monster Manual (SRD)"
    )
)

val nightmare = registerFiendStatBlock(
    StatBlock(
        name = "Nightmare",
        size = "Large",
        type = "fiend",
        alignment = "neutral evil",
        armorClass = "13 (natural armor)",
        hitPoints = "68 (8d10 + 24)",
        speed = "60 ft., fly 90 ft.",
        str = 18, strMod = "+4",
        dex = 15, dexMod = "+2",
        con = 16, conMod = "+3",
        int = 10, intMod = "+0",
        wis = 13, wisMod = "+1",
        cha = 15, chaMod = "+2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "fire",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 11",
        languages = "understands Abyssal, Common, and Infernal but can't speak",
        challengeRating = "3",
        expValue = "700 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Confer Fire Resistance. The nightmare can grant resistance to fire damage to anyone riding it.",
            "Illumination. The nightmare sheds bright light in a 10-foot radius and dim light for an additional 10 feet."
        ),
        actions = listOf(
            "Hooves. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 13 (2d8 + 4) bludgeoning damage plus 7 (2d6) fire damage.",
            "Ethereal Stride. The nightmare and up to three willing creatures within 5 feet of it magically enter the Ethereal Plane from the Material Plane, or vice versa."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, damage immunity",
        source = "Monster Manual (SRD)"
    )
)

val pitFiend = registerFiendStatBlock(
    StatBlock(
        name = "Pit Fiend",
        size = "Large",
        type = "fiend (Devil)",
        alignment = "lawful evil",
        armorClass = "19 (natural armor)",
        hitPoints = "300 (24d10 + 168)",
        speed = "30 ft., fly 60 ft.",
        str = 26, strMod = "+8",
        dex = 14, dexMod = "+2",
        con = 24, conMod = "+7",
        int = 22, intMod = "+6",
        wis = 18, wisMod = "+4",
        cha = 24, chaMod = "+7",
        skills = null,
        savingThrows = "Dex +8, Con +13, Wis +10",
        vulnerabilities = null,
        damageResistances = "cold; bludgeoning, piercing, and slashing from nonmagical attacks that aren't silvered",
        damageImmunities = "fire, poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "truesight 120 ft., passive Perception 14",
        languages = "Infernal, telepathy 120 ft.",
        challengeRating = "20",
        expValue = "25000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Fear Aura. Any creature hostile to the pit fiend that starts its turn within 20 feet of the pit fiend must make a DC 21 Wisdom saving throw, unless the pit fiend is incapacitated. On a failed save, the creature is frightened until the start of its next turn. If a creature's saving throw is successful, the creature is immune to the pit fiend's Fear Aura for the next 24 hours.",
            "Magic Resistance. The pit fiend has advantage on saving throws against spells and other magical effects.",
            "Magic Weapons. The pit fiend's weapon attacks are magical.",
            "Innate Spellcasting. The pit fiend's spellcasting ability is Charisma (spell save DC 21). The pit fiend can innately cast the following spells, requiring no material components:",
            "At will: detect magic, fireball",
            "3/day each: hold monster, wall of fire"
        ),
        actions = listOf(
            "Multiattack. The pit fiend makes four attacks: one with its bite, one with its claw, one with its mace, and one with its tail.",
            "Bite. Melee Weapon Attack: +14 to hit, reach 5 ft., one target. Hit: 22 (4d6 + 8) piercing damage. The target must succeed on a DC 21 Constitution saving throw or become poisoned. While poisoned in this way, the target can't regain hit points, and it takes 21 (6d6) poison damage at the start of each of its turns. The poisoned target can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success.",
            "Claw. Melee Weapon Attack: +14 to hit, reach 10 ft., one target. Hit: 17 (2d8 + 8) slashing damage.",
            "Mace. Melee Weapon Attack: +14 to hit, reach 10 ft., one target. Hit: 15 (2d6 + 8) bludgeoning damage plus 21 (6d6) fire damage.",
            "Tail. Melee Weapon Attack: +14 to hit, reach 10 ft., one target. Hit: 24 (3d10 + 8) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, damage resistance, damage immunity, condition immunity, truesight, telepathic, cc - frightened, magic resistance, multiattack, cc - poisoned",
        source = "Monster Manual (SRD)"
    )
)

val quasit = registerFiendStatBlock(
    StatBlock(
        name = "Quasit",
        size = "Tiny",
        type = "fiend (Demon, Shapechanger)",
        alignment = "chaotic evil",
        armorClass = "13",
        hitPoints = "7 (3d4)",
        speed = "40 ft.",
        str = 5, strMod = "-3",
        dex = 17, dexMod = "+3",
        con = 10, conMod = "+0",
        int = 7, intMod = "-2",
        wis = 10, wisMod = "+0",
        cha = 10, chaMod = "+0",
        skills = "Stealth +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "cold, fire, lightning; bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 10",
        languages = "Abyssal, Common",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Shapechanger. The quasit can use its action to polymorph into a beast form that resembles a bat (speed 10 ft., fly 40 ft.), a centipede (40 ft., climb 40 ft.), or a toad (40 ft., swim 40 ft.), or back into its true form. Its statistics are the same in each form, except for the speed changes noted. Any equipment it is wearing or carrying isn't transformed. It reverts to its true form if it dies.",
            "Magic Resistance. The quasit has advantage on saving throws against spells and other magical effects."
        ),
        actions = listOf(
            "Claws (Bite in Beast Form). Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 5 (1d4 + 3) piercing damage, and the target must succeed on a DC 10 Constitution saving throw or take 5 (2d4) poison damage and become poisoned for 1 minute. The target can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success.",
            "Scare (1/Day). One creature of the quasit's choice within 20 feet of it must succeed on a DC 10 Wisdom saving throw or be frightened for 1 minute. The target can repeat the saving throw at the end of each of its turns, with disadvantage if the quasit is within line of sight, ending the effect on itself on a success.",
            "Invisibility. The quasit magically turns invisible until it attacks or uses Scare, or until its concentration ends (as if concentrating on a spell). Any equipment the quasit wears or carries is invisible with it."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage resistance, damage immunity, condition immunity, darkvision, magic resistance, cc - frightened",
        source = "Monster Manual (SRD)"
    )
)

val rakshasa = registerFiendStatBlock(
    StatBlock(
        name = "Rakshasa",
        size = "Medium",
        type = "fiend",
        alignment = "lawful evil",
        armorClass = "16 (natural armor)",
        hitPoints = "110 (13d8 + 52)",
        speed = "40 ft.",
        str = 14, strMod = "+2",
        dex = 17, dexMod = "+3",
        con = 18, conMod = "+4",
        int = 13, intMod = "+1",
        wis = 16, wisMod = "+3",
        cha = 20, chaMod = "+5",
        skills = "Deception +10, Insight +8",
        savingThrows = null,
        vulnerabilities = "piercing from magic weapons wielded by good creatures",
        damageResistances = null,
        damageImmunities = "bludgeoning, piercing, and slashing from nonmagical attacks",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 13",
        languages = "Common, Infernal",
        challengeRating = "13",
        expValue = "10000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Limited Magic Immunity. The rakshasa can't be affected or detected by spells of 6th level or lower unless it wishes to be. It has advantage on saving throws against all other spells and magical effects.",
            "Innate Spellcasting. The rakshasa's innate spellcasting ability is Charisma (spell save DC 18, +10 to hit with spell attacks). The rakshasa can innately cast the following spells, requiring no material components:\n\nAt will: detect thoughts, disguise self, mage hand, minor illusion\n3/day each: charm person, detect magic, invisibility, major image, suggestion\n1/day each: dominate person, fly, plane shift, true seeing"
        ),
        actions = listOf(
            "Multiattack. The rakshasa makes two claw attacks.",
            "Claw. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 9 (2d6 + 2) slashing damage, and the target is cursed if it is a creature. The magical curse takes effect whenever the target takes a short or long rest, filling the target's thoughts with horrible images and dreams. The cursed target gains no benefit from finishing a short or long rest. The curse lasts until it is lifted by a remove curse spell or similar magic."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage immunity, darkvision, multiattack, magic resistance",
        source = "Monster Manual (SRD)"
    )
)

val succubus = registerFiendStatBlock(
    StatBlock(
        name = "Succubus",
        size = "Medium",
        type = "fiend",
        alignment = "neutral evil",
        armorClass = "15 (natural armor)",
        hitPoints = "66 (12d8 + 12)",
        speed = "30 ft., fly 60 ft.",
        str = 8, strMod = "-1",
        dex = 17, dexMod = "+3",
        con = 13, conMod = "+1",
        int = 15, intMod = "+2",
        wis = 12, wisMod = "+1",
        cha = 20, chaMod = "+5",
        skills = "Deception +9, Insight +5, Perception +5, Persuasion +9, Stealth +7",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "cold, fire, lightning, poison; bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 15",
        languages = "Abyssal, Common, Infernal, telepathy 60 ft.",
        challengeRating = "4",
        expValue = "1100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Telepathic Bond. The fiend ignores the range restriction on its telepathy when communicating with a creature it has charmed. The two don't even need to be on the same plane of existence.",
            "Shapechanger. The fiend can use its action to polymorph into a Small or Medium humanoid, or back into its true form. Without wings, the fiend loses its flying speed. Other than its size and speed, its statistics are the same in each form. Any equipment it is wearing or carrying isn't transformed. It reverts to its true form if it dies."
        ),
        actions = listOf(
            "Claw (Fiend Form Only). Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 6 (1d6 + 3) slashing damage.",
            "Charm. One humanoid the fiend can see within 30 feet of it must succeed on a DC 15 Wisdom saving throw or be magically charmed for 1 day. The charmed target obeys the fiend's verbal or telepathic commands. If the target suffers any harm or receives a suicidal command, it can repeat the saving throw, ending the effect on a success. If the target successfully saves against the effect, or if the effect on it ends, the target is immune to this fiend's Charm for the next 24 hours. The fiend can have only one target charmed at a time. If it charms another, the effect on the previous target ends.",
            "Draining Kiss. The fiend kisses a creature charmed by it or a willing creature. The target must make a DC 15 Constitution saving throw against this magic, taking 32 (5d10 + 5) psychic damage on a failed save, or half as much damage on a successful one. The target's hit point maximum is reduced by an amount equal to the damage taken. This reduction lasts until the target finishes a long rest. The target dies if this effect reduces its hit point maximum to 0.",
            "Etherealness. The fiend magically enters the Ethereal Plane from the Material Plane, or vice versa."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Succubi and incubi inhabit the Lower Planes. Asmodeus, ruler of the Nine Hells, uses these fiends to tempt mortals to perform evil acts. Any succubus (female) can become an incubus (male), and vice versa, but most of these fiends do have a preference for one form or the other.",
        tags = "fly speed, damage resistance, darkvision, telepathic, cc - charmed",
        source = "Monster Manual (SRD)"
    )
)

val incubus = registerFiendStatBlock(
    StatBlock(
        name = "Incubus",
        size = "Medium",
        type = "fiend",
        alignment = "neutral evil",
        armorClass = "15 (natural armor)",
        hitPoints = "66 (12d8 + 12)",
        speed = "30 ft., fly 60 ft.",
        str = 8, strMod = "-1",
        dex = 17, dexMod = "+3",
        con = 13, conMod = "+1",
        int = 15, intMod = "+2",
        wis = 12, wisMod = "+1",
        cha = 20, chaMod = "+5",
        skills = "Deception +9, Insight +5, Perception +5, Persuasion +9, Stealth +7",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "cold, fire, lightning, poison; bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 15",
        languages = "Abyssal, Common, Infernal, telepathy 60 ft.",
        challengeRating = "4",
        expValue = "1100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Telepathic Bond. The fiend ignores the range restriction on its telepathy when communicating with a creature it has charmed. The two don't even need to be on the same plane of existence.",
            "Shapechanger. The fiend can use its action to polymorph into a Small or Medium humanoid, or back into its true form. Without wings, the fiend loses its flying speed. Other than its size and speed, its statistics are the same in each form. Any equipment it is wearing or carrying isn't transformed. It reverts to its true form if it dies."
        ),
        actions = listOf(
            "Claw (Fiend Form Only). Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 6 (1d6 + 3) slashing damage.",
            "Charm. One humanoid the fiend can see within 30 feet of it must succeed on a DC 15 Wisdom saving throw or be magically charmed for 1 day. The charmed target obeys the fiend's verbal or telepathic commands. If the target suffers any harm or receives a suicidal command, it can repeat the saving throw, ending the effect on a success. If the target successfully saves against the effect, or if the effect on it ends, the target is immune to this fiend's Charm for the next 24 hours. The fiend can have only one target charmed at a time. If it charms another, the effect on the previous target ends.",
            "Draining Kiss. The fiend kisses a creature charmed by it or a willing creature. The target must make a DC 15 Constitution saving throw against this magic, taking 32 (5d10 + 5) psychic damage on a failed save, or half as much damage on a successful one. The target's hit point maximum is reduced by an amount equal to the damage taken. This reduction lasts until the target finishes a long rest. The target dies if this effect reduces its hit point maximum to 0.",
            "Etherealness. The fiend magically enters the Ethereal Plane from the Material Plane, or vice versa."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Succubi and incubi inhabit the Lower Planes. Asmodeus, ruler of the Nine Hells, uses these fiends to tempt mortals to perform evil acts. Any succubus (female) can become an incubus (male), and vice versa, but most of these fiends do have a preference for one form or the other.",
        tags = "fly speed, damage resistance, darkvision, telepathic, cc - charmed",
        source = "Monster Manual (SRD)"
    )
)

val vrock = registerFiendStatBlock(
    StatBlock(
        name = "Vrock",
        size = "Large",
        type = "fiend",
        alignment = "chaotic evil",
        armorClass = "15 (natural armor)",
        hitPoints = "104 (11d10 + 44)",
        speed = "40 ft., fly 60 ft.",
        str = 17, strMod = "+3",
        dex = 15, dexMod = "+2",
        con = 18, conMod = "+4",
        int = 8, intMod = "-1",
        wis = 13, wisMod = "+1",
        cha = 8, chaMod = "-1",
        skills = null,
        savingThrows = "Dex +5, Wis +4, Cha +2",
        vulnerabilities = null,
        damageResistances = "cold, fire, lightning; bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 11",
        languages = "Abyssal, telepathy 120 ft.",
        challengeRating = "6",
        expValue = "2300 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Magic Resistance. The vrock has advantage on saving throws against spells and other magical effects."
        ),
        actions = listOf(
            "Multiattack. The vrock makes two attacks: one with its beak and one with its talons.",
            "Beak. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 10 (2d6 + 3) piercing damage.",
            "Talons. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 14 (2d10 + 3) slashing damage.",
            "Spores (Recharge 6). A 15-foot-radius cloud of toxic spores extends out from the vrock. The spores spread around corners. Each creature in that area must succeed on a DC 14 Constitution saving throw or become poisoned. While poisoned in this way, a target takes 5 (1d10) poison damage at the start of each of its turns. A target can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. Emptying a vial of holy water on the target also ends the effect on it.",
            "Stunning Screech (1/Day). The vrock emits a horrific screech. Each creature within 20 feet of it that can hear it and that isn't a demon must succeed on a DC 14 Constitution saving throw or be stunned until the end of the vrock's next turn."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, damage resistance, damage immunity, condition immunity, darkvision, telepathic, magic resistance, multiattack, cc - poisoned, cc - stunned",
        source = "Monster Manual (SRD)"
    )
)

val yochlol = registerFiendStatBlock(
    StatBlock(
        name = "Yochlol",
        size = "Medium",
        type = "fiend",
        alignment = "chaotic evil",
        armorClass = "15 (natural armor)",
        hitPoints = "136 (16d8 + 64)",
        speed = "30 ft., climb 30 ft.",
        str = 15, strMod = "+2",
        dex = 14, dexMod = "+2",
        con = 18, conMod = "+4",
        int = 13, intMod = "+1",
        wis = 15, wisMod = "+2",
        cha = 15, chaMod = "+2",
        skills = "Deception +10, Insight +6",
        savingThrows = "Dex +6, Int +5, Wis +6, Cha +6",
        vulnerabilities = null,
        damageResistances = "cold, fire, lightning; bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "poisoned",
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 12",
        languages = "Abyssal, Elvish, Undercommon",
        challengeRating = "10",
        expValue = "5900 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Shapechanger. The yochlol can use its action to polymorph into a form that resembles a female drow or giant spider, or back into its true form. Its statistics are the same in each form. Any equipment it is wearing or carrying isn't transformed. It reverts to its true form if it dies.",
            "Magic Resistance. The yochlol has advantage on saving throws against spells and other magical effects.",
            "Spider Climb. The yochlol can climb difficult surfaces, including upside down on ceilings, without needing to make an ability check.",
            "Innate Spellcasting. The yochlol's spellcasting ability is Charisma (spell save DC 14). The yochlol can innately cast the following spells, requiring no material components:\nAt will: detect thoughts, web\n1/day: dominate person",
            "Web Walker. The yochlol ignores movement restrictions caused by webbing."
        ),
        actions = listOf(
            "Multiattack. The yochlol makes two melee attacks.",
            "Slam (Bite in Spider Form). Melee Weapon Attack: +6 to hit, reach 5 ft. (10 ft. in demon form), one target. Hit: 5 (1d6 + 2) bludgeoning (piercing in spider form) damage plus 21 (6d6) poison damage.",
            "Mist Form. The yochlol transforms into toxic mist or reverts to its true form. Any equipment it is wearing or carrying is also transformed. It reverts to its true form if it dies. While in mist form, the yochlol is incapacitated and can't speak. It has a flying speed of 30 feet, can hover, and can pass through any space that isn't airtight. It has advantage on Strength, Dexterity, and Constitution saving throws, and it is immune to nonmagical damage. While in mist form, the yochlol can enter a creature's space and stop there. Each time that creature starts its turn with the yochlol in its space, the creature must succeed on a DC 14 Constitution saving throw or be poisoned until the start of its next turn. While poisoned in this way, the target is incapacitated."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "climb speed, damage resistance, damage immunity, condition immunity, darkvision, magic resistance, multiattack, cc - poisoned, cc - incapacitated",
        source = "Monster Manual (SRD)"
    )
)


//Summons and Spell effects
