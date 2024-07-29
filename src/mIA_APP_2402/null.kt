package mIA_APP_2402

//Null safety

fun main() {

    println("Enter your name:")
    val userName: String? = null

    val showName = userName ?: "Input Error. Please try again."

    println(showName)
}