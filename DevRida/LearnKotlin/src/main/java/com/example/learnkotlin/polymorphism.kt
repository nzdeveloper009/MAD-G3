//package com.example.learnkotlin
//
//fun main(){
//
////var circle :circle=circle(4.0)
////    var square:square=square(3.0)
////
////    println(circle.area())
////    println(square.area())
//
//    var shape = shape()
//    printarea(shape)
//    //child's obj
//    val square =square(4.0)
//    printarea(square)
//
//    val circle =circle(4.0)
//    printarea(circle)
//
//}
//
// open class shape {
//     open fun area(): Double {
//         return 0.0
//     }
// }
//
//class circle(var radius:Double):shape(){
//   override fun area():Double {
//       return Math.PI * radius * radius
//   }
//}
//
//class square( var side:Double ):shape(){
//    override fun area(): Double{
//        return side*side
//    }
//}
//
//
////polymorphism in inheritence
//fun printarea(shape:shape){
//    println(shape.area())
//}