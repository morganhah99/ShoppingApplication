package com.example.shoppingapplication.ui.data.model


import com.google.gson.annotations.SerializedName

data class PokemonModel(
    @SerializedName("results")
    val results: List<ResultModel?>? = listOf()
)