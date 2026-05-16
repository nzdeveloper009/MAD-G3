package com.example.learnkotlin

//import kotlin.math.pow
//
//fun main() {
//
//    println(sum(2.0, 3.0))
//    println(power(2.0, 3.0))
//    var fn: (a: Double, b: Double) -> Double = ::power
//}
//
//
//fun sum(a: Double, b: Double): Double {
//    return a + b
//}
//
//
//fun power(a: Double, b: Double): Double {
//    return a.pow(b)
//}

fun main() {

    var fn: (a: Double, b: Double) -> Double = ::sum

    println(fn(2.0, 4.0))

    calculator(5.0, 5.0, ::sum)
}

fun sum(a: Double, b: Double): Double {
    return a + b
}

fun calculator(a: Double, b: Double, gn: (Double, Double) -> Double) {
    val result: Double = gn(a, b)
    println(result)
}