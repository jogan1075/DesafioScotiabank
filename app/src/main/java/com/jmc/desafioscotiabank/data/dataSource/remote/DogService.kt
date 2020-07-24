package com.jmc.desafioscotiabank.data.dataSource.remote

import com.jmc.desafioscotiabank.data.entity.ResponseDogs
import com.jmc.desafioscotiabank.data.entity.ResponseImageDogs
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface DogService {
    @GET("breeds/list")
    fun getListDogs(): Call<ResponseDogs>


    @GET("breed/{type}/images")
    fun getDogsByName(@Path("type") type: String): Call<ResponseImageDogs>

}