package com.example.learnkotlin

fun main() {
   val objChild = Child()
//    objChild.myMethod2()
//    objChild.myMethod2()
}
open class Parent {
    init{
        print("Parent's constructor is called")
    }
    val name: String = ""
    fun myMethod() {
        println("I am in Parent")
    }
}

class Child : Parent()
{
    init{
        print("Child's constructor is called")
    }
    val name2 : String = ""
    fun myMethod2(){
        println("I am in Child")
    }
}