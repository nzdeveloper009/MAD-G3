package com.example.mymodule

// Abstract Products
interface Chair {
    fun sitOn()
}

interface Table {
    fun use()
}

// Concrete Products
class ModernChair : Chair {
    override fun sitOn() {
        println("Sitting on Modern Chair")
    }
}

class VictorianChair : Chair {
    override fun sitOn() {
        println("Sitting on Victorian Chair")
    }
}

class ModernTable : Table {
    override fun use() {
        println("Using Modern Table")
    }
}

class VictorianTable : Table {
    override fun use() {
        println("Using Victorian Table")
    }
}

// Abstract Factory
interface FurnitureFactory {
    fun createChair(): Chair
    fun createTable(): Table
}

// Concrete Factory 1
class ModernFactory : FurnitureFactory {

    override fun createChair(): Chair {
        return ModernChair()
    }

    override fun createTable(): Table {
        return ModernTable()
    }
}

// Concrete Factory 2
class VictorianFactory : FurnitureFactory {

    override fun createChair(): Chair {
        return VictorianChair()
    }

    override fun createTable(): Table {
        return VictorianTable()
    }
}

// Main Function
fun main() {

    var factory: FurnitureFactory = ModernFactory()

    var chair = factory.createChair()
    var table = factory.createTable()

    chair.sitOn()
    table.use()

    println()

    factory = VictorianFactory()

    chair = factory.createChair()
    table = factory.createTable()

    chair.sitOn()
    table.use()
}