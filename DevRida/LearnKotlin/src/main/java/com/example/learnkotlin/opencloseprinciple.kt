interface Payment {
    fun pay()
}

class CashPayment : Payment {

    override fun pay() {
        println("Cash Payment Successful")
    }
}

class CardPayment : Payment {

    override fun pay() {
        println("Card Payment Successful")
    }
}

class JazzCashPayment : Payment {

    override fun pay() {
        println("JazzCash Payment Successful")
    }
}

class EasyPaisaPayment : Payment {

    override fun pay() {
        println("EasyPaisa Payment Successful")
    }
}

class PaymentProcessor {

    fun processPayment(payment: Payment) {
        println("Processing Payment...")
        payment.pay()
    }
}

fun main() {

    val processor = PaymentProcessor()
    processor.processPayment(CashPayment())
    processor.processPayment(CardPayment())
    processor.processPayment(JazzCashPayment())
    processor.processPayment(EasyPaisaPayment())

}