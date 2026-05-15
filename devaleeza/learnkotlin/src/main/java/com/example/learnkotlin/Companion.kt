package com.example.learnkotlin

fun main() {
    MyClass.MyObject.f()
    MyClass.f()
    MyClass.AnotherObject.g()
}
class MyClass{
   companion object MyObject {
        fun f(){
            println("Hello I am F from Object")
        }
    }
     object AnotherObject {
        fun g(){
            println("Hello I am G from Object")
        }
    }


}