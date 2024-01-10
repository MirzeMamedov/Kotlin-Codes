fun main() {

    var circle = Circle(5.0)
    var rectangle = Rectangle(5.0, 6.0)

    println(rectangle.area())
    println(circle.area())

}

open class Shape() {

    open fun area(): Double = 0.0

}

class Circle(val r: Double) : Shape() {

    override fun area(): Double {

        return Math.PI * r * r / 2
    }
}

class Rectangle(val a: Double, val b: Double) : Shape() {

    override fun area(): Double {
        return a * b
    }
}