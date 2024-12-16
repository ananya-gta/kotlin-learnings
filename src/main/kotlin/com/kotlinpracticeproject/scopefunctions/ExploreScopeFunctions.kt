package com.kotlinpracticeproject.scopefunctions

import com.kotlinpracticeproject.classes.Course
import com.kotlinpracticeproject.classes.CourseCategory

fun main() {
    exploreApply()
    exploreAlso()
    chainMultipleScopeFunctions()
    exploreLet()
    exploreWith()
}

fun exploreApply() {
    val course = Course(
        "Design Thinking in Kotlin", 1,"Akshay Saini"
    ).apply {
       courseCategory = CourseCategory.DESIGN
        // this.courseCategory = CourseCategory.DESIGN
    }
    println("course using apply : $course")
}

fun exploreAlso() {
    val course = Course(
        "Design Thinking in Kotlin", 1,"Akshay Saini"
    ).also { // used to give additional effects
        it.courseCategory = CourseCategory.DESIGN
        // this.courseCategory = CourseCategory.DESIGN
        println("Course using also : $it")
    }
//    println("course using also : $course")
}

fun chainMultipleScopeFunctions() {
    val course = Course(
        "Design Thinking in Kotlin", 1,"Akshay Saini"
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
    var name : String? = null
    var capitalize = name?.let {
        println(it)
        it.uppercase()
    }
    println(capitalize)

}

fun exploreWith() {

}