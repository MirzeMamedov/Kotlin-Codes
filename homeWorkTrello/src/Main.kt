fun main(args: Array<String>) {

    // Person

    /*

    var person1 = Person("Mirza" , 18 ,"Baku")
    person1.detailsPrinter()

    var person2 = Person("Nick" , 18 ,"London")
    person2.detailsPrinter()

    var person3 = Person("Breed" , 18 ,"Paris")
    person3.detailsPrinter()

    */

    // Vehicle

    /*

    val car = Cars("Toyota", "Camry", 2022)
    val motorcycle = Motorcycles("Harley-Davidson", "Street 750", 2021)
    val truck = Cargo("Ford", "F-150", 2023)

    car.detailsPrinter()
    motorcycle.detailsPrinter()
    truck.detailsPrinter()

    */

    // calculator

    // calculator()
    // arithmeticOperation("12 * 49", "16 - 9", "46 + 76", " 75 / 15", "468 / 2")

    // EBOB

    /*

    val a = readLine()?.toInt() ?: 1
    val b = readLine()?.toInt() ?: 1

    var EBOB: Int = 0
    var max : Int = 0

    if( a > b ) max = a else max = b

    for (i in 1..max)
        if ( a % i == 0 && b % i == 0 )
            EBOB = i

    println("EBOB : $EBOB")

    */

    /*

    var number = readln().toInt()

    recursiveCall(number)

    */

    /*

    val mutableList1 = mutableListOf(1, 2)
    val mutableList2 = mutableListOf(4, 5, 6)

    println(tuckIn(mutableList1, mutableList2))

    */

    /*

    var list = mutableListOf(10, 42, 73, 49, 56, 64, 98, 71, 67, 35)
    sortList(list)

    for (i in 0..<list.size)
        println("$i. " + list[i])


    */

    /*

    var person1 = Person("Mirza", 18, "Baku")
    var person2 = Person("Nick", 18, "London")
    var person3 = Person("Breed", 46, "Paris")

    person1.compareto(person2)
    person3.compareto(person1)

    */


}

enum class Result(var message : String){

    Success("Welcome")  , Loading("Wait") , Error("404")

}

fun Check(x :Int) {

    when(x){

        0 -> println(Result.Success.message)
        1 -> println(Result.Error.message)
        else -> println(Result.Loading.message)

    }

}

fun Person.compareto(p: Person) {

    if (this.age > p.age)

        println(this.name + " is older than " + p.name)
    else if (this.age < p.age)

        println(this.name + " is younger than " + p.name)
    else
        println(this.name + " is at the same age with " + p.name)

}

fun sortList(list: MutableList<Int>, key: String = "Asc"): Any {

    if (key.equals("None")) return list else if (key.equals("Des")) return list.sorted()
        .reversed() else return list.sort()

}

fun tuckIn(list1: MutableList<Int>, list2: MutableList<Int>): MutableList<Int> {

    val length = list1.size

    for (i in 0..<list2.size) {

        list1.add(length / 2 + i, list2[i])

    }

    return list1

}

fun recursiveCall(number: Int) {

    if (number > 0) println("Sum " + findSumOfDigits(number)) else recursiveCall(readln().toInt())

}

fun findSumOfDigits(number: Int) = number.toString().length

class Person(
    var name: String,
    var age: Int,
    var address: String
) {

    fun detailsPrinter() = println("Name : $name Age : $age Address : $address")

}

open class Vehicle(val mark: String, val model: String, val year: Int) {

    open fun detailsPrinter() = println("Mark : $mark Model : $model Year : $year")

}

class Cars(mark: String, model: String, year: Int) : Vehicle(mark, model, year) {

    override fun detailsPrinter() {

        super.detailsPrinter()
        println("CAR")

    }

}

class Motorcycles(mark: String, model: String, year: Int) : Vehicle(mark, model, year) {

    override fun detailsPrinter() {

        super.detailsPrinter()
        println("Motorcycles")

    }

}

class Cargo(mark: String, model: String, year: Int) : Vehicle(mark, model, year) {

    override fun detailsPrinter() {

        super.detailsPrinter()
        println("Cargo")

    }

}


fun calculator() {

    print("Enter Number1: ")
    var number1: Float = readlnOrNull()?.toFloat() ?: 1.0f

    print("Enter Number2: ")
    var number2: Float = readlnOrNull()?.toFloat() ?: 1.0f

    print("Operation(*,/,-,+): ")
    var operation: Char = readlnOrNull()?.firstOrNull() ?: '*'

    when (operation) {

        '/' -> println("$number1 / $number2 = " + (number1 / number2))
        '*' -> println("$number1 * $number2 = " + (number1 * number2))
        '-' -> println("$number1 - $number2 = " + (number1 - number2))
        '+' -> println("$number1 + $number2 = " + (number1 + number2))

    }

    println("Command(enter Q for quit, any other character to continue): Q")
    if (readln() == "Q") return else calculator()

}

fun arithmeticOperation(vararg expression: String) {

    expression.forEach {

        val components = it.split(" ")

        when (components[1]) {

            "/" -> println(components[0] + " / " + components[2] + " = " + (components[0].toDouble() / components[2].toDouble()))
            "*" -> println(components[0] + " * " + components[2] + " = " + (components[0].toDouble() * components[2].toDouble()))
            "-" -> println(components[0] + " - " + components[2] + " = " + (components[0].toDouble() - components[2].toDouble()))
            "+" -> println(components[0] + " + " + components[2] + " = " + (components[0].toDouble() + components[2].toDouble()))

        }


    }

}

