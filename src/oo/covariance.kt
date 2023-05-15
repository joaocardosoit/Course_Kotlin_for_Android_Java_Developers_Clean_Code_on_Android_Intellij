package oo

open class Being
open class Person: Being()
class Student: Person()

fun main(args: Array<String>) {

    // Covariance = We can use a "more derived" type (a subtype)
    val people: MutableList<Person> = mutableListOf(Person(), Person())
    people.add(Student()) // Covariance

    // Being does not fulfill the contract of class Person
    // people.add(Being())

    val p: Person = Student() // Covariance

    // Read-only collections are covariant
    val students: List<Person> = listOf<Student>()

    // val students2: MutableList<Person> = mutableListOf<Student>()
    // students2.add(Person())

    // Using Kotlin TimeSeries
    val events: TimeSeries<Person> = timeSeriesOf()
    val students3: List<Student> = listOf(Student(), Student())
    events.addAll(students3) // Covariance

    // Using Java TimeSeries
    val chartData: JavaTimeSeries<Person> = JavaTimeSeries<Person>()
    chartData.add(Student()) // Covariance
    chartData.addAll(students3) // Covariance
}