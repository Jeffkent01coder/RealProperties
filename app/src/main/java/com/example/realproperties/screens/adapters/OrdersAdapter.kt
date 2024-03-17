package com.example.realproperties.screens.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.realproperties.databinding.OrdersItemBinding
import com.example.realproperties.screens.models.OrdersData

class OrdersAdapter(private val list: ArrayList<OrdersData>) :
    RecyclerView.Adapter<OrdersAdapter.OrdersViewHolder>() {

    inner class OrdersViewHolder(val ordersItemBinding: OrdersItemBinding) :
        RecyclerView.ViewHolder(ordersItemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrdersViewHolder {
        return OrdersViewHolder(
            OrdersItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: OrdersViewHolder, position: Int) {
        holder.ordersItemBinding.ivUser.setImageResource(list[position].image)
        holder.ordersItemBinding.tvUserName.text = list[position].user
        holder.ordersItemBinding.tvLocation.text = list[position].location
        holder.ordersItemBinding.tvContent.text = list[position].content

    }

    override fun getItemCount(): Int {
        return list.size
    }
}