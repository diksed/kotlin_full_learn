package com.sedatkavak.kotlin_full_learn

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.sedatkavak.kotlin_full_learn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Toast.makeText(this@MainActivity, "Welcome", Toast.LENGTH_SHORT).show()
    }

    fun save(view: View) {
        val alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Save")
        alert.setMessage("Are you sure?")
        alert.setPositiveButton("YES") { dialog, which ->
            Toast.makeText(this@MainActivity, "Saved", Toast.LENGTH_SHORT).show()
        }
        alert.setNegativeButton("NO") { dialog, which ->
            Toast.makeText(this@MainActivity, "Not Saved", Toast.LENGTH_SHORT).show()
        }
        alert.show()
    }

}