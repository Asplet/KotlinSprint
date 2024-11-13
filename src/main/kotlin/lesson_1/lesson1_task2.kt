package org.example.lesson_1

fun main(){
    val thanksForPurchaseText: String = "Благодарим за покупку! Электронный чек будет выслан на указанный Вами адрес электронной почты."

    var orderCounter: UInt = 75u
    var totalNumberOfEmployees: UInt = 2000u

    println("Общее количество заказов: " + orderCounter)
//    println("Общее количество работников магазина: " + totalNumberOfEmployees)

    totalNumberOfEmployees -= 1u

    println("Общее количество работников магазина: " + totalNumberOfEmployees)
    println(thanksForPurchaseText)
}