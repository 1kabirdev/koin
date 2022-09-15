package com.koin.viewModel

import androidx.lifecycle.ViewModel
import com.koin.repository.MainRepository

class MainViewModel(private val repository: MainRepository) : ViewModel() {

    fun sayHello() = "${repository.giveHello()} from MainViewModel"
}