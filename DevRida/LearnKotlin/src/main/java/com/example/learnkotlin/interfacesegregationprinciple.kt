package com.example.learnkotlin

interface Switchable {
    fun turnon()
}

interface musicplayer {
    fun playmusic()
}

interface calling {
    fun makecall()
}



class Smartbulb: Switchable {
    override fun turnon(){
        println("bulb turn on")
    }
}


class Smartspeaker: Switchable , musicplayer , calling {
    override fun turnon(){
        println("speaker turn on")
    }

    override fun playmusic(){
        println("playing music")
    }

    override fun makecall(){
        println("making calls")
    }
}