package com.sedatkavak.kotlin_full_learn.oop

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sedatkavak.kotlin_full_learn.R

class OOPActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oopactivity)

        var myUser = User("Sedat", 22)
        var james = Musician("James", 50, "Guitar")

        println("Name: ${james.name} Age: ${james.age}")
        println(james.returnBandName("1234"))
        println(james.returnBandName("12345"))


        var lars = SuperMusician("Lars", 65, "Drums")
        println("Name: ${lars.name}\nAge: ${lars.age}\nInstrument: ${lars.instrument}")
        lars.sing()

        var math = Mathematics()
        println(math.sum())
        println(math.sum(5, 6))
        println(math.sum(5, 6, 7))

        val animal = Animal()
        animal.sing()
        val dog = Dog()
        dog.sing()
        dog.test()
    }
}