package com.clp3z.unit_testing_fundamentals.exercise2;

import org.junit.Assert
import org.hamcrest.CoreMatchers.`is` as Is
import org.junit.Before
import org.junit.Test


/**
 * Created by Clelia López on 12/12/20
 */
class StringDuplicatorTest {

    private lateinit var systemUnderTest: StringDuplicator

    @Before
    fun setUp() {
        systemUnderTest = StringDuplicator()
    }

    @Test
    fun duplicate_EmptyString_EmptyStringReturned() {
        val result: String = systemUnderTest.duplicate("")
        Assert.assertThat(result, Is(""))
    }

    @Test
    fun duplicate_String_DuplicatedStringReturned() {
        val result: String = systemUnderTest.duplicate("Hello")
        Assert.assertThat(result, Is("HelloHello"))
    }
}