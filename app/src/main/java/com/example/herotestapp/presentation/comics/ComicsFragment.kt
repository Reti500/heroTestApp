package com.example.herotestapp.presentation.comics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.herotestapp.databinding.FragmentComicsBinding

class ComicsFragment : Fragment() {

    private lateinit var binding: FragmentComicsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentComicsBinding.inflate(inflater, container, false)
        return binding.root
    }

}