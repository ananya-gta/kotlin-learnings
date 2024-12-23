package com.kotlinpracticeproject.interfaces

import com.kotlinpracticeproject.classes.Course

// the particular repository will manage the course.kt file
interface CourseRepository {
    val isCoursePersisted : Boolean
    // abstract method - which provides only the method signature and the implementation depends on the subclass or implementing class
    fun getById(id : Int) : Course

    // non-abstract method
    fun save(course : Course) : Int{
        println("saving ${course.name} by ${course.instructor}... saved course id is ")
        return course.id
    }
}

// kotlin allows you to extend multiple interfaces
interface Repository {
    fun getAll() : Any
}

class ReactCourseRepository : CourseRepository, Repository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course("React Learning", id,"Akshay Saini")
    }

    override fun getAll() : Any {
        return 1
    }

    override fun save(course : Course) : Int{
        isCoursePersisted = true
        return course.id
    }
}

class KotlinCourseRepository : CourseRepository {
    override val isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course("Kotlin Course", id,"Maxmillian")
    }

    // overriding the already implemented non-abstract method
    override fun save(course: Course): Int {
        println("saving through overriden save function ${course.name} by ${course.instructor}... saved course id is ")
        return course.id
    }
}

// handling conflicting functions in interfaces
interface A {
    fun doSomething() {
        println("do something in A")
    }
}

interface B {
    fun doSomething() {
        println("do something in B")
    }
}

class AB : A, B {
    override fun doSomething() {
        // using generics to prevent conflicts
        super<A>.doSomething()
        super<B>.doSomething()
        println("do something in AB")
    }
}

fun main() {
    val react = ReactCourseRepository()
    val course = react.getById(1)
    println(course)
    println(react.isCoursePersisted)
    println(react.save(course))


    val kotlin = KotlinCourseRepository()
    val course2 = kotlin.getById(2)
    println(course2)
    println(kotlin.save(course2))
    println(kotlin.save(Course("Kotlin Course", 6,"Maxmillian")))
    val ab = AB()
    ab.doSomething()
}