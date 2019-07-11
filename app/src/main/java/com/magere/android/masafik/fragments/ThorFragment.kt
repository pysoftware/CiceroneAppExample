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
import kotlinx.android.synthetic.main.fragment_thor.*
import kotlinx.android.synthetic.main.fragment_thor.toMainMenu
import kotlinx.android.synthetic.main.fragment_thor.toSpiderManFilm


class ThorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_thor, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toSpiderManFilm.setOnClickListener {
            App.application.getRouter().navigateTo(Screens.SpiderMan())
        }

        toLegendFilm.setOnClickListener {
            App.application.getRouter().navigateTo(Screens.Legend())
        }

        // Delete all history
        toMainMenu.setOnClickListener {
            App.application.getRouter().finishChain()
        }

        // Delete all history
        toMainMenu.setOnClickListener {
            App.application.getRouter().backTo(Screens.FilmsList())
        }
    }


}
