package com.example.myhomeworks.utils

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class FibonacciNumbersTest{

    @Test
    fun checkNumberFibonacci_returns_true() {
        var result = true
        val map = mapOf(
            1 to 0,
            2 to 1,
            3 to 1,
            4 to 2,
            5 to 3,
            6 to 5,
            7 to 8,
            8 to 13,
            9 to 21,
            10 to 34,
            11 to 55
        )
        for ((key, value) in map) {
            result = (value == FibonacciNumbers.countFibonacci(key))
            assertThat(result).isTrue()
        }
    }
}