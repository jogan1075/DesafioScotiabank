package com.jmc.desafioscotiabank.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.jmc.desafioscotiabank.R
import com.jmc.desafioscotiabank.presentation.ui.adapter.viewholder.BaseViewHolder
import com.jmc.desafioscotiabank.presentation.ui.adapter.viewholder.ListaImgDogsViewHolder

class ListImgDogsAdapter : BaseAdapter<String>() {

    override fun provideComparator() = compareBy(String::toString)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<String> {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_img_dogs, parent, false)

        return ListaImgDogsViewHolder(itemView)


    }



}