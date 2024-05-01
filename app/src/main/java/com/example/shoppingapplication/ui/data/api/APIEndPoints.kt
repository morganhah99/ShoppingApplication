package com.example.shoppingapplication.data.api

import com.example.shoppingapplication.ui.data.api.APIDetail
import com.example.shoppingapplication.ui.data.model.PokemonModel
import retrofit2.http.GET

interface APIEndPoints {


    @GET(APIDetail.POKEMON_ENDPOINT)
    suspend fun getPokemon(): PokemonModel




}