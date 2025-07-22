
//import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.octopus
//import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.owl
//import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.poisonousSnake
//import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.quipper
//import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.rat
//import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.raven
//import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.seaHorse
//import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.spider
//import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.weasel
import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import com.example.wildshapesmountsandfamiliars.ui.screens.FavoriteManager
import com.example.wildshapesmountsandfamiliars.ui.screens.FavoriteToggleButton
import com.example.wildshapesmountsandfamiliars.ui.screens.MenagerieAddButton
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlock
import com.example.wildshapesmountsandfamiliars.ui.screens.StatBlockView
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.bat
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.cat
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.frog
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.hawk
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.lizard
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.octopus
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.owl
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.poisonousSnake
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.quipper
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.rat
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.raven
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.seaHorse
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.spider
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.weasel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Familiars(
    familiars: List<StatBlock>,
    onNavigateHome: () -> Unit,
    onNavigateToSpecialFamiliars: () -> Unit,
    onNavigateToFavorites: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToStatblockMenu: () -> Unit,
) {
    var selectedFamiliar by remember { mutableStateOf<StatBlock?>(null) }
    val snackbarHostState = remember { SnackbarHostState() }
    val coroutineScope = rememberCoroutineScope()
    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        content = { innerPadding ->
            Column() {
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
                Text("Familiars", style = MaterialTheme.typography.headlineMedium)

                Spacer(Modifier.height(16.dp))

                if (selectedFamiliar == null) {
                    LazyColumn(modifier = Modifier.weight(1f)) {
                        items(familiars) { familiar ->
                            Text(
                                text = familiar.name.toString(),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable { selectedFamiliar = familiar }
                                    .padding(16.dp)
                            )
                        }
                    }
                    Spacer(Modifier.height(16.dp))
                    Button(onClick = onNavigateToSpecialFamiliars) {
                        Text("Special Familiars")
                    }
                } else {
                    val context = LocalContext.current
                    val isFavorite = remember(selectedFamiliar) {
                        mutableStateOf(FavoriteManager.contains(selectedFamiliar!!))
                    }

                    Column(
                        Modifier
                            .weight(1f)
                            .verticalScroll(rememberScrollState())
                    ) {
                        StatBlockView(selectedFamiliar!!)
                        Spacer(Modifier.height(16.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            FavoriteToggleButton(
                                selectedStatBlock = selectedFamiliar!!,
                                coroutineScope = coroutineScope,
                                snackbarHostState = snackbarHostState
                            )
                            MenagerieAddButton(
                                statBlock = selectedFamiliar!!,
                                snackbarHostState = snackbarHostState
                            )
                        }
                    }
                }
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    if (selectedFamiliar != null) {
                        Button(
                            modifier = Modifier.weight(1f),
                            onClick = { selectedFamiliar = null }
                        ) {
                            Text("Back to Familiars List")
                        }
                    }
                }
            }
        }
    )
}

val familiars: List<StatBlock>
    get() = listOf(
        bat,
        cat,
        frog,
        hawk,
        lizard,
        octopus,
        owl,
        poisonousSnake,
        quipper,
        rat,
        raven,
        seaHorse,
        spider,
        weasel
    )