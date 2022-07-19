package com.example.moogledex.di

import android.app.Application
import android.content.Context
import com.example.moogledex.shared.MoogleApp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideApplication(@ApplicationContext
                           context : Context) : MoogleApp {
        return context as MoogleApp
    }
}