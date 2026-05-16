package com.example.learnkotlin

fun main() {
    var gender: String = "Male"  //"Female" , "Others
    val gender2: String? = null
    var isAdult: Boolean? = true

    if (gender2 != null) {
        println(gender2.uppercase())
        }
    println(gender2?.uppercase())

    gender?.let {
        println("Line 1")
        println("Line 2 $gender2")
        println("Line 3 $it")
    }
    var selectedValue :String? = gender2 ?: "NA"

}
