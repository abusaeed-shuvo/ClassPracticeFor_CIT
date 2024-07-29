package mIA_APP_2402

//Program name: Multiplication-table

fun main() {
    println("Enter the number you need multiplication table for:")
    val num = readln().toInt()

    for (i in 1..10) {
        println("$num x $i = ${num * i}")
    }
}