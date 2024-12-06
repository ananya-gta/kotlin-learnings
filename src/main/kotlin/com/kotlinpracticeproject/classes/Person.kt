package com.kotlinpracticeproject.classes

//class Person {
//    fun action() {
//        println("Person walks.")
//    }
//}

// Primary constructor
class Person(val name: String = "", val age: Int = 0) {
    var email: String = ""
    var nameLength = 0

    // The init block allows you to run some initialization logic when an instance of the class is created, typically for setting up the initial state or performing validation
    // It is executed when the constructor of the class is called, and it runs before the rest of the class's properties and methods can be accessed
    init {
        println("Inside Init block")
        nameLength = name.length
    }
    constructor(_email: String, _name: String = "", _age: Int = 0) : this(_name, _age) {
        this.email = _email
    }

    fun action() {
        println("Person walks.")
    }
}

fun main() {
    // no need to use `new` keyword to create instance of a class
    // val person = Person()
    val person = Person("Alex")
    // val person = Person("Alex", 29)
    person.action()
    println("Name is ${person.name} and age is ${person.age}")

    val personUsingSecondaryConstructor = Person(_email = "anu@gmail.com", "Alex", 7)
    println("Name is ${personUsingSecondaryConstructor.name} and age is ${personUsingSecondaryConstructor.age} and email is ${personUsingSecondaryConstructor.email} and name length is ${personUsingSecondaryConstructor.nameLength}")
}
