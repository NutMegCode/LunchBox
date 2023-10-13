package com.example.lunchbox.item

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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.lunchbox.Coordinator
import com.example.lunchbox.resources.Header
import com.example.lunchbox.resources.LunchPreview

@Composable
fun ItemScreen(text: String){
    Column(verticalArrangement = Arrangement.Top) {

        val firstSelected = remember { mutableStateOf(true) }

        val secondSelected = remember { mutableStateOf(false) }

        val thirdSelected = remember { mutableStateOf(false) }

        val firstImage =
            if (firstSelected.value) Icons.Filled.Favorite else Icons.Filled.FavoriteBorder

        val secondImage =
            if (secondSelected.value) Icons.Filled.Favorite else Icons.Filled.FavoriteBorder

        val thirdImage =
            if (thirdSelected.value) Icons.Filled.Favorite else Icons.Filled.FavoriteBorder


        Header(text = text, inEdit = false, color = Color.Green)

        Column(Modifier.padding(20.dp)) {

            Row(verticalAlignment = Alignment.CenterVertically) {


                Image(
                    modifier = Modifier
                        .padding(end = 15.dp)
                        .size(50.dp)
                        .clickable {
                            firstSelected.value = !firstSelected.value
                            if (firstSelected.value) {
                                secondSelected.value = false
                                thirdSelected.value = false
                            }
                        },
                    imageVector = firstImage,
                    contentDescription = ""
                )

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .clickable { Coordinator.itemToEditItem("Strawberry") })
                {

                    Column(
                        Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    )
                    {

                        Text(text = "Strawberry")

                    }

                }
            }


            Spacer(modifier = Modifier.padding(20.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {

                Image(
                    modifier = Modifier
                        .padding(end = 15.dp)
                        .size(50.dp)
                        .clickable {
                            secondSelected.value = !secondSelected.value
                            if (secondSelected.value) {
                                firstSelected.value = false
                                thirdSelected.value = false
                            }
                        },
                    imageVector = secondImage,
                    contentDescription = ""
                )

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .clickable { Coordinator.itemToEditItem("Watermelon") })
                {

                    Column(
                        Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    )
                    {

                        Text(text = "Watermelon")

                    }

                }
            }


            Spacer(modifier = Modifier.padding(20.dp))


            Row(verticalAlignment = Alignment.CenterVertically) {

                Image(
                    modifier = Modifier
                        .padding(end = 15.dp)
                        .size(50.dp)
                        .clickable {
                            thirdSelected.value = !thirdSelected.value
                            if (thirdSelected.value) {
                                firstSelected.value = false
                                secondSelected.value = false
                            }
                        },
                    imageVector = thirdImage,
                    contentDescription = ""
                )

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .clickable { Coordinator.itemToEditItem("Apple") })
                {

                    Column(
                        Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    )
                    {

                        Text(text = "Apple")

                    }

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