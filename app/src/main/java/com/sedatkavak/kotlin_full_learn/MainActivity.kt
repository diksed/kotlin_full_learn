package com.sedatkavak.kotlin_full_learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
    }
}