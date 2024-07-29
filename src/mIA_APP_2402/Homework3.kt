package mIA_APP_2402

fun main() {
    val temperature = 23
getWeather(temperature)
}


fun getWeather(temperature: Int) {
    if (temperature < 10) {
        println("Very cold")
    } else if (temperature in 10..19) {
        println("Cold")
    } else if (temperature in 20..25) {
        println("Normal")
    } else  {
        println("Hot")
            }
}