package oo

interface Driveble{
    fun drive(){
        println("Driving (interface)")
    }
}

class Bicycle: Driveble{
    override fun drive() {
        println("Driving bicycle")
    }
}

class Boat: Driveble{
    override fun drive() {
        println("Driving boat")
    }
}

fun main(args: Array<String>) {
    val drivable: Driveble = Bicycle()
    drivable.drive()
}