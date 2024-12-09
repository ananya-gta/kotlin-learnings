package com.kotlinpracticeproject.classes

open class User(val name: String) {
    open var loggedIn: Boolean = false
    open fun login() {
        println("inside user login")
    }
}

class Student(name: String) : User(name) {
    override var loggedIn: Boolean = false
    override fun login() {
        println("inside student login")
        super.login()
    }
}

class Instructor(name: String) : User(name) {
    override fun login() {
        println("inside instructor login")
        super.login()
    }
}

fun main() {
    val student = Student("John")
    println("name : ${student.name}")
    student.login()
    student.loggedIn = true
    val instructor = Instructor("Dilip")
    println("name : ${instructor.name}")
    instructor.login()
}
