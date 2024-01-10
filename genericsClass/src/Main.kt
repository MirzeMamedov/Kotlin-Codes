typealias Name = String

fun main() {

    val listOfStrings: List<String> = listOf("Donn", "John", "Mery")
    val listOfInt: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val result = EvenList(listOfStrings)
    println("Result : ${result.evenItems()}")

    val result2 = EvenList(listOfInt)
    println("Result : ${result2.evenItems()}")


    val listOfPeople = listOf(

        Person("Mirza"),
        Person("Bobby"),
        Person("Alice"),
        Person("Carl"),

        )

    val result3 = EvenList(listOfPeople)
    println("Result : ${result3.evenItems()}")
}

data class Person(val name: Name)

class EvenList<Type>(val list: List<Type>) {

    fun evenItems(): List<Type> {

        return list.filterIndexed { index, item -> index % 2 == 0 }

    }

}