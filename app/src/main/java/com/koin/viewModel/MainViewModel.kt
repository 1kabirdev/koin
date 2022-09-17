package com.koin.viewModel

import androidx.lifecycle.ViewModel
import com.koin.repository.MainRepository

class MainViewModel(private val repository: MainRepository) : ViewModel() {

    fun giveData(a:String) = "${repository.giveData(a)} from MainViewModel"
}