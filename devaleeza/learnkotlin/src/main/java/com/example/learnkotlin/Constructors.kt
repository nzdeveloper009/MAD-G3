package com.example.learnkotlin

fun main() {
 var car = Automobile( name = "Car" , tyres = 4 , maxSeating = 5)
    var person = Person( "A", ageParam = 20)
    println(person.age)
    println(person.name)
    var person2 = Person( nameParam = "B", ageParam = 18)
    println(person2.age)
    println(person2.name)
}
class Automobile(val name: String, val tyres: Int, val maxSeating: Int){
    fun drive(){}
    fun applyBrakes(){}
}
 class Empty{}
class PersonInfo(nameParam:String, ageParam:Int){
    val name:String = nameParam
    var age:Int = ageParam
    var canVote: Boolean = ageParam > 18
}