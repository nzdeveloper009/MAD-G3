package com.example.learnkotlin

interface Notificationservice {
    fun send()
}

class Email_service : Notificationservice{
    override fun send() {
        println("email sent")
    }
}

class sms_service : Notificationservice{
    override fun send() {
        println("sms sent")
    }
}

class order_service(private  val notificationservice: Notificationservice){
    fun placeorder() {
        println("order placed")
        notificationservice.send()
    }
}





fun main (){
    val email = Email_service()
    val order = order_service(email)
    order.placeorder()
    val sms = sms_service()


}