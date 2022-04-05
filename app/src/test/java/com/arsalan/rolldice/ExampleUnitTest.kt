package com.arsalan.rolldice

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
//    @Test
//    fun addition_isCorrect() {
//        assertEquals(4, 2 + 2)
//    }
    @Test
    fun generetes_number(){
        val dice= Dice(6)
        val rollResult=dice.roll()
        val ro= rollResult in 1..6
        assertTrue("The value of roll Result was not between 1 and 6",ro)
    }

}