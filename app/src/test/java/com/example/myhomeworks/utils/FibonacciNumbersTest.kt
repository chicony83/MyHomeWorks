package com.example.myhomeworks.utils

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class FibonacciNumbersTest{

    @Test
    fun firstNumberIsZero_returnTrue(){
        val result = FibonacciNumbers.validate(
            0,
            1
        )
        assertThat(result).isTrue()
    }
    @Test
    fun secondNumberIsOne_returnTrue(){
        val result = FibonacciNumbers.validate(
            0,
            1
        )
        assertThat(result).isTrue()
    }

}