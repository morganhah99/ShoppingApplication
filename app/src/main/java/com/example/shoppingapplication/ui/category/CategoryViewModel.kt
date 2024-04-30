package com.example.shoppingapplication.ui.category

import androidx.lifecycle.ViewModel
import com.example.shoppingapplication.ShoppingApplication

class CategoryViewModel: ViewModel() {



    val proteinCategory = ShoppingApplication.Singleton.foodCategories[0].category

    val carbCategory = ShoppingApplication.Singleton.foodCategories[1].category

    val vegetableCategory = ShoppingApplication.Singleton.foodCategories[2].category

    val fruitCategory = ShoppingApplication.Singleton.foodCategories[3].category





}