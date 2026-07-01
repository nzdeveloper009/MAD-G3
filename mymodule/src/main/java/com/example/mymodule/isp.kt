package com.example.mymodule

interface PaymentProcessor {
    fun processPayment(amount: Double)
    fun refundPayment(amount: Double)
}

interface Discount {
    fun applyDiscount(discount: Double)
}

// Credit Card -> Payment + Refund
class CreditCard : PaymentProcessor {

    override fun processPayment(amount: Double) {
        println("Credit Card Payment: $amount")
    }

    override fun refundPayment(amount: Double) {
        println("Credit Card Refund: $amount")
    }
}

// Bank Transfer -> Payment + Refund
class BankTransfer : PaymentProcessor {

    override fun processPayment(amount: Double) {
        println("Bank Transfer Payment: $amount")
    }

    override fun refundPayment(amount: Double) {
        println("Bank Transfer Refund: $amount")
    }
}

// PayPal -> Payment + Refund + Discount
class Paypal : PaymentProcessor, Discount {

    override fun processPayment(amount: Double) {
        println("PayPal Payment: $amount")
    }

    override fun refundPayment(amount: Double) {
        println("PayPal Refund: $amount")
    }

    override fun applyDiscount(discount: Double) {
        println("Discount Applied: $discount%")
    }
}

fun main() {

    val card = CreditCard()
    card.processPayment(1000.0)
    card.refundPayment(200.0)

    val bank = BankTransfer()
    bank.processPayment(2000.0)
    bank.refundPayment(500.0)

    val paypal = Paypal()
    paypal.processPayment(1500.0)
    paypal.refundPayment(300.0)
    paypal.applyDiscount(10.0)
}