package com.koin.repository

class MainRepositoryImpl : MainRepository {

    override fun giveData(a:String) = "Hello Koin $a"
}