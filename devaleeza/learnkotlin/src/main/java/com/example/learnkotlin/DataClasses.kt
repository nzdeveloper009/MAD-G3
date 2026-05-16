package com.example.learnkotlin

fun main() {
    val p1 = MyPerson(id = 1, name = "John")
    val p2 = MyPerson(id = 1, name = "John")
//    println(p1) //toString
//    println(p2)
//    println(p1.hashCode())
//    println(p1 == p2) //p1.equals(p2)
    val p3 :MyPerson = p1.copy(id = 3)
    println(p3)
    val (id :Int , name :String ) = p1
    println(name)
    println(p1.component1())
}

 data class MyPerson(val id: Int, val name: String)
{

}