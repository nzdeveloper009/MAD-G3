package com.example.mymodule

//lecture37
//scoped functions
//apply,let,with,run
fun main(){
    val emp=Employee()
    emp.age=20
    emp.name="john"
    // apply fun dont need for any property write with emp
   var x= emp.apply{
        age=80
        name="bheem"
    }
    println(x)
    // let function for displaying without using obj of class
    var y=emp.let{
        println(it.name)
        println(it.age)

    }
    emp?.let { //it mostly used with nullable objects avoid repeating variable name
        it.age=67
        it.name="joh"
        println(it.age)

    }
    with(emp){
        println("-------")
        println(age)
        println(name)
    }
    val test=emp.run{
        age=45
        name="rgy"
        println("updated successfully!")
    }
    println("#################")
    println(test)
}
data class Employee(var name:String="",var age :Int=18 )