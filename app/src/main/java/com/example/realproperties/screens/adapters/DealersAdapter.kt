package com.example.realproperties.screens.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.realproperties.databinding.DealerItemBinding
import com.example.realproperties.screens.models.DealerData

class DealersAdapter(
    private val list: ArrayList<DealerData>
) : RecyclerView.Adapter<DealersAdapter.DealersView>() {

    inner class DealersView(val dealerItemBinding: DealerItemBinding) :
        RecyclerView.ViewHolder(dealerItemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DealersView {
        return DealersView(
            DealerItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: DealersView, position: Int) {
        holder.dealerItemBinding.ivUser.setImageResource(list[position].image)
        holder.dealerItemBinding.tvUserName.text = list[position].user
        holder.dealerItemBinding.tvLocation.text = list[position].location
        holder.dealerItemBinding.tvContent.text = list[position].content
    }

    override fun getItemCount(): Int {
        return list.size
    }

}