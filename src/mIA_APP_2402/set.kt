package mIA_APP_2402

import kotlin.time.measureTime

//Working with Set
fun main() {
    val setOfPrimeNumbers = mutableSetOf(2)
    val endNumber: Int = 1000000

    val time = measureTime {
        for (i in 3..endNumber) {
            if (primeTest(i)) {
                setOfPrimeNumbers.add(i)
            }
        }
    }

    println("There is ${setOfPrimeNumbers.size} numbers of prime between 0 to $endNumber \nCalculation time: $time")
}

//Check if it's a Prime Number
fun primeTest(num: Int): Boolean {
    var isPrime: Boolean = false

    for (i in 2..<num) {
        if (num % i == 0) {
            isPrime = false
            break
        } else {
            isPrime = true
        }
    }

    return isPrime
}