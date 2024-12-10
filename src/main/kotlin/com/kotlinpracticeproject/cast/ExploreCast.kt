package com.kotlinpracticeproject.cast

import com.kotlinpracticeproject.classes.Course

fun main() {
    val course = Course("Kotlin Practice", 1, "Ananya Gupta")

    checkType(course)
    checkType("COURSE")
    castNumber(1.0)
    // castNumber(1) // will get ClassCastException if you try to cast a value which is not compatible

    // to convert
    val number = 1
    println(checkType(number.toDouble()))
}

fun checkType(type: Any) {
    when(type) {
        // is will check if it is equal to an instance of operator
        is Course -> {
           println(type.copy())
        }
        is Double -> {
            println("is double")
        }
        is String -> {
            // TYPE HERE IS HIGHLIGHTED IN GREEN BCZ ITS SMART CASTING IN KOTLIN
            println(type.lowercase())
        }
    }
}

fun castNumber(any: Any) {
    when (any) {
        // as is used to cast a value to a certain type
        any as? Double -> { // using safe call operator
            println("value is Double")
        }
    }
}