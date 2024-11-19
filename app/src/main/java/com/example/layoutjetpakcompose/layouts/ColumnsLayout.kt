package com.example.layoutjetpakcompose.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable //@Composable le indica que el elmento sera mostrado en pantalla
fun SaludoColumn(){ // en el caso de "Saludo" que es este caso es un elemento creado por el usuario, siempre tiene que inicar en mayuscula, esto no deja de ser una funcion

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,//Centra el contenido de la Columna al centro Horizontalmente
        verticalArrangement = Arrangement.Center, // Centra el contenido de la Columna al centro verticalmente
        modifier = Modifier.padding(vertical = 36.dp, horizontal = 8.dp) //Distancia de los contenidos
            .background(color = Color.Yellow) //Color de fondo de la columna
            //.fillMaxWidth()//Ancho de la columna del tamano de la pantalla automaticamente
            //.fillMaxHeight()//Alto de la columna del tamano de la pantalla automaticamente
            .fillMaxSize()//Ancho y Alto de la columna del tamano de la pantalla automaticamente.

    ) {
        Text( //<- Este es el elemento TEXT composable
            text = "Hola",
            color = Color.Red,//Color de letras
            fontSize = 18.sp //Tamano de las letras
            //modifier = Modifier.padding(vertical = 50.dp, horizontal = 16.dp)
        )

        Text( //<- Este es el elemento TEXT composable
            text = "Hola mi nombre es Erik Nivar, Como estas?",
            //modifier = Modifier.padding(vertical = 50.dp, horizontal = 16.dp)
        )

        Text( //<- Este es el elemento TEXT composable
            text = "Adios",
            //modifier = Modifier.padding(vertical = 50.dp, horizontal = 16.dp)
        )

    }
}