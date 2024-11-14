package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val deposit = 70000
    val interestRate = 16.7
    val yearsOfDeposit = 20

    val totalDeposit = String.format("%.3f", (deposit * (1 + interestRate / 100).pow(yearsOfDeposit)))

    println("Размер вклада через 20 лет: $totalDeposit")

}