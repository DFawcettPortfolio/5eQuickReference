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
fun StatblocksByType(
    onNavigateHome: () -> Unit,
    onNavigateToAberrations: () -> Unit,
    onNavigateToBeasts: () -> Unit,
    onNavigateToCelestials: () -> Unit,
    onNavigateToConstructs: () -> Unit,
    onNavigateToCustom: () -> Unit,
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
    onNavigateToFamiliars: () -> Unit,
    onNavigateToSearchResults: () ->Unit,
    onNavigateToNotekeeping: () -> Unit,
) {
    val items = listOf(
        "Custom Statblocks" to onNavigateToCustom,
        "Familiars Quick Select" to onNavigateToFamiliars,
        "Aberrations" to onNavigateToAberrations,
        "Beasts" to onNavigateToBeasts,
        "Celestials" to onNavigateToCelestials,
        "Constructs" to onNavigateToConstructs,
        "Dragons" to onNavigateToDragons,
        "Elementals" to onNavigateToElementals,
        "Fey" to onNavigateToFey,
        "Fiends" to onNavigateToFiends,
        "Half-Dragons" to onNavigateToHalfDragons,
        "Giants" to onNavigateToGiants,
        "Humanoids" to onNavigateToHumanoids,
        "Monstrosities" to onNavigateToMonstrosities,
        "Oozes" to onNavigateToOozes,
        "Plants" to onNavigateToPlants,
        "Undead" to onNavigateToUndead,
        "Other" to onNavigateToUncategorizedStatblocks,
    )

    Column(Modifier.padding(16.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly // evenly space the icons
        ) {
//            Icon(
//                painter = painterResource(id = R.drawable.arrow_back_icon_menu),
//                contentDescription = "Back One Step",
//                modifier = Modifier
//                    .size(32.dp)
//                    .clickable { onNavigateToStatblockMenu() },
//                tint = Color.White
//            )
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
                painter = painterResource(id = R.drawable.search_icon),
                contentDescription = "Search",
                modifier = Modifier
                    .size(32.dp)
                    .clickable { onNavigateToSearchResults() },
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
            Icon(
                painter = painterResource(id = R.drawable.notes_icon_menu),
                contentDescription = "Notes",
                modifier = Modifier
                    .size(32.dp)
                    .clickable {
                        onNavigateToNotekeeping()
                    },
                tint = Color.White
            )
        }

        Spacer(Modifier.height(16.dp))

        Text(
            "Select by Type",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(items) { (label, onClick) ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable(onClick = onClick)
                        .padding(vertical = 12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(label)

                }
            }
        }
    }
}
