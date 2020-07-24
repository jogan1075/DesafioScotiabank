package com.jmc.desafioscotiabank.presentation.viewModel

import androidx.lifecycle.ViewModel
import com.jmc.desafioscotiabank.domain.userCase.DogsImageByNameUseCase
import com.jmc.desafioscotiabank.utils.LiveResult

class DogsImgViewModel(val dogsUseCase: DogsImageByNameUseCase) : ViewModel() {
    val img = LiveResult<List<String>>()

    fun getImgDogs(name: String) {

        dogsUseCase.execute(liveData = img, params = name)

    }
}