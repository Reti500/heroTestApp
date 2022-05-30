package com.example.herotestapp.core.common

sealed class RemoteDataError : Throwable() {
    object NetWorkError : RemoteDataError()
    object UnknownError : RemoteDataError()

    class HttpError(val code: Int, val error: String) : RemoteDataError()
}