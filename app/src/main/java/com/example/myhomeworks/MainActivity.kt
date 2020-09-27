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


//val myViewModel = ViewModelProvider()
        val myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        myViewModel.counter.observe(this, Observer {newCounterData->
            text_view.text = newCounterData.toString()
        })

//        text_view.text = myViewModel.counter.toString()
//
//        lifecycle.addObserver(MyLifeCycleObserver(this))

        button_load_img.setOnClickListener {
            val intent = Intent(this, DZ1Activity::class.java)
            startActivity(intent)
        }

        button_dz_03.setOnClickListener {
            val intent = Intent(this, DZ3Activity::class.java)
            startActivity(intent)
        }

        button_add_1.setOnClickListener{
myViewModel.userClicked()
        }
    }
}