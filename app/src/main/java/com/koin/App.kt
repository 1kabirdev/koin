package com.koin

import android.app.Application
import com.koin.module.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 * Main Application
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        // start Koin context
        startKoin {
            androidContext(this@App)
            androidLogger()
            modules(appModule)
        }
    }
}