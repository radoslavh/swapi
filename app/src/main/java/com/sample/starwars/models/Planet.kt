package com.sample.starwars.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Planet : Serializable {

    var name: String? = null
    var diameter: String? = null
    var gravity: String? = null
    var population: String? = null
    var climate: String? = null
    var terrain: String? = null
    var created: String? = null
    var edited: String? = null
    var url: String? = null

    @SerializedName("rotation_period")
    var rotationPeriod: String? = null

    @SerializedName("orbital_period")
    var orbitalPeriod: String? = null

    @SerializedName("surface_water")
    var surfaceWater: String? = null

    @SerializedName("residents")
    var residentsUrls: ArrayList<String>? = null

    @SerializedName("films")
    var filmsUrls: ArrayList<String>? = null
}