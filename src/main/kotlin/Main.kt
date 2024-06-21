package org.example

class Converter {

    companion object {
        val commonRomanNumeralsList = listOf<Int>(1, 2, 3, 5, 10, 50, 100, 500, 1000)
    }

    fun isCommonRomanNumeral(number: Int): Boolean {
        return commonRomanNumeralsList.contains(number)
    }

    fun calculateLeftoverOfAmount(number: Int, amount: Int): Int {
        return number % amount
    }

    fun calculateFittingTimesOfAmount(number: Int, amount: Int): Int {
        return number / amount
    }

    fun buildRomanNumeralStringFromNumber(number: Int, amount: Int, numeral: String) : String {
        var resultString = ""
        val fits = calculateFittingTimesOfAmount(number, amount)

        for (i in 1..fits) {
            resultString += numeral
        }

        return resultString
    }

    fun retrieveRomanNumeralFromNumber(number: Int): String {
        return if (isCommonRomanNumeral(number)) {
            retrieveCorrelatingCommonRomanNumeral(number)
        } else {
            var resultString = ""

            resultString += buildRomanNumeralStringFromNumber(number, 1000, numeral = "M")
            val leftOverOfMs = calculateLeftoverOfAmount(number, 1000)

            resultString += buildRomanNumeralStringFromNumber(leftOverOfMs, 500, numeral = "D")
            val leftOverOfDs = calculateLeftoverOfAmount(number, 500)

            resultString += buildRomanNumeralStringFromNumber(leftOverOfDs, 100, numeral = "C")
            val leftOverOfSs = calculateLeftoverOfAmount(number, 100)

            resultString += buildRomanNumeralStringFromNumber(leftOverOfSs, 50, numeral = "L")
            val leftOverOfLs = calculateLeftoverOfAmount(number, 50)

            resultString += buildRomanNumeralStringFromNumber(leftOverOfLs, 10, numeral = "X")
            val leftOverOfXs = calculateLeftoverOfAmount(number, 10)

            resultString += buildRomanNumeralStringFromNumber(leftOverOfXs, 5, numeral = "V")
            val leftOverOfVs = calculateLeftoverOfAmount(number, 5)

            resultString += buildRomanNumeralStringFromNumber(leftOverOfVs, 1, numeral = "I")

            resultString
        }
    }

    fun retrieveCorrelatingCommonRomanNumeral(number: Int): String {
        return when (number) {
            1 -> "I"
            5 -> "V"
            10 -> "X"
            50 -> "L"
            100 -> "C"
            500 -> "D"
            1000 -> "M"
            else -> throw NotImplementedError()
        }
    }
}