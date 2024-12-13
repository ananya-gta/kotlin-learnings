package com.kotlinpracticeproject.collections

import com.kotlinpracticeproject.dataset.Course
import com.kotlinpracticeproject.dataset.CourseCategory
import com.kotlinpracticeproject.dataset.courseList

// asSequence() is useful when you want to chain operations
// like map(), filter(), or flatMap() on a collection
// without immediately creating intermediate collections.
// This avoids the overhead of creating multiple intermediate collections
// when performing transformations.

fun main() {
    println("List using Sequence: ${
        listOf("A", "B", "C")
            .asSequence() // asSequence() converts the list into a lazy sequence
            .filter { it != "B" }
            .map { it.lowercase() }
            .toList() // toList() forces the sequence to be evaluated, converting it back to a list.
    }")
    exploreFilterUsingSequence(courseList(), { c: Course -> c.category == CourseCategory.MARKETING })

    val range = 1..1000000000
    range
        .asSequence() // if you have a collection too large then asSequence is the beneficial to use
        .map { it.toDouble() }
        .take(40) // take the first 40 records from the range
        .forEach { println(it) }

}

fun exploreFilterUsingSequence(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {

    courseList
        .asSequence()
        .filter { predicate.invoke(it) }
        .forEach {
            println("developmentCourses : ${it.name}")
        }
}
