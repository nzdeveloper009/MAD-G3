package com.example.learnkotlin

//lists

//fun main() {
//    val num: MutableList<Int> = mutableListOf(1, 2, 3)
//    println(num.indexOf(3))
//    println(num.contains(2))
//    num [1] =2
//    num.add(5)
//    num.remove(1)
//    println(num)
//
//
//    val num2 : List<Int> = listOf(11,12)
//    num.addAll(num2)
//    println(num)
//}

//maps
//
//fun main(){
//    val student :MutableMap<Int, String>  = mutableMapOf<Int, String>()
//    student.put(1,"LIANA")
//    student.put(2,"SABRI")
//    student.put(3,"TASHA")


//    println(student.get(1))
//    println(student.get(2))
//
//    for((key:Int ,value:String) in student){
//        println("$key = $value")
//    }
//
//
//    student[4] = "MURAD"
//    println(student[4])
//
//
//    var Student :Map<Int,String> = mapOf<Int,String>(1 to "hello",2  to "world")
//    println(Student)
//
//}




//lecture no 34
//order functions
//import kotlin.math.pow
//
//fun main(){
//
//
//    println(sum(2.0,3.0))
//    println(power(2.0,3.0))
//    var fn :(a:Double,b:Double)->Double = ::power
//    println(fn(3.0,4.0))
//    calculator(3.0,4.0, ::sum)
//}

//fun sum(a:Double,b:Double):Double{
//    return a+b
//}
//
//fun power(a:Double,b:Double):Double{
//    return a.pow(b)
//}
////order fun
//fun calculator(a:Double,b:Double ,gn: (Double,Double)->Double){
//    val result :Double = gn(a,b)
//    println(result)
//}



//lecture 35
//lambda
//fun main(){
//   // val singleParam : (Int) -> Int = {x ->x+x}
//    //val simplifysingleParam :(Int) -> Int ={it+ it}
//
//    //calculator(2,3,{a,b -> a+ b})
//    calculator(2,3,){a,b -> a+ b}
//}
//
//
//
//fun sum(a:Int,b:Int):Int= a+b
//
//fun calculator(a:Int,b:Int ,op: (Int,Int)->Int):Int{
//return op(a,b)
//}
