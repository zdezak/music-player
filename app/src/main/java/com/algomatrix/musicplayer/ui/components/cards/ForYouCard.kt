package com.algomatrix.musicplayer.ui.components.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.algomatrix.musicplayer.mockdata.listofSongs
import com.algomatrix.musicplayer.models.Song


@Composable
fun ForYouCard(song : Song){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = rememberImagePainter("https://picsum.photos/200/300"),
                contentDescription = "Profile Picture",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(30.dp)
                    .clip(CircleShape)
            )
            Column(
                horizontalAlignment = Alignment.Start
            ) {
                Text(text = song.title)
                Text(text = song.authorName)
            }
        }
        Icon(imageVector = Icons.Default.Favorite, contentDescription = "Favorite Icon")
    }
}

@Preview
@Composable
fun ForYouCardPreview(){
    ForYouCard(listofSongs[0])
}