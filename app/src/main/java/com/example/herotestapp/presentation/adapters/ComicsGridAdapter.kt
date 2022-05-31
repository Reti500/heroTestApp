package com.example.herotestapp.presentation.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.herotestapp.core.models.Comic
import com.example.herotestapp.databinding.ItemComicBinding

class ComicsGridAdapter(
    private val items: List<Comic>
) : BaseAdapter() {

    override fun getCount(): Int = items.size

    override fun getItem(position: Int): Comic = items[position]

    override fun getItemId(p0: Int): Long = 0

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = parent.context
            .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val binding = ItemComicBinding.inflate(
            inflater,
            parent,
            false
        )

        val holder = ComicsViewHolder(binding = binding, {})
        holder.bind(getItem(position))

        return binding.root
    }
}