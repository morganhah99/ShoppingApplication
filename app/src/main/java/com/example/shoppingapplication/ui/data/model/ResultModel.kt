package com.example.shoppingapplication.ui.data.model


import com.google.gson.annotations.SerializedName

data class ResultModel(
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("url")
    val url: String? = ""
)