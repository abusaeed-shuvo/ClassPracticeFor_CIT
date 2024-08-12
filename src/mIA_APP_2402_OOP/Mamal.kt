package mIA_APP_2402_OOP

abstract class Mammal(name: String, age: Int) {
    abstract var bodyMass: Double?
    protected abstract var gender: String?

    abstract val name: String
    abstract val age: Int

    abstract fun setBloodGroup(group: String)
    abstract fun setMass(mass: Double)
    abstract fun setMass(mass: Int)
    abstract fun setGen(gen: String)
    protected abstract fun showBloodGroup()
    protected abstract fun showMass()
    protected abstract fun showGender()

}