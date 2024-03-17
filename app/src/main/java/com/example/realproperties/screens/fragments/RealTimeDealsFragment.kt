package com.example.realproperties.screens.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.realproperties.R
import com.example.realproperties.databinding.FragmentRealTimeDealsBinding
import com.example.realproperties.screens.adapters.DealersAdapter
import com.example.realproperties.screens.models.DealerData


class RealTimeDealsFragment : Fragment() {
    private lateinit var _binding: FragmentRealTimeDealsBinding
    private val binding get() = _binding

    private lateinit var adapter: DealersAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var dealersArrayList: ArrayList<DealerData>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentRealTimeDealsBinding.inflate(inflater, container, false)

        return binding.root

    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dealersInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.dealerRecycler)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = DealersAdapter(dealersArrayList)
        recyclerView.adapter = adapter
        adapter.notifyDataSetChanged()
    }

    private fun dealersInitialize() {
        dealersArrayList = arrayListOf(
            DealerData(
                R.drawable.user,
                "Jeff",
                "Nairobi",
                "Android is an open source and Linux-based operating system for mobile devices"
            ),
            DealerData(
                R.drawable.bg,
                "Mark",
                "Nairobi",
                "Android was developed by the Open Handset Alliance, led by Google, and other companies."
            ),
            DealerData(
                R.drawable.user,
                "Jeff",
                "Nairobi",
                "Android is an open source and Linux-based operating system for mobile devices"
            ),
            DealerData(
                R.drawable.bgd,
                "Mark",
                "Nairobi",
                "Android was developed by the Open Handset Alliance, led by Google, and other companies."
            ),
            DealerData(
                R.drawable.user,
                "Jeff",
                "Nairobi",
                "Android is an open source and Linux-based operating system for mobile devices"
            ),
            DealerData(
                R.drawable.bg,
                "Mark",
                "Nairobi",
                "Android was developed by the Open Handset Alliance, led by Google, and other companies."
            ),
            DealerData(
                R.drawable.user,
                "Jeff",
                "Nairobi",
                "Android is an open source and Linux-based operating system for mobile devices"
            ),
            DealerData(
                R.drawable.bgd,
                "Mark",
                "Nairobi",
                "Android was developed by the Open Handset Alliance, led by Google, and other companies."
            ),
            DealerData(
                R.drawable.user,
                "Jeff",
                "Nairobi",
                "Android is an open source and Linux-based operating system for mobile devices"
            ),
            DealerData(
                R.drawable.bg,
                "Mark",
                "Nairobi",
                "Android was developed by the Open Handset Alliance, led by Google, and other companies."
            ),
            DealerData(
                R.drawable.user,
                "Jeff",
                "Nairobi",
                "Android is an open source and Linux-based operating system for mobile devices"
            ),
            DealerData(
                R.drawable.bgd,
                "Mark",
                "Nairobi",
                "Android was developed by the Open Handset Alliance, led by Google, and other companies."
            ),
            DealerData(
                R.drawable.user,
                "Jeff",
                "Nairobi",
                "Android is an open source and Linux-based operating system for mobile devices"
            ),
            DealerData(
                R.drawable.bg,
                "Mark",
                "Nairobi",
                "Android was developed by the Open Handset Alliance, led by Google, and other companies."
            )
        )

    }


}