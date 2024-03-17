package com.example.realproperties.screens.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.realproperties.databinding.PostItemBinding
import com.example.realproperties.screens.models.PostData

class PostAdapter(private val list: ArrayList<PostData>) :
    RecyclerView.Adapter<PostAdapter.PostView>() {

    inner class PostView(val postItemBinding: PostItemBinding) :
        RecyclerView.ViewHolder(postItemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostView {
        return PostView(PostItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: PostView, position: Int) {
        holder.postItemBinding.ivPost.setImageResource(list[position].image)
        holder.postItemBinding.tvTitle.text = list[position].title
        holder.postItemBinding.tvContent.text = list[position].content
        holder.postItemBinding.tvLocation.text = list[position].location
    }

    override fun getItemCount(): Int {
        return list.size
    }
}