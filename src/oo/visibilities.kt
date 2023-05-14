package oo

// private
// protected
// internal - visible inside the same module
// public

private val i = 42
fun a() = 17
private class Car(val brand: String, private val model: String){

    fun tellMeYourModel() = model
}

fun main(args: Array<String>) {
    val car = Car("BRAND", "MODEL")
    car.brand
    car.tellMeYourModel()
    println(i)
}