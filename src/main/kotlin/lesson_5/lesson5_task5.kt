package org.example.lesson_5

import kotlin.random.Random

fun main() {

    val winNumbers = List(3) { Random.nextInt(0, 43) }

    println("Для участия в нашей лоттерее введите три числа от 0 до 42:")
    val userNumbers = List(3) { readln().toInt() }

    val guessCounter = winNumbers.intersect(userNumbers).size

    when (guessCounter) {
        0 -> println("Неудача! Вы не угадали ни одного числа...")
        1 -> println("Вы угадали 1 число. Вам будет выплачен утешительный приз!")
        2 -> println("Ого! Вы угадали 2 числа и выиграли крупный приз!")
        3 -> println("Поздравляем! Вы угадали 3 числа и выиграли джекпот!")
    }

    println("Числа необходимые для победы: $winNumbers")
}

