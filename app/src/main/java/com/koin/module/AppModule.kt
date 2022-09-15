package com.koin.module

import com.koin.presenter.MainPresenter
import com.koin.repository.MainRepository
import com.koin.repository.MainRepositoryImpl
import com.koin.viewModel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val appModule = module {

    // single instance of MainRepository
    singleOf(::MainRepositoryImpl) { bind<MainRepository>() }

    // Simple main Presenter Factory
    factoryOf(::MainPresenter)

    // mainViewModel ViewModel
    viewModelOf(::MainViewModel)
}
