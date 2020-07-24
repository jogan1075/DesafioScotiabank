package com.jmc.desafioscotiabank.di

import android.content.Context
import android.net.ConnectivityManager
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val appModule = module {

    single {
        androidContext().getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    }
}
