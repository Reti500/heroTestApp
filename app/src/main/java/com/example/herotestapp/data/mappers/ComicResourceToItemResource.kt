package com.example.herotestapp.data.mappers

import com.example.herotestapp.core.common.Mapper
import com.example.herotestapp.core.models.ItemResource
import com.example.herotestapp.data.remote.api.responses.Resource

object ComicResourceToItemResource : Mapper<Resource, ItemResource> {
    override fun map(input: Resource): ItemResource = ItemResource(
        resourceURI = input.resourceURI,
        name = input.name
    )
}