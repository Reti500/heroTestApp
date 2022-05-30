package com.example.herotestapp.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.herotestapp.core.models.Comic
import com.example.herotestapp.databinding.ItemComicBinding

class ComicsAdapter(
    private val items: List<Comic>
) : RecyclerView.Adapter<ComicsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComicsViewHolder =
        ComicsViewHolder(
            ItemComicBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: ComicsViewHolder, position: Int) =
        holder.bind(items[position])

    override fun getItemCount(): Int = items.size
}