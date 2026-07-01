package com.example.mymodule

// State Interface
interface FanState {
    fun pressButton(fan: Fan)
}

// OFF State
class OffState : FanState {

    override fun pressButton(fan: Fan) {
        println("Fan is ON")
        fan.setState(OnState())
    }
}

// ON State
class OnState : FanState {

    override fun pressButton(fan: Fan) {
        println("Fan is OFF")
        fan.setState(OffState())
    }
}

// Context
class Fan {

    private var state: FanState = OffState()

    fun setState(state: FanState) {
        this.state = state
    }

    fun pressButton() {
        state.pressButton(this)
    }
}

// Main Function
fun main() {

    val fan = Fan()

    fan.pressButton()
    fan.pressButton()
    fan.pressButton()
    fan.pressButton()
}