package com.jmc.desafioscotiabank.di

import android.content.Context
import android.net.ConnectivityManager
import com.jmc.desafioscotiabank.data.dataSource.DogDataSource
import com.jmc.desafioscotiabank.data.dataSource.remote.DogService
import com.jmc.desafioscotiabank.domain.repository.DogRepository
import com.jmc.desafioscotiabank.domain.userCase.DogsImageByNameUseCase
import com.jmc.desafioscotiabank.domain.userCase.DogsUseCase
import com.jmc.desafioscotiabank.presentation.viewModel.DogsImgViewModel
import com.jmc.desafioscotiabank.presentation.viewModel.DogsViewModel
import com.jmc.desafioscotiabank.utils.URL_BASE_API
import okhttp3.OkHttpClient
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.experimental.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import org.koin.experimental.builder.factory
import org.koin.experimental.builder.factoryBy

val appModule = module {

    single {
        androidContext().getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    }

    /* Retrofit */

    single {
        OkHttpClient.Builder()
            .callTimeout(1, TimeUnit.MINUTES)
            .connectTimeout(1, TimeUnit.MINUTES)
            .readTimeout(1, TimeUnit.MINUTES)
            .writeTimeout(1, TimeUnit.MINUTES)
            .build()
    }

    single {
        Retrofit.Builder()
            .baseUrl(URL_BASE_API)
            .client(get())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    single {
        get<Retrofit>()
            .create(DogService::class.java) as DogService
    }

    viewModel<DogsViewModel>()
    viewModel<DogsImgViewModel>()

    factory<DogsUseCase>()
    factory<DogsImageByNameUseCase>()

    factoryBy<DogRepository, DogDataSource>()



}
