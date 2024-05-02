package com.example.shoppingapplication.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shoppingapplication.data.api.RetrofitInstance
import com.example.shoppingapplication.ui.data.model.Pokemon
import kotlinx.coroutines.launch

class PokemonListViewModel : ViewModel() {
    var pokemonList: List<Pokemon> = emptyList()
        private set

    init {
        getPokemon()
    }

    private fun getPokemon() {
        viewModelScope.launch {
            val result = RetrofitInstance.apiClient.getPokemon()
            if (!result.results.isNullOrEmpty()) {
                 pokemonList = result.results.map { Pokemon(it?.name) }
            }
        }
    }
}