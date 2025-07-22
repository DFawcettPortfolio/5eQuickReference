package com.example.wildshapesmountsandfamiliars.ui.screens

//import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.bestialSpiritAir
//import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.bestialSpiritLand
//import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.bestialSpiritWater
import android.annotation.SuppressLint
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.wildshapesmountsandfamiliars.R
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.airElemental
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.animatedObjectHugeFlying
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.animatedObjectHugeStationary
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.animatedObjectHugeWalking
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.animatedObjectLargeFlying
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.animatedObjectLargeStationary
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.animatedObjectLargeWalking
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.animatedObjectMediumFlying
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.animatedObjectMediumStationary
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.animatedObjectMediumWalking
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.animatedObjectSmallFlying
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.animatedObjectSmallStationary
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.animatedObjectSmallWalking
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.animatedObjectTinyFlying
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.animatedObjectTinyStationary
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.animatedObjectTinyWalking
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.ape
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.arcaneHandStatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.awakenedShrub
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.awakenedTree
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.axeBeak
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.azer
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.baboon
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.badger
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.bat
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.blackBear
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.blinkDog
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.bloodHawk
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.boar
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.brownBear
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.camel
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.cat
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.cloneStatblock
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.constrictorSnake
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.couatl
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.crab
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.crocodile
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.deer
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.direWolf
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.draftHorse
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.dryad
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.dustMephit
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.eagle
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.earthElemental
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.elephant
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.elk
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.findSteedCamel
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.findSteedElk
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.findSteedMastiff
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.findSteedPony
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.findSteedWarhorse
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.fireElemental
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.flyingSnake
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.frog
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.gargoyle
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.ghast
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.ghoul
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantApe
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantBadger
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantBat
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantBoar
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantCentipede
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantConstrictorSnake
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantCrab
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantCrocodile
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantEagle
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantElk
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantFireBeetle
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantFrog
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantGoat
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantHyena
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantLizard
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantOctopus
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantOwl
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantPoisonousSnake
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantRat
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantScorpion
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantSeaHorse
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantShark
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantSpider
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantToad
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantVulture
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantWasp
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantWeasel
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.giantWolfSpider
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.goat
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.guardianOfFaithStatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.hawk
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.hunterShark
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.hyena
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.iceMephit
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.invisibleStalker
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.jackal
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.killerWhale
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.lion
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.lizard
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.magmaMephit
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.magmin
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.mammoth
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.mastiff
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.mule
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.mummy
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.octopus
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.owl
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.panther
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.pegasus
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.phantomSteedStatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.plesiosaurus
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.poisonousSnake
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.polarBear
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.pony
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.quipper
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.rat
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.raven
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.reefShark
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.rhinoceros
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.ridingHorse
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.saberToothedTiger
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.salamander
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.satyr
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.scorpion
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.seaHag
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.seaHorse
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.skeleton
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.spider
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.sprite
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.steamMephit
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.stirge
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.swarmOfBats
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.swarmOfInsects
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.swarmOfPoisonousSnakes
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.swarmOfQuippers
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.swarmOfRats
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.swarmOfRavens
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.tiger
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.triceratops
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.tyrannosaurusRex
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.unicorn
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.unseenServantStatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.vulture
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.warhorse
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.waterElemental
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.weasel
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.wight
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.wolf
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.xorn
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.zombie

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SpellMenu(
    onNavigateHome: () -> Unit,
    onNavigateToFavorites: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToSpellMenu: () -> Unit,
    spells: List<Spell>,
) {
    val snackbarHostState = remember { SnackbarHostState() }
    val coroutineScope = rememberCoroutineScope()

    var selectedSpell by remember { mutableStateOf<Spell?>(null) }
    var selectedStatBlock by remember { mutableStateOf<StatBlock?>(null) }

    val sortedSpells = remember(spells) {
        spells.sortedBy { it.spellName }
    }
    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        content = { innerPadding ->

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
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
                                when {
                                    selectedStatBlock != null -> {
                                        // If currently viewing a stat block, go back to the spell details
                                        selectedStatBlock = null
                                    }
                                    selectedSpell != null -> {
                                        // If currently viewing a spell, go back to the spell menu
                                        selectedSpell = null
                                        onNavigateToSpellMenu()
                                    }
                                    else -> {
                                        // Otherwise, go back home
                                        onNavigateHome()
                                    }
                                }
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
                Text("Spells", style = MaterialTheme.typography.headlineSmall)
                Spacer(Modifier.height(16.dp))

                if (selectedStatBlock != null) {
                    val context = LocalContext.current
                    val isFavorite = remember(selectedStatBlock) {
                        mutableStateOf(FavoriteManager.contains(selectedStatBlock!!))
                    }

                    Column(
                        Modifier
                            .weight(1f)
                            .verticalScroll(rememberScrollState())
                    ) {
                        StatBlockView(selectedStatBlock!!)

                        Spacer(Modifier.height(16.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            FavoriteToggleButton(
                                selectedStatBlock = selectedStatBlock!!,
                                coroutineScope = coroutineScope,
                                snackbarHostState = snackbarHostState
                            )
                            MenagerieAddButton(
                                statBlock = selectedStatBlock!!,
                                snackbarHostState = snackbarHostState
                            )
                        }

                        Spacer(Modifier.height(8.dp))

                        Button(onClick = { selectedStatBlock = null }) {
                            Text("Back to Spell")
                        }
                    }
                }

                // Display spell view
                else if (selectedSpell != null) {
                    val spell = selectedSpell!!

                    Column(
                        Modifier
                            .weight(1f)
                            .verticalScroll(rememberScrollState())
                    ) {
                        Text(text = spell.spellName, style = MaterialTheme.typography.titleLarge)
                        Spacer(Modifier.height(8.dp))
                        Text("Level ${spell.level} ${spell.school}")
                        Text("Casting Time: ${spell.castingTime}")
                        Text("Ritual: ${spell.ritual}")
                        Text("Range: ${spell.range}")
                        Text("Components: ${spell.components}")
                        Text("Duration: ${spell.duration}")
                        Text("Concentration: ${spell.concentration}")
                        Text("Source: ${spell.source}")
                        Spacer(Modifier.height(8.dp))

                        var showDescription by remember { mutableStateOf(false) }

                        Button(onClick = { showDescription = !showDescription }) {
                            Text(if (showDescription) "Hide Description" else "Show Description")
                        }

                        if (showDescription) {
                            Spacer(Modifier.height(8.dp))
                            Text(spell.description)
                        }

                        Spacer(Modifier.height(16.dp))

                        val spellRefsByLevel = listOf(
                            1 to spell.statBlockRef1,
                            2 to spell.statBlockRef2,
                            3 to spell.statBlockRef3,
                            4 to spell.statBlockRef4,
                            5 to spell.statBlockRef5,
                            6 to spell.statBlockRef6,
                            7 to spell.statBlockRef7,
                            8 to spell.statBlockRef8,
                            9 to spell.statBlockRef9
                        )

                        spellRefsByLevel.forEach { (level, refs) ->
                            if (!refs.isNullOrEmpty()) {
                                var expanded by remember { mutableStateOf(false) }

                                Spacer(Modifier.height(8.dp))
                                Text(
                                    text = "Level $level Cast",
                                    style = MaterialTheme.typography.titleMedium,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable { expanded = !expanded }
                                        .padding(vertical = 4.dp),
                                    color = MaterialTheme.colorScheme.secondary
                                )

                                if (expanded) {
                                    refs.sortedBy { it.name ?: "" }.forEach { block ->
                                        Text(
                                            text = block.name ?: "Unnamed",
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clickable { selectedStatBlock = block }
                                                .padding(12.dp)
                                        )
                                    }
                                }
                            }
                        }

                        Spacer(Modifier.height(16.dp))
                    }
                }
                // Display spell list
                else {
                    LazyColumn(modifier = Modifier.weight(1f)) {
                        items(sortedSpells) { spell ->
                            Text(
                                text = spell.spellName,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable { selectedSpell = spell }
                                    .padding(16.dp)
                            )
                        }
                    }
                }

                Spacer(Modifier.height(16.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    if (selectedSpell != null || selectedStatBlock != null) {
                        Button(
                            onClick = {
                                selectedSpell = null
                                selectedStatBlock = null
                            },
                            modifier = Modifier.weight(1f)
                        ) {
                            Text("Back")
                        }
                    }
                }
            }
        }
    )
}


data class Spell(
    val spellName: String,
    val level: Int,
    val school: String,
    val castingTime: String,
    val ritual: String,
    val concentration: String,
    val range: String,
    val components: String,
    val duration: String,
    val description: String,
    val source: String,
    val statBlockRef1: List<StatBlock>?,
    val statBlockRef2: List<StatBlock>?,
    val statBlockRef3: List<StatBlock>?,
    val statBlockRef4: List<StatBlock>?,
    val statBlockRef5: List<StatBlock>?,
    val statBlockRef6: List<StatBlock>?,
    val statBlockRef7: List<StatBlock>?,
    val statBlockRef8: List<StatBlock>?,
    val statBlockRef9: List<StatBlock>?
)




val spells: List<Spell>
    get() = listOf(
        Spell(
            spellName = "Unseen Servant",
            level = 1,
            school = "Conjuration",
            castingTime = "1 action",
            ritual = "yes",
            concentration = "no",
            range = "60 feet",
            components = "V, S, M (a piece of string and a bit of wood)",
            duration = "1 hour",
            source = "Player's Handbook (SRD)",
            description = """
                This spell creates an invisible, mindless, shapeless, Medium force that performs simple tasks at your command until the spell ends. 
                The servant springs into existence in an unoccupied space on the ground within range. It has AC 10, 1 hit point, and a Strength of 2, and it can’t attack. 
                If it drops to 0 hit points, the spell ends.

                Once on each of your turns as a bonus action, you can mentally command the servant to move up to 15 feet and interact with an object. 
                The servant can perform simple tasks that a human servant could do, such as fetching things, cleaning, mending, folding clothes, lighting fires, 
                serving food, and pouring wine. Once you give the command, the servant performs the task to the best of its ability until it completes the task, 
                then waits for your next command.

                If you command the servant to perform a task that would move it more than 60 feet away from you, the spell ends.
            """.trimIndent(),
            statBlockRef1 = listOf(unseenServantStatBlock),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(),
            statBlockRef4 = listOf(),
            statBlockRef5 = listOf(),
            statBlockRef6 = listOf(),
            statBlockRef7 = listOf(),
            statBlockRef8 = listOf(),
            statBlockRef9 = listOf()
        ),


        Spell(
            spellName = "Find Steed",
            level = 2,
            school = "Conjuration",
            castingTime = "10 minutes",
            ritual = "no",
            concentration = "no",
            range = "30 feet",
            components = "V, S",
            duration = "Instantaneous",
            source = "Player's Handbook (SRD)",
            description = """
        You summon a spirit that assumes the form of an unusually intelligent, strong, and loyal steed, creating a long-lasting bond with it. 
        Appearing in an unoccupied space within range, the steed takes on a form that you choose: a warhorse, a pony, a camel, an elk, or a mastiff. 
        (Your DM might allow other animals to be summoned as steeds.) The steed has the statistics of the chosen form, though it is a celestial, 
        fey, or fiend (your choice) instead of its normal type. Additionally, if your steed has an Intelligence of 5 or less, its Intelligence becomes 6, 
        and it gains the ability to understand one language of your choice that you speak.

        Your steed serves you as a mount, both in combat and out, and you have an instinctive bond with it that allows you to fight as a seamless unit. 
        While mounted on your steed, you can make any spell you cast that targets only you also target your steed.

        When the steed drops to 0 hit points, it disappears, leaving behind no physical form. You can also dismiss your steed at any time as an action, 
        causing it to disappear. In either case, casting this spell again summons the same steed, restored to its hit point maximum.

        While your steed is within 1 mile of you, you can communicate with each other telepathically. You can’t have more than one steed bonded by this 
        spell at a time. As an action, you can release the steed from its bond at any time, causing it to disappear.
    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(findSteedWarhorse, findSteedPony, findSteedCamel, findSteedElk, findSteedMastiff),
            statBlockRef3 = listOf(),
            statBlockRef4 = listOf(),
            statBlockRef5 = listOf(),
            statBlockRef6 = listOf(),
            statBlockRef7 = listOf(),
            statBlockRef8 = listOf(),
            statBlockRef9 = listOf()
        ),

        Spell(
            spellName = "Animate Dead",
            level = 3,
            school = "Necromancy",
            castingTime = "1 minute",
            ritual = "no",
            concentration = "no",
            range = "10 feet",
            components = "V, S, M (a drop of blood, a piece of flesh, and a pinch of bone dust)",
            duration = "Instantaneous",
            source = "Player's Handbook (SRD)",
            description = """
        This spell creates an undead servant. Choose a pile of bones or a corpse of a Medium or Small humanoid within range. 
        Your spell imbues the target with a foul mimicry of life, raising it as an undead creature. The target becomes a skeleton if you chose bones 
        or a zombie if you chose a corpse (the DM has the creature’s game statistics).

        On each of your turns, you can use a bonus action to mentally command any creature you made with this spell if the creature is within 60 feet of you 
        (if you control multiple creatures, you can command any or all of them at the same time, issuing the same command to each one). 
        You decide what action the creature will take and where it will move during its next turn, or you can issue a general command, such as to guard a particular chamber or corridor. 
        If you issue no commands, the creature only defends itself against hostile creatures. Once given an order, the creature continues to follow it until its task is complete.

        The creature is under your control for 24 hours, after which it stops obeying any command you’ve given it. 
        To maintain the control of the creature for another 24 hours, you must cast this spell on the creature again before the current 24-hour period ends. 
        This use of the spell reasserts your control over up to four creatures you have animated with this spell, rather than animating a new one.

        At Higher Levels. When you cast this spell using a spell slot of 4th level or higher, you animate or reassert control over two additional undead creatures 
        for each slot level above 3rd. Each of the creatures must come from a different corpse or pile of bones.
    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(skeleton, zombie),
            statBlockRef4 = listOf(),
            statBlockRef5 = listOf(),
            statBlockRef6 = listOf(),
            statBlockRef7 = listOf(),
            statBlockRef8 = listOf(),
            statBlockRef9 = listOf()
        ),
        Spell(
            spellName = "Conjure Animals",
            level = 3,
            school = "Conjuration",
            castingTime = "1 action",
            ritual = "no",
            concentration = "yes",
            range = "60 feet",
            components = "V, S",
            duration = "Concentration, up to 1 hour",
            source = "Player's Handbook (SRD)",
            description = """
        You summon fey spirits that take the form of beasts and appear in unoccupied spaces that you can see within range.

        Choose one of the following options for what appears:

        One beast of challenge rating 2 or lower
        Two beasts of challenge rating 1 or lower
        Four beasts of challenge rating 1/2 or lower
        Eight beasts of challenge rating 1/4 or lower

        Each beast is also considered fey, and it disappears when it drops to 0 hit points or when the spell ends.

        The summoned creatures are friendly to you and your companions. Roll initiative for the summoned creatures as a group, which has its own turns. 
        They obey any verbal commands that you issue to them (no action required by you). If you don’t issue any commands to them, they defend themselves from hostile creatures, but otherwise take no actions. 
        The DM has the creatures’ statistics.

        At Higher Levels. When you cast this spell using certain higher-level spell slots, you choose one of the summoning options above, and more creatures appear: 
        twice as many with a 5th-level slot, three times as many with a 7th-level slot, and four times as many with a 9th-level slot.
    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(ape, axeBeak, baboon, badger, bat, blackBear, bloodHawk, boar, brownBear, camel, cat, constrictorSnake, crab, crocodile, deer, direWolf, draftHorse,
                eagle, elk, flyingSnake, frog, giantBadger, giantBat, giantBoar, giantCentipede, giantConstrictorSnake, giantCrab, giantEagle, giantElk, giantFireBeetle, giantFrog, giantGoat,
                giantHyena, giantLizard, giantOctopus, giantOwl, giantPoisonousSnake, giantRat, giantSeaHorse, giantSpider, giantToad, giantVulture, giantWasp, giantWeasel, giantWolfSpider, goat,
                hawk, hunterShark, hyena, jackal, lion, lizard, mastiff, mule, octopus, owl, panther, plesiosaurus, poisonousSnake, polarBear, pony, quipper, rat, raven, reefShark,
                rhinoceros, ridingHorse, saberToothedTiger, scorpion, seaHorse, spider, stirge, swarmOfBats, swarmOfInsects, swarmOfPoisonousSnakes, swarmOfQuippers, swarmOfRats, swarmOfRavens,
                tiger, vulture, warhorse, weasel, wolf),
            statBlockRef4 = listOf(),
            statBlockRef5 = listOf(),
            statBlockRef6 = listOf(),
            statBlockRef7 = listOf(),
            statBlockRef8 = listOf(),
            statBlockRef9 = listOf()

        ),
        Spell(
            spellName = "Phantom Steed",
            level = 3,
            school = "Illusion",
            castingTime = "1 minute",
            ritual = "yes",
            concentration = "no",
            range = "30 feet",
            components = "V, S",
            duration = "1 hour",
            source = "Player's Handbook (SRD)",
            description = """
        A Large quasi-real, horselike creature appears on the ground in an unoccupied space of your choice within range. 
        You decide the creature’s appearance, but it is equipped with a saddle, bit, and bridle. 
        Any of the equipment created by the spell vanishes in a puff of smoke if it is carried more than 10 feet away from the steed.

        For the duration, you or a creature you choose can ride the steed. 
        The creature uses the statistics for a riding horse, except it has a speed of 100 feet and can travel 10 miles in an hour, or 13 miles at a fast pace. 
        When the spell ends, the steed gradually fades, giving the rider 1 minute to dismount. 
        The spell ends if you use an action to dismiss it or if the steed takes any damage.
        
        Spell Lists. Wizard
    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(phantomSteedStatBlock),
            statBlockRef4 = listOf(),
            statBlockRef5 = listOf(),
            statBlockRef6 = listOf(),
            statBlockRef7 = listOf(),
            statBlockRef8 = listOf(),
            statBlockRef9 = listOf()
        ),

        Spell(
            spellName = "Conjure Minor Elementals",
            level = 4,
            school = "Conjuration",
            castingTime = "1 minute",
            ritual = "no",
            concentration = "yes",
            range = "90 feet",
            components = "V, S",
            duration = "Concentration, up to 1 hour",
            source = "Player's Handbook (SRD)",
            description = """
        You summon elementals that appear in unoccupied spaces that you can see within range. You choose one the following options for what appears:

        One elemental of challenge rating 2 or lower  
        Two elementals of challenge rating 1 or lower  
        Four elementals of challenge rating 1/2 or lower  
        Eight elementals of challenge rating 1/4 or lower  

        An elemental summoned by this spell disappears when it drops to 0 hit points or when the spell ends.

        The summoned creatures are friendly to you and your companions. Roll initiative for the summoned creatures as a group, which has its own turns. 
        They obey any verbal commands that you issue to them (no action required by you). If you don’t issue any commands to them, they defend themselves from hostile creatures, but otherwise take no actions. 
        The DM has the creatures’ statistics.

        At Higher Levels. When you cast this spell using certain higher-level spell slots, you choose one of the summoning options above, and more creatures appear: 
        twice as many with a 6th-level slot and three times as many with an 8th-level slot.
    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(),
            statBlockRef4 = listOf(azer, dustMephit, gargoyle, iceMephit, magmaMephit, magmin, steamMephit),
            statBlockRef5 = listOf(),
            statBlockRef6 = listOf(),
            statBlockRef7 = listOf(),
            statBlockRef8 = listOf(),
            statBlockRef9 = listOf()
        ),

        Spell(
            spellName = "Conjure Woodland Beings",
            level = 4,
            school = "Conjuration",
            castingTime = "1 action",
            ritual = "no",
            concentration = "yes",
            range = "60 feet",
            components = "V, S, M (one holly berry per creature summoned)",
            duration = "Concentration, up to 1 hour",
            source = "Player's Handbook (SRD)",
            description = """
        You summon fey creatures that appear in unoccupied spaces that you can see within range. Choose one of the following options for what appears:

        One fey creature of challenge rating 2 or lower  
        Two fey creatures of challenge rating 1 or lower  
        Four fey creatures of challenge rating 1/2 or lower  
        Eight fey creatures of challenge rating 1/4 or lower  

        A summoned creature disappears when it drops to 0 hit points or when the spell ends.

        The summoned creatures are friendly to you and your companions. Roll initiative for the summoned creatures as a group, which have their own turns. 
        They obey any verbal commands that you issue to them (no action required by you). If you don’t issue any commands to them, they defend themselves from hostile creatures, but otherwise take no actions. 
        The DM has the creatures’ statistics.

        At Higher Levels. When you cast this spell using certain higher-level spell slots, you choose one of the summoning options above, and more creatures appear: 
        twice as many with a 6th-level slot, and three times as many with an 8th-level slot.
    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(),
            statBlockRef4 = listOf(blinkDog, dryad, satyr, seaHag, sprite),
            statBlockRef5 = listOf(),
            statBlockRef6 = listOf(),
            statBlockRef7 = listOf(),
            statBlockRef8 = listOf(),
            statBlockRef9 = listOf()
        ),

        Spell(
            spellName = "Dominate Beast",
            level = 4,
            school = "Enchantment",
            castingTime = "1 action",
            ritual = "no",
            concentration = "yes",
            range = "60 feet",
            components = "V, S",
            duration = "Concentration, up to 1 minute",
            source = "Player's Handbook (SRD)",
            description = """
        You attempt to beguile a beast that you can see within range. It must succeed on a Wisdom saving throw or be charmed by you for the duration. 
        If you or creatures that are friendly to you are fighting it, it has advantage on the saving throw.

        While the beast is charmed, you have a telepathic link with it as long as the two of you are on the same plane of existence. 
        You can use this telepathic link to issue commands to the creature while you are conscious (no action required), which it does its best to obey. 
        You can specify a simple and general course of action, such as “Attack that creature,” “Run over there,” or “Fetch that object.” 
        If the creature completes the order and doesn’t receive further direction from you, it defends and preserves itself to the best of its ability.

        You can use your action to take total and precise control of the target. Until the end of your next turn, the creature takes only the actions you choose, 
        and doesn’t do anything that you don’t allow it to do. During this time, you can also cause the creature to use a reaction, but this requires you to use your own reaction as well.

        Each time the target takes damage, it makes a new Wisdom saving throw against the spell. If the saving throw succeeds, the spell ends.

        At Higher Levels. When you cast this spell with a 5th-level spell slot, the duration is concentration, up to 10 minutes. 
        When you use a 6th-level spell slot, the duration is concentration, up to 1 hour. 
        When you use a spell slot of 7th level or higher, the duration is concentration, up to 8 hours.
    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(),
            statBlockRef4 = BeastStatBlocks,
            statBlockRef5 = listOf(),
            statBlockRef6 = listOf(),
            statBlockRef7 = listOf(),
            statBlockRef8 = listOf(),
            statBlockRef9 = listOf()
        ),

        Spell(
            spellName = "Giant Insect",
            level = 4,
            school = "Transmutation",
            castingTime = "1 action",
            ritual = "no",
            concentration = "yes",
            range = "30 feet",
            components = "V, S",
            duration = "Concentration, up to 10 minutes",
            source = "Player's Handbook (SRD)",
            description = """
        You transform up to ten centipedes, three spiders, five wasps, or one scorpion within range into giant versions of their natural forms for the duration. 
        A centipede becomes a giant centipede, a spider becomes a giant spider, a wasp becomes a giant wasp, and a scorpion becomes a giant scorpion.

        Each creature obeys your verbal commands, and in combat, they act on your turn each round. 
        The DM has the statistics for these creatures and resolves their actions and movement.

        A creature remains in its giant size for the duration, until it drops to 0 hit points, or until you use an action to dismiss the effect on it.

        The DM might allow you to choose different targets. For example, if you transform a bee, its giant version might have the same statistics as a giant wasp.
    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(),
            statBlockRef4 = listOf(giantCentipede, giantSpider, giantWasp, giantScorpion),
            statBlockRef5 = listOf(),
            statBlockRef6 = listOf(),
            statBlockRef7 = listOf(),
            statBlockRef8 = listOf(),
            statBlockRef9 = listOf()
        ),
        Spell(
            spellName = "Guardian of Faith",
            level = 4,
            school = "Conjuration",
            castingTime = "1 action",
            ritual = "no",
            concentration = "no",
            range = "30 feet",
            components = "V",
            duration = "8 hours",
            source = "Player's Handbook (SRD)",
            description = """
        A Large spectral guardian appears and hovers for the duration in an unoccupied space of your choice that you can see within range. 
        The guardian occupies that space and is indistinct except for a gleaming sword and shield emblazoned with the symbol of your deity.

        Any creature hostile to you that moves to a space within 10 feet of the guardian for the first time on a turn must succeed on a Dexterity saving throw. 
        The creature takes 20 radiant damage on a failed save, or half as much damage on a successful one. 
        The guardian vanishes when it has dealt a total of 60 damage.
    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(),
            statBlockRef4 = listOf(guardianOfFaithStatBlock),
            statBlockRef5 = listOf(),
            statBlockRef6 = listOf(),
            statBlockRef7 = listOf(),
            statBlockRef8 = listOf(),
            statBlockRef9 = listOf()
        ),
        Spell(
            spellName = "Polymorph",
            level = 4,
            school = "Transmutation",
            castingTime = "1 action",
            ritual = "no",
            concentration = "yes",
            range = "60 feet",
            components = "V, S, M (a caterpillar cocoon)",
            duration = "Concentration, up to 1 hour",
            source = "Player's Handbook (SRD)",
            description = """
        This spell transforms a creature that you can see within range into a new form. An unwilling creature must make a Wisdom saving throw to avoid the effect. A shapechanger automatically succeeds on this saving throw.

        The transformation lasts for the duration, or until the target drops to 0 hit points or dies. The new form can be any beast whose challenge rating is equal to or less than the target’s (or the target’s level, if it doesn’t have a challenge rating). The target’s game statistics, including mental ability scores, are replaced by the statistics of the chosen beast. It retains its alignment and personality.

        The target assumes the hit points of its new form. When it reverts to its normal form, the creature returns to the number of hit points it had before it transformed. If it reverts as a result of dropping to 0 hit points, any excess damage carries over to its normal form. As long as the excess damage doesn’t reduce the creature’s normal form to 0 hit points, it isn’t knocked unconscious.

        The creature is limited in the actions it can perform by the nature of its new form, and it can’t speak, cast spells, or take any other action that requires hands or speech.

        The target’s gear melds into the new form. The creature can’t activate, use, wield, or otherwise benefit from any of its equipment. This spell can’t affect a target that has 0 hit points.
    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(),
            statBlockRef4 = BeastStatBlocks,
            statBlockRef5 = listOf(),
            statBlockRef6 = listOf(),
            statBlockRef7 = listOf(),
            statBlockRef8 = listOf(),
            statBlockRef9 = listOf()
        ),

        Spell(
            spellName = "Animate Objects",
            level = 5,
            school = "Transmutation",
            castingTime = "1 action",
            ritual = "no",
            concentration = "yes",
            range = "120 feet",
            components = "V, S",
            duration = "Concentration, up to 1 minute",
            source = "Player's Handbook (SRD)",
            description = """
        Objects come to life at your command. Choose up to ten nonmagical objects within range that are not being worn or carried. Medium targets count as two objects, Large targets count as four objects, Huge targets count as eight objects. You can’t animate any object larger than Huge. Each target animates and becomes a creature under your control until the spell ends or until reduced to 0 hit points.

        As a bonus action, you can mentally command any creature you made with this spell if the creature is within 500 feet of you (if you control multiple creatures, you can command any or all of them at the same time, issuing the same command to each one). You decide what action the creature will take and where it will move during its next turn, or you can issue a general command, such as to guard a particular chamber or corridor. If you issue no commands, the creature only defends itself against hostile creatures. Once given an order, the creature continues to follow it until its task is complete.

        An animated object is a construct with AC, hit points, attacks, Strength, and Dexterity determined by its size. Its Constitution is 10 and its Intelligence and Wisdom are 3, and its Charisma is 1. Its speed is 30 feet; if the objects lack legs or other appendages it can use for locomotion, it instead has a flying speed of 30 feet and can hover. If the object is securely attached to a surface or larger object, such as a chain bolted to a wall, its speed is 0. It has blindsight with a radius of 30 feet and is blind beyond that distance. When the animated object drops to 0 hit points, it reverts to its original object form, and any remaining damage carries over to its original object form.

        If you command an object to attack, it can make a single melee attack against a creature within 5 feet of it. It makes a slam attack with an attack bonus and bludgeoning damage determined by its size. The DM might rule that a specific object inflicts slashing or piercing damage based on its form.

        At Higher Levels. If you cast this spell using a spell slot of 6th level or higher, you can animate two additional objects for each slot level above 5th.
    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(),
            statBlockRef4 = listOf(),
            statBlockRef5 = listOf(animatedObjectTinyFlying, animatedObjectSmallFlying,
                animatedObjectMediumFlying, animatedObjectLargeFlying, animatedObjectHugeFlying,
                animatedObjectTinyWalking, animatedObjectSmallWalking,
                animatedObjectMediumWalking, animatedObjectLargeWalking, animatedObjectHugeWalking,
                animatedObjectTinyStationary, animatedObjectSmallStationary,
                animatedObjectMediumStationary, animatedObjectLargeStationary, animatedObjectHugeStationary),
            statBlockRef6 = listOf(animatedObjectTinyFlying, animatedObjectSmallFlying,
                animatedObjectMediumFlying, animatedObjectLargeFlying, animatedObjectHugeFlying,
                animatedObjectTinyWalking, animatedObjectSmallWalking,
                animatedObjectMediumWalking, animatedObjectLargeWalking, animatedObjectHugeWalking,
                animatedObjectTinyStationary, animatedObjectSmallStationary,
                animatedObjectMediumStationary, animatedObjectLargeStationary, animatedObjectHugeStationary),
            statBlockRef7 = listOf(animatedObjectTinyFlying, animatedObjectSmallFlying,
                animatedObjectMediumFlying, animatedObjectLargeFlying, animatedObjectHugeFlying,
                animatedObjectTinyWalking, animatedObjectSmallWalking,
                animatedObjectMediumWalking, animatedObjectLargeWalking, animatedObjectHugeWalking,
                animatedObjectTinyStationary, animatedObjectSmallStationary,
                animatedObjectMediumStationary, animatedObjectLargeStationary, animatedObjectHugeStationary),
            statBlockRef8 = listOf(animatedObjectTinyFlying, animatedObjectSmallFlying,
                animatedObjectMediumFlying, animatedObjectLargeFlying, animatedObjectHugeFlying,
                animatedObjectTinyWalking, animatedObjectSmallWalking,
                animatedObjectMediumWalking, animatedObjectLargeWalking, animatedObjectHugeWalking,
                animatedObjectTinyStationary, animatedObjectSmallStationary,
                animatedObjectMediumStationary, animatedObjectLargeStationary, animatedObjectHugeStationary),
            statBlockRef9 = listOf(animatedObjectTinyFlying, animatedObjectSmallFlying,
                animatedObjectMediumFlying, animatedObjectLargeFlying, animatedObjectHugeFlying,
                animatedObjectTinyWalking, animatedObjectSmallWalking,
                animatedObjectMediumWalking, animatedObjectLargeWalking, animatedObjectHugeWalking,
                animatedObjectTinyStationary, animatedObjectSmallStationary,
                animatedObjectMediumStationary, animatedObjectLargeStationary, animatedObjectHugeStationary)
        ),
        Spell(
            spellName = "Awaken",
            level = 5,
            school = "Transmutation",
            castingTime = "8 hours",
            ritual = "no",
            concentration = "no",
            range = "Touch",
            components = "V, S, M (an agate worth at least 1,000 gp, which the spell consumes)",
            duration = "Instantaneous",
            source = "Player's Handbook (SRD)",
            description = """
        After spending the casting time tracing magical pathways within a precious gemstone, you touch a huge or smaller beast or plant. The target must have either no Intelligence score or an Intelligence of 3 or less.

        The target gains an Intelligence of 10. The target also gains the ability to speak one language you know. If the target is a plant, it gains the ability to move its limbs, roots, vines, creepers, and so forth, and it gains senses similar to a human’s. Your DM chooses statistics appropriate for the awakened plant, such as the statistics for the awakened shrub or the awakened tree.

        The awakened beast or plant is charmed by you for 30 days or until you and your companions do anything harmful to it. When the charmed condition ends, the awakened creature chooses whether to remain friendly to you, based on how you treated it while it was charmed.
    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(),
            statBlockRef4 = listOf(),
            statBlockRef5 = listOf(awakenedTree, awakenedShrub),
            statBlockRef6 = listOf(),
            statBlockRef7 = listOf(),
            statBlockRef8 = listOf(),
            statBlockRef9 = listOf()
        ),
        Spell(
            spellName = "Arcane Hand",
            level = 5,
            school = "Evocation",
            castingTime = "1 action",
            ritual = "no",
            concentration = "yes",
            range = "120 feet",
            components = "V, S, M (an eggshell and a snakeskin glove)",
            duration = "Concentration, up to 1 minute",
            source = "Player's Handbook (SRD)",
            description = """
        You create a Large hand of shimmering, translucent force in an unoccupied space that you can see within range. The hand lasts for the spell’s duration, and it moves at your command, mimicking the movements of your own hand.

        The hand is an object that has AC 20 and hit points equal to your hit point maximum. If it drops to 0 hit points, the spell ends. It has a Strength of 26 (+8) and a Dexterity of 10 (+0). The hand doesn’t fill its space.

        When you cast the spell and as a bonus action on your subsequent turns, you can move the hand up to 60 feet and then cause one of the following effects with it.

        Clenched Fist. The hand strikes one creature or object within 5 feet of it. Make a melee spell attack for the hand using your game statistics. On a hit, the target takes 4d8 force damage.

        Forceful Hand. The hand attempts to push a creature within 5 feet of it in a direction you choose. Make a check with the hand’s Strength contested by the Strength (Athletics) check of the target. If the target is Medium or smaller, you have advantage on the check. If you succeed, the hand pushes the target up to 5 feet plus a number of feet equal to five times your spellcasting ability modifier. The hand moves with the target to remain within 5 feet of it.

        Grasping Hand. The hand attempts to grapple a Huge or smaller creature within 5 feet of it. You use the hand’s Strength score to resolve the grapple. If the target is Medium or smaller, you have advantage on the check. While the hand is grappling the target, you can use a bonus action to have the hand crush it. When you do so, the target takes bludgeoning damage equal to 2d6 + your spellcasting ability modifier.

        Interposing Hand. The hand interposes itself between you and a creature you choose until you give the hand a different command. The hand moves to stay between you and the target, providing you with half cover against the target. The target can’t move through the hand’s space if its Strength score is less than or equal to the hand’s Strength score. If its Strength score is higher than the hand’s Strength score, the target can move toward you through the hand’s space, but that space is difficult terrain for the target.

        At Higher Levels. When you cast this spell using a spell slot of 6th level or higher, the damage from the clenched fist option increases by 2d8 and the damage from the grasping hand increases by 2d6 for each slot level above 5th.

    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(),
            statBlockRef4 = listOf(),
            statBlockRef5 = listOf(arcaneHandStatBlock),
            statBlockRef6 = listOf(arcaneHandStatBlock),
            statBlockRef7 = listOf(arcaneHandStatBlock),
            statBlockRef8 = listOf(arcaneHandStatBlock),
            statBlockRef9 = listOf(arcaneHandStatBlock)
            //TODO: statblock upcast
        ),
        Spell(
            spellName = "Conjure Elemental",
            level = 5,
            school = "Conjuration",
            castingTime = "1 minute",
            ritual = "no",
            concentration = "yes",
            range = "90 feet",
            components = "V, S, M (burning incense for air, soft clay for earth, sulfur and phosphorus for fire, or water and sand for water)",
            duration = "Concentration, up to 1 hour",
            source = "Player's Handbook (SRD)",
            description = """
        You call forth an elemental servant. Choose an area of air, earth, fire, or water that fills a 10-foot cube within range. An elemental of challenge rating 5 or lower appropriate to the area you chose appears in an unoccupied space within 10 feet of it. For example, a fire elemental emerges from a bonfire, and an earth elemental rises up from the ground. The elemental disappears when it drops to 0 hit points or when the spell ends.

        The elemental is friendly to you and your companions for the duration. Roll initiative for the elemental, which has its own turns. It obeys any verbal commands that you issue to it (no action required by you). If you don’t issue any commands to the elemental, it defends itself from hostile creatures but otherwise takes no actions.

        If your concentration is broken, the elemental doesn’t disappear. Instead, you lose control of the elemental, it becomes hostile toward you and your companions, and it might attack. An uncontrolled elemental can’t be dismissed by you, and it disappears 1 hour after you summoned it. The DM has the elemental’s statistics.

        At Higher Levels. When you cast this spell using a spell slot of 6th level or higher, the challenge rating increases by 1 for each slot level above 5th.
    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(),
            statBlockRef4 = listOf(),
            statBlockRef5 = listOf(steamMephit, dustMephit, iceMephit, magmaMephit, magmin, azer, gargoyle,
                airElemental, earthElemental, fireElemental, salamander, waterElemental, xorn),//5
            statBlockRef6 = listOf(steamMephit, dustMephit, iceMephit, magmaMephit, magmin, azer, gargoyle,
                airElemental, earthElemental, fireElemental, salamander, waterElemental, xorn, invisibleStalker),//6
            statBlockRef7 = listOf(steamMephit, dustMephit, iceMephit, magmaMephit, magmin,azer, gargoyle,
                airElemental, earthElemental, fireElemental, salamander, waterElemental, xorn, invisibleStalker),//7
            statBlockRef8 = listOf(steamMephit, dustMephit, iceMephit, magmaMephit, magmin, azer, gargoyle,
                airElemental, earthElemental, fireElemental, salamander, waterElemental, xorn, invisibleStalker),//8
            statBlockRef9 = listOf(steamMephit, dustMephit, iceMephit, magmaMephit, magmin, azer, gargoyle,
                airElemental, earthElemental, fireElemental, salamander, waterElemental, xorn, invisibleStalker)//9
        ),

        Spell(
            spellName = "Planar Binding",
            level = 5,
            school = "Abjuration",
            castingTime = "1 hour",
            ritual = "no",
            concentration = "no",
            range = "60 feet",
            components = "V, S, M (a jewel worth at least 1,000 gp, which the spell consumes)",
            duration = "24 hours",
            source = "Player's Handbook (SRD)",
            description = """
        With this spell, you attempt to bind a celestial, an elemental, a fey, or a fiend to your service. The creature must be within range for the entire casting of the spell. (Typically, the creature is first summoned into the center of an inverted Magic Circle in order to keep it trapped while this spell is cast.) At the completion of the casting, the target must make a Charisma saving throw. On a failed save, it is bound to serve you for the duration. If the creature was summoned or created by another spell, that spell’s duration is extended to match the duration of this spell.

        A bound creature must follow your instructions to the best of its ability. You might command the creature to accompany you on an adventure, to guard a location, or to deliver a message. The creature obeys the letter of your instructions, but if the creature is hostile to you, it strives to twist your words to achieve its own objectives. If the creature carries out your instructions completely before the spell ends, it travels to you to report this fact if you are on the same plane of existence. If you are on a different plane of existence, it returns to the place where you bound it and remains there until the spell ends.

        At Higher Levels. When you cast this spell using a spell slot of a higher level, the duration increases to 10 days with a 6th-level slot, 30 days with a 7th-level slot, 180 days with an 8th-level slot, or 1 year and 1 day with a 9th-level spell slot.

        Spell Lists: Bard, Cleric, Druid, Warlock (Optional), Wizard
    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(),
            statBlockRef4 = listOf(),
            statBlockRef5 = CelestialStatBlocks + ElementalStatBlocks + FeyStatBlocks + FiendStatBlocks,
            statBlockRef6 = listOf(),
            statBlockRef7 = listOf(),
            statBlockRef8 = listOf(),
            statBlockRef9 = listOf()
        ),

        Spell(
            spellName = "Conjure Fey",
            level = 6,
            school = "Conjuration",
            castingTime = "1 action",
            ritual = "no",
            concentration = "yes",
            range = "90 feet",
            components = "V, S",
            duration = "Concentration, up to 1 hour",
            source = "Player's Handbook (SRD)",
            description = """
        You summon a fey creature of challenge rating 6 or lower, or a fey spirit that takes the form of a beast of challenge rating 6 or lower. It appears in an unoccupied space that you can see within range. The fey creature disappears when it drops to 0 hit points or when the spell ends.

        The fey creature is friendly to you and your companions for the duration. Roll initiative for the creature, which has its own turns. It obeys any verbal commands that you issue to it (no action required by you), as long as they don’t violate its alignment. If you don’t issue any commands to the fey creature, it defends itself from hostile creatures but otherwise takes no actions.

        If your concentration is broken, the fey creature doesn’t disappear. Instead, you lose control of the fey creature, it becomes hostile toward you and your companions, and it might attack. An uncontrolled fey creature can’t be dismissed by you, and it disappears 1 hour after you summoned it. The DM has the fey creature’s statistics.

        At Higher Levels. When you cast this spell using a spell slot of 7th level or higher, the challenge rating increases by 1 for each slot level above 6th.

        Spell Lists: Druid, Warlock
    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(),
            statBlockRef4 = listOf(),
            statBlockRef5 = listOf(),
            statBlockRef6 = listOf(baboon, badger, bat, cat, crab, deer, eagle, frog, giantFireBeetle, goat, hawk, hyena, jackal, lizard, octopus, owl, quipper, rat, raven, scorpion, seaHorse, spider, vulture, weasel, bloodHawk, camel, flyingSnake, giantCrab, giantRat, giantWeasel, mastiff, mule, poisonousSnake, pony, stirge, axeBeak, boar, constrictorSnake, draftHorse, elk, giantBadger, giantBat, giantBoar, giantCentipede, giantFrog, giantLizard, giantOwl, giantPoisonousSnake, giantWolfSpider, panther, ridingHorse, swarmOfBats, swarmOfRats, swarmOfRavens, wolf, ape, blackBear, crocodile, giantGoat, giantSeaHorse, giantWasp, reefShark, swarmOfInsects, warhorse, brownBear, direWolf, giantEagle, giantHyena, giantOctopus, giantSpider, giantToad, giantVulture, lion, swarmOfQuippers, tiger, giantBoar, giantConstrictorSnake, giantElk, hunterShark, plesiosaurus, polarBear, rhinoceros, saberToothedTiger, swarmOfPoisonousSnakes, giantScorpion, killerWhale, elephant, giantCrocodile, giantShark, triceratops, mammoth),//6
            statBlockRef7 = listOf(baboon, badger, bat, cat, crab, deer, eagle, frog, giantFireBeetle, goat, hawk, hyena, jackal, lizard, octopus, owl, quipper, rat, raven, scorpion, seaHorse, spider, vulture, weasel, bloodHawk, camel, flyingSnake, giantCrab, giantRat, giantWeasel, mastiff, mule, poisonousSnake, pony, stirge, axeBeak, boar, constrictorSnake, draftHorse, elk, giantBadger, giantBat, giantBoar, giantCentipede, giantFrog, giantLizard, giantOwl, giantPoisonousSnake, giantWolfSpider, panther, ridingHorse, swarmOfBats, swarmOfRats, swarmOfRavens, wolf, ape, blackBear, crocodile, giantGoat, giantSeaHorse, giantWasp, reefShark, swarmOfInsects, warhorse, brownBear, direWolf, giantEagle, giantHyena, giantOctopus, giantSpider, giantToad, giantVulture, lion, swarmOfQuippers, tiger, giantBoar, giantConstrictorSnake, giantElk, hunterShark, plesiosaurus, polarBear, rhinoceros, saberToothedTiger, swarmOfPoisonousSnakes, giantScorpion, killerWhale, elephant, giantCrocodile, giantShark, triceratops, mammoth, giantApe),//7
            statBlockRef8 = listOf(baboon, badger, bat, cat, crab, deer, eagle, frog, giantFireBeetle, goat, hawk, hyena, jackal, lizard, octopus, owl, quipper, rat, raven, scorpion, seaHorse, spider, vulture, weasel, bloodHawk, camel, flyingSnake, giantCrab, giantRat, giantWeasel, mastiff, mule, poisonousSnake, pony, stirge, axeBeak, boar, constrictorSnake, draftHorse, elk, giantBadger, giantBat, giantBoar, giantCentipede, giantFrog, giantLizard, giantOwl, giantPoisonousSnake, giantWolfSpider, panther, ridingHorse, swarmOfBats, swarmOfRats, swarmOfRavens, wolf, ape, blackBear, crocodile, giantGoat, giantSeaHorse, giantWasp, reefShark, swarmOfInsects, warhorse, brownBear, direWolf, giantEagle, giantHyena, giantOctopus, giantSpider, giantToad, giantVulture, lion, swarmOfQuippers, tiger, giantBoar, giantConstrictorSnake, giantElk, hunterShark, plesiosaurus, polarBear, rhinoceros, saberToothedTiger, swarmOfPoisonousSnakes, giantScorpion, killerWhale, elephant, giantCrocodile, giantShark, triceratops, mammoth, giantApe, tyrannosaurusRex),//8
            statBlockRef9 = listOf(baboon, badger, bat, cat, crab, deer, eagle, frog, giantFireBeetle, goat, hawk, hyena, jackal, lizard, octopus, owl, quipper, rat, raven, scorpion, seaHorse, spider, vulture, weasel, bloodHawk, camel, flyingSnake, giantCrab, giantRat, giantWeasel, mastiff, mule, poisonousSnake, pony, stirge, axeBeak, boar, constrictorSnake, draftHorse, elk, giantBadger, giantBat, giantBoar, giantCentipede, giantFrog, giantLizard, giantOwl, giantPoisonousSnake, giantWolfSpider, panther, ridingHorse, swarmOfBats, swarmOfRats, swarmOfRavens, wolf, ape, blackBear, crocodile, giantGoat, giantSeaHorse, giantWasp, reefShark, swarmOfInsects, warhorse, brownBear, direWolf, giantEagle, giantHyena, giantOctopus, giantSpider, giantToad, giantVulture, lion, swarmOfQuippers, tiger, giantBoar, giantConstrictorSnake, giantElk, hunterShark, plesiosaurus, polarBear, rhinoceros, saberToothedTiger, swarmOfPoisonousSnakes, giantScorpion, killerWhale, elephant, giantCrocodile, giantShark, triceratops, mammoth, giantApe, tyrannosaurusRex)//9

        ),

        Spell(
            spellName = "Create Undead",
            level = 6,
            school = "Necromancy",
            castingTime = "1 minute",
            ritual = "no",
            concentration = "no",
            range = "10 feet",
            components = "V, S, M (one clay pot filled with grave dirt, one clay pot filled with brackish water, and one 150 gp black onyx stone for each corpse)",
            duration = "Instantaneous",
            source = "Player's Handbook (SRD)",
            description = """
        You can cast this spell only at night. Choose up to three corpses of Medium or Small humanoids within range. Each corpse becomes a ghoul under your control. The DM has game statistics for these creatures.

        As a bonus action on each of your turns, you can mentally command any creature you animated with this spell if the creature is within 120 feet of you (if you control multiple creatures, you can command any or all of them at the same time, issuing the same command to each one). You decide what action the creature will take and where it will move during its next turn, or you can issue a general command, such as to guard a particular chamber or corridor. If you issue no commands, the creature only defends itself against hostile creatures. Once given an order, the creature continues to follow it until its task is complete.

        The creature is under your control for 24 hours, after which it stops obeying any command you have given it. To maintain control of the creature for another 24 hours, you must cast this spell on the creature before the current 24-hour period ends. This use of the spell reasserts your control over up to three creatures you have animated with this spell, rather than animating new ones.

        At Higher Levels. When you cast this spell using a 7th-level spell slot, you can animate or reassert control over four ghouls. When you cast this spell using an 8th-level spell slot, you can animate or reassert control over five ghouls or two ghasts or wights. When you cast this spell using a 9th-level spell slot, you can animate or reassert control over six ghouls, three ghasts or wights, or two mummies.
    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(),
            statBlockRef4 = listOf(),
            statBlockRef5 = listOf(),
            statBlockRef6 = listOf(ghoul),
            statBlockRef7 = listOf(ghoul),
            statBlockRef8 = listOf(ghoul, ghast, wight),
            statBlockRef9 = listOf(ghoul, ghast, wight, mummy)
        ),
//        Spell(
//            spellName = "Contingency",
//level = 6,
//school = "Evocation",
//castingTime = "10 minutes",
        //ritual = "no",
        //concentration = "no",
//range = "Self",
//components = "V, S, M (a statuette of yourself carved from ivory and decorated with gems worth at least 1,500 gp)",
//duration = "10 days",
//source = "Player's Handbook (SRD)",
//description = """
//        Choose a spell of 5th level or lower that you can cast, that has a casting time of 1 action, and that can target you. You cast that spell—called the contingent spell—as part of casting contingency, expending spell slots for both, but the contingent spell doesn’t come into effect. Instead, it takes effect when a certain circumstance occurs. You describe that circumstance when you cast the two spells. For example, a contingency cast with water breathing might stipulate that water breathing comes into effect when you are engulfed in water or a similar liquid.
//
//        The contingent spell takes effect immediately after the circumstance is met for the first time, whether or not you want it to, and then contingency ends.
//
//        The contingent spell takes effect only on you, even if it can normally target others. You can use only one contingency spell at a time. If you cast this spell again, the effect of another contingency spell on you ends. Also, contingency ends on you if its material component is ever not on your person.
//    """.trimIndent(),
//statBlockRef1 = emptyList(),
//            statBlockRef2 = listOf(),
//            statBlockRef3 = listOf(),
//            statBlockRef4 = listOf(),
//            statBlockRef5 = listOf(),
//            statBlockRef6 = listOf(),
//            statBlockRef7 = listOf(),
//            statBlockRef8 = listOf(),
//            statBlockRef9 = listOf()
//),
        Spell(
            spellName = "Planar Ally",
            level = 6,
            school = "Conjuration",
            castingTime = "10 minutes",
            ritual = "no",
            concentration = "no",
            range = "60 feet",
            components = "V, S",
            duration = "Instantaneous",
            source = "Player's Handbook (SRD)",
            description = """
        You beseech an otherworldly entity for aid. The being must be known to you: a god, a primordial, a demon prince, or some other being of cosmic power. That entity sends a celestial, an elemental, or a fiend loyal to it to aid you, making the creature appear in an unoccupied space within range. If you know a specific creature’s name, you can speak that name when you cast this spell to request that creature, though you might get a different creature anyway (DM’s choice).

        When the creature appears, it is under no compulsion to behave in any particular way. You can ask the creature to perform a service in exchange for payment, but it isn’t obliged to do so. The requested task could range from simple (fly us across the chasm, or help us fight a battle) to complex (spy on our enemies, or protect us during our foray into the dungeon). You must be able to communicate with the creature to bargain for its services.

        Payment can take a variety of forms. A celestial might require a sizable donation of gold or magic items to an allied temple, while a fiend might demand a living sacrifice or a gift of treasure. Some creatures might exchange their service for a quest undertaken by you.

        As a rule of thumb, a task that can be measured in minutes requires a payment worth 100 gp per minute. A task measured in hours requires 1,000 gp per hour. And a task measured in days (up to 10 days) requires 10,000 gp per day. The DM can adjust these payments based on the circumstances under which you cast the spell. If the task is aligned with the creature’s ethos, the payment might be halved or even waived. Nonhazardous tasks typically require only half the suggested payment, while especially dangerous tasks might require a greater gift. Creatures rarely accept tasks that seem suicidal.

        After the creature completes the task, or when the agreed-upon duration of service expires, the creature returns to its home plane after reporting back to you, if appropriate to the task and if possible. If you are unable to agree on a price for the creature’s service, the creature immediately returns to its home plane.

        A creature enlisted to join your group counts as a member of it, receiving a full share of experience points awarded.

        Spell Lists: Cleric
    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(),
            statBlockRef4 = listOf(),
            statBlockRef5 = listOf(),
            statBlockRef6 = CelestialStatBlocks + ElementalStatBlocks + FiendStatBlocks,
            statBlockRef7 = listOf(),
            statBlockRef8 = listOf(),
            statBlockRef9 = listOf()
        ),

        Spell(
            spellName = "Conjure Celestial",
            level = 7,
            school = "Conjuration",
            castingTime = "1 minute",
            ritual = "no",
            concentration = "yes",
            range = "90 feet",
            components = "V, S",
            duration = "Concentration, up to 1 hour",
            source = "Player's Handbook (SRD)",
            description = """
        You summon a celestial of challenge rating 4 or lower, which appears in an unoccupied space that you can see within range. The celestial disappears when it drops to 0 hit points or when the spell ends.

        The celestial is friendly to you and your companions for the duration. Roll initiative for the celestial, which has its own turns. It obeys any verbal commands that you issue to it (no action required by you), as long as they don’t violate its alignment. If you don’t issue any commands to the celestial, it defends itself from hostile creatures but otherwise takes no actions. The DM has the celestial’s statistics.

        At Higher Levels. When you cast this spell using a 9th-level spell slot, you summon a celestial of challenge rating 5 or lower.

        Spell Lists: Cleric
    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(),
            statBlockRef4 = listOf(),
            statBlockRef5 = listOf(),
            statBlockRef6 = listOf(),
            statBlockRef7 = listOf(couatl, pegasus),
            statBlockRef8 = listOf(couatl, pegasus),
            statBlockRef9 = listOf(couatl, pegasus, unicorn)
        ),
        Spell(
            spellName = "Simulacrum",
            level = 7,
            school = "Illusion",
            castingTime = "12 hours",
            ritual = "no",
            concentration = "no",
            range = "Touch",
            components = "V, S, M (snow or ice in quantities sufficient to make a life-size copy of the duplicated creature; some hair, fingernail clippings, or other piece of that creature’s body placed inside the snow or ice; and powdered ruby worth 1,500 gp, sprinkled over the duplicate and consumed by the spell)",
            duration = "Until dispelled",
            source = "Player's Handbook (SRD)",
            description = """
        You shape an illusory duplicate of one beast or humanoid that is within range for the entire casting time of the spell. The duplicate is a creature, partially real and formed from ice or snow, and it can take actions and otherwise be affected as a normal creature. It appears to be the same as the original, but it has half the creature’s hit point maximum and is formed without any equipment. Otherwise, the illusion uses all the statistics of the creature it duplicates, except that it is a construct.

        The simulacrum is friendly to you and creatures you designate. It obeys your spoken commands, moving and acting in accordance with your wishes and acting on your turn in combat. The simulacrum lacks the ability to learn or become more powerful, so it never increases its level or other abilities, nor can it regain expended spell slots.

        If the simulacrum is damaged, you can repair it in an alchemical laboratory, using rare herbs and minerals worth 100 gp per hit point it regains. The simulacrum lasts until it drops to 0 hit points, at which point it reverts to snow and melts instantly.

        If you cast this spell again, any currently active duplicates you created with this spell are instantly destroyed.

        Spell Lists: Wizard
    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(),
            statBlockRef4 = listOf(),
            statBlockRef5 = listOf(),
            statBlockRef6 = listOf(),
            statBlockRef7 = BeastStatBlocks + HumanoidStatBlocks,
            statBlockRef8 = listOf(),
            statBlockRef9 = listOf()
        ),
        Spell(
            spellName = "Clone",
            level = 8,
            school = "Necromancy",
            castingTime = "1 hour",
            ritual = "no",
            concentration = "no",
            range = "Touch",
            components = "V, S, M (a diamond worth at least 1000 gp and at least 1 cubic inch of flesh of the creature that is to be cloned, which the spell consumes. A vessel worth at least 2000 gp that has a sealable lid and is large enough to hold the creature being cloned, such as a huge urn, coffin, mud-filled cyst in the ground, or crystal container filled with salt water)",
            duration = "Instantaneous",
            source = "Player's Handbook (SRD)",
            description = """
        This spell grows an inert duplicate of a living creature as a safeguard against death. This clone forms inside the vessel used in the spell's casting and grows to full size and maturity after 120 days; you can also choose to have the clone be a younger version of the same creature. It remains inert and endures indefinitely, as long as its vessel remains undisturbed.

        At any time after the clone matures, if the original creature dies, its soul transfers to the clone, provided that the soul is free and willing to return. The clone is physically identical to the original and has the same personality, memories, and abilities, but none of the original’s equipment. The original creature’s physical remains, if they still exist, become inert and can’t thereafter be restored to life, since the creature’s soul is elsewhere.

        Spell Lists: Wizard
    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(),
            statBlockRef4 = listOf(),
            statBlockRef5 = listOf(),
            statBlockRef6 = listOf(),
            statBlockRef7 = listOf(),
            statBlockRef8 = listOf(cloneStatblock),
            statBlockRef9 = listOf()
        ),
        Spell(
            spellName = "Dominate Monster",
            level = 8,
            school = "Enchantment",
            castingTime = "1 action",
            ritual = "no",
            concentration = "yes",
            range = "60 feet",
            components = "V, S",
            duration = "Concentration, up to 1 hour",

            source = "Player's Handbook (SRD)",
            description = """
        You attempt to beguile a creature that you can see within range. It must succeed on a Wisdom saving throw or be charmed by you for the duration. If you or creatures that are friendly to you are fighting it, it has advantage on the saving throw.

        While the creature is charmed, you have a telepathic link with it as long as the two of you are on the same plane of existence. You can use this telepathic link to issue commands to the creature while you are conscious (no action required), which it does its best to obey. You can specify a simple and general course of action, such as "Attack that creature," "Run over there," or "Fetch that object." If the creature completes the order and doesn’t receive further direction from you, it defends and preserves itself to the best of its ability.

        You can use your action to take total and precise control of the target. Until the end of your next turn, the creature takes only the actions you choose, and doesn’t do anything that you don’t allow it to do. During this time, you can also cause the creature to use a reaction, but this requires you to use your own reaction as well.

        Each time the target takes damage, it makes a new Wisdom saving throw against the spell. If the saving throw succeeds, the spell ends.

        At Higher Levels. When you cast this spell with a 9th-level spell slot, the duration is concentration, up to 8 hours.

        Spell Lists: Bard, Sorcerer, Warlock, Wizard
    """.trimIndent(),
            statBlockRef1 = listOf(),
            statBlockRef2 = listOf(),
            statBlockRef3 = listOf(),
            statBlockRef4 = listOf(),
            statBlockRef5 = listOf(),
            statBlockRef6 = listOf(),
            statBlockRef7 = listOf(),
            statBlockRef8 = AberrationStatBlocks + BeastStatBlocks + CelestialStatBlocks + ConstructStatBlocks + DragonStatBlocks
                    + ElementalStatBlocks + FeyStatBlocks + FiendStatBlocks + GiantStatBlocks + HumanoidStatBlocks
                    + MonstrosityStatBlocks + OozeStatBlocks + PlantStatBlocks + UndeadStatBlocks + UncategorizedStatBlocks,
            statBlockRef9 = listOf()
        ),
//        Spell(
//            spellName = "True Polymorph",
//level = 9,
//school = "Transmutation",
//castingTime = "1 action",
        // ritual = "no",
//            concentration = "yes",
//range = "30 feet",
//components = "V, S, M (a drop of mercury, a dollop of gum arabic, and a wisp of smoke)",
//duration = "Concentration, up to 1 hour",
//source = "Player's Handbook (SRD)",
//description = """
//        Choose one creature or nonmagical object that you can see within range. You transform the creature into a different creature, the creature into a nonmagical object, or the object into a creature (the object must be neither worn nor carried by another creature). The transformation lasts for the duration, or until the target drops to 0 hit points or dies. If you concentrate on this spell for the full duration, the transformation becomes permanent.
//
//        Shapechangers aren't affected by this spell. An unwilling creature can make a Wisdom saving throw, and if it succeeds, it isn't affected by this spell.
//
//        This spell can't affect a target that has 0 hit points.
//
//        Creature into Creature.
//        If you turn a creature into another kind of creature, the new form can be any kind you choose whose challenge rating is equal to or less than the target's (or its level, if the target doesn't have a challenge rating). The target's game statistics, including mental ability scores, are replaced by the statistics of the new form. It retains its alignment and personality.
//        The target assumes the hit points of its new form, and when it reverts to its normal form, the creature returns to the number of hit points it had before it transformed. If it reverts as a result of dropping to 0 hit points, any excess damage carries over to its normal form. As long as the excess damage doesn't reduce the creature's normal form to 0 hit points, it isn't knocked unconscious.
//        The creature is limited in the actions it can perform by the nature of its new form, and it can't speak, cast spells, or take any other action that requires hands or speech unless its new form is capable of such actions.
//        The target's gear melds into the new form. The creature can't activate, use, wield, or otherwise benefit from any of its equipment.
//
//        Object into Creature.
//        You can turn an object into any kind of creature, as long as the creature's size is no larger than the object's size and the creature's challenge rating is 9 or lower. The creature is friendly to you and your companions. It acts on each of your turns. You decide what action it takes and how it moves. The DM has the creature's statistics and resolves all of its actions and movement.
//        If the spell becomes permanent, you no longer control the creature. It might remain friendly to you, depending on how you have treated it.
//
//        Creature into Object.
//        If you turn a creature into an object, it transforms along with whatever it is wearing and carrying into that form, as long as the object's size is no larger than the creature's size. The creature's statistics become those of the object, and the creature has no memory of time spent in this form, after the spell ends and it returns to its normal form.
//
//        Spell Lists. Bard, Warlock, Wizard
//    """.trimIndent(),
//statBlockRef1 = listOf(),
//            statBlockRef2 = listOf(),
//            statBlockRef3 = listOf(),
//            statBlockRef4 = listOf(),
//            statBlockRef5 = listOf(),
//            statBlockRef6 = listOf(),
//            statBlockRef7 = listOf(),
//            statBlockRef8 = listOf(),
//            statBlockRef9 = listOf()
//)



    )//final parenthesis