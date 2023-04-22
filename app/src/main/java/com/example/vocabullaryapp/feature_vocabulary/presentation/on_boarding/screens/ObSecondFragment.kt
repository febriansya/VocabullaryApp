package com.example.vocabullaryapp.feature_vocabulary.presentation.on_boarding.screens

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat.animate
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.vocabullaryapp.R
import com.example.vocabullaryapp.databinding.FragmentObSecondBinding

class ObSecondFragment : Fragment() {

    private lateinit var binding: FragmentObSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentObSecondBinding.inflate(inflater, container, false)
//        return inflater.inflate(R.layout.fragment_ob_second, container, false)

        binding.imageView2.setOnClickListener {

//        set preferences for skiped on boarding
//            try add effect
            animate(requireView()).alpha(0f).start()
            findNavController().navigate(R.id.action_viewPagerFragment_to_homeActivity)
            onBoardingFinished()
        }

        return binding.root
    }

    private fun onBoardingFinished() {
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished", true)
        editor.apply()
    }


}




