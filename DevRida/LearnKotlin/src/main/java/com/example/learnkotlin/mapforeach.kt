package com.example.learnkotlin
//
//fun main(){
//var nums :List<Int> = listOf(1,2,3,4)
//   println(isodd(3))
//    println(isodd(2))


//
//   val list :List<Int> = nums.filter(fun (a:Int):Boolean{
//       return a% 2 != 0
//   })
//    println(list)
//}

//fun isodd (a:Int):Boolean{
//    return a% 2 != 0
//}


fun main(){
    var nums: List<Int> = listOf(1,2,3,4,5)

//val userlist :List<user> = listOf(
//    user(id = 1, name = "A"),
//    user(id = 2, name = "B"),
//    user(id = 3, name = "C")
//)

    for (i in nums){
        println(i)
    }
    nums.forEach { println(it) }

//    var list: List<Int> = nums.map{it*it}
//    println(list)
//
//    val paiduserlist :List<paiduser> = userlist.map {
//        paiduser(it.id,it.name,"paid")
//    }
//
//    println(paiduserlist)
}

data class  user (var id :Int,var name :String)
data class paiduser (var id :Int,var name :String ,var type :String)