package com.example.parcial100308624.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.parcial100308624.ui.components.*
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun PreviewScreen1() {
    Screen1()
}

@Composable
fun Screen1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0D0F1C))
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Overview",
                color = Color.White,
                fontSize = 22.sp
            )
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = null,
                tint = Color.White
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Balance()
        Spacer(modifier = Modifier.height(16.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            Info("Revenue", "$12K")
            Info("Users", "1.2K")
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            Info("Growth", "+18%")
            Info("Orders", "320")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Recent Activity",
            color = Color.White
        )

        Spacer(modifier = Modifier.height(8.dp))

        Transaction("Payment Received", "Today, 12:45 PM", "+$240")
        Transaction("Netflix Subscription", "Yesterday", "-$15", false)
        Transaction("Salary", "Apr 20", "+$1200")

        Spacer(modifier = Modifier.weight(1f))

        Row(modifier = Modifier.fillMaxWidth()) {
            Button("Send", Modifier.weight(1f))
            Button("Request", Modifier.weight(1f))
        }
    }
}