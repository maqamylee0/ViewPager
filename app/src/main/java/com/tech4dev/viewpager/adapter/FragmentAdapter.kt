package com.tech4dev.viewpager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.tech4dev.viewpager.FragmentOne
import com.tech4dev.viewpager.FragmentTwo

class FragmentAdapter(fm: FragmentManager, lf: Lifecycle): FragmentStateAdapter(fm, lf) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FragmentOne()
            1 -> FragmentTwo()
            else -> FragmentOne()
        }
    }
}