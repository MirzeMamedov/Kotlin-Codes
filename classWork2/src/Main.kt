fun main() {

    // val integerList = listOf<Int>(1,3,5)
    // println(sumOfCubs(integerList))

    // println(isSymmetrical(readln()))

    /*

    for (i in 1..<50){

        if (primeNumber(i))
            println("Prime Number :$i")

    }

    */

    /*

    var average = mutableListOf<Int>()
    var number : Int

    while (true){

        print("Enter Number:")
        number = readln().toInt()

        if(number != 0) {

            average.add(number)
            println("Avarage :${average.average()}")

        } else break

    }

    */

    /*

    when(readln().toInt()){

        in 90 .. 100 -> println("Grade : A")
        in 80 .. 90 -> println("Grade : B")
        in 70 .. 80 -> println("Grade : C")
        in 60 .. 70 -> println("Grade : D")
        in 0 .. 60 -> println("Grade : F")
        else -> println("This os not a grade")

    }

    */

    // println(sumOfSquares(4,4) { a, b -> a * a + b * b })
    // println(calculateArea(4,4) { a, b -> a * b })

    // check(Result.Failure("Something went wrong"))

    // println(sameTitleAndAuthor(Book("KaramazovBrothers", "Dostoevsky", 2020), Book("KaramazovBrothers", "Dostoevsky", 2028)))

}

data class Book(val title: String, val author: String, val publicationYear: Int)

fun sameTitleAndAuthor(book1: Book, book2: Book): Boolean {

    return book1.author == book2.author && book1.title == book2.title

}

fun check(result: Result) {

    when (result) {

        is Result.Success -> println(result.message)
        is Result.Failure -> println(result.message)

    }

}

sealed class Result(val message: String) {

    class Success(message: String = "Success") : Result(message)
    class Failure(message: String = "Failure") : Result(message)

}

inline fun sumOfSquares(number1: Int, number2: Int, myFun: (Int, Int) -> (Int)) = myFun(number1, number2)
inline fun calculateArea(height: Int, width: Int, myFun: (Int, Int) -> (Int)) = myFun(height, width)

fun primeNumber(number: Int): Boolean {

    for (i in 2..<number) {

        if (number % i == 0) return false

    }

    return true

}

fun isSymmetrical(number: String) = if (number.equals(number.reversed())) true else false

fun sumOfCubs(list: List<Int>): Int {

    var sum = 0

    list.forEach { sum += it * it * it }

    return sum

}