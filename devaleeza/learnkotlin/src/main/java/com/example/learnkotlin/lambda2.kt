package com.example.learnkotlin

fun main() {
    var fn: (a: Int, b: Int) -> Int = ::sum
    val lambda1: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    val multiLineLambda = {
        println("Hello Lambda")
        val a: Int = 2 + 3
        "Hello CheezyCode"
        2
    }

    multiLineLambda()
}

fun sum(a: Int, b: Int): Int = a + b

fun calculator(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}