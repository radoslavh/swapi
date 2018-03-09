package com.sample.starwars.ui.films

import com.sample.starwars.source.IDataSource
import com.sample.starwars.ui.common.BaseViewModel

class FilmsViewModel(private val remoteData: IDataSource): BaseViewModel() {

    fun getFilms() = remoteData.getFilms()
}