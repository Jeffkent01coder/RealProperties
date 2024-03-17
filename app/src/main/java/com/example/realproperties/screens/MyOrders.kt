package com.example.realproperties.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.realproperties.R
import com.example.realproperties.databinding.ActivityMyOrdersBinding
import com.example.realproperties.screens.adapters.OrdersAdapter
import com.example.realproperties.screens.models.OrdersData

class MyOrders : AppCompatActivity() {
    private lateinit var binding: ActivityMyOrdersBinding
    private lateinit var adapter: OrdersAdapter
    private lateinit var list: List<OrdersData>


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMyOrdersBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        orderList()
        binding.ordersRecyclerView.layoutManager = LinearLayoutManager(this)
        adapter = OrdersAdapter(list as ArrayList<OrdersData>)
        binding.ordersRecyclerView.hasFixedSize()
        binding.ordersRecyclerView.adapter = adapter

    }

    private fun orderList() {
        list = arrayListOf(
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property"),
            OrdersData(R.drawable.user, "Jeff", "Nairobi", "I am buying and selling my property")
        )
    }

}
