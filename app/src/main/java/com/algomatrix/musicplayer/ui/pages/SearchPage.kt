package com.algomatrix.musicplayer.ui.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SearchPage(){
    Box(modifier = Modifier
        .fillMaxSize()
    ){
        Text(text = "This is the long awaited search page")
    }
}


@Preview
@Composable
fun SearchPagePreview(){
    SearchPage()
}