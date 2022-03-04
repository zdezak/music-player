package com.algomatrix.musicplayer.ui.pages

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.algomatrix.musicplayer.navigation.*
import com.algomatrix.musicplayer.tools.Ext
import com.algomatrix.musicplayer.tools.Ext.gradient
import com.algomatrix.musicplayer.ui.components.player.PlayerSmall

@Composable
fun MainPage(finish: () -> Unit){
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val route = navBackStackEntry?.destination?.route ?: Page.Splash.route
    val router : Router = remember {RouterImpl(navController, route)}
    val isFullScreen = Page.isFullScreen(route)
    
    if(route == Page.Home.route){
        BackHandler {
            finish()
        }
    }
    Scaffold(
        bottomBar = {
            if(!isFullScreen){
                Column(
                    modifier = Modifier
                        .gradient(
                            listOf(Color.Transparent, Color.Black),
                            Ext.GradientType.VERTICAL
                        )
                        .padding(top = 20.dp)
                ) {
                    PlayerSmall(
                        modifier =  Modifier.clickable {
                            router.openPlayer()
                        }
                    )
                    NavigationBar(route = route){
                        targetRoute ->
                        navController.apply {
                            navigate(targetRoute){
                                restoreState = true
                                launchSingleTop = true
                                graph.startDestinationRoute?.let {
                                    route ->
                                    popUpTo(route = route){
                                        saveState = true
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    ) {
        NavigationContainer(navController = navController, paddingValues = it, router = router)
    }
}