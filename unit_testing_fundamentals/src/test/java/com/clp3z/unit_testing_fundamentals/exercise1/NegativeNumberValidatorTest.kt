package com.clp3z.unit_testing_fundamentals.exercise1;

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as Is

/**
 * Created by Clelia López on 12/12/20
 */
class NegativeNumberValidatorTest {

    private lateinit var subjectUnderTest: NegativeNumberValidator

    @Before
    fun initialize() {
        subjectUnderTest = NegativeNumberValidator()
    }

    @Test
    fun test1() {
        val result = subjectUnderTest.isNegative(3)
        Assert.assertThat(result, Is(false))
    }

    @Test
    fun test2() {
        val result = subjectUnderTest.isNegative(0)
        Assert.assertThat(result, Is(false))
    }

    @Test
    fun test3() {
        val result = subjectUnderTest.isNegative(-1)
        Assert.assertThat(result, Is(true))
    }
}