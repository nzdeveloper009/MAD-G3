package com.example.learnkotlin

fun main() {
 val day = Day.SUNDAY
//    println(day)
//    println(day.number)
//    for( i :Day in Day.values()) {
//        println(i)
//    }
    day.printFormattedDay()
}
enum class Day(val number: Int){
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    fun printFormattedDay() {
        println("Day is $this")
    }
}

// EnumSealed.kt

//fun main() {
//    val title = Red( type =  "Mushroom", points =  25)
//    val title2 = Red( type = "Fire", points = 30)
//    println("${title.points} - ${title.type}")
//}
//
//sealed class Title
//class Red(val type: String, val points: Int) : Title()
// class Blue(val points: Int): Title()