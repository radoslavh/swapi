package com.sample.starwars.api

import com.sample.starwars.models.*
import io.reactivex.Single
import retrofit2.http.GET

interface StarWarsAPI {

    @GET("people")
    fun getPeople(): Single<StarWarsModel<Person>>

    @GET("planets")
    fun getPlanet(): Single<StarWarsModel<Planet>>

    @GET("films")
    fun getFilms(): Single<StarWarsModel<Film>>

    @GET("species")
    fun getSpecies(): Single<StarWarsModel<Species>>

    @GET("vehicles")
    fun getVehicles(): Single<StarWarsModel<Vehicle>>

    @GET("starships")
    fun getStarships(): Single<StarWarsModel<Starship>>
}