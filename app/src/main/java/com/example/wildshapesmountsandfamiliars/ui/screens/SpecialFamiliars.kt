
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
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.imp
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.pseudodragon
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.quasit
import com.example.wildshapesmountsandfamiliars.ui.screens.creatureType.sprite

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SpecialFamiliars(
    specialFamiliars: List<StatBlock>,
    onNavigateHome: () -> Unit,
    onNavigateToFamiliars: () -> Unit,
    onNavigateToFavorites: () -> Unit,
    onNavigateToRulesQuickGuide: () -> Unit,
    onNavigateToMenagerie: () -> Unit,
    onNavigateToInventory: () -> Unit,
    onNavigateToStatblockMenu: () -> Unit
) {
    var selectedFamiliar by remember { mutableStateOf<StatBlock?>(null) }
    val snackbarHostState = remember { SnackbarHostState() }
    val coroutineScope = rememberCoroutineScope()
    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        content = {
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
                Text("Special Familiars", style = MaterialTheme.typography.headlineMedium)

                Spacer(Modifier.height(16.dp))

                if (selectedFamiliar == null) {
                    LazyColumn(modifier = Modifier.weight(1f)) {
                        items(specialFamiliars) { familiar ->
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

                    Button(onClick = onNavigateToFamiliars) {
                        Text("Standard Familiars")
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

val specialFamiliars: List<StatBlock>
    get() = listOf(imp, pseudodragon, quasit, sprite)