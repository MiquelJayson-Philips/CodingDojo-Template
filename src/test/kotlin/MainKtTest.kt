import org.example.Converter
import org.example.foo
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
}