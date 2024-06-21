package org.example

fun calculateLeftoverOfAmount(number: Int, amount: Int): Int {
    return number % amount
}

fun calculateFittingTimesOfAmount(number: Int, amount: Int): Int {
    return number / amount
}

fun buildRomanNumeralStringFromNumber(number: Int, amount: Int, numeral: String): String {
    var resultString = ""
    val fits = calculateFittingTimesOfAmount(number, amount)

    for (i in 1..fits) {
        resultString += numeral
    }

    return resultString
}

fun Int.romanNumeral(): String {
    var resultString = ""

    resultString += buildRomanNumeralStringFromNumber(this, 1000, numeral = "M")
    var amountLeft = calculateLeftoverOfAmount(this, 1000)

    if (amountLeft >= 900) {
        resultString.dropLast(1)
        resultString += "CM"
        amountLeft -= 900
    }

    resultString += buildRomanNumeralStringFromNumber(amountLeft, 500, numeral = "D")
    amountLeft = calculateLeftoverOfAmount(amountLeft, 500)

    if (amountLeft >= 400) {
        resultString.dropLast(1)
        resultString += "CD"
        amountLeft -= 400
    }

    resultString += buildRomanNumeralStringFromNumber(amountLeft, 100, numeral = "C")
    amountLeft = calculateLeftoverOfAmount(amountLeft, 100)

    if (amountLeft >= 90) {
        resultString.dropLast(1)
        resultString += "XC"
        amountLeft -= 90
    }

    resultString += buildRomanNumeralStringFromNumber(amountLeft, 50, numeral = "L")
    amountLeft = calculateLeftoverOfAmount(amountLeft, 50)

    if (amountLeft >= 40) {
        resultString.dropLast(1)
        resultString += "XL"
        amountLeft -= 40
    }

    resultString += buildRomanNumeralStringFromNumber(amountLeft, 10, numeral = "X")
    amountLeft = calculateLeftoverOfAmount(amountLeft, 10)

    if (amountLeft == 9) {
        resultString.dropLast(1)
        resultString += "IX"
    } else {
        resultString += buildRomanNumeralStringFromNumber(amountLeft, 5, numeral = "V")
        amountLeft = calculateLeftoverOfAmount(amountLeft, 5)

        if (amountLeft == 4) {
            resultString.dropLast(1)
            resultString += "IV"
        } else {
            resultString += buildRomanNumeralStringFromNumber(amountLeft, 1, numeral = "I")
        }
    }

    return resultString
}