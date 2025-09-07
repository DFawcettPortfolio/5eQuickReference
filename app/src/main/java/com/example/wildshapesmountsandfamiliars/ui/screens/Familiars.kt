package com.example.wildshapesmountsandfamiliars.ui.screens

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Familiars(
    onNavigateHome: () -> Unit,
    onNavigateToStatblocksByType: () -> Unit,
    onNavigateToCustom: () -> Unit,
    onNavigateToFavorites: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit,
    onNavigateToSearchResults:() -> Unit,
    onNavigateToNotekeeping: () -> Unit,

)
{
    val context = LocalContext.current
    var familiars by remember { mutableStateOf<List<StatBlock>>(emptyList()) }
    var specialFamiliars by remember { mutableStateOf<List<StatBlock>>(emptyList()) }

    LaunchedEffect(Unit) {
        val allCreatures = loadCreatures(context) // ← Your JSON loader
        familiars = allCreatures.filter {
            it.sortingTag?.lowercase()?.split(",")?.map { tag -> tag.trim() }?.contains("familiar") == true
        }
        specialFamiliars = allCreatures.filter {
            it.sortingTag?.lowercase()?.split(",")?.map { tag -> tag.trim() }?.contains("special familiar") == true
        }

    }

    CreatureTypeScreen(
        title = "Familiars",
        statBlocks = familiars,
        spellEffectOrSummons = specialFamiliars, // or filter if needed
        onNavigateHome = onNavigateHome,
        onNavigateToCustom = onNavigateToCustom,
        onNavigateToFavorites = onNavigateToFavorites,
        onNavigateToMenagerie = onNavigateToMenagerie,
        onNavigateToInventory = onNavigateToInventory,
        onNavigateToRulesQuickGuide = onNavigateToRulesQuickGuide,
        onNavigateToStatblocksByType = onNavigateToStatblocksByType,
        onNavigateToSearchResults = onNavigateToSearchResults,
        onNavigateToNotekeeping = onNavigateToNotekeeping,
    )
}

//val familiars: List<StatBlock>
//    get() = listOf(
//        bat,
//        cat,
//        frog,
//        hawk,
//        lizard,
//        octopus,
//        owl,
//        poisonousSnake,
//        quipper,
//        rat,
//        raven,
//        seaHorse,
//        spider,
//        weasel
//    )
//
//
//val specialFamiliars: List<StatBlock>
//    get() = listOf(imp, pseudodragon, quasit, sprite)