package com.example.moogledex.data.model.game

data class GamesItem(
    val description: String,
    val gameId: String,
    val picture: String,
    val platform: String,
    val releaseDate: String,
    val title: String
)