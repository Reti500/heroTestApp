package com.example.herotestapp.core.models

data class Comic(
    val code: Int,
    val status: String,
    val copyright: String,
    val attributionText: String,
    val attributionHTML: String,
    val data: ComicData,
    val eTag: String
)
