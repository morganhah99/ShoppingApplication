package com.example.shoppingapplication.ui.list.proteinList

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.shoppingapplication.R
import com.example.shoppingapplication.databinding.FragmentProteinListBinding


/**
 * A simple [Fragment] subclass.
 * Use the [proteinListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
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

        binding.apply {
            btBeef.text = viewModel.beefValue.toString()
            btChicken.text = viewModel.chickenValue.toString()
            btPork.text = viewModel.porkValue.toString()

        }
    }


}