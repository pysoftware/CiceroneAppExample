package com.magere.android.masafik

import androidx.fragment.app.Fragment
import com.magere.android.masafik.fragments.*
import ru.terrakok.cicerone.android.support.SupportAppScreen

// Here the app's screens are defined.
// Screens instantiate fragments
// (screens tell Navigator which fragment to create for each screen).

class Screens {

    class  Avengers: SupportAppScreen() {
        override fun getFragment(): Fragment {
            return AvengersFragment()
        }
    }

    class SpiderMan: SupportAppScreen() {
        override fun getFragment(): Fragment {
            return SpiderManOneFragment()
        }
    }

    class Thor: SupportAppScreen() {
        override fun getFragment(): Fragment {
            return ThorFragment()
        }
    }

    class Legend: SupportAppScreen() {
        override fun getFragment(): Fragment {
            return LegendFragment()
        }
    }

    class FilmsList: SupportAppScreen() {
        override fun getFragment(): Fragment {
            return FilmsListFragment()
        }
    }
}