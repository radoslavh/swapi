package com.sample.starwars.source

import io.reactivex.Scheduler

interface ISchedulers {

    fun io(): Scheduler

    fun ui(): Scheduler
}