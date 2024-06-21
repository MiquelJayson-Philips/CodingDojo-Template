import org.example.RomanNumeral
import org.example.calculateFittingTimesOfAmount
import org.example.calculateLeftoverOfAmount
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/*
*   Miquel Jayson de Leeuw
*   Convert numbers into Roman Numerals
*/

class MainKtTest {

    @Test
    fun calculateLeftoverOfAmount() {
        assertEquals(50, calculateLeftoverOfAmount(150, 100))
    }

    @Test
    fun calculateHowManyTimesANumberFitsInCertainAmount() {
        assertEquals(1, calculateFittingTimesOfAmount(150, 100))
    }

    @Test
    fun convertRomanNumeralFromNumber() {
        assertEquals("MM", 2000.RomanNumeral())
    }

    @Test
    fun convertOneDefinedRomanNumeralFromNumber() {
        assertEquals("M", 1000.RomanNumeral())
    }

    @Test
    fun convertTwoDefinedRomanNumeralFromNumber() {
        assertEquals("MD", 1500.RomanNumeral())
    }

    @Test
    fun convertThreeDefinedRomanNumeralFromNumber() {
        assertEquals("MDC", 1600.RomanNumeral())
    }

    @Test
    fun convertFourDefinedRomanNumeralFromNumber() {
        assertEquals("MDCL", 1650.RomanNumeral())
    }

    @Test
    fun convertFiveDefinedRomanNumeralFromNumber() {
        assertEquals("MDCLX", 1660.RomanNumeral())
    }

    @Test
    fun convertSixDefinedRomanNumeralFromNumber() {
        assertEquals("MDCLXV", 1665.RomanNumeral())
    }

    @Test
    fun convertSevenDefinedRomanNumeralFromNumber() {
        assertEquals("MDCLXVI", 1666.RomanNumeral())
    }

    @Test
    fun convertSpecialCaseRomanNumeralFromStandaloneNumberFour() {
        assertEquals("IV", 4.RomanNumeral())
    }

    @Test
    fun convertSpecialCaseRomanNumeralFromNumberFour() {
        assertEquals("MDCLXIV", 1664.RomanNumeral())
    }

    @Test
    fun convertSpecialCaseRomanNumeralFromNumberNine() {
        assertEquals("IX", 9.RomanNumeral())
    }

    @Test
    fun convert39toRomanNumeral() {
        assertEquals("XXXIX", 39.RomanNumeral())
    }

    @Test
    fun convert246toRomanNumeral() {
        assertEquals("CCXLVI", 246.RomanNumeral())
    }

    @Test
    fun convert789toRomanNumeral() {
        assertEquals("DCCLXXXIX", 789.RomanNumeral())
    }

    @Test
    fun convert2421toRomanNumeral() {
        assertEquals("MMCDXXI", 2421.RomanNumeral())
    }

    @Test
    fun convert3999toRomanNumeral() {
        assertEquals("MMMCMXCIX", 3999.RomanNumeral())
    }

    @Test
    fun convert1944toRomanNumeral() {
        assertEquals("MCMXLIV", 1944.RomanNumeral())
    }

}