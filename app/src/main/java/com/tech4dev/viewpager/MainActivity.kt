package com.tech4dev.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.tech4dev.viewpager.adapter.FragmentAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var toolbar: Toolbar
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar= findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Tab Layout"
        tabLayout = findViewById(R.id.tab)
        viewPager = findViewById(R.id.viewPager)
        viewPager.adapter = FragmentAdapter(supportFragmentManager, lifecycle)

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "One"
                1 -> tab.text = "Two"
            }
        }.attach()

        viewPager.currentItem = 0
    }
}