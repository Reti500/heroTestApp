package com.example.herotestapp.presentation.bindings

import android.widget.GridView
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.herotestapp.core.extensions.makeMarvelImageUrl
import com.example.herotestapp.core.models.Comic
import com.example.herotestapp.core.models.ImageVariant
import com.example.herotestapp.presentation.adapters.ComicsGridAdapter
import com.squareup.picasso.Picasso

@BindingAdapter("setComicsAdapter")
fun GridView.setComicsAdapter(items: List<Comic>?) {
    items?.let { this.adapter = ComicsGridAdapter(it) }
}

@BindingAdapter(value = ["setImageUrl", "extension"], requireAll = true)
fun ImageView.setImage(url: String, extension: String) {
    val marvelUrl = url.makeMarvelImageUrl(extension, ImageVariant.Uncanny)
    Picasso
        .get()
        .load(marvelUrl)
        .into(this)
}