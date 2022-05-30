package com.example.herotestapp.presentation.adapters

import androidx.recyclerview.widget.RecyclerView
import com.example.herotestapp.core.models.Comic
import com.example.herotestapp.databinding.ItemComicBinding

class ComicsViewHolder(
    private val binding: ItemComicBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Comic) {}
}