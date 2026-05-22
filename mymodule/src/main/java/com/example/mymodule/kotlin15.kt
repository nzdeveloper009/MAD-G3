package com.example.mymodule

// lecture 32
// list&map and variations
fun main() {
    //list muteable(can be changed) and immuteable(cant be cahnged)


        //list mutable(can be changed) and immutable(cant be changed)
        val numsss:MutableList<Int> = mutableListOf(8,9,6)
        println(numsss.indexOf(8))
    println(numsss.contains(4))
   println( numsss.lastIndex)
    numsss.add(86)
    numsss.remove(9)
    println(numsss)
    val list2=listOf(7,8)
    numsss.addAll(list2)
    println(numsss)
    val students =mutableMapOf<Int,String>()
    students.put(6,"hello")
    students.put(7,"john")
    students.put(8,"shiva")
    students.put(9,"bheem")
    println(students.get(1))
    println(students.get(8))
    for ((key,value) in students){
        println("$key= $value")
        // also get and set value as array

    }

    }
// maps mutable and immuteable
//
