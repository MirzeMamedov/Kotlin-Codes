fun main(args: Array<String>) {

    // Istifadəçidən sətr tipli dəyər alın və içərisindəki söz sayını dövr istifadə edərək tapın.
    // Sətr uzunluğunu "length" parametri ilə götürə bilərsiniz

    /*

    print("Enter Sentence: ")
    var string = readln()

    println("Count: " + countWords(string))

   */

    // ----------------------------------------

    // Vurma cədvəlini alt-alta çap edən proqram tərtib edin
    // Format belə olsun:
    // 1 * 1 = 1
    // 1 * 2 = 2
    // 1 * 3 = 3
    // 1 * 4 = 4
    // 1 * 5 = 5
    // 1 * 6 = 6
    // 1 * 7 = 7
    // 1 * 8 = 8
    // 1 * 9 = 9

    // 2 * 1 = 2
    // 2 * 2 = 4
    // və sair...

    /*

    for( i in 1 until 10 )
        for( x in 1 until 10 )
            println("$i * $x = " + i * x )

    */

    // ----------------------------------------

    // Sətrdəki ədədlərin cəmini tapın:
    // Please, buy 3 kq tomato and 12 kp bananas ----  3 + 12 = 15
    // Bu zaman sözlərə bölmək üçün "split" funksiyasından istifadə edə bilərsiniz. Araşdırın.

    /*
    print("Enter Sentence: ")

    var string : String = readLine() ?: "Please , Enter Something"
    var words = string.split(" ")

    println(words.size)

    var count = 0

    words.filter { it != "\n" && it != "" }.forEach {

        if (it.all { char -> char.isDigit() }) {
            count += it.toInt()
            print("$it + ")
        }

    }

    println("0 = $count")
    */

    // it.isDigit() is true
    // it.all { char -> char.isDigit() }

    // ----------------------------------------

    // Kalkulyator sistemi yığın. Aşağıdakına uyğun yığa bilərsiniz:
    // Number1: 12
    // Number2: 13
    // Operation: +
    // 12.0 + 13.0 = 25.0

    // Command(enter Q for quit, any other character to continue): s

    // Number1: 23
    // Number2: 2
    // Operation: /
    // 23.0 / 2.0 = 11.5

    // Command(enter Q for quit, any other character to continue): Q

    // calculator()

    // ----------------------------------------

    println(2 power 2)
    println("mirza " assemble 2005)

}

infix fun String.assemble( input : Int): String {

    return this.plus(" ").plus(input.toString())


}

infix fun Int.power(x:Int) : Int{

    var result  = 1
    repeat(x){
        result *= this
    }
    return result

}

fun countWords( string : String ) : Int {

    var count = 1

    for( i in 0 until string.length - 1 )
        if( string[i].isLetter() && string[i+1].isWhitespace() )
            count += 1

    return count

}

fun calculator(){

    print("Enter Number1: ")
    var number1 : Float = readlnOrNull()?.toFloat() ?: 1.0f

    print("Enter Number2: ")
    var number2 : Float = readlnOrNull()?.toFloat() ?: 1.0f

    print("Operation(*,/,-,+): ")
    var operation : Char = readlnOrNull()?.firstOrNull() ?: '*'

    when(operation){

        '/' -> println("$number1 / $number2 = " + ( number1 / number2 ) )
        '*' -> println("$number1 * $number2 = " + ( number1 * number2 ) )
        '-' -> println("$number1 - $number2 = " + ( number1 - number2 ) )
        '+' -> println("$number1 + $number2 = " + ( number1 + number2 ) )

    }

    println("Command(enter Q for quit, any other character to continue): Q")
    if( readln() == "Q") return else calculator()

}