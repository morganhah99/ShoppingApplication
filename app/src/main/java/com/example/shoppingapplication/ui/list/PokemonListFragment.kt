package com.example.shoppingapplication.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.shoppingapplication.R
import com.example.shoppingapplication.databinding.FragmentPokemonListBinding


class PokemonListFragment : Fragment() {

    lateinit var binding: FragmentPokemonListBinding
//    val pokemonListViewModel =
//        ViewModelProvider(this).get(PokemonListViewModel::class.java)
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.fragment_pokemon_list)
//
//        var pokemonList = pokemonListViewModel.pokemonList
//
//        val adapter = PokemonAdapter(pokemonList)
//
//        rv
//
//
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentPokemonListBinding.inflate(inflater, container, false)

        return binding.root


    }


}