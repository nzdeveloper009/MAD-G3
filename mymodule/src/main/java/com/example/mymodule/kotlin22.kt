package com.example.mymodule


// 3rd lec
fun main(){
    println("welcome to kotlin")
    print(1+2)
    println(false)
//fourth lec
    var score=5;
    score=3;
    val message ="hello world"
    println(message)
    println(score)

    var aim : Int =11
    var temperature : Double=89.4
    var   israining : Boolean =false
    var alphabet : Char='a'
    var name :String ="hello world"
    println(aim)
    println(temperature)
    println(israining)
    println(alphabet)
    println(name)

    ///fifth lecture

    //arithematic operator
    var i=5
    var j=2
    println(i*j)
    println(i-j)
    println(i+j)
    println(i.toFloat()/j)
    println(i%j)//1

//relational operator
    println(i>j)//true
    println(i<j)//false
    println(i>=j)//true
    println(i<=j)//false
    println(i==j)//false
    println(i!=j)//true
    // increment operator
    var b=10
    b++
    println(b)
    var c=5
    c--
    println(c)
    println(c++)
    println(c)
    println(++b)
    println(--b)
    println(b--)
    println(b)


    // sixth lecture
    //logical operators
    val above70 =true
    val knowsprogramming=false

    var callforinterveiw=above70 && knowsprogramming
    println(callforinterveiw)

    var interveiw=above70 || knowsprogramming
    println(interveiw)


/// short circuiting
    var e=2
    var f=5
    var result=  e==3 || f++ ==5
    println(e)
    println(f)

    var g=7
    var h=5
    var re= g==8 && h++==5

    println(g)
    println(h)

// not operator
    val answer=false
    val rain=!answer
    println(result)



    ///lecture #7

    ///ifelse
    val rainy= false
    if(rainy==true) {
        println("Take emberella!")
    }
    else {
        println("enjoy your day!")
    }
    //other example

    val m=6
    val n=6
    if(m<n){
        println("m is less than n")
    }
    else if(m>n)
    {
        println("m is greater than n")
    }
    else
    {
        println("m is equal to n")
    }

    //another example

    val num=21
    val o = if(num%2==0) "even" else "odd"

    println(o)


    ////lecture #8

    //range
    val d=10
    val s= d in 1..10
    println(s)

    val animal="dog"
    /* if(animal=="cat"){
         println("animal is cat")
     }
     else if(animal=="dog"){
         println("animal is dog")
     }
     else if(animal=="horse")
     {
         println("animal is horse")
     }
     else{
         println("animal not found!!")
     }
 */
    //when statement

    /* when(animal)
     {
         "horse"-> println("animal is horse")
         "cat" -> println("animal is cat")
         "dog" -> println("animal is dog")
         else-> println("animal is not found")
     }
     */

    val t =  when(animal) {
        "horse" -> "animal is horse"
        "cat" -> "animal is cat"
        "dog" -> "animal is dog"
        else -> "animal is not found"
    }
    println(t)


    // another example
    val x=16
    val v=  when(x) {
        14 -> "fourteen"
        15 -> "fifteen"
        in  13..19 -> "thirteen"
        else -> "not in range"
    }
    println(v)


    //lecture #8
    // loops
    var count=5
    while(count>=1){
        println("hello naima")
        count--
    }
    var nt=2
    var idex=1
    while(idex<=10){
        println(nt*idex)
        idex++
    }
    println("outside loop.."+idex)

    var index=1
    do{
        println("hello")
        index++
    }while(index==4)


    ///lecture #10
    // for loop

    for(i in 1..5){
        println(i)
    }
    for(i in 1..10 step 2) {
        println(i)
    }
    println("untill")
    // in until last digit not included
    for(i in 1 until 5){
        println(i)
    }

    println("down")
    for (i in 10 downTo 1){
        println(i)
    }
    val l =3
    for (i in 1..10){
        // println(l.toString() + "x" + i + "=" + (l*i))
        println("$l x $i = ${l*i}")
    }
}