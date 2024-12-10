package com.kotlinpracticeproject.nulls

data class Movie(
    val id: Int?,
    val title: String
)

fun main() {
    var nameNullable : String? = null
//    printName(nameNullable!!) // will give null pointer exception
    // to prevent this
    nameNullable?.run {
        printName(this)
    }
    println("Nullable Value is : ${nameNullable}")
    println("Length of Nullable Value using safe call operator is : ${nameNullable?.length}")
    nameNullable = "Alex"
    println("Length of Nullable Value using safe call operator is : ${nameNullable.length}")

    // elvis operator is used to provide a default value when a nullable expression is null
    nameNullable = null
    val length = nameNullable?.length ?: 0
    println("Length of Nullable Value using elvis operator is : ${length}")

    nameNullable = "Ananya"
    println("After manipulation Nullable Value is : ${nameNullable}")

    var name: String = "Anu"
    println("Non-nullable Value is : ${name}")

    // name = null --> cannot assign null to a non-null type string

    val movie =  Movie(null, "Avengers")
    println("before saving: $movie")
    val savedMovie = saveMovie(movie)
    //  non-null assertion is used to assert that a value is not null, and it will throw a NullPointerException (NPE) if the value is actually null
    println(savedMovie.id!!)
    println("after saving: ${savedMovie.id}")

}

fun saveMovie(movie: Movie) : Movie{
    return movie.copy(id = 1)
}

fun printName(name: String) {
    println("Name: $name")
}