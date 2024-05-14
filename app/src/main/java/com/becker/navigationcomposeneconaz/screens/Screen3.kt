package com.becker.navigationcomposeneconaz.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen3(onClick: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Screen_3",
            fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                onClick()
            },
            colors = ButtonDefaults.buttonColors(Color.Green),
            elevation = ButtonDefaults.buttonElevation(5.dp)
        ) {
            Text(text = "navigate to Screen_1")
        }
    }

}