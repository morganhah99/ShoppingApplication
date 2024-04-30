package com.example.shoppingapplication.ui.list.proteinList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoppingapplication.ShoppingApplication

class ProteinListViewModel : ViewModel() {

    val beefValue = ShoppingApplication.Singleton.foodCategories
        .find { it.category == "Protein" }
        ?.foodItemsAndPrice?.keys?.firstOrNull { it == "Beef" }

    val porkValue = ShoppingApplication.Singleton.foodCategories
        .find { it.category == "Protein" }
        ?.foodItemsAndPrice?.keys?.firstOrNull { it == "Pork" }

    val chickenValue = ShoppingApplication.Singleton.foodCategories
        .find { it.category == "Protein" }
        ?.foodItemsAndPrice?.keys?.firstOrNull { it == "Chicken" }

    private val _foodCart = MutableLiveData<List<String>>()
    val foodCart: LiveData<List<String>> = _foodCart

    fun addToCart(food: String) {
        val cart = _foodCart.value.orEmpty().toMutableList()
        cart.add(food)
        _foodCart.postValue(cart)
        ShoppingApplication.Singleton.totalCart = cart
    }
    fun removeFromCart(food: String) {
        val cart = _foodCart.value.orEmpty().toMutableList()
        cart.remove(food)
        _foodCart.postValue(cart)
        ShoppingApplication.Singleton.totalCart = cart
    }

    fun getCartValue() = ShoppingApplication.Singleton.totalCart.toString()






}