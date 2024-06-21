import org.example.romanNumeral
import org.example.calculateFittingTimesOfAmount
import org.example.calculateLeftoverOfAmount
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/*
*   Miquel Jayson de Leeuw
*   Convert numbers into Roman Numerals
*/

class MainKtTest {

    /* Utils */

    @Test
    fun calculateLeftoverOfAmount() {
        assertEquals(50, calculateLeftoverOfAmount(150, 100))
    }

    @Test
    fun calculateHowManyTimesANumberFitsInCertainAmount() {
        assertEquals(1, calculateFittingTimesOfAmount(150, 100))
    }

    /* Test Cases */

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