package funcional

fun main(args: Array<String>){

    val list = listOf("Hi", "there", "Kotlin", "fans")
    val constainsT = listOf(false, true, true, false)

    //Pair<String, Boolean>
    val zipped: List<Pair<String, Boolean>> = list.zip(constainsT)

    val mapping = list.zip(list.map { it.contains("t") })

    println(zipped)
    println(mapping)
}