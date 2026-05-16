package com.example.learnkotlin

fun main() {
    val nums : MutableList<Int> = mutableListOf(1,2,3)
    println(nums.indexOf(3))
    println(nums.contains(4))
    nums[1] = 2
    nums.add(5)
    nums.remove(element = 1)
    println(nums)

    val list2 :List<Int> = listOf(11,12)
    nums.addAll(list2)
    println(nums)
}

//fun main() {
//    val students: MutableMap<Int, String> = mutableMapOf<Int, String>()
//    students.put(1, "Ryan")
//    students.put(2, "John")
//    students.put(3, "Katie")
//
//    println(students.get(1))
//    println(students.get(11))
//
//    for ((key: Int, value: String) in students) {
//        println("$key = $value")
//
//    }
//    students[8] = "Jones"
//    println(students[8])
//
//    val map :Map<Int,String> = mapOf<Int, String>(1 to "Hello", 2 to "World")
//    println(map)
//}