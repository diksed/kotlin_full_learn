package com.sedatkavak.kotlin_full_learn.oop

class User {
    var name: String? = null
    var age: Int? = null

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    init {
        println("init")
    }
}