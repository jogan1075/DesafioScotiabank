package com.jmc.desafioscotiabank

import android.app.Application
import com.jmc.desafioscotiabank.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class DogsApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@DogsApp)
            modules(
                appModule
            )
        }
    }
}