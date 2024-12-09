package com.kotlinpracticeproject.classes

object Authenticate {
    fun authenticate(username: String, password: String){
        println("Authenticating $username with password $password")
    }
}

fun main() {
    Authenticate.authenticate("Ananya", "radheradhe")
}