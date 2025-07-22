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
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.wildshapesmountsandfamiliars.R


@Composable
fun StatblockMenu(
    onNavigateToFamiliars: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit,
    onNavigateToCustom: () -> Unit,
    onNavigateToStatblocksByType: () -> Unit,
    onNavigateToSpellMenu: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToFavorites: () -> Unit,
    onNavigateHome: () -> Unit
) {
    Column(Modifier.padding(16.dp)) {
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
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 300.dp), // shifts everything up
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = onNavigateToFamiliars) {
            Text("Familiars Quick Select")
        }
        Spacer(Modifier.height(8.dp))
        Button(onClick = onNavigateToCustom) {
            Text("Custom Statblocks Quick Select")
        }
        Spacer(Modifier.height(8.dp))
        Button(onClick = onNavigateToStatblocksByType) {
            Text("By Type")
        }
        Spacer(Modifier.height(8.dp))
        Button(onClick = onNavigateToSpellMenu) {
            Text("By Spell")
        }


    }
}

