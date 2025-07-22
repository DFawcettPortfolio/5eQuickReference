package com.example.wildshapesmountsandfamiliars.ui.screens.creatureType


import androidx.compose.runtime.Composable
import com.example.wildshapesmountsandfamiliars.ui.screens.CreatureTypeScreen
import com.example.wildshapesmountsandfamiliars.ui.screens.MonstrosityStatBlockSpellEffectOrSummon
import com.example.wildshapesmountsandfamiliars.ui.screens.MonstrosityStatBlocks
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.registerMonstrosityStatBlock



@Composable
fun Monstrosities(
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
        title = "Monstrosities",
        statBlocks = MonstrosityStatBlocks,
        spellEffectOrSummons = MonstrosityStatBlockSpellEffectOrSummon,
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

val androsphinx = registerMonstrosityStatBlock(
    StatBlock(
        name = "Androsphinx",
        size = "Large",
        type = "monstrosity",
        alignment = "lawful neutral",
        armorClass = "17 (natural armor)",
        hitPoints = "199 (19d10 + 95)",
        speed = "40 ft., fly 60 ft.",
        str = 22, strMod = "+6",
        dex = 10, dexMod = "+0",
        con = 20, conMod = "+5",
        int = 16, intMod = "+3",
        wis = 18, wisMod = "+4",
        cha = 23, chaMod = "+6",
        skills = "Arcana +9, Perception +10, Religion +15",
        savingThrows = "Dex +6, Con +11, Int +9, Wis +10",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "psychic; bludgeoning, piercing and slashing from nonmagical attacks",
        conditionResistances = null,
        conditionImmunities = "charmed, frightened",
        legendaryResistance = null,
        senses = "truesight 120 ft., passive Perception 20",
        languages = "Common, Sphinx",
        challengeRating = "17",
        expValue = "18000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Inscrutable. The sphinx is immune to any effect that would sense its emotions or read its thoughts, as well as any divination spell that it refuses. Wisdom (Insight) checks made to ascertain the sphinx's intentions or sincerity have disadvantage.",
            "Magic Weapons. The sphinx's weapon attacks are magical.",
            "Spellcasting. The sphinx is a 12th-level spellcaster. Its spellcasting ability is Wisdom (spell save DC 18, +10 to hit with spell attacks). It requires no material components to cast its spells. The sphinx has the following cleric spells prepared:\n" +
                    "Cantrips (at will): sacred flame, spare the dying, thaumaturgy\n" +
                    "1st level (4 slots): command, detect evil and good, detect magic\n" +
                    "2nd level (3 slots): lesser restoration, zone of truth\n" +
                    "3rd level (3 slots): dispel magic, tongues\n" +
                    "4th level (3 slots): banishment, freedom of movement\n" +
                    "5th level (2 slots): flame strike, greater restoration\n" +
                    "6th level (1 slot): heroes' feast"
        ),
        actions = listOf(
            "Multiattack. The sphinx makes two claw attacks.",
            "Claw. Melee Weapon Attack: +12 to hit, reach 5 ft., one target. Hit: 17 (2d10 + 6) slashing damage.",
            "Roar (3/Day). The sphinx emits a magical roar. Each time it roars before finishing a long rest, the roar is louder and the effect is different, as detailed below. Each creature within 500 feet of the sphinx and able to hear the roar must make a saving throw.\n\n" +
                    "First Roar. Each creature that fails a DC 18 Wisdom saving throw is frightened for 1 minute. A frightened creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success.\n\n" +
                    "Second Roar. Each creature that fails a DC 18 Wisdom saving throw is deafened and frightened for 1 minute. A frightened creature is paralyzed and can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success.\n\n" +
                    "Third Roar. Each creature makes a DC 18 Constitution saving throw. On a failed save, a creature takes 44 (8d10) thunder damage and is knocked prone. On a successful save, the creature takes half as much damage and isn't knocked prone."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "Claw Attack. The sphinx makes one claw attack.",
            "Teleport (Costs 2 Actions). The sphinx magically teleports, along with any equipment it is wearing or carrying, up to 120 feet to an unoccupied space it can see.",
            "Cast a Spell (Costs 3 Actions). The sphinx casts a spell from its list of prepared spells, using a spell slot as normal."
        ),
        description = null,
        tags = "fly speed, damage immunity, condition immunity, truesight, multiattack, cc - frightened, cc - deafened, cc - paralyzed, cc - prone, legendary action",
        source = "Monster Manual (SRD)"
    )
)

val ankheg = registerMonstrosityStatBlock(
    StatBlock(
        name = "Ankheg",
        size = "Large",
        type = "monstrosity",
        alignment = "unaligned",
        armorClass = "14 (natural armor), 11 while prone",
        hitPoints = "39 (6d10 + 6)",
        speed = "30 ft., burrow 10 ft.",
        str = 17, strMod = "+3",
        dex = 11, dexMod = "+0",
        con = 13, conMod = "+1",
        int = 1, intMod = "-5",
        wis = 13, wisMod = "+1",
        cha = 6, chaMod = "-2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., tremorsense 60 ft., passive Perception 11",
        languages = "—",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Bite. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 10 (2d6 + 3) slashing damage plus 3 (1d6) acid damage. If the target is a Large or smaller creature, it is grappled (escape DC 13). Until this grapple ends, the ankheg can bite only the grappled creature and has advantage on attack rolls to do so.",
            "Acid Spray (Recharge 6). The ankheg spits acid in a line that is 30 feet long and 5 feet wide, provided that it has no creature grappled. Each creature in that line must make a DC 13 Dexterity saving throw, taking 10 (3d6) acid damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "burrow speed, cc - grappled",
        source = "Monster Manual (SRD)"
    )
)

val basilisk = registerMonstrosityStatBlock(
    StatBlock(
        name = "Basilisk",
        size = "Medium",
        type = "monstrosity",
        alignment = "unaligned",
        armorClass = "15 (natural armor)",
        hitPoints = "52 (8d8 + 16)",
        speed = "20 ft.",
        str = 16, strMod = "+3",
        dex = 8, dexMod = "-1",
        con = 15, conMod = "+2",
        int = 2, intMod = "-4",
        wis = 8, wisMod = "-1",
        cha = 7, chaMod = "-2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 9",
        languages = "—",
        challengeRating = "3",
        expValue = "700 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Petrifying Gaze. If a creature starts its turn within 30 feet of the basilisk and the two of them can see each other, the basilisk can force the creature to make a DC 12 Constitution saving throw if the basilisk isn't incapacitated. On a failed save, the creature magically begins to turn to stone and is restrained. It must repeat the saving throw at the end of its next turn. On a success, the effect ends. On a failure, the creature is petrified until freed by the greater restoration spell or other magic. A creature that isn't surprised can avert its eyes to avoid the saving throw at the start of its turn. If it does so, it can't see the basilisk until the start of its next turn, when it can avert its eyes again. If it looks at the basilisk in the meantime, it must immediately make the save. If the basilisk sees its reflection within 30 feet of it in bright light, it mistakes itself for a rival and targets itself with its gaze."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 10 (2d6 + 3) piercing damage plus 7 (2d6) poison damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "A basilisk is a multilegged, reptilian horror whose deadly gaze transforms victims into porous stone. With it strong jaws, the creature consumes this stone, which returns to organic form in its gullet.",
        tags = "darkvision, cc - restrained, cc - petrified",
        source = "Monster Manual (SRD)"
    )
)

val behir = registerMonstrosityStatBlock(
    StatBlock(
        name = "Behir",
        size = "Huge",
        type = "monstrosity",
        alignment = "neutral evil",
        armorClass = "17 (natural armor)",
        hitPoints = "168 (16d12 + 64)",
        speed = "50 ft., climb 40 ft.",
        str = 23, strMod = "+6",
        dex = 16, dexMod = "+3",
        con = 18, conMod = "+4",
        int = 7, intMod = "-2",
        wis = 14, wisMod = "+2",
        cha = 12, chaMod = "+1",
        skills = "Perception +6, Stealth +7",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "lightning",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 90 ft., passive Perception 16",
        languages = "Draconic",
        challengeRating = "11",
        expValue = "7200 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Multiattack. The behir makes two attacks: one with its bite and one to constrict.",
            "Bite. Melee Weapon Attack: +10 to hit, reach 10 ft., one target. Hit: 22 (3d10 + 6) piercing damage.",
            "Constrict. Melee Weapon Attack: +10 to hit, reach 5 ft., one Large or smaller creature. Hit: 17 (2d10 + 6) bludgeoning damage plus 17 (2d10 + 6) slashing damage. The target is grappled (escape DC 16) if the behir isn't already constricting a creature, and the target is restrained until this grapple ends.",
            "Lightning Breath (Recharge 5–6). The behir exhales a line of lightning that is 20 feet long and 5 feet wide. Each creature in that line must make a DC 16 Dexterity saving throw, taking 66 (12d10) lightning damage on a failed save, or half as much damage on a successful one.",
            "Swallow. The behir makes one bite attack against a Medium or smaller target it is grappling. If the attack hits, the target is also swallowed, and the grapple ends. While swallowed, the target is blinded and restrained, it has total cover against attacks and other effects outside the behir, and it takes 21 (6d6) acid damage at the start of each of the behir's turns. A behir can have only one creature swallowed at a time. If the behir takes 30 damage or more on a single turn from the swallowed creature, the behir must succeed on a DC 14 Constitution saving throw at the end of that turn or regurgitate the creature, which falls prone in a space within 10 feet of the behir. If the behir dies, a swallowed creature is no longer restrained by it and can escape from the corpse by using 15 feet of movement, exiting prone."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "climb speed, damage immunity, darkvision, multiattack, cc - grappled, cc - restrained, cc - blinded, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val bulette = registerMonstrosityStatBlock(
    StatBlock(
        name = "Bulette",
        size = "Large",
        type = "monstrosity",
        alignment = "unaligned",
        armorClass = "17 (natural armor)",
        hitPoints = "94 (9d10 + 45)",
        speed = "40 ft., burrow 40 ft.",
        str = 19, strMod = "+4",
        dex = 11, dexMod = "+0",
        con = 21, conMod = "+5",
        int = 2, intMod = "-4",
        wis = 10, wisMod = "+0",
        cha = 5, chaMod = "-3",
        skills = "Perception +6",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., tremorsense 60 ft., passive Perception 16",
        languages = "—",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Standing Leap. The bulette's long jump is up to 30 feet and its high jump is up to 15 feet, with or without a running start."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 30 (4d12 + 4) piercing damage.",
            "Deadly Leap. If the bulette jumps at least 15 feet as part of its movement, it can then use this action to land on its feet in a space that contains one or more other creatures. Each of those creatures must succeed on a DC 16 Strength or Dexterity saving throw (target's choice) or be knocked prone and take 14 (3d6 + 4) bludgeoning damage plus 14 (3d6 + 4) slashing damage. On a successful save, the creature takes only half the damage, isn't knocked prone, and is pushed 5 feet out of the bulette's space into an unoccupied space of the creature's choice. If no unoccupied space is within range, the creature instead falls prone in the bulette's space."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Bulettes use their powerful claws to tunnel through the earth when they hunt.",
        tags = "burrow speed, darkvision, tremorsense, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val centaur = registerMonstrosityStatBlock(
    StatBlock(
        name = "Centaur",
        size = "Large",
        type = "monstrosity",
        alignment = "neutral good",
        armorClass = "12",
        hitPoints = "45 (6d10 + 12)",
        speed = "50 ft.",
        str = 18, strMod = "+4",
        dex = 14, dexMod = "+2",
        con = 14, conMod = "+2",
        int = 9, intMod = "-1",
        wis = 13, wisMod = "+1",
        cha = 11, chaMod = "+0",
        skills = "Athletics +6, Perception +3, Survival +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 13",
        languages = "Elvish, Sylvan",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Charge. If the centaur moves at least 30 feet straight toward a target and then hits it with a pike attack on the same turn, the target takes an extra 10 (3d6) piercing damage."
        ),
        actions = listOf(
            "Multiattack. The centaur makes two attacks: one with its pike and one with its hooves or two with its longbow.",
            "Pike. Melee Weapon Attack: +6 to hit, reach 10 ft., one target. Hit: 9 (1d10 + 4) piercing damage.",
            "Hooves. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 11 (2d6 + 4) bludgeoning damage.",
            "Longbow. Ranged Weapon Attack: +4 to hit, range 150/600 ft., one target. Hit: 6 (1d8 + 2) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "A centaur has the body of a great horse topped by a humanoid torso, head, and arms. Reclusive wanderers, they avoid conflict but fight fiercely when pressed.",
        tags = "multiattack",
        source = "Monster Manual (SRD)"
    )
)

val chimera = registerMonstrosityStatBlock(
    StatBlock(
        name = "Chimera",
        size = "Large",
        type = "monstrosity",
        alignment = "chaotic evil",
        armorClass = "14 (natural armor)",
        hitPoints = "114 (12d10 + 48)",
        speed = "30 ft., fly 60 ft.",
        str = 19, strMod = "+4",
        dex = 11, dexMod = "+0",
        con = 19, conMod = "+4",
        int = 3, intMod = "-4",
        wis = 14, wisMod = "+2",
        cha = 10, chaMod = "+0",
        skills = "Perception +8",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 18",
        languages = "understands Draconic but can't speak",
        challengeRating = "6",
        expValue = "2300 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Multiattack. The chimera makes three attacks: one with its bite, one with its horns, and one with its claws. When its fire breath is available, it can use the breath in place of its bite or horns.",
            "Bite. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 11 (2d6 + 4) piercing damage.",
            "Horns. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 10 (1d12 + 4) bludgeoning damage.",
            "Claws. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 11 (2d6 + 4) slashing damage.",
            "Fire Breath (Recharge 5-6). The dragon head exhales fire in a 15-foot cone. Each creature in that area must make a DC 15 Dexterity saving throw, taking 31 (7d8) fire damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "A chimera is a vile combination of goat, lion, and dragon, and features the heads of all three of those creatures. It likes to swoop down from the sky and engulf prey with its fiery breath before landing to attack.",
        tags = "fly speed, darkvision, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val cockatrice = registerMonstrosityStatBlock(
    StatBlock(
        name = "Cockatrice",
        size = "Small",
        type = "monstrosity",
        alignment = "unaligned",
        armorClass = "11",
        hitPoints = "27 (6d6 + 6)",
        speed = "20 ft., fly 40 ft.",
        str = 6, strMod = "-2",
        dex = 12, dexMod = "+1",
        con = 12, conMod = "+1",
        int = 2, intMod = "-4",
        wis = 13, wisMod = "+1",
        cha = 5, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 11",
        languages = "—",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Bite. Melee Weapon Attack: +3 to hit, reach 5 ft., one creature. Hit: 3 (1d4 + 1) piercing damage, and the target must succeed on a DC 11 Constitution saving throw against being magically petrified. On a failed save, the creature begins to turn to stone and is restrained. It must repeat the saving throw at the end of its next turn. On a success, the effect ends. On a failure, the creature is petrified for 24 hours."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "The cockatrice looks like a hideous hybrid of lizard, bird, and bat. It is infamous for its ability to turn flesh to stone.",
        tags = "fly speed, darkvision, cc - restrained, cc - petrified",
        source = "Monster Manual (SRD)"
    )
)

val darkmantle = registerMonstrosityStatBlock(
    StatBlock(
        name = "Darkmantle",
        size = "Small",
        type = "monstrosity",
        alignment = "unaligned",
        armorClass = "11",
        hitPoints = "22 (5d6 + 5)",
        speed = "10 ft., fly 30 ft.",
        str = 16, strMod = "+3",
        dex = 12, dexMod = "+1",
        con = 13, conMod = "+1",
        int = 2, intMod = "-4",
        wis = 10, wisMod = "+0",
        cha = 5, chaMod = "-3",
        skills = "Stealth +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 60 ft., passive Perception 10",
        languages = "—",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Echolocation. The darkmantle can't use its blindsight while deafened.",
            "False Appearance. While the darkmantle remains motionless, it is indistinguishable from a cave formation such as a stalactite or stalagmite."
        ),
        actions = listOf(
            "Crush. Melee Weapon Attack: +5 to hit, reach 5 ft., one creature. Hit: 6 (1d6 + 3) bludgeoning damage, and the darkmantle attaches to the target. If the target is Medium or smaller and the darkmantle has advantage on the attack roll, it attaches by engulfing the target's head, and the target is also blinded and unable to breathe while the darkmantle is attached in this way. While attached to the target, the darkmantle can attack no other creature except the target but has advantage on its attack rolls. The darkmantle's speed also becomes 0, it can't benefit from any bonus to its speed, and it moves with the target. A creature can detach the darkmantle by making a successful DC 13 Strength check as an action. On its turn, the darkmantle can detach itself from the target by using 5 feet of movement.",
            "Darkness Aura (1/Day). A 15-foot radius of magical darkness extends out from the darkmantle, moves with it, and spreads around corners. The darkness lasts as long as the darkmantle maintains concentration, up to 10 minutes (as if concentrating on a spell). Darkvision can't penetrate this darkness, and no natural light can illuminate it. If any of the darkness overlaps with an area of light created by a spell of 2nd level or lower, the spell creating the light is dispelled."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, blindsight, cc - blinded",
        source = "Monster Manual (SRD)"
    )
)

val deathDog = registerMonstrosityStatBlock(
    StatBlock(
        name = "Death Dog",
        size = "Medium",
        type = "monstrosity",
        alignment = "neutral evil",
        armorClass = "12",
        hitPoints = "39 (6d8 + 12)",
        speed = "40 ft.",
        str = 15, strMod = "+2",
        dex = 14, dexMod = "+2",
        con = 14, conMod = "+2",
        int = 3, intMod = "-4",
        wis = 13, wisMod = "+1",
        cha = 6, chaMod = "-2",
        skills = "Perception +5, Stealth +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 15",
        languages = "—",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Two-Headed. The dog has advantage on Wisdom (Perception) checks and on saving throws against being blinded, charmed, deafened, frightened, stunned, or knocked unconscious."
        ),
        actions = listOf(
            "Multiattack. The dog makes two bite attacks.",
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 5 (1d6 + 2) piercing damage. If the target is a creature, it must succeed on a DC 12 Constitution saving throw against disease or become poisoned until the disease is cured. Every 24 hours that elapse, the creature must repeat the saving throw, reducing its hit point maximum by 5 (1d10) on a failure. This reduction lasts until the disease is cured. The creature dies if the disease reduces its hit point maximum to 0."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "A death dog is an ugly two-headed hound that roams plains, deserts, and the Underdark.",
        tags = "darkvision, condition resistance, multiattack, cc - poisoned",
        source = "Monster Manual (SRD)"
    )
)

val doppelganger = registerMonstrosityStatBlock(
    StatBlock(
        name = "Doppelganger",
        size = "Medium",
        type = "monstrosity (Shapechanger)",
        alignment = "neutral",
        armorClass = "14",
        hitPoints = "52 (8d8 + 16)",
        speed = "30 ft.",
        str = 11, strMod = "+0",
        dex = 18, dexMod = "+4",
        con = 14, conMod = "+2",
        int = 11, intMod = "+0",
        wis = 12, wisMod = "+1",
        cha = 14, chaMod = "+2",
        skills = "Deception +6, Insight +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "charmed",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 11",
        languages = "Common",
        challengeRating = "3",
        expValue = "700 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Shapechanger. The doppelganger can use its action to polymorph into a Small or Medium humanoid it has seen, or back into its true form. Its statistics, other than its size, are the same in each form. Any equipment it is wearing or carrying isn't transformed. It reverts to its true form if it dies.",
            "Ambusher. In the first round of a combat, the doppelganger has advantage on attack rolls against any creature it surprised.",
            "Surprise Attack. If the doppelganger surprises a creature and hits it with an attack during the first round of combat, the target takes an extra 10 (3d6) damage from the attack."
        ),
        actions = listOf(
            "Multiattack. The doppelganger makes two melee attacks.",
            "Slam. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 7 (1d6 + 4) bludgeoning damage.",
            "Read Thoughts. The doppelganger magically reads the surface thoughts of one creature within 60 feet of it. The effect can penetrate barriers, but 3 feet of wood or dirt, 2 feet of stone, 2 inches of metal, or a thin sheet of lead blocks it. While the target is in range, the doppelganger can continue reading its thoughts, as long as the doppelganger's concentration isn't broken (as if concentrating on a spell). While reading the target's mind, the doppelganger has advantage on Wisdom (Insight) and Charisma (Deception, Intimidation, and Persuasion) checks against the target."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Doppelgangers are devious shapeshifters that take on the appearance of other humanoids, throwing off pursuit or luring victims to their doom with misdirection and disguise.",
        tags = "condition immunity, darkvision, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val drider = registerMonstrosityStatBlock(
    StatBlock(
        name = "Drider",
        size = "Large",
        type = "monstrosity",
        alignment = "chaotic evil",
        armorClass = "19 (natural armor)",
        hitPoints = "123 (13d10 + 52)",
        speed = "30 ft., climb 30 ft.",
        str = 16, strMod = "+3",
        dex = 16, dexMod = "+3",
        con = 18, conMod = "+4",
        int = 13, intMod = "+1",
        wis = 14, wisMod = "+2",
        cha = 12, chaMod = "+1",
        skills = "Perception +5, Stealth +9",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 120 ft., passive Perception 15",
        languages = "Elvish, Undercommon",
        challengeRating = "6",
        expValue = "2300 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Fey Ancestry. The drider has advantage on saving throws against being charmed, and magic can't put the drider to sleep.",
            "Innate Spellcasting. The drider's innate spellcasting ability is Wisdom (spell save DC 13). The drider can innately cast the following spells, requiring no material components:\n" +
                    "At will: dancing lights\n" +
                    "1/day each: darkness, faerie fire",
            "Spider Climb. The drider can climb difficult surfaces, including upside down on ceilings, without needing to make an ability check.",
            "Sunlight Sensitivity. While in sunlight, the drider has disadvantage on attack rolls, as well as on Wisdom (Perception) checks that rely on sight.",
            "Web Walker. The drider ignores movement restrictions caused by webbing."
        ),
        actions = listOf(
            "Multiattack. The drider makes three attacks, either with its longsword or its longbow. It can replace one of those attacks with a bite attack.",
            "Bite. Melee Weapon Attack: +6 to hit, reach 5 ft., one creature. Hit: 2 (1d4) piercing damage plus 9 (2d8) poison damage.",
            "Longsword. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 7 (1d8 + 3) slashing damage, or 8 (1d10 + 3) slashing damage if used with two hands.",
            "Longbow. Ranged Weapon Attack: +6 to hit, range 150/600 ft., one target. Hit: 7 (1d8 + 3) piercing damage plus 4 (1d8) poison damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "climb speed, darkvision, condition resistance, condition immunity, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val ettercap = registerMonstrosityStatBlock(
    StatBlock(
        name = "Ettercap",
        size = "Medium",
        type = "monstrosity",
        alignment = "neutral evil",
        armorClass = "13 (natural armor)",
        hitPoints = "44 (8d8 + 8)",
        speed = "30 ft., climb 30 ft.",
        str = 14, strMod = "+2",
        dex = 15, dexMod = "+2",
        con = 13, conMod = "+1",
        int = 7, intMod = "-2",
        wis = 12, wisMod = "+1",
        cha = 8, chaMod = "-1",
        skills = "Perception +3, Stealth +4, Survival +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 13",
        languages = "—",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Spider Climb. The ettercap can climb difficult surfaces, including upside down on ceilings, without needing to make an ability check.",
            "Web Sense. While in contact with a web, the ettercap knows the exact location of any other creature in contact with the same web.",
            "Web Walker. The ettercap ignores movement restrictions caused by webbing."
        ),
        actions = listOf(
            "Multiattack. The ettercap makes two attacks: one with its bite and one with its claws.",
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one creature. Hit: 6 (1d8 + 2) piercing damage plus 4 (1d8) poison damage. The target must succeed on a DC 11 Constitution saving throw or be poisoned for 1 minute. The creature can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success.",
            "Claws. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 7 (2d4 + 2) slashing damage.",
            "Web (Recharge 5-6). Ranged Weapon Attack: +4 to hit, range 30/60 ft., one Large or smaller creature. Hit: The creature is restrained by webbing. As an action, the restrained creature can make a DC 11 Strength check, escaping from the webbing on a success. The effect ends if the webbing is destroyed. The webbing has AC 10, 5 hit points, vulnerability to fire damage, and immunity to bludgeoning, poison, and psychic damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "climb speed, darkvision, multiattack, cc - poisoned, cc - restrained",
        source = "Monster Manual (SRD)"
    )
)

val gorgon = registerMonstrosityStatBlock(
    StatBlock(
        name = "Gorgon",
        size = "Large",
        type = "monstrosity",
        alignment = "unaligned",
        armorClass = "19 (natural armor)",
        hitPoints = "114 (12d10 + 48)",
        speed = "40 ft.",
        str = 20, strMod = "+5",
        dex = 11, dexMod = "+0",
        con = 18, conMod = "+4",
        int = 2, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 7, chaMod = "-2",
        skills = "Perception +4",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = "petrified",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 14",
        languages = "—",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Trampling Charge. If the gorgon moves at least 20 feet straight toward a creature and then hits it with a gore attack on the same turn, that target must succeed on a DC 16 Strength saving throw or be knocked prone. If the target is prone, the gorgon can make one attack with its hooves against it as a bonus action."
        ),
        actions = listOf(
            "Gore. Melee Weapon Attack: +8 to hit, reach 5 ft., one target. Hit: 18 (2d12 + 5) piercing damage.",
            "Hooves. Melee Weapon Attack: +8 to hit, reach 5 ft., one target. Hit: 16 (2d10 + 5) bludgeoning damage.",
            "Petrifying Breath (Recharge 5-6). The gorgon exhales petrifying gas in a 30-foot cone. Each creature in that area must succeed on a DC 13 Constitution saving throw. On a failed save, a target begins to turn to stone and is restrained. The restrained target must repeat the saving throw at the end of its next turn. On a success, the effect ends on the target. On a failure, the target is petrified until freed by the greater restoration spell or other magic."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "condition immunity, darkvision, cc - prone, cc - restrained, cc - petrified",
        source = "Monster Manual (SRD)"
    )
)

val grick = registerMonstrosityStatBlock(
    StatBlock(
        name = "Grick",
        size = "Medium",
        type = "monstrosity",
        alignment = "neutral",
        armorClass = "14 (natural armor)",
        hitPoints = "27 (6d8)",
        speed = "30 ft., climb 30 ft.",
        str = 14, strMod = "+2",
        dex = 14, dexMod = "+2",
        con = 11, conMod = "+0",
        int = 3, intMod = "-4",
        wis = 14, wisMod = "+2",
        cha = 5, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "bludgeoning, piercing, and slashing damage from nonmagical attacks",
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 12",
        languages = "—",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Stone Camouflage. The grick has advantage on Dexterity (Stealth) checks made to hide in rocky terrain."
        ),
        actions = listOf(
            "Multiattack. The grick makes one attack with its tentacles. If that attack hits, the grick can make one beak attack against the same target.",
            "Tentacles. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 9 (2d6 + 2) slashing damage.",
            "Beak. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 5 (1d6 + 2) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "climb speed, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val griffon = registerMonstrosityStatBlock(
    StatBlock(
        name = "Griffon",
        size = "Large",
        type = "monstrosity",
        alignment = "unaligned",
        armorClass = "12",
        hitPoints = "59 (7d10 + 21)",
        speed = "30 ft., fly 80 ft.",
        str = 18, strMod = "+4",
        dex = 15, dexMod = "+2",
        con = 16, conMod = "+3",
        int = 2, intMod = "-4",
        wis = 13, wisMod = "+1",
        cha = 8, chaMod = "-1",
        skills = "Perception +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 15",
        languages = "—",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Sight. The griffon has advantage on Wisdom (Perception) checks that rely on sight."
        ),
        actions = listOf(
            "Multiattack. The griffon makes two attacks: one with its beak and one with its claws.",
            "Beak. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 8 (1d8 + 4) piercing damage.",
            "Claws. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 11 (2d6 + 4) slashing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "A griffon is a ferocious avian carnivore with the muscular body of a lion and the head, forelegs, and wings of an eagle.",
        tags = "fly speed, darkvision, keen sight, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val guardianNaga = registerMonstrosityStatBlock(
    StatBlock(
        name = "Guardian Naga",
        size = "Large",
        type = "monstrosity",
        alignment = "lawful good",
        armorClass = "18 (natural armor)",
        hitPoints = "127 (15d10 + 45)",
        speed = "40 ft.",
        str = 19, strMod = "+4",
        dex = 18, dexMod = "+4",
        con = 16, conMod = "+3",
        int = 16, intMod = "+3",
        wis = 19, wisMod = "+4",
        cha = 18, chaMod = "+4",
        skills = null,
        savingThrows = "Dex +8, Con +7, Int +7, Wis +8, Cha +8",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "charmed, poisoned",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 14",
        languages = "Celestial, Common",
        challengeRating = "10",
        expValue = "5900 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Rejuvenation. If it dies, the naga returns to life in 1d6 days and regains all its hit points. Only a wish spell can prevent this trait from functioning.",
            "Spellcasting. The naga is an 11th-level spellcaster. Its spellcasting ability is Wisdom (spell save DC 16, +8 to hit with spell attacks), and it needs only verbal components to cast its spells. It has the following cleric spells prepared:\n\n" +
                    "Cantrips (at will): mending, sacred flame, thaumaturgy\n" +
                    "1st level (4 slots): command, cure wounds, shield of faith\n" +
                    "2nd level (3 slots): calm emotions, hold person\n" +
                    "3rd level (3 slots): bestow curse, clairvoyance\n" +
                    "4th level (3 slots): banishment, freedom of movement\n" +
                    "5th level (2 slots): flame strike, geas\n" +
                    "6th level (1 slot): true seeing"
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +8 to hit, reach 10 ft., one creature. Hit: 8 (1d8 + 4) piercing damage, and the target must make a DC 15 Constitution saving throw, taking 45 (10d8) poison damage on a failed save, or half as much damage on a successful one.",
            "Spit Poison. Ranged Weapon Attack: +8 to hit, range 15/30 ft., one creature. Hit: The target must make a DC 15 Constitution saving throw, taking 45 (10d8) poison damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage immunity, condition immunity, darkvision",
        source = "Monster Manual (SRD)"
    )
)

val gynosphinx = registerMonstrosityStatBlock(
    StatBlock(
        name = "Gynosphinx",
        size = "Large",
        type = "monstrosity",
        alignment = "lawful neutral",
        armorClass = "17 (natural armor)",
        hitPoints = "136 (16d10 + 48)",
        speed = "40 ft., fly 60 ft.",
        str = 18, strMod = "+4",
        dex = 15, dexMod = "+2",
        con = 16, conMod = "+3",
        int = 18, intMod = "+4",
        wis = 18, wisMod = "+4",
        cha = 18, chaMod = "+4",
        skills = "Arcana +12, History +12, Perception +8, Religion +8",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = "bludgeoning, piercing, and slashing from nonmagical attacks",
        damageImmunities = "psychic",
        conditionResistances = null,
        conditionImmunities = "charmed, frightened",
        legendaryResistance = null,
        senses = "truesight 120 ft., passive Perception 18",
        languages = "Common, Sphinx",
        challengeRating = "11",
        expValue = "7200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Inscrutable. The sphinx is immune to any effect that would sense its emotions or read its thoughts, as well as any divination spell that it refuses. Wisdom (Insight) checks made to ascertain the sphinx's intentions or sincerity have disadvantage.",
            "Magic Weapons. The sphinx's weapon attacks are magical.",
            "Spellcasting. The sphinx is a 9th-level spellcaster. Its spellcasting ability is Intelligence (spell save DC 16, +8 to hit with spell attacks). It requires no material components to cast its spells. The sphinx has the following wizard spells prepared:\n\n" +
                    "Cantrips (at will): mage hand, minor illusion, prestidigitation\n" +
                    "1st level (4 slots): detect magic, identify, shield\n" +
                    "2nd level (3 slots): darkness, locate object, suggestion\n" +
                    "3rd level (3 slots): dispel magic, remove curse, tongues\n" +
                    "4th level (3 slots): banishment, greater invisibility\n" +
                    "5th level (1 slot): legend lore"
        ),
        actions = listOf(
            "Multiattack. The sphinx makes two claw attacks.",
            "Claw. Melee Weapon Attack: +8 to hit, reach 5 ft., one target. Hit: 13 (2d8 + 4) slashing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "Claw Attack. The sphinx makes one claw attack.",
            "Teleport (Costs 2 Actions). The sphinx magically teleports, along with any equipment it is wearing or carrying, up to 120 feet to an unoccupied space it can see.",
            "Cast a Spell (Costs 3 Actions). The sphinx casts a spell from its list of prepared spells, using a spell slot as normal."
        ),
        description = null,
        tags = "fly speed, damage resistance, damage immunity, condition immunity, truesight, multiattack, legendary action",
        source = "Monster Manual (SRD)"
    )
)

val harpy = registerMonstrosityStatBlock(
    StatBlock(
        name = "Harpy",
        size = "Medium",
        type = "monstrosity",
        alignment = "chaotic evil",
        armorClass = "11",
        hitPoints = "38 (7d8 + 7)",
        speed = "20 ft., fly 40 ft.",
        str = 12, strMod = "+1",
        dex = 13, dexMod = "+1",
        con = 12, conMod = "+1",
        int = 7, intMod = "-2",
        wis = 10, wisMod = "+0",
        cha = 13, chaMod = "+1",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 10",
        languages = "Common",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(),
        actions = listOf(
            "Multiattack. The harpy makes two attacks: one with its claws and one with its club.",
            "Claws. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 6 (2d4 + 1) slashing damage.",
            "Club. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 3 (1d4 + 1) bludgeoning damage.",
            "Luring Song. The harpy sings a magical melody. Every humanoid and giant within 300 feet of the harpy that can hear the song must succeed on a DC 11 Wisdom saving throw or be charmed until the song ends. The harpy must take a bonus action on its subsequent turns to continue singing. It can stop singing at any time. The song ends if the harpy is incapacitated. While charmed by the harpy, a target is incapacitated and ignores the songs of other harpies. If the charmed target is more than 5 feet away from the harpy, the target must move on its turn toward the harpy by the most direct route. It doesn't avoid opportunity attacks, but before moving into damaging terrain, such as lava or a pit, and whenever it takes damage from a source other than the harpy, a target can repeat the saving throw. A creature can also repeat the saving throw at the end of each of its turns. If a creature's saving throw is successful, the effect ends on it. A target that successfully saves is immune to this harpy's song for the next 24 hours."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, multiattack, cc - charmed, cc - incapacitated",
        source = "Monster Manual (SRD)"
    )
)

val hippogriff = registerMonstrosityStatBlock(
    StatBlock(
        name = "Hippogriff",
        size = "Large",
        type = "monstrosity",
        alignment = "unaligned",
        armorClass = "11",
        hitPoints = "19 (3d10 + 3)",
        speed = "40 ft., fly 60 ft.",
        str = 17, strMod = "+3",
        dex = 13, dexMod = "+1",
        con = 13, conMod = "+1",
        int = 2, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 8, chaMod = "-1",
        skills = "Perception +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 15",
        languages = "—",
        challengeRating = "1",
        expValue = "200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Sight. The hippogriff has advantage on Wisdom (Perception) checks that rely on sight."
        ),
        actions = listOf(
            "Multiattack. The hippogriff makes two attacks: one with its beak and one with its claws.",
            "Beak. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 8 (1d10 + 3) piercing damage.",
            "Claws. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 10 (2d6 + 3) slashing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "A hippogriff is a magical creature possessing the wings and forelimbs of an eagle, the hindquarters of a horse, and a head that combines the features of both animals.",
        tags = "fly speed, keen sight, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val hydra = registerMonstrosityStatBlock(
    StatBlock(
        name = "Hydra",
        size = "Huge",
        type = "monstrosity",
        alignment = "unaligned",
        armorClass = "15 (natural armor)",
        hitPoints = "172 (15d12 + 75)",
        speed = "30 ft., swim 30 ft.",
        str = 20, strMod = "+5",
        dex = 12, dexMod = "+1",
        con = 20, conMod = "+5",
        int = 2, intMod = "-4",
        wis = 10, wisMod = "+0",
        cha = 7, chaMod = "-2",
        skills = "Perception +6",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 16",
        languages = "—",
        challengeRating = "8",
        expValue = "3900 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Hold Breath. The hydra can hold its breath for 1 hour.",
            "Multiple Heads. The hydra has five heads. While it has more than one head, the hydra has advantage on saving throws against being blinded, charmed, deafened, frightened, stunned, and knocked unconscious. Whenever the hydra takes 25 or more damage in a single turn, one of its heads dies. If all its heads die, the hydra dies. At the end of its turn, it grows two heads for each of its heads that died since its last turn, unless it has taken fire damage since its last turn. The hydra regains 10 hit points for each head regrown in this way.",
            "Reactive Heads. For each head the hydra has beyond one, it gets an extra reaction that can be used only for opportunity attacks.",
            "Wakeful. While the hydra sleeps, at least one of its heads is awake."
        ),
        actions = listOf(
            "Multiattack. The hydra makes as many bite attacks as it has heads.",
            "Bite. Melee Weapon Attack: +8 to hit, reach 10 ft., one target. Hit: 10 (1d10 + 5) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "The hydra is a reptilian horror with a crocodilian body and multiple heads on long, serpentine necks. Although its heads can be severed, the hydra magically regrows them in short order.",
        tags = "swim speed, darkvision, hold breath, condition resistance, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val kraken = registerMonstrosityStatBlock(
    StatBlock(
        name = "Kraken",
        size = "Gargantuan",
        type = "monstrosity (Titan)",
        alignment = "chaotic evil",
        armorClass = "18 (natural armor)",
        hitPoints = "472 (27d20 + 189)",
        speed = "20 ft., swim 60 ft.",
        str = 30, strMod = "+10",
        dex = 11, dexMod = "+0",
        con = 25, conMod = "+7",
        int = 22, intMod = "+6",
        wis = 18, wisMod = "+4",
        cha = 20, chaMod = "+5",
        skills = null,
        savingThrows = "Str +17, Dex +7, Con +14, Int +13, Wis +11",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "lightning; bludgeoning, piercing, and slashing from nonmagical attacks",
        conditionResistances = null,
        conditionImmunities = "frightened, paralyzed",
        legendaryResistance = null,
        senses = "truesight 120 ft., passive Perception 14",
        languages = "understands Abyssal, Celestial, Infernal, and Primordial but can't speak, telepathy 120 ft.",
        challengeRating = "23",
        expValue = "50000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The kraken can breathe air and water.",
            "Freedom of Movement. The kraken ignores difficult terrain, and magical effects can't reduce its speed or cause it to be restrained. It can spend 5 feet of movement to escape from nonmagical restraints or being grappled.",
            "Siege Monster. The kraken deals double damage to objects and structures."
        ),
        actions = listOf(
            "Multiattack. The kraken makes three tentacle attacks, each of which it can replace with one use of Fling.",
            "Bite. Melee Weapon Attack: +17 to hit, reach 5 ft., one target. Hit: 23 (3d8 + 10) piercing damage. If the target is a Large or smaller creature grappled by the kraken, that creature is swallowed, and the grapple ends. While swallowed, the creature is blinded and restrained, it has total cover against attacks and other effects outside the kraken, and it takes 42 (12d6) acid damage at the start of each of the kraken's turns. If the kraken takes 50 damage or more on a single turn from a creature inside it, the kraken must succeed on a DC 25 Constitution saving throw at the end of that turn or regurgitate all swallowed creatures, which fall prone in a space within 10 feet of the kraken. If the kraken dies, a swallowed creature is no longer restrained by it and can escape from the corpse using 15 feet of movement, exiting prone.",
            "Tentacle. Melee Weapon Attack: +17 to hit, reach 30 ft., one target. Hit: 20 (3d6 + 10) bludgeoning damage, and the target is grappled (escape DC 18). Until this grapple ends, the target is restrained. The kraken has ten tentacles, each of which can grapple one target.",
            "Fling. One Large or smaller object held or creature grappled by the kraken is thrown up to 60 feet in a random direction and knocked prone. If a thrown target strikes a solid surface, the target takes 3 (1d6) bludgeoning damage for every 10 feet it was thrown. If the target is thrown at another creature, that creature must succeed on a DC 18 Dexterity saving throw or take the same damage and be knocked prone.",
            "Lightning Storm. The kraken magically creates three bolts of lightning, each of which can strike a target the kraken can see within 120 feet of it. A target must make a DC 23 Dexterity saving throw, taking 22 (4d10) lightning damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "Tentacle Attack or Fling. The kraken makes one tentacle attack or uses its Fling.",
            "Lightning Storm (Costs 2 Actions). The kraken uses Lightning Storm.",
            "Ink Cloud (Costs 3 Actions). While underwater, the kraken expels an ink cloud in a 60-foot radius. The cloud spreads around corners, and that area is heavily obscured to creatures other than the kraken. Each creature other than the kraken that ends its turn there must succeed on a DC 23 Constitution saving throw, taking 16 (3d10) poison damage on a failed save, or half as much damage on a successful one. A strong current disperses the cloud, which otherwise disappears at the end of the kraken's next turn."
        ),
        description = null,
        tags = "swim speed, damage immunity, condition immunity, truesight, telepathic, amphibious, water breathing, multiattack, cc - blinded, cc - restrained, cc - prone, cc - grappled, legendary action",
        source = "Monster Manual (SRD)"
    )
)

val lamia = registerMonstrosityStatBlock(
    StatBlock(
        name = "Lamia",
        size = "Large",
        type = "monstrosity",
        alignment = "chaotic evil",
        armorClass = "13 (natural armor)",
        hitPoints = "97 (13d10 + 26)",
        speed = "30 ft.",
        str = 16, strMod = "+3",
        dex = 13, dexMod = "+1",
        con = 15, conMod = "+2",
        int = 14, intMod = "+2",
        wis = 15, wisMod = "+2",
        cha = 16, chaMod = "+3",
        skills = "Deception +7, Insight +4, Stealth +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 12",
        languages = "Abyssal, Common",
        challengeRating = "4",
        expValue = "1100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Innate Spellcasting. The lamia's innate spellcasting ability is Charisma (spell save DC 13). It can innately cast the following spells, requiring no material components.\n\nAt will: disguise self (any humanoid form), major image\n3/day each: charm person, mirror image, scrying, suggestion\n1/day: geas"
        ),
        actions = listOf(
            "Multiattack. The lamia makes two attacks: one with its claws and one with its dagger or Intoxicating Touch.",
            "Claws. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 14 (2d10 + 3) slashing damage.",
            "Dagger. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 5 (1d4 + 3) piercing damage.",
            "Intoxicating Touch. Melee Spell Attack: +5 to hit, reach 5 ft., one creature. Hit: The target is magically cursed for 1 hour. Until the curse ends, the target has disadvantage on Wisdom saving throws and all ability checks."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "darkvision, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val manticore = registerMonstrosityStatBlock(
    StatBlock(
        name = "Manticore",
        size = "Large",
        type = "monstrosity",
        alignment = "lawful evil",
        armorClass = "14 (natural armor)",
        hitPoints = "68 (8d10 + 24)",
        speed = "30 ft., fly 50 ft.",
        str = 17, strMod = "+3",
        dex = 16, dexMod = "+3",
        con = 17, conMod = "+3",
        int = 7, intMod = "-2",
        wis = 12, wisMod = "+1",
        cha = 8, chaMod = "-1",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 11",
        languages = "Common",
        challengeRating = "3",
        expValue = "700 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Tail Spike Regrowth. The manticore has twenty-four tail spikes. Used spikes regrow when the manticore finishes a long rest."
        ),
        actions = listOf(
            "Multiattack. The manticore makes three attacks: one with its bite and two with its claws or three with its tail spikes.",
            "Bite. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 7 (1d8 + 3) piercing damage.",
            "Claw. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 6 (1d6 + 3) slashing damage.",
            "Tail Spike. Ranged Weapon Attack: +5 to hit, range 100/200 ft., one target. Hit: 7 (1d8 + 3) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "fly speed, darkvision, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val medusa = registerMonstrosityStatBlock(
    StatBlock(
        name = "Medusa",
        size = "Medium",
        type = "monstrosity",
        alignment = "lawful evil",
        armorClass = "15 (natural armor)",
        hitPoints = "127 (17d8 + 51)",
        speed = "30 ft.",
        str = 10, strMod = "+0",
        dex = 15, dexMod = "+2",
        con = 16, conMod = "+3",
        int = 12, intMod = "+1",
        wis = 13, wisMod = "+1",
        cha = 15, chaMod = "+2",
        skills = "Deception +5, Insight +4, Perception +4, Stealth +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 14",
        languages = "Common",
        challengeRating = "6",
        expValue = "2300 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Petrifying Gaze. When a creature that can see the medusa's eyes starts its turn within 30 feet of the medusa, the medusa can force it to make a DC 14 Constitution saving throw if the medusa isn't incapacitated and can see the creature. If the saving throw fails by 5 or more, the creature is instantly petrified. Otherwise, a creature that fails the save begins to turn to stone and is restrained. The restrained creature must repeat the saving throw at the end of its next turn, becoming petrified on a failure or ending the effect on a success. The petrification lasts until the creature is freed by the greater restoration spell or other magic. Unless surprised, a creature can avert its eyes to avoid the saving throw at the start of its turn. If the creature does so, it can't see the medusa until the start of its next turn, when it can avert its eyes again. If the creature looks at the medusa in the meantime, it must immediately make the save. If the medusa sees itself reflected on a polished surface within 30 feet of it and in an area of bright light, the medusa is, due to its curse, affected by its own gaze."
        ),
        actions = listOf(
            "Multiattack. The medusa makes either three melee attacks -one with its snake hair and two with its shortsword- or two ranged attacks with its longbow.",
            "Snake Hair. Melee Weapon Attack: +5 to hit, reach 5 ft., one creature. Hit: 4 (1d4 + 2) piercing damage plus 14 (4d6) poison damage.",
            "Shortsword. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 5 (1d6 + 2) piercing damage.",
            "Longbow. Ranged Weapon Attack: +5 to hit, range 150/600 ft., one target. Hit: 6 (1d8 + 2) piercing damage plus 7 (2d6) poison damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "A victim of a terrible curse, the serpent-haired medusa petrifies all those who gaze upon it, turning creatures into stone monuments to its corruption.",
        tags = "darkvision, cc - petrified, cc - restrained, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val merrow = registerMonstrosityStatBlock(
    StatBlock(
        name = "Merrow",
        size = "Large",
        type = "monstrosity",
        alignment = "chaotic evil",
        armorClass = "13 (natural armor)",
        hitPoints = "45 (6d10 + 12)",
        speed = "10 ft., swim 40 ft.",
        str = 18, strMod = "+4",
        dex = 10, dexMod = "+0",
        con = 15, conMod = "+2",
        int = 8, intMod = "-1",
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
        languages = "Abyssal, Aquan",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Amphibious. The merrow can breathe air and water."
        ),
        actions = listOf(
            "Multiattack. The merrow makes two attacks: one with its bite and one with its claws or harpoon.",
            "Bite. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 8 (1d8 + 4) piercing damage.",
            "Claws. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 9 (2d4 + 4) slashing damage.",
            "Harpoon. Melee or Ranged Weapon Attack: +6 to hit, reach 5 ft. or range 20/60 ft., one target. Hit: 11 (2d6 + 4) piercing damage. If the target is a Huge or smaller creature, it must succeed on a Strength contest against the merrow or be pulled up to 20 feet toward the merrow."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "swim speed, darkvision, amphibious, water breathing, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val mimic = registerMonstrosityStatBlock(
    StatBlock(
        name = "Mimic",
        size = "Medium",
        type = "monstrosity (Shapechanger)",
        alignment = "neutral",
        armorClass = "12 (natural armor)",
        hitPoints = "58 (9d8 + 18)",
        speed = "15 ft.",
        str = 17, strMod = "+3",
        dex = 12, dexMod = "+1",
        con = 15, conMod = "+2",
        int = 5, intMod = "-3",
        wis = 13, wisMod = "+1",
        cha = 8, chaMod = "-1",
        skills = "Stealth +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "acid",
        conditionResistances = null,
        conditionImmunities = "prone",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 11",
        languages = "—",
        challengeRating = "2",
        expValue = "450 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Shapechanger. The mimic can use its action to polymorph into an object or back into its true, amorphous form. Its statistics are the same in each form. Any equipment it is wearing or carrying isn't transformed. It reverts to its true form if it dies.",
            "Adhesive (Object Form Only). The mimic adheres to anything that touches it. A Huge or smaller creature adhered to the mimic is also grappled by it (escape DC 13). Ability checks made to escape this grapple have disadvantage.",
            "False Appearance (Object Form Only). While the mimic remains motionless, it is indistinguishable from an ordinary object.",
            "Grappler. The mimic has advantage on attack rolls against any creature grappled by it."
        ),
        actions = listOf(
            "Pseudopod. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 7 (1d8 + 3) bludgeoning damage. If the mimic is in object form, the target is subjected to its Adhesive trait.",
            "Bite. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 7 (1d8 + 3) piercing damage plus 4 (1d8) acid damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage immunity, condition immunity, darkvision, cc - grappled",
        source = "Monster Manual (SRD)"
    )
)

val minotaur = registerMonstrosityStatBlock(
    StatBlock(
        name = "Minotaur",
        size = "Large",
        type = "monstrosity",
        alignment = "chaotic evil",
        armorClass = "14 (natural armor)",
        hitPoints = "76 (9d10 + 27)",
        speed = "40 ft.",
        str = 18, strMod = "+4",
        dex = 11, dexMod = "+0",
        con = 16, conMod = "+3",
        int = 6, intMod = "-2",
        wis = 16, wisMod = "+3",
        cha = 9, chaMod = "-1",
        skills = "Perception +7",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 17",
        languages = "Abyssal",
        challengeRating = "3",
        expValue = "700 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Charge. If the minotaur moves at least 10 feet straight toward a target and then hits it with a gore attack on the same turn, the target takes an extra 9 (2d8) piercing damage. If the target is a creature, it must succeed on a DC 14 Strength saving throw or be pushed up to 10 feet away and knocked prone.",
            "Labyrinthine Recall. The minotaur can perfectly recall any path it has traveled.",
            "Reckless. At the start of its turn, the minotaur can gain advantage on all melee weapon attack rolls it makes during that turn, but attack rolls against it have advantage until the start of its next turn."
        ),
        actions = listOf(
            "Greataxe. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 17 (2d12 + 4) slashing damage.",
            "Gore. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 13 (2d8 + 4) piercing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "Their fur stained with the blood of fallen foes, minotaurs are massive, bull-headed humanoids whose roar is a savage battle cry that all civilized creatures fear.",
        tags = "darkvision, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val owlbear = registerMonstrosityStatBlock(
    StatBlock(
        name = "Owlbear",
        size = "Large",
        type = "monstrosity",
        alignment = "unaligned",
        armorClass = "13 (natural armor)",
        hitPoints = "59 (7d10 + 21)",
        speed = "40 ft.",
        str = 20, strMod = "+5",
        dex = 12, dexMod = "+1",
        con = 17, conMod = "+3",
        int = 3, intMod = "-4",
        wis = 12, wisMod = "+1",
        cha = 7, chaMod = "-2",
        skills = "Perception +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 13",
        languages = "—",
        challengeRating = "3",
        expValue = "700 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Sight and Smell. The owlbear has advantage on Wisdom (Perception) checks that rely on sight or smell."
        ),
        actions = listOf(
            "Multiattack. The owlbear makes two attacks: one with its beak and one with its claws.",
            "Beak. Melee Weapon Attack: +7 to hit, reach 5 ft., one creature. Hit: 10 (1d10 + 5) piercing damage.",
            "Claws. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 14 (2d8 + 5) slashing damage."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "A monstrous cross between giant owl and bear, an owlbear's reputation for ferocity and aggression makes it one of the most feared predators of the wild.",
        tags = "darkvision, keen sight, keen smell, multiattack",
        source = "Monster Manual (SRD)"
    )
)

val phaseSpider = registerMonstrosityStatBlock(
    StatBlock(
        name = "Phase Spider",
        size = "Large",
        type = "monstrosity",
        alignment = "unaligned",
        armorClass = "13 (natural armor)",
        hitPoints = "32 (5d10 + 5)",
        speed = "30 ft., climb 30 ft.",
        str = 15, strMod = "+2",
        dex = 15, dexMod = "+2",
        con = 12, conMod = "+1",
        int = 6, intMod = "-2",
        wis = 10, wisMod = "+0",
        cha = 6, chaMod = "-2",
        skills = "Stealth +6",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 10",
        languages = "—",
        challengeRating = "3",
        expValue = "700 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Ethereal Jaunt. As a bonus action, the spider can magically shift from the Material Plane to the Ethereal Plane, or vice versa.",
            "Spider Climb. The spider can climb difficult surfaces, including upside down on ceilings, without needing to make an ability check.",
            "Web Walker. The spider ignores movement restrictions caused by webbing."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +4 to hit, reach 5 ft., one creature. Hit: 7 (1d10 + 2) piercing damage, and the target must make a DC 11 Constitution saving throw, taking 18 (4d8) poison damage on a failed save, or half as much damage on a successful one. If the poison damage reduces the target to 0 hit points, the target is stable but poisoned for 1 hour, even after regaining hit points, and is paralyzed while poisoned in this way."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "A phase spider possesses the magical ability to phase in and out of the Ethereal Plane. It seems to appear out of nowhere and quickly vanishes after attacking.",
        tags = "climb speed, darkvision, cc - poisoned, cc - paralyzed",
        source = "Monster Manual (SRD)"
    )
)

val purpleWorm = registerMonstrosityStatBlock(
    StatBlock(
        name = "Purple Worm",
        size = "Gargantuan",
        type = "monstrosity",
        alignment = "unaligned",
        armorClass = "18 (natural armor)",
        hitPoints = "247 (15d20 + 90)",
        speed = "50 ft., burrow 30 ft.",
        str = 28, strMod = "+9",
        dex = 7, dexMod = "-2",
        con = 22, conMod = "+6",
        int = 1, intMod = "-5",
        wis = 8, wisMod = "-1",
        cha = 4, chaMod = "-3",
        skills = null,
        savingThrows = "Con +11, Wis +4",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "blindsight 30 ft., tremorsense 60 ft., passive Perception 9",
        languages = "—",
        challengeRating = "15",
        expValue = "13000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Tunneler. The worm can burrow through solid rock at half its burrow speed and leaves a 10-foot-diameter tunnel in its wake."
        ),
        actions = listOf(
            "Multiattack. The worm makes two attacks: one with its bite and one with its stinger.",
            "Bite. Melee Weapon Attack: +14 to hit, reach 10 ft., one target. Hit: 22 (3d8 + 9) piercing damage. If the target is a Large or smaller creature, it must succeed on a DC 19 Dexterity saving throw or be swallowed by the worm. A swallowed creature is blinded and restrained, it has total cover against attacks and other effects outside the worm, and it takes 21 (6d6) acid damage at the start of each of the worm's turns. If the worm takes 30 damage or more on a single turn from a creature inside it, the worm must succeed on a DC 21 Constitution saving throw at the end of that turn or regurgitate all swallowed creatures, which fall prone in a space within 10 feet of the worm. If the worm dies, a swallowed creature is no longer restrained by it and can escape from the corpse by using 20 feet of movement, exiting prone.",
            "Tail Stinger. Melee Weapon Attack: +14 to hit, reach 10 ft., one creature. Hit: 19 (3d6 + 9) piercing damage, and the target must make a DC 19 Constitution saving throw, taking 42 (12d6) poison damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "burrow speed, blindsight, tremorsense, multiattack, cc - blinded, cc - restrained, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val remorhaz = registerMonstrosityStatBlock(
    StatBlock(
        name = "Remorhaz",
        size = "Huge",
        type = "monstrosity",
        alignment = "unaligned",
        armorClass = "17 (natural armor)",
        hitPoints = "195 (17d12 + 85)",
        speed = "30 ft., burrow 20 ft.",
        str = 24, strMod = "+7",
        dex = 13, dexMod = "+1",
        con = 21, conMod = "+5",
        int = 4, intMod = "-3",
        wis = 10, wisMod = "+0",
        cha = 5, chaMod = "-3",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "cold, fire",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., tremorsense 60 ft., passive Perception 10",
        languages = "—",
        challengeRating = "11",
        expValue = "7200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Heated Body. A creature that touches the remorhaz or hits it with a melee attack while within 5 feet of it takes 10 (3d6) fire damage."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +11 to hit, reach 10 ft., one target. Hit: 40 (6d10 + 7) piercing damage plus 10 (3d6) fire damage. If the target is a creature, it is grappled (escape DC 17). Until this grapple ends, the target is restrained, and the remorhaz can't bite another target.",
            "Swallow. The remorhaz makes one bite attack against a Medium or smaller creature it is grappling. If the attack hits, that creature takes the bite's damage and is swallowed, and the grapple ends. While swallowed, the creature is blinded and restrained, it has total cover against attacks and other effects outside the remorhaz, and it takes 21 (6d6) acid damage at the start of each of the remorhaz's turns. If the remorhaz takes 30 damage or more on a single turn from a creature inside it, the remorhaz must succeed on a DC 15 Constitution saving throw at the end of that turn or regurgitate all swallowed creatures, which fall prone in a space within 10 feet of the remorhaz. If the remorhaz dies, a swallowed creature is no longer restrained by it and can escape from the corpse using 15 feet of movement, exiting prone."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "burrow speed, damage immunity, darkvision, tremorsense, cc - grappled, cc - restrained, cc - blinded, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val roc = registerMonstrosityStatBlock(
    StatBlock(
        name = "Roc",
        size = "Gargantuan",
        type = "monstrosity",
        alignment = "unaligned",
        armorClass = "15 (natural armor)",
        hitPoints = "248 (16d20 + 80)",
        speed = "20 ft., fly 120 ft.",
        str = 28, strMod = "+9",
        dex = 10, dexMod = "+0",
        con = 20, conMod = "+5",
        int = 3, intMod = "-4",
        wis = 10, wisMod = "+0",
        cha = 9, chaMod = "-1",
        skills = "Perception +4",
        savingThrows = "Dex +4, Con +9, Wis +4, Cha +3",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 14",
        languages = "—",
        challengeRating = "11",
        expValue = "7200 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Sight. The roc has advantage on Wisdom (Perception) checks that rely on sight."
        ),
        actions = listOf(
            "Multiattack. The roc makes two attacks: one with its beak and one with its talons.",
            "Beak. Melee Weapon Attack: +13 to hit, reach 10 ft., one target. Hit: 27 (4d8 + 9) piercing damage.",
            "Talons. Melee Weapon Attack: +13 to hit, reach 5 ft., one target. Hit: 23 (4d6 + 9) slashing damage, and the target is grappled (escape DC 19). Until this grapple ends, the target is restrained, and the roc can't use its talons on another target."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "flyspeed, keen sight, multiattack, cc - grappled, cc - restrained",
        source = "Monster Manual (SRD)"
    )
)

val roper = registerMonstrosityStatBlock(
    StatBlock(
        name = "Roper",
        size = "Large",
        type = "monstrosity",
        alignment = "neutral evil",
        armorClass = "20 (natural armor)",
        hitPoints = "93 (11d10 + 33)",
        speed = "10 ft., climb 10 ft.",
        str = 18, strMod = "+4",
        dex = 8, dexMod = "-1",
        con = 17, conMod = "+3",
        int = 7, intMod = "-2",
        wis = 16, wisMod = "+3",
        cha = 6, chaMod = "-2",
        skills = "Perception +6, Stealth +5",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 16",
        languages = "—",
        challengeRating = "5",
        expValue = "1800 XP",
        proficiencyBonus = null,
        traits = listOf(
            "False Appearance. While the roper remains motionless, it is indistinguishable from a normal cave formation, such as a stalagmite.",
            "Grasping Tendrils. The roper can have up to six tendrils at a time. Each tendril can be attacked (AC 20; 10 hit points; immunity to poison and psychic damage). Destroying a tendril deals no damage to the roper, which can extrude a replacement tendril on its next turn. A tendril can also be broken if a creature takes an action and succeeds on a DC 15 Strength check against it.",
            "Spider Climb. The roper can climb difficult surfaces, including upside down on ceilings, without needing to make an ability check."
        ),
        actions = listOf(
            "Multiattack. The roper makes four attacks with its tendrils, uses Reel, and makes one attack with its bite.",
            "Bite. Melee Weapon Attack: +7 to hit, reach 5 ft., one target. Hit: 22 (4d8 + 4) piercing damage.",
            "Tendril. Melee Weapon Attack: +7 to hit, reach 50 ft., one creature. Hit: The target is grappled (escape DC 15). Until the grapple ends, the target is restrained and has disadvantage on Strength checks and Strength saving throws, and the roper can't use the same tendril on another target.",
            "Reel. The roper pulls each creature grappled by it up to 25 feet straight toward it."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "climb speed, darkvision, multiattack, cc - grappled, cc - restrained",
        source = "Monster Manual (SRD)"
    )
)

val rustMonster = registerMonstrosityStatBlock(
    StatBlock(
        name = "Rust Monster",
        size = "Medium",
        type = "monstrosity",
        alignment = "unaligned",
        armorClass = "14 (natural armor)",
        hitPoints = "27 (5d8 + 5)",
        speed = "40 ft",
        str = 13, strMod = "+1",
        dex = 12, dexMod = "+1",
        con = 13, conMod = "+1",
        int = 2, intMod = "-4",
        wis = 13, wisMod = "+1",
        cha = 6, chaMod = "-2",
        skills = null,
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = null,
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 11",
        languages = "—",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Iron Scent. The rust monster can pinpoint, by scent, the location of ferrous metal within 30 feet of it.",
            "Rust Metal. Any nonmagical weapon made of metal that hits the rust monster corrodes. After dealing damage, the weapon takes a permanent and cumulative -1 penalty to damage rolls. If its penalty drops to -5, the weapon is destroyed. Nonmagical ammunition made of metal that hits the rust monster is destroyed after dealing damage."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 5 (1d8 + 1) piercing damage.",
            "Antennae. The rust monster corrodes a nonmagical ferrous metal object it can see within 5 feet of it. If the object isn't being worn or carried, the touch destroys a 1-foot cube of it. If the object is being worn or carried by a creature, the creature can make a DC 11 Dexterity saving throw to avoid the rust monster's touch. If the object touched is either metal armor or a metal shield being worn or carried, its takes a permanent and cumulative -1 penalty to the AC it offers. Armor reduced to an AC of 10 or a shield that drops to a +0 bonus is destroyed. If the object touched is a held metal weapon, it rusts as described in the Rust Metal trait."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = "These strange, normally docile creatures corrode ferrous metals, then gobble up the rust they create.",
        tags = "darkvision",
        source = "Monster Manual (SRD)"
    )
)

val spiritNaga = registerMonstrosityStatBlock(
    StatBlock(
        name = "Spirit Naga",
        size = "Large",
        type = "monstrosity",
        alignment = "chaotic evil",
        armorClass = "15 (natural armor)",
        hitPoints = "75 (10d10 + 20)",
        speed = "40 ft.",
        str = 18, strMod = "+4",
        dex = 17, dexMod = "+3",
        con = 14, conMod = "+2",
        int = 16, intMod = "+3",
        wis = 15, wisMod = "+2",
        cha = 16, chaMod = "+3",
        skills = null,
        savingThrows = "Dex +6, Con +5, Wis +5, Cha +6",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "poison",
        conditionResistances = null,
        conditionImmunities = "charmed, poisoned",
        legendaryResistance = null,
        senses = "darkvision 60 ft., passive Perception 12",
        languages = "Abyssal, Common",
        challengeRating = "8",
        expValue = "3900 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Rejuvenation. If it dies, the naga returns to life in 1d6 days and regains all its hit points. Only a wish spell can prevent this trait from functioning.",
            "Spellcasting. The naga is a 10th-level spellcaster. Its spellcasting ability is Intelligence (spell save DC 14, +6 to hit with spell attacks), and it needs only verbal components to cast its spells. It has the following wizard spells prepared:",
            "Cantrips (at will): mage hand, minor illusion, ray of frost",
            "1st level (4 slots): charm person, detect magic, sleep",
            "2nd level (3 slots): detect thoughts, hold person",
            "3rd level (3 slots): lightning bolt, water breathing",
            "4th level (3 slots): blight, dimension door",
            "5th level (2 slots): dominate person"
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +7 to hit, reach 10 ft., one creature. Hit: 7 (1d6 + 4) piercing damage, and the target must make a DC 13 Constitution saving throw, taking 31 (7d8) poison damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(),
        description = null,
        tags = "damage immunity, condition immunity, darkvision",
        source = "Monster Manual (SRD)"
    )
)

val tarrasque = registerMonstrosityStatBlock(
    StatBlock(
        name = "Tarrasque",
        size = "Gargantuan",
        type = "monstrosity",
        alignment = "unaligned",
        armorClass = "25 (natural armor)",
        hitPoints = "676 (33d20 + 330)",
        speed = "40 ft.",
        str = 30, strMod = "+10",
        dex = 11, dexMod = "+0",
        con = 30, conMod = "+10",
        int = 3, intMod = "-4",
        wis = 11, wisMod = "+0",
        cha = 11, chaMod = "+0",
        skills = null,
        savingThrows = "Int +5, Wis +9, Cha +9",
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "fire, poison; bludgeoning, piercing and slashing from nonmagical attacks",
        conditionResistances = null,
        conditionImmunities = "charmed, frightened, paralyzed, poisoned",
        legendaryResistance = "Legendary Resistance (3/Day). If the tarrasque fails a saving throw, it can choose to succeed instead.",
        senses = "blindsight 120 ft., passive Perception 10",
        languages = "—",
        challengeRating = "30",
        expValue = "155000 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Magic Resistance. The tarrasque has advantage on saving throws against spells and other magical effects.",
            "Reflective Carapace. Any time the tarrasque is targeted by a magic missile spell, a line spell, or a spell that requires a ranged attack roll, roll a d6. On a 1 to 5, the tarrasque is unaffected. On a 6, the tarrasque is unaffected, and the effect is reflected back at the caster as though it originated from the tarrasque, turning the caster into the target.",
            "Siege Monster. The tarrasque deals double damage to objects and structures."
        ),
        actions = listOf(
            "Multiattack. The tarrasque can use its Frightful Presence. It then makes five attacks: one with its bite, two with its claws, one with its horns, and one with its tail. It can use its Swallow instead of its bite.",
            "Bite. Melee Weapon Attack: +19 to hit, reach 10 ft., one target. Hit: 36 (4d12 + 10) piercing damage. If the target is a creature, it is grappled (escape DC 20). Until this grapple ends, the target is restrained, and the tarrasque can't bite another target.",
            "Claw. Melee Weapon Attack: +19 to hit, reach 15 ft., one target. Hit: 28 (4d8 + 10) slashing damage.",
            "Horns. Melee Weapon Attack: +19 to hit, reach 10 ft., one target. Hit: 32 (4d10 + 10) piercing damage.",
            "Tail. Melee Weapon Attack: +19 to hit, reach 20 ft., one target. Hit: 24 (4d6 + 10) bludgeoning damage. If the target is a creature, it must succeed on a DC 20 Strength saving throw or be knocked prone.",
            "Frightful Presence. Each creature of the tarrasque's choice within 120 feet of it and aware of it must succeed on a DC 17 Wisdom saving throw or become frightened for 1 minute. A creature can repeat the saving throw at the end of each of its turns, with disadvantage if the tarrasque is within line of sight, ending the effect on itself on a success. If a creature's saving throw is successful or the effect ends for it, the creature is immune to the tarrasque's Frightful Presence for the next 24 hours.",
            "Swallow. The tarrasque makes one bite attack against a Large or smaller creature it is grappling. If the attack hits, the target takes the bite's damage, the target is swallowed, and the grapple ends. While swallowed, the creature is blinded and restrained, it has total cover against attacks and other effects outside the tarrasque, and it takes 56 (16d6) acid damage at the start of each of the tarrasque's turns. If the tarrasque takes 60 damage or more on a single turn from a creature inside it, the tarrasque must succeed on a DC 30 Constitution saving throw at the end of that turn or regurgitate all swallowed creatures, which fall prone in a space within 10 feet of the tarrasque. If the tarrasque dies, a swallowed creature is no longer restrained by it and can escape from the corpse by using 30 feet of movement, exiting prone."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = listOf(
            "Attack. The tarrasque makes one claw attack or tail attack.",
            "Move. The tarrasque moves up to half its speed.",
            "Chomp (Costs 2 Actions). The tarrasque makes one bite attack or uses its Swallow."
        ),
        description = "The legendary tarrasque is possibly the most dreaded monster of the Material Plane. It is widely believed that only one of these creatures exists, though no one can predict where and when it will strike. A scaly biped, the tarrasque is fifty feet tall and seventy feet long, weighing hundreds of tons. It carries itself like a bird of prey, leaning forward and using its powerful lashing tail for balance.",
        tags = "damage immunity, condition immunity, blindsight, legendary resistance, magic resistance, multiattack, cc - grappled, cc - restrained, cc - frightened, cc - blinded, cc - restrained, cc - prone, legendary action",
        source = "Monster Manual (SRD)"
    )
)

val winterWolf = registerMonstrosityStatBlock(
    StatBlock(
        name = "Winter Wolf",
        size = "Large",
        type = "monstrosity",
        alignment = "neutral evil",
        armorClass = "13 (natural armor)",
        hitPoints = "75 (10d10 + 20)",
        speed = "50 ft.",
        str = 18, strMod = "+4",
        dex = 13, dexMod = "+1",
        con = 14, conMod = "+2",
        int = 7, intMod = "-2",
        wis = 12, wisMod = "+1",
        cha = 8, chaMod = "-1",
        skills = "Perception +5, Stealth +3",
        savingThrows = null,
        vulnerabilities = null,
        damageResistances = null,
        damageImmunities = "cold",
        conditionResistances = null,
        conditionImmunities = null,
        legendaryResistance = null,
        senses = "passive Perception 15",
        languages = "Common, Giant, Winter Wolf",
        challengeRating = "3",
        expValue = "700 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Hearing and Smell. The wolf has advantage on Wisdom (Perception) checks that rely on hearing or smell.",
            "Pack Tactics. The wolf has advantage on an attack roll against a creature if at least one of the wolf's allies is within 5 feet of the creature and the ally isn't incapacitated.",
            "Snow Camouflage. The wolf has advantage on Dexterity (Stealth) checks made to hide in snowy terrain."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +6 to hit, reach 5 ft., one target. Hit: 11 (2d6 + 4) piercing damage. If the target is a creature, it must succeed on a DC 14 Strength saving throw or be knocked prone.",
            "Cold Breath (Recharge 5-6). The wolf exhales a blast of freezing wind in a 15-foot cone. Each creature in that area must make a DC 12 Dexterity saving throw, taking 18 (4d8) cold damage on a failed save, or half as much damage on a successful one."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = emptyList(),
        description = "Arctic-dwelling winter wolves are evil and intelligent creatures with snow-white fur and pale blue eyes.",
        tags = "damage immunity, keen hearing, keen smell, pack tactics, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

val worg = registerMonstrosityStatBlock(
    StatBlock(
        name = "Worg",
        size = "Large",
        type = "monstrosity",
        alignment = "neutral evil",
        armorClass = "13 (natural armor)",
        hitPoints = "26 (4d10 + 4)",
        speed = "50 ft.",
        str = 16, strMod = "+3",
        dex = 13, dexMod = "+1",
        con = 13, conMod = "+1",
        int = 7, intMod = "-2",
        wis = 11, wisMod = "+0",
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
        languages = "Goblin, Worg",
        challengeRating = "1/2",
        expValue = "100 XP",
        proficiencyBonus = null,
        traits = listOf(
            "Keen Hearing and Smell. The worg has advantage on Wisdom (Perception) checks that rely on hearing or smell."
        ),
        actions = listOf(
            "Bite. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 10 (2d6 + 3) piercing damage. If the target is a creature, it must succeed on a DC 13 Strength saving throw or be knocked prone."
        ),
        bonusActions = listOf(),
        reactions = listOf(),
        legendaryActions = emptyList(),
        description = "A worg is a monstrous wolf-like predator that delights in hunting and devouring creatures weaker than itself.",
        tags = "darkvision, keen hearing, keen smell, cc - prone",
        source = "Monster Manual (SRD)"
    )
)

//Spell effects and Summons
