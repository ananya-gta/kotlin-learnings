package com.kotlinpracticeproject.classes

class Item() {
    var name: String = ""
        get() = field
        set(value) {
            if (value == "iPhone") {
                field = value + "14"
            }
        }
    var price: Double = 0.0
        // The keyword field refers to the backing field of the property
        // get() = field
        get() {
            println("Inside getter function")
            return field
        }
        set(value) {
            if (value >= 0.0) {
                println("Inside setter function")
                field = value
            } else throw IllegalArgumentException("Value can't be negative.")
        }

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
    item.name = "iPhone"
    println(item.name)
    item.price = 10.0
    println(item.price)
}