package mIA_APP_2402_OOP2

fun main() {

    val v1 = Shape.Cube(50)
    v1.showStatus()

    val s1 = Shape.Square(6)
    s1.showStatus()
    s1.draw()

    val lance=User("Lance","Admin",0)
    val smith=User("Smith","Local",1)
    val hans=User("Hans","Local",1)
    val rose=User("Rose","Guest",2)

    println(lance)

    checkStats(smith,hans)
    checkStats(lance,rose)

}

fun checkStats(firstUser: User, secondUser: User){
    if(firstUser==secondUser){
        println("${firstUser.userName} is ${secondUser.userName} are the same")
    }else{
        println("${firstUser.userName} is ${secondUser.userName} are not the same")
    }

}