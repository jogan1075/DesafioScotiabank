package com.jmc.desafioscotiabank.presentation.ui.adapter.viewholder

import android.view.View
import kotlinx.android.synthetic.main.item_dogs.view.*

class ListaDogsViewHolder(
    itemView: View
): BaseViewHolder<String>(itemView) {



    override fun bindView(item: String) {
        with(itemView) {
            titleView.text = item

        }
    }
}