package com.example.moogledex.data.model.character

data class CharactersItem(
    val age: String,
    val description: String,
    val gender: String,
    val height: String,
    val id: String,
    val japaneseName: String,
    val job: String,
    val name: String,
    val origin: String,
    val pictures: List<Picture>,
    val race: String,
    val stats: List<Stat>,
    val weight: String
)