package com.sample.starwars.ui.films

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.radoslavhlinka.starwars.databinding.FragmentFilmsBinding
import com.sample.starwars.StarWarsApplication
import com.sample.starwars.source.IDataSource
import com.sample.starwars.ui.common.BaseFragment
import io.reactivex.annotations.NonNull

class FilmsFragment : BaseFragment() {

    private val adapter: FilmsViewAdapter by lazy { FilmsViewAdapter() }
    private val viewModel: FilmsViewModel by lazy { FilmsViewModel(getDataSource()) }

    private lateinit var binding: FragmentFilmsBinding

    companion object {
        val TAG: String = FilmsFragment::class.java.simpleName
        fun newInstance() = FilmsFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savInsState: Bundle?): View? {
        binding = FragmentFilmsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
        subscribeViewModel()
    }

    private fun subscribeViewModel() {
        viewModel.getFilms().observeForever({
            adapter.addFilms(it!!.results!!)
        })
    }

    private fun initRecyclerView() {
        binding.recycleView.layoutManager = LinearLayoutManager(activity)
        binding.recycleView.adapter = adapter
        binding.recycleView.setEmptyView(binding.emptyView)
    }

    @NonNull
    private fun getDataSource(): IDataSource {
        return (activity.applicationContext as StarWarsApplication).getDataSource()
    }
}