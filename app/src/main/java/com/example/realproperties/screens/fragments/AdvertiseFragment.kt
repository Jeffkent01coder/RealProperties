package com.example.realproperties.screens.fragments

import android.content.ActivityNotFoundException
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.realproperties.R
import com.example.realproperties.databinding.FragmentAdvertiseBinding


class AdvertiseFragment : Fragment() {

    private  var _binding : FragmentAdvertiseBinding?=null
    private val binding get() = _binding!!

    val REQUEST_IMAGE_CAPTURE = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAdvertiseBinding.inflate(inflater, container, false)

        val adLocation = resources.getStringArray(R.array.adLocation)
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.list_item, adLocation)
        binding.autoComplete.setAdapter(arrayAdapter)

        val dealType = resources.getStringArray(R.array.dealType)
        val arrayAdapter2  = ArrayAdapter(requireContext(), R.layout.list_item, dealType)
        binding.autoComplete2.setAdapter(arrayAdapter2)

        val priceType = resources.getStringArray(R.array.priceType)
        val arrayAdapter3 = ArrayAdapter(requireContext(), R.layout.list_item, priceType)
        binding.autoComplete3.setAdapter(arrayAdapter3)

        binding.ivCamera.setOnClickListener {
            dispatchTakePictureIntent()
        }

        return binding.root


    }

    private fun dispatchTakePictureIntent() {
        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        try {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
        } catch (e: ActivityNotFoundException) {
            // display error state to the user
            Toast.makeText(requireContext(), "Failed To capture", Toast.LENGTH_SHORT).show()
        }

    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == AppCompatActivity.RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            binding.ivHolder.setImageBitmap(imageBitmap)
        }
    }

}