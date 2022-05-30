package com.example.herotestapp.core.common

import android.util.Log
import retrofit2.HttpException
import retrofit2.Response
import java.io.IOException

abstract class BaseDataSource {

    protected suspend fun <I, O> getResult(
        mapper: Mapper<I, O>,
        call: suspend () -> Response<I>
    ) : O {
        try {
            val response = call()
            if (response.isSuccessful) {
                val body = response.body()
                if (body != null) {
                    return mapper.map(body)
                }
            }

            throw Exception("my error")
        } catch (t: Throwable) {
            Log.e("PREV Throwable", t.stackTraceToString())
            when(t) {
                is IOException -> throw RemoteDataError.NetWorkError
                is HttpException -> throw RemoteDataError.HttpError(t.code(), t.message())
                else -> throw RemoteDataError.UnknownError
            }
        }
    }
}