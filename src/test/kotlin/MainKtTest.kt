import org.example.*
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
        assertEquals(50, 150.calculateLeftover(100))
    }

    @Test
    fun calculateHowManyTimesANumberFitsInCertainAmount() {
        assertEquals(1, 150.calculateAmountOfTimesItFits(100))
    }

    @Test
    fun buildRepeatingRomanNumeralStringFromNumber() {
        assertEquals("M", buildRomanNumeralStringFromNumber(1000, RomanNumeral.THOUSAND))
    }

    @Test
    fun constructRomanNumeralAndReturnRemainder() {
        val result = constructRomanNumeralAndReturnRemainder(
            data = ConstructorData("", 500),
            numeral = RomanNumeral.FIVE_HUNDRED,
            specialNumeral = SpecialRomanNumeral.FOUR_HUNDRED
        )

        assertEquals("D", result.output)
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