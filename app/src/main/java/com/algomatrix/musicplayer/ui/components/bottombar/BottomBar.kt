package com.algomatrix.musicplayer.ui.components.bottombar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavBar(
    val route: String,
    val title: String,
    val icon: ImageVector
){
    object Home: BottomNavBar(
        route = "home_page",
        title = "Home",
        icon = Icons.Default.Home
    )
    object Favorite: BottomNavBar(
        route = "search_page",
        title = "Favorite",
        icon = Icons.Default.Favorite
    )
    object Library: BottomNavBar(
        route = "library_page",
        title = "Library",
        icon = Icons.Default.History
    )
    object Profile: BottomNavBar(
        route = "profile_page",
        title = "Profile",
        icon = Icons.Default.Person
    )
}
