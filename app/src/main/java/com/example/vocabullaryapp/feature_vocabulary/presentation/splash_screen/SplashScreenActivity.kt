package com.example.vocabullaryapp.feature_vocabulary.presentation.splash_screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vocabullaryapp.R
import com.example.vocabullaryapp.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.viewPager

    }
}