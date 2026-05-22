package com.example.mymodule

// lecture 35
// collection function foreach(),map(),filter(),use of lambdas
fun main()
{
    val num =listOf(1,6,8,9)
    println(isodd(4))
    println(isodd(2))
    println(isodd(9))
    val list = num.filter(::isodd)//filter
   // val list=num.filter(fun(a:Int):Boolean{   also pass lambda in place of fun
     //   return a%2!=0
    //})
    // val list =num.filter{it%2!=0}
    println(list)

    val userlist=listOf(
        User(1,"naima"),
        User(8,"hanii"),
        User(4,"maria")

    )
println(userlist.filter{ it.id==8})


    // map function covert data from one form to another
    val list8 =num.map{ it*it}
    println(list8)

    // covert userlist to paid user list
    val paiduserlist=userlist.map{
        Paiduser(it.id,it.name, "paid")

    }
    println(paiduserlist)

    // for each
    num.forEach{println(it)}// execute every element library function
}
fun isodd(a:Int):Boolean{
    return a%2!=0
}
data class User(val id:Int,val name:String){

}
data class Paiduser(val id:Int,val name:String,val type:String){

}