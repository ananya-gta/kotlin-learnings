package org.example.basics

fun main() {
    for (i in 1..10) {
        println(i)
        if (i / 3 == 4)
            break
    }
}