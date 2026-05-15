package com.example.learnkotlin

fun main(){
    val oneplus = OnePlus( typeParam = "SmartPhone")
    oneplus.display()
    val generalMobile = Mobile( type = "General")
    generalMobile.display()
}
open class Mobile(val type:String) {
    open val name : String = ""
    open val size : Int = 5
    fun makeCall() = println("Calling From Mobile")
    fun poweroff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display")
}

class OnePlus(typeParam:String) : Mobile(typeParam)
{
    override val name: String = "One Plus"
    override val size: Int = 6
   // override fun display() = println("One Plus Display")
   override fun display() {
       super.display()
           println("One Plus Display")

   }
}
