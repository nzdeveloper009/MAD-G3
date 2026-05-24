package com.example.learnkotlin

//lecture no 15
//classes and object
fun main (){
    val mustang=car("mustang",type="car",model= 2016)
    var dugati = car(name ="dugati",type ="car",model=2020)

    println(mustang.name)
    println(mustang.type)
    mustang.drivecar()
}

class car( var name: String, val type:String, val model:Int){
fun drivecar(){
    println("$name car id sriving")
}
fun applybreaks(){
    println("breaks are applied")
}
}




//lecture no 16
//classes and object

//fun main(){
//    var p1 =person(name = "a", grade = 28)
//    var p2 =person(name = "b" , grade = 45)
//    println(p1.name)
//    println(p1.grade)
//    println(p1.pass())
//    println(p2.pass())
//}
//
//class person(val name:String,val grade:Int){
//    fun pass(): Boolean{
//        return grade>30
//    }
//}
