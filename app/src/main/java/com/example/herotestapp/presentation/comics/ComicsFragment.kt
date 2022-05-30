package com.example.herotestapp.presentation.comics

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.herotestapp.databinding.FragmentComicsBinding
import com.example.herotestapp.presentation.adapters.ComicsGridAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ComicsFragment : Fragment() {

    private val binding: FragmentComicsBinding by lazy {
        FragmentComicsBinding.inflate(layoutInflater)
    }

    private val viewModel: ComicsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.e("CF", "Init")
        binding.comicsGrid.adapter = ComicsGridAdapter(emptyList())
        viewModel.executeGetComics()
    }

}