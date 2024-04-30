package com.example.shoppingapplication.ui.list.proteinList

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.shoppingapplication.R
import com.example.shoppingapplication.ShoppingApplication
import com.example.shoppingapplication.databinding.FragmentProteinListBinding


class ProteinListFragment : Fragment() {


    lateinit var binding: FragmentProteinListBinding
    lateinit var viewModel: ProteinListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProteinListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[ProteinListViewModel::class.java]

        viewModel.foodCart.observe(viewLifecycleOwner) { currentCart ->
            // will always trigger when there's a new value for COUNTER in ViewModel
            binding.proteinCart.text = currentCart.toString()
        }

        binding.apply {
            btnAddBeef.text = viewModel.beefValue.toString()
            btnAddChicken.text = viewModel.chickenValue.toString()
            btnAddPork.text = viewModel.porkValue.toString()

            btnAddBeef.setOnClickListener {
                viewModel.addToCart("Beef")
            }
            btnAddChicken.setOnClickListener {
                viewModel.addToCart("Chicken")
            }
            btnAddPork.setOnClickListener {
                viewModel.addToCart("Pork")
            }

            btnRemoveBeef.setOnClickListener {
                viewModel.removeFromCart("Beef")
            }
            btnRemoveChicken.setOnClickListener {
                viewModel.removeFromCart("Chicken")
            }
            btnRemovePork.setOnClickListener {
                viewModel.removeFromCart("Pork")
            }


        }
    }


}