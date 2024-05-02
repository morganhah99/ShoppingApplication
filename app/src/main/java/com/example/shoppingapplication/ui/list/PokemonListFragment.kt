package com.example.shoppingapplication.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.shoppingapplication.databinding.FragmentPokemonListBinding


class ShoppingListFragment : Fragment() {

    lateinit var binding: FragmentPokemonListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val pokemonListViewModel =
            ViewModelProvider(this).get(PokemonListViewModel::class.java)

        binding = FragmentPokemonListBinding.inflate(inflater, container, false)
        val textView: TextView = binding.textView
        pokemonListViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return binding.root


    }


}