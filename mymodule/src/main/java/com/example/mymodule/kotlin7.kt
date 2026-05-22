package com.example.mymodule
//lecture#23 and 24
fun main()
{
   var burger=Burger("chicken")
    burger.typee()
    burger.display()
    var shawar=Shawarama("chicken")
    shawar.typee()
    shawar.display()
    dragobjects(arrayOf(Burger("causal"),Shawarama("loaded"),Pizza("tikka"),Player("baller")))
    // lecture 24 type of object checking and small casting
    if (burger is Burger){
        println("this is burger!")
    }
    var player=Player("badminten")
 var arr:Array<Draggable> =arrayOf(player,burger)
    for (obj:Draggable in arr){
        if(obj is Player){
            println(obj.display())
        }
        else{
            (obj as Burger).typee()
        }
    }
}
/*fun dragobjects(objects:Array<Ffood>){
    for (obj:Ffood in objects)
        obj.display()

}*/
fun dragobjects(objects:Array<Draggable>){
    for (obj:Draggable in objects)
        obj.display()

}
interface Draggable{//same as abstract by default abstract
    fun display()
}
abstract class Ffood:Draggable{
    abstract fun typee()

}
class Burger(var type:String):Ffood(){
    override fun typee(){
        println("this is spicy  burger")
    }
    override fun display()
    {
        println("$type burger displaying")
    }
}
class Shawarama(var type:String):Ffood(){
    override fun typee(){
        println("this is spicy shawarama")
    }
    override fun display()
    {
        println("$type shawarama displaying")
    }
}
class Pizza(var type:String):Ffood(){
    override fun typee(){
        println("this is spicy pizza")
    }
    override fun display()
    {
        println("$type pizza displaying")
    }
}
// interface is abstract classs and use in ANY class for common behaviour
class Player(var type:String):Draggable {
    fun typee() {
        println("--------")
        println("Hello")
    }

   override fun display() {
        println("$type  displaying")
    }
}
//