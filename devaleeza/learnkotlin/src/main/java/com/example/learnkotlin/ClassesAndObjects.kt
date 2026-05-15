package com.example.learnkotlin

fun main() {
    val mustang = Car( name = "mustang", type =  "petrol", kmRan = 100)
    val beetle = Car(name = "beetle", type = "diesel", kmRan = 200)

    println(mustang.name)
    println(mustang.type)

    println(beetle.name)

    mustang.driveCar()
    beetle.driveCar()
}
class Car (val name: String, val type : String, var kmRan : Int) //properties
{
    fun driveCar(){ //methods
        println(" $name Car is driving")
    }
    fun applyBrakes(){
        println("Applied Brakes")
    }
}