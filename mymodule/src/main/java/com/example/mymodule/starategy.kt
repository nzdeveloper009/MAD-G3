package com.example.mymodule

// Strategy Interface
interface PaymentStrategy {
    fun pay(amount: Int)
}

// Concrete Strategy 1
class CreditCardPayment : PaymentStrategy {
    override fun pay(amount: Int) {
        println("Payment of Rs.$amount made using Credit Card")
    }
}

// Concrete Strategy 2
class JazzCashPayment : PaymentStrategy {
    override fun pay(amount: Int) {
        println("Payment of Rs.$amount made using JazzCash")
    }
}

// Concrete Strategy 3
class EasyPaisaPayment : PaymentStrategy {
    override fun pay(amount: Int) {
        println("Payment of Rs.$amount made using EasyPaisa")
    }
}

// Context Class
class ShoppingCart(private var paymentStrategy: PaymentStrategy) {

    fun setPaymentStrategy(paymentStrategy: PaymentStrategy) {
        this.paymentStrategy = paymentStrategy
    }

    fun checkout(amount: Int) {
        paymentStrategy.pay(amount)
    }
}

// Main Function
fun main() {

    // ShoppingCart uses Credit Card first
    val cart = ShoppingCart(CreditCardPayment())
    cart.checkout(5000)

    println()

    // Change strategy to JazzCash
    cart.setPaymentStrategy(JazzCashPayment())
    cart.checkout(3000)

    println()

    // Change strategy to EasyPaisa
    cart.setPaymentStrategy(EasyPaisaPayment())
    cart.checkout(1500)
}