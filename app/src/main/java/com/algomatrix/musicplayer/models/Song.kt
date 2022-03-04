package com.algomatrix.musicplayer.models

import java.time.Duration

data class Song (
    val id: String,
    val title: String,
    val authorName: String,
    val imageUrl: String,
    val songUrl: String,
)

