package com.example.learnkotlin

fun main() {
    val obj = Outer()
    obj.i

    //val nested = Outer.Nested()
    //nested.test()

    val inner : Outer.Nested = Outer().Nested()
    inner.test()
}

class Outer {
    var i = 0

    inner class Nested {
        fun test() {
            println("I am in nested class $i")
        }
    }
}