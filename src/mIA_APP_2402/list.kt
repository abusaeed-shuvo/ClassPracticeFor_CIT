package mIA_APP_2402

fun main() {
    val fruits = mutableListOf("Abiu", "Açaí", "Acerola", "Akebi", "Ackee", "Apple", "Apricot", "Aratiles", "Araza", "Avocado", "Banana", "Bilberry", "Blackberry", "Blackcurrant")

    println(fruits)
    println()

    fruits.remove("Apple")

    println(fruits)
    println()

    fruits.removeAt(0)

    println(fruits)
    println()

    fruits.add(10,"Watermelon")

    println(fruits)
    println()


}