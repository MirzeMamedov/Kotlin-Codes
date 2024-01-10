fun main() {

    options()

}

fun printMenu(roomInformationList: MutableList<Room>, profitList: MutableList<Profit>) {

    println("Enter options \n")
    println("1. Reserve Room")
    println("2. Empty Room")
    println("3. The Number of Full Room")
    println("4. The Number of Empty Room")
    println("5. Bedroom Information")
    println("6. Find Room")
    println("7. Profit")
    println("8. Quit")

    print("Choice: ")

    val option = readlnOrNull()?.toIntOrNull()

    if (option !in 1..8) {

        println("Invalid option. Please try again.")
        return printMenu(roomInformationList, profitList)

    }

    when (option) {

        1 -> reserveRoom(roomInformationList, profitList)
        2 -> emptyRoom(roomInformationList)
        3 -> numberOfFullRoom(roomInformationList)
        4 -> numberOfEmptyRoom(roomInformationList)
        5 -> bedroomInformation(roomInformationList)
        6 -> findRoom(roomInformationList)
        7 -> calculateProfit(profitList)
        8 -> return

    }

    printMenu(roomInformationList, profitList)


}


fun options() {

    var roomInformationList = mutableListOf<Room>()

    var profitList = mutableListOf<Profit>()

    for (i in 1..45) {

        roomInformationList.add(Room(i, Status.Empty))

    }

    printMenu(roomInformationList, profitList)


}

fun reserveRoom(roomInformationList: MutableList<Room>, profitList: MutableList<Profit>) {

    print("Enter How Many Night You Want To Stay: ")
    val inputNight = readln().toInt()

    println("Please Choose One Option")
    println("1. Single occupancy room")
    println("2. Double occupancy room")
    println("3. Triple occupancy room")

    print("Enter Choice: ")

    val inputChoice = readln().toInt()

    var inputCostPerNight = 0

    when (inputChoice) {

        1 -> inputCostPerNight = 50
        2 -> inputCostPerNight = 100
        3 -> inputCostPerNight = 150
        else -> reserveRoom(roomInformationList, profitList)

    }

    print("Enter Name: ")
    val inputName = readlnOrNull() ?: "Name"

    print("Enter Surname: ")
    val inputSurname = readlnOrNull() ?: "Surname"

    for (i in roomInformationList) {

        if (i.status == Status.Empty) {

            profitList.add(Profit(inputNight, inputCostPerNight))

            i.name = inputName
            i.surname = inputSurname
            i.status = Status.Full

            println("Reserve is accepted!!")
            break

        }

    }

}

fun emptyRoom(roomInformationList: MutableList<Room>) {

    print("Enter Room Number: ")
    val inputRoomNumber = readln().toInt()

    for (i in roomInformationList) {

        if (i.roomNumber == inputRoomNumber) {

            i.name = null
            i.surname =  null
            i.status = Status.Empty

            println("Now room is empty!!")

        }

    }

}

fun numberOfFullRoom(roomInformationList: MutableList<Room>) {

    for (i in roomInformationList) {

        if (i.status == Status.Full) {

            println("Room : ${i.roomNumber} , Customer Identity ${i.name} ${i.surname}")

        }

    }

}

fun numberOfEmptyRoom(roomInformationList: MutableList<Room>) {

    for (i in roomInformationList) {

        if (i.status == Status.Empty) {

            println("Room Number ${i.roomNumber}  is ${i.status}")

        }

    }

}

fun bedroomInformation(roomInformationList: MutableList<Room>) {

    for (i in roomInformationList) {

        println("Room Number ${i.roomNumber}  is ${i.status}")

    }

}

fun findRoom(roomInformationList: MutableList<Room>) {

    print("Enter Room Number: ")
    val inputRoomNumber = readln().toInt()

    for (i in roomInformationList) {

        if (i.roomNumber == inputRoomNumber) {

            if (i.status == Status.Full) {

                println("Room : ${i.roomNumber} , Customer Identity ${i.name} ${i.surname}")
                break

            } else {

                println("Room Number ${i.roomNumber}  is ${i.status}")
                break

            }

        }

    }


}

fun calculateProfit(profitList: MutableList<Profit>) {

    var profit: Int = 0

    for (i in profitList) {

        profit += (i.night * i.costPerNight)

    }

    println("Profit : $profit")

}


enum class Status { Empty, Full }

data class Room(var name: String? = null, var surname: String? = null, val roomNumber: Int, var status: Status) {

    constructor(roomNumber: Int, status: Status) : this(null, null, roomNumber, status)

}

data class Profit(val night: Int, val costPerNight: Int)

