package org.example.lesson_5

fun main() {

    var guessCounter = 0
    val firstWinNumber = 10
    val secondWinNumber = 15

    println(
        "Для участия в нашей лоттерее введите два числа от 0 до 42. \n"
                + "Введите первое число:"
    )
    val firstUserNumber = readln().toInt()
    println("Введите второе число:")
    val secondUserNumber = readln().toInt()

    if ((firstUserNumber == firstWinNumber) || (firstUserNumber == secondWinNumber)) {
        guessCounter++
    }
    if ((secondUserNumber == firstWinNumber) || (secondUserNumber == secondWinNumber)) {
        guessCounter++
    }

    when (guessCounter) {
        0 -> println("Неудача!")
        1 -> println("Вы выиграли утешительный приз!")
        2 -> println("Поздравляем! Вы выиграли главный приз!")
    }
    println("Числа необходимые для победы: $firstWinNumber и $secondWinNumber")
}

