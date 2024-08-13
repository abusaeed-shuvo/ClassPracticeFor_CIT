package mIA_APP_2402_OOP2

interface ShapeInterface {
    val height:Int
    val width:Int
    var area:Double
    var volume:Double?
    var name:String?

    fun showStatus() {
        println("$ $name area is: $area SquareUnit\n")
        if(volume!=null)  println("$name volume is: $volume CubicUnit")
    }
}