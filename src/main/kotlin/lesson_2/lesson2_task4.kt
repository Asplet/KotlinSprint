package org.example.lesson_2

fun main() {

    val crystalOre = 7
    val ironOre = 11

    val extractionBuff = 20
    val bonus = extractionBuff / 100f

    val bonusCrystalOre = String.format("%.0f", (crystalOre * bonus))
    val bonusIronOre = String.format("%.0f", (ironOre * bonus))

    println("Бонус кристаллической руды: $bonusCrystalOre")
    println("Бонус железной руды: $bonusIronOre")

}