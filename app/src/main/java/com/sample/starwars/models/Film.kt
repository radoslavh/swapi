package com.sample.starwars.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Film : Serializable {

    var title: String = ""

    @SerializedName("episode_id")
    var episodeId: Int = 0

    @SerializedName("opening_crawl")
    var openingCrawl: String  = ""

    var director: String = ""
    var producer: String = ""
    var url: String = ""
    var created: String = ""
    var edited: String = ""

    @SerializedName("species")
    var speciesUrls: ArrayList<String>? = null

    @SerializedName("starships")
    var starshipsUrls: ArrayList<String>? = null

    @SerializedName("vehicles")
    var vehiclesUrls: ArrayList<String>? = null

    @SerializedName("planets")
    var planetsUrls: ArrayList<String>? = null

    @SerializedName("characters")
    var charactersUrls: ArrayList<String>? = null
}