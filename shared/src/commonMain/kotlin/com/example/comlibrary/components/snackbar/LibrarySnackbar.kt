package com.example.comlibrary.components.snackbar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LibrarySnackbar(
    message: String,
    type: SnackbarType
) {

    val color = when(type){

        SnackbarType.Success -> Color(0xFF4CAF50)

        SnackbarType.Error -> Color(0xFFF44336)

        SnackbarType.Warning -> Color(0xFFFF9800)

        SnackbarType.Info -> Color(0xFF2196F3)
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color,
                RoundedCornerShape(10.dp)
            )
            .padding(16.dp)
    ){

        Text(
            text = message,
            color = Color.White,
            style = MaterialTheme.typography.bodyMedium
        )
    }

}