package com.example.wildshapesmountsandfamiliars.ui.screens.creatureType


import androidx.compose.runtime.Composable
import com.example.wildshapesmountsandfamiliars.ui.screens.ConstructStatBlockSpellEffectOrSummon
import com.example.wildshapesmountsandfamiliars.ui.screens.ConstructStatBlocks
import com.example.wildshapesmountsandfamiliars.ui.screens.CreatureTypeScreen
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.registerConstructStatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.registerConstructStatBlockSpellEffectOrSummon


@Composable
fun Constructs(
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
        title = "Constructs",
        statBlocks = ConstructStatBlocks,
        spellEffectOrSummons = ConstructStatBlockSpellEffectOrSummon,
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

val animatedArmor = registerConstructStatBlock(
    StatBlock(
        name = "Animated Armor",
        size = "Medium",
        type = "construct",
        alignment = "unaligned",
        armorClass = "18 (natural armor)",
        hitPoints = "33 (6d8 + 6)",
        speed = "25 ft.",
        str = 14, strMod = "+2",
        dex = 11, dexMod = "+0",
        con = 13, conMod = "+1",
        int = 1, intMod = "-5",
        wis = 3, wisMod = "-4",
        cha = 1, chaMod = "-5",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "poison, psychic",
        conditionResistances = null,
        conditionImmunities = "blinded, charmed, deafened, exhaustion, frightened, paralyzed, petrified, poisoned",
        legendaryResistance = null,
        senses = "blindsight 60 ft. (blind beyond this radius), passive Perception 6",
        languages = "—",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Antimagic Susceptibility. The armor is incapacitated while in the area of an antimagic field. If targeted by dispel magic, the armor must succeed on a Constitution saving throw against the caster's spell save DC or fall unconscious for 1 minute.",
            "False Appearance. While the armor remains motionless, it is indistinguishable from a normal suit of armor."
        ),
        actions = listOf(
            "Multiattack. The armor makes two melee attacks.",
            "Slam. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 5 (1d6 + 2) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = emptyList(),
        description = "This suit of magically animated plate armor clamors as it moves, banging and grinding like the vengeful spirit of a fallen knight.",
        tags = "blindsight, multiattack, damage immunity, condition immunity",
        source = "Monster Manual (SRD)"
    )
)

val clayGolem = registerConstructStatBlock(
    StatBlock(
        name = "Clay Golem",
        size = "Large",
        type = "construct",
        alignment = "unaligned",
        armorClass = "14 (natural armor)",
        hitPoints = "133 (14d10 + 56)",
        speed = "20 ft.",
        str = 20, strMod = "+5",
        dex = 9, dexMod = "-1",
        con = 18, conMod = "+4",
        int = 3, intMod = "-4",
        wis = 8, wisMod = "-1",
        cha = 1, chaMod = "-5",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "acid, poison, psychic; bludgeoning, piercing and slashing from nonmagical attacks that aren't adamantine",
        conditionResistances = null,
        conditionImmunities = "charmed, exhaustion, frightened, paralyzed, petrified, poisoned",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 9",
        languages = "understands the languages of its creator but can't speak",
        challengeRating = "9",
        expValue = "5000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Acid Absorption. Whenever the golem is subjected to acid damage, it takes no damage and instead regains a number of hit points equal to the acid damage dealt.",
            "Berserk. Whenever the golem starts its turn with 60 hit points or fewer, roll a d6. On a 6, the golem goes berserk. On each of its turns while berserk, the golem attacks the nearest creature it can see. If no creature is near enough to move to and attack, the golem attacks an object, with preference for an object smaller than itself. Once the golem goes berserk, it continues to do so until it is destroyed or regains all its hit points.",
            "Immutable Form. The golem is immune to any spell or effect that would alter its form.",
            "Magic Resistance. The golem has advantage on saving throws against spells and other magical effects.",
            "Magic Weapons. The golem's weapon attacks are magical."
        ),
        actions = listOf(
            "Multiattack. The golem makes two slam attacks.",
            "Slam. Melee Weapon Attack: +8 to hit, reach 5 ft., one target. Hit: 16 (2d10 + 5) bludgeoning damage. If the target is a creature, it must succeed on a DC 15 Constitution saving throw or have its hit point maximum reduced by an amount equal to the damage taken. The target dies if this attack reduces its hit point maximum to 0. The reduction lasts until removed by the greater restoration spell or other magic.",
            "Haste (Recharge 5-6). Until the end of its next turn, the golem magically gains a +2 bonus to its AC, has advantage on Dexterity saving throws, and can use its slam attack as a bonus action."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = emptyList(),
        description = null,
        tags = "darkvision, magic resistance, damage immunity, condition immunity, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val fleshGolem = registerConstructStatBlock(
    StatBlock(
        name = "Flesh Golem",
        size = "Medium",
        type = "construct",
        alignment = "neutral",
        armorClass = "9",
        hitPoints = "93 (11d8 + 44)",
        speed = "30 ft.",
        str = 19, strMod = "+4",
        dex = 9, dexMod = "-1",
        con = 18, conMod = "+4",
        int = 6, intMod = "-2",
        wis = 10, wisMod = "+0",
        cha = 5, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "lightning, poison; bludgeoning, piercing, and slashing from nonmagical attacks that aren't adamantine",
        conditionResistances = null,
        conditionImmunities = "charmed, exhaustion, frightened, paralyzed, petrified, poisoned",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "understands the languages of its creator but can't speak",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Berserk. Whenever the golem starts its turn with 40 hit points or fewer, roll a d6. On a 6, the golem goes berserk. On each of its turns while berserk, the golem attacks the nearest creature it can see. If no creature is near enough to move to and attack, the golem attacks an object, with preference for an object smaller than itself. Once the golem goes berserk, it continues to do so until it is destroyed or regains all its hit points. The golem's creator, if within 60 feet of the berserk golem, can try to calm it by speaking firmly and persuasively. The golem must be able to hear its creator, who must take an action to make a DC 15 Charisma (Persuasion) check. If the check succeeds, the golem ceases being berserk. If it takes damage while still at 40 hit points or fewer, the golem might go berserk again.",
            "Aversion of Fire. If the golem takes fire damage, it has disadvantage on attack rolls and ability checks until the end of its next turn.",
            "Immutable Form. The golem is immune to any spell or effect that would alter its form.",
            "Lightning Absorption. Whenever the golem is subjected to lightning damage, it takes no damage and instead regains a number of hit points equal to the lightning damage dealt.",
            "Magic Resistance. The golem has advantage on saving throws against spells and other magical effects.",
            "Magic Weapons. The golem's weapon attacks are magical."
        ),
        actions = listOf(
            "Multiattack. The golem makes two slam attacks.",
            "Slam. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 13 (2d8 + 4) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = emptyList(),
        description = "A flesh golem is a grisly assortment of humanoid body parts stitched and bolted together into a muscled brute imbued with formidable strength. Powerful enchantments protect it, deflecting spells and all but the most potent weapons.",
        tags = "damage immunity, condition immunity, darkvision, magic resistance, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val flyingSword = registerConstructStatBlock(
    StatBlock(
        name = "Flying Sword",
        size = "Small",
        type = "construct",
        alignment = "unaligned",
        armorClass = "17 (natural armor)",
        hitPoints = "17 (5d6)",
        speed = "0 ft., fly 50 ft. (hover)",
        str = 12, strMod = "+1",
        dex = 15, dexMod = "+2",
        con = 11, conMod = "+0",
        int = 1, intMod = "-5",
        wis = 5, wisMod = "-3",
        cha = 1, chaMod = "-5",
        skills = null,
        savingThrows = "Dex +4",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "poison, psychic",
        conditionResistances = null,
        conditionImmunities = "blinded, charmed, deafened, frightened, paralyzed, petrified, poisoned",
        legendaryResistance = null,
        senses = "blindsight 60 ft. (blind beyond this radius), passive Perception 7",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Antimagic Susceptibility. The sword is incapacitated while in the area of an antimagic field. If targeted by dispel magic, the sword must succeed on a Constitution saving throw against the caster's spell save DC or fall unconscious for 1 minute.",
            "False Appearance. While the sword remains motionless and isn't flying, it is indistinguishable from a normal sword."
        ),
        actions = listOf(
            "Longsword. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 5 (1d8 + 1) slashing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = emptyList(),
        description = "A magically animated flying sword dances through the air, fighting like a warrior that can't be injured.",
        tags = "blindsight, fly speed, hover",
        source = "Monster Manual (SRD)"
    )
)

val homunculus = registerConstructStatBlock(
    StatBlock(
        name = "Homunculus",
        size = "Tiny",
        type = "construct",
        alignment = "neutral",
        armorClass = "13 (natural armor)",
        hitPoints = "5 (2d4)",
        speed = "20 ft., fly 40 ft.",
        str = 4, strMod = "-3",
        dex = 15, dexMod = "+2",
        con = 11, conMod = "+0",
        int = 10, intMod = "+0",
        wis = 10, wisMod = "+0",
        cha = 7, chaMod = "-2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "charmed, poisoned",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "understands the languages of its creator but can't speak",
        challengeRating = "0",
        expValue = "10 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Telepathic Bond. While the homunculus is on the same plane of existence as its master, it can magically convey what it senses to its master, and the two can communicate telepathically."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one creature. Hit: 1 piercing damage, and the target must succeed on a DC 10 Constitution saving throw or be poisoned for 1 minute. If the saving throw fails by 5 or more, the target is instead poisoned for 5 (1d10) minutes and unconscious while poisoned in this way."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = emptyList(),
        description = null,
        tags = "darkvision, fly speed, telepathic, damage immunity, condition immunity, cc - poisoned, cc - unconscious",
        source = "Monster Manual (SRD)"
    )
)

val ironGolem = registerConstructStatBlock(
    StatBlock(
        name = "Iron Golem",
        size = "Large",
        type = "construct",
        alignment = "unaligned",
        armorClass = "20 (natural armor)",
        hitPoints = "210 (20d10 + 100)",
        speed = "30 ft.",
        str = 24, strMod = "+7",
        dex = 9, dexMod = "-1",
        con = 20, conMod = "+5",
        int = 3, intMod = "-4",
        wis = 11, wisMod = "+0",
        cha = 1, chaMod = "-5",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "fire, poison, psychic; bludgeoning, piercing, and slashing from nonmagical attacks that aren't adamantine",
        conditionResistances = null,
        conditionImmunities = "charmed, exhaustion, frightened, paralyzed, petrified, poisoned",
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 10",
        languages = "understands the languages of its creator but can't speak",
        challengeRating = "16",
        expValue = "15000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Fire Absorption. Whenever the golem is subjected to fire damage, it takes no damage and instead regains a number of hit points equal to the fire damage dealt.",
            "Immutable Form. The golem is immune to any spell or effect that would alter its form.",
            "Magic Resistance. The golem has advantage on saving throws against spells and other magical effects.",
            "Magic Weapons. The golem's weapon attacks are magical."
        ),
        actions = listOf(
            "Multiattack. The golem makes two melee attacks.",
            "Slam. Melee Weapon Attack: +13 to hit, reach 5 ft., one target. Hit: 20 (3d8 + 7) bludgeoning damage.",
            "Sword. Melee Weapon Attack: +13 to hit, reach 10 ft., one target. Hit: 23 (3d10 + 7) slashing damage.",
            "Poison Breath (Recharge 6). The golem exhales poisonous gas in a 15-foot cone. Each creature in that area must make a DC 19 Constitution saving throw, taking 45 (10d8) poison damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = emptyList(),
        description = null,
        tags = "damage immunity, condition immunity, darkvision, magic resistance, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val rugOfSmothering = registerConstructStatBlock(
    StatBlock(
        name = "Rug of Smothering",
        size = "Large",
        type = "construct",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "33 (6d10)",
        speed = "10 ft.",
        str = 17, strMod = "+3",
        dex = 14, dexMod = "+2",
        con = 10, conMod = "+0",
        int = 1, intMod = "-5",
        wis = 3, wisMod = "-4",
        cha = 1, chaMod = "-5",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "poison, psychic",
        conditionResistances = null,
        conditionImmunities = "blinded, charmed, deafened, frightened, paralyzed, petrified, poisoned",
        legendaryResistance = null,
        senses = "blindsight 60 ft. (blind beyond this radius), passive Perception 6",
        languages = "—",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Antimagic Susceptibility. The rug is incapacitated while in the area of an antimagic field. If targeted by dispel magic, the rug must succeed on a Constitution saving throw against the caster's spell save DC or fall unconscious for 1 minute.",
            "Damage Transfer. While it is grappling a creature, the rug takes only half the damage dealt to it, and the creature grappled by the rug takes the other half.",
            "False Appearance. While the rug remains motionless, it is indistinguishable from a normal rug."
        ),
        actions = listOf(
            "Smother. Melee Weapon Attack: +5 to hit, reach 5 ft., one Medium or smaller creature. Hit: The creature is grappled (escape DC 13). Until this grapple ends, the target is restrained, blinded, and at risk of suffocating, and the rug can't smother another target. In addition, at the start of each of the target's turns, the target takes 10 (2d6 + 3) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = emptyList(),
        description = null,
        tags = "damage immunity, condition immunity, blindsight, cc - grappled, cc - restrained, cc - blinded",
        source = "Monster Manual (SRD)"
    )
)

val shieldGuardian = registerConstructStatBlock(
    StatBlock(
        name = "Shield Guardian",
        size = "Large",
        type = "construct",
        alignment = "unaligned",
        armorClass = "17 (natural armor)",
        hitPoints = "142 (15d10 + 60)",
        speed = "30 ft.",
        str = 18, strMod = "+4",
        dex = 8, dexMod = "-1",
        con = 18, conMod = "+4",
        int = 7, intMod = "-2",
        wis = 10, wisMod = "+0",
        cha = 3, chaMod = "-4",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "charmed, exhaustion, frightened, paralyzed, poisoned",
        legendaryResistance = null,
        senses = "blindsight 10 ft., darkvision 60 ft., passive Perception 10",
        languages = "understands commands given in any language but can't speak",
        challengeRating = "7",
        expValue = "2900 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Bound. The shield guardian is magically bound to an amulet. As long as the guardian and its amulet are on the same plane of existence, the amulet's wearer can telepathically call the guardian to travel to it, and the guardian knows the distance and direction to the amulet. If the guardian is within 60 feet of the amulet's wearer, half of any damage the wearer takes (rounded up) is transferred to the guardian.",
            "Regeneration. The shield guardian regains 10 hit points at the start of its turn if it has at least 1 hit point.",
            "Spell Storing. A spellcaster who wears the shield guardian's amulet can cause the guardian to store one spell of 4th level or lower. To do so, the wearer must cast the spell on the guardian. The spell has no effect but is stored within the guardian. When commanded to do so by the wearer or when a situation arises that was predefined by the spellcaster, the guardian casts the stored spell with any parameters set by the original caster, requiring no components. When the spell is cast or a new spell is stored, any previously stored spell is lost."
        ),
        actions = listOf(
            "Multiattack. The guardian makes two fist attacks.",
            "Fist. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 11 (2d6 + 4) bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(
            "Shield. When a creature makes an attack against the wearer of the guardian's amulet, the guardian grants a +2 bonus to the wearer's AC if the guardian is within 5 feet of the wearer."
        ),
        legendaryActions = emptyList(),
        description = null,
        tags = "blindsight, darkvision, damage immunity, condition immunity, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val stoneGolem = registerConstructStatBlock(
    StatBlock(
        name = "Stone Golem",
        size = "Large",
        type = "construct",
        alignment = "unaligned",
        armorClass = "17 (natural armor)",
        hitPoints = "178 (17d10 + 85)",
        speed = "30 ft.",
        str = 22, strMod = "+6",
        dex = 9, dexMod = "-1",
        con = 20, conMod = "+5",
        int = 3, intMod = "-4",
        wis = 11, wisMod = "+0",
        cha = 1, chaMod = "-5",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "poison, psychic; bludgeoning, piercing, and slashing from nonmagical attacks that aren't adamantine",
        conditionResistances = null,
        conditionImmunities = "charmed, exhaustion, frightened, paralyzed, petrified, poisoned",
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 10",
        languages = "understands the languages of its creator but can't speak",
        challengeRating = "10",
        expValue = "5900 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Immutable Form. The golem is immune to any spell or effect that would alter its form.",
            "Magic Resistance. The golem has advantage on saving throws against spells and other magical effects.",
            "Magic Weapons. The golem's weapon attacks are magical."
        ),
        actions = listOf(
            "Multiattack. The golem makes two slam attacks.",
            "Slam. Melee Weapon Attack: +10 to hit, reach 5 ft., one target. Hit: 19 (3d8 + 6) bludgeoning damage.",
            "Slow (Recharge 5-6). The golem targets one or more creatures it can see within 10 feet of it. Each target must make a DC 17 Wisdom saving throw against this magic. On a failed save, a target can't use reactions, its speed is halved, and it can't make more than one attack on its turn. In addition, the target can take either an action or a bonus action on its turn, not both. These effects last for 1 minute. A target can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = emptyList(),
        description = "Stone golems are magical constructs cut and chiseled from stone to appear as tall, impressive statues. Like other golems, they are nearly impervious to spells and ordinary weapons.",
        tags = "damage immunity, condition immunity, darkvision, magic resistance, multiattack",
        source = "Monster Manual (SRD)"
    )
)

// Spell Effects and Summons


val animatedObjectTinyFlying = registerConstructStatBlockSpellEffectOrSummon(
    StatBlock(
        name = "Animated Object, Tiny - Flying (Animate Objects)",
        size = "Tiny",
        type = "construct",
        alignment = "unaligned",
        armorClass = "18",
        hitPoints = "20",
        speed = "fly 30 ft. (hover)",
        str = 4, strMod = "-3",
        dex = 18, dexMod = "+4",
        con = 10, conMod = "+0",
        int = 3, intMod = "-4",
        wis = 3, wisMod = "-4",
        cha = 1, chaMod = "-5",
        skills = "",
        savingThrows = "",
        vulnerabilities = "",
        damageResistances = "",
        damageImmunities = "",
        conditionResistances = "",
        conditionImmunities = "",
        legendaryResistance = "",
        senses = "blindsight 30 ft. (blind beyond this radius), passive Perception 6",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50",
        proficiencyBonus = "",
        traits = listOf(),
        actions = listOf(
            "Slam. Melee Weapon Attack: +8 to hit, reach 5 ft., one target. Hit: 1d4 + 4 bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "An animated object is a construct with AC, hit points, attacks, Strength, and Dexterity determined by its size. Its Constitution is 10 and its Intelligence and Wisdom are 3, and its Charisma is 1. Its speed is 30 feet; if the objects lack legs or other appendages it can use for locomotion, it instead has a flying speed of 30 feet and can hover. If the object is securely attached to a surface or larger object, such as a chain bolted to a wall, its speed is 0. It has blindsight with a radius of 30 feet and is blind beyond that distance. When the animated object drops to 0 hit points, it reverts to its original object form, and any remaining damage carries over to its original object form.\n" +
                "\n" +
                "If you command an object to attack, it can make a single melee attack against a creature within 5 feet of it. It makes a slam attack with an attack bonus and bludgeoning damage determined by its size. The DM might rule that a specific object inflicts slashing or piercing damage based on its form.\n" +
                "\n" +
                "At Higher Levels. If you cast this spell using a spell slot of 6th level or higher, you can animate two additional objects for each slot level above 5th.",
        tags = "fly speed, hover, blindsight",
        source = "Animate Objects; Player's Handbook (SRD)"
    )
)

val animatedObjectTinyWalking = registerConstructStatBlockSpellEffectOrSummon(
    StatBlock(
        name = "Animated Object, Tiny - Walking (Animate Objects)",
        size = "Tiny",
        type = "construct",
        alignment = "unaligned",
        armorClass = "18",
        hitPoints = "20",
        speed = "30 ft.",
        str = 4, strMod = "-3",
        dex = 18, dexMod = "+4",
        con = 10, conMod = "+0",
        int = 3, intMod = "-4",
        wis = 3, wisMod = "-4",
        cha = 1, chaMod = "-5",
        skills = "",
        savingThrows = "",
        vulnerabilities = "",
        damageResistances = "",
        damageImmunities = "",
        conditionResistances = "",
        conditionImmunities = "",
        legendaryResistance = "",
        senses = "blindsight 30 ft. (blind beyond this radius), passive Perception 6",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50",
        proficiencyBonus = "",
        traits = listOf(),
        actions = listOf(
            "Slam. Melee Weapon Attack: +8 to hit, reach 5 ft., one target. Hit: 1d4 + 4 bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "An animated object is a construct with AC, hit points, attacks, Strength, and Dexterity determined by its size. Its Constitution is 10 and its Intelligence and Wisdom are 3, and its Charisma is 1. Its speed is 30 feet; if the objects lack legs or other appendages it can use for locomotion, it instead has a flying speed of 30 feet and can hover. If the object is securely attached to a surface or larger object, such as a chain bolted to a wall, its speed is 0. It has blindsight with a radius of 30 feet and is blind beyond that distance. When the animated object drops to 0 hit points, it reverts to its original object form, and any remaining damage carries over to its original object form.\n" +
                "\n" +
                "If you command an object to attack, it can make a single melee attack against a creature within 5 feet of it. It makes a slam attack with an attack bonus and bludgeoning damage determined by its size. The DM might rule that a specific object inflicts slashing or piercing damage based on its form.\n" +
                "\n" +
                "At Higher Levels. If you cast this spell using a spell slot of 6th level or higher, you can animate two additional objects for each slot level above 5th.",
        tags = "blindsight",
        source = "Animate Objects; Player's Handbook (SRD)"
    )
)

val animatedObjectTinyStationary = registerConstructStatBlockSpellEffectOrSummon(
    StatBlock(
        name = "Animated Object, Tiny - Stationary (Animate Objects)",
        size = "Tiny",
        type = "construct",
        alignment = "unaligned",
        armorClass = "18",
        hitPoints = "20",
        speed = "0 ft.",
        str = 4, strMod = "-3",
        dex = 18, dexMod = "+4",
        con = 10, conMod = "+0",
        int = 3, intMod = "-4",
        wis = 3, wisMod = "-4",
        cha = 1, chaMod = "-5",
        skills = "",
        savingThrows = "",
        vulnerabilities = "",
        damageResistances = "",
        damageImmunities = "",
        conditionResistances = "",
        conditionImmunities = "",
        legendaryResistance = "",
        senses = "blindsight 30 ft. (blind beyond this radius), passive Perception 6",
        languages = "—",
        challengeRating = "1/4",
        expValue = "50",
        proficiencyBonus = "",
        traits = listOf(),
        actions = listOf(
            "Slam. Melee Weapon Attack: +8 to hit, reach 5 ft., one target. Hit: 1d4 + 4 bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "An animated object is a construct with AC, hit points, attacks, Strength, and Dexterity determined by its size. Its Constitution is 10 and its Intelligence and Wisdom are 3, and its Charisma is 1. Its speed is 30 feet; if the objects lack legs or other appendages it can use for locomotion, it instead has a flying speed of 30 feet and can hover. If the object is securely attached to a surface or larger object, such as a chain bolted to a wall, its speed is 0. It has blindsight with a radius of 30 feet and is blind beyond that distance. When the animated object drops to 0 hit points, it reverts to its original object form, and any remaining damage carries over to its original object form.\n" +
                "\n" +
                "If you command an object to attack, it can make a single melee attack against a creature within 5 feet of it. It makes a slam attack with an attack bonus and bludgeoning damage determined by its size. The DM might rule that a specific object inflicts slashing or piercing damage based on its form.\n" +
                "\n" +
                "At Higher Levels. If you cast this spell using a spell slot of 6th level or higher, you can animate two additional objects for each slot level above 5th.",
        tags = "blindsight",
        source = "Animate Objects; Player's Handbook (SRD)"
    )
)

val animatedObjectSmallFlying = registerConstructStatBlockSpellEffectOrSummon(
    StatBlock(
        name = "Animated Object, Small - Flying (Animate Objects)",
        size = "Small",
        type = "construct",
        alignment = "unaligned",
        armorClass = "16",
        hitPoints = "25",
        speed = "fly 30 ft. (hover)",
        str = 6, strMod = "-2",
        dex = 14, dexMod = "+2",
        con = 10, conMod = "+0",
        int = 3, intMod = "-4",
        wis = 3, wisMod = "-4",
        cha = 1, chaMod = "-5",
        skills = "",
        savingThrows = "",
        vulnerabilities = "",
        damageResistances = "",
        damageImmunities = "",
        conditionResistances = "",
        conditionImmunities = "",
        legendaryResistance = "",
        senses = "blindsight 30 ft. (blind beyond this radius), passive Perception 6",
        languages = "—",
        challengeRating = "1/2",
        expValue = "100",
        proficiencyBonus = "",
        traits = listOf(),
        actions = listOf(
            "Slam. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 1d8 + 2 bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "An animated object is a construct with AC, hit points, attacks, Strength, and Dexterity determined by its size. Its Constitution is 10 and its Intelligence and Wisdom are 3, and its Charisma is 1. Its speed is 30 feet; if the objects lack legs or other appendages it can use for locomotion, it instead has a flying speed of 30 feet and can hover. If the object is securely attached to a surface or larger object, such as a chain bolted to a wall, its speed is 0. It has blindsight with a radius of 30 feet and is blind beyond that distance. When the animated object drops to 0 hit points, it reverts to its original object form, and any remaining damage carries over to its original object form.\n\nIf you command an object to attack, it can make a single melee attack against a creature within 5 feet of it. It makes a slam attack with an attack bonus and bludgeoning damage determined by its size. The DM might rule that a specific object inflicts slashing or piercing damage based on its form.\n\nAt Higher Levels. If you cast this spell using a spell slot of 6th level or higher, you can animate two additional objects for each slot level above 5th.",
        tags = "blindsight, fly speed, hover",
        source = "Animate Objects; Player's Handbook (SRD)"
    )
)

val animatedObjectSmallWalking = registerConstructStatBlockSpellEffectOrSummon(
    StatBlock(
        name = "Animated Object, Small - Walking (Animate Objects)",
        size = "Small",
        type = "construct",
        alignment = "unaligned",
        armorClass = "16",
        hitPoints = "25",
        speed = "30 ft.",
        str = 6, strMod = "-2",
        dex = 14, dexMod = "+2",
        con = 10, conMod = "+0",
        int = 3, intMod = "-4",
        wis = 3, wisMod = "-4",
        cha = 1, chaMod = "-5",
        skills = "",
        savingThrows = "",
        vulnerabilities = "",
        damageResistances = "",
        damageImmunities = "",
        conditionResistances = "",
        conditionImmunities = "",
        legendaryResistance = "",
        senses = "blindsight 30 ft. (blind beyond this radius), passive Perception 6",
        languages = "—",
        challengeRating = "1/2",
        expValue = "100",
        proficiencyBonus = "",
        traits = listOf(),
        actions = listOf(
            "Slam. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 1d8 + 2 bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "An animated object is a construct with AC, hit points, attacks, Strength, and Dexterity determined by its size. Its Constitution is 10 and its Intelligence and Wisdom are 3, and its Charisma is 1. Its speed is 30 feet; if the objects lack legs or other appendages it can use for locomotion, it instead has a flying speed of 30 feet and can hover. If the object is securely attached to a surface or larger object, such as a chain bolted to a wall, its speed is 0. It has blindsight with a radius of 30 feet and is blind beyond that distance. When the animated object drops to 0 hit points, it reverts to its original object form, and any remaining damage carries over to its original object form.\n\nIf you command an object to attack, it can make a single melee attack against a creature within 5 feet of it. It makes a slam attack with an attack bonus and bludgeoning damage determined by its size. The DM might rule that a specific object inflicts slashing or piercing damage based on its form.\n\nAt Higher Levels. If you cast this spell using a spell slot of 6th level or higher, you can animate two additional objects for each slot level above 5th.",
        tags = "blindsight",
        source = "Animate Objects; Player's Handbook (SRD)"
    )
)

val animatedObjectSmallStationary = registerConstructStatBlockSpellEffectOrSummon(
    StatBlock(
        name = "Animated Object, Small - Stationary (Animate Objects)",
        size = "Small",
        type = "construct",
        alignment = "unaligned",
        armorClass = "16",
        hitPoints = "25",
        speed = "0 ft.",
        str = 6, strMod = "-2",
        dex = 14, dexMod = "+2",
        con = 10, conMod = "+0",
        int = 3, intMod = "-4",
        wis = 3, wisMod = "-4",
        cha = 1, chaMod = "-5",
        skills = "",
        savingThrows = "",
        vulnerabilities = "",
        damageResistances = "",
        damageImmunities = "",
        conditionResistances = "",
        conditionImmunities = "",
        legendaryResistance = "",
        senses = "blindsight 30 ft. (blind beyond this radius), passive Perception 6",
        languages = "—",
        challengeRating = "1/2",
        expValue = "100",
        proficiencyBonus = "",
        traits = listOf(),
        actions = listOf(
            "Slam. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 1d8 + 2 bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "An animated object is a construct with AC, hit points, attacks, Strength, and Dexterity determined by its size. Its Constitution is 10 and its Intelligence and Wisdom are 3, and its Charisma is 1. Its speed is 30 feet; if the objects lack legs or other appendages it can use for locomotion, it instead has a flying speed of 30 feet and can hover. If the object is securely attached to a surface or larger object, such as a chain bolted to a wall, its speed is 0. It has blindsight with a radius of 30 feet and is blind beyond that distance. When the animated object drops to 0 hit points, it reverts to its original object form, and any remaining damage carries over to its original object form.\n\nIf you command an object to attack, it can make a single melee attack against a creature within 5 feet of it. It makes a slam attack with an attack bonus and bludgeoning damage determined by its size. The DM might rule that a specific object inflicts slashing or piercing damage based on its form.\n\nAt Higher Levels. If you cast this spell using a spell slot of 6th level or higher, you can animate two additional objects for each slot level above 5th.",
        tags = "blindsight",
        source = "Animate Objects; Player's Handbook (SRD)"
    )
)

val animatedObjectMediumFlying = registerConstructStatBlockSpellEffectOrSummon(
    StatBlock(
        name = "Animated Object, Medium - Flying (Animate Objects)",
        size = "Medium",
        type = "construct",
        alignment = "unaligned",
        armorClass = "13",
        hitPoints = "40",
        speed = "fly 30 ft. (hover)",
        str = 10, strMod = "+0",
        dex = 12, dexMod = "+1",
        con = 10, conMod = "+0",
        int = 3, intMod = "-4",
        wis = 3, wisMod = "-4",
        cha = 1, chaMod = "-5",
        skills = "",
        savingThrows = "",
        vulnerabilities = "",
        damageResistances = "",
        damageImmunities = "",
        conditionResistances = "",
        conditionImmunities = "",
        legendaryResistance = "",
        senses = "blindsight 30 ft. (blind beyond this radius), passive Perception 6",
        languages = "—",
        challengeRating = "1",
        expValue = "200",
        proficiencyBonus = "",
        traits = listOf(),
        actions = listOf(
            "Slam. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 2d6 + 1 bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "An animated object is a construct with AC, hit points, attacks, Strength, and Dexterity determined by its size. Its Constitution is 10 and its Intelligence and Wisdom are 3, and its Charisma is 1. Its speed is 30 feet; if the objects lack legs or other appendages it can use for locomotion, it instead has a flying speed of 30 feet and can hover. If the object is securely attached to a surface or larger object, such as a chain bolted to a wall, its speed is 0. It has blindsight with a radius of 30 feet and is blind beyond that distance. When the animated object drops to 0 hit points, it reverts to its original object form, and any remaining damage carries over to its original object form.\n\nIf you command an object to attack, it can make a single melee attack against a creature within 5 feet of it. It makes a slam attack with an attack bonus and bludgeoning damage determined by its size. The DM might rule that a specific object inflicts slashing or piercing damage based on its form.\n\nAt Higher Levels. If you cast this spell using a spell slot of 6th level or higher, you can animate two additional objects for each slot level above 5th.",
        tags = "blindsight, fly speed, hover",
        source = "Animate Objects; Player's Handbook (SRD)"
    )
)

val animatedObjectMediumWalking = registerConstructStatBlockSpellEffectOrSummon(
    StatBlock(
        name = "Animated Object, Medium - Walking (Animate Objects)",
        size = "Medium",
        type = "construct",
        alignment = "unaligned",
        armorClass = "13",
        hitPoints = "40",
        speed = "30 ft.",
        str = 10, strMod = "+0",
        dex = 12, dexMod = "+1",
        con = 10, conMod = "+0",
        int = 3, intMod = "-4",
        wis = 3, wisMod = "-4",
        cha = 1, chaMod = "-5",
        skills = "",
        savingThrows = "",
        vulnerabilities = "",
        damageResistances = "",
        damageImmunities = "",
        conditionResistances = "",
        conditionImmunities = "",
        legendaryResistance = "",
        senses = "blindsight 30 ft. (blind beyond this radius), passive Perception 6",
        languages = "—",
        challengeRating = "1",
        expValue = "200",
        proficiencyBonus = "",
        traits = listOf(),
        actions = listOf(
            "Slam. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 2d6 + 1 bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "An animated object is a construct with AC, hit points, attacks, Strength, and Dexterity determined by its size. Its Constitution is 10 and its Intelligence and Wisdom are 3, and its Charisma is 1. Its speed is 30 feet; if the objects lack legs or other appendages it can use for locomotion, it instead has a flying speed of 30 feet and can hover. If the object is securely attached to a surface or larger object, such as a chain bolted to a wall, its speed is 0. It has blindsight with a radius of 30 feet and is blind beyond that distance. When the animated object drops to 0 hit points, it reverts to its original object form, and any remaining damage carries over to its original object form.\n\nIf you command an object to attack, it can make a single melee attack against a creature within 5 feet of it. It makes a slam attack with an attack bonus and bludgeoning damage determined by its size. The DM might rule that a specific object inflicts slashing or piercing damage based on its form.\n\nAt Higher Levels. If you cast this spell using a spell slot of 6th level or higher, you can animate two additional objects for each slot level above 5th.",
        tags = "blindsight",
        source = "Animate Objects; Player's Handbook (SRD)"
    )
)

val animatedObjectMediumStationary = registerConstructStatBlockSpellEffectOrSummon(
    StatBlock(
        name = "Animated Object, Medium - Stationary (Animate Objects)",
        size = "Medium",
        type = "construct",
        alignment = "unaligned",
        armorClass = "13",
        hitPoints = "40",
        speed = "0 ft.",
        str = 10, strMod = "+0",
        dex = 12, dexMod = "+1",
        con = 10, conMod = "+0",
        int = 3, intMod = "-4",
        wis = 3, wisMod = "-4",
        cha = 1, chaMod = "-5",
        skills = "",
        savingThrows = "",
        vulnerabilities = "",
        damageResistances = "",
        damageImmunities = "",
        conditionResistances = "",
        conditionImmunities = "",
        legendaryResistance = "",
        senses = "blindsight 30 ft. (blind beyond this radius), passive Perception 6",
        languages = "—",
        challengeRating = "1",
        expValue = "200",
        proficiencyBonus = "",
        traits = listOf(),
        actions = listOf(
            "Slam. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 2d6 + 1 bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "An animated object is a construct with AC, hit points, attacks, Strength, and Dexterity determined by its size. Its Constitution is 10 and its Intelligence and Wisdom are 3, and its Charisma is 1. Its speed is 30 feet; if the objects lack legs or other appendages it can use for locomotion, it instead has a flying speed of 30 feet and can hover. If the object is securely attached to a surface or larger object, such as a chain bolted to a wall, its speed is 0. It has blindsight with a radius of 30 feet and is blind beyond that distance. When the animated object drops to 0 hit points, it reverts to its original object form, and any remaining damage carries over to its original object form.\n\nIf you command an object to attack, it can make a single melee attack against a creature within 5 feet of it. It makes a slam attack with an attack bonus and bludgeoning damage determined by its size. The DM might rule that a specific object inflicts slashing or piercing damage based on its form.\n\nAt Higher Levels. If you cast this spell using a spell slot of 6th level or higher, you can animate two additional objects for each slot level above 5th.",
        tags = "blindsight",
        source = "Animate Objects; Player's Handbook (SRD)"
    )
)

val animatedObjectLargeFlying = registerConstructStatBlockSpellEffectOrSummon(
    StatBlock(
        name = "Animated Object, Large - Flying (Animate Objects)",
        size = "Large",
        type = "construct",
        alignment = "unaligned",
        armorClass = "10",
        hitPoints = "50",
        speed = "fly 30 ft. (hover)",
        str = 14, strMod = "+2",
        dex = 10, dexMod = "+0",
        con = 10, conMod = "+0",
        int = 3, intMod = "-4",
        wis = 3, wisMod = "-4",
        cha = 1, chaMod = "-5",
        skills = "",
        savingThrows = "",
        vulnerabilities = "",
        damageResistances = "",
        damageImmunities = "",
        conditionResistances = "",
        conditionImmunities = "",
        legendaryResistance = "",
        senses = "blindsight 30 ft. (blind beyond this radius), passive Perception 6",
        languages = "—",
        challengeRating = "2",
        expValue = "450",
        proficiencyBonus = "",
        traits = listOf(),
        actions = listOf(
            "Slam. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 2d10 + 2 bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "An animated object is a construct with AC, hit points, attacks, Strength, and Dexterity determined by its size. Its Constitution is 10 and its Intelligence and Wisdom are 3, and its Charisma is 1. Its speed is 30 feet; if the objects lack legs or other appendages it can use for locomotion, it instead has a flying speed of 30 feet and can hover. If the object is securely attached to a surface or larger object, such as a chain bolted to a wall, its speed is 0. It has blindsight with a radius of 30 feet and is blind beyond that distance. When the animated object drops to 0 hit points, it reverts to its original object form, and any remaining damage carries over to its original object form.\n\nIf you command an object to attack, it can make a single melee attack against a creature within 5 feet of it. It makes a slam attack with an attack bonus and bludgeoning damage determined by its size. The DM might rule that a specific object inflicts slashing or piercing damage based on its form.\n\nAt Higher Levels. If you cast this spell using a spell slot of 6th level or higher, you can animate two additional objects for each slot level above 5th.",
        tags = "blindsight, fly speed, hover",
        source = "Animate Objects; Player's Handbook (SRD)"
    )
)

val animatedObjectLargeWalking = registerConstructStatBlockSpellEffectOrSummon(
    StatBlock(
        name = "Animated Object, Large - Walking (Animate Objects)",
        size = "Large",
        type = "construct",
        alignment = "unaligned",
        armorClass = "10",
        hitPoints = "50",
        speed = "30 ft.",
        str = 14, strMod = "+2",
        dex = 10, dexMod = "+0",
        con = 10, conMod = "+0",
        int = 3, intMod = "-4",
        wis = 3, wisMod = "-4",
        cha = 1, chaMod = "-5",
        skills = "",
        savingThrows = "",
        vulnerabilities = "",
        damageResistances = "",
        damageImmunities = "",
        conditionResistances = "",
        conditionImmunities = "",
        legendaryResistance = "",
        senses = "blindsight 30 ft. (blind beyond this radius), passive Perception 6",
        languages = "—",
        challengeRating = "2",
        expValue = "450",
        proficiencyBonus = "",
        traits = listOf(),
        actions = listOf(
            "Slam. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 2d10 + 2 bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "An animated object is a construct with AC, hit points, attacks, Strength, and Dexterity determined by its size. Its Constitution is 10 and its Intelligence and Wisdom are 3, and its Charisma is 1. Its speed is 30 feet; if the objects lack legs or other appendages it can use for locomotion, it instead has a flying speed of 30 feet and can hover. If the object is securely attached to a surface or larger object, such as a chain bolted to a wall, its speed is 0. It has blindsight with a radius of 30 feet and is blind beyond that distance. When the animated object drops to 0 hit points, it reverts to its original object form, and any remaining damage carries over to its original object form.\n\nIf you command an object to attack, it can make a single melee attack against a creature within 5 feet of it. It makes a slam attack with an attack bonus and bludgeoning damage determined by its size. The DM might rule that a specific object inflicts slashing or piercing damage based on its form.\n\nAt Higher Levels. If you cast this spell using a spell slot of 6th level or higher, you can animate two additional objects for each slot level above 5th.",
        tags = "blindsight",
        source = "Animate Objects; Player's Handbook (SRD)"
    )
)

val animatedObjectLargeStationary = registerConstructStatBlockSpellEffectOrSummon(
    StatBlock(
        name = "Animated Object, Large - Stationary (Animate Objects)",
        size = "Large",
        type = "construct",
        alignment = "unaligned",
        armorClass = "10",
        hitPoints = "50",
        speed = "0 ft.",
        str = 14, strMod = "+2",
        dex = 10, dexMod = "+0",
        con = 10, conMod = "+0",
        int = 3, intMod = "-4",
        wis = 3, wisMod = "-4",
        cha = 1, chaMod = "-5",
        skills = "",
        savingThrows = "",
        vulnerabilities = "",
        damageResistances = "",
        damageImmunities = "",
        conditionResistances = "",
        conditionImmunities = "",
        legendaryResistance = "",
        senses = "blindsight 30 ft. (blind beyond this radius), passive Perception 6",
        languages = "—",
        challengeRating = "2",
        expValue = "450",
        proficiencyBonus = "",
        traits = listOf(),
        actions = listOf(
            "Slam. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 2d10 + 2 bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "An animated object is a construct with AC, hit points, attacks, Strength, and Dexterity determined by its size. Its Constitution is 10 and its Intelligence and Wisdom are 3, and its Charisma is 1. Its speed is 30 feet; if the objects lack legs or other appendages it can use for locomotion, it instead has a flying speed of 30 feet and can hover. If the object is securely attached to a surface or larger object, such as a chain bolted to a wall, its speed is 0. It has blindsight with a radius of 30 feet and is blind beyond that distance. When the animated object drops to 0 hit points, it reverts to its original object form, and any remaining damage carries over to its original object form.\n\nIf you command an object to attack, it can make a single melee attack against a creature within 5 feet of it. It makes a slam attack with an attack bonus and bludgeoning damage determined by its size. The DM might rule that a specific object inflicts slashing or piercing damage based on its form.\n\nAt Higher Levels. If you cast this spell using a spell slot of 6th level or higher, you can animate two additional objects for each slot level above 5th.",
        tags = "blindsight",
        source = "Animate Objects; Player's Handbook (SRD)"
    )
)

val animatedObjectHugeFlying = registerConstructStatBlockSpellEffectOrSummon(
    StatBlock(
        name = "Animated Object, Huge - Flying (Animate Objects)",
        size = "Huge",
        type = "construct",
        alignment = "unaligned",
        armorClass = "10",
        hitPoints = "80",
        speed = "fly 30 ft. (hover)",
        str = 18, strMod = "+4",
        dex = 6, dexMod = "-2",
        con = 10, conMod = "+0",
        int = 3, intMod = "-4",
        wis = 3, wisMod = "-4",
        cha = 1, chaMod = "-5",
        skills = "",
        savingThrows = "",
        vulnerabilities = "",
        damageResistances = "",
        damageImmunities = "",
        conditionResistances = "",
        conditionImmunities = "",
        legendaryResistance = "",
        senses = "blindsight 30 ft. (blind beyond this radius), passive Perception 6",
        languages = "—",
        challengeRating = "3",
        expValue = "700",
        proficiencyBonus = "",
        traits = listOf(),
        actions = listOf(
            "Slam. Melee Weapon Attack: +8 to hit, reach 5 ft., one target. Hit: 2d12 + 4 bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "An animated object is a construct with AC, hit points, attacks, Strength, and Dexterity determined by its size. Its Constitution is 10 and its Intelligence and Wisdom are 3, and its Charisma is 1. Its speed is 30 feet; if the objects lack legs or other appendages it can use for locomotion, it instead has a flying speed of 30 feet and can hover. If the object is securely attached to a surface or larger object, such as a chain bolted to a wall, its speed is 0. It has blindsight with a radius of 30 feet and is blind beyond that distance. When the animated object drops to 0 hit points, it reverts to its original object form, and any remaining damage carries over to its original object form.\n\nIf you command an object to attack, it can make a single melee attack against a creature within 5 feet of it. It makes a slam attack with an attack bonus and bludgeoning damage determined by its size. The DM might rule that a specific object inflicts slashing or piercing damage based on its form.\n\nAt Higher Levels. If you cast this spell using a spell slot of 6th level or higher, you can animate two additional objects for each slot level above 5th.",
        tags = "blindsight, fly speed, hover",
        source = "Animate Objects; Player's Handbook (SRD)"
    )
)

val animatedObjectHugeWalking = registerConstructStatBlockSpellEffectOrSummon(
    StatBlock(
        name = "Animated Object, Huge - Walking (Animate Objects)",
        size = "Huge",
        type = "construct",
        alignment = "unaligned",
        armorClass = "10",
        hitPoints = "80",
        speed = "30 ft.",
        str = 18, strMod = "+4",
        dex = 6, dexMod = "-2",
        con = 10, conMod = "+0",
        int = 3, intMod = "-4",
        wis = 3, wisMod = "-4",
        cha = 1, chaMod = "-5",
        skills = "",
        savingThrows = "",
        vulnerabilities = "",
        damageResistances = "",
        damageImmunities = "",
        conditionResistances = "",
        conditionImmunities = "",
        legendaryResistance = "",
        senses = "blindsight 30 ft. (blind beyond this radius), passive Perception 6",
        languages = "—",
        challengeRating = "3",
        expValue = "700",
        proficiencyBonus = "",
        traits = listOf(),
        actions = listOf(
            "Slam. Melee Weapon Attack: +8 to hit, reach 5 ft., one target. Hit: 2d12 + 4 bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "An animated object is a construct with AC, hit points, attacks, Strength, and Dexterity determined by its size. Its Constitution is 10 and its Intelligence and Wisdom are 3, and its Charisma is 1. Its speed is 30 feet; if the objects lack legs or other appendages it can use for locomotion, it instead has a flying speed of 30 feet and can hover. If the object is securely attached to a surface or larger object, such as a chain bolted to a wall, its speed is 0. It has blindsight with a radius of 30 feet and is blind beyond that distance. When the animated object drops to 0 hit points, it reverts to its original object form, and any remaining damage carries over to its original object form.\n\nIf you command an object to attack, it can make a single melee attack against a creature within 5 feet of it. It makes a slam attack with an attack bonus and bludgeoning damage determined by its size. The DM might rule that a specific object inflicts slashing or piercing damage based on its form.\n\nAt Higher Levels. If you cast this spell using a spell slot of 6th level or higher, you can animate two additional objects for each slot level above 5th.",
        tags = "blindsight",
        source = "Animate Objects; Player's Handbook (SRD)"
    )
)

val animatedObjectHugeStationary = registerConstructStatBlockSpellEffectOrSummon(
    StatBlock(
        name = "Animated Object, Huge - Stationary (Animate Objects)",
        size = "Huge",
        type = "construct",
        alignment = "unaligned",
        armorClass = "10",
        hitPoints = "80",
        speed = "0 ft.",
        str = 18, strMod = "+4",
        dex = 6, dexMod = "-2",
        con = 10, conMod = "+0",
        int = 3, intMod = "-4",
        wis = 3, wisMod = "-4",
        cha = 1, chaMod = "-5",
        skills = "",
        savingThrows = "",
        vulnerabilities = "",
        damageResistances = "",
        damageImmunities = "",
        conditionResistances = "",
        conditionImmunities = "",
        legendaryResistance = "",
        senses = "blindsight 30 ft. (blind beyond this radius), passive Perception 6",
        languages = "—",
        challengeRating = "3",
        expValue = "700",
        proficiencyBonus = "",
        traits = listOf(),
        actions = listOf(
            "Slam. Melee Weapon Attack: +8 to hit, reach 5 ft., one target. Hit: 2d12 + 4 bludgeoning damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "An animated object is a construct with AC, hit points, attacks, Strength, and Dexterity determined by its size. Its Constitution is 10 and its Intelligence and Wisdom are 3, and its Charisma is 1. Its speed is 30 feet; if the objects lack legs or other appendages it can use for locomotion, it instead has a flying speed of 30 feet and can hover. If the object is securely attached to a surface or larger object, such as a chain bolted to a wall, its speed is 0. It has blindsight with a radius of 30 feet and is blind beyond that distance. When the animated object drops to 0 hit points, it reverts to its original object form, and any remaining damage carries over to its original object form.\n\nIf you command an object to attack, it can make a single melee attack against a creature within 5 feet of it. It makes a slam attack with an attack bonus and bludgeoning damage determined by its size. The DM might rule that a specific object inflicts slashing or piercing damage based on its form.\n\nAt Higher Levels. If you cast this spell using a spell slot of 6th level or higher, you can animate two additional objects for each slot level above 5th.",
        tags = "blindsight",
        source = "Animate Objects; Player's Handbook (SRD)"
    )
)
