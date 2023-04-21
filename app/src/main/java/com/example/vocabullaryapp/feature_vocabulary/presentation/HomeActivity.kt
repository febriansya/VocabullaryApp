package com.example.vocabullaryapp.feature_vocabulary.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.vocabullaryapp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}