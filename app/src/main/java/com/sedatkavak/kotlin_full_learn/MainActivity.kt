package com.sedatkavak.kotlin_full_learn

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.sedatkavak.kotlin_full_learn.kotlin_101.Simpson

class MainActivity : AppCompatActivity() {
    lateinit var myTextView: TextView
    lateinit var myButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myTextView = findViewById(R.id.textView)
        myButton = findViewById(R.id.button)


        val homer = Simpson("Homer", 50, "Nuclear", 70)
        homer.setHeight(150)

        var myAge : Int? = null
        // !! -> Null değil
        // ? -> Null olabilir
        println(myAge?.minus(10))
        println(myAge?.minus(10) ?: 0)
    }

    fun mySum(a: Int, b: Int) {
        myTextView.text = "Result : ${a + b}"
    }
    fun myMultiply(a: Int, b: Int): Int {
        return a * b
    }
    fun buttonClicked(view: View) {
        myTextView.text = "Button Clicked"
    }
}