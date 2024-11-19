package com.example.layoutjetpakcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.layoutjetpakcompose.layouts.SaludoColumn
import com.example.layoutjetpakcompose.layouts.SaludoRow

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SaludoRow()
        }
    }
}


