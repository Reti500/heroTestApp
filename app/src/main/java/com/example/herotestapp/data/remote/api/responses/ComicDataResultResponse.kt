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

    /*
    "id": 82967,
    "digitalId": 0,
    "title": "Marvel Previews (2017)",
    "issueNumber": 0,
    "variantDescription": "",
    "description": null,
    "modified": "2019-11-07T08:46:15-0500",
    "isbn": "",
    "upc": "75960608839302811",
    "diamondCode": "",
    "ean": "",
    "issn": "",
    "format": "",
    "pageCount": 112,
    "textObjects": [],
    "resourceURI": "http://gateway.marvel.com/v1/public/comics/82967",
    "urls": [
        {
            "type": "detail",
            "url": "http://marvel.com/comics/issue/82967/marvel_previews_2017?utm_campaign=apiRef&utm_source=4dfe1fa1a63cf745994001b8657e8519"
        }
    ],
    "series": {
        "resourceURI": "http://gateway.marvel.com/v1/public/series/23665",
        "name": "Marvel Previews (2017 - Present)"
    },
    "variants": [
        {
            "resourceURI": "http://gateway.marvel.com/v1/public/comics/82965",
            "name": "Marvel Previews (2017)"
        },
        {
            "resourceURI": "http://gateway.marvel.com/v1/public/comics/82970",
            "name": "Marvel Previews (2017)"
        },
        {
            "resourceURI": "http://gateway.marvel.com/v1/public/comics/82969",
            "name": "Marvel Previews (2017)"
        },
        {
            "resourceURI": "http://gateway.marvel.com/v1/public/comics/74697",
            "name": "Marvel Previews (2017)"
        },
        {
            "resourceURI": "http://gateway.marvel.com/v1/public/comics/72736",
            "name": "Marvel Previews (2017)"
        },
        {
            "resourceURI": "http://gateway.marvel.com/v1/public/comics/75668",
            "name": "Marvel Previews (2017)"
        },
        {
            "resourceURI": "http://gateway.marvel.com/v1/public/comics/65364",
            "name": "Marvel Previews (2017)"
        },
        {
            "resourceURI": "http://gateway.marvel.com/v1/public/comics/65158",
            "name": "Marvel Previews (2017)"
        },
        {
            "resourceURI": "http://gateway.marvel.com/v1/public/comics/65028",
            "name": "Marvel Previews (2017)"
        },
        {
            "resourceURI": "http://gateway.marvel.com/v1/public/comics/75662",
            "name": "Marvel Previews (2017)"
        },
        {
            "resourceURI": "http://gateway.marvel.com/v1/public/comics/74320",
            "name": "Marvel Previews (2017)"
        },
        {
            "resourceURI": "http://gateway.marvel.com/v1/public/comics/73776",
            "name": "Marvel Previews (2017)"
        }
    ],
    "collections": [],
    "collectedIssues": [],
    "dates": [
        {
            "type": "onsaleDate",
            "date": "2099-10-30T00:00:00-0500"
        },
        {
            "type": "focDate",
            "date": "2019-10-07T00:00:00-0400"
        }
    ],
    "prices": [
        {
            "type": "printPrice",
            "price": 0
        }
    ],
    "thumbnail": {
        "path": "http://i.annihil.us/u/prod/marvel/i/mg/b/40/image_not_available",
        "extension": "jpg"
    },
    "images": [],
    "creators": {
        "available": 1,
        "collectionURI": "http://gateway.marvel.com/v1/public/comics/82967/creators",
        "items": [
            {
                "resourceURI": "http://gateway.marvel.com/v1/public/creators/10021",
                "name": "Jim Nausedas",
                "role": "editor"
            }
        ],
        "returned": 1
    },
    "characters": {
        "available": 0,
        "collectionURI": "http://gateway.marvel.com/v1/public/comics/82967/characters",
        "items": [],
        "returned": 0
    },
    "stories": {
        "available": 2,
        "collectionURI": "http://gateway.marvel.com/v1/public/comics/82967/stories",
        "items": [
            {
                "resourceURI": "http://gateway.marvel.com/v1/public/stories/183698",
                "name": "cover from Marvel Previews (2017)",
                "type": "cover"
            },
            {
                "resourceURI": "http://gateway.marvel.com/v1/public/stories/183699",
                "name": "story from Marvel Previews (2017)",
                "type": "interiorStory"
            }
        ],
        "returned": 2
    },
    "events": {
        "available": 0,
        "collectionURI": "http://gateway.marvel.com/v1/public/comics/82967/events",
        "items": [],
        "returned": 0
    }
    */
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