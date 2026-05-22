package com.example.mymodule

// lecture 13
//arrays
fun main()
{
    var arr:Array<String> =arrayOf("one","two","three")
    var arr1:Array<Int>   =arrayOf(1,2,3)
    for(i:String in arr){
        println(i)
    }
    //print with index
    for((i:Int,e:String) in arr.withIndex()){
        println("$i-$e")
    }
    println(arr[2])
    println(arr.get(1))
    arr.set(0,"hello")
    println(arr[0])
    println(arr.size)
    val car1=   car("toyota","petrol",100)
    println(car1.n)
    println(car1.type)
    car1.drivecar()
    var j:Int=40
    println(j.plus(7))
    println(j.toFloat())
    val person1=person("ali",16,9)
    person1.canvote()
    var student2=student("a",3,1)
   println(student2.name)
    println(student2.age)
    println(student2.canvote)
    println(person1.id)
    var student3=student("hello",2,8)
 println(student3.name)

    var a1=animal("cat","pet")
    println(a1.namepara)
    println(a1.color)

}
///lecture 14 classess and objects
class car(val n:String,val type:String,val speed:Int)//prperties or primary constructor
{
    fun drivecar()//methods
    {
      println("$n car is driving")
    }
    fun applybrakes()
    {
        println("applied brakes")
    }

}

//lecture15

class person(val n:String,val age:Int,idpara:Int){
    var id= idpara
    fun canvote():Boolean
    {
       return age>18
    }

}


//lecture #16
class empty()
/*class student()//constructor
{
    val name:String=" "
    val age:Int=0


}*/


class student(nameparam:String,ageparam:Int,rollpara:Int)
//constructor
{
    init{//any object created this display automatically
        println("$nameparam is created an object")
    }
    init{
        println("2nd object is created")
    }

   val name:String=nameparam
    val age:Int=ageparam
    var canvote:Boolean=ageparam>20


}
class animal(val namepara:String ,val Typepara:String,val color:String){
    constructor(name:String,type:String):this(name,type,"black")
}