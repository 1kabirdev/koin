package com.koin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.koin.presenter.MainPresenter
import com.koin.viewModel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    // Inject MainPresenter
    private val mainPresenter: MainPresenter by inject()

    // Inject MainViewModel
    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text =
            "${mainPresenter.giveData(this.toString())}\n${mainViewModel.giveData(this.toString())}"
    }
}