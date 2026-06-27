package com.example.learnkotlin

//single responsibility principle
fun main(){

    val order = order(listOf("laptop","Mouse"))

    val calculator = ordercalculator()
    val repository =Orderrepository()
    val email = Emailservice()

    calculator.calculatort()
    repository.save(order)
    email.sendconfimation(order)


}