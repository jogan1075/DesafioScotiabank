package com.jmc.desafioscotiabank.presentation.ui.adapter.viewholder

import android.view.View
import com.bumptech.glide.Glide
import com.github.florent37.glidepalette.BitmapPalette
import com.github.florent37.glidepalette.GlidePalette
import kotlinx.android.synthetic.main.item_img_dogs.view.*

class ListaImgDogsViewHolder(
    itemView: View
): BaseViewHolder<String>(itemView) {



    override fun bindView(item: String) {
        with(itemView) {

            item?.let {
                Glide.with(context)
                    .load( it)
                    .listener(
                        GlidePalette.with( it)
                            .use(BitmapPalette.Profile.VIBRANT)
                            .intoBackground(posterView)
                            .crossfade(true)
                    )
                    .into(posterView)
            }

        }
    }
}