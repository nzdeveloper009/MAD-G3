package com.example.mymodule

//lecture 29
//enum class ,sealed class
fun main()
{
    val day=Day.SUNDAY
    println(day)
    for(i:Day in Day.values()){
        println(i)
    }
    day.printday()
    // sealed class
    val tile=Red("mushroom",8)
    val tile2=Red("fire",9)
    println("${tile.type}-----${tile.points}")
    val tile3:Tile=Red("mush",9)
    val points:Int = when(tile3) {
        is Red -> tile3.points * 2
        is Blue -> tile3.points * 3
    }
    println(points)

}
enum class Day(val num:Int){//enum set constant values,values restrict
    MONDAY(1),
    TUESDAY(2),
    THURSDAY(3),
    WEDNESDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
    fun printday(){
        println("Day is $this")
    }

}
// sealed class
//want multiple objects ,types restrict
sealed class Tile
class Red(val type:String,val points:Int):Tile()
class Blue(val points:Int):Tile()


