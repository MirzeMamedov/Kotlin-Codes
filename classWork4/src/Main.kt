fun main() {

    // Largest Even Number

    // println(findLargestEvenNumber(arrayListOf(11,27,31,45,55,63,75,89)))

    // ---------------------------------------------------------

    // Triangle

    // getTriangleType(arrayListOf(2, 5, 7))

    // 2, 6, 5]) ➞ "scalene"
    // 8, 8, 8]) ➞ "equilateral"
    // 4, 4, 7]) ➞ "isosceles"

    // ---------------------------------------------------------

    // Books

    /*

    val book = Book("Pride and Prejudice", "Jane Austen")

    println(book.getTitle())
    println(book.getAuthor())

    */

    // ---------------------------------------------------------

    // Rock Paper Scissors

    /*

    println(calculateScore(listOf("R", "P") , listOf("R", "S"), listOf("S", "P"))) // Abigale
    println(calculateScore(listOf("R", "R") , listOf("S", "S"), listOf("P", "P"))) // Tie
    println(calculateScore(listOf("S", "R") , listOf("R", "S"), listOf("R", "P"))) // Benson

    */

    // ---------------------------------------------------------

    // Even Odd numbers

    // println(sumOfOddAndEvenNumbers(1, 2, 3, 4, 5, 6)) // [12, 9]

    // ---------------------------------------------------------

    // Coffee Shop

    /*

    val item1 = Item("cinnamon roll", 2.5, Type.Food)
    val item2 = Item("iced coffee", 2.5, Type.Drink)

    val menu = listOf(item1, item2)

    var orders = mutableListOf<String>()

    option(menu, orders)

    */

    // ---------------------------------------------------------


}

// ---------------------------------------------------------

fun sumOfOddAndEvenNumbers(vararg numbers: Int): List<Int> =
    listOf(numbers.filter { it % 2 == 0 }.sum(), numbers.filter { it % 2 == 1 }.sum())

// ---------------------------------------------------------

fun findLargestEvenNumber(list: List<Int>): Int {

    var min = -1

    list.forEach {

        if (min < it && it % 2 == 0) {

            min = it

        }

    }

    return min

}

// ---------------------------------------------------------

fun getTriangleType(list: List<Int>) {

    if (list.size > 3) {

        println("This is not a triangle")
        return

    } else if (list[0] >= list[1] + list[2] || list[1] >= list[0] + list[2] || list[2] >= list[1] + list[0]) {

        println("This is not a triangle")
        return

    } else if (list[0] == list[1] && list[1] == list[2]) {

        println("equilateral")
        return

    } else if (list[0] == list[1] || list[1] == list[2] || list[0] == list[2]) {

        println("isosceles")
        return

    } else {

        println("scalene")
        return

    }

}

// ---------------------------------------------------------

fun calculateScore(vararg list: List<String>): String {

    var bensonWinScore = 0
    var abigaleWinScore = 0

    for (i in list) {

        var abigaleChoice = i[0]
        var bensonChoice = i[1]

        when {

            abigaleChoice == bensonChoice -> continue

            (abigaleChoice == "P" && bensonChoice == "R")
                    || (abigaleChoice == "R" && bensonChoice == "S")
                    || (abigaleChoice == "S" && bensonChoice == "P") -> abigaleWinScore += 1

            else -> bensonWinScore += 1

        }

    }

    return if (abigaleWinScore > bensonWinScore) "Abigale" else if (abigaleWinScore < bensonWinScore) "Benson" else "Tie"

}

// ---------------------------------------------------------

data class Book(val title: String, val author: String)

// ---------------------------------------------------------

fun Book.getTitle(): String = "Title : $title"
fun Book.getAuthor(): String = "Author : $author"

// ---------------------------------------------------------

fun option(menu: List<Item>, orders: MutableList<String>) {

    println("Menu \n")
    println("1. Add Orders")
    println("2. Full Fill Order")
    println("3. List Order")
    println("4. Due Amount")
    println("5. Cheapest Item")
    println("6. Drinks Only")
    println("7. Food Only")
    println("8. Quit")

    print("Choice: ")

    val option = readlnOrNull()?.toIntOrNull()

    if (option !in listOf(1, 2, 3, 4, 5, 6, 7, 8)) {

        println("Invalid Option, Try Again")
        return option(menu, orders)

    }

    var coffeeShop = CoffeeShop(menu, orders)

    when (option) {

        1 -> coffeeShop.addOrders()
        2 -> coffeeShop.fullFillOrder()
        3 -> coffeeShop.listOrder()
        4 -> coffeeShop.dueAmount()
        5 -> coffeeShop.cheapestItem()
        6 -> coffeeShop.drinksOnly()
        7 -> coffeeShop.foodOnly()
        8 -> return

    }

    return option(menu, orders)

}

// ---------------------------------------------------------

data class Item(val name: String, val price: Double, val type: Type)

// ---------------------------------------------------------

enum class Type {

    Drink, Food

}

// ---------------------------------------------------------

class CoffeeShop(val menu: List<Item>, var orders: MutableList<String>) {

    fun addOrders() {

        print("\nEnter Order :")
        val order = readln()

        for (j in menu) {

            if (order == j.name) {

                println("$order is added to list")
                orders.add(order)
                return

            }

        }

        println("This item is currently unavailable!")

    }

    fun fullFillOrder() {

        if (orders.isEmpty()) {

            println("All orders have been fulfilled!")
            return

        }

        println("The ${orders[0]} is ready!")
        orders.removeAt(0)

    }

    fun listOrder() = println("Orders : $orders")

    fun dueAmount() {

        var sum = 0.0

        for (i in menu) {

            orders.forEach {

                if (it == i.name) {

                    sum += i.price

                }
            }
        }

        println("Total Amount : $sum")

    }

    fun cheapestItem() {

        var min = menu[0].price

        for (i in menu) {

            if (min > i.price) min = i.price

        }

        menu.forEach {

            if (min == it.price) {

                println("Cheapest Item: $it")
                return
            }
        }
    }

    fun drinksOnly() {

        println("Drinks")

        for (i in menu) {

            if (i.type == Type.Drink) {

                println(i)

            }
        }
    }

    fun foodOnly() {

        println("Foods")

        for (i in menu) {

            if (i.type == Type.Food) {

                println(i)
            }
        }
    }

}


