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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
fun Conditions(
    onNavigateHome: () -> Unit,
    onNavigateToFavorites: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit,
    onNavigateToConditions: () -> Unit,
) {
    var selectedCondition by remember { mutableStateOf<ConditionString?>(null) }

    val conditions = listOf(
        Blinded, Charmed, Deafened, Frightened, Grappled, Incapacitated, Invisible,
        Paralyzed, Petrified, Poisoned, Prone, Restrained, Stunned, Unconscious, Exhaustion
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 8.dp) // Add padding
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
                    .clickable {
                        if (selectedCondition == null){
                            onNavigateToRulesQuickGuide()
                        }
                        else {onNavigateToConditions()}
                    },
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
                painter = painterResource(id = R.drawable.rules_icon_menu),
                contentDescription = "Rules",
                modifier = Modifier
                    .size(32.dp)
                    .clickable { onNavigateToRulesQuickGuide() },
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
        Spacer(Modifier.height(16.dp))
        Text("Conditions", style = MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(16.dp))

        if (selectedCondition == null) {
            LazyColumn(modifier = Modifier.weight(1f)) {
                items(conditions) { condition ->
                    Text(
                        text = condition.conditionName,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { selectedCondition = condition }
                            .padding(vertical = 12.dp)
                    )
                }
            }
        } else {
            Column(
                Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState())
            ) {
                Text(text = selectedCondition!!.conditionName, style = MaterialTheme.typography.titleLarge)
                Spacer(Modifier.height(8.dp))
                Text(text = selectedCondition!!.description, style = MaterialTheme.typography.bodyLarge)
                Spacer(Modifier.height(16.dp))
                Button(onClick = { selectedCondition = null }) {
                    Text("Back to Conditions List")
                }
            }
        }

        Spacer(Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = onNavigateToRulesQuickGuide) {
                Text("Back to Quick Guide")
            }
        }
    }
}



data class ConditionString(
    val conditionName: String,
    val description: String
)

val Blinded = ConditionString(
    conditionName = "Blinded",
    description = "A blinded creature can't see and automatically fails any ability check that requires sight.\n\n" +
            "Attack rolls against the creature have advantage, and the creature's attack rolls have disadvantage."
)

val Charmed = ConditionString(
    conditionName = "Charmed",
    description = "A charmed creature can't attack the charmer or target the charmer with harmful abilities or magical effects.\n\n" +
            "The charmer has advantage on any ability check to interact socially with the creature."
)

val Deafened = ConditionString(
    conditionName = "Deafened",
    description = "A deafened creature can't hear and automatically fails any ability check that requires hearing."
)

val Frightened = ConditionString(
    conditionName = "Frightened",
    description = "A frightened creature has disadvantage on ability checks and attack rolls while the source of its fear is within line of sight.\n\n" +
            "The creature can't willingly move closer to the source of its fear."
)

val Grappled = ConditionString(
    conditionName = "Grappled",
    description = "A grappled creature's speed becomes 0, and it can't benefit from any bonus to its speed.\n\n" +
            "The condition ends if the grappler is incapacitated (can't take actions or reactions).\n\n" +
            "The condition also ends if an effect removes the grappled creature from the reach of the grappler or grappling effect, such as when a creature is hurled away by the thunderwave spell."
)

val Incapacitated = ConditionString(
    conditionName = "Incapacitated",
    description = "An incapacitated creature can't take actions or reactions."
)

val Invisible = ConditionString(
    conditionName = "Invisible",
    description = "An invisible creature is impossible to see without the aid of magic or a special sense. For the purpose of hiding, the creature is heavily obscured. The creature's location can be detected by any noise it makes or any tracks it leaves.\n\n" +
            "Attack rolls against the creature have disadvantage, and the creature's attack rolls have advantage."
)

val Paralyzed = ConditionString(
    conditionName = "Paralyzed",
    description = "A paralyzed creature is incapacitated (can't take actions or reactions) and can't move or speak.\n\n" +
            "The creature automatically fails Strength and Dexterity saving throws.\n\n" +
            "Attack rolls against the creature have advantage.\n\n" +
            "Any attack that hits the creature is a critical hit if the attacker is within 5 feet of the creature."
)

val Petrified = ConditionString(
    conditionName = "Petrified",
    description = "A petrified creature is transformed, along with any nonmagical object it is wearing or carrying, into a solid inanimate substance (usually stone). Its weight increases by a factor of ten, and it ceases aging.\n\n" +
            "The creature is incapacitated (can't take actions or reactions), can't move or speak, and is unaware of its surroundings.\n\n" +
            "Attack rolls against the creature have advantage.\n\n" +
            "The creature automatically fails Strength and Dexterity saving throws.\n\n" +
            "The creature has resistance to all damage.\n\n" +
            "The creature is immune to poison and disease, although a poison or disease already in its system is suspended, not neutralized."
)

val Poisoned = ConditionString(
    conditionName = "Poisoned",
    description = "A poisoned creature has disadvantage on attack rolls and ability checks."
)

val Prone = ConditionString(
    conditionName = "Prone",
    description = "A prone creature's only movement option is to crawl, unless it stands up and thereby ends the condition.\n\n" +
            "The creature has disadvantage on attack rolls.\n\n" +
            "An attack roll against the creature has advantage if the attacker is within 5 feet of the creature. Otherwise, the attack roll has disadvantage."
)

val Restrained = ConditionString(
    conditionName = "Restrained",
    description = "A restrained creature's speed becomes 0, and it can't benefit from any bonus to its speed.\n\n" +
            "Attack rolls against the creature have advantage, and the creature's attack rolls have disadvantage.\n\n" +
            "The creature has disadvantage on Dexterity saving throws."
)

val Stunned = ConditionString(
    conditionName = "Stunned",
    description = "A stunned creature is incapacitated (can't take actions or reactions), can't move, and can speak only falteringly.\n\n" +
            "The creature automatically fails Strength and Dexterity saving throws.\n\n" +
            "Attack rolls against the creature have advantage."
)

val Unconscious = ConditionString(
    conditionName = "Unconscious",
    description = "An unconscious creature is incapacitated (can't take actions or reactions), can't move or speak, and is unaware of its surroundings\n\n" +
            "The creature drops whatever it's holding and falls prone.\n\n" +
            "The creature automatically fails Strength and Dexterity saving throws.\n\n" +
            "Attack rolls against the creature have advantage.\n\n" +
            "Any attack that hits the creature is a critical hit if the attacker is within 5 feet of the creature."
)

val Exhaustion = ConditionString(
    conditionName = "Exhaustion",
    description = """
Some special abilities and environmental hazards, such as starvation and the long-term effects of freezing or scorching temperatures, can lead to a special condition called exhaustion. Exhaustion is measured in six levels. An effect can give a creature one or more levels of exhaustion, as specified in the effect’s description.

Exhaustion Effects
(Level) = Effect

(1) = Disadvantage on ability checks  

(2) = Speed halved  

(3) = Disadvantage on attack rolls and saving throws  

(4) = Hit point maximum halved  

(5) = Speed reduced to 0  

(6) = Death


If an already exhausted creature suffers another effect that causes exhaustion, its current level of exhaustion increases by the amount specified in the effect’s description.

A creature suffers the effect of its current level of exhaustion as well as all lower levels. For example, a creature suffering level 2 exhaustion has its speed halved and has disadvantage on ability checks.

An effect that removes exhaustion reduces its level as specified in the effect’s description, with all exhaustion effects ending if a creature’s exhaustion level is reduced below 1.

Finishing a long rest reduces a creature’s exhaustion level by 1, provided that the creature has also ingested some food and drink.
""".trimIndent()
)
