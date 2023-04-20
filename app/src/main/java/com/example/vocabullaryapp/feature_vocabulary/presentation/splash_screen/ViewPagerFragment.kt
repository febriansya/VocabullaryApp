package com.example.vocabullaryapp.feature_vocabulary.presentation.splash_screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.vocabullaryapp.R
import com.example.vocabullaryapp.feature_vocabulary.presentation.splash_screen.screens.ObSecondFragment


class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val viewpager = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            ObSecondFragment(),
        )

        return viewpager

    }
}



