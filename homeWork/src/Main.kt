import kotlin.math.sqrt

fun main() {

    // -------------------------------------------

    // Positive/Negative/Zero:
    // Write a program that takes an integer input and prints whether it's positive, negative, or zero.

    /*
    println("Enter Number ")

    var numberInt : Float = readln().toFloat()
    var result = if(numberInt > 0) "positive" else if(numberInt < 0) "negative" else "zero"

    //var kvadrat = numberInt*numberInt

    println("Kvadrat : ${numberInt*numberInt}")
    println("Result: $result")
    */

    // -------------------------------------------

    // Even/Odd:
    // Create a program that checks if a given number is even or odd.

    /*
    println("Enter Number: ")

    var number = readln().toInt()
    var result = if( number % 2 == 0 ) "Even" else "Odd"

    println("Result: " + result)
    */

    // -------------------------------------------

    // Leap Year:
    // Implement a program to determine if a given year is a leap year.

    /*
    println("Enter Year: ")

    var year =readln().toInt()
    var result = if( year %4 == 0 && year %100 != 0 ) "Leap" else "Not Leap"

    println("Result: $result")
    */

    // -------------------------------------------

    // Largest among three:
    // Write a program that takes three numbers as input and prints the largest one.

    /*
    var number1 = readln().toInt()
    var number2 = readln().toInt()
    var number3 = readln().toInt()

    if( number1 >= number2 && number1 >= number3 ){

        println("Largest Number: $number1")

    } else if( number2 >= number1 && number2 >= number3 ){

        println("Largest Number: $number2")

    } else {

        println("Largest Number: $number3")

    }
    */

    // -------------------------------------------

    // Grading System:
    // Create a program that takes a student's score as input and prints their grade (A, B, C, D, or F).

    /*
    println("Enter Grade: ")

    var grade= readln().toInt()

    when{

        (grade > 90) -> println("A")
        (grade > 80) -> println("B")
        (grade > 70) -> println("C")
        (grade > 60) -> println("D")
        (grade > 50) -> println("F")
        else -> println("FAILED")

    }
    */

    // -------------------------------------------

    // Palindrome Check:
    // Create a program to check if a given string is a palindrome.

    /*
    print("Enter a string: ")

    var string = readln()
    var length = string.length
    var flag = true

    for(i in 0 until length ){

        if( string[i] != string[length-i-1] ){

            println("Not Palindrome")
            flag = false
            break

        }

    }

    if(flag){

        println("Palindrome")

    }
    */
    // -------------------------------------------

    // Prime Number:
    // Implement a program to determine if a given number is prime.

    /*
    var number = readln().toInt()
    var flag = true

    for(i in 2 until number ){

        flag = true
        for( x in 2 until (i/2)+1 ){

            if(i % x == 0){

                flag = false
                break;

            }

        }

        if(flag){

            println("Prime: $i")

        }

    }
    */

    // -------------------------------------------

    // Check symbol is exist in string:
    // Take a string and symbol from user and check that symbol exists in string.

    /*

    var string = readln()
    var character = readln().firstOrNull()
    var flag = false

    for(i in 0 until string.length){

        if(string[i] == character){

            flag = true

        }

    }

    if(flag){

        println("Exist")

    } else {

        println("Not Exist")

    }
    */

    // -------------------------------------------

    // Sözün ahəng qanununa tabi olup-olmadığını yoxlayın

    /*

    print("Enter a string: ")
    var string = readln()
    vowels(string)

    */

    // -------------------------------------------

    // Quadratic Equation Roots:
    // Write a Kotlin program that takes coefficients of a quadratic equation and prints its roots

    /*
    println("Enter a: ")
    var a = readLine()?.toDoubleOrNull() ?: 0.0

    println("Enter b: ")
    var b = readLine()?.toDoubleOrNull() ?: 0.0

    println("Enter c: ")
    var c = readLine()?.toDoubleOrNull() ?: 0.0

    var D = b * b - 4 * a * c

    when{

        D > 0 -> {

            val root1 = (-b + sqrt(D)) / (2 * a)
            val root2 = (-b - sqrt(D)) / (2 * a)

            println("Root 1: $root1")
            println("Root 2: $root2")

        }
        D == 0.0 -> {

            val root1 = -b / (2 * a)

            println("Root: $root1")

        }
        D < 0 -> {

            println("There is no real root of this equation.")

        }

    }
    */

    // -------------------------------------------

    // Sum of digits of number (10 <= number <= 99)

    /*
    println("Enter Number: ")

    var number = readLine()?.toInt() ?: 0
    var sum : Int


    for (i in 10 until number) {

        sum = sumOfDigits(i)
        println("Sum of Digits of $i is $sum")

    }
    */

    for( i in 1 until 100  ){

        if( i * i  > 40 ){

            println(i)

        }

    }

    val number = readLine()?.toIntOrNull() ?: 5
    factorial(5 )

}

fun factorial(number : Int ) : Int{

    return if(number == 1) 1 else number*factorial(number-1)

}


fun foo() {
    run loop@{
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@loop
            print(it)
        }
    }
    print(" done with nested loop")
}

fun sumOfDigits(number : Int) : Int{

    var num = number
    var sum = 0
    var digit : Int

    while( num != 0){

        digit = num % 10
        sum += digit
        num = num / 10

    }

    return sum

}

fun vowels( string : String , ){

    var saitler = "aıoueəiöü"
    var qalinlarinSayi = 0
    var incelerinSayi  = 0
    var flag = true

    for(i in 0 until string.length ){

        for(x in 0 until saitler.length ){

            if( string[i] == saitler[x] ){

                if( x <= 3 ){

                    qalinlarinSayi += 1

                } else {

                    incelerinSayi += 1

                }

            }

            if( qalinlarinSayi !=0 && incelerinSayi != 0 ){

                flag = false
                break

            }
        }

        if(!flag){

            println("Aheng qanununa tabe deyil")
            break

        }

    }

    if(flag){

        println("Aheng qanununa tabedir")

    }

}