package com.example.herotestapp.data.remote.api.services

import com.example.herotestapp.data.remote.api.responses.ComicsResponse
import retrofit2.Response
import retrofit2.http.GET

interface ComicsService {

    @GET("/comics")
    suspend fun getComics() : Response<List<ComicsResponse>>
}