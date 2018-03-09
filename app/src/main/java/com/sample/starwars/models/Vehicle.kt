package com.sample.starwars.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

open class Vehicle : Serializable {

    var name: String = ""
    var model: String = ""

    @SerializedName("vehicle_class")
    var vehicleClass: String = ""

    var manufacturer: String = ""

    @SerializedName("cost_in_credits")
    var costInCredits: String = ""

    var length: String = ""
    var crew: String = ""
    var passengers: String = ""

    @SerializedName("max_atmosphering_speed")
    var maxAtmospheringSpeed: String = ""

    @SerializedName("cargo_capacity")
    var cargoCapacity: String = ""

    var consumables: String = ""
    var created: String = ""
    var edited: String = ""
    var url: String = ""

    @SerializedName("pilots")
    var pilotsUrls: ArrayList<String>? = null

    @SerializedName("films")
    var filmsUrls: ArrayList<String>? = null
}