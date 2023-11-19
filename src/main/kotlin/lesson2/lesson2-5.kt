package lesson2

import kotlin.math.pow

fun main(){

    val initialAmount = 70000
    val interestRate = 16.7 / 100
    val years = 20
    val periodsPerYear = 1


    val finalAmount = initialAmount * (1 + interestRate / periodsPerYear).pow(years)

    println(finalAmount)
}