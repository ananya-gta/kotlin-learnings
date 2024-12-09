package com.kotlinpracticeproject.nulls

data class Movie(
    val id: Int?,
    val title: String
)

fun main() {
    var nameNullable : String? = null
    println("Nullable Value is : ${nameNullable}")

    nameNullable = "Ananya"
    println("After manipulation Nullable Value is : ${nameNullable}")

    var name: String = "Anu"
    println("Non-nullable Value is : ${name}")

    // name = null --> cannot assign null to a non-null type string

    val movie =  Movie(null, "Avengers")
    println("before saving: $movie")
    println("after saving: ${saveMovie(movie)}")

}

fun saveMovie(movie: Movie) : Movie{
    return movie.copy(id = 1)
}