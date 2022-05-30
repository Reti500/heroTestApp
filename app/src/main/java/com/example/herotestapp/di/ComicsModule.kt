package com.example.herotestapp.di

import com.example.herotestapp.core.repository.ComicsRepository
import com.example.herotestapp.core.use_cases.comics.GetComics
import com.example.herotestapp.data.remote.api.RemoteDataSource
import com.example.herotestapp.data.repository.ComicsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object ComicsModule {

    @Provides
    fun providesComicsRepository(remote: RemoteDataSource): ComicsRepository {
        return ComicsRepositoryImpl(remoteDataSource = remote)
    }

    @Provides
    fun providesGetComicsUseCase(repository: ComicsRepository): GetComics {
        return GetComics(repository = repository)
    }
}