package com.example.learnkotlin

//fun main (){
// val obj = intcontainer(3)
//    obj.gatvalue()
//    val icontainer = container<Int>(3)
//    icontainer.gatvalue()
//    val scontainer = container<String>("hello")
//    scontainer.gatvalue()
// val List = listOf<String>()
//}
//
//class container<T>(var data :T){
//    fun setvalue(value :T){
//        data = value
//    }
//    fun gatvalue():T{
//        return data
//    }
//}
//

//class intcontainer (var  data :Int){
//    fun setvalue(value :Int){
//        data = value
//    }
//    fun gatvalue():Int{
//        return data
//    }
//}
//
//class stringcontainer (var  data :String){
//    fun setvalue(value :String){
//        data = value
//    }
//    fun gatvalue():String{
//        return data
//    }
//}

//fun main(){
//add(1,2,3,4,5)
//    add( 1,1,2,3,3,4,5)
//
//}
//
//
//fun add (vararg values :Int){
//    var sum = 0
//    for( i in values){
//        sum += i
//    }
//    println(sum)
//}

//nested class

fun main(){
 var obj = outer()
    obj.i
//    val nested = outer.nested()
//    nested.test()
    val inner = outer().nested()
    inner.test()
}
class outer{
var i = 0
    inner class nested{
        fun test(){
            println("hello world $i")
        }
    }
}