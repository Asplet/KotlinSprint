package org.example.lesson_2

fun main() {

    val numberOfEmployees = 50
    val numberOfInterns = 30
    val salaryOfEmployees = 30000
    val salaryOfInterns = 20000

    val employeeCosts = salaryOfEmployees * numberOfEmployees
    val internCosts = salaryOfInterns * numberOfInterns

    val totalCosts = employeeCosts + internCosts
    val totalNumberOfPersonnel = numberOfEmployees + numberOfInterns

    val overallAverageSalary = totalCosts / totalNumberOfPersonnel

    println("Расходы на выплату ЗП постоянным сотрудникам: $employeeCosts")
    println("Общие расходы по ЗП после прихода стажёров: $totalCosts")
    println("Средняя ЗП одного сотрудника после устройства стажёров: $overallAverageSalary")

}