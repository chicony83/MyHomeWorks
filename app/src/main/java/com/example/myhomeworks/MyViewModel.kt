package com.example.myhomeworks

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay

class MyViewModel : ViewModel() {

    var counter = MutableLiveData<Int>(0)


    fun userClicked(){
//        CoroutineScope(Dispatchers.IO.launch){
//        }
    }
//    fun userClicked() {
//        CoroutineScope(Dispatchers.IO.launch) {
//            var c: Int? = counter.value
//            while (true) {
//delay(1000)
//                c = c?.plus(1)
//                counter.postValue(c)
//
//            }
//        }
//
//
//    }
}