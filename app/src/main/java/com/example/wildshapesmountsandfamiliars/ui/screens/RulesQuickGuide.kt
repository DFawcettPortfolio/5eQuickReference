package com.example.wildshapesmountsandfamiliars.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.wildshapesmountsandfamiliars.R

@Composable
fun RulesQuickGuide(
    onNavigateHome: () -> Unit,
    onNavigateToDisplayPage: () -> Unit,
    onNavigateToConditions: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToFavorites: () -> Unit,
) {
    var contentText by remember { mutableStateOf("") }
    Column(
        Modifier.padding(16.dp),
        horizontalAlignment = Alignment.Start,
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly // evenly space the buttons
        ) {
            Icon(
                painter = painterResource(id = R.drawable.arrow_back_icon_menu),
                contentDescription = "Back One Step",
                modifier = Modifier
                    .size(32.dp)
                    .clickable {onNavigateHome()},
                tint = Color.White
            )
            Icon(
                painter = painterResource(id = R.drawable.home_icon_menu),
                contentDescription = "Home",
                modifier = Modifier
                    .size(32.dp)
                    .clickable { onNavigateHome() },
                tint = Color.White
            )
            Icon(
                painter = painterResource(id = R.drawable.favorites_icon_menu),
                contentDescription = "Favorites",
                modifier = Modifier
                    .size(32.dp)
                    .clickable { onNavigateToFavorites() },
                tint = Color.White
            )
            Icon(
                painter = painterResource(id = R.drawable.menagerie_icon_menu),
                contentDescription = "Menagerie",
                modifier = Modifier
                    .size(32.dp)
                    .clickable { onNavigateToMenagerie() },
                tint = Color.White
            )
            Icon(
                painter = painterResource(id = R.drawable.inventory_icon_menu),
                contentDescription = "Inventory",
                modifier = Modifier
                    .size(32.dp)
                    .clickable { onNavigateToInventory() },
                tint = Color.White
            )


        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.height(50.dp))

// Always first
            Button(onClick = onNavigateToConditions) {
                Text("Conditions Quick Reference")
            }

            Spacer(Modifier.height(16.dp))

            val ruleEntries = listOf(
                "Bonus Action Spell Rules" to BonusActionSpellRules,
                "Cover Rules" to CoverRules,
                "Grappling Rules" to GrapplingRules,
                "Hiding Rules" to HideRules,
                "Jump Rules" to JumpRules,
                "Mounted Combat Rules" to MountRules,
                "Surprise Rules" to SurpriseRules,
            ).sortedBy { it.first }

            ruleEntries.forEach { (title, content) ->
                Spacer(Modifier.height(8.dp))
                Button(onClick = {
                    DisplayRepo.currentTitle = ""
                    DisplayRepo.currentDisplayItems = listOf(DisplayItem.Rule(title, content))
                    onNavigateToDisplayPage()
                }) {
                    Text(title)
                }
            }

            Spacer(Modifier.height(24.dp))

// Scrollable content display
            Column(
                modifier = Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState())
            ) {
                Text(text = contentText)
            }
        }
    }
}


const val JumpRules ="""
Your Strength determines how far you can jump.

Long Jump.

When you make a long jump, you cover a number of feet up to your Strength score if you move at least 10 feet on foot immediately before the jump. When you make a standing long jump, you can leap only half that distance. Either way, each foot you clear on the jump costs a foot of movement.

This rule assumes that the height of your jump doesn’t matter, such as a jump across a stream or chasm. At your GM’s option, you must succeed on a DC 10 Strength (Athletics) check to clear a low obstacle (no taller than a quarter of the jump’s distance), such as a hedge or low wall. Otherwise, you hit it.

When you land in difficult terrain, you must succeed on a DC 10 Dexterity (Acrobatics) check to land on your feet. Otherwise, you land prone.


High Jump. 

When you make a high jump, you leap into the air a number of feet equal to 3 + your Strength modifier if you move at least 10 feet on foot immediately before the jump. When you make a standing high jump, you can jump only half that distance. Either way, each foot you clear on the jump costs a foot of movement. In some circumstances, your GM might allow you to make a Strength (Athletics) check to jump higher than you normally can.

You can extend your arms half your height above yourself during the jump. Thus, you can reach above you a distance equal to the height of the jump plus 1½ times your height.
"""

const val MountRules ="""
A knight charging into battle on a warhorse, a wizard casting spells from the back of a griffon, or a cleric soaring through the sky on a pegasus all enjoy the benefits of speed and mobility that a mount can provide.

A willing creature that is at least one size larger than you and that has an appropriate anatomy can serve as a mount, using the following rules.

Mounting and Dismounting

Once during your move, you can mount a creature that is within 5 feet of you or dismount. Doing so costs an amount of movement equal to half your speed. For example, if your speed is 30 feet, you must spend 15 feet of movement to mount a horse. Therefore, you can’t mount it if you don’t have 15 feet of movement left or if your speed is 0.

If an effect moves your mount against its will while you’re on it, you must succeed on a DC 10 Dexterity saving throw or fall off the mount, landing prone in a space within 5 feet of it. If you’re knocked prone while mounted, you must make the same saving throw.

If your mount is knocked prone, you can use your reaction to dismount it as it falls and land on your feet. Otherwise, you are dismounted and fall prone in a space within 5 feet it.

Controlling a Mount

While you’re mounted, you have two options. You can either control the mount or allow it to act independently. Intelligent creatures, such as dragons, act independently.

You can control a mount only if it has been trained to accept a rider. Domesticated horses, donkeys, and similar creatures are assumed to have such training. The initiative of a controlled mount changes to match yours when you mount it. It moves as you direct it, and it has only three action options: Dash, Disengage, and Dodge. A controlled mount can move and act even on the turn that you mount it.

An independent mount retains its place in the initiative order. Bearing a rider puts no restrictions on the actions the mount can take, and it moves and acts as it wishes. It might flee from combat, rush to attack and devour a badly injured foe, or otherwise act against your wishes.

In either case, if the mount provokes an opportunity attack while you’re on it, the attacker can target you or the mount.
"""

const val BonusActionSpellRules = """
A spell cast with a bonus action is especially swift. You must use a bonus action on your turn to cast the spell, provided that you haven’t already taken a bonus action this turn. You can’t cast another spell during the same turn, except for a cantrip with a casting time of 1 action.
"""

const val SurpriseRules = """
A band of adventurers sneaks up on a bandit camp, springing from the trees to attack them. A Gelatinous Cube glides down a dungeon passage, unnoticed by the adventurers until the cube engulfs one of them. In these situations, one side of the battle gains surprise over the other.

The GM determines who might be surprised. If neither side tries to be stealthy, they automatically notice each other. Otherwise, the GM compares the Dexterity (Stealth) checks of anyone hiding with the passive Wisdom (Perception) score of each creature on the opposing side. Any character or monster that doesn’t notice a threat is surprised at the start of the encounter.

If you’re surprised, you can’t move or take an action on your first turn of the combat, and you can’t take a reaction until that turn ends. A member of a group can be surprised even if the other members aren’t.
"""

const val GrapplingRules = """
When you want to grab a creature or wrestle with it, you can use the Attack action to make a special melee attack, a grapple. If you’re able to make multiple attacks with the Attack action, this attack replaces one of them.

The target of your grapple must be no more than one size larger than you and must be within your reach. Using at least one free hand, you try to seize the target by making a grapple check instead of an attack roll: a Strength (Athletics) check contested by the target’s Strength (Athletics) or Dexterity (Acrobatics) check (the target chooses the ability to use). If you succeed, you subject the target to the grappled condition (see Conditions ). The condition specifies the things that end it, and you can release the target whenever you like (no action required).

Escaping a Grapple: A grappled creature can use its action to escape. To do so, it must succeed on a Strength (Athletics) or Dexterity (Acrobatics) check contested by your Strength (Athletics) check.

Moving a Grappled Creature: When you move, you can drag or carry the grappled creature with you, but your speed is halved, unless the creature is two or more sizes smaller than you.
"""

const val HideRules = """
The GM decides when circumstances are appropriate for hiding. When you try to hide, make a Dexterity (Stealth) check. Until you are discovered or you stop hiding, that check’s total is contested by the Wisdom (Perception) check of any creature that actively searches for signs of your presence.

You can’t hide from a creature that can see you clearly, and you give away your position if you make noise, such as shouting a warning or knocking over a vase.
An invisible creature can always try to hide. Signs of its passage might still be noticed, and it does have to stay quiet.

In combat, most creatures stay alert for signs of danger all around, so if you come out of hiding and approach a creature, it usually sees you. However, under certain circumstances, the GM might allow you to stay hidden as you approach a creature that is distracted, allowing you to gain advantage on an attack roll before you are seen.

Passive Perception. When you hide, there’s a chance someone will notice you even if they aren’t searching. To determine whether such a creature notices you, the GM compares your Dexterity (Stealth) check with that creature’s passive Wisdom (Perception) score, which equals 10 + the creature’s Wisdom modifier, as well as any other bonuses or penalties. If the creature has advantage, add 5. For disadvantage, subtract 5. For example, if a 1st-­level character (with a proficiency bonus of +2) has a Wisdom of 15 (a +2 modifier) and proficiency in Perception, he or she has a passive Wisdom (Perception) of 14.
"""

const val CoverRules = """
Walls, trees, creatures, and other obstacles can provide cover during combat, making a target more difficult to harm. A target can benefit from cover only when an attack or other effect originates on the opposite side of the cover.
There are three degrees of cover. If a target is behind multiple sources of cover, only the most protective degree of cover applies; the degrees aren’t added together. For example, if a target is behind a creature that gives half cover and a tree trunk that gives three--quarters cover, the target has three--quarters cover.

A target with half cover has a +2 bonus to AC and Dexterity saving throws. A target has half cover if an obstacle blocks at least half of its body. The obstacle might be a low wall, a large piece of furniture, a narrow tree trunk, or a creature, whether that creature is an enemy or a friend.

A target with three--quarters cover has a +5 bonus to AC and Dexterity saving throws. A target has three--quarters cover if about three--quarters of it is covered by an obstacle. The obstacle might be a portcullis, an arrow slit, or a thick tree trunk.

A target with total cover can’t be targeted directly by an attack or a spell, although some spells can reach such a target by including it in an area of effect. A target has total cover if it is completely concealed by an obstacle.
"""

