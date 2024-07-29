package mIA_APP_2402

fun main() {
    val prices: MutableMap<String, Int> =
        mutableMapOf("Phone Case" to 70, "Type c Adapter" to 45, "QKZ DM10" to 320, "Beard Trimmer" to 500)

    showPrices(prices)

    while (true) {
        println("Options:\n0.Quit List\n1.Add to list\n2.View List")
        val option = readln().toInt()
        when (option) {
            0 -> break
            1 -> addToList(prices)
            2 -> showPrices(prices)
        }
        println("Enter your option:")
    }

}

fun showPrices(m: Map<String, Int>) {
    println("Current Price list:")

    for (key in m.keys) {
        println("Price of $key is ${m[key]}")
    }
    println()
}

fun addToList(m: MutableMap<String, Int>) {
    println("Enter Name of The Product:")
    val name = readln()

    println("Enter Product Price:")
    val price = readln().toInt()

    m.put(name, price)
}