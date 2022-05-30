package com.example.herotestapp.data.mappers

import com.example.herotestapp.core.common.Mapper
import com.example.herotestapp.core.models.Comic
import com.example.herotestapp.data.remote.api.responses.ComicsResponse

object ComicDataToDomain : Mapper<ComicsResponse, List<Comic>> {
    override fun map(input: ComicsResponse): List<Comic> = input.data.results.map {
        Comic(
            id = it.id,
            digitalId = it.digitalId,
            title = it.title,
            issueNumber = it.issueNumber,
            variantDescription = it.variantDescription,
            description = it.description,
            modified = it.modified,
            isbn = it.isbn,
            issn = it.issn,
            upc = it.upc,
            diamondCode = it.diamondCode,
            ean = it.ean,
            format = it.format,
            pageCount = it.pageCount,
            resourceURI = it.resourceURI,
            series = ComicResourceToItemResource.map(it.series),
            variants = it.variants.map { i -> ComicResourceToItemResource.map(i) },
            collectedIssues = it.collectedIssues.map { i -> ComicResourceToItemResource.map(i) },
            collections = it.collections.map { i -> ComicResourceToItemResource.map(i) },
            urls = it.urls.map { i -> ComicUrlToItemUrl.map(i) }
        )
    }
}