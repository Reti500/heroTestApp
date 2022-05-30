package com.example.herotestapp.data.remote.api.services

import com.example.herotestapp.data.remote.api.responses.ComicsResponse
import retrofit2.Response
import retrofit2.http.GET

interface ComicsService {

    @GET("v1/public/comics")
    suspend fun getComics() : Response<ComicsResponse>
}