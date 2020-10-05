package com.example.myhomeworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_coffee_splash_screen.*

class DZ5CoffeeSplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffee_splash_screen)

        val coffeeAddFragment = CoffeeAddFragment()
        val coffeeSplashScreenFragment = CoffeeSplashScreenFragment()

        button_addNewCoffee.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.fr_place,coffeeAddFragment).commit()
        }
        button_catalogCoffee.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.fr_place,coffeeSplashScreenFragment).commit()
        }

    }
}