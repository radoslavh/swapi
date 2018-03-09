package com.sample.starwars.ui.people

import com.sample.starwars.source.IDataSource
import com.sample.starwars.ui.common.BaseViewModel

class PeopleViewModel(private val remoteData: IDataSource) : BaseViewModel() {
    fun getPeople() = remoteData.getPeople()
}
