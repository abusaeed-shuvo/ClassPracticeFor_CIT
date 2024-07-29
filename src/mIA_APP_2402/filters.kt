package mIA_APP_2402

fun main() {
    val chicken = mutableListOf(1, 2, 3, 4, -65, 2, 4, 0, -5, -9)

    println(chicken)

    val cow = chicken.filter { it > 0 }

    println(cow)
}