package com.gulhan.kotlinoopproject

open class Musician(name: String, age: Int, instrument: String) {
    /*  var name : String? = name
    var instrument:String? = instrument
    var age :Int? = age*/

    //encapsulation
    var name: String? = name
        private set
        get

    private var instrument: String? = instrument

    var age: Int? = age
        get
        private set

    private val bandName: String = "Metallica"
    fun returnBandName(password: String): String {
        if (password == "gulhan") {
            return bandName
        } else {
            return "wrong password !"
        }

    }
}