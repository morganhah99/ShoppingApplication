package com.example.shoppingapplication.data.api

import com.example.shoppingapplication.ui.data.api.APIDetail
import com.example.shoppingapplication.ui.data.model.DogFactModel
import com.example.shoppingapplication.ui.data.model.PokemonModel
import com.example.shoppingapplication.ui.data.model.ResultModel
import retrofit2.http.GET

interface ApiEndpoints {

    @GET(APIDetail.DOG_FACT_ENDPOINT)
    suspend fun getDogFacts(): DogFactModel

    @GET(APIDetail.POKEMON_ENDPOINT)
    suspend fun getPokemon(): PokemonModel




}