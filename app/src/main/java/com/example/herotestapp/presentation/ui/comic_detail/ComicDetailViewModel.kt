package com.example.herotestapp.presentation.ui.comic_detail

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.herotestapp.core.common.Resource
import com.example.herotestapp.core.models.Comic
import com.example.herotestapp.core.use_cases.comics.GetComicById
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class ComicDetailViewModel @Inject constructor(
    private val getComicById: GetComicById
) : ViewModel() {

    private val _comic = MutableLiveData<Comic>()
    val comic : LiveData<Comic> = _comic

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    fun executeGetComics(id: Int) {
        getComicById(id).onEach {
            _isLoading.value = false

            when(it) {
                is Resource.Done -> it.data?.let { c -> _comic.value = c }
                is Resource.Failed -> {
                    Log.e("Viewmodel","FAILED")
                }
                is Resource.Loading -> _isLoading.value = true
                is Resource.NetworkError -> {
                    Log.e("Viewmodel","Net error")
                }
            }
        }.launchIn(viewModelScope)
    }

}