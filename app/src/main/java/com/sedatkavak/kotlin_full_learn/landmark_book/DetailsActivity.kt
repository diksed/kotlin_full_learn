package com.sedatkavak.kotlin_full_learn.landmark_book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sedatkavak.kotlin_full_learn.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark
        binding.landmarkNameText.text = selectedLandmark.name
        binding.countryNameText.text = selectedLandmark.country
        binding.landmarkImage.setImageResource(selectedLandmark.image)

    }
}