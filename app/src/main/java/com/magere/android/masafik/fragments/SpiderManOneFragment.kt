package com.magere.android.masafik.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.magere.android.masafik.App
import com.magere.android.masafik.R
import com.magere.android.masafik.Screens
import kotlinx.android.synthetic.main.fragment_legend.*
import kotlinx.android.synthetic.main.fragment_spider_man_one.*
import kotlinx.android.synthetic.main.fragment_spider_man_one.toAvengersFilm
import kotlinx.android.synthetic.main.fragment_spider_man_one.toMainMenu


class SpiderManOneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_spider_man_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toThorFilm.setOnClickListener {
            App.application.getRouter().navigateTo(Screens.Thor())
        }

        toAvengersFilm.setOnClickListener {
            App.application.getRouter().navigateTo(Screens.Avengers())
        }

        toMainMenu.setOnClickListener {
            App.application.getRouter().finishChain()
        }

        // Delete all history
        toMainMenu.setOnClickListener {
            App.application.getRouter().backTo(Screens.FilmsList())
        }
    }


}
