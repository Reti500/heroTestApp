package com.example.herotestapp.data.mappers

import com.example.herotestapp.core.common.Mapper
import com.example.herotestapp.core.models.ComicData
import com.example.herotestapp.data.remote.api.responses.ComicDataResponse

object ComicDataToDomain : Mapper<ComicDataResponse, ComicData> {
    override fun map(input: ComicDataResponse): ComicData =
        ComicData(
            offset = input.offset,
            limit = input.limit,
            total = input.total,
            count = input.count
        )
}