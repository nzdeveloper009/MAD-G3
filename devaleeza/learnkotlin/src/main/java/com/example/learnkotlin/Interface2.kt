package com.example.learnkotlin// ============================================================================
// ASSIGNMENT 1: CAR COMPOSITION MODEL
// ============================================================================

interface ComponentPart {
    val price: Int
}

class ModelSeat : ComponentPart {
    override val price: Int = 3000
}

class ModelTransmission : ComponentPart {
    override val price: Int = 11000
}

class ModelWheel : ComponentPart {
    override val price: Int = 15000
}

class ModelEngine : ComponentPart {
    val transmission = ModelTransmission()
    override val price: Int
        get() = 1500000 + transmission.price
}

class ModelChasis : ComponentPart {
    val seats = listOf(ModelSeat(), ModelSeat(), ModelSeat(), ModelSeat())
    override val price: Int
        get() = 200000 + seats.sumOf { it.price }
}

class ModelWheelBase : ComponentPart {
    val chasis = ModelChasis()
    val wheels = listOf(ModelWheel(), ModelWheel(), ModelWheel(), ModelWheel())
    override val price: Int
        get() = chasis.price + wheels.sumOf { it.price }
}

class StandaloneVehicle {
    val wheelBase = ModelWheelBase()
    val engine = ModelEngine()
    val price: Int
        get() = wheelBase.price + engine.price
}

fun runAssignment1() {
    println("==========================================")
    println("EXECUTION: PART 1 (CAR COMPOSITION)")
    println("==========================================")
    val myCar = StandaloneVehicle()
    println("Total Car Price: Rs. ${myCar.price}")
}

// ============================================================================
// ASSIGNMENT 2: ABSTRACT FACTORY PATTERN MODEL
// ============================================================================

interface FactoryProduct {
    val price: Int
}

interface AbstractEngineProduct : FactoryProduct
interface AbstractChasisProduct : FactoryProduct

class CustomNormalEngine : AbstractEngineProduct {
    override val price: Int = 100000
}

class CustomLuxuryEngine : AbstractEngineProduct {
    override val price: Int = 500000
}

class CustomNormalChasis : AbstractChasisProduct {
    override val price: Int = 50000
}

class CustomLuxuryChasis : AbstractChasisProduct {
    override val price: Int = 250000
}

interface CustomCarFactory {
    fun createEngine(): AbstractEngineProduct
    fun createChasis(): AbstractChasisProduct
}

class CustomNormalCarFactory : CustomCarFactory {
    override fun createEngine() = CustomNormalEngine()
    override fun createChasis() = CustomNormalChasis()
}

class CustomLuxuryCarFactory : CustomCarFactory {
    override fun createEngine() = CustomLuxuryEngine()
    override fun createChasis() = CustomLuxuryChasis()
}

class CustomTriumphFactory {
    fun buildCar(type: String): List<FactoryProduct> {
        val factory: CustomCarFactory = if (type.lowercase() == "luxury") {
            CustomLuxuryCarFactory()
        } else {
            CustomNormalCarFactory()
        }
        return listOf(factory.createEngine(), factory.createChasis())
    }
}

fun runAssignment2() {
    println("\n==========================================")
    println("EXECUTION: PART 2 (ABSTRACT FACTORY)")
    println("==========================================")
    val triumph = CustomTriumphFactory()

    println("--- Building Normal Car ---")
    val normalParts = triumph.buildCar("normal")
    normalParts.forEach { println("${it.javaClass.simpleName} Price: Rs. ${it.price}") }
    println("Total Normal Car Cost: Rs. ${normalParts.sumOf { it.price }}")

    println("\n--- Building Luxury Car ---")
    val luxuryParts = triumph.buildCar("luxury")
    luxuryParts.forEach { println("${it.javaClass.simpleName} Price: Rs. ${it.price}") }
    println("Total Luxury Car Cost: Rs. ${luxuryParts.sumOf { it.price }}")
    println("==========================================")
}

// ============================================================================
// MAIN FUNCTION (KOTLIN STANDARD ENTRY POINT)
// ============================================================================
fun main(args: Array<String>) {
    // Dono alag-alag parts ko yahan se execute kiya ja raha hai
    runAssignment1()
    runAssignment2()
}