package com.sedatkavak.kotlin_full_learn.kotlin_101.oop

open class Musician(name: String, age: Int, instrument: String) {
    var name: String? = name
        private set
        get

    var instrument: String? = instrument

    var age: Int? = age
        get
        private set
    private val bandName : String = "Metallica"
    fun returnBandName(password: String) : String {
        if (password == "1234"){
            return bandName
        }
        else {
            return "Wrong password"
        }
    }

}