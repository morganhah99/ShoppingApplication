package com.example.shoppingapplication.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shoppingapplication.data.api.RetrofitInstance
import kotlinx.coroutines.launch

class ShoppingListViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is a Pokemon Fragment"
    }
    val text: LiveData<String> = _text

    init {
        getPokemon()
    }

    private fun getPokemon() {
        viewModelScope.launch {
            val result = RetrofitInstance.apiClient.getPokemon()
            if (!result.results.isNullOrEmpty()) {
                val pokemonNames = result.results.map { it?.name }
                _text.postValue(pokemonNames.joinToString())
            }
        }
    }
}