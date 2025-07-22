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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.wildshapesmountsandfamiliars.R

@Composable
fun StatblocksByType(
    onNavigateHome: () -> Unit,
    onNavigateToAberrations: () -> Unit,
    onNavigateToBeasts: () -> Unit,
    onNavigateToCelestials: () -> Unit,
    onNavigateToConstructs: () -> Unit,
    onNavigateToCustom:() -> Unit,
    onNavigateToDragons: () -> Unit,
    onNavigateToElementals: () -> Unit,
    onNavigateToFey: () -> Unit,
    onNavigateToFiends: () -> Unit,
    onNavigateToGiants: () -> Unit,
    onNavigateToHalfDragons: () -> Unit,
    onNavigateToHumanoids: () -> Unit,
    onNavigateToMonstrosities: () -> Unit,
    onNavigateToOozes: () -> Unit,
    onNavigateToPlants: () -> Unit,
    onNavigateToUndead: () -> Unit,
    onNavigateToUncategorizedStatblocks: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToFavorites: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit,
    onNavigateToStatblockMenu: () -> Unit,
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
                    .clickable {onNavigateToStatblockMenu()},
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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Select by Type")

            Spacer(Modifier.height(16.dp))
            Button(onClick = onNavigateToAberrations) {
                Text("Aberrations")
            }
            Spacer(Modifier.height(16.dp))
            Button(onClick = onNavigateToBeasts) {
                Text("Beasts")
            }
            Spacer(Modifier.height(16.dp))
            Button(onClick = onNavigateToCelestials) {
                Text("Celestials")
            }
            Spacer(Modifier.height(16.dp))
            Button(onClick = onNavigateToConstructs) {
                Text("Constructs")
            }
            Spacer(Modifier.height(16.dp))
            Button(onClick = onNavigateToDragons) {
                Text("Dragons")
            }
            Spacer(Modifier.height(16.dp))
            Button(onClick = onNavigateToElementals) {
                Text("Elementals")
            }
            Spacer(Modifier.height(16.dp))
            Button(onClick = onNavigateToFey) {
                Text("Fey")
            }
            Spacer(Modifier.height(16.dp))
            Button(onClick = onNavigateToFiends) {
                Text("Fiends")
            }
            Spacer(Modifier.height(16.dp))
            Button(onClick = onNavigateToHalfDragons) {
                Text("Half-Dragons")
            }
            Spacer(Modifier.height(16.dp))
            Button(onClick = onNavigateToGiants) {
                Text("Giants")
            }
            Spacer(Modifier.height(16.dp))
            Button(onClick = onNavigateToHumanoids) {
                Text("Humanoids")
            }
            Spacer(Modifier.height(16.dp))
            Button(onClick = onNavigateToMonstrosities) {
                Text("Monstrosities")
            }
            Spacer(Modifier.height(16.dp))
            Button(onClick = onNavigateToOozes) {
                Text("Oozes")
            }
            Spacer(Modifier.height(16.dp))
            Button(onClick = onNavigateToPlants) {
                Text("Plants")
            }
            Spacer(Modifier.height(16.dp))
            Button(onClick = onNavigateToUndead) {
                Text("Undead")
            }
            Spacer(Modifier.height(16.dp))
            Button(onClick = onNavigateToCustom) {
                Text("Custom")
            }
            Spacer(Modifier.height(16.dp))
            Button(onClick = onNavigateToUncategorizedStatblocks) {
                Text("Other")
            }
        }
    }
}