package com.example.mymodule
//// lecture #11

fun main() {
val sum=add(4,5)
    println(sum)
    val sum2=add(98,7)
    println(sum2)
    check(7)
    check(6)
   val sub= sub(9,16)
    println(sub)
    printmessage(5)
    printmessage()
   println( addition(6,7))
    println(addition(6.0,9.0))
    // function store in variable
    //used where functionality as parameter
    var fn= ::add
    println(fn(4,6))

    var functio= ::sub
    println(functio(6,8))
    // with return type
    var function:(a:Double ,b:Double)->Double=::addition
    println(function(6.7,7.0))
//named argument
    println(sub(num2=5,num1=9))
}

fun add(num1:Int,num2:Int):Int{
    val res=num1+num2
    return res
}
fun check(num1:Int){
   val res= if(num1%2==0)"even" else "odd"
    println(res)
}
// if no return anything then by default function return type is return
//inline function
fun sub(num1:Int,num2:Int) =num1-num2

fun printmessage(count :Int=2){
    for(i in 1..count){
        println("hello $i")
    }

}


///lecture #12
//function overloading.same name different parameters or type of parammeters

fun addition(a:Int,b:Int):Int{
    return a+b

}
fun addition(a:Double,b:Double):Double{
    return a+b

}

// named argument
