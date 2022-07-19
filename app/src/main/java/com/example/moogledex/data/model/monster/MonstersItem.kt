package com.example.moogledex.data.model.monster

data class MonstersItem(
    val attack: Int,
    val defense: Int,
    val description: String,
    val elementalAffinity: String,
    val elementalWeakness: String,
    val game: String,
    val hitPoints: Int,
    val japaneseName: String,
    val manaPoints: Int,
    val monsterId: String,
    val name: String,
    val picture: String
)