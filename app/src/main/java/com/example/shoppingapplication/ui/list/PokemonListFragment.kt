package com.example.shoppingapplication.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.shoppingapplication.databinding.FragmentPokemonListBinding

/**
 * A simple [Fragment] subclass.
 * Use the [ShoppingListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ShoppingListFragment : Fragment() {

    lateinit var binding: FragmentPokemonListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val shoppingListViewModel =
            ViewModelProvider(this).get(ShoppingListViewModel::class.java)

        binding = FragmentPokemonListBinding.inflate(inflater, container, false)
        val textView: TextView = binding.test
        shoppingListViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return binding.root


    }


}