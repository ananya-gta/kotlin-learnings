package org.example.basics

fun main() {
    for (i in 1..10) {
        println("i in break $i")
        if (i == 3)
            break
    }

    label()

    for (i in 1..10) {
        println("i in break $i")
        if (i == 3)
            return // using return will not execute any of the code that's written below the return statement
    }
    println("End of the Program!")
}

fun label() {
    loop@ for (i in 1..10) {
        println("i in label $i")
//        if (i == 3) break@loop
        innerloop@ for (j in 1..10) {
            println("j in label $j")
            if (j == 4) break@innerloop
            // if (j==4) continue@innerloop
            // the above statement will skip 4
        }
    }
}

//Labels are used to identify specific loops or blocks in Kotlin.
//You can use break@label to exit from a labeled block (even nested ones).
//You can use continue@label to skip to the next iteration of a specific loop (even in nested loops).
//They are especially useful for controlling the flow in nested loops and blocks.