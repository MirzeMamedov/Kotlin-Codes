fun main() {

    var student = Student()

    student.name = "Mirza"
    student.register()

}

class Student {

    lateinit var name: String

    fun register() = println("Name : $name")

}

// var and non-nullable