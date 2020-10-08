package com.example.myhomeworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myhomeworks.dto.coffeerSet
import kotlinx.android.synthetic.main.activity_coffee_splash_screen.*

class DZ5CoffeeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffee_splash_screen)

        val coffeeAddFragment = CoffeeAddFragment()
        val coffeeCatalogFragment = CoffeeCatalogFragment()

        addCoffee()

        button_addNewCoffee.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.fr_place,coffeeAddFragment).commit()
        }
        button_catalogCoffee.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.fr_place,coffeeCatalogFragment).commit()
        }
    }

    private fun addCoffee() {
        coffeerSet.addInCoffeeCatalog("Arabica","https://dom-eda.com/uploads/images/catalog/item/a65a48f6c4/2285f7c353_500.jpg")
    }
}