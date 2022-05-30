package com.example.herotestapp.core.common

interface Mapper<I, O> {
    fun map(input: I) : O
}