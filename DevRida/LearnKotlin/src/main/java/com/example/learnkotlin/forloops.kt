package com.example.learnkotlin

fun  main(){
    var num =2
    var i =1
    for(i in 1..10){
        //println( num.toString() +"*"+i +"="+ num * i)
println("$num * $i = ${num*i}")
    }
}