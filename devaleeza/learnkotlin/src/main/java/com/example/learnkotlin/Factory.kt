package com.learning.learnkotlin

// ==========================================
// 1. ABSTRACT PRODUCTS & CONCRETE PRODUCTS
// ==========================================
interface DocElement {
    fun render(): String
}

class HtmlParagraph(private val text: String) : DocElement {
    override fun render() = "<p>$text</p>"
}

class MarkdownParagraph(private val text: String) : DocElement {
    override fun render() = "$text\n"
}

class HtmlHeading(private val text: String) : DocElement {
    override fun render() = "<h1>$text</h1>"
}

class MarkdownHeading(private val text: String) : DocElement {
    override fun render() = "# $text\n"
}

// ==========================================
// 2. ABSTRACT FACTORY & CONCRETE FACTORIES
// ==========================================
interface DocElementFactory {
    fun createParagraph(text: String): DocElement
    fun createHeading(text: String): DocElement
}

class HtmlElementFactory : DocElementFactory {
    override fun createParagraph(text: String) = HtmlParagraph(text)
    override fun createHeading(text: String) = HtmlHeading(text)
}

class MarkdownElementFactory : DocElementFactory {
    override fun createParagraph(text: String) = MarkdownParagraph(text)
    override fun createHeading(text: String) = MarkdownHeading(text)
}

// ==========================================
// 3. CLIENT CODE
// ==========================================
class DocDocument(private val factory: DocElementFactory) {
    private val elements = mutableListOf<DocElement>()

    fun addParagraph(text: String) {
        elements.add(factory.createParagraph(text))
    }

    fun addHeading(text: String) {
        elements.add(factory.createHeading(text))
    }

    fun render(): String = elements.joinToString(separator = "") { it.render() }
}

// ==========================================
// 4. MAIN ENTRY POINT (RUNNABLE)
// ==========================================
fun main() {
    println("=== Html Factory Output ===")
    val htmlDocument = DocDocument(HtmlElementFactory())
    htmlDocument.addHeading("Introduction")
    htmlDocument.addParagraph("This is an HTML paragraph.")
    println(htmlDocument.render())

    println("=== Markdown Factory Output ===")
    val markdownDocument = DocDocument(MarkdownElementFactory())
    markdownDocument.addHeading("Introduction")
    markdownDocument.addParagraph("This is a Markdown paragraph.")
    println(markdownDocument.render())
}