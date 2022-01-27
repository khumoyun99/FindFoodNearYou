package com.example.findfoodnearyou.models

data class Food(
    val name: String,
    val description: String,
    val image:Int,
    val price: String,
    val restaurant: String,
    val rating:String,
    val saved:String,
    val order:String,
    val free_ship:Boolean=false,
    val vegetarianFoods:Boolean
)
