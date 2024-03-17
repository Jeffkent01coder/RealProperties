package com.example.realproperties.screens.fragments

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.*
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.realproperties.R
import com.example.realproperties.databinding.FragmentPropertiesBinding
import com.example.realproperties.screens.Deal
import com.example.realproperties.screens.MyOrders
import com.example.realproperties.screens.adapters.PostAdapter
import com.example.realproperties.screens.models.PostData


class PropertiesFragment : Fragment() {

    private var _binding: FragmentPropertiesBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: PostAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var postArrayList: ArrayList<PostData>

    private val rotateOpenAnimation: Animation by lazy {
        AnimationUtils.loadAnimation(
            requireContext(),
            R.anim.rotate_open_animation
        )
    }
    private val rotateCloseAnimation: Animation by lazy {
        AnimationUtils.loadAnimation(
            requireContext(),
            R.anim.rotate_close_animation
        )
    }
    private val fromBottomAnimation: Animation by lazy {
        AnimationUtils.loadAnimation(
            requireContext(),
            R.anim.from_bottom_animation
        )
    }
    private val toBottomAnimation: Animation by lazy {
        AnimationUtils.loadAnimation(
            requireContext(),
            R.anim.to_bottom_animation
        )
    }

    private var addButtonClicked = false


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentPropertiesBinding.inflate(inflater, container, false)

        return binding.root
    }


    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        postInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.postRecyclerview)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = PostAdapter(postArrayList)
        recyclerView.adapter = adapter
        adapter.notifyDataSetChanged()

        binding.floatingActionBarOrders.setOnClickListener {
            val intent = Intent(requireActivity(), MyOrders::class.java)
            startActivity(intent)
        }
        binding.floatingActionBarWork.setOnClickListener {
            val intent = Intent(requireActivity(), Deal::class.java)
            startActivity(intent)
        }

        binding.floatingActionBarAdd.setOnClickListener {
            onAddButtonClicked()
        }

    }

    private fun postInitialize() {
        postArrayList = arrayListOf(
            PostData(R.drawable.bgd, "Property on Sale", "2 million (Negotiable)", "Naivasha"),
            PostData(R.drawable.bg, "Property on Sale", "1 million (Negotiable)", "Nairobi"),
            PostData(R.drawable.bgd, "Property on Sale", "25 million (Negotiable)", "Kisumu"),
            PostData(R.drawable.bg, "Property on Sale", "4 million (Negotiable)", "nakuru"),
            PostData(R.drawable.bgd, "Property on Sale", "2 million (Negotiable)", "KIleleshwa"),
            PostData(R.drawable.bg, "Property on Sale", "4 million (Negotiable)", "South B"),
            PostData(R.drawable.bgd, "Property on Sale", "3 million (Negotiable)", "Naivasha"),
            PostData(R.drawable.bg, "Property on Sale", "2.5 million (Negotiable)", "Naivasha"),
            PostData(R.drawable.bgd, "Property on Sale", "2 million (Negotiable)", "Naivasha"),
            PostData(R.drawable.bg, "Property on Sale", "2 million (Negotiable)", "Naivasha"),
            PostData(R.drawable.bgd, "Property on Sale", "2 million (Negotiable)", "Naivasha"),
        )
    }

    private fun onAddButtonClicked() {
        setVisibility(addButtonClicked)
        setAnimation(addButtonClicked)
        buttonSetClickable()

        addButtonClicked = !addButtonClicked

    }

    //Setting call and message buttons visible
    private fun setVisibility(buttonClicked: Boolean) {
        if (!buttonClicked) {
            binding.floatingActionBarWork.visibility = VISIBLE
            binding.floatingActionBarOrders.visibility = VISIBLE
        } else {
            binding.floatingActionBarWork.visibility = INVISIBLE
            binding.floatingActionBarOrders.visibility = INVISIBLE
        }
    }

    //Setting the animation on the buttons
    private fun setAnimation(buttonClicked: Boolean) {
        if (!buttonClicked) {
            binding.floatingActionBarWork.startAnimation(fromBottomAnimation)
            binding.floatingActionBarOrders.startAnimation(fromBottomAnimation)
            binding.floatingActionBarAdd.startAnimation(rotateOpenAnimation)
        } else {
            binding.floatingActionBarWork.startAnimation(toBottomAnimation)
            binding.floatingActionBarOrders.startAnimation(toBottomAnimation)
            binding.floatingActionBarAdd.startAnimation(rotateCloseAnimation)
        }
    }

    //Checking if the add button is clicked
    private fun buttonSetClickable() {
        if (!addButtonClicked) {
            binding.floatingActionBarWork.isClickable = true
            binding.floatingActionBarOrders.isClickable = true
        } else {
            binding.floatingActionBarWork.isClickable = false
            binding.floatingActionBarOrders.isClickable = false
        }
    }

}