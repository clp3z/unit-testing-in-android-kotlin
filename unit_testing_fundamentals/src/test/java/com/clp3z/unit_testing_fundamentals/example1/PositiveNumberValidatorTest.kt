package com.clp3z.unit_testing_fundamentals.example1

import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as Is

/**
 * Created by Clelia López on 12/12/20
 */
class PositiveNumberValidatorTest {

    private lateinit var subjectUnderTest: com.clp3z.unit_testing_fundamentals.example1.PositiveNumberValidator

    @Before
    fun initialize() {
        subjectUnderTest = com.clp3z.unit_testing_fundamentals.example1.PositiveNumberValidator()
    }

    @Test
    fun test1() {
        val result = subjectUnderTest.isNumberPositive(-1)
        assertThat(result, Is(false))
    }

    @Test
    fun test2() {
        val result = subjectUnderTest.isNumberPositive(0)
        assertThat(result, Is(false))
    }

    @Test
    fun test3() {
        val result = subjectUnderTest.isNumberPositive(3)
        assertThat(result, Is(true))
    }
}

