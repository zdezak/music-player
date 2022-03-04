package com.algomatrix.musicplayer.ui.components.utility

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun PageName(pageName:String){
    Text(
        text = pageName,
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp,
        modifier = Modifier.clickable {}
    )
}