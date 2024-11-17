package org.example.lesson_3

fun main(){
    var moveFromLetter:Char = 'E'
    var moveFromNumber = 2

    var moveToLetter:Char = 'E'
    var moveToNumber = 4

    var moveNumber = 1

    println("[$moveFromLetter$moveFromNumber-$moveToLetter$moveToNumber;$moveNumber]")

    moveFromLetter = 'D'
    moveFromNumber = 2

    moveToLetter = 'D'
    moveToNumber = moveFromNumber + 1

    moveNumber = 2
    println("[$moveFromLetter$moveFromNumber-$moveToLetter$moveToNumber;$moveNumber]")
}