package com.example.learnkotlin
class Order(
    val orderId: Int,
    val customerName: String,
    val items: List<String>
)


class OrderCalculator {

    fun calculateTotal(): Double {

        val total = 2500.0

        println("Calculating Total Price...")
        println("Total Price: Rs. $total")

        return total
    }
}


class OrderRepository {

    fun save(order: Order) {

        println("Saving Order...")
        println("Order ID: ${order.orderId}")
        println("Customer: ${order.customerName}")
    }
}


class EmailService {

    fun sendConfirmation(order: Order) {

        println("Sending Confirmation Email...")
        println("Email sent to ${order.customerName}")
    }
}


fun main() {

    val order = Order(
        101,
        "Ali",
        listOf("Laptop", "Mouse")
    )

    val calculator = OrderCalculator()
    calculator.calculateTotal()

    val repository = OrderRepository()
    repository.save(order)

    val emailService = EmailService()
    emailService.sendConfirmation(order)
}