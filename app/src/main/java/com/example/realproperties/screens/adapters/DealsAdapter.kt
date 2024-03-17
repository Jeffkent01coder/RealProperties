package com.example.realproperties.screens.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.realproperties.databinding.DealCardItemBinding
import com.example.realproperties.screens.models.DealsData

class DealsAdapter(private val list: ArrayList<DealsData>): RecyclerView.Adapter<DealsAdapter.DealsViewHolder>() {

    inner class DealsViewHolder( val dealCardItemBinding: DealCardItemBinding): RecyclerView.ViewHolder(dealCardItemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DealsViewHolder {
        return DealsViewHolder(DealCardItemBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun onBindViewHolder(holder: DealsViewHolder, position: Int) {
        holder.dealCardItemBinding.ivPost.setImageResource(list[position].image)
        holder.dealCardItemBinding.tvLocation.text = list[position].location
        holder.dealCardItemBinding.tvTitle.text = list[position].title
        holder.dealCardItemBinding.tvContent.text = list[position].content
    }

    override fun getItemCount(): Int {
        return list.size

    }
}