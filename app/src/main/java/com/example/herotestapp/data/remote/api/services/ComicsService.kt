package com.example.herotestapp.data.remote.api.services

import com.example.herotestapp.data.remote.api.responses.ComicsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ComicsService {

    @GET("v1/public/comics")
    suspend fun getComics() : Response<ComicsResponse>

    @GET("v1/public/comics/{id}")
    suspend fun getComic(@Path("id") id: Int) : Response<ComicsResponse>
}