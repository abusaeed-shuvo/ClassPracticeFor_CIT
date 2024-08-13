package mIA_APP_2402_OOP2

import kotlin.math.sqrt

open class Shape(override val height: Int, weight: Int) : ShapeInterface {
    override val width: Int = weight
    override var area: Double = 0.0
    override var volume: Double? = null
    override var name: String? = null


    class Square(override val height: Int) : Shape(height, height) {
        init {
            area = (height * height).toDouble()
            volume = null
            name="Square"
        }

        fun draw(){
            var i=height

            println("Printing $name:")
            while (i>0){
                var j=height
                while (j>0){
                    print("※")
                    j-=1
                }
                print("\n")
                i-=1
            }
            println()
        }
    }

    class Rectangle(override val height: Int, weight: Int) : Shape(height, weight) {
        init {
            area = (height * weight).toDouble()
            volume = null
            name="Rectangle"
        }

        fun draw(){
            var i=height

            println("Printing $name:")
            while (i>0){
                var j=width
                while (j>0){
                    print("※")
                    j-=1
                }
                print("\n")
                i-=1
            }
            println()
        }
    }

    class Cube(height: Int) : Shape(height, height) {
        init {
            area = (6 * height * height).toDouble()
            volume = (height * height * height).toDouble()
            name="Cube"
        }
    }

    class Triangle(firstArm: Int,secondArm:Int,thirdArm:Int):Shape(height=secondArm, weight = thirdArm ){
        init {
            val premier=firstArm+secondArm+thirdArm
            val s=premier/2
            val base=thirdArm
            area = sqrt(s*(s-firstArm)*(s-secondArm)*(s-thirdArm).toDouble())
            volume = null
            name="Triangle"
        }


    }

}