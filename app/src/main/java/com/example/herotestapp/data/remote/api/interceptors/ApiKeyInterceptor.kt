package com.example.herotestapp.data.remote.api.interceptors

import com.example.herotestapp.BuildConfig
import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class ApiKeyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original: Request = chain.request()
        val httpUrl: HttpUrl = original.url
        val url: HttpUrl = httpUrl.newBuilder()
            .addQueryParameter("apikey", BuildConfig.SERVER_APIKEY)
            .addQueryParameter("ts", BuildConfig.SERVER_TS)
            .addQueryParameter("hash", BuildConfig.SERVER_HASH)
            .build()
        val request: Request = original.newBuilder().url(url).build()
        return chain.proceed(request)
    }
}