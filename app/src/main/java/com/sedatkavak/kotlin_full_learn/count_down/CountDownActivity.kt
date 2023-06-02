package com.sedatkavak.kotlin_full_learn.count_down

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.sedatkavak.kotlin_full_learn.databinding.ActivityCountDownBinding

class CountDownActivity : AppCompatActivity() {
    private var isEnable : Boolean = true
    private lateinit var binding: ActivityCountDownBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCountDownBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun countDownStart(view: View) {
        binding.starButton.isEnabled = !isEnable
        object : CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                binding.textView.text = "Kalan Süre : ${millisUntilFinished / 1000}"
            }

            override fun onFinish() {
                binding.textView.text = "Süre Bitti"
                binding.starButton.isEnabled = isEnable
            }
        }.start()
    }
}