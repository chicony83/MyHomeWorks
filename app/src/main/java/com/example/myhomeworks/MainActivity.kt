package com.example.myhomeworks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_load_img.setOnClickListener {
            val intent = Intent(this, DZ1Activity::class.java)
            startActivity(intent)
        }

        button_dz_03.setOnClickListener {
            val intent = Intent(this, DZ3Activity::class.java)
            startActivity(intent)
        }
        button_coffee_catalog.setOnClickListener{
            val intent= Intent(this,CoffeeSplashScreenActivity::class.java)
            startActivity(intent)
        }

    }
}