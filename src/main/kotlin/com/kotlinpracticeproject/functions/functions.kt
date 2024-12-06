package com.kotlinpracticeproject.functions

import java.time.LocalDate

fun main() {
    printName("Ananya")
    val unit = printName("A")
    println("unit is $unit")
    val result = additionApproach1(1, 2)
    println("result of addition through approach 1 : $result")
    println("result of addition through approach 2 : ${additionApproach2(3,4)}")
    printPersonDetails("dilip")
    printPersonDetails(name="dilip", dob=LocalDate.parse("2000-12-03"))
    printPersonDetails(name="dilip", dob=LocalDate.parse("2000-12-03"), email="dilip@gmail.com") // specific order is not required
}

// function parameters
// Unit is like void in java
fun printName(name: String): Unit{
    println(name)
}

//add return type of the function in function definition
fun additionApproach1(a: Int, b: Int): Int {
    return a + b
}

fun additionApproach2(a: Int, b: Int): Int = a + b

fun printPersonDetails(name : String, email : String= "", dob : LocalDate = LocalDate.now()) {
    println("Name: $name, email: $email, dob: $dob")
}