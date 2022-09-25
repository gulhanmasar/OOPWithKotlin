package com.gulhan.kotlinoopproject

class User : People {
    //property
    var name : String? = null
    var age : Int? = null

    // constructor vs init
    constructor(nameInput:String,ageInput:Int){
     this.name = nameInput
     this.age = ageInput
        println("user created")
    }
    //initiliaze
    init {
        println("init")
    }
}