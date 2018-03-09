package com.sample.starwars.ui.planets

import com.sample.starwars.source.IDataSource
import com.sample.starwars.ui.common.BaseViewModel

class PlanetViewModel(private val remoteData: IDataSource) : BaseViewModel() {
    fun getPlanet() = remoteData.getPlanets()
}