package com.sedatkavak.kotlin_full_learn.stopwatch

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.sedatkavak.kotlin_full_learn.databinding.ActivityStopwatchBinding

class StopwatchActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStopwatchBinding
    var number = 0
    var runnable: Runnable = Runnable { }
    var handler : Handler = Handler(Looper.getMainLooper())
    var isEnable = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStopwatchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.stopButton.isEnabled = !isEnable
    }

    fun start(view: View) {
        binding.stopButton.isEnabled = isEnable
        binding.startButton.isEnabled = !isEnable
        number = 0
        binding.textView.text = "Time: 0"
        runnable = object : Runnable {
            override fun run() {
                number += 1
                binding.textView.text = "Time: $number"
                handler.postDelayed(this, 1000)
            }
        }
        handler.post(runnable)
    }


    fun stop(view: View) {
        binding.stopButton.isEnabled = !isEnable
        binding.startButton.isEnabled = isEnable
        number = 0
        binding.textView.text = "Time: 0"
        handler.removeCallbacks(runnable)
    }
}