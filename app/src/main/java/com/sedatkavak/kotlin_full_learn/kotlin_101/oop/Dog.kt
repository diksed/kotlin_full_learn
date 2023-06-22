package com.sedatkavak.kotlin_full_learn.kotlin_101.oop

class Dog : Animal() {
    override fun sing() {
        println("Dog class sing function")
    }

    fun test() {
        super.sing()
    }
}