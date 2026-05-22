package com.example.mymodule

// lecture 27
//
fun main()
{
   mycl.f()
    mycl.anotherobj.f()
    var pizza1 : Pizzy = Pizzy.Factory.create("Peppy Paneer")
    println(pizza1)
    var pizza2 : Pizzy = Pizzy.create("Peppy Paneer")
    println(pizza2)

}
class mycl {// only one companion of any class
    companion object myobj {
      //  @JvmStatic access in java code
        fun f(){
            println("object in class")
        }
    }
    object anotherobj {
        fun f(){
            println(" 2nd object in class")
        }
    }
}
class Pizzy(val type : String, val toppings: String){
   companion object Factory{ // this is my factory object
        fun create(pizzaType: String) : Pizzy{
            return when(pizzaType){
                "Tomato" -> Pizzy(type = "Tomato", toppings = "Tomato, Cheese")
                "Peppy Paneer" -> Pizzy(type = "Paneer Farm", toppings = "Paneer, Cheese Burst, Tomato, Onion")
                else -> Pizzy(type = "Basic", toppings = "Onion, Cheese")
            }
        }
    }

    override fun toString(): String {
        return "Pizzy(type='$type', toppings='$toppings')"
    }
}



