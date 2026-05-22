package com.example.mymodule

import kotlin.math.pow

// lecture 33 and 34
//lambdas jis ka koii nam naii or lambda expression
// hiegher order function
fun main()
{
println(plus(2.0,7.0))
    println(expo(2.0,3.0))
    var fn:(a:Double,b:Double)->Double=::plus// fn store function,alsostore function only of this datatype
    println(fn(8.0,9.0))
    calculator(5.0,7.0,::plus)
    val lambdal :(Int,Int)->Int={x:Int,y:Int ->x+y}
    val multineLambda:()->String = {
        println("hello lambda")
        val a:Int=2+3
        "hello chezzy code"
    }
    multineLambda()
    val lambdal2 :(Int)->Int={x->x+x}
    val lambdal3 :(Int)->Int={it+it}
    calculator(1.0,2.0,{ a, b-> a+b})

}
fun plus(a:Double,b:Double):Double{
    return a+b
}
fun expo(c:Double,d:Double):Double{
    return c.pow(d)

}
// heigher order  function ya input la GA ya output de ga
fun calculator(a:Double,b:Double,gn:(Double,Double)->Double){
    val res:Double=gn(a,b)
    println(res)
}