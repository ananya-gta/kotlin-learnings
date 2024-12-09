package com.kotlinpracticeproject.classes

open class User(val name: String) {
    open var loggedIn: Boolean = false
    open fun login() {
        println("inside user login")
    }

    private fun secret(){
        println("inside user secret")
    }

    protected open fun logout(){
        println("inside user logout")
    }
}

class Student(name: String) : User(name) {
    override var loggedIn: Boolean = false

    override fun login() {
        println("inside student login")
        super.login()
    }
// companion object is used to introduce static functionalities
    companion object {
        const val noOfCourses = 10
        fun country() = "USA"
    }
}


class Instructor(name: String) : User(name) {

    override fun login() {
        println("inside instructor login")
        super.login()
    }

    public override fun logout() {
        super.logout()
        println("inside instructor logout")
    }
}

fun main() {
    val student = Student("John")
    println("name : ${student.name}")
    student.login()
    student.loggedIn = true
    println("Logged in value is ${student.loggedIn}")

    println("Country value is ${Student.country()}")
    println("No. of courses is ${Student.noOfCourses}")
    val instructor = Instructor("Dilip")
    println("name : ${instructor.name}")
    instructor.login()

    instructor.logout()
}
