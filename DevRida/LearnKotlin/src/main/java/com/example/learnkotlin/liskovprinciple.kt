package com.example.learnkotlin

open class Notification {
    open fun send(){
        println("Notification sent")
    }
}

class Emailnotifictaion : Notificationservice{
    override fun send(){
        println("Email sent")
    }

}

class SMSnotification : Notificationservice{
    override fun send(){
        println("sms sent")
    }
}


fun sendnotification (notification: Notification){
    notification.send()
}

fun main(){
    sendnotification(Notification())
    sendnotification(Notification())
}