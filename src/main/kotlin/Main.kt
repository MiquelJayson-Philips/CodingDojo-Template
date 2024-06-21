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

data class ConstructorData(
    val output: String,
    val remainder: Int
)

fun buildRomanNumeralStringFromNumber(number: Int, numeral: RomanNumeral): String {
    val times = number.calculateAmountOfTimesItFits(numeral.value)
    return numeral.char.repeat(times)
}

fun Int.calculateLeftover(amount: Int): Int {
    return this % amount
}

fun Int.calculateAmountOfTimesItFits(amount: Int): Int {
    return this / amount
}

fun constructRomanNumeral(
    data: ConstructorData,
    numeral: RomanNumeral,
    specialNumeral: SpecialRomanNumeral
): ConstructorData {
    var builderString = data.output
    var remaining = data.remainder

    builderString += buildRomanNumeralStringFromNumber(remaining, numeral)
    remaining = remaining.calculateLeftover(numeral.value)

    if (remaining >= specialNumeral.value) {
        builderString.dropLast(1)
        builderString += specialNumeral.char
        remaining -= specialNumeral.value
    }

    return ConstructorData(builderString, remaining)
}

fun Int.romanNumeral(): String {
    var result = ConstructorData("", this)

    result = constructRomanNumeral(
        data = result,
        numeral = RomanNumeral.THOUSAND,
        specialNumeral = SpecialRomanNumeral.NINE_HUNDRED
    )

    result = constructRomanNumeral(
        data = result,
        numeral = RomanNumeral.FIVE_HUNDRED,
        specialNumeral = SpecialRomanNumeral.FOUR_HUNDRED
    )

    result = constructRomanNumeral(
        data = result,
        numeral = RomanNumeral.HUNDRED,
        specialNumeral = SpecialRomanNumeral.NINETY
    )

    result = constructRomanNumeral(
        data = result,
        numeral = RomanNumeral.FIFTY,
        specialNumeral = SpecialRomanNumeral.FORTY
    )

    result = constructRomanNumeral(
        data = result,
        numeral = RomanNumeral.TEN,
        specialNumeral = SpecialRomanNumeral.NINE
    )

    result = constructRomanNumeral(
        data = result,
        numeral = RomanNumeral.FIVE,
        specialNumeral = SpecialRomanNumeral.FOUR
    )

    result = constructRomanNumeral(
        data = result,
        numeral = RomanNumeral.ONE,
        specialNumeral = SpecialRomanNumeral.NONE
    )

    return result.output
}