package com.example.realproperties.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.realproperties.R
import com.example.realproperties.databinding.ActivityDealBinding
import com.example.realproperties.screens.adapters.DealsAdapter
import com.example.realproperties.screens.models.DealsData

class Deal : AppCompatActivity() {
    private lateinit var binding: ActivityDealBinding
    private lateinit var adapter: DealsAdapter
    private lateinit var list: List<DealsData>

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        binding = ActivityDealBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        dealList()
        binding.gridDealsRecyclerView.layoutManager = GridLayoutManager(this, 2)
        binding.gridDealsRecyclerView.hasFixedSize()
        adapter = DealsAdapter(list as ArrayList<DealsData>)
        binding.gridDealsRecyclerView.adapter = adapter

    }

    private fun dealList() {
        list = arrayListOf(
            DealsData(R.drawable.bgd, "Property on Sale", "2 million (Negotiable)", "Naivasha"),
            DealsData(R.drawable.bg, "Property on Sale", "1 million (Negotiable)", "Nairobi"),
            DealsData(R.drawable.bgd, "Property on Sale", "25 million (Negotiable)", "Kisumu"),
            DealsData(R.drawable.bg, "Property on Sale", "4 million (Negotiable)", "nakuru"),
            DealsData(R.drawable.bgd, "Property on Sale", "2 million (Negotiable)", "KIleleshwa"),
            DealsData(R.drawable.bg, "Property on Sale", "4 million (Negotiable)", "South B"),
            DealsData(R.drawable.bgd, "Property on Sale", "3 million (Negotiable)", "Naivasha"),
            DealsData(R.drawable.bg, "Property on Sale", "2.5 million (Negotiable)", "Naivasha"),
            DealsData(R.drawable.bgd, "Property on Sale", "2 million (Negotiable)", "Naivasha"),
            DealsData(R.drawable.bg, "Property on Sale", "2 million (Negotiable)", "Naivasha"),
        )
    }


}