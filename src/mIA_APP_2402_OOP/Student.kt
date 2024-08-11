package mIA_APP_2402_OOP

class Student(name: String, age: Int, currentClass: Int, roll: Int) : Human(name, age) {
    private val currentClass: Int = if (currentClass in 1..12) currentClass else 0
    private val currentRoll: Int = roll
    private var currentGrade: String? = null
    private val availableGradeList =
        listOf("5.0=A+", "4.0~4.99=A", "3.50~3.99=A-", "3.0~3.49=B", "2.0~2.99=C", "1.0~1.99=D", "0~0.99=F")

    fun setGradeByResult(grade: Double) {
        when (grade) {
            5.0 -> currentGrade = "A+"
            in 4.0..4.99 -> currentGrade = "A"
            in 3.5..3.99 -> currentGrade = "A-"
            in 3.0..3.49 -> currentGrade = "B"
            in 2.0..2.99 -> currentGrade = "C"
            in 1.0..1.99 -> currentGrade = "D"
            in 0.0..0.99 -> currentGrade = "F"
            else -> println("Grading reference: ${availableGradeList.joinToString()}")
        }
    }

    fun showStatus() {
        println("Student Details:")
        showHumanInfo()
        showStudentInfo()
    }

    private fun showGrade() {
        if (currentGrade != null) {
            println("Grade: $currentGrade")
        } else {
            println("Grade not available.")
        }
    }

    private fun showStudentInfo() {
        println("Class: $currentClass")
        println("Roll: $currentRoll")
        showGrade()
    }


}