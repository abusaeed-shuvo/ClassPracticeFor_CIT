package mIA_APP_2402

fun main() {
    showID()
    println()
    showOther()
}

fun showID() {
    val firstName = "Abusaeed"
    val lastName = "Shuvo"
    var fullName = "$firstName $lastName"
    fullName = "Md. $fullName"

    val age = 22
    val weight = 68.5
    val height = 5.8

    println("Hi! My name is $fullName.")
    println("I'm $age years old.")
    println("I weight $weight kg.")
    println("I'm $height\' tall.")
}

fun showOther() {
    val firstName = "Raihan"
    val lastName = "Sidduqe"
    var fullName = "$firstName $lastName"
    fullName = "Md. $fullName"

    val age = 19
    val weight = 55.9
    val height = 5.5

    println("Hi! My name is $fullName.")
    println("I'm $age years old.")
    println("I weight $weight kg.")
    println("I'm $height\' tall.")
}