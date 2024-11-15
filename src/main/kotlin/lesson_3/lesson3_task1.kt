package org.example.lesson_3

fun main() {

    val userName = "Пользователь"
    val dayTimeMessage = "Добрый день, "
    val eveningTimeMessage = "Добрый вечер, "

    val dayTime = 8
    val eveningTime = 21

    fun welcomeMessage(currentTime: Int) {
        when (currentTime){
            in 6..18 -> println(dayTimeMessage + userName)
            else -> println(eveningTimeMessage + userName)
        }
    }

    welcomeMessage(dayTime)
    welcomeMessage(eveningTime)

}