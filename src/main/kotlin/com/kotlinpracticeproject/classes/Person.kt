package com.kotlinpracticeproject.classes

class Person {
    fun action() {
        println("Person walks.")
    }
}

fun main() {
    // no need to use `new` keyword to create instance of a class
    val person = Person()
    person.action()
}