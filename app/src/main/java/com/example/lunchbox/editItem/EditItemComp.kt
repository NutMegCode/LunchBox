package com.example.lunchbox.editItem

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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.lunchbox.R
import com.example.lunchbox.resources.Header
import com.example.lunchbox.resources.LunchPreview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditItemScreen() {
    Column(verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {

        val textState = remember { mutableStateOf("Strawberry") }

        val firstSelected = remember { mutableStateOf(false) }

        val secondSelected = remember { mutableStateOf(true) }

        Header(text = "EditItem", inEdit = false, color = Color.Cyan)

        Column(Modifier.padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally) {

            Image(
                modifier = Modifier
                    .padding(end = 15.dp)
                    .size(200.dp),
                painter = painterResource(id = R.drawable.strawberry),
                contentDescription = ""
            )

            Spacer(modifier = Modifier.padding(20.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {

                OutlinedTextField(modifier = Modifier.fillMaxWidth(), value = "Strawberry", onValueChange = {newText -> textState.value = newText})
            }

            Spacer(modifier = Modifier.padding(20.dp))

            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.clickable { firstSelected.value = !firstSelected.value },
            ) {

                val firstImage = if (firstSelected.value) painterResource(R.drawable.circle) else painterResource(R.drawable.circle_full)

                Image(modifier = Modifier
                    .padding(end = 15.dp)
                    .size(50.dp),painter = firstImage, contentDescription = "")

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
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

            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.clickable { secondSelected.value = !secondSelected.value },) {


                val secondImage = if (secondSelected.value) painterResource(R.drawable.circle) else painterResource(R.drawable.circle_full)

                Image(
                    modifier = Modifier
                        .padding(end = 15.dp)
                        .size(50.dp),
                    painter = secondImage,
                    contentDescription = ""
                )
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
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
fun EditItemPreview(){
    EditItemScreen()
}