package com.example.wildshapesmountsandfamiliars.ui.screens

import android.annotation.SuppressLint
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
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
    onNavigateToSearchResults:() -> Unit,
    onNavigateToNotekeeping: () -> Unit,
) {
    BackHandler(enabled = true) {
        // Custom behavior here
            onNavigateToRulesQuickGuide()

    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Top Navigation Row
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            val iconModifier = Modifier.size(32.dp)
//            Icon(
//                painter = painterResource(id = R.drawable.arrow_back_icon_menu),
//                contentDescription = "Back One Step",
//                modifier = iconModifier.clickable {
//                    if (DisplayRepo.currentDisplayItems.firstOrNull() is DisplayItem.PlanarLegacy) {
//                        onNavigateToPlanarLegacyList()
//                    }
//                    if (DisplayRepo.currentDisplayItems.firstOrNull() is DisplayItem.PrimevalBrand) {
//                        onNavigateToPrimevalBrandedDetail()
//                    }
//                    else {
//                        onNavigateToRulesQuickGuide()
//                    }
//                },
//                tint = Color.White
//            )

            Icon(painterResource(id = R.drawable.home_icon_menu),
                contentDescription = "Home",
                modifier = iconModifier.clickable { onNavigateHome() },
                tint = Color.White)
            Icon(painterResource(id = R.drawable.rules_icon_menu),
                contentDescription = "Rules",
                modifier = iconModifier.clickable { onNavigateToRulesQuickGuide() },
                tint = Color.White)
            Icon(
                painter = painterResource(id = R.drawable.search_icon),
                contentDescription = "Search",
                modifier = Modifier
                    .size(32.dp)
                    .clickable { onNavigateToSearchResults() },
                tint = Color.White
            )
            Icon(painterResource(id = R.drawable.favorites_icon_menu),
                contentDescription = "Favorites",
                modifier = iconModifier.clickable { onNavigateToFavorites() },
                tint = Color.White)
            Icon(painterResource(id = R.drawable.menagerie_icon_menu),
                contentDescription = "Menagerie",
                modifier = iconModifier.clickable { onNavigateToMenagerie() },
                tint = Color.White)
            Icon(painterResource(id = R.drawable.inventory_icon_menu),
                contentDescription = "Inventory",
                modifier = iconModifier.clickable { onNavigateToInventory() },
                tint = Color.White)
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

        when {


            // ✅ Single Rule
            items.size == 1 && items.first() is DisplayItem.Rule -> {
                val rule = (items.first() as DisplayItem.Rule)
                Column(
                    Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                        .padding(16.dp)
                ) {
                    Text(rule.title, style = MaterialTheme.typography.headlineSmall)
                    Spacer(Modifier.height(12.dp))
                    Text(rule.content)
                }
            }

            // ✅ Multiple Items Fallback
            else -> {
                LazyColumn {
                    items(items) { item ->
                        when (item) {
                            is DisplayItem.Rule -> {
                                Text(
                                    item.title,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(8.dp)
                                )
                            }
                        }
                    }
                }
            }
        }

    }
}

sealed class DisplayItem {
    data class Rule(val title: String, val content: String) : DisplayItem()
}



object DisplayRepo {
    var currentDisplayItems: List<DisplayItem> = emptyList()
    var currentTitle: String = "Display"
}



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CreatureTypeScreen(
    title: String,
    statBlocks: List<StatBlock>,
    spellEffectOrSummons: List<StatBlock>,
    onNavigateHome: () -> Unit,
    onNavigateToCustom: () -> Unit,
    onNavigateToFavorites: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit,
    onNavigateToStatblocksByType: () -> Unit,
    onNavigateToSearchResults: () -> Unit,
    onNavigateToNotekeeping: () -> Unit,
) {
    var selectedStatBlock by remember { mutableStateOf<StatBlock?>(null) }
    var showCreateDialog by remember { mutableStateOf(false) }
    var editingBlock by remember { mutableStateOf<StatBlock?>(null) }

    var minCR by remember { mutableStateOf("") }
    var maxCR by remember { mutableStateOf("") }
    var minExpanded by remember { mutableStateOf(false) }
    var maxExpanded by remember { mutableStateOf(false) }

    val crOptions = listOf("") + (0..30).map { it.toString() }


    val specialOptions = listOf(
        "", "amphibious", "blindsight", "burrow speed", "cc - blinded", "cc - charmed",
        "cc - deafened", "cc - frightened", "cc - grappled", "cc - incapacitated",
        "cc - paralyzed", "cc - petrified", "cc - poisoned", "cc - possessed",
        "cc - prone", "cc - restrained", "cc - stunned", "cc - unconscious", "cc - exhausted",
        "climb speed", "condition resistance", "condition immunity", "damage resistance", "damage immunity",
        "darkvision", "flyby", "fly speed", "hold breath", "hover", "incorporeal movement", "keen hearing", "keen sight",
        "keen smell", "legendary action", "legendary resistance", "magic resistance", "multiattack",
        "pack tactics", "regeneration", "swarm", "swim speed", "telepathic", "teleportation", "tremorsense", "truesight",
        "water breathing"
    )
    var specialFilter by remember { mutableStateOf("") }
    var specialExpanded by remember { mutableStateOf(false) }

    val snackbarHostState = remember { SnackbarHostState() }
    val coroutineScope = rememberCoroutineScope()

    val context = LocalContext.current

    val min = if (minCR.isBlank()) null else crToDecimal(minCR)
    val max = if (maxCR.isBlank()) null else crToDecimal(maxCR)

    fun StatBlock.matchesFilter(): Boolean {
        val cr = crToDecimal(this.challengeRating.toString())
        val matchesCR = (min == null || cr >= min) && (max == null || cr <= max)
        val matchesSpecial = if (specialFilter.isEmpty()) true
        else tags?.split(",")?.map { it.trim().lowercase() }?.contains(specialFilter.lowercase()) == true
        return matchesCR && matchesSpecial
    }

    val creatureList = statBlocks.filter { it.matchesFilter() }.sortedBy { it.name }
    val summonList = spellEffectOrSummons.filter { it.matchesFilter() }.sortedBy { it.name }

    val filteredItems: List<StatBlockListItem> = buildList {
        add(StatBlockListItem.Header(""))
        addAll(creatureList.map { StatBlockListItem.Block(it) })
        if (title == "Familiars") {
            add(StatBlockListItem.Header("Special Familiars (Pact of the Chain Warlock)"))
            addAll(summonList.map { StatBlockListItem.Block(it) })
        } else {
            add(StatBlockListItem.Header("Spell effects and Summons"))
            addAll(summonList.map { StatBlockListItem.Block(it) })
        }
    }

    BackHandler(enabled = true) {
        // Custom behavior here
        val block = selectedStatBlock
        if (block == null) {
            onNavigateToStatblocksByType()
        } else {
            selectedStatBlock = null
        }
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
            bottomBar = {
                if (selectedStatBlock != null) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
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
                }
            }
        ) { paddingVals ->
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(top = 16.dp, start = 16.dp, end = 16.dp) // fixed padding for top & sides
                    .padding(bottom = paddingVals.calculateBottomPadding()) // dynamic bottom padding
            )
            { Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly // evenly space the buttons
            ) {
//                Icon(
//                    painter = painterResource(id = R.drawable.arrow_back_icon_menu),
//                    contentDescription = "Back One Step",
//                    modifier = Modifier
//                        .size(32.dp)
//                        .clickable {
//                            val block = selectedStatBlock
//                            if (block == null) {
//                                onNavigateToStatblocksByType()
//                            } else {
//                                selectedStatBlock = null
//                            }
//                        },
//                    tint = Color.White
//                )
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
                Text(title, style = MaterialTheme.typography.headlineSmall)
                Spacer(Modifier.height(8.dp))

                if (selectedStatBlock == null) {
                    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Box(modifier = Modifier.weight(1f)) {
                            OutlinedButton(onClick = { minExpanded = true }, modifier = Modifier.fillMaxWidth()) {
                                Text(if (minCR.isEmpty()) "Min CR" else minCR)
                            }
                            DropdownMenu(expanded = minExpanded, onDismissRequest = { minExpanded = false }) {
                                crOptions.forEach {
                                    DropdownMenuItem(
                                        text = { Text(if (it.isEmpty()) "None" else it) },
                                        onClick = {
                                            minCR = it
                                            minExpanded = false
                                        }
                                    )
                                }
                            }
                        }
                        Box(modifier = Modifier.weight(1f)) {
                            OutlinedButton(onClick = { maxExpanded = true }, modifier = Modifier.fillMaxWidth()) {
                                Text(if (maxCR.isEmpty()) "Max CR" else maxCR)
                            }
                            DropdownMenu(expanded = maxExpanded, onDismissRequest = { maxExpanded = false }) {
                                crOptions.forEach {
                                    DropdownMenuItem(
                                        text = { Text(if (it.isEmpty()) "None" else it) },
                                        onClick = {
                                            maxCR = it
                                            maxExpanded = false
                                        }
                                    )
                                }
                            }
                        }
                    }

                    Spacer(Modifier.height(8.dp))

                    Box(modifier = Modifier.fillMaxWidth()) {
                        OutlinedButton(onClick = { specialExpanded = true }, modifier = Modifier.fillMaxWidth()) {
                            Text(if (specialFilter.isEmpty()) "Filter by Tag" else specialFilter)
                        }
                        DropdownMenu(expanded = specialExpanded, onDismissRequest = { specialExpanded = false }) {
                            specialOptions.forEach {
                                DropdownMenuItem(
                                    text = { Text(if (it.isEmpty()) "None" else it) },
                                    onClick = {
                                        specialFilter = it
                                        specialExpanded = false
                                    }
                                )
                            }
                        }
                    }

                    Spacer(Modifier.height(16.dp))

                    if (filteredItems.isEmpty()) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                                .padding(16.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("Nothing here yet", style = MaterialTheme.typography.bodyLarge)
                        }
                    } else {
                        LazyColumn(modifier = Modifier.weight(1f)) {
                            items(filteredItems, key = {
                                when (it) {
                                    is StatBlockListItem.Block -> it.statBlock.name ?: it.statBlock.hashCode().toString()
                                    is StatBlockListItem.Header -> it.title
                                }
                            }) { item ->
                                when (item) {
                                    is StatBlockListItem.Block -> {
                                        Text(
                                            text = item.statBlock.name ?: "Unnamed",
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clickable { selectedStatBlock = item.statBlock }
                                                .padding(bottom = 32.dp)
                                        )
                                    }
                                    is StatBlockListItem.Header -> {
                                        if (item.title.isEmpty()) {
                                            Spacer(modifier = Modifier.height(0.dp))
                                        } else {
                                            Text(
                                                text = item.title,
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(vertical = 8.dp),
                                                style = MaterialTheme.typography.titleLarge
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    Column(
                        Modifier
                            .weight(1f)
                            .verticalScroll(rememberScrollState())
                    ) {
                        StatBlockView(
                            statBlock = selectedStatBlock!!
                        )

                    }
                }

                Spacer(Modifier.height(8.dp))


            }
        }
    }

}

@Composable
fun OutlinedText(
    text: String,
    color: Color,
    outlineColor: Color = Color.Black,
    outlineWidth: Dp = 1.dp,
    style: TextStyle = LocalTextStyle.current,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Text(
            text = text,
            color = outlineColor,
            style = style,
            modifier = Modifier.offset(x = -outlineWidth, y = -outlineWidth)
        )
        Text(
            text = text,
            color = outlineColor,
            style = style,
            modifier = Modifier.offset(x = outlineWidth, y = -outlineWidth)
        )
        Text(
            text = text,
            color = outlineColor,
            style = style,
            modifier = Modifier.offset(x = outlineWidth, y = outlineWidth)
        )
        Text(
            text = text,
            color = outlineColor,
            style = style,
            modifier = Modifier.offset(x = -outlineWidth, y = outlineWidth)
        )
        Text(text = text, color = color, style = style)
    }
}

