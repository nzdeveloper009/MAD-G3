package com.example.learnkotlin

fun main() {
    // Example 1: simple while loop
    var count = 1
    while (count <= 5) {
        println("hello")
        count++
    }

    // Example 2: multiplication table using while
    var num = 2
    var index = 1
    while (index <= 10) {
        println("$num * $index = ${num * index}")
        index++
    }

    // Example 3: same multiplication table using do-while
    var num2 = 2
    var index2 = 1
    do {
        println("$num2 * $index2 = ${num2 * index2}")
        index2++
    } while (index2 <= 10)
}