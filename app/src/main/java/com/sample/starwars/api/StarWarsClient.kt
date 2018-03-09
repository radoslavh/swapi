package com.sample.starwars.api

import com.example.radoslavhlinka.starwars.BuildConfig
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class StarWarsClient {

    private var mNewsService: StarWarsAPI
    private val mHttpClient: OkHttpClient = OkHttpClient()

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(mHttpClient)
                .build()

        mNewsService = retrofit.create(StarWarsAPI::class.java)
    }

    fun getClient(): StarWarsAPI = mNewsService
}