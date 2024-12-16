package com.kotlinpracticeproject.scopefunctions

import com.kotlinpracticeproject.classes.Course
import com.kotlinpracticeproject.classes.CourseCategory

fun main() {
    exploreApply()
    exploreAlso()
    chainMultipleScopeFunctions()
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