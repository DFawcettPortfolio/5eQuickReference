package com.example.wildshapesmountsandfamiliars.ui.screens.creatureType


import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import com.example.wildshapesmountsandfamiliars.ui.screens.CreatureTypeScreen
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.loadCreatures


@Composable
fun Dragons(
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
    var dragons by remember { mutableStateOf<List<StatBlock>>(emptyList()) }
    var dragonSpellEffectOrSummon by remember { mutableStateOf<List<StatBlock>>(emptyList()) }

    LaunchedEffect(Unit) {
        val allCreatures = loadCreatures(context) // ← Your JSON loader
        dragons = allCreatures.filter {
            it.sortingTag?.lowercase()?.split(",")?.map { tag -> tag.trim() }?.contains("dragon") == true
        }
        dragonSpellEffectOrSummon = allCreatures.filter {
            it.sortingTag?.lowercase()?.split(",")?.map { tag -> tag.trim() }?.contains("spell effect or summon") == true
                    &&
                    it.type?.lowercase()?.contains("dragon") == true
        }
    }

    CreatureTypeScreen(
        title = "Dragons",
        statBlocks = dragons,
        spellEffectOrSummons = dragonSpellEffectOrSummon, // or filter if needed
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