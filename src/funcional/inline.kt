package funcional

inline fun modifyString(str: String,  operation: (String) -> String): String{
    return operation(str)
}

fun main(args: Array<String>){
    modifyString("Kotlin is amazing") { it.uppercase() }
}