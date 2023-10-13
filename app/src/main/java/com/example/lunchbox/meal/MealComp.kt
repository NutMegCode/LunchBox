package com.example.lunchbox.meal

import androidx.compose.runtime.Composable
import com.example.lunchbox.resources.Header
import com.example.lunchbox.resources.LunchPreview

@Composable
fun MealScreen(text: String){
    Header(text = text, inEdit = false)
}

@LunchPreview
@Composable
fun MealPreview(){
    MealScreen("Meal")
}