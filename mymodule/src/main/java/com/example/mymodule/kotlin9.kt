// lecture 26 object declaration
//singleton ak class ka bss ak object
package com.example.mymodule
fun main(){
     println(All.ab)
    Ba.test()
    var share=Sharingwidgts()
    share.inctwitlikes()
    share.inctwitlikes()
    share.inctwitlikes()
    share.incinstalikes()
    share.display()
    //anonymous object
    var testobj=object{
        val x:Int=21
        fun method(){
            println("object experession")
        }
    }
    println(testobj.x)
    //interface use in object
    var inter=object:cloneble{// same also use in class
        override fun clone(){
            println("i am clone")
        }
    }
    inter.clone()
}
interface cloneble{
    fun clone()
}
object All{
    val ab=10
}
object Ba{
    val ca=90
    fun test(){
        println("I am object Ba")
    }
}
class Sharingwidgts{
    private var twitterlikes=0
    private var instalikes=0
    fun inctwitlikes()=twitterlikes++
    fun incinstalikes()=instalikes++
    fun display()=println("Twitter likes------$twitterlikes---Insta likes---$instalikes")
}