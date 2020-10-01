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

        val viewModelProvider = ViewModelProvider(this).get(IncomingData::class.java)

        addDataInModelProviderData(viewModelProvider)

        button_incoming_data.setOnClickListener {
            viewModelProvider.incomingData()
        }
    }

    private fun addDataInModelProviderData(viewModelProvider: IncomingData) {

        viewModelProvider.company1_potato.observe(this,
            { newCounterData ->
                textView_company1_potato.text = newCounterData.toString()
            }
        )
        viewModelProvider.company1_wheat.observe(this,
            { newCounterData ->
                textView_company1_wheat.text = newCounterData.toString()
            }
        )
        viewModelProvider.company1_corn.observe(this,
            { newCounterData ->
                textView_company1_corn.text = newCounterData.toString()
            }
        )
        viewModelProvider.company2_potato.observe(this,
            { newCounterData ->
                textView_company2_potato.text = newCounterData.toString()
            }
        )
        viewModelProvider.company2_wheat.observe(this,
            { newCounterData ->
                textView_company2_wheat.text = newCounterData.toString()
            }
        )
        viewModelProvider.company2_corn.observe(this,
            { newCounterData ->
                textView_company2_corn.text = newCounterData.toString()
            }
        )
        viewModelProvider.company3_potato.observe(this,
            { newCounterData ->
                textView_company3_potato.text = newCounterData.toString()
            }
        )
        viewModelProvider.company3_wheat.observe(this,
            { newCounterData ->
                textView_company3_wheat.text = newCounterData.toString()
            }
        )
        viewModelProvider.company3_corn.observe(this,
            { newCounterData ->
                textView_company3_corn.text = newCounterData.toString()
            }
        )
    }
}






