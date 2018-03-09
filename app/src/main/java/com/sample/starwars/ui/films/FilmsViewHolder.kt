package com.sample.starwars.ui.films

import android.support.v7.widget.RecyclerView
import android.view.View
import com.sample.starwars.models.Film
import kotlinx.android.synthetic.main.item_layout.view.*

class FilmsViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(film: Film) = with(itemView) {
        itemView.item_title.text = film.title
    }
}