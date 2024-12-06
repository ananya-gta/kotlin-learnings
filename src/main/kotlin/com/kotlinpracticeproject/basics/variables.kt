package com.kotlinpracticeproject.basics

import com.kotlinpracticeproject.functions.courseName
import com.kotlinpracticeproject.functions.topLevelFunctions

fun main() {
    // val declared variables are immutable
    val name : String = "Ananya"
    println(name)

    var age = 23
    println(age)
    age = 24
    println(age)

    val salary = 3000L
    println(salary)

    val course = "Kotlin Spring"
    println("course: $course and the course length is ${course.length}")

    // create a multiline
    // in general
    val multiline = "ABC \n DEF"
    println("multiline in general:\n $multiline")

    val multilineInKotlin = """
        ABC
        DEF
    """.trimIndent()
    println("multiline in Kotlin:\n $multilineInKotlin")
    println(topLevelFunctions())
    println("courseName : $courseName")
}