package com.example.myhomeworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myhomeworks.utils.FibonacciNumbers

class DZ12FiboTestsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dz_12_fibo_tests)
        Log.i("TAG","{${FibonacciNumbers.countFibonacci(10,0,1)}}")
    }
}
