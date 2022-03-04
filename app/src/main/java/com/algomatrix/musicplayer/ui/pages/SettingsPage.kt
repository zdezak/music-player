package com.algomatrix.musicplayer.ui.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SettingsPage(){
    Box(modifier = Modifier.fillMaxSize()){
        Column() {
            Text(text = "This si the settings page")
            Text(text = "This page has bottom nav")
        }
    }
}

@Preview
@Composable
fun SettingsPagePreview(){
    SettingsPage()
}