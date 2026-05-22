package com.example.mymodule
// lecture 22 abstract class
fun main()
{
 // val animal=Animal()
  //animal.typee()
  val cat=Cat("catee")
  cat.typee()
    cat.display()

}
/*open class Animal{
    var name:String=""
    open fun typee(){
        println("type of animal")
    }
    open fun display(){
        println("this is animal")
    }
}*/
abstract class Animal{
    var name:String=""
    abstract fun typee()
    abstract fun display()
}
class Cat(val type:String):Animal(){
    override fun typee(){
       println("this is $type")
    }
    override fun display(){
        println("this is cutie pie!")
    }


}