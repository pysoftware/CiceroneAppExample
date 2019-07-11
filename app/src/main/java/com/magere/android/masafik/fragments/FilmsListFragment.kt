package com.magere.android.masafik.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.magere.android.masafik.App

import com.magere.android.masafik.R
import com.magere.android.masafik.Screens
import kotlinx.android.synthetic.main.fragment_films_list.*

class FilmsListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_films_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toSpiderManFilm.setOnClickListener {
            App.application.getRouter().navigateTo(Screens.SpiderMan())
        }

        toThorFilm.setOnClickListener {
            App.application.getRouter().navigateTo(Screens.Thor())
        }

        toAvengersFilm.setOnClickListener {
            App.application.getRouter().navigateTo(Screens.Avengers())
        }

        toLegendFilm.setOnClickListener {
            App.application.getRouter().navigateTo(Screens.Legend())
        }
    }


}
