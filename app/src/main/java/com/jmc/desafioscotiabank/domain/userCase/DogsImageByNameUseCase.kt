package com.jmc.desafioscotiabank.domain.userCase

import com.jmc.desafioscotiabank.domain.repository.DogRepository
import com.jmc.desafioscotiabank.utils.coroutines.ResultUseCase
import kotlinx.coroutines.Dispatchers

class DogsImageByNameUseCase(val dogRepository: DogRepository) :
    ResultUseCase<String, List<String>>(
        backgroundContext = Dispatchers.IO,
        foregroundContext = Dispatchers.Main
    ) {
    override suspend fun executeOnBackground(params: String): List<String> {
        return dogRepository.getDogsByName(params)!!
    }


}