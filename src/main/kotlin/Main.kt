package org.example

class Converter(){
    fun convertNumeral(number: Int) : String? {
        return when(number) {
            1 -> "I"
            2 -> "II"
            3 -> "III"
            4 -> "IV"
            5 -> "V"
            10 -> "X"
            50 -> "L"
            100 -> "C"
            else -> null
        }
    }
}

fun main() {
    println("Hello World!")
}