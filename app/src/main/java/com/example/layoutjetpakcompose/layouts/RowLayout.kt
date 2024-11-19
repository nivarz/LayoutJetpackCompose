package com.example.layoutjetpakcompose.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SaludoRow(){

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.padding(vertical = 36.dp)
            .fillMaxSize()
            .background(color = Color.Cyan)
    ){
        Text(text = "Hola", color = Color.Gray)
        Text(text = "Mundo", color = Color.Yellow)
        Text(text = "Row", color = Color.Black)
        Text(text = "Jetpack", color = Color.Blue)
    }
}