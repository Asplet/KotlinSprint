package org.example.lesson_4

const val SHIP_DAMAGE = false
const val MIN_NUMBER_OF_CREW = 55
const val MAX_NUMBER_OF_CREW = 70
const val MIN_NUMBER_OF_PROVISION_BOXES = 50
const val GOOD_WEATHER_TYPE = true
const val RECOMMENDED_NUMBER_OF_CREW = 70

fun main() {

    println(
        "Необходимо проверить готовность коробля к отплытию. Пожалуйста, введите данные:\n" +
                "Присутствуют ли незначительные повреждения корпуса (true/false)? "
    )
    val currentShipDamage = readln().toBoolean()

    println("Введите количество экипажа корабля: ")
    val numberOfCrew = readln().toInt()

    println("Введите количество ящиков с провизией на корабле: ")
    val numberOfProvisionBoxes: Int = readln().toInt()

    println("Текущая погода благоприятная для отплытия (true/false)? ")
    val currentWeather = readln().toBoolean()

    val possibilityOfSailing =
        ((currentShipDamage == SHIP_DAMAGE) && (numberOfCrew in MIN_NUMBER_OF_CREW..MAX_NUMBER_OF_CREW)
                && (numberOfProvisionBoxes > MIN_NUMBER_OF_PROVISION_BOXES))
                || ((numberOfCrew == RECOMMENDED_NUMBER_OF_CREW)
                && (numberOfProvisionBoxes >= MIN_NUMBER_OF_PROVISION_BOXES) && (currentWeather == GOOD_WEATHER_TYPE))

    println("Готовность корабля к отплытию: $possibilityOfSailing")
}

