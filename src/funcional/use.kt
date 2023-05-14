package funcional

import java.io.FileReader

fun main(args: Array<String>){

    FileReader("mayexist.txt").use {
        val str = it.readText()
        println(str)
        it.close()
    }
}