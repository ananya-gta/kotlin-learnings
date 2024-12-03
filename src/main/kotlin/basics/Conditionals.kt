package org.example.basics

fun main() {
    // if-else
    //when
// ---------------------USING VAL WITH IF-ELSE--------------------------------
//    val name = "Alex"
//    if (name.length == 4) {
//        println("Name is of 4 characters")
//    } else {
//        println("Name is not of 4 characters")
//    }
// -----------------------USING VAR WITH IF-ELSE------------------------------
//    var name = "Alex"
//    name = "Chloe"
//    if (name.length == 4) {
//        println("Name is of 4 characters")
//    } else {
//        println("Name is not of 4 characters")
//    }
// -------------------USING IF-ELSE AS A VARIABLE OR EXPRESSION WILL ALWAYS RETURN A VALUE----------------------------------
    var name = "Alex"
    name = "Chloe"
    val result = if (name.length == 4) {
        println("Name is of 4 characters")
        name // RETURN VALUE
    } else {
        println("Name is not of 4 characters")
        name.length
    }
    println("result : $result")
}