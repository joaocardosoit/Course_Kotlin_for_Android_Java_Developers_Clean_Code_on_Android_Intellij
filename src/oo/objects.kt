package oo

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import oo.House.Companion.HOUSES_FOR_SALES
import oo.House.Companion.getNormalHouse as createHouse
import basics.getExternalInput

object CountryFactory{
    val a = 4
    fun createCountry() = Country("Australia")
}

object DefaultClickListener : MouseAdapter(){
    override fun mouseClicked(e: MouseEvent?) {
        super.mouseClicked(e)
        println("Mouse was clicked")
    }
}

fun main(args: Array<String>) {
    CountryFactory.a
    CountryFactory.createCountry()
    createHouse()
}