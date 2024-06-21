package org.example

fun buildRomanNumeralStringFromNumber(numberLeft: Int, definedNumeralAmount: Int, numeralChar: String): String {
    return numeralChar.repeat(numberLeft.calculateFittingAmount(definedNumeralAmount))
}

fun Int.calculateLeftover(amount: Int): Int {
    return this % amount
}

fun Int.calculateFittingAmount(amount: Int): Int {
    return this / amount
}

fun Int.romanNumeral(): String {
    var resultString = ""

    resultString += buildRomanNumeralStringFromNumber(this, 1000, numeralChar = "M")
    var amountLeft = this.calculateLeftover(1000)

    if (amountLeft >= 900) {
        resultString.dropLast(1)
        resultString += "CM"
        amountLeft -= 900
    }

    resultString += buildRomanNumeralStringFromNumber(amountLeft, 500, numeralChar = "D")
    amountLeft = amountLeft.calculateLeftover(500)

    if (amountLeft >= 400) {
        resultString.dropLast(1)
        resultString += "CD"
        amountLeft -= 400
    }

    resultString += buildRomanNumeralStringFromNumber(amountLeft, 100, numeralChar = "C")
    amountLeft = amountLeft.calculateLeftover(100)

    if (amountLeft >= 90) {
        resultString.dropLast(1)
        resultString += "XC"
        amountLeft -= 90
    }

    resultString += buildRomanNumeralStringFromNumber(amountLeft, 50, numeralChar = "L")
    amountLeft = amountLeft.calculateLeftover(50)

    if (amountLeft >= 40) {
        resultString.dropLast(1)
        resultString += "XL"
        amountLeft -= 40
    }

    resultString += buildRomanNumeralStringFromNumber(amountLeft, 10, numeralChar = "X")
    amountLeft = amountLeft.calculateLeftover(10)

    if (amountLeft == 9) {
        resultString.dropLast(1)
        resultString += "IX"
    } else {
        resultString += buildRomanNumeralStringFromNumber(amountLeft, 5, numeralChar = "V")
        amountLeft = amountLeft.calculateLeftover(5)

        if (amountLeft == 4) {
            resultString.dropLast(1)
            resultString += "IV"
        } else {
            resultString += buildRomanNumeralStringFromNumber(amountLeft, 1, numeralChar = "I")
        }
    }

    return resultString
}