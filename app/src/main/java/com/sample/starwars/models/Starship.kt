package com.sample.starwars.models

import com.google.gson.annotations.SerializedName

class Starship : Vehicle() {

    @SerializedName("starship_class")
    var starshipClass: String = ""

    @SerializedName("hyperdrive_rating")
    var hyperdriveRating: String = ""

    @SerializedName("MGLT")
    var mglt: String = ""
}