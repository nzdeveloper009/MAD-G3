package com.example.mymodule
/*class SQLDatabase {

    fun saveUser(user: String) {
        println("User $user saved in SQL Database")
    }
}

class UserController {

    private val database = SQLDatabase()

    fun saveUser(user: String) {
        database.saveUser(user)
    }
}

fun main() {
    val userController = UserController()
    userController.saveUser("Ali")
}*/
// Interface
interface Database {
    fun saveUser(user: String)
}

// SQL Database
class SQLDatabase : Database {

    override fun saveUser(user: String) {
        println("User $user saved in SQL Database")
    }
}

// Mongo Database
class MongoDatabase : Database {

    override fun saveUser(user: String) {
        println("User $user saved in Mongo Database")
    }
}

// User Controller
class UserController(private val database: Database) {

    fun saveUser(user: String) {
        database.saveUser(user)
    }
}

// Main Function
fun main() {

    val sql = SQLDatabase()
    val user1 = UserController(sql)
    user1.saveUser("Ali")

    val mongo = MongoDatabase()
    val user2 = UserController(mongo)
    user2.saveUser("Ahmed")
}