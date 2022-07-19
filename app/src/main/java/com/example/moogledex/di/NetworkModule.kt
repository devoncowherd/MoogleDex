package com.example.moogledex.di

import com.example.moogledex.data.network.MoogleClient
import com.example.moogledex.data.network.MoogleService
import com.skydoves.sandwich.adapters.ApiResponseCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    val moshi = Moshi.Builder()
        .addLast(KotlinJsonAdapterFactory())
        .build()

    @Provides
    @Singleton
    fun provideRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://www.moogleapi.com/")
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .addCallAdapterFactory(ApiResponseCallAdapterFactory.create())
            .build()

    }

    @Provides
    @Singleton
    fun provideMoogleService(retrofit : Retrofit) : MoogleService {
        return retrofit.create(MoogleService::class.java)
    }

    @Provides
    @Singleton
    fun provideMoogleClient(moogleService : MoogleService) : MoogleClient {
        return MoogleClient(moogleService)
    }


}