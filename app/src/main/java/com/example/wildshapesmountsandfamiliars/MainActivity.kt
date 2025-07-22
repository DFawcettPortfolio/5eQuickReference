package com.example.wildshapesmountsandfamiliars

import Familiars
import SpecialFamiliars
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wildshapesmountsandfamiliars.ui.screens.Conditions
import com.example.wildshapesmountsandfamiliars.ui.screens.DisplayPage
import com.example.wildshapesmountsandfamiliars.ui.screens.DisplayRepo
import com.example.wildshapesmountsandfamiliars.ui.screens.FavoriteManager
import com.example.wildshapesmountsandfamiliars.ui.screens.Favorites
import com.example.wildshapesmountsandfamiliars.ui.screens.Inventory
import com.example.wildshapesmountsandfamiliars.ui.screens.Menagerie
import com.example.wildshapesmountsandfamiliars.ui.screens.MenagerieManager
import com.example.wildshapesmountsandfamiliars.ui.screens.RulesQuickGuide
import com.example.wildshapesmountsandfamiliars.ui.screens.SpellMenu
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.StatblockMenu
import com.example.wildshapesmountsandfamiliars.ui.screens.StatblocksByType
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.Aberrations
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.Beasts
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.Celestials
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.Constructs
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.Custom
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.CustomStatBlockRepo
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.Dragons
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.Elementals
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.Fey
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.Fiends
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.Giants
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.HalfDragons
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.Humanoids
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.Monstrosities
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.Oozes
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.Plants
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.UncategorizedStatblocks
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.Undead
import com.example.wildshapesmountsandfamiliars.ui.screens.spells
import com.example.wildshapesmountsandfamiliars.ui.theme.WildShapesMountsAndFamiliarsTheme
import familiars
import specialFamiliars


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            WildShapesMountsAndFamiliarsTheme {Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                val navController = rememberNavController()
                val context = LocalContext.current
                var selectedStatBlock by remember { mutableStateOf<StatBlock?>(null) }

                // ✅ Load favorites and menagerie globally when the app starts to determine icon status (filled or empty)
                // individual LaunchedEffect required for each
                LaunchedEffect(Unit) {
                    FavoriteManager.load(context)
                }
                LaunchedEffect(Unit) {
                    MenagerieManager.load(context)
                }
                LaunchedEffect(Unit) {
                    CustomStatBlockRepo.load(context)
                }


                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "home",
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable("home") {
                            HomeScreen(
                                onNavigateToStatblockMenu = { navController.navigate("statblockMenu") },
                                onNavigateToFavorites = { navController.navigate("favorites") },
                                onNavigateToMenagerie = { navController.navigate("menagerie") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToInventory = {navController.navigate("inventory")}
                            )
                        }

                        composable("conditions") {
                            Conditions(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToFavorites = { navController.navigate("favorites") },
                                onNavigateToMenagerie = { navController.navigate("menagerie") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToInventory = {navController.navigate("inventory")},
                                onNavigateToConditions = {navController.navigate("conditions")}
                            )
                        }

                        composable("displayPage") {
                            DisplayPage(
                                title = DisplayRepo.currentTitle,
                                items = DisplayRepo.currentDisplayItems,
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToFavorites = { navController.navigate("favorites") },
                                onNavigateToMenagerie = { navController.navigate("menagerie") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToInventory = {navController.navigate("inventory")}
                            )
                        }

                        composable("favorites") {
                            Favorites(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToInventory = { navController.navigate("inventory") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToMenagerie = { navController.navigate("menagerie") },
                                onNavigateToFavorites = { navController.navigate("favorites") },
                                onSelectStatBlock = { block ->
                                    selectedStatBlock = block
                                    navController.navigate("statBlockDetail")
                                }
                            )
                        }

                        composable ("inventory") {
                            Inventory(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                            )
                        }

                        composable("menagerie") {
                            Menagerie(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToInventory = { navController.navigate("inventory") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToFavorites = { navController.navigate("favorites") },
                                onNavigateToMenagerie = {navController.navigate("menagerie")},
                                onSelectStatBlock = { block ->
                                    selectedStatBlock = block
                                    navController.navigate("statBlockDetail")
                                }
                            )
                        }

                        composable("reference") {
                            RulesQuickGuide(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToDisplayPage = { navController.navigate("displayPage") },
                                onNavigateToConditions = { navController.navigate("conditions") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                                onNavigateToInventory =  { navController.navigate("inventory") }

                            )
                        }

                        composable("spellMenu") {
                            SpellMenu(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                                onNavigateToInventory =  { navController.navigate("inventory") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToSpellMenu = {navController.navigate("spellMenu")},
                                spells = spells
                            )
                        }

                        composable("statblockMenu") {
                            StatblockMenu(
                                onNavigateToFamiliars = { navController.navigate("familiars") },
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToInventory = { navController.navigate("inventory") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToMenagerie = { navController.navigate("menagerie") },
                                onNavigateToFavorites = { navController.navigate("favorites")},
                                onNavigateToSpellMenu = { navController.navigate("spellMenu") },
                                onNavigateToStatblocksByType = {navController.navigate("statblocksByType")},
                                onNavigateToCustom = {navController.navigate("custom")}
                            )
                        }


//Statblocks by Type
                        composable("statblocksByType") {
                            StatblocksByType(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToAberrations = { navController.navigate("aberrations") },
                                onNavigateToBeasts = { navController.navigate("beasts") },
                                onNavigateToCelestials = { navController.navigate("celestials") },
                                onNavigateToConstructs = { navController.navigate("constructs") },
                                onNavigateToCustom = { navController.navigate("custom") },
                                onNavigateToDragons = { navController.navigate("dragons") },
                                onNavigateToElementals = { navController.navigate("elementals") },
                                onNavigateToFey = { navController.navigate("fey") },
                                onNavigateToFiends = { navController.navigate("fiends") },
                                onNavigateToGiants = { navController.navigate("giants") },
                                onNavigateToHumanoids = { navController.navigate("humanoids") },
                                onNavigateToHalfDragons = { navController.navigate("halfDragons") },
                                onNavigateToMonstrosities = { navController.navigate("monstrosities") },
                                onNavigateToOozes = { navController.navigate("oozes") },
                                onNavigateToPlants = { navController.navigate("plants") },
                                onNavigateToUndead = { navController.navigate("undead") },
                                onNavigateToUncategorizedStatblocks = { navController.navigate("uncategorizedStatblocks") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                                onNavigateToInventory =  { navController.navigate("inventory") },
                                onNavigateToStatblockMenu = { navController.navigate("statblockMenu") },

                                )
                        }

                        composable("aberrations") {
                            Aberrations(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToStatblocksByType = { navController.navigate("statblocksByType") },
                                onNavigateToCustom = { navController.navigate("custom") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                                onNavigateToInventory =  { navController.navigate("inventory") },
                                onNavigateToAberrations = { navController.navigate("aberrations") },
                                onNavigateToBeasts = { navController.navigate("beasts") },
                                onNavigateToCelestials = { navController.navigate("celestials") },
                                onNavigateToConstructs = { navController.navigate("constructs") },
                                onNavigateToDragons = { navController.navigate("dragons") },
                                onNavigateToElementals = { navController.navigate("elementals") },
                                onNavigateToFey = { navController.navigate("fey") },
                                onNavigateToFiends = { navController.navigate("fiends") },
                                onNavigateToGiants = { navController.navigate("giants") },
                                onNavigateToHumanoids = { navController.navigate("humanoids") },
                                onNavigateToHalfDragons = { navController.navigate("halfDragons") },
                                onNavigateToMonstrosities = { navController.navigate("monstrosities") },
                                onNavigateToOozes = { navController.navigate("oozes") },
                                onNavigateToPlants = { navController.navigate("plants") },
                                onNavigateToUndead = { navController.navigate("undead") },
                                onNavigateToUncategorizedStatblocks = { navController.navigate("uncategorizedStatblocks") },
                            )
                        }
                        composable("beasts") {
                            Beasts(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToStatblocksByType = { navController.navigate("statblocksByType") },
                                onNavigateToCustom = { navController.navigate("custom") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                                onNavigateToInventory =  { navController.navigate("inventory") },
                                onNavigateToAberrations = { navController.navigate("aberrations") },
                                onNavigateToBeasts = { navController.navigate("beasts") },
                                onNavigateToCelestials = { navController.navigate("celestials") },
                                onNavigateToConstructs = { navController.navigate("constructs") },
                                onNavigateToDragons = { navController.navigate("dragons") },
                                onNavigateToElementals = { navController.navigate("elementals") },
                                onNavigateToFey = { navController.navigate("fey") },
                                onNavigateToFiends = { navController.navigate("fiends") },
                                onNavigateToGiants = { navController.navigate("giants") },
                                onNavigateToHumanoids = { navController.navigate("humanoids") },
                                onNavigateToHalfDragons = { navController.navigate("halfDragons") },
                                onNavigateToMonstrosities = { navController.navigate("monstrosities") },
                                onNavigateToOozes = { navController.navigate("oozes") },
                                onNavigateToPlants = { navController.navigate("plants") },
                                onNavigateToUndead = { navController.navigate("undead") },
                                onNavigateToUncategorizedStatblocks = { navController.navigate("uncategorizedStatblocks") },
                            )
                        }
                        composable("celestials") {
                            Celestials(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToStatblocksByType = { navController.navigate("statblocksByType") },
                                onNavigateToCustom = { navController.navigate("custom") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                                onNavigateToInventory =  { navController.navigate("inventory") },
                                onNavigateToAberrations = { navController.navigate("aberrations") },
                                onNavigateToBeasts = { navController.navigate("beasts") },
                                onNavigateToCelestials = { navController.navigate("celestials") },
                                onNavigateToConstructs = { navController.navigate("constructs") },
                                onNavigateToDragons = { navController.navigate("dragons") },
                                onNavigateToElementals = { navController.navigate("elementals") },
                                onNavigateToFey = { navController.navigate("fey") },
                                onNavigateToFiends = { navController.navigate("fiends") },
                                onNavigateToGiants = { navController.navigate("giants") },
                                onNavigateToHumanoids = { navController.navigate("humanoids") },
                                onNavigateToHalfDragons = { navController.navigate("halfDragons") },
                                onNavigateToMonstrosities = { navController.navigate("monstrosities") },
                                onNavigateToOozes = { navController.navigate("oozes") },
                                onNavigateToPlants = { navController.navigate("plants") },
                                onNavigateToUndead = { navController.navigate("undead") },
                                onNavigateToUncategorizedStatblocks = { navController.navigate("uncategorizedStatblocks") },
                            )
                        }
                        composable("constructs") {
                            Constructs(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToStatblocksByType = { navController.navigate("statblocksByType") },
                                onNavigateToCustom = { navController.navigate("custom") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                                onNavigateToInventory =  { navController.navigate("inventory") },
                                onNavigateToAberrations = { navController.navigate("aberrations") },
                                onNavigateToBeasts = { navController.navigate("beasts") },
                                onNavigateToCelestials = { navController.navigate("celestials") },
                                onNavigateToConstructs = { navController.navigate("constructs") },
                                onNavigateToDragons = { navController.navigate("dragons") },
                                onNavigateToElementals = { navController.navigate("elementals") },
                                onNavigateToFey = { navController.navigate("fey") },
                                onNavigateToFiends = { navController.navigate("fiends") },
                                onNavigateToGiants = { navController.navigate("giants") },
                                onNavigateToHumanoids = { navController.navigate("humanoids") },
                                onNavigateToHalfDragons = { navController.navigate("halfDragons") },
                                onNavigateToMonstrosities = { navController.navigate("monstrosities") },
                                onNavigateToOozes = { navController.navigate("oozes") },
                                onNavigateToPlants = { navController.navigate("plants") },
                                onNavigateToUndead = { navController.navigate("undead") },
                                onNavigateToUncategorizedStatblocks = { navController.navigate("uncategorizedStatblocks") },
                            )
                        }
                        composable("custom") {
                            Custom(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToStatblocksByType = { navController.navigate("statblocksByType") },
                                onNavigateToCustom = { navController.navigate("custom") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                                onNavigateToInventory =  { navController.navigate("inventory") },
                                onNavigateToAberrations = { navController.navigate("aberrations") },
                                onNavigateToBeasts = { navController.navigate("beasts") },
                                onNavigateToCelestials = { navController.navigate("celestials") },
                                onNavigateToConstructs = { navController.navigate("constructs") },
                                onNavigateToDragons = { navController.navigate("dragons") },
                                onNavigateToElementals = { navController.navigate("elementals") },
                                onNavigateToFey = { navController.navigate("fey") },
                                onNavigateToFiends = { navController.navigate("fiends") },
                                onNavigateToGiants = { navController.navigate("giants") },
                                onNavigateToHumanoids = { navController.navigate("humanoids") },
                                onNavigateToHalfDragons = { navController.navigate("halfDragons") },
                                onNavigateToMonstrosities = { navController.navigate("monstrosities") },
                                onNavigateToOozes = { navController.navigate("oozes") },
                                onNavigateToPlants = { navController.navigate("plants") },
                                onNavigateToUndead = { navController.navigate("undead") },
                                onNavigateToUncategorizedStatblocks = { navController.navigate("uncategorizedStatblocks") },
                            )
                        }
                        composable("dragons") {
                            Dragons(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToStatblocksByType = { navController.navigate("statblocksByType") },
                                onNavigateToCustom = { navController.navigate("custom") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                                onNavigateToInventory =  { navController.navigate("inventory") },
                                onNavigateToAberrations = { navController.navigate("aberrations") },
                                onNavigateToBeasts = { navController.navigate("beasts") },
                                onNavigateToCelestials = { navController.navigate("celestials") },
                                onNavigateToConstructs = { navController.navigate("constructs") },
                                onNavigateToDragons = { navController.navigate("dragons") },
                                onNavigateToElementals = { navController.navigate("elementals") },
                                onNavigateToFey = { navController.navigate("fey") },
                                onNavigateToFiends = { navController.navigate("fiends") },
                                onNavigateToGiants = { navController.navigate("giants") },
                                onNavigateToHumanoids = { navController.navigate("humanoids") },
                                onNavigateToHalfDragons = { navController.navigate("halfDragons") },
                                onNavigateToMonstrosities = { navController.navigate("monstrosities") },
                                onNavigateToOozes = { navController.navigate("oozes") },
                                onNavigateToPlants = { navController.navigate("plants") },
                                onNavigateToUndead = { navController.navigate("undead") },
                                onNavigateToUncategorizedStatblocks = { navController.navigate("uncategorizedStatblocks") },
                            )
                        }
                        composable("elementals") {
                            Elementals(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToStatblocksByType = { navController.navigate("statblocksByType") },
                                onNavigateToCustom = { navController.navigate("custom") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                                onNavigateToInventory =  { navController.navigate("inventory") },
                                onNavigateToAberrations = { navController.navigate("aberrations") },
                                onNavigateToBeasts = { navController.navigate("beasts") },
                                onNavigateToCelestials = { navController.navigate("celestials") },
                                onNavigateToConstructs = { navController.navigate("constructs") },
                                onNavigateToDragons = { navController.navigate("dragons") },
                                onNavigateToElementals = { navController.navigate("elementals") },
                                onNavigateToFey = { navController.navigate("fey") },
                                onNavigateToFiends = { navController.navigate("fiends") },
                                onNavigateToGiants = { navController.navigate("giants") },
                                onNavigateToHumanoids = { navController.navigate("humanoids") },
                                onNavigateToHalfDragons = { navController.navigate("halfDragons") },
                                onNavigateToMonstrosities = { navController.navigate("monstrosities") },
                                onNavigateToOozes = { navController.navigate("oozes") },
                                onNavigateToPlants = { navController.navigate("plants") },
                                onNavigateToUndead = { navController.navigate("undead") },
                                onNavigateToUncategorizedStatblocks = { navController.navigate("uncategorizedStatblocks") },
                            )
                        }
                        composable("fey") {
                            Fey(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToStatblocksByType = { navController.navigate("statblocksByType") },
                                onNavigateToCustom = { navController.navigate("custom") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                                onNavigateToInventory =  { navController.navigate("inventory") },
                                onNavigateToAberrations = { navController.navigate("aberrations") },
                                onNavigateToBeasts = { navController.navigate("beasts") },
                                onNavigateToCelestials = { navController.navigate("celestials") },
                                onNavigateToConstructs = { navController.navigate("constructs") },
                                onNavigateToDragons = { navController.navigate("dragons") },
                                onNavigateToElementals = { navController.navigate("elementals") },
                                onNavigateToFey = { navController.navigate("fey") },
                                onNavigateToFiends = { navController.navigate("fiends") },
                                onNavigateToGiants = { navController.navigate("giants") },
                                onNavigateToHumanoids = { navController.navigate("humanoids") },
                                onNavigateToHalfDragons = { navController.navigate("halfDragons") },
                                onNavigateToMonstrosities = { navController.navigate("monstrosities") },
                                onNavigateToOozes = { navController.navigate("oozes") },
                                onNavigateToPlants = { navController.navigate("plants") },
                                onNavigateToUndead = { navController.navigate("undead") },
                                onNavigateToUncategorizedStatblocks = { navController.navigate("uncategorizedStatblocks") },
                            )
                        }

                        composable("fiends") {
                            Fiends(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToStatblocksByType = { navController.navigate("statblocksByType") },
                                onNavigateToCustom = { navController.navigate("custom") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                                onNavigateToInventory =  { navController.navigate("inventory") },
                                onNavigateToAberrations = { navController.navigate("aberrations") },
                                onNavigateToBeasts = { navController.navigate("beasts") },
                                onNavigateToCelestials = { navController.navigate("celestials") },
                                onNavigateToConstructs = { navController.navigate("constructs") },
                                onNavigateToDragons = { navController.navigate("dragons") },
                                onNavigateToElementals = { navController.navigate("elementals") },
                                onNavigateToFey = { navController.navigate("fey") },
                                onNavigateToFiends = { navController.navigate("fiends") },
                                onNavigateToGiants = { navController.navigate("giants") },
                                onNavigateToHumanoids = { navController.navigate("humanoids") },
                                onNavigateToHalfDragons = { navController.navigate("halfDragons") },
                                onNavigateToMonstrosities = { navController.navigate("monstrosities") },
                                onNavigateToOozes = { navController.navigate("oozes") },
                                onNavigateToPlants = { navController.navigate("plants") },
                                onNavigateToUndead = { navController.navigate("undead") },
                                onNavigateToUncategorizedStatblocks = { navController.navigate("uncategorizedStatblocks") },
                            )
                        }
                        composable("giants") {
                            Giants(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToStatblocksByType = { navController.navigate("statblocksByType") },
                                onNavigateToCustom = { navController.navigate("custom") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                                onNavigateToInventory =  { navController.navigate("inventory") },
                                onNavigateToAberrations = { navController.navigate("aberrations") },
                                onNavigateToBeasts = { navController.navigate("beasts") },
                                onNavigateToCelestials = { navController.navigate("celestials") },
                                onNavigateToConstructs = { navController.navigate("constructs") },
                                onNavigateToDragons = { navController.navigate("dragons") },
                                onNavigateToElementals = { navController.navigate("elementals") },
                                onNavigateToFey = { navController.navigate("fey") },
                                onNavigateToFiends = { navController.navigate("fiends") },
                                onNavigateToGiants = { navController.navigate("giants") },
                                onNavigateToHumanoids = { navController.navigate("humanoids") },
                                onNavigateToHalfDragons = { navController.navigate("halfDragons") },
                                onNavigateToMonstrosities = { navController.navigate("monstrosities") },
                                onNavigateToOozes = { navController.navigate("oozes") },
                                onNavigateToPlants = { navController.navigate("plants") },
                                onNavigateToUndead = { navController.navigate("undead") },
                                onNavigateToUncategorizedStatblocks = { navController.navigate("uncategorizedStatblocks") },
                            )
                        }
                        composable("halfDragons") {
                            HalfDragons(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToStatblocksByType = { navController.navigate("statblocksByType") },
                                onNavigateToCustom = { navController.navigate("custom") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                                onNavigateToInventory =  { navController.navigate("inventory") },
                                onNavigateToAberrations = { navController.navigate("aberrations") },
                                onNavigateToBeasts = { navController.navigate("beasts") },
                                onNavigateToCelestials = { navController.navigate("celestials") },
                                onNavigateToConstructs = { navController.navigate("constructs") },
                                onNavigateToDragons = { navController.navigate("dragons") },
                                onNavigateToElementals = { navController.navigate("elementals") },
                                onNavigateToFey = { navController.navigate("fey") },
                                onNavigateToFiends = { navController.navigate("fiends") },
                                onNavigateToGiants = { navController.navigate("giants") },
                                onNavigateToHumanoids = { navController.navigate("humanoids") },
                                onNavigateToHalfDragons = { navController.navigate("halfDragons") },
                                onNavigateToMonstrosities = { navController.navigate("monstrosities") },
                                onNavigateToOozes = { navController.navigate("oozes") },
                                onNavigateToPlants = { navController.navigate("plants") },
                                onNavigateToUndead = { navController.navigate("undead") },
                                onNavigateToUncategorizedStatblocks = { navController.navigate("uncategorizedStatblocks") },
                            )
                        }
                        composable("humanoids") {
                            Humanoids(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToStatblocksByType = { navController.navigate("statblocksByType") },
                                onNavigateToCustom = { navController.navigate("custom") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                                onNavigateToInventory =  { navController.navigate("inventory") },
                                onNavigateToAberrations = { navController.navigate("aberrations") },
                                onNavigateToBeasts = { navController.navigate("beasts") },
                                onNavigateToCelestials = { navController.navigate("celestials") },
                                onNavigateToConstructs = { navController.navigate("constructs") },
                                onNavigateToDragons = { navController.navigate("dragons") },
                                onNavigateToElementals = { navController.navigate("elementals") },
                                onNavigateToFey = { navController.navigate("fey") },
                                onNavigateToFiends = { navController.navigate("fiends") },
                                onNavigateToGiants = { navController.navigate("giants") },
                                onNavigateToHumanoids = { navController.navigate("humanoids") },
                                onNavigateToHalfDragons = { navController.navigate("halfDragons") },
                                onNavigateToMonstrosities = { navController.navigate("monstrosities") },
                                onNavigateToOozes = { navController.navigate("oozes") },
                                onNavigateToPlants = { navController.navigate("plants") },
                                onNavigateToUndead = { navController.navigate("undead") },
                                onNavigateToUncategorizedStatblocks = { navController.navigate("uncategorizedStatblocks") },
                            )
                        }
                        composable("monstrosities") {
                            Monstrosities(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToStatblocksByType = { navController.navigate("statblocksByType") },
                                onNavigateToCustom = { navController.navigate("custom") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                                onNavigateToInventory =  { navController.navigate("inventory") },
                                onNavigateToAberrations = { navController.navigate("aberrations") },
                                onNavigateToBeasts = { navController.navigate("beasts") },
                                onNavigateToCelestials = { navController.navigate("celestials") },
                                onNavigateToConstructs = { navController.navigate("constructs") },
                                onNavigateToDragons = { navController.navigate("dragons") },
                                onNavigateToElementals = { navController.navigate("elementals") },
                                onNavigateToFey = { navController.navigate("fey") },
                                onNavigateToFiends = { navController.navigate("fiends") },
                                onNavigateToGiants = { navController.navigate("giants") },
                                onNavigateToHumanoids = { navController.navigate("humanoids") },
                                onNavigateToHalfDragons = { navController.navigate("halfDragons") },
                                onNavigateToMonstrosities = { navController.navigate("monstrosities") },
                                onNavigateToOozes = { navController.navigate("oozes") },
                                onNavigateToPlants = { navController.navigate("plants") },
                                onNavigateToUndead = { navController.navigate("undead") },
                                onNavigateToUncategorizedStatblocks = { navController.navigate("uncategorizedStatblocks") },
                            )
                        }
                        composable("oozes") {
                            Oozes(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToStatblocksByType = { navController.navigate("statblocksByType") },
                                onNavigateToCustom = { navController.navigate("custom") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                                onNavigateToInventory =  { navController.navigate("inventory") },
                                onNavigateToAberrations = { navController.navigate("aberrations") },
                                onNavigateToBeasts = { navController.navigate("beasts") },
                                onNavigateToCelestials = { navController.navigate("celestials") },
                                onNavigateToConstructs = { navController.navigate("constructs") },
                                onNavigateToDragons = { navController.navigate("dragons") },
                                onNavigateToElementals = { navController.navigate("elementals") },
                                onNavigateToFey = { navController.navigate("fey") },
                                onNavigateToFiends = { navController.navigate("fiends") },
                                onNavigateToGiants = { navController.navigate("giants") },
                                onNavigateToHumanoids = { navController.navigate("humanoids") },
                                onNavigateToHalfDragons = { navController.navigate("halfDragons") },
                                onNavigateToMonstrosities = { navController.navigate("monstrosities") },
                                onNavigateToOozes = { navController.navigate("oozes") },
                                onNavigateToPlants = { navController.navigate("plants") },
                                onNavigateToUndead = { navController.navigate("undead") },
                                onNavigateToUncategorizedStatblocks = { navController.navigate("uncategorizedStatblocks") },
                            )
                        }
                        composable("plants") {
                            Plants(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToStatblocksByType = { navController.navigate("statblocksByType") },
                                onNavigateToCustom = { navController.navigate("custom") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                                onNavigateToInventory =  { navController.navigate("inventory") },
                                onNavigateToAberrations = { navController.navigate("aberrations") },
                                onNavigateToBeasts = { navController.navigate("beasts") },
                                onNavigateToCelestials = { navController.navigate("celestials") },
                                onNavigateToConstructs = { navController.navigate("constructs") },
                                onNavigateToDragons = { navController.navigate("dragons") },
                                onNavigateToElementals = { navController.navigate("elementals") },
                                onNavigateToFey = { navController.navigate("fey") },
                                onNavigateToFiends = { navController.navigate("fiends") },
                                onNavigateToGiants = { navController.navigate("giants") },
                                onNavigateToHumanoids = { navController.navigate("humanoids") },
                                onNavigateToHalfDragons = { navController.navigate("halfDragons") },
                                onNavigateToMonstrosities = { navController.navigate("monstrosities") },
                                onNavigateToOozes = { navController.navigate("oozes") },
                                onNavigateToPlants = { navController.navigate("plants") },
                                onNavigateToUndead = { navController.navigate("undead") },
                                onNavigateToUncategorizedStatblocks = { navController.navigate("uncategorizedStatblocks") },
                            )
                        }
                        composable("undead") {
                            Undead(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToStatblocksByType = { navController.navigate("statblocksByType") },
                                onNavigateToCustom = { navController.navigate("custom") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                                onNavigateToInventory =  { navController.navigate("inventory") },
                                onNavigateToAberrations = { navController.navigate("aberrations") },
                                onNavigateToBeasts = { navController.navigate("beasts") },
                                onNavigateToCelestials = { navController.navigate("celestials") },
                                onNavigateToConstructs = { navController.navigate("constructs") },
                                onNavigateToDragons = { navController.navigate("dragons") },
                                onNavigateToElementals = { navController.navigate("elementals") },
                                onNavigateToFey = { navController.navigate("fey") },
                                onNavigateToFiends = { navController.navigate("fiends") },
                                onNavigateToGiants = { navController.navigate("giants") },
                                onNavigateToHumanoids = { navController.navigate("humanoids") },
                                onNavigateToHalfDragons = { navController.navigate("halfDragons") },
                                onNavigateToMonstrosities = { navController.navigate("monstrosities") },
                                onNavigateToOozes = { navController.navigate("oozes") },
                                onNavigateToPlants = { navController.navigate("plants") },
                                onNavigateToUndead = { navController.navigate("undead") },
                                onNavigateToUncategorizedStatblocks = { navController.navigate("uncategorizedStatblocks") },
                            )
                        }
                        composable("uncategorizedStatblocks") {
                            UncategorizedStatblocks(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToStatblocksByType = { navController.navigate("statblocksByType") },
                                onNavigateToCustom = { navController.navigate("custom") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToMenagerie = { navController.navigate("menagerie") },
                                onNavigateToFavorites = { navController.navigate("favorites") },
                                onNavigateToInventory = { navController.navigate("inventory") },
                                onNavigateToAberrations = { navController.navigate("aberrations") },
                                onNavigateToBeasts = { navController.navigate("beasts") },
                                onNavigateToCelestials = { navController.navigate("celestials") },
                                onNavigateToConstructs = { navController.navigate("constructs") },
                                onNavigateToDragons = { navController.navigate("dragons") },
                                onNavigateToElementals = { navController.navigate("elementals") },
                                onNavigateToFey = { navController.navigate("fey") },
                                onNavigateToFiends = { navController.navigate("fiends") },
                                onNavigateToGiants = { navController.navigate("giants") },
                                onNavigateToHumanoids = { navController.navigate("humanoids") },
                                onNavigateToHalfDragons = { navController.navigate("halfDragons") },
                                onNavigateToMonstrosities = { navController.navigate("monstrosities") },
                                onNavigateToOozes = { navController.navigate("oozes") },
                                onNavigateToPlants = { navController.navigate("plants") },
                                onNavigateToUncategorizedStatblocks = { navController.navigate("uncategorizedStatblocks") },
                                onNavigateToUndead = { navController.navigate("undead") },
                            )
                        }

                        composable("familiars") {
                            Familiars(
                                familiars = familiars,
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                                onNavigateToInventory =  { navController.navigate("inventory") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                onNavigateToSpecialFamiliars = { navController.navigate("specialFamiliars") },
                                onNavigateToStatblockMenu = { navController.navigate("statblockMenu") },
                            )
                        }
                        composable("specialFamiliars") {
                            SpecialFamiliars(
                                onNavigateHome = { navController.navigate("home") },
                                onNavigateToMenagerie =  { navController.navigate("menagerie") },
                                onNavigateToFavorites =  { navController.navigate("favorites") },
                                onNavigateToInventory =  { navController.navigate("inventory") },
                                onNavigateToRulesQuickGuide = { navController.navigate("reference") },
                                specialFamiliars = specialFamiliars,
                                onNavigateToFamiliars = { navController.navigate("familiars") },
                                onNavigateToStatblockMenu = { navController.navigate("statblockMenu") },
                            )
                        }


                    }
                }
            }
            }
        }
    }

    @Composable
    fun HomeScreen(
        onNavigateToStatblockMenu: () -> Unit,
        onNavigateToFavorites: () -> Unit,
        onNavigateToMenagerie: () -> Unit,
        onNavigateToRulesQuickGuide: () -> Unit,
        onNavigateToInventory: () -> Unit
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(onClick = onNavigateToRulesQuickGuide) {
                Text("Rules Quick Reference")
            }
            Spacer(Modifier.height(16.dp))
            Button(onClick = onNavigateToStatblockMenu) {
                Text("Stat Blocks")
            }
            Spacer(Modifier.height(16.dp))
            Button(onClick = onNavigateToFavorites) {
                Text("Favorites")
            }
            Spacer(Modifier.height(16.dp))
            Button(onClick = onNavigateToMenagerie) {
                Text("Menagerie")
            }
            Spacer(Modifier.height(48.dp))
            Button(onClick = onNavigateToInventory) {
                Text("Inventory")
            }

        }
    }
}


