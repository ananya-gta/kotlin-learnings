package org.example.basics.functions

fun main() {
    printName("Ananya")
    val unit = printName("A")
    println("unit is $unit")
    val result = additionApproach1(1, 2)
    println("result of addition through approach 1 : $result")
    println("result of addition through approach 2 : ${additionApproach2(3,4)}")
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