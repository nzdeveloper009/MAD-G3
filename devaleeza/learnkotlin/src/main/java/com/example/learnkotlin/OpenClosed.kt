package com.learning.learnkotlin

//Software entities should be open for extension but closed for modification.
//achieve through polymorphism , change the behavior of class without
// changing its source code
// easily add new functionality
class SMSNotification : Notification {
    override fun notify(message: String) {
        // SMS bhejne ka logic yahan aayega
        println("Sending SMS Notification: $message")
    }
}

interface Notification {
    fun notify(message: String)
}

// 2. Email Notification Class
class EmailNotification : Notification {
    override fun notify(message: String) {
        // Email bhejne ka logic yahan aayega
        println("Sending Email Notification: $message")
    }
}

// 3. SMS Notification Class


// 4. WhatsApp Notification Class
class WhatsAppNotification : Notification {
    override fun notify(message: String) {
        // WhatsApp bhejne ka logic yahan aayega
        println("Sending Notification via WhatsApp: $message")
    }
}

// 5. NotificationService class
class NotificationServices {

    fun sendNotification(notification: Notification, message: String) {
        notification.notify(message)
    }
}

// 6. Main function
fun main() {
    val service = NotificationServices()

    // Email Notification Test
    val email: Notification = EmailNotification()
    service.sendNotification(email, "Hello via Email!")

    // SMS Notification Test
    val sms: Notification = SMSNotification()
    service.sendNotification(sms, "Hello via SMS!")

    // WhatsApp Notification Test
    val whatsapp: Notification = WhatsAppNotification()
    service.sendNotification(whatsapp, "Hello via WhatsApp!")
}