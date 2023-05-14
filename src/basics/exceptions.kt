package basics

import java.io.IOException

fun main(agrs: Array<String>){


    val input = try {
        getExternalInput()
    } catch (e: IOException){
        e.printStackTrace()
        ""
    } finally {
        println("Finished processing external input")
    }
    println(input)
}

fun getExternalInput(): String{
    throw IOException("Could not read external input")
}