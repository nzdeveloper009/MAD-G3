package com.example.learnkotlin

//fun main() {
//
//    val nums: List<Int> = listOf(1, 2, 3, 4, 5)
//
//    val list: List<Int> = nums.filter(fun(a: Int): Boolean {
//        return a % 2 != 0
//    })
//
//    println(list)
//
//}

fun main() {

    val nums: List<Int> = listOf(1, 2, 3, 4, 5)

    val userList: List<User> = listOf(
        User(id = 1, name = "A"),
        User(id = 2, name = "B"),
        User(id = 3, name = "C")
    )

    val list: List<Int> = nums.map { it * it }

    val paidUserList: List<PaidUser> = userList.map {
        PaidUser(it.id, it.name, type = "Paid")
    }

    println(paidUserList)

}

data class User(val id: Int, val name: String)
data class PaidUser(val id: Int, val name: String, val type: String)