package com.example.herotestapp.data.mappers

import com.example.herotestapp.core.common.Mapper
import com.example.herotestapp.core.models.ItemUrl
import com.example.herotestapp.data.remote.api.responses.DataUrl

object ComicUrlToItemUrl : Mapper<DataUrl, ItemUrl> {
    override fun map(input: DataUrl): ItemUrl = ItemUrl(
        type = input.type,
        url = input.url
    )
}