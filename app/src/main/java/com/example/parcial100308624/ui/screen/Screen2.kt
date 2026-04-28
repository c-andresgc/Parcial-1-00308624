package com.example.parcial100308624.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.parcial100308624.ui.components.Button
import com.example.parcial100308624.ui.components.Detail
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun PreviewScreen2() {
    Screen2()
}
@Composable
fun Screen2() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0D0F1C))
            .padding(16.dp)
    ) {
        Text(
            text = "Transaction",
            color = Color.White,
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.height(20.dp))

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape)
                .background(Color(0xFF00C853))
        ) {
            Icon(
                imageVector = Icons.Default.CheckCircle,
                contentDescription = null,
                tint = Color.White
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Payment Successful",
            color = Color.White
        )
        Text(
            text = "Completed on Apr 23, 2026",
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF1C1F2E), RoundedCornerShape(16.dp))
                .padding(16.dp)
        ) {
            Column {
                Text("Amount", color = Color.Gray)
                Text(
                    text = "$240.00",
                    color = Color.White,
                    fontSize = 24.sp
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text("To", color = Color.Gray)
                Text(
                    text = "Netflix Subscription",
                    color = Color.White
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Detail("Transaction ID", "#A123456789")
        Detail("Payment Method", "Visa **** 4242")
        Detail("Date", "Apr 23, 2026")
        Detail("Status", "Completed")

        Spacer(modifier = Modifier.weight(1f))

        Column {
            Button("Download Receipt", Modifier.fillMaxWidth())
            Button("Share", Modifier.fillMaxWidth())
        }
    }
}