package mIA_APP_2402_OOP

fun main() {
    val tom = Student("Tomas", 16, 8, 7866)
    tom.setBloodGroup("B+")
    tom.setGradeByResult(4.76)
    tom.setMass(87)
    tom.setGen("Male")
    tom.showStatus()


    val berly = Student("Berly ", 20, 11, 233)
    berly.setGen("Male")
    berly.showStatus()
    berly.setBloodGroup("A-")
    berly.setGradeByResult(3.7)
    berly.showStatus()


}