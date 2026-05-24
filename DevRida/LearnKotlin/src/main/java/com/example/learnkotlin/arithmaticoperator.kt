package com.example.learnkotlin

// lecture 6 arithimatic operator
//fun main (){
//    var  i =12
//    var j = 11
//    println(i+j)
//    println(i-j)
//    println(i*j)
//    println(i/j)
//    println(i%j)
//    println(i<j)
//    println(i>j)
//    println(i<=j)
//    println(i>=j)
//    println(i==j)
//    println(i!=j)
//}
//
//fun main (){
//    var i = 10
//    i=i+1
//    i--
//    --i
//    ++i
//    println(i)
//}
//
//
////leectur 07 logical operator
//
//fun main (){
//    var above70 =false
//    var knowsprogramming =false
//
//    var calledforinterview =above70 && knowsprogramming
//    println(calledforinterview)
//    var calledforinterview =above70  || knowsprogramming
//    println(calledforinterview)
//
//   var j =10
//    var i =12
//    var  result = i == 10 || j++ ==11
// println(result)
//
//}

//lecture 8 when statemnt

fun main () {
//    var num = 10
////    var result = num in 1..20
//    var result = num in 1 until 20
//    println(result)

    var animal = "dog"
    when (animal) {
        "horse" -> println("animal is horse")
        "cat" -> println("animal is cat")
        "dog" -> println("animal is dog")
        else -> println("animal not found")
    }
}