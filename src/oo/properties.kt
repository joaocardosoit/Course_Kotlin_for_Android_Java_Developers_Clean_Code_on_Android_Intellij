package oo

class City{

    var name: String = ""
    var population: Int = 0
}

fun main(args: Array<String>) {
    var berlin = City()
    berlin.name = "Berlin"
    berlin.population = 3_500_000

    println(berlin.name)
    println(berlin.population)
}