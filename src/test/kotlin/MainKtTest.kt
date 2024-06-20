import org.example.Converter
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll

/*
*   Miquel Jayson de Leeuw
*   Convert numbers into Roman Numerals
*/

class MainKtTest {



    @Test
    fun doesConvertRomanNumeralFunReturnValue() {
        val expected = ""
        val result = converter.convertNumeral()

        assertEquals(expected, result)
    }

    companion object {
        lateinit var converter: Converter

        @JvmStatic
        @BeforeAll
        fun setup(): Unit {
            converter = Converter()
        }
    }
}