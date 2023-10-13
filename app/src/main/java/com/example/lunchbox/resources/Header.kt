package com.example.lunchbox.resources

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.lunchbox.Coordinator

@Composable
fun Header(text: String, inEdit: Boolean, color: Color){
    Row(
        Modifier
            .height(80.dp)
            .fillMaxWidth()
            .background(color = color)
            .padding(20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween)
    {

        Text(text = text, Modifier.clickable { Coordinator.popToHome() })
        Image(
            imageVector = Icons.Filled.Menu,
            contentDescription = "Edit Menu",
            Modifier.clickable {
                if (inEdit){
                    Coordinator.popToEdit()
                }else{
                    Log.d("RandomString", "editClicked")
                    Coordinator.goToEdit()
                }
            })

    }
}

@LunchPreview
@Composable
fun HeaderPreview(){
    Header(text = "Header", inEdit = false, Color.Blue)
}