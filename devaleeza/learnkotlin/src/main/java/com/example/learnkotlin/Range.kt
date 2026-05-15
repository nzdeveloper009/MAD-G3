package com.example.learnkotlin

//fun main() {
  //  val number = 10
   // val result = number in 1 until 5 //1,2,3,4,5
  //  print(result)
//}
//fun main() {
//    val animal = "Dog"
//    if(animal == "Horse"){
//        println("Animal is Horse")
//    }
//    else if( animal == "Cat"){
//        println("Animal is Cat")
//    }
//    else if(animal == "Dog"){
//        println("Animal is Dog")
//    }
//    else{
//        println("Animal Not Found")
//    }
//}
// when(animal){
//     "Horse" -> println("Animal is Horse")
//     "Cat" -> println("Animal is Cat")
//     "Dog" -> println("Animal is Dog")
//    else -> println("Animal Not Found")
// }

//fun main() {
//    val animal ="Dog"
//    val result = when(animal){
//        "Horse" -> println("Animal is Horse")
//        "Cat" -> println("Animal is Cat")
//        "Dog" -> println("Animal is Dog")
//        else -> println("Animal Not Found")
//    }
//    println(result)
//}

fun main() {
    val number = 13
    val result = when(number){
        11 -> "Eleven"
        12 -> "Twelve"
        13 -> "Thirteen" // in 13..19 -> "Teen" (Output is Teen)
        else -> "Not in Range"
    }
    println(result)
}