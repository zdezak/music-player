package com.algomatrix.musicplayer.ui.pages

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.algomatrix.musicplayer.mockdata.listofSongs
import com.algomatrix.musicplayer.models.Song
import com.algomatrix.musicplayer.tools.Ext
import com.algomatrix.musicplayer.tools.Ext.gradient

const val Default_Description = "This is the default description"

@Composable
fun PlayerPage(song: Song){
    val scrollState = rememberScrollState()
    val sliderPosition = remember { mutableStateOf(0f)}

    Box(
        Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .gradient(
                listOf(
                    Color.LightGray, Color.Cyan
                ),
                Ext.GradientType.VERTICAL
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                IconButton(onClick = {}, modifier = Modifier.padding(10.dp)) {
                    Icon(
                        imageVector = Icons.Default.ArrowBackIos,
                        contentDescription = "Back Arrow",
                        tint = Color.Black
                    )
                }
                Text(text = song.title, style = MaterialTheme.typography.h6)
                IconButton(onClick = {}, modifier = Modifier.padding(10.dp)) {
                    Icon(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = "Back Arrow",
                        tint = Color.Black
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PlayerPagePreview(){
    PlayerPage(listofSongs[0])
}