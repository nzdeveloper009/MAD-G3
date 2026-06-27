package com.example.learnkotlin

interface Vehicle {
    fun drive()
}

class Car : Vehicle {

    override fun drive() {
        println("Car is driving")
    }
}

class Bike : Vehicle {

    override fun drive() {
        println("Bike is driving")
    }
}

object VehicleFactory {

    fun getVehicle(type: String): Vehicle {

        return when (type) {
            "Car" -> Car()
            "Bike" -> Bike()
            else -> Car()
        }
    }
}

fun main() {

    val vehicle1 = VehicleFactory.getVehicle("Car")
    vehicle1.drive()

    val vehicle2 = VehicleFactory.getVehicle("Bike")
    vehicle2.drive()
}