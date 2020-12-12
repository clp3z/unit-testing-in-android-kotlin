package com.clp3z.unit_testing_fundamentals.example2;

import org.junit.Assert
import org.hamcrest.CoreMatchers.`is` as Is
import org.junit.Before;
import org.junit.Test
import java.lang.Exception


/**
 * Created by Clelia López on 12/12/20
 */
class StringReverserTest {

    private lateinit var systemUnderTest: StringReverser


    @Throws(Exception::class)
    @Before
    fun setUp() {
        systemUnderTest = StringReverser()
    }

    @Test
    fun reverse_EmptyString_EmptyStringReturned() {
        val result: String = systemUnderTest.reverse("")
        Assert.assertThat(result, Is(""))
    }

    @Test
    fun reverse_SingleCharacter_SameStringReturned() {
        val result: String = systemUnderTest.reverse("a")
        Assert.assertThat(result, Is("a"))
    }

    @Test
    fun reverse_String_StringReversedReturned() {
        val result: String = systemUnderTest.reverse("Clelia")
        Assert.assertThat(result, Is("ailelC"))
    }
}