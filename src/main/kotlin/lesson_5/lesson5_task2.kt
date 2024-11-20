package org.example.lesson_5

import java.util.Calendar

const val AGE_OF_MAJORITY = 18

fun main() {

    val currentYear = Calendar.getInstance().get(Calendar.YEAR)

    print("Введите Ваш год рождения: ")
    val userAge = readln().toInt()

    val resultMessage = if ((currentYear - userAge) >= AGE_OF_MAJORITY) {
        "Показать экран со скрытым контентом"
    } else {
        "Доступ запрещен."
    }
    println(resultMessage)
}

