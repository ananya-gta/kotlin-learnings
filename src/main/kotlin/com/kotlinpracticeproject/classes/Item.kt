package com.kotlinpracticeproject.classes

class Item() {
    var name: String = ""

    // secondary constructor
    constructor(_name: String) : this() {
        this.name = _name
    }
    // this() invokes the primary constructor
    // this.name = _name assigns the value of the _name parameter to the name property of the Item instance
}

fun main() {
    val item = Item("iPhone")
    println(item.name)
    item.name = "iPhone 15"
    println(item.name)
    println(item)
}