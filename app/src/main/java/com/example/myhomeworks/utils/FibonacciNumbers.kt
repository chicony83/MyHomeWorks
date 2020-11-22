package com.example.myhomeworks.utils

object FibonacciNumbers {

    fun validate(
        fiboNum1: Int,
        fiboNum2: Int
    ): Boolean {
        if (fiboNum1 != 0) return false
        if (fiboNum2 != 1) return false
        return true
    }

    @JvmOverloads
    tailrec fun countFibonacci(n: Int, a: Int, b: Int): Int =
        when (n) {
            0 -> a
            1 -> b
            else -> countFibonacci(n - 1, b, a + b)
        }
}