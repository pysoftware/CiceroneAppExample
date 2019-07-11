package com.magere.android.masafik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import ru.terrakok.cicerone.commands.Command
import ru.terrakok.cicerone.commands.Replace

// This example is a single activity app.
// All screens (fragments) are displayed in the container inside MainActivity.

class MainActivity : AppCompatActivity() {

    private lateinit var navigator: Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Here we use navigator from the library,
        // but it can be extended if needed.
        navigator = SupportAppNavigator(this, R.id.mainContainer)

        if (savedInstanceState == null) {
            // If the app is just started, replace all command queue
            // with the command to show the first screen.
            navigator.applyCommands(arrayOf<Command>(Replace(Screens.FilmsList())))
        }
        App.application.getNavigatorHolder().setNavigator(navigator)
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "ON RESUME", Toast.LENGTH_LONG).show()

//        App.application.getNavigatorHolder().setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "ON PAUSE", Toast.LENGTH_LONG).show()
//        App.application.getNavigatorHolder().removeNavigator()
    }

    override fun onBackPressed() {
        App.application.getRouter().exit()
    }

}
