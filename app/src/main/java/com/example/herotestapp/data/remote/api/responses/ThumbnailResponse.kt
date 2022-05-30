package com.example.herotestapp.data.remote.api.responses

import com.google.gson.annotations.SerializedName

data class ThumbnailResponse(
    @SerializedName("path")
    val path: String,

    @SerializedName("extension")
    val extension: String
)
