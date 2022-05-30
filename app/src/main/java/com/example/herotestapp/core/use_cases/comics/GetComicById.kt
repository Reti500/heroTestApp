package com.example.herotestapp.core.use_cases.comics

import com.example.herotestapp.core.common.Resource
import com.example.herotestapp.core.models.Comic
import com.example.herotestapp.core.repository.ComicsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetComicById @Inject constructor(
    private val repository: ComicsRepository
) {
    operator fun invoke(id: Int) : Flow<Resource<Comic>> = repository.getComic(id)
}