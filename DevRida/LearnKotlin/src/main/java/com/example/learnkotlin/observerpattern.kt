package com.example.learnkotlin

interface Observer {
    fun update()

}

class subscriber (val name : String) :Observer {
    override fun update() {
    println("$name recieved notification;new video uploaded! ")
}
}

class channel {
    private val subscribers = mutableListOf<Observer>()


fun subscribe(observer: Observer) {
    subscribers.add(observer)
}
      fun uploadvideo() {
          println("new video uploaded! ")

for(subscriber in subscribers){
    subscriber.update()
}
}
}


fun main(){
        val channel = channel()
val ali = subscriber("Ali")
channel.subscribe(ali)
channel.uploadvideo()
}