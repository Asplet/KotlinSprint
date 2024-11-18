package org.example.lesson_4

const val SUNNY_WEATHER = true
const val OPEN_AWNING = true
const val CORRECT_AIR_HUMIDITY = 20
const val INCORRECT_SEASON = "Зима"

fun main() {

    val currentWeatherType = true
    val positionOfTheAwning = true
    val currentAirHumidity = 20
    val currentSeason = "Зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            (currentWeatherType == SUNNY_WEATHER) && (positionOfTheAwning == OPEN_AWNING)
                    && (currentAirHumidity == CORRECT_AIR_HUMIDITY) && currentSeason != INCORRECT_SEASON
        }"
    )

}

