package com.futurebrains.whatsappv11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.futurebrains.whatsappv11.adapters.ViewPagerAdapter
import com.futurebrains.whatsappv11.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tablayout = binding.tabLayout
        val viewpager2 = binding.viewPager

        val adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)

        viewpager2.adapter = adapter

        TabLayoutMediator(tablayout,viewpager2){tab, position ->
            when(position){
                0 -> tab.text = "CHATS"
                1 -> tab.text =  "STATUS"
                else -> tab.text = "CALLS"

            }

        }.attach()
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search_bar,menu)

        return true
    }


}