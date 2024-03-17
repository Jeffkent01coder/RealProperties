package com.example.realproperties.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.realproperties.databinding.ActivityMakeOrderBinding

class MakeOrder : AppCompatActivity() {
    private lateinit var binding: ActivityMakeOrderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        binding = ActivityMakeOrderBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}