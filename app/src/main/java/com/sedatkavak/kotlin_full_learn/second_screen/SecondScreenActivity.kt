package com.sedatkavak.kotlin_full_learn.second_screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sedatkavak.kotlin_full_learn.databinding.ActivitySecondScreenBinding

class SecondScreenActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intentFromMain = intent
        binding.nameText.text = intentFromMain.getStringExtra("name")
    }
}