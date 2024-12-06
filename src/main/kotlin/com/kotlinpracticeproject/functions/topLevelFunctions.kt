package com.kotlinpracticeproject.functions

// below top level functions and properties are being called in variables.kt
const val courseName = "Kotlin Course"

fun topLevelFunctions() : Int {
    return (0..100).random()
}

fun main() {
    val num = topLevelFunctions()
    println(num)
}