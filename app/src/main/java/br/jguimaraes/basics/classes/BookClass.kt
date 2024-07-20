package br.jguimaraes.basics.classes

import java.util.Calendar

class Book(
    val title: String = "Unknown",
    val author: String = "Anonymous",
    val yearPublished: String = Calendar.getInstance().get(Calendar.YEAR).toString()
) {

}

fun main() {
    val myBook = Book()
    println(myBook.title)
    println(myBook.author)
    println(myBook.yearPublished)

    val customBook = Book("My Life", "Me", "1990")
    println(customBook.title)
    println(customBook.author)
    println(customBook.yearPublished)
}