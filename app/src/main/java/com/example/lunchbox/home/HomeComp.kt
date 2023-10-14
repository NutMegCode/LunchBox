package com.example.lunchbox.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.lunchbox.Coordinator
import com.example.lunchbox.R
import com.example.lunchbox.resources.Header
import com.example.lunchbox.resources.LunchPreview

@Composable
fun HomeScreen() {
    Column(verticalArrangement = Arrangement.Top) {
        Header(text = "Home", inEdit = false, color = Color.Cyan)

        Column(Modifier.padding(20.dp)) {

            Row(verticalAlignment = Alignment.CenterVertically) {

                Image(
                    modifier = Modifier
                        .padding(end = 15.dp)
                        .size(50.dp),
                    painter = painterResource(R.drawable.circle_full),
                    contentDescription = ""
                )

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .clickable { Coordinator.homeToMeal("Breakfast") },
                    border = BorderStroke(2.dp, color = Color.Black),
                    colors = CardDefaults.cardColors(Color.Transparent))
                {

                    Column(
                        Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    )
                    {

                        Text(text = "Breakfast")

                    }

                }
            }

            Spacer(modifier = Modifier.padding(20.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {

                Image(modifier = Modifier
                    .padding(end = 15.dp)
                    .size(50.dp),painter = painterResource(R.drawable.circle), contentDescription = "")

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .clickable { Coordinator.homeToMeal("Lunch") },
                    border = BorderStroke(2.dp, color = Color.Black),
                    colors = CardDefaults.cardColors(Color.Transparent))
                {

                    Column(
                        Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    )
                    {

                        Text(text = "Lunch")

                    }

                }
            }


            Spacer(modifier = Modifier.padding(20.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {

                Image(
                    modifier = Modifier
                        .padding(end = 15.dp)
                        .size(50.dp),
                    painter = painterResource(R.drawable.circle_full),
                    contentDescription = ""
                )
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .clickable { Coordinator.homeToMeal("Dinner") },
                    border = BorderStroke(2.dp, color = Color.Black),
                    colors = CardDefaults.cardColors(Color.Transparent)
                )
                {

                    Column(
                        Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    )
                    {

                        Text(text = "Dinner")

                    }

                }
            }

        }
    }
}

@LunchPreview
@Composable
fun HomePreview(){
    HomeScreen()
}