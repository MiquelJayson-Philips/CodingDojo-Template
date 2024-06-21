package org.example

enum class RomanNumeral(val char: String, val value: Int) {
    M("M", 1000),
    CM("CM", 900),
    D("D", 500),
    CD("CD", 400),
    C("C", 100),
    XC("XC", 90),
    L("L", 50),
    XL("XL", 40),
    X("X", 10),
    IX("IX", 9),
    V("V", 5),
    IV("IV", 4),
    I("I", 1),
}

fun Int.romanNumeral(): String {
    var remainder = this
    var output = ""

    RomanNumeral.entries.forEach { numeral ->
        while(remainder >= numeral.value){
            output += numeral.char
            remainder -= numeral.value
        }
    }

    return output
}