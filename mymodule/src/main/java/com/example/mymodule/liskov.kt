package com.example.mymodule
/*open class BankAccount {

    open fun withdraw(amount: Double) {
        println("Withdraw: Rs. $amount")
    }
}

class SavingsAccount : BankAccount() {

    override fun withdraw(amount: Double) {
        println("Savings Account Withdraw: Rs. $amount")
    }
}

class FixedDepositAccount : BankAccount() {

    override fun withdraw(amount: Double) {
        throw UnsupportedOperationException("Withdraw not allowed")
    }
}

fun main() {

    val savings: BankAccount = SavingsAccount()
    savings.withdraw(500.0)

    val fixed: BankAccount = FixedDepositAccount()
    fixed.withdraw(500.0)
}*/open class BankAccount {

    fun showBalance() {
        println("Showing Balance")
    }
}

interface Withdrawable {
    fun withdraw(amount: Double)
}

class SavingsAccount : BankAccount(), Withdrawable {

    override fun withdraw(amount: Double) {
        println("Savings Account Withdraw: Rs. $amount")
    }
}

class FixedDepositAccount : BankAccount()

fun main() {

    val savings = SavingsAccount()
    savings.showBalance()
    savings.withdraw(500.0)

    val fixed = FixedDepositAccount()
    fixed.showBalance()
}