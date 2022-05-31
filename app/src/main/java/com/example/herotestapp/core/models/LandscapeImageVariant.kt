package com.example.herotestapp.core.models

sealed class LandscapeImageVariant(private val variant: String) : ImageVariant(variant) {
    object Small : LandscapeImageVariant("landscape_small")
    object Medium	 : LandscapeImageVariant("landscape_medium")
    object Large	 : LandscapeImageVariant("landscape_large")
    object XLarge	 : LandscapeImageVariant("landscape_xlarge")
    object Amazing	 : LandscapeImageVariant("landscape_amazing")
    object Incredible	 : LandscapeImageVariant("landscape_incredible")
}
