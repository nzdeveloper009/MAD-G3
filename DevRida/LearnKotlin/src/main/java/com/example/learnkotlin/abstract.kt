package com.example.learnkotlin



//lecture 23
//abstract class and method

//fun main(){
//val shape =shape()
//    println(shape.area())
//    shape.display()

//val circle= circle(4.0)
//    println(circle.area())
//    circle.display()
//}
//abstract method cant exist in non abstract class  so make shape class abstract too
// we cant make instace of abstract class to so shape() instance cant be created

//abstract class shape{
//    var name :String =""
//    abstract fun area():Double
//    abstract fun display()
//}
//
//class circle(val radius:Double):shape(){
//    override fun area():Double =Math.PI*radius* radius
//    override fun display(){
//        println("shape is gonna be displayed")
//    }
//
//}


//lecture 24,25 type cheecking
//type checking means chckung tyoe of object on runtime
//abstract class work on type and interface works on behaviours
//fun main(){
////dragobjects(arrayOf(circle(4.0),square(4.0),triangle(4.0,3.0),player("michal")))
//    val circle = circle(4.0)
//    val player = player("michal")
//var arr = arrayOf(circle,player)
//    for(obj in arr){
//        if (obj is circle){
//            println(obj.area())
//        }else{
//            (obj as player).saymyname()
//        }
//    }
    //if (circle is circle ) {
    //    println("this is circle")
    //}
//}

//
//fun dragobjects(objects:Array<draggable> ){
//    for (obj in objects){
//        obj.drag()
//    }
//}
//
//
//interface draggable{
////    val dragspeed:Int
//    fun drag()
//}
//abstract class shape :draggable {
//    abstract fun area(): Double

//}



//class circle(val radius:Double):shape() {
//    override fun area(): Double = Math.PI * radius * radius
//    override fun drag() = println("circle is draging ")
//}
//
//
//
//    class square(val side:Double):shape(){
//        override fun area():Double =side*side
//        override fun drag() = println("square is draging ")
//
//        }
//        class triangle(val base:Double,var height: Double):shape() {
//            override fun area(): Double = 0.5 * base * height
//            override  fun drag() = println("triangle is draging")
//        }
//class player(val name:String) :draggable {
//  override  fun drag()= println("$name is draging")
//    fun saymyname( )= println("hi my name is $name")
//}