package com.example.learnkotlin

fun main() {
    val emp: Employee = Employee()
    emp.age = 20
    emp.name = "John"

    emp.let {
        it.age = 20
        it.name = "John"
    }

    with(emp) {
        age = 30
        name = "XYZ"
    }
}

data class Employee(var name: String = "", var age: Int = 18)