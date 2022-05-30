package com.example.herotestapp.data.remote.api

import com.example.herotestapp.data.remote.api.services.ComicsService
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val comicsService: ComicsService
) {

    suspend fun getComics() {
        comicsService.getComics()
    }
}