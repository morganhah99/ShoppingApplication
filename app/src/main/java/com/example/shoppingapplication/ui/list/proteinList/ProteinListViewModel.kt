package com.example.shoppingapplication.ui.list.proteinList

import androidx.lifecycle.ViewModel
import com.example.shoppingapplication.ShoppingApplication

class ProteinListViewModel : ViewModel() {

    val beefValue = ShoppingApplication.Singleton.foodCategories
        .find { it.name == "Protein" }
        ?.foodItems?.keys?.firstOrNull { it == "Beef" }

    val porkValue = ShoppingApplication.Singleton.foodCategories
        .find { it.name == "Protein" } // Find the "Protein" category
        ?.foodItems?.keys?.firstOrNull { it == "Pork" }

    val chickenValue = ShoppingApplication.Singleton.foodCategories
        .find { it.name == "Protein" } // Find the "Protein" category
        ?.foodItems?.keys?.firstOrNull { it == "Chicken" }





}