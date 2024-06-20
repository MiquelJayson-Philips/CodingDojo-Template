package org.example

class Converter(){
    fun convertNumeral(number: Int) : String? {
        return when(number) {
            1 -> "I"
            2 -> "II"
            else -> null
        }
    }
}

fun main() {
    println("Hello World!")
}