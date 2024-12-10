package com.kotlinpracticeproject.collections

fun main() {

    // immutable list
    val names = listOf("Alex", "Ben", "Chloe")
    println("Names: $names")

    // mutable list
    val namesMutableList = mutableListOf("Alex", "Ben", "Chloe")
    println("namesMutableList: $namesMutableList")
    namesMutableList.add("Dan")
    println("namesMutableList: $namesMutableList")

    // create a set --> immutable
    val set = setOf("Damon", "Elena")
    println("set: $set")

    val mutableSet = mutableSetOf("Damon", "Elena")
    println("mutableSet before: $mutableSet")
    mutableSet.add("Fin")
    println("mutableSet after: $mutableSet")

    // HashMap
    val nameAgeMap = mapOf("Damon" to 40, "Elena" to 34)
    println("nameAgeMap: $nameAgeMap")

    val mutableNameAgeMap = mutableMapOf("Damon" to 40, "Elena" to 34)
    println("mutableNameAgeMap: $mutableNameAgeMap")
    mutableNameAgeMap["Damon"] = 44
    mutableNameAgeMap.put("Garfield", 100) // or mutableNameAgeMap["Garfield"] = 100
    println("mutableNameAgeMap: $mutableNameAgeMap")



}