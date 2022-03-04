package com.algomatrix.musicplayer.ui.pages

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.algomatrix.musicplayer.mockdata.listofSongs
import com.algomatrix.musicplayer.ui.components.cards.FavoriteCard
import com.algomatrix.musicplayer.ui.components.cards.ForYouCard
import com.algomatrix.musicplayer.ui.components.utility.PageName


@Composable
fun FavoritePage(){
    Box(
        modifier = Modifier.fillMaxSize(),
    ){
        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            PageName("Favorite")
            Box(
                modifier = Modifier.padding(bottom = 20.dp)
            ){
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
                            FavoriteCard(song = listofSongs[index])
                        }
                    }
                }
            }
        }
    }
}


@Preview
@Composable
fun LibraryPagePreview(){
    FavoritePage()
}