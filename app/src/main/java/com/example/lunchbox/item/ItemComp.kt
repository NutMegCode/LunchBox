package com.example.lunchbox.meal

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lunchbox.Coordinator
import com.example.lunchbox.resources.Header
import com.example.lunchbox.resources.LunchPreview

@Composable
fun ItemScreen(text: String){
    Column(verticalArrangement = Arrangement.Top) {
        Header(text = text, inEdit = false)

        Column(Modifier.padding(20.dp)) {

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .clickable { Coordinator.homeToMeal("Breakfast") })
            {

                Column(
                    Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally)
                {

                    Text(text = "Strawberry")

                }

            }


            Spacer(modifier = Modifier.padding(20.dp))


            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .clickable { Coordinator.homeToMeal("Lunch") })
            {

                Column(
                    Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally)
                {

                    Text(text = "Watermelon")

                }

            }


            Spacer(modifier = Modifier.padding(20.dp))


            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .clickable { Coordinator.homeToMeal("Dinner") })
            {

                Column(
                    Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally)
                {

                    Text(text = "Apple")

                }

            }

        }
    }
}

@LunchPreview
@Composable
fun ItemPreview(){
    ItemScreen("Item")
}