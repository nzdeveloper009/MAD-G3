package com.example.mymodule


/*violate srp principle
class FileManager {

    fun createFile(fileName: String) {
        println("File Created: $fileName")
    }

    fun readFile(fileName: String) {
        println("Reading File: $fileName")
    }

    fun deleteFile(fileName: String) {
        println("File Deleted: $fileName")
    }

    fun backupFile(fileName: String) {
        println("Backup Created for: $fileName")
    }
}any thing that can be changed in future we create seperate class*/
class FileManager {

    fun createFile(fileName: String) {
        println("File Created: $fileName")
    }

    fun deleteFile(fileName: String) {
        println("File Deleted: $fileName")
    }
}

class FileReader {

    fun readFile(fileName: String) {
        println("Reading File: $fileName")
    }
}

class BackupManager {

    fun backupFile(fileName: String) {
        println("Backup Created: $fileName")
    }
}

fun main() {

    val fileManager = FileManager()
    val fileReader = FileReader()
    val backupManager = BackupManager()

    fileManager.createFile("Notes.txt")
    fileReader.readFile("Notes.txt")
    backupManager.backupFile("Notes.txt")
    fileManager.deleteFile("Notes.txt")
}