package com.kotlinpracticeproject.collections

fun main() {
    val addLambda = { x: Int -> x + x }
    val addResult = addLambda(3)
    println("addResult : $addResult")

    // multiple inputs
    val multiplyLambda = { x: Int, y: Int -> x * y }
    val multiplyResult = multiplyLambda(3, 4)
    println("multiplyResult : $multiplyResult")

    // mutliline lambda
    val subtractLambda = { x: Int, y: Int ->
        if (x > y) x - y
        else y
    }
    val subtractResult = subtractLambda(39, 4)
    println("subtractResult : $subtractResult")

    val invokeHigherOrderFunctionMethod1 = calculate(2, 3) { a, b -> a + b } // if last argument is a lambda function it can be written as : calculate(2, 3) { a, b -> a + b }
    println(invokeHigherOrderFunctionMethod1)
}

// higher order function --> a function that accepts another function --> in this case it's a lambda function
fun calculate(a: Int, b: Int, operation: (x: Int, y: Int) -> Int): Int {
    return operation(a, b)
}