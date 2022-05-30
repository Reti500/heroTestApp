package com.example.herotestapp.data.remote.api

import com.example.herotestapp.core.common.BaseDataSource
import com.example.herotestapp.core.models.Comic
import com.example.herotestapp.data.mappers.ComicDataToDomain
import com.example.herotestapp.data.remote.api.services.ComicsService
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val comicsService: ComicsService
) : BaseDataSource() {

    suspend fun getComics() : List<Comic> = getResult(ComicDataToDomain) {
        comicsService.getComics()
    }

    suspend fun getComic(id: Int) : Comic = getResult(ComicDataToDomain) {
        comicsService.getComic(id)
    }.first()
}