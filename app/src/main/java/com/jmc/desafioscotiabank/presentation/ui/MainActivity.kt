package com.jmc.desafioscotiabank.presentation.ui

import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jmc.desafioscotiabank.R
import com.jmc.desafioscotiabank.presentation.ui.adapter.ListDogsAdapter
import com.jmc.desafioscotiabank.presentation.viewModel.DogsViewModel
import com.jmc.desafioscotiabank.utils.observe
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.jmc.desafioscotiabank.utils.coroutines.Result
import com.jmc.desafioscotiabank.utils.startActivity


class MainActivity : AppCompatActivity() {

    private val viewModel: DogsViewModel by viewModel()

    private val connectionManager: ConnectivityManager by inject()

    private val moviesAdapter = ListDogsAdapter(manager = DogsManager())


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        with(rViewAlbums) {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = moviesAdapter


            setHasFixedSize(true)
        }

        with(viewModel) {
            observe(dogs, ::dogsObserver)

            viewModel.getAll()
        }
    }


    private fun dogsObserver(result: Result<List<String>>?) {

        when (result) {
            is Result.OnLoading -> {

            }
            is Result.OnSuccess -> {

                moviesAdapter.swapItems(new = result.value)


            }
            is Result.OnError -> {


                //todo handle error
            }
        }
    }

    inner class DogsManager : ListDogsAdapter.AdapterManager {
        override fun onItemClicked(item: String, position: Int) {
            startActivity<DetailActivity> {
                putExtra("imagen", item)
            }
        }

    }
}