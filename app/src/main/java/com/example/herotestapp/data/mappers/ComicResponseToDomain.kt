package com.example.herotestapp.data.mappers

import com.example.herotestapp.core.common.Mapper
import com.example.herotestapp.core.models.Comic
import com.example.herotestapp.data.remote.api.responses.ComicsResponse

object ComicsListToDomain : Mapper<List<ComicsResponse>, List<Comic>> {
    override fun map(input: List<ComicsResponse>): List<Comic> = input.map {
        Comic(
            code = it.code,
            status = it.status,
            copyright = it.copyright,
            attributionHTML = it.attributionHTML,
            attributionText = it.attributionText,
            eTag = it.eTag,
            data = ComicDataToDomain.map(it.data)
        )
    }
}