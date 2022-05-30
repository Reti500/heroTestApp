package com.example.herotestapp.data.remote.api.responses

import com.google.gson.annotations.SerializedName

data class ComicsResponse(
    @SerializedName("code")
    val code: Int,

    @SerializedName("status")
    val status: String,

    @SerializedName("copyright")
    val copyright: String,

    @SerializedName("attributionText")
    val attributionText: String,

    @SerializedName("attributionHTML")
    val attributionHTML: String,

    @SerializedName("data")
    val data: ComicDataResponse,

    @SerializedName("etag")
    val eTag: String
)
