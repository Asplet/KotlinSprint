package org.example.lesson_2

const val TIME_DIVIDER = 60

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val minutesOfTheWay = 457

    val totalMinutes = departureHour * TIME_DIVIDER + departureMinute + minutesOfTheWay

    val arrivalHour = totalMinutes / TIME_DIVIDER
    val arrivalMinute = totalMinutes % TIME_DIVIDER

    val arrivalTime = String.format("%02d:%02d", arrivalHour, arrivalMinute)
    println("Время прибытия поезда: $arrivalTime")

}