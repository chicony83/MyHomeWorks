package com.example.myhomeworks

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*

class IncomingData : ViewModel() {
    var winner = false;
    var company1_potato = MutableLiveData(0)


    fun incomingData() = runBlocking<Unit> {
        CoroutineScope(Dispatchers.Main).launch {
            while (!winner) {
                delay(100)
                val company = Random().num()
                var percentofHarvesting = getData(company)
                percentofHarvesting = percentofHarvesting?.plus(1)
                postValue(company, percentofHarvesting)
            }


//            while (!winner){
//                delay(75)
//                val rndNum = RndNum()
//                var num: Int = 0
//                when (rndNum) {
//                    0 -> num = textView_company1_potato.text.toString().toInt()
//                    1 -> num = textView_company1_wheat.text.toString().toInt()
//                    2 -> num = textView_company1_corn.text.toString().toInt()
//                    3 -> num = textView_company2_potato.text.toString().toInt()
//                    4 -> num = textView_company2_wheat.text.toString().toInt()
//                    5 -> num = textView_company2_corn.text.toString().toInt()
//                    6 -> num = textView_company3_potato.text.toString().toInt()
//                    7 -> num = textView_company3_wheat.text.toString().toInt()
//                    8 -> num = textView_company3_corn.text.toString().toInt()
//                }
//
//                num = num.plus(1)
//                Log.i("TAG", "new v = $num")
//                if(num == 100){
//                    winner = true
//                    Toast.makeText(this@DZ4HarvestingAktivity, "есть победитель", Toast.LENGTH_SHORT).show()
//                }
//                when (rndNum) {
//                    0 -> textView_company1_potato.text = num.toString()
//                    1 -> textView_company1_wheat.text = num.toString()
//                    2 -> textView_company1_corn.text = num.toString()
//                    3 -> textView_company2_potato.text = num.toString()
//                    4 -> textView_company2_wheat.text = num.toString()
//                    5 -> textView_company2_corn.text = num.toString()
//                    6 -> textView_company3_potato.text = num.toString()
//                    7 -> textView_company3_wheat.text = num.toString()
//                    8 -> textView_company3_corn.text = num.toString()
//                }
//            }
        }
    }

    private fun postValue(company: Int, percentofHarvesting: Int) {
        when (company) {
            0 -> company1_potato.postValue(percentofHarvesting)
            else -> company1_potato.postValue(percentofHarvesting)
        }
    }

    private fun getData(company: Int): Int {
        val num: Int?
        when (company) {
            0 -> num = company1_potato.value!!
//            1 -> num = textView_company1_wheat.text.toString().toInt()
//            2 -> num = textView_company1_corn.text.toString().toInt()
//            3 -> num = textView_company2_potato.text.toString().toInt()
//            4 -> num = textView_company2_wheat.text.toString().toInt()
//            5 -> num = textView_company2_corn.text.toString().toInt()
//            6 -> num = textView_company3_potato.text.toString().toInt()
//            7 -> num = textView_company3_wheat.text.toString().toInt()
//            8 -> num = textView_company3_corn.text.toString().toInt()
            else -> num = company1_potato.value!!
        }
        return num
    }
}