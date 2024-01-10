fun main(args: Array<String>) {

    add(5, 2, { println(it) })

    // addNumbers(10,{ println(it) })

    // var total = 0
    // for(i in 0 .. 10) total += i
    // println(total)

    // println(perimeterOfTriangle(1,2,3,))

    sum(3)

    findBMI(1.75, 150.0)

}

fun findBMI(height: Double, mass: Double) {

    var lamdaFunc = { height: Double, mass: Double -> mass / (height * height) }

    when (lamdaFunc(height, mass)) {

        in 0.0..18.5 -> println("Under weight")
        in 18.6..24.9 -> println("Normal weight")
        in 25.0..29.0 -> println("Over weight")
        else -> println("Obesity")

    }


}

var a = { a: Int, b: Int -> a + b }

fun sum(c: Int) {

    println(c + a(7, 5))

}

fun perimeterOfTriangle(a: Int, b: Int, c: Int) = a + b + c

fun add(a: Int, b: Int, action: (Int) -> Unit) {

    action(a + b)

}

fun addNumbers(b: Int, action: (Int) -> Unit) {

    var total = 0
    for (i in 0..b) total += i
    action(total)

}

/*
fun main(args: Array<String>) {
    var number = 0
    var wawal = { text: String, vowel: String ->
        for (harf in text) {
            if (harf in vowel) number++
        }
        println("vowel count in text :$number")
    }

    wawal("Salam senana", "sluriaew")
}
*/
