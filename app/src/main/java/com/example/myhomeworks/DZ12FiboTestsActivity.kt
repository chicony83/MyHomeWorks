package com.example.myhomeworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Toast
import com.example.myhomeworks.utils.FibonacciNumbers
import kotlinx.android.synthetic.main.activity_dz_12_fibo_tests.*

class DZ12FiboTestsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dz_12_fibo_tests)
//        Log.i("TAG","{${FibonacciNumbers.countFibonacci(10,0,1)}}")
    }

    override fun onStart() {
        super.onStart()
        countFibonacciNumbers_button.setOnClickListener {
            val fibonacciNumber = fibonacciNumber.text.toString().toInt()
            if (fibonacciNumber < 1) {
                Toast.makeText(this, "enter positive number", Toast.LENGTH_SHORT).show()
            }
            if (fibonacciNumber > 47) {
                Toast.makeText(this, "enter a number up to 48", Toast.LENGTH_SHORT).show()
            } else {
                val fibonacciNumbers = FibonacciNumbers.countFibonacci(fibonacciNumber)
                countedNumberFibonacci.text = fibonacciNumbers.toString()
            }
        }
    }
}
