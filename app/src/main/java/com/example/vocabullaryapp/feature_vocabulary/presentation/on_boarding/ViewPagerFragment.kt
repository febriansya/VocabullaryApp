package com.example.vocabullaryapp.feature_vocabulary.presentation.on_boarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.vocabullaryapp.R
import com.example.vocabullaryapp.databinding.FragmentViewPagerBinding
import com.example.vocabullaryapp.feature_vocabulary.presentation.on_boarding.screens.ObSecondFragment
import com.example.vocabullaryapp.feature_vocabulary.presentation.on_boarding.screens.ObThreadFragment


class ViewPagerFragment : Fragment() {


    private lateinit var bindng: FragmentViewPagerBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
//
//        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        bindng = FragmentViewPagerBinding.inflate(inflater, container, false)

        val fragmentList = arrayListOf<Fragment>(
            ObSecondFragment(),
            ObThreadFragment(),
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        bindng.viewPager.adapter = adapter

        return bindng.root

    }
}



