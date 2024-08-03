package mIA_APP_2402

fun main() {
    val plant1 = PowerPlant(900)

    plant1.getCritical()
    plant1.getOnline()

    plant1.getCritical()
    plant1.getOnline()

    plant1.refuel(6000000)
    plant1.getCritical()
    plant1.getOnline()

}

class PowerPlant(fuel: Int) {
    private val reactorType = listOf("Boiling water reactor", "Pressurized water reactor")
    private var fuelAmount: Double = 0.0
    private var generatedPower: Double = 0.0
    private var generatedWaste: Double = 0.0
    private val lightSpeed: Int = 300000000
    private var isCritical: Boolean = false

    init {
        fuelAmount = fuel.toDouble()
        println("The power plant have been created.\n")
    }

    fun refuel(a: Int) {
        if (a > 0) {
            fuelAmount += a
        } else {
            fuelAmount += 0
            println("Can not add 0 or less amount fuel.")
        }
        println("Current fuel is $fuelAmount.")
    }

//    fun showReactorTypes() {
//        var v: Int = 1
//        println("Currently Available Reactors are:")
//        for (i in reactorType) {
//            println("${v}.$i")
//            v += 1
//        }
//    }

    fun getCritical() {
        if (fuelAmount > 100) {
            println("Reactor is critical!\n")
            isCritical = true
        } else {
            println("Reactor is not critical!\n")
            isCritical = false
        }
    }

    private fun createPower() {
        val e = fuelAmount * lightSpeed * lightSpeed * 0.37
        if (isCritical) {
            generatedPower = e / 100000000.0
            generatedWaste = fuelAmount * 0.17
            fuelAmount = 0.0
            println("Generated power: ${generatedPower}MJ")
            println("Generated waste: ${generatedWaste}kg\n")
        } else {
            println("Can not create power.\n")
        }
    }

    fun getOnline() {
        if (isCritical) {
            println("Plant is now online!")
            createPower()
            println("Plant will go offline.")
            getOffline()
        } else {
            println("Not enough power to get online.")
        }

    }

    private fun getOffline() {
        isCritical = false
        println("Plant is offline!\n")
    }

}