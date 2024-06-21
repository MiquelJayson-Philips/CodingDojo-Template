package org.example

enum class RomanNumeral(val char: String, val value: Int) {
    ONE("I", 1),
    FIVE("V", 5),
    TEN("X", 10),
    FIFTY("L", 50),
    HUNDRED("C", 100),
    FIVE_HUNDRED("D", 500),
    THOUSAND("M", 1000),
}

enum class SpecialRomanNumeral(val char: String, val value: Int) {
    FOUR("IV", 4),
    NINE("IX", 9),
    FOURTY("XL", 40),
    NINTY("XC", 90),
    FOUR_HUNDRED("CD", 400),
    NINE_HUNDRED("CM", 900),
}

fun buildRomanNumeralStringFromNumber(number: Int, numeral : RomanNumeral): String {
    val times = number.calculateAmountOfTimesItFits(numeral.value)
    return numeral.char.repeat(times)
}

fun Int.calculateLeftover(amount: Int): Int {
    return this % amount
}

fun Int.calculateAmountOfTimesItFits(amount: Int): Int {
    return this / amount
}

fun Int.romanNumeral(): String {
    var resultString = ""

    resultString += buildRomanNumeralStringFromNumber(this, RomanNumeral.THOUSAND)
    var amountLeft = this.calculateLeftover(RomanNumeral.THOUSAND.value)

    if (amountLeft >= SpecialRomanNumeral.NINE_HUNDRED.value) {
        resultString.dropLast(1)
        resultString += SpecialRomanNumeral.NINE_HUNDRED.char
        amountLeft -= SpecialRomanNumeral.NINE_HUNDRED.value
    }

    resultString += buildRomanNumeralStringFromNumber(amountLeft, RomanNumeral.FIVE_HUNDRED)
    amountLeft = amountLeft.calculateLeftover(RomanNumeral.FIVE_HUNDRED.value)

    if (amountLeft >= SpecialRomanNumeral.FOUR_HUNDRED.value) {
        resultString.dropLast(1)
        resultString += SpecialRomanNumeral.FOUR_HUNDRED.char
        amountLeft -= SpecialRomanNumeral.FOUR_HUNDRED.value
    }

    resultString += buildRomanNumeralStringFromNumber(amountLeft, RomanNumeral.HUNDRED)
    amountLeft = amountLeft.calculateLeftover(RomanNumeral.HUNDRED.value)

    if (amountLeft >= SpecialRomanNumeral.NINTY.value) {
        resultString.dropLast(1)
        resultString += SpecialRomanNumeral.NINTY.char
        amountLeft -= SpecialRomanNumeral.NINTY.value
    }

    resultString += buildRomanNumeralStringFromNumber(amountLeft, RomanNumeral.FIFTY)
    amountLeft = amountLeft.calculateLeftover(RomanNumeral.FIFTY.value)

    if (amountLeft >= SpecialRomanNumeral.FOURTY.value) {
        resultString.dropLast(1)
        resultString += SpecialRomanNumeral.FOURTY.char
        amountLeft -= SpecialRomanNumeral.FOURTY.value
    }

    resultString += buildRomanNumeralStringFromNumber(amountLeft, RomanNumeral.TEN)
    amountLeft = amountLeft.calculateLeftover(RomanNumeral.TEN.value)

    if (amountLeft == SpecialRomanNumeral.NINE.value) {
        resultString.dropLast(1)
        resultString += SpecialRomanNumeral.NINE.char
    } else {
        resultString += buildRomanNumeralStringFromNumber(amountLeft, RomanNumeral.FIVE)
        amountLeft = amountLeft.calculateLeftover(RomanNumeral.FIVE.value)

        if (amountLeft == SpecialRomanNumeral.FOUR.value) {
            resultString.dropLast(1)
            resultString += SpecialRomanNumeral.FOUR.char
        } else {
            resultString += buildRomanNumeralStringFromNumber(amountLeft, RomanNumeral.ONE)
        }
    }

    return resultString
}