package com.example.herotestapp.data.remote.api.responses

import com.google.gson.annotations.SerializedName

data class ComicDataResultResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("digitalId")
    val digitalId: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("issueNumber")
    val issueNumber: Double,
    @SerializedName("variantDescription")
    val variantDescription: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("modified")
    val modified: String,
    @SerializedName("isbn")
    val isbn: String,
    @SerializedName("upc")
    val upc: String,
    @SerializedName("diamondCode")
    val diamondCode: String,
    @SerializedName("ean")
    val ean: String,
    @SerializedName("issn")
    val issn: String,
    @SerializedName("format")
    val format: String,
    @SerializedName("pageCount")
    val pageCount: Int,
    @SerializedName("resourceURI")
    val resourceURI: String,
    @SerializedName("textObjects")
    val textObjects: List<TextObject>,
    @SerializedName("urls")
    val urls: List<DataUrl>,
    @SerializedName("series")
    val series: Resource,
    @SerializedName("variants")
    val variants: List<Resource>,
    @SerializedName("collections")
    val collections: List<Resource>,
    @SerializedName("collectedIssues")
    val collectedIssues: List<Resource>

    /*"dates": [
    {
        "type": "string",
        "date": "Date"
    }
    ],
    "prices": [
    {
        "type": "string",
        "price": "float"
    }
    ],
    "thumbnail": {
    "path": "string",
    "extension": "string"
},
    "images": [
    {
        "path": "string",
        "extension": "string"
    }
    ],
    "creators": {
    "available": "int",
    "returned": "int",
    "collectionURI": "string",
    "items": [
    {
        "resourceURI": "string",
        "name": "string",
        "role": "string"
    }
    ]
},
    "characters": {
    "available": "int",
    "returned": "int",
    "collectionURI": "string",
    "items": [
    {
        "resourceURI": "string",
        "name": "string",
        "role": "string"
    }
    ]
},
    "stories": {
    "available": "int",
    "returned": "int",
    "collectionURI": "string",
    "items": [
    {
        "resourceURI": "string",
        "name": "string",
        "type": "string"
    }
    ]
},
    "events": {
    "available": "int",
    "returned": "int",
    "collectionURI": "string",
    "items": [
    {
        "resourceURI": "string",
        "name": "string"
    }
    ]
}
}*/
)

data class TextObject(
    @SerializedName("type")
    val type: String,

    @SerializedName("language")
    val language: String,

    @SerializedName("text")
    val text: String
)

data class DataUrl(
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String,
)

data class Resource(
    @SerializedName("resourceURI")
    val resourceURI: String,
    @SerializedName("name")
    val name: String
)