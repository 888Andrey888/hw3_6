package com.example.hw3_6

import java.io.Serializable

data class TrackModel(
    var nameTrack: String? = "Неизвестный трек",
    var executor: String? = "Неизвестный исполнитель",
    var album: String? = "Неизвестный альбом",
    var img: String? = "https://cdn1.vectorstock.com/i/1000x1000/41/20/music-track-audio-pattern-sound-background-vector-26294120.jpg",
    var duration: String? = "0:00",
    var trackUrl: String? = null
) : Serializable
