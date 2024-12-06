package com.kotlinpracticeproject.basics

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

    exploreWhile()
    exploreDoWhile()
}

fun exploreWhile() {
    var x = 1
    while (x < 10) {
        println("Value of x is $x")
        ++x
    }
}

fun exploreDoWhile() {
    var x = 0
    do {
        println("Value of x is $x")
        x++
    } while (x < 10)

}