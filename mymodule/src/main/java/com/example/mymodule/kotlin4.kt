package com.example.mymodule
fun main(){
    val smartphone1=smartphone()
    smartphone1.makecall()
    smartphone1.poweroff()
    smartphone1.playmovie()
    var phon1=phone("GENERAL")
    phon1.dispaly()
    var tab1=tab("abc")
    tab1.dispaly()
    println(phon1.type)
    println(smartphone1.type)
    println(tab1.type)
    println(smartphone1.toString())


}
///lecture 18
open class phone(val type:String){
    val name=""
    val size=""
    val vloume:Int=10
    fun makecall(){
        println("call me")
    }
    open fun dispaly(){
        println("display structure")
    }
    fun poweroff(){
        println("power off mobile")
    }
    fun getdeviceinfo(){
        println("get devive mobile information")
    }

}
class smartphone:phone("SMARTPHONE")
{
    fun playmovie(){
        println("plzz play movie")
    }

    fun takepic(){
        println("take a beautiful pic")
    }
}

//lecture 19 over riding methods also properties
//class tab():phone("TAB")
class tab(typeparam:String):phone(typeparam)
{
    override fun dispaly(){
        super.dispaly()
        println("mobile type is tab")
    }
}
//also override tostring tha contain from any class

