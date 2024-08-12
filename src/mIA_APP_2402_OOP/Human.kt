package mIA_APP_2402_OOP

open class Human(override val name: String, override val age: Int) : Mammal(name, age) {
    override var bodyMass: Double? = null
    override var gender: String? = null

    private var bloodGroup: String? = null

    private val genderList = listOf("Male", "Female", "Other")
    private val bloodGroupList = listOf("A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-")

    override fun setBloodGroup(group: String) {
        if (group in bloodGroupList) {
            bloodGroup = group
        } else {
            println("Blood groups available are ${bloodGroupList.joinToString(", ")}")
        }
    }

    override fun showBloodGroup() {
        if (bloodGroup in bloodGroupList) {
            println("Blood group is: $bloodGroup")
        } else {
            println("Blood Group unavailable")
        }
    }

    override fun setMass(mass: Double) {
        if (mass > 0.0) bodyMass = mass
        else println("Mass can not be negative")
    }

    override fun setMass(mass: Int) {
        if (mass > 0) bodyMass = mass.toDouble()
        else println("Mass can not be negative")
    }

    override fun setGen(gen: String) {
        if (gen in genderList) gender = gen
        else println("Available genders are: ${genderList.joinToString(", ")}")
    }

    override fun showMass() {
        if (bodyMass != null) println("Mass is: $bodyMass")
        else println("Mass is unavailable.")
    }

    override fun showGender() {
        if (gender != null) println("Gender is: $gender")
        else println("Gender is not specified.")
    }

    protected fun showHumanInfo() {
        println("Name: $name")
        println("Age: $age")
        showGender()
        showMass()
        showBloodGroup()
    }

}