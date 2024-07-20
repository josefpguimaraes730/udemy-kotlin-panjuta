package br.jguimaraes.basics

fun main() {
    val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")
    println(shoppingList)
    val mutableShoppingList = mutableListOf("Processor", "RAM", "Graphics Card RTX 3060", "SSD")
    println(mutableShoppingList)
    mutableShoppingList.add("Cooling System")
    mutableShoppingList.remove("Graphics Card RTX 3060")
    mutableShoppingList.add("Graphics Card RTX 4090")
    println(mutableShoppingList)
    mutableShoppingList.removeAt(3)
    mutableShoppingList.add(3, "Nitrogen Cooling System")
    println(mutableShoppingList[3])
    mutableShoppingList[4] = "Graphics Card RX 7800XT"
    println(mutableShoppingList)
    mutableShoppingList.set(3, "Water Cooling System")
    println(mutableShoppingList)
    println(mutableShoppingList.contains("RAM"))

    for (item in mutableShoppingList) {
        println(item)
    }

    for (item in 0 until mutableShoppingList.size) {
        println("$item is ${mutableShoppingList[item]}")
    }

    for (item in 0..(mutableShoppingList.size - 1)) {
        println("$item is ${mutableShoppingList[item]}")
    }

    for (item in 0..<mutableShoppingList.size) {
        println("$item is ${mutableShoppingList[item]}")
    }
}
