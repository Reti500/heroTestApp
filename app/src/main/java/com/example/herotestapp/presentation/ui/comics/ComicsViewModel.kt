package com.example.herotestapp.presentation.ui.comics

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.herotestapp.core.common.Resource
import com.example.herotestapp.core.models.Comic
import com.example.herotestapp.core.use_cases.comics.GetComics
import com.example.herotestapp.presentation.common.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class ComicsViewModel @Inject constructor(
    private val getComics: GetComics
) : ViewModel() {

    private val _comics = MutableLiveData<List<Comic>>()
    val comics : LiveData<List<Comic>> = _comics

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    private val _selectedComic = SingleLiveEvent<Comic>()
    val selectedComic: SingleLiveEvent<Comic> = _selectedComic

    val onComicSelected : (Comic) -> Unit = {
        _selectedComic.value = it
    }

    init {
        executeGetComics()
    }

    fun executeGetComics() {
        getComics().onEach {
            _isLoading.value = false

            when(it) {
                is Resource.Done -> _comics.value = it.data ?: emptyList()
                is Resource.Failed -> {  }
                is Resource.Loading -> _isLoading.value = true
                is Resource.NetworkError -> {  }
            }
        }.launchIn(viewModelScope)
    }
}