package basics


fun main(args: Array<String>){
    //val read: String = readln()
    //val random = mutableListOf<Int>()

    val data = mapOf(
            "users1.csv" to listOf(32, 45, 17, -1, 34),
            "users2.csv" to listOf(19, -1, 67, 22),
            "users3.csv" to listOf(),
            "users4.csv" to listOf(56, 32, 18, 44)
    )

    val averageAge = data.flatMap {  it.value }
            .filter { it >= 0 }
            .average()

    val extractNameWithFaultyData = data.filter { it.value.any{ it < 0} }
            .map { it.key }

    val totalFaultyData = data.filter { it.value.any{ it < 0} }
            .count()

    println("Users average %.2f years of age.".format(averageAge))
    println("Files with faulty data: $extractNameWithFaultyData")
    println("There were $totalFaultyData errors in the data.")
    /*println(read)
    if (read.isNotEmpty() && read.isNotBlank()){
        println("Welcome $read")
    } else {
        println("Enter your name please!")
    }*/

    /*for (i in 1..100){
        random.add(kotlin.random.Random.nextInt(1,100))
    }

    var i = 0
    while (i < random.size && random[i] > 10){
        println(random[i])
        i++
    }*/
}

