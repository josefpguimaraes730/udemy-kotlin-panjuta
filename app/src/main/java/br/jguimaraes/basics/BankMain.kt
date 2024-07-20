package br.jguimaraes.basics

import br.jguimaraes.basics.classes.BankAccount

fun main() {
    val deniseAccount = BankAccount("Denise", 1338.0)
    println(deniseAccount.accountHolder)
    deniseAccount.deposit(200.0)
    deniseAccount.displayTransactionHistory()
    deniseAccount.withdraw(1200.00)
    deniseAccount.deposit(3000.0)
    deniseAccount.deposit(2000.0)
    deniseAccount.withdraw(3333.15)
    deniseAccount.displayTransactionHistory()
}