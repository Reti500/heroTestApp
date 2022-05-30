package com.example.herotestapp.core.extensions

import com.example.herotestapp.core.models.ImageVariant

fun String.makeMarvelImageUrl(extension: String, variant: ImageVariant) =
    "$this/${variant.name}.$extension"