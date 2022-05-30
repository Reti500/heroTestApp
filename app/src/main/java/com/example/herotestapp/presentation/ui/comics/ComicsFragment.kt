package com.example.herotestapp.presentation.ui.comics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.herotestapp.databinding.FragmentComicsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ComicsFragment : Fragment() {

    private val binding: FragmentComicsBinding by lazy {
        FragmentComicsBinding.inflate(layoutInflater).apply {
            viewModel = comicsViewModel
        }
    }

    private val comicsViewModel: ComicsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lifecycleOwner = this
        comicsViewModel.executeGetComics()
    }

}