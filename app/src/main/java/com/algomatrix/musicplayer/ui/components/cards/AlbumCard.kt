package com.algomatrix.musicplayer.ui.components.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter

@Composable
fun AlbumCard(
){
    Column {
        Card(
            shape = RoundedCornerShape(15.dp),
            elevation = 5.dp,
            backgroundColor = Color.Yellow
        ) {
            Image(
                painter = rememberImagePainter("https://picsum.photos/200/300"),
                contentDescription = null,
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Crop
            )
        }
        SongDetails()
    }
}

@Composable
fun SongDetails(){
    Box(
        modifier = Modifier.width(100.dp)
    ){
        Column() {
            Text(
                text = "Frontier(Extended version)",
                maxLines = 1,
            )
            Text(text = "VINAI")
        }
    }
}

@Preview
@Composable
fun preview(){
    AlbumCard()
}