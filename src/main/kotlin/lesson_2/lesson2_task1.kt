package org.example.lesson_2

fun main() {

    val allGrades = listOf(3, 4, 3, 5)
    val arithmeticMeanGrade = allGrades.sum().toFloat() / allGrades.size
    //насколько понимаю это^ ещё можно заменить и этим: val arithmeticMeanGrade = allGrades.average()

    println(arithmeticMeanGrade)

}