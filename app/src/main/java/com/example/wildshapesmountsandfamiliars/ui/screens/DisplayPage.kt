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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.wildshapesmountsandfamiliars.R


@Composable
fun DisplayPage(
    title: String,
    items: List<DisplayItem> = emptyList(),
    onNavigateHome: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToFavorites: () -> Unit,

    ) {
    val rule = items.firstOrNull() as? DisplayItem.Rule

    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.Start
    ) {Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly // evenly space the buttons
    ) {
        Icon(
            painter = painterResource(id = R.drawable.arrow_back_icon_menu),
            contentDescription = "Back One Step",
            modifier = Modifier
                .size(32.dp)
                .clickable {onNavigateToRulesQuickGuide()},
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

        when {
            rule != null -> {
                Column(
                    Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                        .padding(8.dp)
                ) {
                    Text(rule.title, style = MaterialTheme.typography.titleLarge)
                    Spacer(Modifier.height(8.dp))
                    Text(rule.description)
                    Spacer(Modifier.height(16.dp))
                    Button(onClick = { onNavigateToRulesQuickGuide() }) {
                        Text("Back to Rules")
                    }
                }
            }


        }
    }
}




sealed class DisplayItem {
    data class Rule(val title: String, val description: String) : DisplayItem()
}

object DisplayRepo {
    var currentDisplayItems: List<DisplayItem> = emptyList()
    var currentTitle: String = "Display"
}
