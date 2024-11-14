package org.example.lesson_2

fun main() {

    val numberOfStudents: Byte = 4
    val gradeOfStudent_1 = 3f
    val gradeOfStudent_2 = 4f
    val gradeOfStudent_3 = 3f
    val gradeOfStudent_4 = 5f

    val arithmeticMeanGrade = (gradeOfStudent_1 + gradeOfStudent_2 + gradeOfStudent_3 + gradeOfStudent_4) / numberOfStudents

    println(arithmeticMeanGrade)
}