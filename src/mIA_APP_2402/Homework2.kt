package mIA_APP_2402

import kotlin.math.max

fun main() {
    val user = "Shuvo"
    val age = 22
    val height = 5.6
    val weight = 68.7

    printId(user, age, height, weight)
    println()
    prettyPrint(user, age, height, weight)

}

fun printId(name: String, age: Int, height: Double, weight: Double) {
    println("My name is $name and I'm $age years old")
    println("My height is $height\' and I weight $weight kg")
}

fun prettyPrint(user: String, age: Int, height: Double, weight: Double) {

    println("* Hi! I am $user! ")
    println("* I am $age years old ")
    println("* I am $height ft tall ")
    println("* I weight $weight kg ")

}