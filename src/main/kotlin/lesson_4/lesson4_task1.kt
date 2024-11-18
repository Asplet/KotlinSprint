package org.example.lesson_4

const val TOTAL_NUMBER_OF_TABLES = 13

fun main() {

    val tablesBookedForToday = 13
    val tablesBookedForTomorrow = 9

    println("Доступность столиков на сегодня: ${TOTAL_NUMBER_OF_TABLES > tablesBookedForToday}\n" +
            "Доступность столиков на завтра: ${TOTAL_NUMBER_OF_TABLES > tablesBookedForTomorrow}")

}

