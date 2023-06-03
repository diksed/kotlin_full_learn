package com.sedatkavak.kotlin_full_learn.catch_the_kenny

import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.sedatkavak.kotlin_full_learn.databinding.ActivityCatchTheKennyBinding

class CatchTheKennyActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCatchTheKennyBinding
    var score = 0
    var imageArray = ArrayList<ImageView>()
    var runnable = Runnable { }
    var handler = Handler(Looper.getMainLooper())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCatchTheKennyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        imageArray.add(binding.imageView)
        imageArray.add(binding.imageView2)
        imageArray.add(binding.imageView3)
        imageArray.add(binding.imageView4)
        imageArray.add(binding.imageView5)
        imageArray.add(binding.imageView6)
        imageArray.add(binding.imageView7)
        imageArray.add(binding.imageView8)
        imageArray.add(binding.imageView9)
        hideImages()

        object : CountDownTimer(15500, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                binding.timeText.text = "Time : ${millisUntilFinished / 1000}"
            }

            override fun onFinish() {
                binding.timeText.text = "Time : 0"
                handler.removeCallbacks(runnable)
                imageInvisible()

                val alert = AlertDialog.Builder(this@CatchTheKennyActivity)
                alert.setTitle("Game Over")
                alert.setMessage("Restart The Game?")
                alert.setPositiveButton("Yes") { dialog, which ->
                    val intent = intent
                    finish()
                    startActivity(intent)
                }
                alert.setNegativeButton("No") { dialog, which ->
                    finish()
                }
                alert.show()
            }
        }.start()
    }

    fun hideImages() {
        runnable = object : Runnable {
            override fun run() {
                imageInvisible()
                val random = java.util.Random()
                val randomIndex = random.nextInt(9)
                imageArray[randomIndex].visibility = View.VISIBLE
                handler.postDelayed(runnable, 500)
            }
        }
        imageInvisible()
        handler.post(runnable)
    }

    fun increaseScore(view: View) {
        score += 1
        binding.scoreText.text = "Score : $score"
    }

    fun imageInvisible() {
        for (image in imageArray) {
            image.visibility = View.INVISIBLE
        }
    }
}