fun main() {

    // println("Sum: " + multiple(1,2,3,1,4))
    // println("Sum2: " + multiple2(1,2,3,1,4))
    // println("Sum3: " + multiple("12  " , "ad" , "49" , "13.2" ,"110abs" ,"2.46") )
    // println(5 substitution "12.3")
    /*
    var arr = arrayOf<Int>(1,2,3,4,5,6,7,8,9)

    println(multiple2(*arr.toIntArray()))
    */

    // arithmeticOperation("12 + 12" , "15 * 6" , "30 - 16" , "49 / 7")

    // ----------------------------------------------------------------

    // Write a Kotlin method to find the smallest number among three numbers.

    // println(findSmallestNumberAmongThreeNumber(4,-167,897))

    // ----------------------------------------------------------------

    // Write a Kotlin method to find the smallest number among multiple numbers (varargs).

    // println(findSmallestNumber(12, 16, 31, 49, 48, 0, -45, 75))

    // ----------------------------------------------------------------

    // Write a Kotlin single expression method to compute the average of multiple numbers (varargs, single expression function)

    // println(findAverage(5, 10, 15, 20, 25, 30, 35))

    // ----------------------------------------------------------------

    // Write function: set valid user password.
    // Valid password must contain at least 1 capital character, 1 special symbol (_, +, ?, ., @)
    // and length have to be at least 8.
    // You should call this function on main function and give user 3 mistake chance.
    // If he(she) made mistakes more than 3 print "Failure" and quit
    // If success print "Password successfully set" and quit

    // createStrongPassword()

    // ----------------------------------------------------------------

}

fun findSmallestNumberAmongThreeNumber(a: Int, b: Int, c: Int): Int = if (a < b && b < c) b else if (b < a && c < b) b else c

fun findAverage(vararg numbers: Int): Int {

    // sum()

    var avarage = 0

    numbers.forEach { avarage += it }

    return avarage / numbers.size

}

fun findSmallestNumber(vararg numbers: Int): Int {

    // min()

    var min = numbers[0]

    numbers.forEach {

        if (it < min) min = it

    }

    return min

}

fun createStrongPassword(count: Int = 3) {

    println("Enter Strong Password: $count ")

    val password = readln()
    if (count == 0) return else if (password.length < 8) {
        createStrongPassword(count - 1)
        return
    }

    var flag1 = false
    var flag2 = false

    for (i in password.indices) {

        if (password[i].isUpperCase()) flag1 = true
        else if (!password[i].isLetter() && !password[i].isDigit()) flag2 = true

    }

    return if (flag1 && flag2) println("Password successfully set") else createStrongPassword(count - 1)

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

infix fun Int.substitution(x: String): Double {

    return if (x.toDoubleOrNull() != null || x.toIntOrNull() != null) this + x.toDoubleOrNull()!! else this.toDouble()

}

fun multiple(vararg numbers: Int): Int {

    var sum = 0

    numbers.forEach {

        sum += it

    }

    return sum
}

fun multiple2(vararg numbers: Int): Int = numbers.sum()

fun multiple3(vararg numbers: String): Double {

    var sum = 0.0

    numbers.filter { it.toIntOrNull() != null || it.toDoubleOrNull() != null }.forEach {

        sum += it.toDouble()

    }

    return sum

}

