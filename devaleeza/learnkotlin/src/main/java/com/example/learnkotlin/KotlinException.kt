package com.example.learnkotlin

fun main() {
    val arr :Array<Int> = arrayOf(1,2,3)
    try {
        println(arr[5])
    }
    catch (ex: NullPointerException) {

    }
    catch (e: Exception){
        println("Please check the array index")
    }
    finally {
        println("I will execute no matter what")
    }
    //println(arr[5])
    //println("This will not run")
//}
try{}
catch( e: Exception){}

    try{}
    finally {
    }
}