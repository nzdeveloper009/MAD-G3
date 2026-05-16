package com.example.learnkotlin

fun main() {
    println("Hello CheezyCode".formattedString())
}

fun String.formattedString(): String {
    return "--------------------------\n$this\n--------------------------"
}