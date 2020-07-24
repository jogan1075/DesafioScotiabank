package com.jmc.desafioscotiabank.presentation.viewModel

import androidx.lifecycle.ViewModel
import com.jmc.desafioscotiabank.domain.userCase.DogsUseCase
import com.jmc.desafioscotiabank.utils.LiveResult

class DogsViewModel(val dogsUseCase: DogsUseCase) : ViewModel() {
    val dogs = LiveResult<List<String>>()

    fun getAll() {

        dogsUseCase.execute(liveData = dogs, params = Unit)

    }
}