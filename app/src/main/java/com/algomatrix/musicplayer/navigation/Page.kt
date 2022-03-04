package com.algomatrix.musicplayer.navigation

import androidx.annotation.DrawableRes
import com.algomatrix.musicplayer.navigation.Routes.HOME
import com.algomatrix.musicplayer.navigation.Routes.NOTIFICATIONS
import com.algomatrix.musicplayer.navigation.Routes.PROFILE
import com.algomatrix.musicplayer.navigation.Routes.SEARCH
import com.algomatrix.musicplayer.navigation.Routes.SETTINGS
import com.algomatrix.musicplayer.navigation.Routes.SPLASH
import com.algomatrix.musicplayer.navigation.Routes.fullScreenRoutes
import com.algomatrix.musicplayer.R
import com.algomatrix.musicplayer.navigation.Routes.ALBUM
import com.algomatrix.musicplayer.navigation.Routes.FAVORITE
import com.algomatrix.musicplayer.navigation.Routes.PLAYER

object Routes{
    const val SPLASH = "splash_page"
    /*
        BOTTOM BAR PAGES
    */
    const val HOME = "home_page"
    const val FAVORITE = "favorite_page"
    const val PROFILE = "profile_page"
    /*
     Full screen pages
    */
    const val ALBUM = "album_page"
    const val SETTINGS = "settings_page"
    const val NOTIFICATIONS = "notification_page"
    const val SEARCH = "search_page"

    const val PLAYER = "player_page"

    val fullScreenRoutes = listOf(
        SPLASH,
        ALBUM,
        SETTINGS,
        NOTIFICATIONS,
        SEARCH,
        PLAYER
    )
}

sealed class Page(
    val route : String,
    var tag: String = route,
    val title: String = "",
    @DrawableRes val icon: Int = 0
){
    object Splash: Page(route = SPLASH)

    object Home : Page(route = HOME, title = "Home", icon = R.drawable.ic_home_filled)
    object Favorite: Page(route = FAVORITE, title = "Favorite", icon = R.drawable.ic_home_filled)
    object Profile: Page(route = PROFILE, title = "Profile", icon = R.drawable.ic_home_filled)

    object Album : Page(route = ALBUM)
    object Settings: Page(route = SETTINGS)
    object Notification: Page(route = NOTIFICATIONS)
    object Search: Page(route = SEARCH)
    object Player: Page(route = PLAYER)

    companion object {
        fun isFullScreen(route: String?) : Boolean{
            return fullScreenRoutes.contains(route)
        }
    }
}