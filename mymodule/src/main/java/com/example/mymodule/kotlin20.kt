package com.example.mymodule

// lecture38
// Generics

fun main() {
var obje= IntContainer(6)
obje.getValue()
    var contain= Container<Int>(5)
    contain.getValue()
    var contain1=Container<String>("hello")
    contain1.getValue()
    addy(1,3,4,5)

}
class Container<T>(var data:T){ //generics
    fun setValue(value: T) {
        data = value
    }

    fun getValue(): T {
        return data
    }

}

class IntContainer(var data: Int){
    fun setValue(value: Int) {
        data = value
    }

    fun getValue(): Int {
        return data
    }
}

class StringContainer(var data: String){
    fun setValue(value: String) {
        data = value
    }

    fun getValue(): String {
        return data
    }
}
//varag use for multiples paarmeter
fun addy(vararg values:Int){
    var sum=0
    for(i:Int in values){
        sum+=i
    }
    println(sum)
}