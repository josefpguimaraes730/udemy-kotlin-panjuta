package br.jguimaraes.basics

data class CoffeeDetails(
    val sugar: Int,
    val name: String,
    val size: String,
    val cream: Int
)

fun makeCoffee(sugar: Int, name: String) {
    val text = when {
        sugar <= 0 -> "no"
        else -> "$sugar spoon" + (if (sugar > 1) "s" else "") + " of"
    }

    println("Coffee with $text sugar for $name")
}

fun makeCoffee(coffeeDetails: CoffeeDetails) {
    val sugarText = when {
        coffeeDetails.sugar <= 0 -> "no"
        else -> "${coffeeDetails.sugar} spoon" + (if (coffeeDetails.sugar > 1) "s" else "") + " of"
    }

    val creamText = when {
        coffeeDetails.cream <= 0 -> "no"
        else -> "${coffeeDetails.cream} amount of"
    }

    println("Coffee ${coffeeDetails.size} with $sugarText sugar and $creamText cream for ${coffeeDetails.name}")
}

fun main() {
    makeCoffee(-1, "Joseph")
    makeCoffee(0, "Candice")
    makeCoffee(1, "Jimmy")
    makeCoffee(2, "Denis")

    val coffeeForDenis = CoffeeDetails(2, "Denis", "XXL", 0)
    makeCoffee(coffeeForDenis)
    val coffeeForCandice = CoffeeDetails(0, "Candice", "M", 2)
    makeCoffee(coffeeForCandice)
}