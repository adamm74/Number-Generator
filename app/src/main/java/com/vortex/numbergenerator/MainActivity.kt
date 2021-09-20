package com.vortex.numbergenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vortex.numbergenerator.fragment.MainMenuFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayMainMenuFragment()
    }

    private fun displayMainMenuFragment() {
        var fragment = MainMenuFragment.newInstance()
        supportFragmentManager.beginTransaction()
            .replace(R.id.activity_main, fragment, null)
            .addToBackStack(null)
            .commit()
    }

    private fun displayBingoFragment() {

    }


}
