package com.example.wildshapesmountsandfamiliars.ui.screens

import android.content.Context
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
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.wildshapesmountsandfamiliars.R
import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken
import com.google.gson.Gson

// ---------- Data models ----------

data class RulesFile(
    val standardRules: List<Rule>,
)

data class Rule(
    val title: String,
    val content: String
)



// ---------- Helper to read JSON ----------
fun loadRules(context: Context): List<Rule> {
    val assetManager = context.assets
    assetManager.open("jsonFiles/SRD_rules.json").use { inputStream ->
        val json = inputStream.bufferedReader().use { it.readText() }
        val type = object : TypeToken<List<Rule>>() {}.type
        return Gson().fromJson(json, type)
    }
}




// ---------- Composable ----------
@Composable
fun RulesQuickGuide(
    onNavigateHome: () -> Unit,
    onNavigateToDisplayPage: () -> Unit,
    onNavigateToConditions: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToFavorites: () -> Unit,
    onNavigateToSearchResults: () -> Unit,
    onNavigateToNotekeeping: () -> Unit,
) {
    var contentText by remember { mutableStateOf("") }
    val context = LocalContext.current

    val rulesFile = remember { loadRules(context) }


    Column(
        Modifier.padding(16.dp),
        horizontalAlignment = Alignment.Start,
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
//            Icon(
//                painter = painterResource(id = R.drawable.arrow_back_icon_menu),
//                contentDescription = "Back One Step",
//                modifier = Modifier
//                    .size(32.dp)
//                    .clickable { onNavigateHome() },
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

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            //Spacer(Modifier.height(50.dp))

            Button(
                onClick = onNavigateToConditions,
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f)
                )
            ) {
                OutlinedText(
                    text = "Conditions Quick Reference",
                    color = Color.White,
                    outlineColor = Color.Black,
                    outlineWidth = 0.8.dp,
                    style = MaterialTheme.typography.labelLarge
                )
            }

            Spacer(Modifier.height(16.dp))

            loadRules(context)
                .sortedBy { it.title }
                .forEach { rule ->
                    Spacer(Modifier.height(8.dp))
                    Button(
                        onClick = {
                            DisplayRepo.currentTitle = ""
                            DisplayRepo.currentDisplayItems =
                                listOf(DisplayItem.Rule(rule.title, rule.content))
                            onNavigateToDisplayPage()
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f)
                        )
                    ) {
                        OutlinedText(
                            text = rule.title,
                            color = Color.White,
                            outlineColor = Color.Black,
                            outlineWidth = 0.8.dp,
                            style = MaterialTheme.typography.labelLarge
                        )
                    }
                }



            Spacer(Modifier.height(24.dp))

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