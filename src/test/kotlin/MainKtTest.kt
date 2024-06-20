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
    fun doesConvertRomanNumeralFunReturnSingleDigit() {
        val expected = "I"
        val result = converter.convertNumeral(1)

        assertEquals(expected, result)
    }
}