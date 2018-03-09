package com.sample.starwars.ui.films

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.radoslavhlinka.starwars.R
import com.sample.starwars.models.Film

class FilmsViewAdapter : RecyclerView.Adapter<FilmsViewHolder>() {

    private val currentList: MutableList<Film> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return FilmsViewHolder(layoutInflater.inflate(R.layout.item_layout, parent, false))
    }

    override fun onBindViewHolder(holder: FilmsViewHolder, position: Int) {
        holder.bind(currentList.elementAt(position))
    }

    override fun getItemCount(): Int {
        return currentList.size
    }

    fun addFilms(articles: List<Film>) {
        currentList.clear()
        currentList.addAll(articles)
        notifyDataSetChanged()
    }
}