package com.example.herotestapp.di

import com.example.herotestapp.data.remote.api.RemoteDataSource
import com.example.herotestapp.data.remote.api.services.ComicsService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RemoteModule {

    @Provides
    fun providesRemoteDataSource(service: ComicsService): RemoteDataSource {
        return RemoteDataSource(comicsService = service)
    }

}