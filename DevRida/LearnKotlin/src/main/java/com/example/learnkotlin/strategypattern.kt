package com.example.learnkotlin

interface PaymentStrategy{
    fun pay(amount:Int)

}

class Cashpayment: PaymentStrategy{
    override fun pay(amount: Int) {
        println("paid RS.$amount using Cash")
    }
}

class Cardpayment: PaymentStrategy{
    override fun pay(amount: Int) {
        println("paid RS.$amount using Card")
    }
}

class jazzCashpayment: PaymentStrategy{
    override fun pay(amount: Int) {
        println("paid RS.$amount using jazzCash")
    }
}

class ShoppingCart {

    fun checkout (strategy: PaymentStrategy,amount:Int){
        strategy.pay(amount)
    }
}


fun main() {

    val cart = ShoppingCart()
    cart.checkout(Cashpayment(),1000)
    cart.checkout(Cardpayment(),2000)
    cart.checkout(jazzCashpayment(),3000)

}