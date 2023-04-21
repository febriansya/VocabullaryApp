package com.example.vocabullaryapp.feature_vocabulary.presentation.on_boarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vocabullaryapp.R
import com.example.vocabullaryapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}