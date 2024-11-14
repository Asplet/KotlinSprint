package org.example.lesson_1

fun main() {
    val timeDivider = 60
    val seconds = 6480
    val minutes = seconds / timeDivider
    val hours = minutes / timeDivider

    val remainingSeconds = seconds % timeDivider
    val remainingMinutes = minutes % timeDivider

    val timeInStringFormat = String.format("%02d:%02d:%02d", hours, remainingMinutes, remainingSeconds)

    println(timeInStringFormat)

}