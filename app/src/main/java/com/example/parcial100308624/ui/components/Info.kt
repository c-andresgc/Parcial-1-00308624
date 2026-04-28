package com.example.parcial100308624.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Info(title: String, value: String) {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .background(Color(0xFF1C1F2E), RoundedCornerShape(18.dp))
            .padding(vertical = 20.dp, horizontal = 16.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(6.dp)
            
        ) {
            Icon(Icons.Default.CheckCircle, null, tint = Color.White)
            Text(title, color = Color.Gray)
            Text(
                value,
                color = Color.White,
                fontSize = 18.sp
            )
        }
    }
}