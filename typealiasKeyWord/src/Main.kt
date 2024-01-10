typealias AuthToken = String

fun main() {

    var user = User("Mirze" , "A15539A")

}

data class User(val userName : String , val authToken : AuthToken)

data class Account(val authToken : AuthToken)

data class Order(val authToken : AuthToken )