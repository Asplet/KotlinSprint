package org.example.lesson_3

fun main() {

    val name = "Татьяна"
    val patronymic = "Сергеевна"
    var surname = "Андреева"

    fun personalInformation(age: Int) {
        when (age) {
            in 0..21 -> println("$surname $name $patronymic, $age лет")
            else -> {
                surname = "Сидорова"
                println("$surname $name $patronymic, $age лет")
            }
        }
    }

    personalInformation(20)
    personalInformation(22)

}