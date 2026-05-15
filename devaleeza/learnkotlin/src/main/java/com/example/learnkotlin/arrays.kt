package com.example.learnkotlin

fun main() {
    var arr :Array<String> = arrayOf("One" , "Two" ,"Three")
    var arr1 :Array<Int> = arrayOf(1,2,3)
    var arr2 :Array<Int> = arrayOf<Int>(3,4,5)

    for((i : Int,e : String) in arr.withIndex()){
        println("$i - $e")
    }

    println(arr[0])
    println(arr.get(1))
    arr.set(0, "Hello")
    println(arr[0])
    println(arr.size)

}