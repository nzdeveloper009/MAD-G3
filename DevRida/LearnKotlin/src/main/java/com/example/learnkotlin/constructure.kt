package com.example.learnkotlin

//fun main(){
//    var person=person()
//    println(person.name)
//    println(person.age)
//

    //primary constructor
//
//    var person2=person(name="rida",age=20)
//println(person2.name)
//    println(person2.age)
//}
//
////class person(){
////    var name : String="rida"
////    var age :Int = 20
////}
//
//
//
//class person(var name :String,var age:Int){
//}



//    fun main(){
//  var ob= calculator()
//        println(ob.add(2,3))
//        println(ob.mul(2,3))
//    }
//
//
//class calculator{
//    laterinit  message :String
//    fun add( x:Int, y :Int):Int{
//        return x+y
//    }
//
//    fun mul( x:Int, y:Int):Int{
//        return x*y
//    }
//}

fun main(){
    var p1 = person(nameparem ="rida", ageperam = 20)
    println(p1.age)
    p1.age= 21
    p1.age=-22
    println(p1.name)


}

class person(nameparem :String,ageperam :Int){
    var name:String = nameparem
        get() {
            return field
        }
    var age :Int = ageperam
        set(value){
            if(value>0){
                field= value
            }else{
                println("age cant be -ve")
            }
        }
//default syntex getter /setter
    var email:String =""
        get() = field
        set(value) {
            field=value
        }

}