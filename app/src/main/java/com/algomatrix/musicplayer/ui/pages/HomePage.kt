package com.algomatrix.musicplayer.ui.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.algomatrix.musicplayer.mockdata.listofSongs
import com.algomatrix.musicplayer.navigation.Router
import com.algomatrix.musicplayer.tools.Ext.clickableResize
import com.algomatrix.musicplayer.ui.components.cards.AlbumCard
import com.algomatrix.musicplayer.ui.components.cards.ForYouCard
import com.algomatrix.musicplayer.ui.components.cards.ProfileCard
import com.algomatrix.musicplayer.ui.components.cards.SearchBarCard
import com.algomatrix.musicplayer.ui.theme.Purple500
import com.algomatrix.musicplayer.ui.theme.Purple700
import com.algomatrix.musicplayer.ui.theme.Sizes
import com.algomatrix.musicplayer.ui.theme.Teal200


@Composable
fun TopBar(router: Router){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        SearchBarCard(router = router)
        ProfileCard()
    }
}

@Composable
fun AlbumContainer(){
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ){
            Text(
                text = "Albums for you",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "View All",
                fontSize = 15.sp,
                modifier = Modifier.clickable {}
            )
        }
        LazyRow(
            state = rememberLazyListState(),
            modifier =
            Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
        ){
            items(5){
                index ->
               Box(
                   modifier = Modifier.padding(5.dp)
               ) {
                   AlbumCard()
               }
            }
        }
    }
}

@Composable
fun ForYouContainer(){
    Column(
        modifier = Modifier.padding(top = 20.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ){
            Text(
                text = "Songs For you",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "View All",
                fontSize = 15.sp,
                modifier = Modifier.clickable {}
            )
        }
        LazyColumn(            
            state = rememberLazyListState(),
            modifier =
            Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
        ){
            items(listofSongs.size){
                index ->
                Box(
                    modifier = Modifier.padding(top = 20.dp, bottom = 10.dp)
                ){
                    ForYouCard(song = listofSongs[index])
                }
            }
        }
    }
}

@Composable
fun HomePage(router: Router){
    Scaffold(
        topBar = { TopBar(router)}

    ) {
        Column (
            modifier =
            Modifier.padding(10.dp)
        ){
            AlbumContainer()
            ForYouContainer()
        }
    }
}

@Preview
@Composable
fun HomePagePreview(){
    //HomePage()
}