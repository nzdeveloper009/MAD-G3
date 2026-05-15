package com.example.learnkotlin

fun main() {
    var i: Int = 20
    println(i.plus( other =  30))
    println(i.toFloat())

    val p1 = PersonData(name = "A" , age = 21)
    val p2 = PersonData(name = "B" , age = 17)

    println(p1.canVote())
    println(p2.canVote())

}

class PersonData(val name: String, var age: Int) {
    //methods
    fun canVote(): Boolean{
        return age>18
    }
}