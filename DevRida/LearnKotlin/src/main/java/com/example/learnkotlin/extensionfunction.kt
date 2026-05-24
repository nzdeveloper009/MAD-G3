package com.example.learnkotlin

//extension function
//inline function


//fun main(){
//println("hello world".formattedString())
//
//}
//
//fun String.formattedString(): String{
//    return "-----------\n$this-------------"
//}

//inline function

//fun main(){
// calculatetimeandrun {
//     loop(100000)
// }
//}

//inline fun calculatetimeandrun(fn : ()->Unit){
//    var start :Long = System.currentTimeMillis()
//   fn()
//    var end :Long = System.currentTimeMillis()
//    println("time taken ${end-start} ms")
//}
//
//
//fun loop(n : Long){
//    for ( i in 1..n){
//
//    }
//}


//lecture no 38
//let ,apply ,with run
//fun main(){
// val emp = Employee("rida",20)
//
//
//     emp.apply {
//        name = "john"
//        age = 30
//
//    }
//    println(emp.age)
//    println(emp.name)
//
//    var x =emp.let{
//        println(it.name)
//        println(it.age)
//
//    }
//var emp :Employee = Employee( age  = 20 ,name ="rida")


//    emp?.let {
//        it.age = 20
//        it.name = "john"
//    }

//    with(emp){
//        age = 30
//        name = "xyz"
//
//    }
//
//
//    emp.run {
//        age= 35
//        name = "pqr"
//    }
//}
//
//data class Employee(var name: String, var age :Int)