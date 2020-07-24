package com.jmc.desafioscotiabank.domain.userCase

import com.jmc.desafioscotiabank.domain.repository.DogRepository
import com.jmc.desafioscotiabank.utils.coroutines.ResultUseCase
import kotlinx.coroutines.Dispatchers

class DogsUseCase(val dogRepository: DogRepository) : ResultUseCase<Unit, List<String>>(
    backgroundContext = Dispatchers.IO,
    foregroundContext = Dispatchers.Main
) {
    override suspend fun executeOnBackground(params: Unit): List<String>? {
        return dogRepository.getListDogs()
    }

}