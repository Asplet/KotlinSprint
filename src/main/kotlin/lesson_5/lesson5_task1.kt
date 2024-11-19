package org.example.lesson_5

fun main() {

    val firstNumber = 11
    val secondNumber = 34
    val sumOfNumbers = firstNumber + secondNumber

    println(
        "Для входа в систему докажите, что Вы не робот:\n" +
                "Введите сумму чисел: $firstNumber + $secondNumber"
    )
    print("Сумма чисел: ")
    val userSum = readln().toInt()

    val resultMessage = if (userSum == sumOfNumbers) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещен."
    }
    println(resultMessage)

}

