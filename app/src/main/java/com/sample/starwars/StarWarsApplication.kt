package com.sample.starwars

import android.app.Application
import com.sample.starwars.source.IDataSource
import com.sample.starwars.source.DataSource
import io.reactivex.annotations.NonNull

class StarWarsApplication : Application() {

    @NonNull
    private lateinit var mDataSource: IDataSource

    override fun onCreate() {
        super.onCreate()
        mDataSource = DataSource()
    }

    @NonNull
    fun getDataSource(): IDataSource = mDataSource
}