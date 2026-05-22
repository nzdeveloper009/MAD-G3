package com.example.mymodule
/// lecture 17
fun main(){
  var c1=calculater()
  println(c1.add(5,6))
  println(c1.multiply(9,7))
  //  println(c1.age)
    val p1=per("naima",19)
    p1.age=23
    println(p1.age)
    println(p1.name)
    p1.age=-12
}
class calculater{
  //  lateinit var age:String

fun add(a:Int,b:Int):Int{
    return a+b
}
    fun multiply(a:Int,b:Int):Int{
        return a*b
    }
}
class per(namepara:String,agepara:Int){
    var name=namepara
        get(){
            return field.uppercase()
        }
    var age=agepara
        set(value){

            if(value>0){
                field=value
            }
            else
                println("age does not negative")
        }
}