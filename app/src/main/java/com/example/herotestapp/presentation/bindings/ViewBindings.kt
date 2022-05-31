package com.example.herotestapp.presentation.bindings

import android.widget.GridView
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.herotestapp.core.extensions.makeMarvelImageUrl
import com.example.herotestapp.core.models.Comic
import com.example.herotestapp.core.models.LandscapeImageVariant
import com.example.herotestapp.core.models.PortraitImageVariant
import com.example.herotestapp.presentation.adapters.ComicsAdapter
import com.example.herotestapp.presentation.adapters.ComicsGridAdapter
import com.example.herotestapp.presentation.common.SpacesItemDecoration
import com.squareup.picasso.Picasso

@BindingAdapter("setComicsAdapter")
fun GridView.setComicsAdapter(items: List<Comic>?) {
    items?.let { this.adapter = ComicsGridAdapter(it) }
}

@BindingAdapter(value = ["setComicsAsGrid", "onItemClick"])
fun RecyclerView.setComics(items: List<Comic>?, onItemClick: (Comic) -> Unit) {
    items?.let {
        this.adapter = ComicsAdapter(it, onItemClick)
        this.layoutManager = GridLayoutManager(this.context, 2)
        //this.addItemDecoration(SpacesItemDecoration(32))
    }
}

@BindingAdapter(value = ["setPortraitUncannyImage", "extension"], requireAll = true)
fun ImageView.setPortraitUncannyImage(url: String, extension: String) {
    val marvelUrl = url.makeMarvelImageUrl(extension, PortraitImageVariant.Uncanny)
    Picasso.get().load(marvelUrl).into(this)
}

@BindingAdapter(value = ["setLandscapeLargeImage", "extension"], requireAll = true)
fun ImageView.setLandscapeLargeImage(url: String?, extension: String?) {
    url?.let {
        val marvelUrl = it.makeMarvelImageUrl(extension ?: "", LandscapeImageVariant.Large)
        Picasso.get().load(marvelUrl).fit().centerInside().into(this)
    }
}

@BindingAdapter(value = ["setLandscapeAmazingImage", "extension"], requireAll = true)
fun ImageView.setLandscapeAmazingImage(url: String?, extension: String?) {
    url?.let {
        val marvelUrl = it.makeMarvelImageUrl(extension ?: "", LandscapeImageVariant.Amazing)
        Picasso.get().load(marvelUrl).fit().centerCrop().into(this)
    }
}