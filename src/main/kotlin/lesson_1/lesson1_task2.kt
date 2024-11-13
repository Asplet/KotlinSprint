package org.example.lesson_1

fun main(){
    val thanksForPurchaseText: String = "Благодарим за покупку! Электронный чек будет выслан на указанный Вами адрес электронной почты."

    val orderCounter: Int = 75
    var totalNumberOfEmployees: Int = 2000

    println("Общее количество заказов: " + orderCounter)
//    println("Общее количество работников магазина: " + totalNumberOfEmployees)

    totalNumberOfEmployees -= 1

    println("Общее количество работников магазина: " + totalNumberOfEmployees)
    println(thanksForPurchaseText)
}