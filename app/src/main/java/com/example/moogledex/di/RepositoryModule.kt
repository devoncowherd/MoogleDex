package com.example.moogledex.di

import com.example.moogledex.data.network.MoogleClient
import com.example.moogledex.shared.MoogleRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    @Provides
    @ViewModelScoped
    fun provideMoogleRepository(
        moogleClient : MoogleClient
    ) : MoogleRepository {
        return MoogleRepository(moogleClient)
    }
}