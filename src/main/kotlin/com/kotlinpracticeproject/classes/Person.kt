package com.kotlinpracticeproject.classes

//class Person {
//    fun action() {
//        println("Person walks.")
//    }
//}

// Primary constructor
class Person(val name: String = "", val age: Int = 0) {
    var email : String = ""
    constructor(_email: String, _name: String="", _age:Int=0) : this(_name, _age) {
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

    val personUsingSecondaryConstructor = Person(_email="anu@gmail.com", "Alex", 7)
    println("Name is ${personUsingSecondaryConstructor.name} and age is ${personUsingSecondaryConstructor.age} and email is ${personUsingSecondaryConstructor.email}")
}
