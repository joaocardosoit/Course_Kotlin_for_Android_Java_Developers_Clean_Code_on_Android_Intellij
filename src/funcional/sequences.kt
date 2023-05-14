package funcional

import kotlin.system.measureTimeMillis

fun main(args: Array<String>){

    val veryLongList = (1..999999L).toList()

    var sum = 0L
    var lazySum = 0L

    val msNonLazy = measureTimeMillis {
        sum = veryLongList
                .filter { it > 50 }
                .take(10000)
                .map { it * 2 }
                .sum()
    }

    val msLazy = measureTimeMillis {
        lazySum = veryLongList
                .asSequence()
                .filter { it > 50 }
                .take(10000)
                .map { it * 2 }
                .sum()
    }

    println("Non Lazy: $msNonLazy ms, Result: $sum")
    println("Lazy: $msLazy ms, Result: $lazySum")
}