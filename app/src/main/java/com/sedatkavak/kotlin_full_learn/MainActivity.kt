package com.sedatkavak.kotlin_full_learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //integer()
        doubleFloat()
    }
}

fun integer(){
    // Integer
    var x = 5
    var y = 4

    var age = 35
    val result = age / 7 * 5
    println(result)

    // Defining
    var myInteger : Int

    // Initialize
    myInteger = 10
    myInteger = 20

    val a : Int = 23
    println(a / 2)

    var myLong : Long = 100
}
fun doubleFloat(){
    // Double
    val pi = 3.14

    // Float
    val myFloat = 3.14f

    var myAge : Double
    myAge = 22.0
}