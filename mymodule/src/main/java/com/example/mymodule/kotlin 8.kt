package com.example.mymodule

//lecture25
//visibility modifiers
fun main(){
   val a=A()
    val b=B()
    b.get()

}
//public access anywhere like in another file also
// internal access only in file or in same module
//private only access in same file not other
//protected not declare top level function work in classes
 open class A{
   public var a=7
   private var b=9
   internal var c=2
   protected var d=7
    fun get(){
        println(a+b+c)
    }
}
// protected only avilable in sub classes

class B:A(){
    fun test(){
        println(a)
        println(c)
    }

}