package com.futurebrains.whatsappv11.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.futurebrains.whatsappv11.fragment.ChatFragment
import com.futurebrains.whatsappv11.fragment.StatusFragment
import com.futurebrains.whatsappv11.fragment.CallsFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return  3
    }

    override fun createFragment(position: Int): Fragment {
        return  when(position){
            0 -> ChatFragment()
            1 -> StatusFragment()
            else -> CallsFragment()
        }
    }
}