package com.example.learnkotlin

//fun main(){
//    var gender:String= "Male"
//    var gender2:String? = null
//    val isadult :Boolean? = null
//if (gender2!= null) {
//    gender2.uppercase()
//}
//
//    println(gender2?.uppercase())
//
//    gender2?.let{
//        println("line1")
//        println("line2 $gender2")
//        println("line3 $it")
//    }
//
//    var selectedvalue : String = gender2 ?:"NA"
//    var value : String = gender2!!.uppercase()
//}


//lecture 32 exception handling

//fun main(){
//    var arr :Array<Int> = arrayOf(1,2,3)
//    try {
//        println(arr[5])
//    }
//    catch (ex: NullPointerException){
//
//    }
//    catch (e : Exception){
//        println("pls check the array index ")
//    }
//    finally {
//         println("i will excute")
//    }
//
//    println("this will not run")
//}


//exception
import java.lang.Exception
import java.lang.NullPointerException
import java.lang.IllegalArgumentException
fun main(){


createuserlist(count = 5)
    createuserlist(count = -2)

}

fun createuserlist(count: Int){
    if (count <0){
//exception raise

        throw kotlin.IllegalArgumentException("count must be greater then 0 ")
    }else{
        println("user list is containing $count  user")
    }
}







