package com.example.herotestapp.presentation.adapters

import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.example.herotestapp.core.models.Comic
import com.example.herotestapp.databinding.ItemComicBinding

class ComicsViewHolder(
    private val binding: ItemComicBinding,
    private val onItemClick: (Comic) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Comic) {
        binding.comic = item
        binding.root.setOnClickListener {
        Log.e("VH", "CLICK")
            onItemClick(item)
        }
        binding.executePendingBindings()
    }
}