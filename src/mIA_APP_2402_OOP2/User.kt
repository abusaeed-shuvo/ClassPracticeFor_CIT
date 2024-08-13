package mIA_APP_2402_OOP2

data class User(val userName:String, val userType:String, val userPriority:Int){
    override fun toString(): String {
        return "User Details: \nName=$userName, Type=$userType, Priority=$userPriority\n"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (userType != other.userType) return false
        if (userPriority != other.userPriority) return false

        return true
    }


}
