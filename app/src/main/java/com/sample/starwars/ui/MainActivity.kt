package com.sample.starwars.ui

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.radoslavhlinka.starwars.R
import com.example.radoslavhlinka.starwars.databinding.ActivityMainBinding
import com.sample.starwars.ui.films.FilmsFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        initFragment()
    }

    private fun initFragment() {
        val fm = fragmentManager
        val tag = FilmsFragment.TAG
        fm.findFragmentByTag(tag) ?: FilmsFragment.newInstance().apply {
            fm.beginTransaction()
                    .add(R.id.container, this, tag)
                    .commit()
        }
    }
}
