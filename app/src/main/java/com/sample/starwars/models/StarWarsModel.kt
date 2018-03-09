package com.sample.starwars.models

import android.text.TextUtils
import java.io.Serializable

class StarWarsModel<T> : Serializable {

    var count: Int = 0
    var next: String = ""
    var previous: String = ""
    var results: List<T>? = null

    fun hasMore(): Boolean = !TextUtils.isEmpty(next)
}