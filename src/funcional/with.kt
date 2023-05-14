package funcional

fun main(agrs: Array<String>){

    val props = System.getProperties()

    with(props){
        list(System.out)
        println(propertyNames().toList())
        println(getProperty("user.home"))
    }
}