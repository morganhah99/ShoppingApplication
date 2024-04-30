package com.example.shoppingapplication

import android.app.Application

class ShoppingApplication : Application() {

    object Singleton {
        data class FoodCategory(val name: String, val foodItems: Map<String, Int>)

        val foodCategories = listOf(
            FoodCategory("Protein", mapOf("Beef" to 1, "Chicken" to 2, "Pork" to 3)),
            FoodCategory("Carb", mapOf("Rice" to 1, "Bread" to 2, "Pasta" to 3)),
            FoodCategory("Vegetable", mapOf("Broccoli" to 1, "Carrots" to 2, "Spinach" to 3)),
            FoodCategory("Fruit", mapOf("Apple" to 1, "Oranges" to 2, "Watermelon" to 3))
        )
        fun addToCart(foodItem: String) {
            foodCart.add(foodItem)

        }
        lateinit var foodCart: MutableList<String>
    }


}
