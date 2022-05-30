package com.example.herotestapp.presentation.comics

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.herotestapp.core.common.Resource
import com.example.herotestapp.core.use_cases.comics.GetComics
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class ComicsViewModel @Inject constructor(
    private val getComics: GetComics
) : ViewModel() {

    fun executeGetComics() {
        Log.e("Vm","Execute get comics")
        getComics().onEach {
            when(it) {
                is Resource.Done -> {
                    Log.e("Viewmodel","DONE")
                }
                is Resource.Failed -> {
                    Log.e("Viewmodel","FAILED")
                }
                is Resource.Loading -> {
                    Log.e("Viewmodel","Loading")
                }
                is Resource.NetworkError -> {
                    Log.e("Viewmodel","Net error")
                }
            }
        }.launchIn(viewModelScope)
    }
}