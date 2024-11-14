package org.example.lesson_1

fun main() {
    val year = 1961
    var hour = 9
    var minute = 7

    val takeoffHour = String.format("%02d", hour)
    val takeoffMinute = String.format("%02d", minute)
    println(year)
    println(takeoffHour)
    println(takeoffMinute)

    hour = 10
    minute = 55

    val landingTime = String.format("%02d:%02d", hour, minute)
    println(landingTime)

}