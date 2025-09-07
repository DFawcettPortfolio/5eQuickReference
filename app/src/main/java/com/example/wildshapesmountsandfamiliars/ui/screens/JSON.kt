package com.example.wildshapesmountsandfamiliars.ui.screens

import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.serialization.json.Json

fun loadJSONFromAssets(context: Context, filename: String): String {
    return context.assets.open(filename).bufferedReader().use { it.readText() }
}

fun loadCreatures(context: Context): List<StatBlock> {
    val json = loadJSONFromAssets(context, "jsonFiles/SRD_creatures.json")
    val creatures: List<StatBlock> = Json { ignoreUnknownKeys = true }.decodeFromString(json)

    // Group creatures by name
    val nameGroups = creatures.groupBy { it.name?.trim() ?: "Unknown" }

    // Create a map for name formatting
    val formattedNames = mutableMapOf<StatBlock, String>()

    nameGroups.forEach { (_, group) ->
        if (group.size > 1) {
            // For duplicates, include source
            group.forEach { creature ->
                val name = creature.name ?: "Unknown"
                val source = creature.source ?: "Unknown"
                formattedNames[creature] = "$name [$source]"
            }
        } else {
            // For unique names, just use the name
            val creature = group.first()
            formattedNames[creature] = creature.name ?: "Unknown"
        }
    }

    // Attach formatted names back to creatures
    return creatures.map { creature ->
        creature.copy(name = formattedNames[creature])
    }
}






@Composable
fun CreatureListScreen(context: Context, onNavigateToHome: () -> Unit) {
    val allCreatures = remember { loadCreatures(context) }
    var searchQuery by remember { mutableStateOf("") }

    val filteredCreatures = remember(searchQuery, allCreatures) {
        if (searchQuery.isBlank()) {
            allCreatures
        } else {
            allCreatures.filter {
                it.name?.contains(searchQuery, ignoreCase = true) == true
            }
        }
    }

    Scaffold {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(it)
        ) {
            // Search Field
            TextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                placeholder = { Text("Search Creatures...") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
            )

            LazyColumn {
                items(filteredCreatures) { creature ->
                    CreatureCard(creature)
                }
            }
        }
    }
}




@Composable
fun CreatureCard(creature: StatBlock) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 4.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp) // This is stable
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(text = creature.name ?: "Unknown", style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = "CR: ${creature.challengeRating ?: "?"}")
            Text(text = "Type: ${creature.type ?: "Unknown"}")
            Text(text = "AC: ${creature.armorClass ?: "-"} | HP: ${creature.hitPoints ?: "-"}")
        }
    }
}

fun loadCreatureMap(context: Context): Map<String, StatBlock> {
    val creatures = loadCreatures(context)
    return creatures.associateBy { it.name?.substringBefore(" [")?.trim() ?: "" }
}
