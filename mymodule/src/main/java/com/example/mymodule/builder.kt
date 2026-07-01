package com.example.mymodule

class Laptop private constructor(
    val brand: String,
    val ram: String,
    val storage: String,
    val processor: String,
    val graphicsCard: Boolean
) {

    class Builder {

        private var brand = ""
        private var ram = ""
        private var storage = ""
        private var processor = ""
        private var graphicsCard = false

        fun setBrand(brand: String): Builder {
            this.brand = brand
            return this
        }

        fun setRam(ram: String): Builder {
            this.ram = ram
            return this
        }

        fun setStorage(storage: String): Builder {
            this.storage = storage
            return this
        }

        fun setProcessor(processor: String): Builder {
            this.processor = processor
            return this
        }

        fun setGraphicsCard(graphicsCard: Boolean): Builder {
            this.graphicsCard = graphicsCard
            return this
        }

        fun build(): Laptop {
            return Laptop(
                brand,
                ram,
                storage,
                processor,
                graphicsCard
            )
        }
    }
}

fun main() {

    val laptop = Laptop.Builder()
        .setBrand("Dell")
        .setRam("16GB")
        .setStorage("512GB SSD")
        .setProcessor("Core i7")
        .setGraphicsCard(true)
        .build()

    println("Laptop Details")
    println("--------------")
    println("Brand: ${laptop.brand}")
    println("RAM: ${laptop.ram}")
    println("Storage: ${laptop.storage}")
    println("Processor: ${laptop.processor}")
    println("Graphics Card: ${laptop.graphicsCard}")
}