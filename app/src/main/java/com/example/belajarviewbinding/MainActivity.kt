package com.example.belajarviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.belajarviewbinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*
        1. FindViewByID
        2. KotlinSintetik
        3. View Binding
         */

        // 1. Find View By ID
        var button = findViewById<Button>(R.id.btn_find_view_by_id)
        button.setOnClickListener{
            Toast.makeText(this,"Ini Adalah Toast dari Find View By ID", Toast.LENGTH_SHORT).show()
        }
        // 2. Kotlin Sintetik
        btn_kotlin_sintetik.setOnClickListener{
            Toast.makeText(this, "Ini Adalah toast dari kotlin sintetik", Toast.LENGTH_SHORT).show()
        }
        // 3. View Binding
        binding.btnViewBinding.setOnClickListener {
            Toast.makeText(this, "Ini Adalah toast dari View Binding", Toast.LENGTH_SHORT).show()
        }

        }
    }