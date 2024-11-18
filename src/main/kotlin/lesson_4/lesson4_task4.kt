package org.example.lesson_4

fun main() {

    val trainingDay = 2

    val dayCheck = trainingDay % 2 == 0

    val armExercises = !dayCheck
    val legExercises = dayCheck
    val backExercises = dayCheck
    val abdominalExercises = !dayCheck

    println(
        """ |Упражнения для рук:    $armExercises
            |Упражнения для ног:    $legExercises
            |Упражнения для спины:  $backExercises
            |Упражнения для пресса: $abdominalExercises """.trimMargin()
    )

}

