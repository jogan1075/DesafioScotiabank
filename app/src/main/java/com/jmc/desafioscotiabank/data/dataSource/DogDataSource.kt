package com.jmc.desafioscotiabank.data.dataSource

import com.jmc.desafioscotiabank.data.dataSource.remote.DogService
import com.jmc.desafioscotiabank.domain.repository.DogRepository
import com.jmc.desafioscotiabank.utils.await

class DogDataSource(private val dogService: DogService) : DogRepository {

    override suspend fun getListDogs(): List<String>? {
        return dogService.getListDogs().await()?.message
    }

    override suspend fun getDogsByName(type: String): List<String>? {
        return dogService.getDogsByName(type).await()?.message
    }

}