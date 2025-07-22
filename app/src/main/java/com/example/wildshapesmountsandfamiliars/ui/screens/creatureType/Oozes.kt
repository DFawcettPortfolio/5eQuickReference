package com.example.wildshapesmountsandfamiliars.ui.screens.creatureType



import androidx.compose.runtime.Composable
import com.example.wildshapesmountsandfamiliars.ui.screens.CreatureTypeScreen
import com.example.wildshapesmountsandfamiliars.ui.screens.OozeStatBlockSpellEffectOrSummon
import com.example.wildshapesmountsandfamiliars.ui.screens.OozeStatBlocks
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.registerMonstrosityStatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.registerOozeStatBlock


@Composable
fun Oozes(
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
        title = "Oozes",
        statBlocks = OozeStatBlocks,
        spellEffectOrSummons = OozeStatBlockSpellEffectOrSummon,
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

val blackPuddingLarge = registerOozeStatBlock(
    StatBlock(
        name = "Black Pudding, Large",
        size = "Large",
        type = "ooze",
        alignment = "unaligned",
        armorClass = "7",
        hitPoints = "85 (10d10 + 30)",
        speed = "20 ft., climb 20 ft.",
        str = 16, strMod = "+3",
        dex = 5, dexMod = "−3",
        con = 16, conMod = "+3",
        int = 1, intMod = "−5",
        wis = 6, wisMod = "−2",
        cha = 1, chaMod = "−5",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "acid, cold, lightning, slashing",
        conditionResistances = null,
        conditionImmunities = "blinded, charmed, deafened, exhaustion, frightened, prone",
        legendaryResistance = null,
        senses = "blindsight 60 ft. (blind beyond this radius), passive Perception 8",
        languages = "—",
        challengeRating = "4",
        expValue = "1100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amorphous. The pudding can move through a space as narrow as 1 inch wide without squeezing.",
            "Corrosive Form. A creature that touches the pudding or hits it with a melee attack while within 5 feet of it takes 4 (1d8) acid damage. Any nonmagical weapon made of metal or wood that hits the pudding corrodes. After dealing damage, the weapon takes a permanent and cumulative -1 penalty to damage rolls. If its penalty drops to -5, the weapon is destroyed. Nonmagical ammunition made of metal or wood that hits the pudding is destroyed after dealing damage. The pudding can eat through 2-inch-thick, nonmagical wood or metal in 1 round.",
            "Spider Climb. The pudding can climb difficult surfaces, including upside down on ceilings, without needing to make an ability check."
        ),
        actions = listOf(
            "Pseudopod. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 6 (1d6 + 3) bludgeoning damage plus 18 (4d8) acid damage. In addition, nonmagical armor worn by the target is partly dissolved and takes a permanent and cumulative -1 penalty to the AC it offers. The armor is destroyed if the penalty reduces its AC to 10."
        ),
        bonusActions = listOf(),
        reactions = listOf(
            "Split. When a pudding that is Medium or larger is subjected to lightning or slashing damage, it splits into two new puddings if it has at least 10 hit points. Each new pudding has hit points equal to half the original pudding's, rounded down. New puddings are one size smaller than the original pudding."
        ),
        legendaryActions = listOf(),
        description = null,
        tags = "climb speed, damage immunity, condition immunity, blindsight",
        source = "Monster Manual (SRD)"
    )
)

val blackPuddingMedium = registerOozeStatBlock(
    StatBlock(
        name = "Black Pudding, Medium",
        size = "Medium",
        type = "ooze",
        alignment = "unaligned",
        armorClass = "7",
        hitPoints = "varies",
        speed = "20 ft., climb 20 ft.",
        str = 16, strMod = "+3",
        dex = 5, dexMod = "−3",
        con = 16, conMod = "+3",
        int = 1, intMod = "−5",
        wis = 6, wisMod = "−2",
        cha = 1, chaMod = "−5",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "acid, cold, lightning, slashing",
        conditionResistances = null,
        conditionImmunities = "blinded, charmed, deafened, exhaustion, frightened, prone",
        legendaryResistance = null,
        senses = "blindsight 60 ft. (blind beyond this radius), passive Perception 8",
        languages = "—",
        challengeRating = "4",
        expValue = "1100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amorphous. The pudding can move through a space as narrow as 1 inch wide without squeezing.",
            "Corrosive Form. A creature that touches the pudding or hits it with a melee attack while within 5 feet of it takes 4 (1d8) acid damage. Any nonmagical weapon made of metal or wood that hits the pudding corrodes. After dealing damage, the weapon takes a permanent and cumulative -1 penalty to damage rolls. If its penalty drops to -5, the weapon is destroyed. Nonmagical ammunition made of metal or wood that hits the pudding is destroyed after dealing damage. The pudding can eat through 2-inch-thick, nonmagical wood or metal in 1 round.",
            "Spider Climb. The pudding can climb difficult surfaces, including upside down on ceilings, without needing to make an ability check."
        ),
        actions = listOf(
            "Pseudopod. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 6 (1d6 + 3) bludgeoning damage plus 18 (4d8) acid damage. In addition, nonmagical armor worn by the target is partly dissolved and takes a permanent and cumulative -1 penalty to the AC it offers. The armor is destroyed if the penalty reduces its AC to 10."
        ),
        bonusActions = listOf(),
        reactions = listOf(
            "Split. When a pudding that is Medium or larger is subjected to lightning or slashing damage, it splits into two new puddings if it has at least 10 hit points. Each new pudding has hit points equal to half the original pudding's, rounded down. New puddings are one size smaller than the original pudding."
        ),
        legendaryActions = listOf(),
        description = null,
        tags = "climb speed, damage immunity, condition immunity, blindsight",
        source = "Monster Manual (SRD)"
    )
)

val blackPuddingSmall = registerOozeStatBlock(
    StatBlock(
        name = "Black Pudding, Small",
        size = "Small",
        type = "ooze",
        alignment = "unaligned",
        armorClass = "7",
        hitPoints = "varies",
        speed = "20 ft., climb 20 ft.",
        str = 16, strMod = "+3",
        dex = 5, dexMod = "−3",
        con = 16, conMod = "+3",
        int = 1, intMod = "−5",
        wis = 6, wisMod = "−2",
        cha = 1, chaMod = "−5",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "acid, cold, lightning, slashing",
        conditionResistances = null,
        conditionImmunities = "blinded, charmed, deafened, exhaustion, frightened, prone",
        legendaryResistance = null,
        senses = "blindsight 60 ft. (blind beyond this radius), passive Perception 8",
        languages = "—",
        challengeRating = "4",
        expValue = "1100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amorphous. The pudding can move through a space as narrow as 1 inch wide without squeezing.",
            "Corrosive Form. A creature that touches the pudding or hits it with a melee attack while within 5 feet of it takes 4 (1d8) acid damage. Any nonmagical weapon made of metal or wood that hits the pudding corrodes. After dealing damage, the weapon takes a permanent and cumulative -1 penalty to damage rolls. If its penalty drops to -5, the weapon is destroyed. Nonmagical ammunition made of metal or wood that hits the pudding is destroyed after dealing damage. The pudding can eat through 2-inch-thick, nonmagical wood or metal in 1 round.",
            "Spider Climb. The pudding can climb difficult surfaces, including upside down on ceilings, without needing to make an ability check."
        ),
        actions = listOf(
            "Pseudopod. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 6 (1d6 + 3) bludgeoning damage plus 18 (4d8) acid damage. In addition, nonmagical armor worn by the target is partly dissolved and takes a permanent and cumulative -1 penalty to the AC it offers. The armor is destroyed if the penalty reduces its AC to 10."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "climb speed, damage immunity, condition immunity, blindsight",
        source = "Monster Manual (SRD)"
    )
)
//TODO HP tracker for "split" -- Black Pudding and Ochre Jelly

val gelatinousCube = registerMonstrosityStatBlock(
    StatBlock(
        name = "Gelatinous Cube",
        size = "Large",
        type = "ooze",
        alignment = "unaligned",
        armorClass = "6",
        hitPoints = "84 (8d10 + 40)",
        speed = "15 ft.",
        str = 14, strMod = "+2",
        dex = 3, dexMod = "−4",
        con = 20, conMod = "+5",
        int = 1, intMod = "−5",
        wis = 6, wisMod = "−2",
        cha = 1, chaMod = "−5",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "blinded, charmed, deafened, exhaustion, frightened, prone",
        legendaryResistance = null,
        senses = "blindsight 60 ft. (blind beyond this radius), passive Perception 8",
        languages = "—",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Ooze Cube. The cube takes up its entire space. Other creatures can enter the space, but a creature that does so is subjected to the cube's Engulf and has disadvantage on the saving throw. Creatures inside the cube can be seen but have total cover. A creature within 5 feet of the cube can take an action to pull a creature or object out of the cube. Doing so requires a successful DC 12 Strength check, and the creature making the attempt takes 10 (3d6) acid damage. The cube can hold only one Large creature or up to four Medium or smaller creatures inside it at a time.",
            "Transparent. Even when the cube is in plain sight, it takes a successful DC 15 Wisdom (Perception) check to spot a cube that has neither moved nor attacked. A creature that tries to enter the cube's space while unaware of the cube is surprised by the cube."
        ),
        actions = listOf(
            "Pseudopod. Melee Weapon Attack: +4 to hit, reach 5 ft., one creature. Hit: 10 (3d6) acid damage.",
            "Engulf. The cube moves up to its speed. While doing so, it can enter Large or smaller creatures' spaces. Whenever the cube enters a creature's space, the creature must make a DC 12 Dexterity saving throw. On a successful save, the creature can choose to be pushed 5 feet back or to the side of the cube. A creature that chooses not to be pushed suffers the consequences of a failed saving throw. On a failed save, the cube enters the creature's space, and the creature takes 10 (3d6) acid damage and is engulfed. The engulfed creature can't breathe, is restrained, and takes 21 (6d6) acid damage at the start of each of the cube's turns. When the cube moves, the engulfed creature moves with it. An engulfed creature can try to escape by taking an action to make a DC 12 Strength check. On a success, the creature escapes and enters a space of its choice within 5 feet of the cube."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "These creatures scour dungeon passages in silent, predictable patterns, leaving perfectly clean paths in their wake. They consume living tissue while leaving bones and other materials undissolved.",
        tags = "condition immunity, blindsight, cc - restrained",
        source = "Monster Manual (SRD)"
    )
)

val grayOoze = registerMonstrosityStatBlock(
    StatBlock(
        name = "Gray Ooze",
        size = "Medium",
        type = "ooze",
        alignment = "unaligned",
        armorClass = "8",
        hitPoints = "22 (3d8 + 9)",
        speed = "10 ft., climb 10 ft.",
        str = 12, strMod = "+1",
        dex = 6, dexMod = "−2",
        con = 16, conMod = "+3",
        int = 1, intMod = "−5",
        wis = 6, wisMod = "−2",
        cha = 2, chaMod = "−4",
        skills = "Stealth +2",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "acid, cold, fire",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "blinded, charmed, deafened, exhaustion, frightened, prone",
        legendaryResistance = null,
        senses = "blindsight 60 ft. (blind beyond this radius), passive Perception 8",
        languages = "—",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amorphous. The ooze can move through a space as narrow as 1 inch wide without squeezing.",
            "Corrode Metal. Any nonmagical weapon made of metal that hits the ooze corrodes. After dealing damage, the weapon takes a permanent and cumulative -1 penalty to damage rolls. If its penalty drops to -5, the weapon is destroyed. Nonmagical ammunition made of metal that hits the ooze is destroyed after dealing damage.\n\nThe ooze can eat through 2-inch-thick, nonmagical metal in 1 round.",
            "False Appearance. While the ooze remains motionless, it is indistinguishable from an oily pool or wet rock."
        ),
        actions = listOf(
            "Pseudopod. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 4 (1d6 + 1) bludgeoning damage plus 7 (2d6) acid damage, and if the target is wearing nonmagical metal armor, its armor is partly corroded and takes a permanent and cumulative -1 penalty to the AC it offers. The armor is destroyed if the penalty reduces its AC to 10."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "climb speed, damage resistance, condition resistance, blindsight",
        source = "Monster Manual (SRD)"
    )
)

val ochreJellyLarge = registerMonstrosityStatBlock(
    StatBlock(
        name = "Ochre Jelly, Large",
        size = "Large",
        type = "ooze",
        alignment = "unaligned",
        armorClass = "8",
        hitPoints = "45 (6d10 + 12)",
        speed = "10 ft., climb 10 ft.",
        str = 15, strMod = "+2",
        dex = 6, dexMod = "−2",
        con = 14, conMod = "+2",
        int = 2, intMod = "−4",
        wis = 6, wisMod = "−2",
        cha = 1, chaMod = "−5",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "acid",
        damageImmunities = "lightning, slashing",
        conditionResistances = null,
        conditionImmunities = "blinded, charmed, deafened, exhaustion, frightened, prone",
        legendaryResistance = null,
        senses = "blindsight 60 ft. (blind beyond this radius), passive Perception 8",
        languages = "—",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amorphous. The jelly can move through a space as narrow as 1 inch wide without squeezing.",
            "Spider Climb. The jelly can climb difficult surfaces, including upside down on ceilings, without needing to make an ability check."
        ),
        actions = listOf(
            "Pseudopod. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 9 (2d6 + 2) bludgeoning damage plus 3 (1d6) acid damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(
            "Split. When a jelly that is Medium or larger is subjected to lightning or slashing damage, it splits into two new jellies if it has at least 10 hit points. Each new jelly has hit points equal to half the original jelly's, rounded down. New jellies are one size smaller than the original jelly."
        ),
        legendaryActions = listOf(),
        description = "An ochre jelly is a yellowish ooze that can slide under doors and through narrow cracks in pursuit of creatures to devour.",
        tags = "climb speed, damage resistance, damage immunity, condition immunity, blindsight",
        source = "Monster Manual (SRD)"
    )
)
val ochreJellyMedium = registerMonstrosityStatBlock(
    StatBlock(
        name = "Ochre Jelly, Medium",
        size = "Medium",
        type = "ooze",
        alignment = "unaligned",
        armorClass = "8",
        hitPoints = "varies",
        speed = "10 ft., climb 10 ft.",
        str = 15, strMod = "+2",
        dex = 6, dexMod = "−2",
        con = 14, conMod = "+2",
        int = 2, intMod = "−4",
        wis = 6, wisMod = "−2",
        cha = 1, chaMod = "−5",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "acid",
        damageImmunities = "lightning, slashing",
        conditionResistances = null,
        conditionImmunities = "blinded, charmed, deafened, exhaustion, frightened, prone",
        legendaryResistance = null,
        senses = "blindsight 60 ft. (blind beyond this radius), passive Perception 8",
        languages = "—",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amorphous. The jelly can move through a space as narrow as 1 inch wide without squeezing.",
            "Spider Climb. The jelly can climb difficult surfaces, including upside down on ceilings, without needing to make an ability check."
        ),
        actions = listOf(
            "Pseudopod. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 9 (2d6 + 2) bludgeoning damage plus 3 (1d6) acid damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(
            "Split. When a jelly that is Medium or larger is subjected to lightning or slashing damage, it splits into two new jellies if it has at least 10 hit points. Each new jelly has hit points equal to half the original jelly's, rounded down. New jellies are one size smaller than the original jelly."
        ),
        legendaryActions = listOf(),
        description = "An ochre jelly is a yellowish ooze that can slide under doors and through narrow cracks in pursuit of creatures to devour.",
        tags = "climb speed, damage resistance, damage immunity, condition immunity, blindsight",
        source = "Monster Manual (SRD)"
    )
)
val ochreJellySmall = registerMonstrosityStatBlock(
    StatBlock(
        name = "Ochre Jelly, Small",
        size = "Small",
        type = "ooze",
        alignment = "unaligned",
        armorClass = "8",
        hitPoints = "varies",
        speed = "10 ft., climb 10 ft.",
        str = 15, strMod = "+2",
        dex = 6, dexMod = "−2",
        con = 14, conMod = "+2",
        int = 2, intMod = "−4",
        wis = 6, wisMod = "−2",
        cha = 1, chaMod = "−5",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "acid",
        damageImmunities = "lightning, slashing",
        conditionResistances = null,
        conditionImmunities = "blinded, charmed, deafened, exhaustion, frightened, prone",
        legendaryResistance = null,
        senses = "blindsight 60 ft. (blind beyond this radius), passive Perception 8",
        languages = "—",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amorphous. The jelly can move through a space as narrow as 1 inch wide without squeezing.",
            "Spider Climb. The jelly can climb difficult surfaces, including upside down on ceilings, without needing to make an ability check."
        ),
        actions = listOf(
            "Pseudopod. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 9 (2d6 + 2) bludgeoning damage plus 3 (1d6) acid damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "An ochre jelly is a yellowish ooze that can slide under doors and through narrow cracks in pursuit of creatures to devour.",
        tags = "climb speed, damage resistance, damage immunity, condition immunity, blindsight",
        source = "Monster Manual (SRD)"
    )
)
//TODO HP tracker for "split" -- Black Pudding and Ochre Jelly

// Spell effects and Summons

// none