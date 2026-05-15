package com.example.learnkotlin

fun main(){
    val circle : Shape = Circle(radius = 4.0)
    val square : Shape = Square(side = 4.0)
val shapes :Array<Shape> =arrayOf(Circle(radius = 3.0), Square( side = 4.0),
    Triangle(3.0, height= 4.0))
    calculateAreas(shapes)
    //println(circle.area())
   // println(square.area())
}
fun calculateAreas(shapes: Array<Shape>){
    for(shape :Shape in shapes){
        println(shape.area())
    }
}
open class Shape{
    open fun area() :Double{
        return 0.0
    }

    open fun drag() {}
}
class Circle(val radius:Double) : Shape(){
    override fun area(): Double {
    return Math.PI * radius * radius
        }
}
class Square(val side:Double) : Shape(){
    override fun area(): Double {
        return Math.PI * side * side
    }
}
class Triangle(val base:Double, val height:Double) : Shape(){
    override fun area(): Double {
        return 0.5 * base * height
    }
}