import java.util.TreeMap
import kotlin.math.pow

fun main() {

    // ------------------------------------------------------

    operator fun Any?.invoke() = println(this)

    "Hello World"()

    // ------------------------------------------------------

    operator fun Int.invoke(other: Int) = this * other

    val result = 3(3 + 2)

    println(result)

    // ------------------------------------------------------

    operator fun Int.get(digit: Int): Int =
        div(10.0.pow(digit.toDouble()))
            .rem(10.0)
            .toInt()

    println(listOf(1, 2, 3, 4)[0])
    println(listOf(1, 2, 3, 4)[1])
    println(listOf(1, 2, 3, 4)[2])
    println(listOf(1, 2, 3, 4)[3])

    // ------------------------------------------------------

    val double: (Int) -> Int = { it * 2 }

    operator fun <T, R> ((T) -> R).get(parameter: T): R {
        return this(parameter)
    }

    operator fun <T, R> ((T) -> R).invoke(parameterProvider: () -> T): R {
        return this(parameterProvider())
    }

    var outcome1 = double(12)
    var outcome2 = double[12]
    var outcome3 = double { 12 }

    println("Outcomes: $outcome1 $outcome2 $outcome3")

    // ------------------------------------------------------

    operator fun <K, V> TreeMap<K, V>.get(index: Int): V? {
        return this.values.elementAt(index)
    }

    var map = TreeMap<String, String>()

    map["b"] = "bravo"
    map["a"] = "alpha"
    map["d"] = "delta"
    map["e"] = "echo"
    map["c"] = "charlie"

    println(map["d"])
    println(map[3])

    // ------------------------------------------------------

    val user = User("Mirza")

    // ------------------------------------------------------

    operator fun Int.Companion.get(vararg items: Int): IntArray =
        intArrayOf(*items)

    val evenNumber = Int[2, 4, 6, 8, 10]

    evenNumber.forEach(::println  )

    // ------------------------------------------------------

}

// ------------------------------------------------------

class User(val name: String) {
    companion object
}

// ------------------------------------------------------

class UserRecord(val firstName: String, val lastName: String)

// ------------------------------------------------------

operator fun User.Companion.invoke(record: UserRecord) =
    User("${record.firstName} ${record.lastName}")

// ------------------------------------------------------