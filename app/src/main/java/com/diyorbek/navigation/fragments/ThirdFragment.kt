package com.diyorbek.navigation.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.diyorbek.navigation.MainActivity
import com.diyorbek.navigation.R
import com.diyorbek.navigation.SecondActivity

class ThirdFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn: TextView = view.findViewById(R.id.nextAc)
        val activity = (activity as MainActivity)
        btn.setOnClickListener {
            val intent = Intent(activity,SecondActivity::class.java)
            activity.startActivity(intent)
            activity.finish()
        }

    }
}