package com.example.mymodule

// lecture 39
//nested classes
// inner classes
fun main()
{
   val objy=Outer()
   objy.i
   val inner=Outer().Inner()
    inner.test()
}
class Outer()
{
    var i=0
    inner class Inner() {
        //outer values ko inner mei access krna k liya  inner ka key word use kiya
        //phirr hm main mei phla nouter ka obj then inner
        fun test() {
            println("i am in inner class $i")
        }
    }
}