package com.kotlinpracticeproject.scopefunctions

import com.kotlinpracticeproject.classes.Course
import com.kotlinpracticeproject.classes.CourseCategory

fun main() {
    // let, also, apply are extension functions can be accessed by . operator
    exploreApply()
    exploreAlso()
    chainMultipleScopeFunctions()
    exploreLet()
    // with & run scope function - not extension functions - cannot access by . operator
    exploreWith()
    exploreRun()
}

fun exploreApply() {
    val course = Course(
        "Design Thinking in Kotlin", 1, "Akshay Saini"
    ).apply {
        courseCategory = CourseCategory.DESIGN
        // this.courseCategory = CourseCategory.DESIGN
    }
    println("course using apply : $course")
}

fun exploreAlso() {
    val course = Course(
        "Design Thinking in Kotlin", 1, "Akshay Saini"
    ).also { // used to give additional effects
        it.courseCategory = CourseCategory.DESIGN
        // this.courseCategory = CourseCategory.DESIGN
        println("Course using also : $it")
    }
//    println("course using also : $course")
}

fun chainMultipleScopeFunctions() {
    val course = Course(
        "Design Thinking in Kotlin", 1, "Akshay Saini"
    ).apply {
        courseCategory = CourseCategory.DESIGN
        // this.courseCategory = CourseCategory.DESIGN
    }.also { // used to give additional effects
        it.courseCategory = CourseCategory.DESIGN
        // this.courseCategory = CourseCategory.DESIGN
        println("Course using both : $it")
    }
//    println("course using also : $course")
}

fun exploreLet() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    val result = numbers.map { it * 2 }.filter { it > 5 }
    // normally we do like this
    println("normally we do like this : $result")

//    ----USING LET------
    val sum = numbers
        .map { it * 2 }
        .filter { it > 5 }
        .let {
            println("Using let scope function: $it")
            it.sum()
        }
    println(sum)

    // example -2
    var name: String? = null
    var capitalize = name?.let {
        println(it)
        it.uppercase()
    }
    println(capitalize)

}

fun exploreWith() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    val withFunc = with(numbers) {
        println("Size is ${numbers.size}")
        println("Size using with is $size")
        numbers.plus(6)
        numbers.sum()
    }
    println("With result is : $withFunc")
}

fun exploreRun() {
    var numbers : MutableList<Int>? = null
    val result = numbers.run {
        numbers = mutableListOf(1, 2, 3, 4, 5)
        numbers?.sum()
    }
    println("Run Result is $result")

    val length = run {
        val name = "Ananya"
        println(name)
        name.length
    }
    println("Run Result is $length")
}