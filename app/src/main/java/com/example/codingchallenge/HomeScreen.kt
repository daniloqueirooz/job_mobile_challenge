package com.example.codingchallenge

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeScreen : Fragment(R.layout.home_screen) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.text_view).setOnClickListener {

            findNavController().navigate(R.id.action_homeScreen_to_movieList)
        }

    }
}