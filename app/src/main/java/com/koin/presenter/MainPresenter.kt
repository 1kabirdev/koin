package com.koin.presenter

import com.koin.repository.MainRepository


/**
 * Simple presenter - use the HelloRepository to "say" hello
 */
class MainPresenter(private val repository: MainRepository) {

    fun sayHello() = "${repository.giveHello()} from MainPresenter"
}