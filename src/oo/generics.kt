package oo

import java.sql.Time
import java.util.Collections
import java.util.Date

val list: List<Int> = listOf(1, 2, 3)

class TimeSeries<E>{

    val date2Data: MutableMap<Date, E> = mutableMapOf()

    fun add(element: E){
        date2Data.put(Date(), element)
    }

    fun addAll(elements: Collection<E>){
        elements.forEach{ add(it)}
    }

    fun getLatest(): E{
        return date2Data.values.last()
    }
}

fun <E> timeSeriesOf(vararg elements: E): TimeSeries<E>{
    val result = TimeSeries<E>()
    for (element in elements){
        result.add(element)
    }
    return result
}

fun main(args: Array<String>) {
    val timeline: TimeSeries<Int> = TimeSeries()
    timeline.add(2)
    timeline.getLatest()

    val timeline2: TimeSeries<String> = timeSeriesOf("","","")
}