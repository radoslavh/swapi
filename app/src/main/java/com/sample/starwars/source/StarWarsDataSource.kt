package com.sample.starwars.source

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.sample.starwars.api.StarWarsAPI
import com.sample.starwars.api.StarWarsClient
import com.sample.starwars.models.*

class StarWarsDataSource {

    private val mClient: StarWarsAPI by lazy { StarWarsClient().getClient() }

    private val mScheduler: ISchedulers by lazy { Schedulers() }

    fun getPeople(): LiveData<StarWarsModel<Person>> {

        val receivedData = MutableLiveData<StarWarsModel<Person>>()

        mClient
                .getPeople()
                .subscribeOn(mScheduler.io())
                .observeOn(mScheduler.ui())
                .subscribe(receivedData::setValue)

        return receivedData
    }

    fun getPlanets(): LiveData<StarWarsModel<Planet>> {

        val receivedData = MutableLiveData<StarWarsModel<Planet>>()

        mClient
                .getPlanet()
                .subscribeOn(mScheduler.io())
                .observeOn(mScheduler.ui())
                .subscribe(receivedData::setValue)

        return receivedData
    }

    fun getSpecies(): LiveData<StarWarsModel<Species>> {

        val receivedData = MutableLiveData<StarWarsModel<Species>>()

        mClient
                .getSpecies()
                .subscribeOn(mScheduler.io())
                .observeOn(mScheduler.ui())
                .subscribe(receivedData::setValue)

        return receivedData
    }

    fun getStarships(): LiveData<StarWarsModel<Starship>> {

        val receivedData = MutableLiveData<StarWarsModel<Starship>>()

        mClient
                .getStarships()
                .subscribeOn(mScheduler.io())
                .observeOn(mScheduler.ui())
                .subscribe(receivedData::setValue)

        return receivedData
    }

    fun getVehicles(): LiveData<StarWarsModel<Vehicle>> {

        val receivedData = MutableLiveData<StarWarsModel<Vehicle>>()

        mClient
                .getVehicles()
                .subscribeOn(mScheduler.io())
                .observeOn(mScheduler.ui())
                .subscribe(receivedData::setValue)

        return receivedData
    }

    fun getFilms(): LiveData<StarWarsModel<Film>> {

        val receivedData = MutableLiveData<StarWarsModel<Film>>()

        mClient
                .getFilms()
                .subscribeOn(mScheduler.io())
                .observeOn(mScheduler.ui())
                .subscribe(receivedData::setValue)

        return receivedData
    }
}
