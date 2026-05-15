package com.example.learnkotlin

fun main() {
    val myCircle = Circle(4.0)
    val myPlayer = PlayerTest(name = "ALEEZA")

    if (myCircle is Circle){
        println("This is circle")
    }
    myCircle.drag()
    myPlayer.drag()
}
interface DraggableTest{
    fun drag()
}
abstract class ShapeTest : DraggableTest{
    abstract fun area() :Double
}
class CircleTest(val radius:Double) : ShapeTest(){
    override fun area(): Double = Math.PI * radius * radius
    override fun drag() = println("Circle is dragging")
}
class PlayerTest(val name: String) : ShapeTest(){
    override fun area() : Double = 0.0
    override fun drag() = println("$name is dragging")
    fun sayMyName() = println("Hey my name is - $name")
}