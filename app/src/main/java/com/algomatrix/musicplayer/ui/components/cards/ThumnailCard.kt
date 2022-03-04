package com.algomatrix.musicplayer.ui.components.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter

@Composable
fun ThumbnailCard(
){
    Card(

        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp,
        backgroundColor = Color.Yellow
    ) {
        Image(
            painter = rememberImagePainter("https://picsum.photos/200/300"),
            contentDescription = null,
            modifier = Modifier.size(60.dp),
            contentScale = ContentScale.Crop
        )
    }
}

