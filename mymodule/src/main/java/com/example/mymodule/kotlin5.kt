package com.example.mymodule
// lecture 20  and 21
fun main(){
  val circle:Circle=Circle(4.0)
    val square:Square=Square(8.00)
  //  val circle:Shape=Circle(4.0)//polymorphism
    //val square:Shape=Square(8.00)//polymorphism
    println(circle.area())
    println(square.area())
    val shapes:Array<Shape> =arrayOf(Circle(8.0),Circle(9.0),Square(5.0))
    calculateareas(shapes)
    val shape=Shape()
    printarea(shape)
    printarea(square)
    println(square.toString())
// there is any super class in kotlin tostring its type
}
fun printarea(shape:Shape){
    println(shape.area())

}
fun calculateareas(shapes:Array<Shape>){//this is polymorphism function
    for(shape:Shape in shapes){
        println(shape.area())
    }
}

open class Shape{
    open fun area():Double{
        return 0.0
    }
}
class Circle(val radius:Double):Shape(){
    override fun area(): Double {
        return Math.PI*radius
    }
}
class Square(val side:Double):Shape(){
    override fun area(): Double {
        return side*side
    }
}