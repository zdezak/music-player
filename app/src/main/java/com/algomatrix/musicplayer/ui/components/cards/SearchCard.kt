package com.algomatrix.musicplayer.ui.components.cards


import android.util.Log
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.algomatrix.musicplayer.navigation.Page
import com.algomatrix.musicplayer.navigation.Router
import com.algomatrix.musicplayer.navigation.RouterImpl
import com.algomatrix.musicplayer.ui.theme.Active
import com.algomatrix.musicplayer.ui.theme.Teal200


@Composable
fun SearchBarCard(
    modifier: Modifier = Modifier,
    router: Router? = null
){
    Box(
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .height(40.dp)
            .background(
                brush = Brush.horizontalGradient(listOf(Active, Teal200)),
                shape = RoundedCornerShape(60.dp)
            )
            .clickable {
                Log.d("search card", "navigate to some other page")
                router?.openSearchPage()
            },

        contentAlignment = Alignment.Center
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ){
            Icon(imageVector = Icons.Default.Search, contentDescription = "Search Icon")
            Text(text = "Search for music")
        }

    }
}

@Preview
@Composable
fun SearchBarCardPreview(){
//    SearchBarCard()
}