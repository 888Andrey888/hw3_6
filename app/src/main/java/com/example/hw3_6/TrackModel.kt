package com.example.hw3_6

import java.io.Serializable

data class TrackModel(
    val nameTrack: String? = "Неизвестный трек",
    val executor: String? = "Неизвестный исполнитель",
    val album: String? = "Неизвестный альбом",
    val img: String? = "https://cdn1.vectorstock.com/i/1000x1000/41/20/music-track-audio-pattern-sound-background-vector-26294120.jpg",
    val duration: String? = "0:00"
) : Serializable
