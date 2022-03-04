package com.algomatrix.musicplayer.ui.components.cards

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.algomatrix.musicplayer.mockdata.listofSongs
import com.algomatrix.musicplayer.models.Song

@Composable
fun FavoriteCard(song: Song){
    Row(
        modifier = Modifier
            .fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Row() {
            ThumbnailCard()
            Column (
                modifier = Modifier
                    .padding(10.dp)
            ){
                Text(text = song.title)
                Text(text = song.authorName)
            }
        }
        IconButton(
            onClick = {}
        ) {
            Icon(
                imageVector = Icons.Filled.Favorite,
                contentDescription = "Favorite Icon",
                tint = Color.Red
            )
        }
    }
}



@Preview
@Composable
fun FavoriteCardPreview(){
    FavoriteCard(listofSongs[0])
}