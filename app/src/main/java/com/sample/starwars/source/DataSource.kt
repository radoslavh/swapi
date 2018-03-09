package com.sample.starwars.source

import android.arch.lifecycle.LiveData
import com.sample.starwars.models.*
import io.reactivex.Single

class DataSource : IDataSource {

    private val mRemoteDataSource: StarWarsDataSource
            by lazy { StarWarsDataSource() }

    override fun getPeople(): LiveData<StarWarsModel<Person>>
            = mRemoteDataSource.getPeople()

    override fun getPlanets(): LiveData<StarWarsModel<Planet>>
            = mRemoteDataSource.getPlanets()

    override fun getSpecies(): LiveData<StarWarsModel<Species>>
            = mRemoteDataSource.getSpecies()

    override fun getStarships(): LiveData<StarWarsModel<Starship>>
            = mRemoteDataSource.getStarships()

    override fun getVehicles(): LiveData<StarWarsModel<Vehicle>>
            = mRemoteDataSource.getVehicles()

    override fun getFilms(): LiveData<StarWarsModel<Film>>
            = mRemoteDataSource.getFilms()
}