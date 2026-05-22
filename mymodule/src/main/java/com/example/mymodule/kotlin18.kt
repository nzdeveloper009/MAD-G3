package com.example.mymodule

// lecture 36
// extension function
//inline function
fun main(){
    println("hello naima!".formattedString())
    calculatetime{
        loop(1000000000)
    }
}
// syntax of extension fun
fun String.formattedString():String
{
    return "--------------\n$this\n--------------"
}
fun loop(n:Long){
    for(i:Long in 1..n){
        //
    }

}
inline fun calculatetime(fn:()->Unit){
    val start:Long=System.currentTimeMillis()
    fn()
    val end:Long=System.currentTimeMillis()
    println("Time taken ${end-start} ms")

}
// call anytime wothout creating seperate function use of inline