package com.example.herotestapp.data.mappers

import com.example.herotestapp.core.common.Mapper
import com.example.herotestapp.core.models.ItemPath
import com.example.herotestapp.data.remote.api.responses.ThumbnailResponse

object ThumbnailToDomain : Mapper<ThumbnailResponse, ItemPath> {
    override fun map(input: ThumbnailResponse): ItemPath = ItemPath(
        path = input.path,
        extension = input.extension
    )
}