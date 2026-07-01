package com.learning.learnkotlin

class Logger {
    fun logAction(action: String) {
        println("Log: $action")
    }
}

// 2. Notification Service:
class NotificationService {
    fun sendNotification(message: String) {
        println("Notification: $message")
    }
}

// 3. Thumbnail Service:
class ThumbnailService(private val logger: Logger, private val notification: NotificationService) {
    fun generateThumbnail(fileName: String) {
        // Thumbnail generation logic
        val timeTaken = (1..5).random() // Dummy logic
        logger.logAction("Thumbnail generated for $fileName in $timeTaken seconds")
        notification.sendNotification("Thumbnail is ready for $fileName")
    }
}

// 4. Conversion Service:
class ConversionService(private val logger: Logger, private val notification: NotificationService) {
    fun convertToPdf(fileName: String) {
        // PDF conversion logic
        val timeTaken = (5..10).random() // Dummy logic
        logger.logAction("$fileName converted to PDF in $timeTaken seconds")
        notification.sendNotification("$fileName successfully converted to PDF")
    }
}

// 5. FileManager Class:
class FileManager(private val logger: Logger, private val notification: NotificationService) {

    fun openFile(fileName: String) {
        // File open logic
        println("Opening file: $fileName")
        logger.logAction("File $fileName opened")
        notification.sendNotification("You opened $fileName")
    }

    fun saveFile(fileName: String) {
        // File save logic
        println("Saving file: $fileName")
        logger.logAction("File $fileName saved")
        notification.sendNotification("File $fileName saved successfully")
    }
}

// Main function:
fun main() {
    val logger = Logger()
    val notificationService = NotificationService()

    val fileManager = FileManager(logger, notificationService)
    val thumbnailService = ThumbnailService(logger, notificationService)
    val conversionService = ConversionService(logger, notificationService)

    val myFile = "Assignment.docx"

    // Ab har class apni zimmedari nibhayegi
    fileManager.saveFile(myFile)
    fileManager.openFile(myFile)
    conversionService.convertToPdf(myFile)
    thumbnailService.generateThumbnail(myFile)
}