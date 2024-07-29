package mIA_APP_2402

//Created by Abusaeed Shuvo
fun main() {
    println("Enter Current temperature in celsius:")
    val temperature = readln().toInt()


    println(
        when {
            temperature <= -274 -> "Below absolute Zero"
            temperature > -274 && temperature <= -22 -> "It's Ice Age"
            temperature > -22 && temperature <= 0 -> "Freezing Cold"
            temperature > 0 && temperature <= 20 -> "Very Cold"
            temperature > 20 && temperature <= 25 -> "Cold"
            temperature > 25 && temperature <= 35 -> "Mild Cold"
            temperature > 35 && temperature <= 38 -> "Normal"
            temperature > 38 && temperature <= 45 -> "Hot"
            temperature > 45 -> "Very Hot"
            else -> "Can not comprehend the input. Please try again!"
        }
    )


}