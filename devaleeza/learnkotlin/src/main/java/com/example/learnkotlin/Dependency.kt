package com.learning.learnkotlin

// 1. Interface
interface MySimpleDatabase {
    fun saveData(data: String)
}

// 2. Concrete Class
class MySqlDbImplementation : MySimpleDatabase {
    override fun saveData(data: String) {
        println("User - $data user saved in Sql Database")
    }
}

// 3. Controller Class
class MySimpleUserController(private val db: MySimpleDatabase) {
    fun executeSave(user: String) {
        db.saveData(user)
    }
}

// 4. Main Function
fun main() {
    val databaseObject: MySimpleDatabase = MySqlDbImplementation()
    val controllerObject = MySimpleUserController(databaseObject)
    controllerObject.executeSave("U1")
}