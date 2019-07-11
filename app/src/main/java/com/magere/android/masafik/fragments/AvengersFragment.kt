package com.magere.android.masafik.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.magere.android.masafik.App
import com.magere.android.masafik.R
import com.magere.android.masafik.Screens
import kotlinx.android.synthetic.main.fragment_avengers.*
import kotlinx.android.synthetic.main.fragment_avengers.toSpiderManFilm
import kotlinx.android.synthetic.main.fragment_legend.*

class AvengersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_avengers, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toSpiderManFilm.setOnClickListener {
            App.application.getRouter().navigateTo(Screens.SpiderMan())
        }

        toLegendFilm.setOnClickListener {
            App.application.getRouter().navigateTo(Screens.Legend())
        }

        toThorFilm.setOnClickListener {
            App.application.getRouter().navigateTo(Screens.Thor())
        }

        // Delete all history
        toMainMenuu.setOnClickListener {
            App.application.getRouter().backTo(Screens.FilmsList())
        }
    }


}
