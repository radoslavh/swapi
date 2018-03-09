package com.sample.starwars.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Species : Serializable {

    var name: String = ""
    var classification: String = ""
    var designation: String = ""

    @SerializedName("average_height")
    var averageHeight: String = ""

    @SerializedName("average_lifespan")
    var averageLifespan: String = ""

    @SerializedName("eye_colors")
    var eyeColors: String = ""

    @SerializedName("hair_colors")
    var hairColors: String = ""

    @SerializedName("skin_colors")
    var skinColors: String = ""

    @SerializedName("homeworld")
    var homeWorld: String = ""

    var language: String = ""
    var created: String = ""
    var edited: String = ""
    var url: String = ""

    @SerializedName("people")
    var peopleUrls: ArrayList<String>? = null

    @SerializedName("films")
    var filmsUrls: ArrayList<String>? = null
}