package com.sedatkavak.kotlin_full_learn

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.sedatkavak.kotlin_full_learn.databinding.ActivityMainBinding
import com.sedatkavak.kotlin_full_learn.kotlin_101.second_screen.SecondScreenActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onStart() {
        super.onStart()
        binding.editText.setText("")
    }


    fun next(view: View) {
        val intent = Intent(this@MainActivity, SecondScreenActivity::class.java)
        intent.putExtra("name", binding.editText.text.toString())
        startActivity(intent)
        finish()
    }
}