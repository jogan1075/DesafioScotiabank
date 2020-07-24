package com.jmc.desafioscotiabank.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.jmc.desafioscotiabank.R
import com.jmc.desafioscotiabank.presentation.ui.adapter.viewholder.BaseViewHolder
import com.jmc.desafioscotiabank.presentation.ui.adapter.viewholder.ListaDogsViewHolder
import com.jmc.desafioscotiabank.utils.onClickOnce

class ListDogsAdapter(private val manager: AdapterManager) : BaseAdapter<String>() {

    override fun provideComparator() = compareBy(String::toString)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<String> {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_dogs, parent, false)

        return ListaDogsViewHolder(itemView).also {
            with(itemView) {
                onClickOnce {
                    val item = it.resolveItem()

                    if (item != null)
                        manager.onItemClicked(item, it.adapterPosition)
                }
            }
        }

    }


    interface AdapterManager {
        fun onItemClicked(item: String, position: Int)

    }
}