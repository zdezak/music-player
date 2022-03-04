package com.algomatrix.musicplayer.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

interface Router {
    fun openHome()

    fun openAlbumPage()
    fun openNotification()
    fun openSettings()
    fun openPlayer()
    fun openSearchPage()



//    fun <T : Any> getArgs(tag:String): T?
}