package funcional

import java.io.File

fun main(args: Array<String>){

    // let()

    // Scoping
    val reader = File("example.txt").bufferedReader().let {
        if (it.ready()){
            println(it.readLine())
        }
    }

    // reader should not be visible

    // Working with nullabls
    val str: String? = "Kotlin for Android"
    str?.let {
        if ( it.isNotEmpty()){
            it.lowercase()
        }
    }
}