package org.example.lesson_4

const val IS_SHIP_DAMAGED = false
const val MIN_NUMBER_OF_CREW = 55
const val MAX_NUMBER_OF_CREW = 70
const val MIN_NUMBER_OF_PROVISION_BOXES = 50
const val IS_WEATHER_GOOD = true
const val RECOMMENDED_NUMBER_OF_CREW = 70

fun main() {

    println(
        "Необходимо проверить готовность коробля к отплытию. Пожалуйста, введите данные:\n" +
                "Присутствуют ли незначительные повреждения корпуса (true/false)? "
    )
    val hasShipDamage = readln().toBoolean()

    println("Введите количество экипажа корабля: ")
    val numberOfCrew = readln().toInt()

    println("Введите количество ящиков с провизией на корабле: ")
    val numberOfProvisionBoxes: Int = readln().toInt()

    println("Текущая погода благоприятная для отплытия (true/false)? ")
    val isSunny = readln().toBoolean()

    val possibilityOfSailing =
        ((hasShipDamage == IS_SHIP_DAMAGED) && (numberOfCrew in MIN_NUMBER_OF_CREW..MAX_NUMBER_OF_CREW)
                && (numberOfProvisionBoxes > MIN_NUMBER_OF_PROVISION_BOXES))
                || ((numberOfCrew == RECOMMENDED_NUMBER_OF_CREW)
                && (numberOfProvisionBoxes >= MIN_NUMBER_OF_PROVISION_BOXES) && (isSunny == IS_WEATHER_GOOD))

    println("Готовность корабля к отплытию: $possibilityOfSailing")
}

