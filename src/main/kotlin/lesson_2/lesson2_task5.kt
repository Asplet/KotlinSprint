package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val deposit = 70000
    val interestRate = 16.7
    val yearsOfDeposit = 20
    val accrualPeriod = 1

    val interestRateDel = interestRate / 100
    val numberOfAccrualPeriods = yearsOfDeposit / accrualPeriod

    val compoundInterestMultiplier = (1 + interestRateDel).pow(numberOfAccrualPeriods)

    val totalDeposit = deposit * compoundInterestMultiplier

    println("Размер вклада через $yearsOfDeposit лет: ${String.format("%.3f", totalDeposit)}")

}