import org.example.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/*
*   Miquel Jayson de Leeuw
*   Convert numbers into Roman Numerals
*/

class MainKtTest {

    @Test
    fun doesRomanNumeralAcceptAllPossibilities() {
        assertEquals("MDCLXVI", 1666.romanNumeral())
    }

    @Test
    fun doesRomanNumeralAcceptSpecialCasesWithFour() {
        assertEquals("CDXLIV", 444.romanNumeral())
    }

    @Test
    fun doesRomanNumeralAcceptSpecialCasesWithNine() {
        assertEquals("MMMCMXCIX", 3999.romanNumeral())
    }
}