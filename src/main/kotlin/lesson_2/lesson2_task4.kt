package org.example.lesson_2

const val EXTRACTION_BUFF = 0.2f

fun main() {

    val crystalOre = 7
    val ironOre = 11

    val bonusCrystalOre = String.format("%.0f", (crystalOre * EXTRACTION_BUFF))
    val bonusIronOre = String.format("%.0f", (ironOre * EXTRACTION_BUFF))

    println("Бонус кристаллической руды: $bonusCrystalOre")
    println("Бонус железной руды: $bonusIronOre")

}