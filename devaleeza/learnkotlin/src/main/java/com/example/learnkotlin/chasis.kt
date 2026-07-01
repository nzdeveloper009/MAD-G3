package com.example.learnkotlin

interface AppInventoryObserver {
    fun update(productName: String, available: Boolean)
}

class AppCustomerNotification(val customerName: String) : AppInventoryObserver {
    override fun update(productName: String, available: Boolean) {
        if (available) {
            println("Notification sent to $customerName: '$productName' is back in stock!")
        }
    }
}

class AppProductStockManager(val productName: String) {
    private val observers = mutableListOf<AppInventoryObserver>()
    private var inStock: Boolean = false

    fun subscribe(observer: AppInventoryObserver) = observers.add(observer)
    fun unsubscribe(observer: AppInventoryObserver) = observers.remove(observer)

    fun updateStockStatus(status: Boolean) {
        this.inStock = status
        notifyObservers()
    }

    private fun notifyObservers() {
        for (observer in observers) {
            observer.update(productName, inStock)
        }
    }
}

// ============================================================================
// 2. DECORATOR PATTERN CODE (Fresh Unique Names)
// ============================================================================

interface FreshLaptop {
    fun getCost(): Int
    fun getDescription(): String
}

class FreshBaseLaptop : FreshLaptop {
    override fun getCost() = 90000
    override fun getDescription() = "Core i7 Laptop (8GB RAM)"
}

abstract class FreshLaptopDecorator(protected val decoratedLaptop: FreshLaptop) : FreshLaptop {
    override fun getCost() = decoratedLaptop.getCost()
    override fun getDescription() = decoratedLaptop.getDescription()
}

class FreshRamUpgrade(laptop: FreshLaptop) : FreshLaptopDecorator(laptop) {
    override fun getCost() = super.getCost() + 12000
    override fun getDescription() = super.getDescription() + " + 16GB Extra RAM Upgrade"
}

// ============================================================================
// ONLY ONE MAIN FUNCTION (Bina Kisi Conflict Ke Direct Run Hoga)
// ============================================================================
fun main() {
    println("--- TESTING OBSERVER PATTERN ---")
    val stockManager = AppProductStockManager("High-Performance Laptop")
    val customer = AppCustomerNotification("Aleeza")

    stockManager.subscribe(customer)
    stockManager.updateStockStatus(true)

    println("\n--- TESTING DECORATOR PATTERN ---")
    var myLaptop: FreshLaptop = FreshBaseLaptop()
    println("${myLaptop.getDescription()} | Cost: Rs. ${myLaptop.getCost()}")

    // Applying decorator
    myLaptop = FreshRamUpgrade(myLaptop)
    println("${myLaptop.getDescription()} | Cost: Rs. ${myLaptop.getCost()}")
}