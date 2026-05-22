package com.example.mymodule

//lecture 31
// exception handeling,try catch finally
fun main()
{
    val arr:Array<Int> =arrayOf(8,9,7)
    try {
        println(arr[5])
    }
    catch(e:Exception){
        println("please check the array index")
    }
    finally {
        println("i will execute no matter what!")
    }
createuserlist(9)
   // createuserlist(-2)

}
fun createuserlist(count:Int){
    if(count<0){
        throw IllegalArgumentException("count must be greater then zero")
    }
    else{
        println("user list created containing $count users")
    }
}
