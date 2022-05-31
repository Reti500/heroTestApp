package com.example.herotestapp.core.models

sealed class PortraitImageVariant(private val variant: String) : ImageVariant(variant) {
    object Small : PortraitImageVariant("portrait_small")
    object Medium	 : PortraitImageVariant("portrait_medium")
    object Xlarge	 : PortraitImageVariant("portrait_xlarge")
    object Fantastic	 : PortraitImageVariant("portrait_fantastic")
    object Uncanny	 : PortraitImageVariant("portrait_uncanny")
    object Incredible	 : PortraitImageVariant("portrait_incredible")
}
