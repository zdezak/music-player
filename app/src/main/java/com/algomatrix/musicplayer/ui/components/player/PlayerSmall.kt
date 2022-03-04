package com.algomatrix.musicplayer.ui.components.player

import androidx.compose.foundation.layout.*
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.algomatrix.musicplayer.tools.Ext.color
import com.algomatrix.musicplayer.tools.Ext.round
import com.algomatrix.musicplayer.ui.components.buttons.IconBtn
import com.algomatrix.musicplayer.ui.theme.Primary30

@Composable
fun PlayerSmall(modifier: Modifier = Modifier) {

    Box(modifier.fillMaxWidth().round(8.dp).color(Color.DarkGray)) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(start = 6.dp),
            verticalAlignment = Alignment.CenterVertically) {
//            ImageCrop(modifier = Modifier.size( 40.dp).round(5.dp), data = R.drawable.album)
            Column(Modifier.weight(4f).padding(horizontal = 8.dp)) {
                Text(text = "text", color = Color.White)
                Text(text = "text",color= Color.Gray, fontWeight = FontWeight.Light)
            }
//            IconBtn(resIcon = R.)
//            IconBtn(resIcon = R.drawable.ic_h_outline)
//            IconBtn(resIcon = R.drawable.ic_baseline_play_arrow_24)
        }
        LinearProgressIndicator(
            modifier = Modifier.align(Alignment.BottomCenter).fillMaxWidth().height(2.dp).padding(horizontal = 8.dp),
            progress = 0.8f,
            color = Color.White,
            backgroundColor = Primary30
        )
    }
}
