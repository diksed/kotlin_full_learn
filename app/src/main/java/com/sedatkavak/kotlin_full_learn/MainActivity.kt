package com.sedatkavak.kotlin_full_learn

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.sedatkavak.kotlin_full_learn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedPref: SharedPreferences
    var userAgePref : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        sharedPref = getSharedPreferences("com.sedatkavak.kotlin_full_learn", MODE_PRIVATE)
        userAgePref = sharedPref.getInt("age",0)
        if (userAgePref != 0){
            binding.resultText.text = "Your Age : $userAgePref"
        }

    }

    fun save(view: View) {
        val myAge = binding.editText.text.toString().toIntOrNull()
        if (myAge != null) {
            binding.resultText.text = "Your Age : $myAge"
            sharedPref.edit().putInt("age", myAge).apply()
        }
    }

    fun delete(view: View) {
        userAgePref = sharedPref.getInt("age",0)
        if (userAgePref != 0){
            sharedPref.edit().remove("age").apply()
            binding.resultText.text = "Your Age : "
        }
    }

}