package oo

abstract class Vehicle(open val brand: String = ""){

    open fun drive(){
        println("Driving")
    }

    abstract fun honk()
}

class Sedan(override val brand: String = "Brand"): Vehicle(), Driveble{
    override fun drive() {
        super<Driveble>.drive()
    }

    override fun honk() {
        println("Buzina")
    }
}

fun main(args: Array<String>) {
    val sedan = Sedan()
    sedan.drive()
    sedan.honk()
}