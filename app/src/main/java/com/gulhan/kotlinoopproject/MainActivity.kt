package com.gulhan.kotlinoopproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myUser = User("James",50)
        myUser.name ="sercan"
        myUser.age = 55
       // myUser.age = 25
       // myUser.name = "Gulhan"

        println(myUser.age.toString())
        println(myUser.name)
        println(myUser.information())

       //encapsulation

        var james = Musician("james",60,"Guitar")
        //james.age = 55
        println(james.age.toString())
        println( james.returnBandName("gulhan"))
        println(james.returnBandName("miray"))

           //inheritance

        var lars = SuperMusicians("Lars" , 60, "Drums")
        println(lars.name)
        println(lars.returnBandName("gulhan"))
        lars.sing()

        //polymorphism
        //static polymorphism
        var mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(3,4))
        println(mathematics.sum(3,4,5))

        //dynamic polymorphism
        val animal = Animal()
        animal.sing()

        val barley = Dog()
        barley.test()
        barley.sing()  // it can call override sing()

        //abstract & interface

     //  var myPeople = People() -> you don't create an object at abstract class!

        var myPiano = Piano()
        myPiano.brand ="Yamaha"
        myPiano.digital= false
       println( myPiano.roomName)
        myPiano.info()

     //Lambda Expression
        fun printString(myString:String){
            println(myString)
        }

        printString("my test string")
        val testString={ myString :String -> println(myString) }
        testString("my lambda string")


        val multiplyLambda={a:Int , b:Int -> a * b}
        println(multiplyLambda(4,5))

        val multiplyLambda2 : (Int,Int)->Int={a , b -> a * b}
        println(multiplyLambda2(5,5))

        //asynchrnous
        //callback function,listener function,completion function
        fun downloadMusicians(url:String,completion:(Musician)->Unit){
            //url-> download
            //data
            val kirkHammet=Musician("Kirk",60,"Guitar")
            completion(kirkHammet)

        }
        downloadMusicians("metallica.com",{musician->
            println(musician.name)
        })
    }
}