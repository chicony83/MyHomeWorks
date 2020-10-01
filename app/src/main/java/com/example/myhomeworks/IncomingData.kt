package com.example.myhomeworks

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*

class IncomingData : ViewModel() {

    var winner = false;

    var company1_potato = MutableLiveData(0)
    var company1_wheat = MutableLiveData(0)
    var company1_corn = MutableLiveData(0)

    var company2_potato = MutableLiveData(0)
    var company2_wheat = MutableLiveData(0)
    var company2_corn = MutableLiveData(0)

    var company3_potato = MutableLiveData(0)
    var company3_wheat = MutableLiveData(0)
    var company3_corn = MutableLiveData(0)


    fun incomingData() = runBlocking<Unit> {
        CoroutineScope(Dispatchers.Main).launch {
            while (!winner) {
                delay(100)
                val company = Random().num()
                var percentofHarvesting = getData(company)
                percentofHarvesting = percentofHarvesting?.plus(1)
                Log.i("TAG","percentofHarvesting = $percentofHarvesting")
                Log.i("TAG","company = $company")
                percentofHarvesting?.let { postValue(company, it) }
            }
        }
    }

    private fun postValue(company: Int, percentofHarvesting: Int) {
        when (company) {

            0 -> company1_potato.postValue(percentofHarvesting)
            1 -> company1_wheat.postValue(percentofHarvesting)
            2 -> company1_corn.postValue(percentofHarvesting)

            3 -> company2_potato.postValue(percentofHarvesting)
            4 -> company2_wheat.postValue(percentofHarvesting)
            5 -> company2_corn.postValue(percentofHarvesting)

            6 -> company3_potato.postValue(percentofHarvesting)
            7 -> company3_wheat.postValue(percentofHarvesting)
            8 -> company3_corn.postValue(percentofHarvesting)
        }
    }

    private fun getData(company: Int): Int? {
        return when (company) {
            0 -> company1_potato.value!!
            1 -> company1_wheat.value!!
            2 -> company1_corn.value!!

            3 -> company2_potato.value!!
            4 -> company2_wheat.value!!
            5 -> company2_corn.value!!

            6 -> company3_potato.value!!
            7 -> company3_wheat.value!!
            8 -> company3_corn.value!!
            else->Log.i("TAG","hevent value")
        }
    }
}