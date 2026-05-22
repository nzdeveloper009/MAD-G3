package com.example.mymodule

//lecture30
// null safety with symbols use of ?
fun main()
{
    var gender:String="Male"//
    var gender2:String?=null
    var isadult:Boolean?=null
    if(gender2!=null) {
      println(gender2.uppercase())
    }
    // 2nd method
   println( gender2?.uppercase())
    //multiple sattement execute if object not null
    gender2?.let {//if null object then nothing print on screen
        println("lin1")
        println("lin2")
        println("lin3 $gender2")
        println("lin3 $it")

    }
    //>:elvis operator
    var selected:String?=gender2 ?: "Na"//agr phle null to right valii le lo
    println(selected)
   // var value:String=gender2!!.uppercase()
}