package com.example.shoppingapplication.ui.category

import androidx.lifecycle.ViewModel
import com.example.shoppingapplication.ShoppingApplication

class CategoryViewModel: ViewModel() {



    val proteinCategory = ShoppingApplication.Singleton.foodCategories[0].name

    val carbCategory = ShoppingApplication.Singleton.foodCategories[1].name

    val vegetableCategory = ShoppingApplication.Singleton.foodCategories[2].name

    val fruitCategory = ShoppingApplication.Singleton.foodCategories[3].name





}