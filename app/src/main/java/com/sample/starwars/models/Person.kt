package com.sample.starwars.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Person : Serializable {

    var name: String = ""

    @SerializedName("birth_year")
    var birthYear: String = ""

    var gender: String = ""

    @SerializedName("hair_color")
    var hairColor: String = ""

    var height: String = ""

    @SerializedName("homeworld")
    var homeWorldUrl: String = ""

    var mass: String = ""

    @SerializedName("skin_color")
    var skinColor: String = ""

    var created: String = ""
    var edited: String = ""
    var url: String = ""

    @SerializedName("films")
    var filmsUrls: ArrayList<String>? = null

    @SerializedName("species")
    var speciesUrls: ArrayList<String>? = null

    @SerializedName("starships")
    var starshipsUrls: ArrayList<String>? = null

    @SerializedName("vehicles")
    var vehiclesUrls: ArrayList<String>? = null
}