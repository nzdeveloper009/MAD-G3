package com.example.learnkotlin

//fun main() {
//    println(A.num)
//    B.test()
//}
//object A{
//    val num: Int = 10
//}
//object B{
//    val p: Int = 20
//    fun test(){
//        println("I am Object B")
//    }
//}
fun main() {
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementFBLikes()
    SharingWidget.display()
}
object  SharingWidget{
    var twitterLikes = 0
    var fbLikes = 0
    fun incrementTwitterLikes() = twitterLikes++
    fun incrementFBLikes() = fbLikes++
    fun display() = println("Facebook - $fbLikes -- Twitter - $twitterLikes")
}
//fun main() {
//    var testObj = object {
//        val x : Int = 10
//        fun method(){
//            println("I am object expression")
//        }
//    }
//    println(testObj.method())
// }