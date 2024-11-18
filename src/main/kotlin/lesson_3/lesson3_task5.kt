package org.example.lesson_3

fun main(){
    val inputMove = "D2-D4;0"
    val partsOfMove = inputMove.split("-",";")

    val moveFrom = partsOfMove[0]
    println("Ход из: $moveFrom")

    val moveTo = partsOfMove[1]
    println("Ход в: $moveTo")

    val moveNumber = partsOfMove[2]
    println("Номер хода: $moveNumber")
}