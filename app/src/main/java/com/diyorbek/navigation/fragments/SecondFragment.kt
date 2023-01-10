package com.diyorbek.navigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.diyorbek.navigation.MainActivity
import com.diyorbek.navigation.R

class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val activity = (activity as MainActivity)
        val viewPager = activity.findViewById<ViewPager2>(R.id.viewPager)
        val btn: TextView = view.findViewById(R.id.skip2)
        btn.setOnClickListener {
            viewPager.currentItem = 2
        }
    }
}