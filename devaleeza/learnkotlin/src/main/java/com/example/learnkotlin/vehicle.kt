package com.example.learnkotlin

interface SystemPart {
    val price: Int
}

class SystemSeat : SystemPart {
    override val price: Int = 3000
}

class SystemTransmission : SystemPart {
    override val price: Int = 11000
}

class SystemWheel : SystemPart {
    override val price: Int = 15000
}

class SystemEngine : SystemPart {
    val transmission = SystemTransmission()
    override val price: Int
        get() = 1500000 + transmission.price
}

class SystemChasis : SystemPart {
    val seats = listOf(SystemSeat(), SystemSeat(), SystemSeat(), SystemSeat())
    override val price: Int
        get() = 200000 + seats.sumOf { it.price }
}

class SystemWheelBase : SystemPart {
    val chasis = SystemChasis()
    val wheels = listOf(SystemWheel(), SystemWheel(), SystemWheel(), SystemWheel())
    override val price: Int
        get() = chasis.price + wheels.sumOf { it.price }
}

class FinalVehicle {
    val wheelBase = SystemWheelBase()
    val engine = SystemEngine()
    val price: Int
        get() = wheelBase.price + engine.price
}

// ============================================================================
// PART 2: ABSTRACT FACTORY PATTERN CODE
// ============================================================================

interface FactoryItem {
    val price: Int
}

interface IEngineItem : FactoryItem
interface IChasisItem : FactoryItem

class NormalEngineItem : IEngineItem {
    override val price: Int = 100000
}

class LuxuryEngineItem : IEngineItem {
    override val price: Int = 500000
}

class NormalChasisItem : IChasisItem {
    override val price: Int = 50000
}

class LuxuryChasisItem : IChasisItem {
    override val price: Int = 250000
}

interface GeneralCarFactory {
    fun createEngine(): IEngineItem
    fun createChasis(): IChasisItem
}

class NormalFactoryImpl : GeneralCarFactory {
    override fun createEngine() = NormalEngineItem()
    override fun createChasis() = NormalChasisItem()
}

class LuxuryFactoryImpl : GeneralCarFactory {
    override fun createEngine() = LuxuryEngineItem()
    override fun createChasis() = LuxuryChasisItem()
}

class FinalTriumphFactory {
    fun buildCar(type: String): List<FactoryItem> {
        val factory: GeneralCarFactory = if (type.lowercase() == "luxury") {
            LuxuryFactoryImpl()
        } else {
            NormalFactoryImpl()
        }
        return listOf(factory.createEngine(), factory.createChasis())
    }
}

// ============================================================================
// PART 3: STATE PATTERN CODE (Nayi Screenshots)
// ============================================================================

interface ProjectOrderState {
    fun next(order: FinalOrderLifecycle): String
    fun prev(order: FinalOrderLifecycle): String
    fun printStatus()
}

class StateOrderPlaced : ProjectOrderState {
    override fun next(order: FinalOrderLifecycle): String {
        order.state = StateOrderDispatched()
        return "Order moved to Dispatched State."
    }
    override fun prev(order: FinalOrderLifecycle) = "Root state. No previous step."
    override fun printStatus() = println("Status: Order Placed Successfully!")
}

class StateOrderDispatched : ProjectOrderState {
    override fun next(order: FinalOrderLifecycle): String {
        order.state = StateOrderDelivered()
        return "Order moved to Delivered State."
    }
    override fun prev(order: FinalOrderLifecycle): String {
        order.state = StateOrderPlaced()
        return "Order rolled back to Placed State."
    }
    override fun printStatus() = println("Status: Order Out for Delivery (Dispatched).")
}

class StateOrderDelivered : ProjectOrderState {
    override fun next(order: FinalOrderLifecycle) = "Final state. Already delivered."
    override fun prev(order: FinalOrderLifecycle): String {
        order.state = StateOrderDispatched()
        return "Order rolled back to Dispatched State."
    }
    override fun printStatus() = println("Status: Delivered!")
}

class FinalOrderLifecycle {
    var state: ProjectOrderState = StateOrderPlaced()
    fun nextState() = println(state.next(this))
    fun prevState() = println(state.prev(this))
    fun showStatus() = state.printStatus()
}

// ============================================================================
// PART 4: STRATEGY PATTERN CODE (Nayi Screenshots)
// ============================================================================

interface ProjectPaymentStrategy {
    fun collectPaymentDetails()
    fun pay(amount: Int): Boolean
}

class StrategyBankTransfer : ProjectPaymentStrategy {
    override fun collectPaymentDetails() = println("Collecting Bank Account Details...")
    override fun pay(amount: Int): Boolean {
        println("Paid Rs. $amount using Bank Transfer.")
        return true
    }
}

class StrategyCreditCard : ProjectPaymentStrategy {
    override fun collectPaymentDetails() = println("Collecting Card Information...")
    override fun pay(amount: Int): Boolean {
        println("Paid Rs. $amount using Credit Card.")
        return true
    }
}

class ProjectOrderContext(private var paymentStrategy: ProjectPaymentStrategy) {
    fun changeStrategy(newStrategy: ProjectPaymentStrategy) {
        this.paymentStrategy = newStrategy
    }
    fun processOrder(amount: Int) {
        paymentStrategy.collectPaymentDetails()
        paymentStrategy.pay(amount)
    }
}

// ============================================================================
// SINGLE MAIN FUNCTION (Bina Kisi Conflict Ke)
// ============================================================================
fun main() {
    println("==========================================")
    println("EXECUTION: PART 1 (CAR COMPOSITION)")
    println("==========================================")
    val myCar = FinalVehicle()
    println("Total Car Price: Rs. ${myCar.price}")

    println("\n==========================================")
    println("EXECUTION: PART 2 (ABSTRACT FACTORY)")
    println("==========================================")
    val triumph = FinalTriumphFactory()
    println("--- Building Normal Car ---")
    val normalParts = triumph.buildCar("normal")
    normalParts.forEach { println("${it.javaClass.simpleName} Price: Rs. ${it.price}") }
    println("Total Normal Car Cost: Rs. ${normalParts.sumOf { it.price }}")

    println("\n==========================================")
    println("EXECUTION: PART 3 (STATE PATTERN)")
    println("==========================================")
    val trackOrder = FinalOrderLifecycle()
    trackOrder.showStatus()
    trackOrder.nextState()
    trackOrder.showStatus()

    println("\n==========================================")
    println("EXECUTION: PART 4 (STRATEGY PATTERN)")
    println("==========================================")
    val context = ProjectOrderContext(StrategyCreditCard())
    context.processOrder(4500)
    context.changeStrategy(StrategyBankTransfer())
    context.processOrder(12000)
    println("==========================================")
}