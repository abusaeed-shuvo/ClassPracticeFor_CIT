package mIA_APP_2402_OOP

fun filler(num: Int) {
    val ch: Char = '#'
    var notNum = if (num < 0) num * -1 else num
    while (notNum != 0) {
        print(ch)
        notNum -= 1
    }
    println()

}