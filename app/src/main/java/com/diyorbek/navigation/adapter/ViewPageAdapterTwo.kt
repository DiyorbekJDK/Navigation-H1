package com.diyorbek.navigation.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.diyorbek.navigation.fragments.*

class ViewPageAdapterTwo(manger: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(manger, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FourthFragment()
            1 -> FifthFragment()
            2 -> SixFragment()
            else -> Fragment()

        }
    }
}