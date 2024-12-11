package com.kotlinpracticeproject.collections

import com.kotlinpracticeproject.dataset.Course
import com.kotlinpracticeproject.dataset.CourseCategory
import com.kotlinpracticeproject.dataset.courseList


fun main() {
    val courseList = courseList()

    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPMENT }
    val desPredicate = { c: Course -> c.category == CourseCategory.DESIGN }

    println("------------------Exploring Filter Function--------------------")
    exploreFilter(courseList, devPredicate)
    exploreFilter(courseList, desPredicate)
    println("------------------Exploring Map Function--------------------")
    exploreMap(courseList)
    println("------------------Exploring Map & Filter Function together--------------------")
    exploreMapAndFilter(courseList, desPredicate)
}

fun exploreFilter(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {

    // it refers to the current element being processed in the list.
    courseList.
//        filter { it.category == CourseCategory.DEVELOPMENT }
    filter { predicate.invoke(it) }
        .forEach {
            println("developmentCourses : ${it.name}")
        }

// a predicate function is a function that takes an argument and returns a Boolean value (true or false).
// It is often used to test a condition or evaluate a certain criterion on data, especially in higher-order functions like filter, any, all, and none in collections
}

// map function will convert from one type to another type
fun exploreMap(courseList: MutableList<Course>) {
    val allCourseNames = courseList.map { "${it.name} - ${it.category}" }.forEach { println(it) }

    println(allCourseNames)
}

//combining map and filter functions
fun exploreMapAndFilter(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    courseList
        .filter(predicate)
        .map { "${it.name} - ${it.category}" }
        .forEach { println(it) }
}