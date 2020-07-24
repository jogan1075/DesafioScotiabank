package com.jmc.desafioscotiabank.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.jmc.desafioscotiabank.R
import com.jmc.desafioscotiabank.presentation.ui.adapter.ListImgDogsAdapter
import com.jmc.desafioscotiabank.presentation.viewModel.DogsImgViewModel
import com.jmc.desafioscotiabank.utils.observe
import kotlinx.android.synthetic.main.activity_detail.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.jmc.desafioscotiabank.utils.coroutines.Result

class DetailActivity : AppCompatActivity() {

    private val viewModel: DogsImgViewModel by viewModel()

    private val dogsAdapter = ListImgDogsAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val item = intent.getStringExtra("imagen")

        with(recicler) {
            layoutManager = GridLayoutManager(this@DetailActivity, 2)
            adapter = dogsAdapter

            setHasFixedSize(true)
        }

        with(viewModel) {
            observe(img, ::dogsObserver)
            viewModel.getImgDogs(item)
        }


    }

    private fun dogsObserver(result: Result<List<String>>?) {

        when (result) {
            is Result.OnLoading -> {

            }
            is Result.OnSuccess -> {
                dogsAdapter.swapItems(new = result.value)
            }
            is Result.OnError -> {
                //todo handle error
            }
        }
    }

}