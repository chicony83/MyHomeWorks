package com.example.myhomeworks.utils

import android.util.Log

object FibonacciNumbers {

    fun countFibonacci(n: Int): Int {

        if (n == 1) return 0
        if (n == 2) return 1

        var firstNum = 0
        var secondNum = 1
        var fibo = 0

        for (i in 3..n) {

            fibo = firstNum+secondNum
            firstNum = secondNum
            secondNum = fibo

        }
        return fibo
    }
}