package com.sedatkavak.kotlin_full_learn

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.sedatkavak.kotlin_full_learn.databinding.ActivityMainBinding
import com.sedatkavak.kotlin_full_learn.kotlin_101.Simpson

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.plusButton.setOnClickListener(View.OnClickListener {
            buttonClicked(view, binding.plusButton)
        })
        binding.minusButton.setOnClickListener(View.OnClickListener {
            buttonClicked(view, binding.minusButton)
        })
        binding.multiplyButton.setOnClickListener(View.OnClickListener {
            buttonClicked(view, binding.multiplyButton)
        })
        binding.divideButton.setOnClickListener(View.OnClickListener {
            buttonClicked(view, binding.divideButton)
        })


    }

    fun buttonClicked(view: View, button: Button) {
        if (binding.firstNumberText.text.isNullOrEmpty() || binding.secondNumberText.text.isNullOrEmpty()) {
            binding.resultText.text = "Please enter a number"
            return
        } else {
            if (button == binding.plusButton) {
                val result = binding.firstNumberText.text.toString()
                    .toDouble() + binding.secondNumberText.text.toString().toDouble()
                binding.resultText.text = "Result: $result"
            } else if (button == binding.minusButton) {
                val result = binding.firstNumberText.text.toString()
                    .toDouble() - binding.secondNumberText.text.toString().toDouble()
                binding.resultText.text = "Result: $result"
            } else if (button == binding.multiplyButton) {
                val result = binding.firstNumberText.text.toString()
                    .toDouble() * binding.secondNumberText.text.toString().toDouble()
                binding.resultText.text = "Result: $result"
            } else if (button == binding.divideButton) {
                val result = binding.firstNumberText.text.toString()
                    .toDouble() / binding.secondNumberText.text.toString().toDouble()
                binding.resultText.text = "Result: $result"
            }
        }

    }
}