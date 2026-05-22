package com.example.mymodule

// lecture 28 hash, equals
fun main(){
    val p1=Pers(7,"naima")
    val p2=Pers(7,"naima")
    println(p1)
    println(p2)
    println(p1.hashCode())
    println(p1==p2)//p1.equals(p2)
    val p3=p1.copy(Id=3)
    println(p3)

    //destructuring
    val (Id:Int,name:String)=p1
    println(Id)
    println(name)
    println(p1.component1())//data clss uses
    println(p2.component2())//data class uses

}
data class Pers(val Id:Int,val name:String){

}