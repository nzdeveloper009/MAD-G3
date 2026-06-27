package com.example.learnkotlin

class  Student (
    val name : String,
    val age : Int,
    val department : String
){
    fun display(){
        println("Name: $name")
        println("age: $age")
        println("department: $department")
    }
}

class studentbuilder {
     private var name : String = ""
    private var age: Int = 0
    private var department : String = ""

    fun setName (name :String):studentbuilder {
        this.name = name
        return this

    }

    fun setAge(age : Int):
    studentbuilder {
        this.age = age
        return this
    }

    fun setdepartment (department: String ):studentbuilder {
        this.department = department
        return this

    }

    fun build():Student {
        return Student(name,age,department)
    }
}


fun main(){

    val student = studentbuilder()
        .setName("Ali")
        .setAge(20)
        .setdepartment("Computer Science")
        .build()
    student.display()
}