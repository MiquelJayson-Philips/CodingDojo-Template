import org.example.Converter
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

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
    fun checkIfNumberIsCommonRomanNumeral() {
        assertEquals(true, converter.isCommonRomanNumeral(1000))
    }

    @Test
    fun checkIfNumberIsNotACommonRomanNumeral() {
        assertEquals(false, converter.isCommonRomanNumeral(775))
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
    fun retrieveCorrelatingCommonRomanNumeral() {
        assertEquals("M", converter.retrieveCorrelatingCommonRomanNumeral(1000))
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

}