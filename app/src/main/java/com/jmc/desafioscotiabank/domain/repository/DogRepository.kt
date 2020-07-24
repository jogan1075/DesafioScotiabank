package com.jmc.desafioscotiabank.domain.repository

interface DogRepository {
    suspend fun getListDogs(): List<String>?

    suspend fun getDogsByName(type: String): List<String>?
}