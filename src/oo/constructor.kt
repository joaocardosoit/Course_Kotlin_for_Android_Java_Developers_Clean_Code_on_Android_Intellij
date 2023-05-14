package oo

class Country(val name: String, val areaSqKm: Int){

    constructor(name: String) : this(name, 0){
        println("Constructor called")
    }
    fun print() = "$name, $areaSqKm km^2"
}

fun main(args: Array<String>) {
    val australia = Country("Australia", 7_700_000)

    println(australia.name)
    println(australia.areaSqKm)

    val spain = Country("Spain")
    println(spain.name)
    println(spain.areaSqKm)
}