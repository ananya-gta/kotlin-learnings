package org.example.basics

fun main() {
    val range = 1..10
    println("Values in Ascending Order")
    for (x in range) {
        println("i : $x")
    }

    val rangeDesc = 10 downTo 1
    println("Values in Descending Order")
    for (y in rangeDesc) {
        println("i : $y")
    }
    // skipping values
    println("Values in Descending Order with skip of 2")
    for (y in rangeDesc step 2) {
        println("i : $y")
    }
}