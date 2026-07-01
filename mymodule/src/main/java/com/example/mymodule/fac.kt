package com.example.mymodule

// Component
interface Text {
    fun show()
}

// Concrete Component
class SimpleText : Text {

    override fun show() {
        println("Hello World")
    }
}

// Abstract Decorator
abstract class TextDecorator(protected val text: Text) : Text {

    override fun show() {
        text.show()
    }
}

// Concrete Decorator 1
class BoldDecorator(text: Text) : TextDecorator(text) {

    override fun show() {
        print("Bold -> ")
        text.show()
    }
}

// Concrete Decorator 2
class ItalicDecorator(text: Text) : TextDecorator(text) {

    override fun show() {
        print("Italic -> ")
        text.show()
    }
}

// Main Function
fun main() {

    var text: Text = SimpleText()

    println("Original")
    text.show()

    println()

    text = BoldDecorator(text)

    println("After Bold")
    text.show()

    println()

    text = ItalicDecorator(text)

    println("After Bold + Italic")
    text.show()
}