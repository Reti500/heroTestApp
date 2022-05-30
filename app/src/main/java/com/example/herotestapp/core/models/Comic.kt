package com.example.herotestapp.core.models

data class Comic(
    val id: Int,
    val digitalId: Int,
    val title: String,
    val issueNumber: Double,
    val variantDescription: String,
    val description: String,
    val modified: String,
    val isbn: String,
    val upc: String,
    val diamondCode: String,
    val ean: String,
    val issn: String,
    val format: String,
    val pageCount: Int,
    val resourceURI: String,
    val urls: List<ItemUrl>,
    val series: ItemResource,
    val variants: List<ItemResource>,
    val collections: List<ItemResource>,
    val collectedIssues: List<ItemResource>
)
