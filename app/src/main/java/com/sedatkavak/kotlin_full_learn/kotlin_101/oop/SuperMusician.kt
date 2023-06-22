package com.sedatkavak.kotlin_full_learn.kotlin_101.oop

class SuperMusician(name: String, age: Int, instrument: String) : Musician(name, age, instrument) {
    fun sing() {
        println("Nothing Else Matters")
    }
}