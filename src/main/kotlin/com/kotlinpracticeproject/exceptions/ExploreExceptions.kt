package com.kotlinpracticeproject.exceptions

fun main() {
    println("${nameLength("Ananya")}")
    println("${nameLength(null)}") // null assertion will throw NullPointerException
    returnNothing()
}

fun nameLength(name: String?): Int? { // return type of this function is nullableInt
    return try { // try block is also an expression
        name!!.length
    } catch (e : Exception) {
        println("Exception : ${e}")
        null
    }
}


// never returns anything
fun returnNothing() : Nothing{
    throw RuntimeException("Exception")
}