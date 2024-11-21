package org.example.lesson_5

import kotlin.math.pow

fun main() {

    println("Введите Ваш вес, кг: ")
    val userWeight = readln().toFloat()
    println("Введите Ваш рост, см: ")
    val userHeight = readln().toFloat()
    val userHeightInMeter = userHeight / 100

    val bodyMassIndex = userWeight / userHeightInMeter.pow(2)

    val categoryOfWight = when {
        bodyMassIndex < 18.5 -> "Недостаточная масса тела"
        bodyMassIndex < 25 -> "Нормальная масса тела"
        bodyMassIndex < 30 -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("Ваш ИМТ: ${String.format("%.2f", bodyMassIndex)}: $categoryOfWight")
}