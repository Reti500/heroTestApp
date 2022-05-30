package com.example.herotestapp.core.repository

import com.example.herotestapp.core.common.Resource
import com.example.herotestapp.core.models.Comic
import kotlinx.coroutines.flow.Flow

interface ComicsRepository {

    fun getComics() : Flow<Resource<List<Comic>>>
    fun getComic(id: Int) : Flow<Resource<Comic>>
}