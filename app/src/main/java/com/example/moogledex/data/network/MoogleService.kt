package com.example.moogledex.data.network

import retrofit2.http.GET

interface MoogleService {

    @GET("api/v1/characters")
    suspend fun getAllCharacters()

    @GET("api/v1/monsters")
    suspend fun getAllMonsters()

    @GET("api/v1/games")
    suspend fun getAllGames()

    @GET("api/v1/characters/random")
    suspend fun getRandomCharacter()

}