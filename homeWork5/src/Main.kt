fun main() {

    // Həftənin günlərini təmsil etmək üçün DayOfWeek adlı ENUM sinfi yaradın.
    // Şənbə və Bazar günləri üçün TRUE, digər günlər üçün isə FALSE dəyər qaytaran isWeekend adlı metod əlavə edin.
    // DayOfWeek parametrini götürən və həftə sonu və ya iş günü olmasını çap edən printDayInfo adlı funksiyanı extension olaraq yaradın.

    // println((DaysOfWeek.Sunday).isWeekend())


    // CommonCardSystem adlı classə abstract yaradın
    // Daxilində name parametri və printName() funksiyası
    // Visa və Master adlı iki child class yuxarıdakı iki özəlliyi məcbur override etsin.
    // name parametrinə çöldən əl çatmasın. Məsələn val v = Visa(), v.name yazdıqda xəta versin

    /*

    val master = Master("Master Card")
    master.printName()

    val visa = Visa("Visa Card")
    visa.printName()

    */

}

abstract class CommonCardSystem(private var name: String) {

    abstract fun printName()

}

class Master(private var name: String) : CommonCardSystem(name) {
    override fun printName() {
        println(name)
    }

}

class Visa(private var name: String) : CommonCardSystem(name) {
    override fun printName() {
        println(name)
    }


}

enum class DaysOfWeek {

    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

    fun isWeekend(): Boolean {

        when (this) {

            Saturday -> return true
            Sunday -> return true
            else -> return false

        }

    }

    // fun isWeekend() = this in setOf(Saturday, Sunday)


}