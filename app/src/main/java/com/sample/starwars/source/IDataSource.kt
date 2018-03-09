package com.sample.starwars.source

import android.arch.lifecycle.LiveData
import com.sample.starwars.models.*

interface IDataSource {

    fun getPeople(): LiveData<StarWarsModel<Person>>

    fun getPlanets(): LiveData<StarWarsModel<Planet>>

    fun getSpecies(): LiveData<StarWarsModel<Species>>

    fun getStarships(): LiveData<StarWarsModel<Starship>>

    fun getVehicles(): LiveData<StarWarsModel<Vehicle>>

    fun getFilms(): LiveData<StarWarsModel<Film>>
}