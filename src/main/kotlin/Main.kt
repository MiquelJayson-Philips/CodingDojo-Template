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
    FORTY("XL", 40),
    NINETY("XC", 90),
    FOUR_HUNDRED("CD", 400),
    NINE_HUNDRED("CM", 900),
    NONE("", 0)
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

fun constructRomanNumeralAndReturnRemainder(inputString: String, remainder: Int, numeral: RomanNumeral, specialNumeral: SpecialRomanNumeral) : Pair<String, Int> {
    var builderString = inputString
    var remaining = remainder

    builderString += buildRomanNumeralStringFromNumber(remaining, numeral)
    remaining = remaining.calculateLeftover(numeral.value)

    if (remaining >= specialNumeral.value) {
        builderString.dropLast(1)
        builderString += specialNumeral.char
        remaining -= specialNumeral.value
    }

    return Pair(builderString, remaining)
}

fun Int.romanNumeral(): String {

    var result = constructRomanNumeralAndReturnRemainder(
        inputString = "",
        remainder = this,
        numeral =  RomanNumeral.THOUSAND,
        specialNumeral = SpecialRomanNumeral.NINE_HUNDRED
    )

    result = constructRomanNumeralAndReturnRemainder(
        inputString = result.first,
        remainder = result.second,
        numeral =  RomanNumeral.FIVE_HUNDRED,
        specialNumeral = SpecialRomanNumeral.FOUR_HUNDRED
    )

    result = constructRomanNumeralAndReturnRemainder(
        inputString = result.first,
        remainder = result.second,
        numeral =  RomanNumeral.HUNDRED,
        specialNumeral = SpecialRomanNumeral.NINETY
    )

    result = constructRomanNumeralAndReturnRemainder(
        inputString = result.first,
        remainder = result.second,
        numeral =  RomanNumeral.FIFTY,
        specialNumeral = SpecialRomanNumeral.FORTY
    )

    result = constructRomanNumeralAndReturnRemainder(
        inputString = result.first,
        remainder = result.second,
        numeral =  RomanNumeral.TEN,
        specialNumeral = SpecialRomanNumeral.NINE
    )

    result = constructRomanNumeralAndReturnRemainder(
        inputString = result.first,
        remainder = result.second,
        numeral =  RomanNumeral.FIVE,
        specialNumeral = SpecialRomanNumeral.FOUR
    )

    result = constructRomanNumeralAndReturnRemainder(
        inputString = result.first,
        remainder = result.second,
        numeral =  RomanNumeral.ONE,
        specialNumeral = SpecialRomanNumeral.NONE
    )

    return result.first

//    var resultString = result.first
//    resultString += buildRomanNumeralStringFromNumber(result.second, RomanNumeral.TEN)
//
//    var remainder = result.second
//    remainder = remainder.calculateLeftover(RomanNumeral.TEN.value)
//
//    if (remainder == SpecialRomanNumeral.NINE.value) {
//        resultString.dropLast(1)
//        resultString += SpecialRomanNumeral.NINE.char
//    } else {
//        resultString += buildRomanNumeralStringFromNumber(remainder, RomanNumeral.FIVE)
//        remainder = remainder.calculateLeftover(RomanNumeral.FIVE.value)
//
//        if (remainder == SpecialRomanNumeral.FOUR.value) {
//            resultString.dropLast(1)
//            resultString += SpecialRomanNumeral.FOUR.char
//        } else {
//            resultString += buildRomanNumeralStringFromNumber(remainder, RomanNumeral.ONE)
//        }
//    }

//    return resultString
}