package com.example.herotestapp.core.models

sealed class ImageVariant(val name: String) {
    object Small : ImageVariant("portrait_small")
    object Medium	 : ImageVariant("portrait_medium")
    object Xlarge	 : ImageVariant("portrait_xlarge")
    object Fantastic	 : ImageVariant("portrait_fantastic")
    object Uncanny	 : ImageVariant("portrait_uncanny")
    object Incredible	 : ImageVariant("portrait_incredible")
}
