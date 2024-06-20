import org.example.Converter
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll

/*
*   Miquel Jayson de Leeuw
*   Convert numbers into Roman Numerals
*/

class MainKtTest {

    companion object {
        lateinit var converter: Converter

        @JvmStatic
        @BeforeAll
        fun setup(): Unit {
            converter = Converter()
        }
    }

    @Test
    fun doesConvertRomanNumeralReturnNullOnInvalidInput() {
        val result = converter.convertNumeral(0)
        assertNull(result)
    }

    @Test
    fun doesConvertRomanNumeralReturnIWithOne() {
        val result = converter.convertNumeral(1)
        assertEquals("I", result)
    }

    @Test
    fun doesConvertRomanNumeralReturnIIWithTwo() {
        val result = converter.convertNumeral(2)
        assertEquals("II", result)
    }

    @Test
    fun doesConvertRomanNumeralReturnIIIWithThree() {
        val result = converter.convertNumeral(3)
        assertEquals("III", result)
    }

    @Test
    fun doesConvertRomanNumeralReturnIVWithFour() {
        val result = converter.convertNumeral(4)
        assertEquals("IV", result)
    }

    @Test
    fun doesConvertRomanNumeralReturnVWithFive() {
        val result = converter.convertNumeral(5)
        assertEquals("V", result)
    }

    @Test
    fun doesConvertRomanNumeralReturnXWithTen() {
        val result = converter.convertNumeral(10)
        assertEquals("X", result)
    }

    @Test
    fun doesConvertRomanNumeralReturnLWithFifty() {
        val result = converter.convertNumeral(50)
        assertEquals("L", result)
    }

    @Test
    fun doesConvertRomanNumeralReturnCWithHundred() {
        val result = converter.convertNumeral(100)
        assertEquals("C", result)
    }

    @Test
    fun calculateRomanNumeralLeftover() {
        val result = converter.calculateLeftover(100)
        assertEquals(50, result)
    }
}