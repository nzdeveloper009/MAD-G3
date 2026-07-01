package com.example.mymodule

// Component
interface Coffee {
    fun getDescription(): String
    fun cost(): Int
}

// Concrete Component
class SimpleCoffee : Coffee {

    override fun getDescription(): String {
        return "Simple Coffee"
    }

    override fun cost(): Int {
        return 200
    }
}

// Abstract Decorator
abstract class CoffeeDecorator(protected val coffee: Coffee) : Coffee {

    override fun getDescription(): String {
        return coffee.getDescription()
    }

    override fun cost(): Int {
        return coffee.cost()
    }
}

// Concrete Decorator 1
class MilkDecorator(coffee: Coffee) : CoffeeDecorator(coffee) {

    override fun getDescription(): String {
        return coffee.getDescription() + " + Milk"
    }

    override fun cost(): Int {
        return coffee.cost() + 50
    }
}

// Concrete Decorator 2
class SugarDecorator(coffee: Coffee) : CoffeeDecorator(coffee) {

    override fun getDescription(): String {
        return coffee.getDescription() + " + Sugar"
    }

    override fun cost(): Int {
        return coffee.cost() + 20
    }
}

// Main Function
fun main() {

    var coffee: Coffee = SimpleCoffee()

    println("Original Coffee")
    println("Description: ${coffee.getDescription()}")
    println("Price: ${coffee.cost()}")

    coffee = MilkDecorator(coffee)

    println("\nAfter Adding Milk")
    println("Description: ${coffee.getDescription()}")
    println("Price: ${coffee.cost()}")

    coffee = SugarDecorator(coffee)

    println("\nAfter Adding Sugar")
    println("Description: ${coffee.getDescription()}")
    println("Price: ${coffee.cost()}")
}