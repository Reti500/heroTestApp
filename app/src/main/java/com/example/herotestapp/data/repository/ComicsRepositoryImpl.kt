package com.example.herotestapp.data.repository

import com.example.herotestapp.core.common.RemoteDataError
import com.example.herotestapp.core.common.Resource
import com.example.herotestapp.core.models.Comic
import com.example.herotestapp.core.repository.ComicsRepository
import com.example.herotestapp.data.remote.api.RemoteDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ComicsRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : ComicsRepository {

    override fun getComics(): Flow<Resource<List<Comic>>> = flow {
        try {
            emit(Resource.Loading<List<Comic>>())
            emit(Resource.Done<List<Comic>>(data = remoteDataSource.getComics()))
        } catch (t: Throwable) {
            when(t) {
                is RemoteDataError.NetWorkError -> emit(Resource.NetworkError<List<Comic>>())
                else -> emit(Resource.Failed<List<Comic>>(0, t.message ?: ""))
            }
        }
    }

    override fun getComic(id: Int): Flow<Resource<Comic>> = flow {
        try {
            emit(Resource.Loading<Comic>())
            emit(Resource.Done<Comic>(data = remoteDataSource.getComic(id)))
        } catch (t: Throwable) {
            when(t) {
                is RemoteDataError.NetWorkError -> emit(Resource.NetworkError<Comic>())
                else -> emit(Resource.Failed<Comic>(0, t.message ?: ""))
            }
        }
    }

}