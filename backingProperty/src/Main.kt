fun main() {

    var person = Person()

    person.addHobbies("Cricket")
    println(person.hobbies)


    var student = Student()

    student.age = 10
    println("Age : ${student.age}")
}

class Student {

    private var _age: Int = 0

    var age : Int
        get() {

            return _age

        } set(value){

            _age = value

        }

}

class Person{

    private var _hobbies = mutableListOf<String>() // backing Property

    val hobbies : List<String>
        get() = _hobbies

    fun addHobbies( hobbyName : String) = _hobbies.add(hobbyName)

}