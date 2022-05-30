package com.example.herotestapp.presentation.ui.comic_detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.herotestapp.databinding.FragmentComicDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ComicDetailFragment : Fragment() {

    private val binding: FragmentComicDetailBinding by lazy {
        FragmentComicDetailBinding.inflate(layoutInflater).apply {
            viewModel = detailViewModel
        }
    }

    private val detailViewModel: ComicDetailViewModel by viewModels()
    private val args : ComicDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lifecycleOwner = this
        detailViewModel.executeGetComics(args.comicId.toInt())
    }
}