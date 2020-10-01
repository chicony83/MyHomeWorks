package com.example.myhomeworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dz_4_harvesting.*
import kotlinx.coroutines.*


class DZ4HarvestingAktivity : AppCompatActivity() {
    var winner = false;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dz_4_harvesting)

        button_incoming_data.setOnClickListener{ run() }

    }

    fun run() {

            val data = incomingData()

    }

    private fun incomingData() = runBlocking<Unit> {
        CoroutineScope(Dispatchers.Main).launch {
            while (!winner){
                delay(75)
                val rndNum = RndNum()
                var num: Int = 0
                when (rndNum) {
                    0 -> num = textView_company1_potato.text.toString().toInt()
                    1 -> num = textView_company1_wheat.text.toString().toInt()
                    2 -> num = textView_company1_corn.text.toString().toInt()
                    3 -> num = textView_company2_potato.text.toString().toInt()
                    4 -> num = textView_company2_wheat.text.toString().toInt()
                    5 -> num = textView_company2_corn.text.toString().toInt()
                    6 -> num = textView_company3_potato.text.toString().toInt()
                    7 -> num = textView_company3_wheat.text.toString().toInt()
                    8 -> num = textView_company3_corn.text.toString().toInt()
                }

                num = num.plus(1)
                Log.i("TAG", "new v = $num")
                if(num == 100){
                    winner = true
                    Toast.makeText(this@DZ4HarvestingAktivity, "есть победитель", Toast.LENGTH_SHORT).show()
                }
                when (rndNum) {
                    0 -> textView_company1_potato.text = num.toString()
                    1 -> textView_company1_wheat.text = num.toString()
                    2 -> textView_company1_corn.text = num.toString()
                    3 -> textView_company2_potato.text = num.toString()
                    4 -> textView_company2_wheat.text = num.toString()
                    5 -> textView_company2_corn.text = num.toString()
                    6 -> textView_company3_potato.text = num.toString()
                    7 -> textView_company3_wheat.text = num.toString()
                    8 -> textView_company3_corn.text = num.toString()
                }
            }
        }

    }
}


private fun RndNum(): Int {
    var rnd: Int = (0..8).random()


    Log.i("TAG", " $rnd")
    //if (rnd == 5) winner = true
    return rnd

}





