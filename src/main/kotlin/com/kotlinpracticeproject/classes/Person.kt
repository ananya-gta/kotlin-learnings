package com.kotlinpracticeproject.classes

//class Person {
//    fun action() {
//        println("Person walks.")
//    }
//}

// Primary constructor
class Person(val name: String = "", val age: Int = 0) {
    fun action() {
        println("Person walks.")
    }
}

fun main() {
    // no need to use `new` keyword to create instance of a class
    // val person = Person()
    val person = Person("Alex")
    val person1 = Person("Alex", 29)
    person.action()
    println("Name is ${person.name} and age is ${person.age}")
}