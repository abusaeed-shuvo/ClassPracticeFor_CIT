package mIA_APP_2402

//Array operation

fun main() {
    val arr = arrayOf(1, 2, -3.1416, 4, 5, 5.5, "val", "🚌", "☆*: .｡. o(≧▽≦)o .｡.:*☆", 'a', null)

    println("\n------------------------------->")
    println("Print Array using for loop")
    for (it in arr) println(it)

    println("\n------------------------------->")
    println("Print using foreach operation")
    arr.forEach { i -> println(i) }

}