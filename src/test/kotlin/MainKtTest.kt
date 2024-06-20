import org.example.Converter
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

/*
*   Miquel Jayson de Leeuw
*   Convert numbers into Roman Numerals
*/

class MainKtTest {

    @Test
    fun doesConverterClassExist() {
        val converter = Converter()
    }

    @Test
    fun doesConvertRomanNumeralFunExist() {
        val converter = Converter()
        converter.convertNumeral()
    }

    @Test
    fun doesConvertRomanNumeralFunReturnValue() {
        val expected = 0

        val converter = Converter()
        val result = converter.convertNumeral()

        assertEquals(expected, result)
    }
}