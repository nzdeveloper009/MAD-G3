package com.example.learnkotlin
interface MathStrategy {
    fun doOperation(num1: Int, num2: Int): Int
}

// 2. Concrete Strategies
class MathOperationAdd : MathStrategy {
    override fun doOperation(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}

class MathOperationSubtract : MathStrategy {
    override fun doOperation(num1: Int, num2: Int): Int {
        return num1 - num2
    }
}

class MathOperationMultiply : MathStrategy {
    override fun doOperation(num1: Int, num2: Int): Int {
        return num1 * num2
    }
}

// 3. Context Class
class MathContext(private val strategy: MathStrategy) {
    fun executeStrategy(num1: Int, num2: Int): Int {
        return strategy.doOperation(num1, num2)
    }
}

// ============================================================================
// ONLY ONE MAIN FUNCTION (Learn Kotlin Standard Entry Point)
// ============================================================================
fun main() {
    println("--- TESTING MATH STRATEGY PATTERN ---")

    // 1. Testing Addition Strategy
    val contextAdd = MathContext(MathOperationAdd())
    println("10 + 5 = ${contextAdd.executeStrategy(10, 5)}")

    // 2. Testing Subtraction Strategy
    val contextSub = MathContext(MathOperationSubtract())
    println("10 - 5 = ${contextSub.executeStrategy(10, 5)}")

    // 3. Testing Multiplication Strategy
    val contextMul = MathContext(MathOperationMultiply())
    println("10 * 5 = ${contextMul.executeStrategy(10, 5)}")

    println("==========================================")
}