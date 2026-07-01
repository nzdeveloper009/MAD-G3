package com.example.mymodule

    // Observer Interface
    interface Observer {
        fun update(temperature: Int)
    }

    // Subject Interface
    interface Subject {
        fun addObserver(observer: Observer)
        fun removeObserver(observer: Observer)
        fun notifyObservers()
    }

    // Concrete Subject
    class WeatherStation : Subject {

        // List to store all observers
        private val observers = mutableListOf<Observer>()

        // Current temperature
        private var temperature = 0

        override fun addObserver(observer: Observer) {
            observers.add(observer)
            println("Observer Added")
        }

        override fun removeObserver(observer: Observer) {
            observers.remove(observer)
            println("Observer Removed")
        }

        override fun notifyObservers() {

            println("\nSending notification to all observers...\n")

            for (observer in observers) {
                observer.update(temperature)
            }
        }

        fun setTemperature(temp: Int) {

            temperature = temp

            println("\nWeather Station")
            println("Temperature changed to $temperature°C")

            notifyObservers()
        }
    }

    // Concrete Observer 1
    class MobileDisplay : Observer {

        override fun update(temperature: Int) {

            println("📱 Mobile Display : Temperature = $temperature°C")

        }
    }

    // Concrete Observer 2
    class LaptopDisplay : Observer {

        override fun update(temperature: Int) {

            println("💻 Laptop Display : Temperature = $temperature°C")

        }
    }

    // Concrete Observer 3
    class SmartWatch : Observer {

        override fun update(temperature: Int) {

            println("⌚ Smart Watch : Temperature = $temperature°C")

        }
    }

    fun main() {

        // Subject
        val weatherStation = WeatherStation()

        // Observers
        val mobile = MobileDisplay()

        val laptop = LaptopDisplay()

        val watch = SmartWatch()

        // Register observers
        weatherStation.addObserver(mobile)
        weatherStation.addObserver(laptop)
        weatherStation.addObserver(watch)

        // Temperature changed
        weatherStation.setTemperature(30)

        println("\n---------------------------")

        // Remove one observer
        weatherStation.removeObserver(laptop)

        // Temperature changed again
        weatherStation.setTemperature(38)

    }
