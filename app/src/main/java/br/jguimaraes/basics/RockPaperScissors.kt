package br.jguimaraes.basics

fun main() {
    val playerChoice = readlnOrNull()
    val computerChoice = when ((1..3).random()) {
        1 -> "Rock"
        2 -> "Paper"
        3 -> "Scissors"
        else -> ""
    }

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        else -> "Computer"
    }

    println(computerChoice)
    print(winner)
    if (winner != "Tie") println(" won!")
}