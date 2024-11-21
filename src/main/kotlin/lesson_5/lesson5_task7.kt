package org.example.lesson_5

fun main() {

    println("Введите расстояние поездки, км: ")
    val userDistance = readln().toFloat()
    println("Введите расход топлива на 100 км, л: ")
    val userFuelConsumption = readln().toFloat()
    println("Введите текущую цену на топливо, руб.: ")
    val userFuelPrice = readln().toFloat()

    val fuelForTrip = (userDistance * userFuelConsumption) / 100

    val totalFuelPrice = fuelForTrip * userFuelPrice

    println(
        "Для поездки необходимо топлива: ${String.format("%.2f", fuelForTrip)} л.\n" +
                "Общая стоимость поездки: ${String.format("%.2f", totalFuelPrice)} руб."
    )
}