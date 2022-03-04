package com.algomatrix.musicplayer.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.algomatrix.musicplayer.mockdata.listofSongs
import com.algomatrix.musicplayer.ui.pages.*


@Composable
fun NavigationContainer(
    router: Router,
    navController: NavHostController,
    paddingValues: PaddingValues
){
    val startDestination = remember { mutableStateOf(Page.Splash.route) }
    LaunchedEffect(startDestination){
        if(startDestination.value == Page.Home.route){
            router.openHome() 
        }
    }
    NavHost(
        navController = navController,
        startDestination = startDestination.value
    ){
        composable(Page.Splash.route){
            SplashPage(
                goBack = {
                    startDestination.value = Page.Home.route
                }
            )
        }
        /*
             Bottom Navigation Bar
        */
        composable(Page.Home.route){
            HomePage()
        }
        composable(Page.Favorite.route){
            FavoritePage()
        }
        composable(Page.Profile.route){
            ProfilePage()
        }
        /*
        =============================================
        */
        composable(Page.Album.route){
            AlbumPage()
        }
        composable(Page.Settings.route){
            SettingsPage()
        }
        composable(Page.Notification.route){
            NotificationPage()
        }
        composable(Page.Player.route){
            PlayerPage(listofSongs[0])
        }
        composable(Page.Search.route){
            SearchPage()

        }
    }
}