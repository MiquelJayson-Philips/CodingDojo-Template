package org.example

class Converter(){
    fun convertNumeral(number: Int) : String? {
        return when(number) {
            1 -> "I"
            else -> null
        }
    }
}

fun main() {
    println("Hello World!")
}