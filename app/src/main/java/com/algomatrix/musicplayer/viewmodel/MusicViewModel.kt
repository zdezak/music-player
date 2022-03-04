package com.algomatrix.musicplayer.viewmodel

import android.media.MediaPlayer
import android.os.CountDownTimer
import android.util.Log
import androidx.compose.ui.graphics.Color
import androidx.core.util.rangeTo
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class MusicViewModel: ViewModel() {
    private var currentDuration: CountDownTimer? = null
    private val _currentMinutes = MutableLiveData(0)
    val currentMinutes: LiveData<Int> get() = _currentMinutes
    private val _audioFinish = MutableLiveData(false)
    val audioFinish: LiveData<Boolean> get() = _audioFinish

    fun getMusicDuration(mediaPlayer : MediaPlayer){
        currentDuration = object : CountDownTimer(mediaPlayer.duration.toLong(),500){
            override fun onTick(milliSec : Long){
                _currentMinutes.value = mediaPlayer.currentPosition
            }
            override fun onFinish() {
                _audioFinish.value = true;
                Log.d("Tag", "onFinish: Media Player Finished")
            }
        }
    }

    fun getFirstColor(): Color {
        val random = Random()
        val color: Int = android.graphics.Color.argb(
            255,
            random.nextInt(256),
            random.nextInt(256),
            random.nextInt(256),
        )
        return Color(color)
    }

    fun getSecondColor(): Color {
        val random = Random()
        val color: Int = android.graphics.Color.argb(
            255,
            random.nextInt(256),
            random.nextInt(256),
            random.nextInt(256),
        )
        return Color(color)
    }

}