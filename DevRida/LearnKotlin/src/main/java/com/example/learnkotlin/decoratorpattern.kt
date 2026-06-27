package com.example.learnkotlin

interface Coffee {
    fun cost(): Int
}

class SimpleCoffee : Coffee {

    override fun cost(): Int {
        return 200
    }
}

class MilkDecorator(private val coffee: Coffee) : Coffee {

    override fun cost(): Int {
        return coffee.cost() + 50
    }
}

class ChocolateDecorator(private val coffee: Coffee) : Coffee {

    override fun cost(): Int {
        return coffee.cost() + 50
    }
}

fun main() {

    var coffee: Coffee = SimpleCoffee()
    println("Simple Coffee = ${coffee.cost()}")

    coffee = MilkDecorator(coffee)
    println("Coffee + Milk = ${coffee.cost()}")

    coffee = ChocolateDecorator(coffee)
    println("Coffee + Milk + Chocolate = ${coffee.cost()}")
}