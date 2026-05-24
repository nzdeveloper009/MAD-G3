package com.example.learnkotlin

//fun main(){
//val p1 = Person(name = "Tasha", id = 1 )
//    val p2 = Person(name = "Sabrina", id = 1 )
//val (name :String,id :Int )= p1
//    println(id)
//    println(name)
//    println(p1.component1())
//println(p1.component2())
//
//    val p3 = p1.copy()
//    println(p1)
//    println(p2)
//    println(p1.hashCode())
//    println(p1==p2)
//    println(p3)


//}
// data class Person(var name :String ,var id :Int ){
//
//}




//lecture no 20 enum classes

//fun main(){
// val day = Day.Monday
//    println(day)
//    println(day.number)
//
//
//    for (i in Day.values() ){
//        println(i)
//    }
//
//    day.formattedday()
//}


//enum class Day(val number: Int){
//    Monday(1),
//    Tuesday(2),
//    Wednesday(3),
//    Thrusday(4),
//    Friday(5),
//    Saturday(6),
//    Sunday(7);
////this points the current object
//    fun formattedday(){
//        println("Day is $this")
//    }
//
//}

// sealed class

//fun main(){
//    val tile= red("Mushroom ",25)
//    val tile2 = red("fire", 30)
//    val points = when(tile){
//        is red-> tile.points*2
//        is blue->tile.points*5
//    }
//    println(points)
//    println("${tile.points} -${tile.type}")
//}
//sealed class tile
//    class red( var type :String ,var points :Int): tile()
//    class blue (var points :Int ): tile()
//


