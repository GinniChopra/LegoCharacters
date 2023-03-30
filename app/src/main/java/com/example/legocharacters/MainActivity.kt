package com.example.legocharacters

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.legocharacters.data.DataSource
import com.example.legocharacters.model.LegoCharacter
import com.example.legocharacters.ui.theme.LegoCharactersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LegoCharactersTheme {
                // A surface container using the 'background' color from the theme
                CharacterList(characterList = DataSource().loadLegoCharacters())
            }
        }
    }
}

@Composable
fun CharacterCard(character: LegoCharacter, modifier: Modifier = Modifier) {
    Card(modifier = modifier.padding(8.dp), elevation = 4.dp) {
        Column {
            Image(
                painter = painterResource(character.imageResourceId),
                contentDescription = stringResource(character.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )

            Text(
                text = stringResource(character.stringResourceId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.h6
            )
        }

    }
}

@Composable
private fun CharacterList(characterList: List<LegoCharacter>, modifier: Modifier = Modifier) {
    LazyColumn {
        items(characterList){
                character ->
            CharacterCard(character)
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview
@Composable
private fun CharacterCardPreview() {
    CharacterCard(LegoCharacter(R.string.character1, R.drawable.image1))
}