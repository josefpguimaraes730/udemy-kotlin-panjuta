package br.jguimaraes.basics.classes

import java.time.temporal.TemporalAmount

class BankAccount(
    var accountHolder: String,
    var balance: Double
) {

    private val transactionHistory = mutableListOf<String>()
    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw(amount: Double) {
        balance -= amount
        transactionHistory.add("$accountHolder withdrew $$amount")
    }

    fun displayTransactionHistory() {
        for (transaction in transactionHistory) {
            println(transaction)
        }
        println("$accountHolder's balance is $balance")
    }
}