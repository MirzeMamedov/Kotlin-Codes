import kotlin.random.Random
import kotlin.time.measureTimedValue

fun main() {

    // ----------------------------------------------------------

    // Simple Class:
    // Create a class called Person with properties name (String) and age (Int).
    // Add a method to print the person's details.
    // Instantiate the class and test the method with different instances.

    // var person = Person("Mirze",18)

    // ----------------------------------------------------------

    // Constructor Overloading:
    // Expand the Person class to include secondary constructors.
    // Create instances of the class using both the primary and secondary constructors.

    // var person1 = Person("Mirze")
    // person1.detailsPrinterFunction()
    // var person2 = Person(18)
    // person2.detailsPrinterFunction()

    // ----------------------------------------------------------

    // Inheritance:
    // Define a base class Shape with properties name and color.
    // Create two subclasses, Circle and Square, with additional properties specific to each shape.
    // Test the inheritance hierarchy by creating instances of each class.

    // var circle = Circle("Circle" , "Blue" , 5)
    // circle.detailsPrinterFunction()
    // var rectangle = Rectangle("Rectangle","Red" , 6,7)
    // rectangle.detailsPrinterFunction()

    // ----------------------------------------------------------

    // Data Class:
    // Refactor the Person class into a data class.
    // Test the built-in functions generated for data classes, such as toString, equals, and hashCode.

    /*

    val personData = PersonsData("Mirza", 18)
    val personData2 = PersonsData("Mirze", 18)
    val personData3 = personData.copy()

    // toString()
    println("$personData $personData2")

    // hasCode()
    println(personData.hashCode())

    // equals()
    println(personData.equals(personData2))
    println(personData == personData2)

    // componentN()
    println(personData.component1() + "  " + personData.component2())

    // copy()
    println("$personData3")

    val (name, age) = personData
    println("NAME : $name , AGE : $age")

    */

    // ----------------------------------------------------------

    // Companion Object:
    // Add a companion object to the Person class with a function createRandomPerson that generates a person with a random name and age.
    // Call the companion function to create instances.

    /*

    var randomPerson : Person

    repeat(20){

        randomPerson = Person.createRandomPerson()
        randomPerson.detailsPrinterFunction()

    }

    */

    // ----------------------------------------------------------

    // Nullable Properties:
    // Modify the Person class to make the age property nullable.
    // Update the print method to handle null values gracefully.

    // val person = Person("Name")

    // ----------------------------------------------------------

    // Extension Function:
    // Create an extension function for the String class called abbreviate that shortens a string to a specified length, adding an ellipsis if the string is truncated.
    // Test the extension function with different strings.

    // val string = "mirzeMemmedov".abbrivate(10)
    // println(string)

    // ----------------------------------------------------------

    // Interface Implementation:
    // Define an interface called Drawable with a method draw.
    // Implement this interface in the Circle and Square classes.
    // Create instances of these classes and call the draw method.

    /*

    var circle = Circle("Circle" , "Blue" , 5)

    circle.detailsPrinterFunction()
    circle.draw()

    var rectangle = Rectangle("Rectangle","Red" , 6,7)

    rectangle.detailsPrinterFunction()
    rectangle.draw()

    */

    // ----------------------------------------------------------

    // Sealed Class:
    // Introduce a sealed class called Result with two subclasses, Success and Failure.
    // Use this class to model the result of a function that can either succeed or fail.
    // Write a function that returns an instance of Result and handle both cases.

    // println(checkingSealedClasses(0))


    // ----------------------------------------------------------

    // Object Declaration:
    // Create an object declaration called Logger with a function log that prints a log message.
    // Use this object to log messages from different parts of your application.

    // val shape  = Shape("Circle","blue")

    // ----------------------------------------------------------

}

fun String.abbrivate(index: Int): String = if (index > this.length) this else this.substring(0, index)

sealed class Result {

    class Success() : Result()
    class Failure() : Result()

}

fun checkingSealedClasses(number: Int): Result {



    return if (number > 0) Result.Success() else Result.Failure()

}

class Logger{

    fun logMessage() = println("log Message")

}

interface Drawable {

    fun draw()

}

class Circle(name: String, color: String, val radius: Int) : Shape(name, color), Drawable {

    /*init {

        detailsPrinterFunction()

    }*/

    override fun detailsPrinterFunction() {

        super.detailsPrinterFunction()
        println(" Radius: $radius")

    }

    override fun draw() {
        println("Drawable")
    }

}

class Person(
    private val name: String?,
    private val age: Int?
) {

    private var surname: String? = null
        get() {
            return field
        }
        set(value) {
            field = value
        }

    /*init {

        detailsPrinterFunction()

    }*/

    constructor(name: String) : this(name, null)

    constructor(age: Int) : this(null, age)

    fun detailsPrinterFunction() = println("Name: $name Age : $age")

    companion object{

        fun createRandomPerson(): Person {

            val names = listOf(
                "Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace", "Henry", "Ivy", "Jack",
                "Kate", "Liam", "Mia", "Noah", "Olivia", "Peter", "Quinn", "Rachel", "Sam", "Tyler"
            )

            val randomAge = Random.nextInt(15, 45)
            val randomNumber = Random.nextInt(0, 19)

            return Person(names[randomNumber], randomAge)

        }

    }

}


data class PersonsData(val name: String, val age: Int){

    override fun toString() : String = "PersonsData($name ,$age)"

}

class Rectangle(name: String, color: String, val height: Int,val width: Int) : Shape(name, color), Drawable {

    /*init {

        detailsPrinterFunction()

    }*/

    override fun detailsPrinterFunction() {
        super.detailsPrinterFunction()
        println(" Height: $height , Width : $width")

    }

    override fun draw() {
        println("Drawable")
    }

}


open class Shape(val name: String, val color: String) {

    init {

        Logger().logMessage()

        detailsPrinterFunction()

    }

    open fun detailsPrinterFunction() = print("Name: $name Color : $color")

}


