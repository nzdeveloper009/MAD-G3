package com.example.learnkotlin

fun main() {
    println(addition( a = 1, b =  2))
    println(addition( a = 1.0, b = 2.0))
}
fun addition(a: Int, b: Int) : Int
{
    return a + b
}
fun addition(a:Double, b:Double) :Double
{
    return a + b
}