package com.example.myhomeworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.fragment_dz_7_splash.*

class DZ7Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dz_7)

        val dZ7SplashFragment = DZ7SplashFragment()
        val dZ7CardFragment = DZ7CardFragment()

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_layout, dZ7SplashFragment)
            .addToBackStack(null)
            .commit()

    }
}