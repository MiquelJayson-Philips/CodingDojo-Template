import org.example.Converter
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import kotlin.test.Ignore

/*
*   Miquel Jayson de Leeuw
*   Convert numbers into Roman Numerals
*/

class MainKtTest {

    companion object {
        lateinit var converter: Converter

        @JvmStatic
        @BeforeAll
        fun setup() {
            converter = Converter()
        }
    }

    @Test
    fun calculateLeftoverOfAmount() {
        assertEquals(50, converter.calculateLeftoverOfAmount(150, 100))
    }

    @Test
    fun calculateHowManyTimesANumberFitsInCertainAmount() {
        assertEquals(1, converter.calculateFittingTimesOfAmount(150, 100))
    }

    @Test
    fun convertRomanNumeralFromNumber() {
        assertEquals("MM", converter.retrieveRomanNumeralFromNumber(2000))
    }

    @Test
    fun convertOneDefinedRomanNumeralFromNumber() {
        assertEquals("M", converter.retrieveRomanNumeralFromNumber(1000))
    }

    @Test
    fun convertTwoDefinedRomanNumeralFromNumber() {
        assertEquals("MD", converter.retrieveRomanNumeralFromNumber(1500))
    }

    @Test
    fun convertThreeDefinedRomanNumeralFromNumber() {
        assertEquals("MDC", converter.retrieveRomanNumeralFromNumber(1600))
    }

    @Test
    fun convertFourDefinedRomanNumeralFromNumber() {
        assertEquals("MDCL", converter.retrieveRomanNumeralFromNumber(1650))
    }

    @Test
    fun convertFiveDefinedRomanNumeralFromNumber() {
        assertEquals("MDCLX", converter.retrieveRomanNumeralFromNumber(1660))
    }

    @Test
    fun convertSixDefinedRomanNumeralFromNumber() {
        assertEquals("MDCLXV", converter.retrieveRomanNumeralFromNumber(1665))
    }

    @Test
    fun convertSevenDefinedRomanNumeralFromNumber() {
        assertEquals("MDCLXVI", converter.retrieveRomanNumeralFromNumber(1666))
    }

    @Test
    fun convertSpecialCaseRomanNumeralFromStandaloneNumberFour() {
        assertEquals("IV", converter.retrieveRomanNumeralFromNumber(4))
    }

    @Test
    fun convertSpecialCaseRomanNumeralFromNumberFour() {
        assertEquals("MDCLXIV", converter.retrieveRomanNumeralFromNumber(1664))
    }

    @Test
    fun convertSpecialCaseRomanNumeralFromNumberNine() {
        assertEquals("IX", converter.retrieveRomanNumeralFromNumber(9))
    }

    @Test
    fun convert39toRomanNumeral() {
        assertEquals("XXXIX", converter.retrieveRomanNumeralFromNumber(39))
    }

    @Test
    fun convert246toRomanNumeral() {
        assertEquals("CCXLVI", converter.retrieveRomanNumeralFromNumber(246))
    }

    @Test
    fun convert789toRomanNumeral() {
        assertEquals("DCCLXXXIX", converter.retrieveRomanNumeralFromNumber(789))
    }

    @Test
    fun convert2421toRomanNumeral() {
        assertEquals("MMCDXXI", converter.retrieveRomanNumeralFromNumber(2421))
    }

    @Test
    fun convert3999toRomanNumeral() {
        assertEquals("MMMCMXCIX", converter.retrieveRomanNumeralFromNumber(3999))
    }

    @Test
    fun convert1944toRomanNumeral() {
        assertEquals("MCMXLIV", converter.retrieveRomanNumeralFromNumber(1944))
    }

}