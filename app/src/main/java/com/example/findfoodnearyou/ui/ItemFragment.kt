package com.example.findfoodnearyou.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.findfoodnearyou.R
import com.example.findfoodnearyou.databinding.FragmentHomeBinding
import com.example.findfoodnearyou.databinding.FragmentItemBinding


class ItemFragment : Fragment() {

    private lateinit var binding:FragmentItemBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentItemBinding.inflate(inflater,container,false)
        binding.backImg.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }


}