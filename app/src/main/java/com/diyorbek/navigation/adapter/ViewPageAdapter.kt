package com.diyorbek.navigation.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.diyorbek.navigation.fragments.FirstFragment
import com.diyorbek.navigation.fragments.SecondFragment
import com.diyorbek.navigation.fragments.ThirdFragment

class ViewPageAdapter(manger: FragmentManager,lifecycle: Lifecycle): FragmentStateAdapter(manger,lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> ThirdFragment()
            else -> Fragment()

        }
    }
}