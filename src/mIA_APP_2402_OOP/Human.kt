package mIA_APP_2402_OOP

open class Human(private val name: String, private val age: Int) {
    private val bloodGroupList = listOf("A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-")
    private var bloodGroup: String? = null

    fun setBloodGroup(group: String) {
        if (group in bloodGroupList) {
            bloodGroup = group
        } else {
            println("Blood groups available are ${bloodGroupList.joinToString()}")
        }
    }

    private fun showBloodGroup() {
        if (bloodGroup in bloodGroupList) {
            println("Blood group is: $bloodGroup")
        } else {
            println("Blood Group unavailable")
        }
    }

    fun showHumanInfo() {
        println("Name: $name")
        println("Age: $age")
        showBloodGroup()
    }

}