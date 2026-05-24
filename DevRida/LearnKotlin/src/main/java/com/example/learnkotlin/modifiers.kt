package com.example.learnkotlin

//fun main(){
//val obj = an()
//    val obj1 = B()
//    obj.p
//    obj.r
//    obj1.test()
//}

//class public in same module just
//protected not work with top level declaration works within a class
//private make the class private  and accessable to this file only
// internal class A
//private class A
//
//var b=20
//
//fun gn (){
//
//}

//open class an{
//    public var p = 10
//    //private var q = 20
//    internal var r = 15
//    protected var s = 12
//}

//class B  :an(){
//    fun test (){
//        println(p)
//        //println(q)
//        println(r)
//        println(s)
//    }
//}







//leture no 27 obj declaration

//fun main(){
// println(A.a)
//    B.test()
//}

//object A{
//    var a : Int = 10
//}
// object B {
//     var b :Int = 20
//    fun  test(){
//        println("im an objetc ")
//    }
// }

//fun main(){
//    SharingWidgets.incrementtwiterlikes()
//    SharingWidgets.incrementtwiterlikes()
//    SharingWidgets.incrementtwiterlikes()
//    SharingWidgets.incrementfblikes()
//    SharingWidgets.display()
//
//}

//object SharingWidgets{
//    private var twiterlikes : Int = 0
//   private var fblikes : Int = 0
//
//
//    fun incrementtwiterlikes() = twiterlikes++
//    fun incrementfblikes ()= fblikes ++
//    fun display ()= println("fblikes -$fblikes -- twiterlikes -$twiterlikes")
//
//}


//companion objects  lec no 28


//fun main(){
//
////myclass.myobject.f()
//    myclass.anotherobj.g()
//    myclass.f()
//}

//only one companion obj is allowed in a class
//class myclass {
//    companion object myobject {
//        fun f (){
//            println("im a fun from object ")
//        }
//    }
//
//    object anotherobj{
//        fun g(){
//            println("im a fun g from another object ")
//        }
//    }
//}