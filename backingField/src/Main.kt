fun main() {

    val human = Human()
    human.age = 54
    println(human.age)

}

class Human{

    var age = 20
        get(){

            // println("Age: $age") // throw StackOverflowException
            println("Age: $field") // field store the value of age
            return  field

        }
        set(value) {


            field = value
            // age = value // throw StackOverflowException

        }

    var isOld = true
        get() = age > 50

}