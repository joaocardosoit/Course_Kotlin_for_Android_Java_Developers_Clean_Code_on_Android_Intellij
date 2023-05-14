package oo

import kotlin.math.PI
import kotlin.math.pow

abstract class Shape(val name: String){

    abstract fun area(): Double

}

class Circle(name: String, val radius: Double): Shape(name){

    override fun area() = PI * radius.pow(2.0)
}

fun main(args: Array<String>) {
    val shape = Circle("Name", 17.0)
    println(shape.area())
}