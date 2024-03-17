package com.example.realproperties.screens

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.realproperties.databinding.ActivityHomeBinding
import com.example.realproperties.screens.adapters.ViewPagerAdapter
import com.example.realproperties.screens.fragments.AdvertiseFragment
import com.example.realproperties.screens.fragments.PropertiesFragment
import com.example.realproperties.screens.fragments.RealTimeDealsFragment
import com.example.realproperties.screens.fragments.ShowCaseFragment

class Home : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        binding = ActivityHomeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setUpTabs()

        binding.ivMenu.setOnClickListener {
            startActivity(Intent(this, AccountDetails::class.java))
        }

    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(PropertiesFragment(), "PROPERTY")
        adapter.addFragment(RealTimeDealsFragment(), "REALTIME DEALS")
        adapter.addFragment(AdvertiseFragment(), "ADVERTISE")
        adapter.addFragment(ShowCaseFragment(), "SHOWCASE")
        binding.viewPager.adapter = adapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)
    }

}