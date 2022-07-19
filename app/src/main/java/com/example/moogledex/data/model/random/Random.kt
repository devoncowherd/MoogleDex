package com.example.moogledex.data.model.random

data class Random(
    val age: String,
    val description: String,
    val gender: String,
    val height: String,
    val id: String,
    val japaneseName: Any,
    val job: String,
    val name: String,
    val origin: String,
    val pictures: List<Picture>,
    val race: String,
    val stats: List<Any>,
    val weight: String
)