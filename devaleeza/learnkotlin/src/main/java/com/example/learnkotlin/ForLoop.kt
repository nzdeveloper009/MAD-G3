package com.example.learnkotlin

//fun main() {
//    for (i in 1..5 step 2){
//        println(i)
//    }
//    println("Until")
//    for(i in 1 until 5) {
//        println(i)
//    }
//}
//fun main() {
//    for(i in 10 downTo 1 step 2){
//        println(i)
//    }
//}

fun main() {
    val number = 2
    for(i in 1..10)
    {
        // 2 * 1 = 2
        // 2* 2 = 4
        //println(number.toString() + "x" + i + " = " + (number * i))
        println("$number x $i = ${number * i}")
    }
}