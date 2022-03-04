package com.algomatrix.musicplayer.ui.pages

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.algomatrix.musicplayer.R
import com.algomatrix.musicplayer.ui.theme.Active
import kotlinx.coroutines.delay

@Composable
fun SplashPage(goBack: () -> Unit = {}){
    BackHandler {
        goBack()
    }
    LaunchedEffect(true){
        delay(1500)
        goBack()
    }
    Box(modifier = Modifier.fillMaxSize()){
        Icon(
            modifier = Modifier.align(Alignment.Center),
            painter = painterResource(id = R.drawable.ic_home_filled),
            contentDescription = "Splash Page Icon",
            tint = Active
        )
    }
}

@Preview
@Composable
fun SplashPagePreview(){
    SplashPage()
}