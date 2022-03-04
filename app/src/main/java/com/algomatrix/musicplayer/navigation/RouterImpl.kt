package com.algomatrix.musicplayer.navigation

import android.content.Context
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.algomatrix.musicplayer.navigation.Routes.HOME

class RouterImpl (
    private val navHostController: NavHostController,
    private val startDestination: String = HOME
) : Router {
    override fun openHome() {
        navigate(Page.Home, removeFromHistory = true, singleTop = true)
    }

    override fun openAlbumPage(){
        navigate(Page.Album)
    }

    override fun openSettings() {
        print("Navigating to settings page")
        navigate(Page.Settings)
    }

    override fun openNotification() {
        navigate(Page.Notification)
    }

    override fun openPlayer() {
        navigate(Page.Player)
    }

    override fun openSearchPage(){
        print("navigating to search page")
        navigate((Page.Search))
    }

    private fun navigate(
        page : Page,
        removeFromHistory : Boolean = false,
        singleTop: Boolean = false
    ){
        navHostController.apply {
            navigate(page.route){
                if(removeFromHistory){
                    if(singleTop){
                        popUpTo(Page.Home.route)
                    }else{
                        popUpTo(0){
                            saveState = false
                        }
                    }
                } else{
                    restoreState = true
                }
                launchSingleTop = singleTop
            }
        }
    }

    private fun checkArgsAndNavigate(it: Any?, page: Page): () -> Unit = {
        it?.let {
            /*
            * Implement putting arguments
            * */
        }
        navigate(page)
    }



//    override fun <T : Any> getArgs(tag:String):T? {
//        return try{
//            navHostController.previousBackStackEntry?.arguments?.get(tag) as T?
//        }catch (ex: Exception){
//            null
//        }
//    }
}