package com.kotlinpracticeproject.classes

data class Course(
    val name: String,
    val id: Int,
    val instructor: String,
    val courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
)

enum class CourseCategory {
    DEVELOPMENT, BUSINESS, DESIGN, MARKETING
}

fun main() {
    val course1 = Course("React Learning", 1,"Akshay Saini")
    val course2 = Course("React Learning", 2,"Akshay Saini")
    println(course1)

    println("Checking object equality: ${course1 == course2}")
    println("Cloning course1")
    val course3 = course1.copy(instructor = "Ananya Gupta")
    println(course3)

    val marketingCourse = Course("Marketing Course", 4, "Aditya", CourseCategory.MARKETING)
    println(marketingCourse)
}