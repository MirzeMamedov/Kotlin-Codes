import kotlin.random.Random

fun main(){

    // checkColorNumber()

    // printPrices( getCarInputs())

    // -------------------------------------------------------------------

    /*

    val count = 10
    val list = mutableListOf<Car2>()

    repeat(count) {
        list.add(Car2(getRandomString(5), Random.nextInt(10000, 20000)))
    }

    var sum = 0.0
    list.forEach {
        println(it)
        sum += it.price
    }

    print("Sum of price:  ${list.sumOf { it.price }}")

    var newList = list.filter { it.price > 15000 }

    */

    // Android Not Responding exception (ANR)

    // What is the CoroutineScope Dispatcher RunBlock

    repeat(50000) {
        Thread {
            try {
                Thread.sleep(5000)
                println(",")
            } catch (e: Exception) {
                // Handle the exception here
                e.printStackTrace()
            }
        }.start()
    }

    // -------------------------------------------------------------------


}

// -------------------------------------------------------------------

data class Car2(val name: String, val price: Int)

private val ALLOWED_CHARACTERS = "0123456789qwertyuiopasdfghjklzxcvbnm"

private fun getRandomString(sizeOfRandomString: Int): String {
    val sb = StringBuilder(sizeOfRandomString)
    for (i in 0 until sizeOfRandomString)
        sb.append(ALLOWED_CHARACTERS[Random.nextInt(ALLOWED_CHARACTERS.length)])
    return sb.toString()
}

// -------------------------------------------------------------------

fun printPrices(listOfCar: MutableList<Car>) {

    var sum: Int = 0

    for (i in 0..<listOfCar.size) sum += listOfCar[i].price

    println("Sum :$sum")

}

fun getCarInputs(): MutableList<Car> {

    var listOfCar = mutableListOf<Car>()

    var name: String
    var price: Int

    for (i in 0..2) {

        print("Name: ")
        var name = readln()

        print("Expense: ")
        var price = readln().toInt()

        listOfCar.add(Car(name, price))

    }

    return listOfCar

}

data class Car(var name: String, var price: Int)

enum class colors(var number: Int) {

    Red(3), Blue(4), Green(5)

}

fun checkColorNumber() {

    print("Enter Number:")
    var number = readln().toInt()

    when (number) {

        colors.Blue.number -> print("Blue")
        colors.Red.number -> print("Red")
        colors.Green.number -> print("Green")
        else -> {

            println("Wrong Number")
            checkColorNumber()

        }
    }

}