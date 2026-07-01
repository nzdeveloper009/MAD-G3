package com.example.mymodule
/*violate the principle
class NotificationService {

    fun sendNotification(type: String, message: String) {

        if (type == "Email") {
            println("Sending Email: $message")
        } else if (type == "SMS") {
            println("Sending SMS: $message")
        } else {
            println("Invalid Notification Type")
        }
    }
}

fun main() {

    val notification = NotificationService()

    notification.sendNotification("Email", "Hello User")
    notification.sendNotification("SMS", "Welcome!")
}*/
// Interface
interface Notification {
    fun send(message: String)
}

// Email Notification
class EmailNotification : Notification {
    override fun send(message: String) {
        println("Sending Email: $message")
    }
}

// SMS Notification
class SmsNotification : Notification {
    override fun send(message: String) {
        println("Sending SMS: $message")
    }
}
class whatsappNotification : Notification {
    override fun send(message: String) {
        println("Sending SMS: $message")
    }
}

// Notification Service
class NotificationService(private val notification: Notification) {

    fun sendNotification(message: String) {
        notification.send(message)
    }
}

// Main Function
fun main() {

    val emailService = NotificationService(EmailNotification())
    emailService.sendNotification("Hello User")

    val smsService = NotificationService(SmsNotification())
    smsService.sendNotification("Welcome!")
    val whatsapp = NotificationService(whatsappNotification())
    smsService.sendNotification("new message!")
}