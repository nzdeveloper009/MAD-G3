package com.learning.learnkotlin

// 1. ABSTRACTION LAYER (INTERFACE)

interface DipDatabase {
    fun saveUser(user: String)
}

// 2. LOW-LEVEL MODULE (DETAILED IMPLEMENTATION)
class DipSQLDatabase : DipDatabase {
    override fun saveUser(user: String) {
        println("User - $user user saved in Sql Database")
    }
}

// 3. HIGH-LEVEL MODULE (CONTROLLER)

class DipUserController(private val database: DipDatabase) {

    fun saveUser(user: String) {
        database.saveUser(user)
    }
}

// 4. MAIN BROWSER CLASS (RUNNABLE ENTRY POINT)

fun main() {
    println("=== Dependency Inversion Principle ===")

    // Low level module ka object banaya
    val database: DipDatabase = DipSQLDatabase()

    // Constructor Injection ke zariye high level module ko diya
    val userController = DipUserController(database)

    // User save karne ka method call kiya
    userController.saveUser("U1")
}