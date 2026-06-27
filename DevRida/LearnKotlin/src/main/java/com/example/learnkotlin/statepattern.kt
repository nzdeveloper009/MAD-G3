package com.example.learnkotlin

interface Fanstate {
    fun pressbutton(){
        println("button is pressed")
    }
}


class offstate : Fanstate {
    override fun pressbutton(){
        println("Fan is off")
    }

}


class lowstate : Fanstate {
    override fun pressbutton(){
        println("Fan is running slow ")
    }

}


class highstate : Fanstate {
    override fun pressbutton(){
        println("Fan is running on high speed ")
    }

}

class Fan {
    private var state : Fanstate = offstate()

    fun setstate(newState : Fanstate){
        state = newState
    }
    fun pressbutton() {
        state.pressbutton()
    }
}

fun main(){
    val fan = Fan()
    fan.pressbutton()
    fan.setstate(lowstate())
    fan.pressbutton()
    fan.setstate(highstate())
    fan.pressbutton()
}