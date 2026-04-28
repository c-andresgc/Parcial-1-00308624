package com.example.parcial100308624.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Balance() {

    val gradient = Brush.horizontalGradient(
        colors = listOf(
            Color(0xFF7F00FF),
            Color(0xFFE100FF)
        )
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(brush = gradient, shape = RoundedCornerShape(20.dp))
            .padding(16.dp)
    ) {
        Column {
            Text("Total Balance", color = Color.White, fontSize = 14.sp)

            Spacer(modifier = Modifier.height(4.dp))

            Text("$24,580.00", color = Color.White, fontSize = 26.sp)

            Spacer(modifier = Modifier.height(12.dp))


        }
    }
}