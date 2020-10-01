package com.example.myhomeworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_dz_4_harvesting.*


open class DZ4HarvestingAktivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dz_4_harvesting)

//        val incomingData = IncomingData()

        val incomingData = ViewModelProvider(this).get(IncomingData::class.java)

        incomingData.company1_potato.observe(this,
            { newCounterData ->
                textView_company1_potato.text = newCounterData.toString()
            }
        )

        button_incoming_data.setOnClickListener {
            incomingData.incomingData()
        }
    }
}






