package org.example.lesson_3

fun main() {

    val userName = "Пользователь"
    val dayTimeMessage = "Добрый день, "
    val eveningTimeMessage = "Добрый вечер, "
    var greeting: String

    greeting = dayTimeMessage + userName
    println(greeting)

    greeting = eveningTimeMessage + userName
    println(greeting)

}