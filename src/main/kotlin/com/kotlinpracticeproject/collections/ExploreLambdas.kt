package com.kotlinpracticeproject.collections

fun main() {
    val addLambda = {x:Int -> x + x}
    val addResult = addLambda(3)
    println("addResult : $addResult")

    // multiple inputs
    val multiplyLambda = {x:Int, y:Int -> x*y}
    val multiplyResult = multiplyLambda(3, 4)
    println("multiplyResult : $multiplyResult")

    // mutliline lambda
    val subtractLambda = {x:Int, y:Int ->
        if (x > y) x-y
        else y
    }
    val subtractResult = subtractLambda(39, 4)
    println("subtractResult : $subtractResult")
}