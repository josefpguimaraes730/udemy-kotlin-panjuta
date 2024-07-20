package br.jguimaraes.basics.classes

class Dog(
    name: String,
    val breed: String,
    var age: Int = 0
) {

    init {
        bark(name)
    }

    fun bark(name: String) {
        println("$name says Woof Woof")
    }
}

fun main() {
    val daisy = Dog("Dayse", "Poodle")
    println("Dayse is a ${daisy.breed} and is a ${daisy.age} years old")
    daisy.age = 2
}