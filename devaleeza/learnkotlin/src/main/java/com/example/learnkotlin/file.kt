package com.example.learnkotlin

// ==========================================
// 1. STATE PATTERN CODE
// ==========================================
interface OrderState {
    fun next(order: OrderLifecycle): String
    fun prev(order: OrderLifecycle): String
    fun printStatus()
}

class OrderPlacedState : OrderState {
    override fun next(order: OrderLifecycle): String {
        order.state = OrderDispatchedState()
        return "Order moved to Dispatched State."
    }
    override fun prev(order: OrderLifecycle) = "Root state. No previous step."
    override fun printStatus() = println("Status: Order Placed Successfully!")
}

class OrderDispatchedState : OrderState {
    override fun next(order: OrderLifecycle): String {
        order.state = OrderDeliveredState()
        return "Order moved to Delivered State."
    }
    override fun prev(order: OrderLifecycle): String {
        order.state = OrderPlacedState()
        return "Order rolled back to Placed State."
    }
    override fun printStatus() = println("Status: Order Out for Delivery (Dispatched).")
}

class OrderDeliveredState : OrderState {
    override fun next(order: OrderLifecycle) = "Final state. Already delivered."
    override fun prev(order: OrderLifecycle): String {
        order.state = OrderDispatchedState()
        return "Order rolled back to Dispatched State."
    }
    override fun printStatus() = println("Status: Delivered!")
}

class OrderLifecycle {
    var state: OrderState = OrderPlacedState()
    fun nextState() = println(state.next(this))
    fun prevState() = println(state.prev(this))
    fun showStatus() = state.printStatus()
}

// ==========================================
// 2. STRATEGY PATTERN CODE
// ==========================================
interface PaymentStrategy {
    fun collectPaymentDetails()
    fun pay(amount: Int): Boolean
}

class BankTransferPayment : PaymentStrategy {
    override fun collectPaymentDetails() = println("Collecting Bank Account Details...")
    override fun pay(amount: Int): Boolean {
        println("Paid Rs. $amount using Bank Transfer.")
        return true
    }
}

class CreditCardPayment : PaymentStrategy {
    override fun collectPaymentDetails() = println("Collecting Card Information...")
    override fun pay(amount: Int): Boolean {
        println("Paid Rs. $amount using Credit Card.")
        return true
    }
}

class OrderContext(private var paymentStrategy: PaymentStrategy) {
    fun changeStrategy(newStrategy: PaymentStrategy) {
        this.paymentStrategy = newStrategy
    }
    fun processOrder(amount: Int) {
        paymentStrategy.collectPaymentDetails()
        paymentStrategy.pay(amount)
    }
}

// ==========================================
// ONLY ONE MAIN FUNCTION TO RUN BOTH
// ==========================================
fun main() {
    println("--- TESTING STATE PATTERN ---")
    val trackOrder = OrderLifecycle()
    trackOrder.showStatus()
    trackOrder.nextState()
    trackOrder.showStatus()

    println("\n--- TESTING STRATEGY PATTERN ---")
    val context = OrderContext(CreditCardPayment())
    context.processOrder(4500)
    context.changeStrategy(BankTransferPayment())
    context.processOrder(12000)
}